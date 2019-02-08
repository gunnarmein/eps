/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimaltest;

/**
 *
 * @author gmein
 */
public class Decimal {
    String number;
    int sign = 1;
    
    Decimal(int d) {
        this.number = String.valueOf(d);
    }
    
    Decimal ( String n) {
        this.number = n;
    }
    Decimal(int sign, String n){
        this.sign = sign;
        this.number = n;
    }
    
    
    StringBuilder addHelper(Decimal shorter, Decimal longer){
        // this is the real addition function
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int sum = 0;
        for(int i = 0; i < longer.number.length(); i++){
            int x = Character.getNumericValue(longer.number.charAt(longer.number.length()-1-i));
            if(shorter.number.length()-1-i <0){
                sum = carry +x;
            } else {
                int y = Character.getNumericValue(shorter.number.charAt(shorter.number.length()-1-i));
                sum = carry + x + y;
            }
            carry = 0;
            while (sum>9){
                sum = sum -10;
                carry++;
            }
            result.append(String.valueOf(sum));
            sum = 0;
        }
        if(carry!=0){
            result.append(carry);
        }
        return result;
    }
    
   

    Decimal add(Decimal b) {
        /// This function is just formating by converting between types, reversing and calling the correct function.
        StringBuilder result = new StringBuilder();
        int aLength= this.number.length();
        int bLength = b.number.length();
        if(aLength> bLength){
            result = addHelper(b,this);
        } else{
            result = addHelper(this,b);
        }
   
        result = result.reverse();
        String output = result.toString();
        return new Decimal(output);
    }
    
    //Potential Future Work. Fix formating of edge case where subtracting two numbers that are exactly the same
    Decimal subtract(Decimal b) {
        StringBuilder result = new StringBuilder();
        //don't need two cases due to restrictions that there will be no negative numbers so 1st num is longest
        int carryInverse = 0;
        int total=0;
        if(this.number.length()<b.number.length()){
            String numberTemp = b.subtract(this).number; // acounting for the 10-9 exception
            return new Decimal(-1,numberTemp);
        }
        for(int i = 0; i<this.number.length(); i++){
            int x = Character.getNumericValue(this.number.charAt(this.number.length()-1-i));
            if(b.number.length()-1-i <0){
                total = x-carryInverse;
            } else {
                int y = Character.getNumericValue(b.number.charAt(b.number.length()-1-i));
                total = x-carryInverse-y;
            }
            carryInverse = 0;
            while (total<0){
                total = total + 10;
                carryInverse++;
            }
            result.append(String.valueOf(total));
            total =0;
        }
        result = result.reverse();
        String output = result.toString();
        if(carryInverse>0){
            Decimal answer = b.subtract(this);
            answer.sign=-1;
            return answer;
        }else{
            return new Decimal(output);
        }
    }
    
    
    // yes this code is inefficent. However it is also simple and does its task so there's that
    Decimal multiply(Decimal b){
        Decimal result = new Decimal(0);
        Decimal counter = new Decimal(0);
        while(counter.number.compareTo(b.number)!=0){
            result = result.add(this); // repeated addition
           counter = counter.add(new Decimal(1));
        }
        return result;
    }
    
    // dumb guess and check divison. Works not efficent
    // added signs to do subtraction to check when divison is done. could probably use multiplication instead
    // only returns floor not remainder.
    Decimal divide(Decimal b){
        if(b.number.compareTo("0") ==0){
            return null; // broke math dividing by zero
        }
        Decimal result = new Decimal(0);
        Decimal counter = new Decimal(0);
        while(!counter.subtract(this).equals("0")){
             result = counter.multiply(b);
             if(this.subtract(result).sign <0){
                break;
             }
            counter = counter.add(new Decimal(1));
        }
        return counter.subtract(new Decimal(1));
    }
    
    // used babylon
    Decimal squareRoot(){
        //Implement rule of two and sevens(for now just twos because LAZYYY)
        int len = this.number.length()/2;
        if(this.number.length()%2 ==1){
            len++;
        }
        
        String guessStart="2";
        for(int i = 0; i <len-1; i++){
            guessStart = guessStart.concat("0"); /// added the correct amount of zeros
        }
        Decimal guess = new Decimal(guessStart);
        Decimal newGuess = new Decimal("3.14"); // done to start it off. could probably use do while with if break but complexity
        int i = 0;
        while(!newGuess.number.equals(guess.number)){
            if(i>0){
                guess = newGuess;
            }
            Decimal temp1 = this.divide(guess);
            Decimal temp2 = guess.add(temp1);
            newGuess = temp2.divide(new Decimal(2));
            i++;
        }
        return newGuess;
    }
    @Override
    public String toString() {
        
        return this.number;
    }
    
}
