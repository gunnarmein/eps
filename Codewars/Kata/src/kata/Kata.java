/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

/**
 *
 * @author gmein
 */
public class Kata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Big x1 = new Big("1244309589827439328474958304");
        Big y1 = new Big("9000000000000000000000000096");

        x1 = x1.multiply(y1);
        System.out.println("mult:" + x1);

        x1 = x1.divide(y1);
        System.out.println("div:" + x1);
        if (true) {
            return;
        }
        // TODO code application logic here
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testSqrt();

        System.out.println("tests done");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        Decimal d1 = new Decimal("593582");
//        Decimal d2 = new Decimal("23459");
        Decimal d3 = new Decimal("10859");
//        System.out.println(d1 + "+" + d2 + "=" + (d1.add(d2)));
//        System.out.println(d1 + "*" + d2 + "=" + (d1.multiply(d2)));
//        System.out.println(d1 + "-" + d2 + "=" + (d1.subtract(d2)));
//        System.out.println(d1 + "/" + d2 + "=" + (d1.divide(d2)));
//        System.out.println(d1 + "/" + d3 + " = " + d1.divide(d3));
//        System.out.println("sqrt(" + d1 + ") = " + d1.squareRoot());
    }

    static boolean testAddition() {
        for (int i = 0; i < 100; i++) {
            int i1 = (int) (Math.random() * 1000000);
            int i2 = (int) (Math.random() * 1000000);

            Decimal d1 = new Decimal(i1);
            Decimal d2 = new Decimal(i2);
            if (d1.add(d2).compare(new Decimal(i1 + i2)) != 0) {
                System.out.println("Fail add: " + d1 + "," + d2);
                return false;
            }
        }
        return true;
    }

    static boolean testMultiplication() {
        for (int i = 0; i < 100; i++) {
            int i1 = (int) (Math.random() * 10000);
            int i2 = (int) (Math.random() * 10000);

            Decimal d1 = new Decimal(i1);
            Decimal d2 = new Decimal(i2);
            if (d1.multiply(d2).compare(new Decimal(i1 * i2)) != 0) {
                System.out.println("Fail multiply: " + d1 + ", " + d2 + ", should be " + (i1 * i2) + ", is " + d1.multiply(d2));
                return false;
            }
        }
        return true;
    }

    static boolean testSqrt() throws Exception {
        for (int i = 0; i < 100; i++) {
            int i1 = (int) (Math.random() * 10000);

            Decimal d1 = new Decimal(i1);
            if (d1.squareRoot().compare(new Decimal((int) Math.sqrt(i1))) != 0) {
                System.out.println("Fail : " + d1 + ", should be " + ((int) Math.sqrt(i1)) + ", is " + d1.squareRoot());
                return false;
            }
        }
        return true;
    }

    static boolean testSubtraction() throws Exception {
        for (int i = 0; i < 100; i++) {
            int i1 = (int) (Math.random() * 1000000);
            int i2 = (int) (Math.random() * 1000000);

            if (i2 > i1) {
                int temp = i2;
                i2 = i1;
                i1 = temp;
            }

            Decimal d1 = new Decimal(i1);
            Decimal d2 = new Decimal(i2);
            if (d1.subtract(d2).compare(new Decimal(i1 - i2)) != 0) {
                System.out.println("Fail subtract: " + d1 + ", " + d2 + ", should be " + (i1 - i2) + ", is " + d1.subtract(d2));
                return false;
            }
        }
        return true;
    }

    static boolean testDivision() throws Exception {
        for (int i = 0; i < 100; i++) {
            int i1 = (int) (Math.random() * 1000000);
            int i2 = (int) (Math.random() * 1000000);

            if (i2 > i1) {
                int temp = i2;
                i2 = i1;
                i1 = temp;
            }

            Decimal d1 = new Decimal(i1);
            Decimal d2 = new Decimal(i2);
            if (d1.divide(d2).compare(new Decimal(i1 / i2)) != 0) {
                System.out.println("Fail divide: " + d1 + ", " + d2 + ", should be " + (i1 / i2) + ", is " + d1.divide(d2));
                return false;
            }
        }
        return true;
    }

    public static String integerSquareRoot(String n) {
        return "0";
    }

    static private class Decimal {

        String d;

        Decimal() {
            d = "0";
        }

        Decimal(String s) {
            this.d = s;
        }

        Decimal(int n) {
            d = Integer.toString(n);
        }

        @Override
        public String toString() {
            return d;
        }

        static int stringDigit(String s, int index) {
            //System.out.println("sd "+s+", "+index);
            return Integer.parseInt(s.substring(index, index + 1));
        }

        Decimal highDigits(int n) {
            n = Math.min(n, d.length());
            return new Decimal(d.substring(0, n));
        }

        Decimal add(Decimal dec2) {
            String d1 = d;
            String d2 = dec2.d;

            if (d1.length() > d2.length()) {
                String temp = d1;
                d1 = d2;
                d2 = temp;
            }

            // d2 is longer or equal. i runs through the length of the smaller d1
            int l1 = d1.length();
            int l2 = d2.length();
            int carry = 0;
            String result = "";
            for (int i = 0; i < l2; i++) {
                int sum = 0;
                if (i < l1) {
                    sum = stringDigit(d1, l1 - i - 1);
                }
                sum += stringDigit(d2, l2 - i - 1) + carry;
                result = (sum % 10) + result;
                carry = sum / 10;
            }
            if (carry != 0) {
                result = carry + result;
            }

            return new Decimal(result);
        }

        Decimal subtract(Decimal dec2) throws Exception {
            if (dec2.d.length() > d.length()) {
                System.out.println("subtract: " + this + ", " + dec2);
                throw new Exception("invalid argument to subtract");
            }

            String d1 = d;
            String d2 = dec2.d;

            int l1 = d1.length();
            int l2 = d2.length();
            int carry = 0;
            String result = "";
            for (int i = 0; i < l1; i++) {
                int diff = stringDigit(d1, l1 - i - 1);
                if (i < l2) {
                    diff -= stringDigit(d2, l2 - i - 1);
                }
                diff -= carry;

                //System.out.println("diff: " + diff);
                result = (diff < 0 ? diff + 10 : diff) + result;
                carry = (diff < 0 ? 1 : 0);
            }
            if (carry != 0) {
                System.out.println("underflow in subtract");
            }

            result = trimLeadingZeroes(result);

            if (result.length() > d.length()) {
                throw new Exception("subtract is growing the number");
            }

            return new Decimal(trimLeadingZeroes(result));
        }

        Decimal timesPowerOfTen(int p) {
            String d1 = d;
            for (int i = 0; i < p; i++) {
                d1 += "0";
            }
            return new Decimal(trimLeadingZeroes(d1));
        }

        Decimal multiplyBySingleDigit(int digit) {
            Decimal result = new Decimal();

            int power = 0;
            for (int i = 0; i < d.length(); i++) {
                result = result.add((new Decimal(stringDigit(d, d.length() - i - 1) * digit)).timesPowerOfTen(power));
                power++;
            }
            return result;
        }

        Decimal multiply(Decimal dec2) {
            String d1 = d;

            Decimal result = new Decimal();
            int power = 0;

            for (int i = 0; i < d1.length(); i++) {
                Decimal term = dec2.multiplyBySingleDigit(stringDigit(d1, d1.length() - i - 1)).timesPowerOfTen(power);
                //System.out.println("mult term: " + term);
                result = result.add(term);
                ++power;
            }
            return result;
        }

        Decimal divide(Decimal divisor) throws Exception {

            String result = "";
            Decimal r = new Decimal(0);
            Decimal dividend = new Decimal(this.d);
            Decimal highPart;
//            System.out.println("");
//            System.out.println("divisor:" + divisor);

            for (int i = 0; i < d.length(); i++) {
//                System.out.println("new digit: " + i);
//                System.out.println("dividend: " + dividend);
                highPart = new Decimal();
                int partDigits = 0;
                while (partDigits < d.length() && highPart.compare(divisor) < 0) {
                    partDigits++;
                    highPart = dividend.highDigits(partDigits);
                }
                // if the high part is big enough, figure out the single-digit factor
//                System.out.println("high part:" + highPart);
                int factor = 0;
                if (highPart.compare(divisor) >= 0) {
                    int dd = stringDigit(dividend.d, 0);
                    int dv = stringDigit(divisor.d, 0);
                    factor = dd / dv; // given setup, should be greater at least 1
                    // make a term with the factor as a guess
                    Decimal term = divisor.multiplyBySingleDigit(factor);
//                    System.out.println("dividend: " + dividend);
//                    System.out.println("initial factor: " + factor + ", initial term: " + term);
                    // make the term just bigger than it has to be
                    while (term.compare(highPart) < 0) {
                        term = term.add(divisor);
                        factor++;
//                        System.out.println("increasing, factor: " + factor + ", term: " + term);
                    }
//                    System.out.println("interim factor: " + factor + ", interim term: " + term);

                    // at this point, term should be a little too big, so ratched it down by a few
                    while (term.compare(highPart) > 0) {
                        term = term.subtract(divisor);
                        factor--;
//                        System.out.println("reducing, factor: " + factor + ", term: " + term);
                    }
//                    System.out.println("end factor: " + factor + ", end term: " + term);

                    // shift it to the correct digit
                    Decimal factorDecimal = new Decimal(factor);
//                    System.out.println("shifting by " + (dividend.d.length() - partDigits));
                    term = term.timesPowerOfTen(dividend.d.length() - partDigits);
                    factorDecimal = factorDecimal.timesPowerOfTen(dividend.d.length() - partDigits);

                    // subtract term from dividend
//                    System.out.println("subtracting " + term);
                    dividend = dividend.subtract(term);
//                    System.out.println("result before " + r);
                    r = r.add(factorDecimal);
//                    System.out.println("result currently " + r);
                }
            }
            return r;
        }

        int compare(Decimal dec2) {
            if (d.length() > dec2.d.length()) {
                return 1;
            }

            if (dec2.d.length() > d.length()) {
                return -1;
            }

            for (int i = 0; i < d.length(); i++) {
                int diff = stringDigit(d, i) - stringDigit(dec2.d, i);
                if (diff != 0) {
                    return diff;
                }
            }
            return 0;
        }

        static String trimLeadingZeroes(String s) {
            if (s.length() == 1) {
                return s;
            }
            int count = 0;
            int i = 0;
            while (i < s.length() - 1 && s.substring(i, i + 1).equals("0")) {
                count++;
                i++;
            }

            if (count > 0) {
                s = s.substring(count);
            }
            return s;
        }

        Decimal squareRoot() throws Exception {
            // make initial guess
//            System.out.println("sqrt n = " + this);
            Decimal n = new Decimal(this.d);
            n = n.timesPowerOfTen(2);
//            System.out.println("  * 10: " + n);

            Decimal x = new Decimal(n.d.substring(0, n.d.length() / 2));
            Decimal two = new Decimal("2");
            Decimal lastx = new Decimal(0);
            int count = 0;
            while (count < 100) {
//                System.out.println("Guess: " + x);
//                System.out.println(" n / x: " + n.divide(x));
//                System.out.println(" +x: " + n.divide(x).add(x));
//                System.out.println(" /2: " + n.divide(x).add(x).divide(two));

                x = n.divide(x).add(x).divide(two);

                if (x.compare(lastx) == 0) {
                    break;
                }
                count++;
                lastx = new Decimal(x.d);
            }
            x = x.divide(new Decimal(10));
            return x;
        }
    }

}
