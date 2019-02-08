/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

/**
 *
 * @author qbowers
 */
public class Big {
    String content;
    final int length;

    private String processString(String s) {
        
        for (int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (c < 48 && c > 57) throw new RuntimeException("Stop abusing your Big Number priveleges. Wholesome numbers please");
            if (c != '0') return s.substring(i);
        }
        //got to the end of the thing and nothing was not 0
        return "0";
    }

    Big(long d) {
        if (d < 0) throw new RuntimeException("Stop abusing your Big Number priveleges. Wholesome numbers please");
        content = Long.toString(d);
        length = (content.equals("0")) ? 0:content.length();
    }
    Big(String d) {
        d = processString(d);
        content = d;
        length = (content.equals("0")) ? 0:content.length();
    }
    
    Big(String d, int exp) { //scientific notation- ish. exp is number of zeros added to end
        d = processString(d);
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        for(int i = 0; i<exp; i++) sb.append(0);
        content = sb.toString();
        length = (content.equals("0")) ? 0:content.length();
    }
    Big(long d, int exp) {
        if (d < 0) throw new RuntimeException("Stop abusing your Big Number priveleges. Wholesome numbers please");
        StringBuilder sb = new StringBuilder();
        sb.append(d);
        for(int i = 0; i<exp; i++) sb.append(0);
        content = sb.toString();
        length = (content.equals("0")) ? 0:content.length();
    }
    
    
    
    Big add(Big a) {
        int i = 0,
            carry = 0,
            alength = a.length;
        
        StringBuilder out = new StringBuilder();
        
        
        while(i < alength || i < length) {
            int digitA = digitAtPlace(i),
                digitB = a.digitAtPlace(i),
                
                sum = digitA + digitB + carry,
                digitC = sum % 10;
            
            carry = sum / 10;
            out.insert(0, digitC);
            i++;
        }
        
        if (carry != 0) out.insert(0,carry); //if the result is bigger than the original two numbers
        
        return new Big(out.toString());
    };
    Big subtract(Big a) {
        if (a.length > length) return new Big(0); //would be negative
        
        int i = 0,
            carry = 0;
        
        StringBuilder out = new StringBuilder();
        
        while(i < length) {
            int digitA = digitAtPlace(i),
                digitB = a.digitAtPlace(i),
                
                sum = digitA - digitB + carry,
                digitC = sum % 10;
            if (digitC < 0) digitC += 10;
            
            carry = (sum < 0) ? -1 : 0;
            out.insert(0, digitC);
            i++;
        }
        
        if (carry != 0) return new Big("0");
        return new Big(out.toString());
    }
    
    
    
    public Big multiply(Big a) {
        StringBuilder out = new StringBuilder();
        Big zero = new Big(0);
        Big carry = new Big(0);
        
        
        for(int i = 0; i < a.length; i++) {
            int digit = a.digitAtPlace(i);
            
            Big product = multiply(digit).add(carry);
            
            out.insert(0, product.digitAtPlace(0)); //add last digit of product to front of out -- digit will never be changed by further multiplication
            
            carry = new Big(product.equals(zero) ? "0":product.content.substring(0, product.length-1));
        }
        
        
        if (!carry.equals(new Big(0))) out.insert(0,carry);
        return new Big(out.toString());
    }
    public Big multiply(int a) { //only to be used with numbers less than 10
        StringBuilder out = new StringBuilder();
        int carry = 0;
        Big zero = new Big(0);
        
        if(!greaterThan(zero) || a==0) return zero;
        
        for (int i = 0; i < length; i++) {
            int x = digitAtPlace(i),
                sum = (x*a) + carry,
                digit = sum % 10;
            
            carry = sum / 10;
            
            out.insert(0, digit);
        }
        if (carry != 0) out.insert(0,carry);
        return new Big(out.toString());
    }
    
    public Big divide(Big a) {
        //approach number 3
        Big zero = new Big(0);
        
        //catch weird cases
        if(equals(a)) return new Big(1);
        if(a.greaterThan(this)) return zero;
        if(a.equals(zero)) return zero;
        
        StringBuilder out = new StringBuilder();
        Big remainder = new Big(content.substring(0, a.length-1)).multiply(new Big(10)); //-1 to account for first addition
        
        //a is in [1 and this)
        
        //for the range of numbers at position i of length a.length
        for (int i = a.length-1; i < length; i++) {
            Big range = remainder.add(new Big(digitFromFront(i)));
            
            //find quotient
            int quotient = 1;
            while (!a.multiply(quotient).greaterThan(range)) quotient++;
            
            //append to out
            out.append(--quotient);
            
            //remainder = range - quotient*a
                                                            //because we are now shiftig over, remainder with respect to range should be 10x
            remainder = range.subtract(a.multiply(quotient)).multiply(new Big(10));
        }
            

        
        
        
        return new Big(out.toString());
        
        
        
        
        /*     THE COP-OUT: ALSO BAD
        Big one = new Big(1);
        Big quotient = one;
        
        while(!a.multiply(quotient).greaterThan(this)) quotient = quotient.add(one);
        
        return quotient.subtract(one);
        */
        
        
        /*     THE RECURSIVE WAY: BAD
        if (a.greaterThan(this)) return new Big(0);
        
        StringBuilder out = new StringBuilder();
        
        divide(a, out); //forward to recursive function
        
        return new Big(out.toString());
        */
    }
    /*private void divide(Big a, StringBuilder out) { //this is for the bad and recursive one and probably should not exist
        if (length < a.length) return; //gotten to the end of the string, remaining chunk is smaller than divisor
        
        Big subBig = new Big(content.substring(0,a.length)); // as long as the divisor
            
        int digit = digitFromFront(0);
            
        int quotient = 1;
        Big product = new Big(0);
        while (quotient < 10) {
            Big testProduct = a.multiply(quotient);
            if ( testProduct.greaterThan(subBig) ) break;
            product = testProduct;
            quotient++;
        }
        quotient--; //overflowed on current quotient, must have been previous OR quotient is 10 an really should be 9
        if(quotient == 0) return;
        
        
        out.append(quotient); //add correct digit to output string
        
        
        Big remainder = subBig.subtract(product);
        
        for(int i = 0; i < a.length-remainder.length-3; i++) out.append("0");
        
        Big fullRemainder = new Big(remainder.content + content.substring(a.length-1, length-1));
        
        fullRemainder.divide(a,out); //recurse
    }*/
    
    
    public Big squareRoot() {
        int iterations = length*2 + 1;
        Big R = new Big(1).multiply((int)Math.pow(10,length/2));
        //Big R = this.divide(new Big(10));
        if (R.equals(new Big(0))) R = new Big(1);
        
        for (int i = 0; i<iterations; i++) {
            R = R.add(this.divide(R)).divide(new Big(2));
            System.out.println(R.length);
        }
        
        return R;
    }
    
    
    
    
    boolean equals(Big a) { return content.equals(a.content); }
    @Override
    public String toString() {
        return content;
    }
    private int digitAtPlace(int i) {
        return (i >= length) ? 0 : content.charAt(length-1-i)-48;
    }
    private int digitFromFront(int i) {
        return (i >= length) ? 0 : content.charAt(i)-48;
    }
    
    public boolean greaterThan(Big a) {
        
        if (length == a.length) {
            for(int i = 0; i<length; i++) {
                int digit1 = digitFromFront(i);
                int digit2 = a.digitFromFront(i);
                if (digit1 == digit2) continue;
                return digit1 > digit2;
            }
            return false; //exactly equal
        }
        
        return length > a.length;
    }
}
