package crc;

import static java.lang.Math.pow;

/**
 *
 * @author Magda
 */
public class Hamming {

    String message;
    String fixedMessage;
    String decodedMessage;

    private char[] text;
    private int[] bits;

    public Hamming(String message, int e) {

        //ile bedzie poteg 2
        int bound = message.length();
        int power = 1;
        int pows = 0;
        while (power <= bound) {
            pows++;
            power *= 2;
        }

        

        String noSpaceText = "";
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == '1' || message.charAt(i) == '0') {
                noSpaceText += message.charAt(i);
            }
        }

        text = new char[noSpaceText.length() + pows];
        
        if (e == 1) {
            this.message = parityBits(noSpaceText);
        }
        if (e == 2) {
            this.fixedMessage = findMistake(noSpaceText);
        }
        if (e == 3) {
            this.decodedMessage = decode(noSpaceText);
        }

    }

    int w = 0;

    private String parityBits(String message) {

        int pow_p = 0; //wykladnik
        int pow_q = 2; //potęga

        for (int i = 0; i < message.length(); i++) {

            if (i == 0) {
                text[0] = '*';

                w++;
            }

            if (w + 1 == pow_q) {

                text[w] = '*';

                w++;
                pow_p++;
                pow_q = (int) pow(2, pow_p + 1);
            }

            text[w] = message.charAt(i);
            w++;
        }

        String temp = "";

        for (int i = 0; i < text.length; i++) {
            if (text[i] == '*') {
                if (counter(i + 1, text)) {
                    text[i] = '0';//0
                } else {
                    text[i] = '1';
                }

            }
        }

        for (int i = 0; i < text.length; i++) {
            temp += text[i];
        }

        return temp;
    }

    private boolean counter(int pow_q, char[] message1) {
        int temp = 0;

        int yy = 0;
        for (int i = pow_q - 1; i < message1.length; i += 2 * pow_q) {
            for (int j = i; yy < pow_q && j < message1.length; j++) {

                if (message1[j] == '1') {
                    temp++;
                }
                yy++;
                  // System.out.print(yy+" ");
            }
//System.out.print(" ");
            yy = 0;

        }
               //    System.out.print("\n ");

        if (temp % 2 == 0) {
            return true;
        }
        return false;
    }

    private String findMistake(String message1) {

        int pow_q = 1;
        int mistake = -1;
        int pow_p = 0;
        char[] text1 = new char[message1.length()];
        for (int i = 0; i < message1.length(); i++) {
            text1[i] = message1.charAt(i);
        }

        for (int i = 0; i < text1.length; i++) {
            if (i == pow_q) {
                if (!counter(pow_q, text1)) {
                    mistake += pow_q;

                }
                pow_p++;
                pow_q = (int) pow(2, pow_p );
            }
        }

        

      //  System.out.println(mistake);
        

        if (mistake != -1 && mistake < text1.length) {
         //   System.err.println(text1[mistake]);
            if (text1[mistake] == '1') {
                text1[mistake] = '0';
            } else {
                text1[mistake] = '1';
            }
        }

        String temp1 = "";
        for (int i = 0; i < message1.length(); i++) {
            if( text1[i]=='1' || text1[i]=='0') temp1 += text1[i];
        }
        
        return temp1;

    }

    private String decode(String message1) {

        int pow_q = 1;
        int pow_p = 0;

        String temp1 = "";
        String temp2 = message1;
        for (int i = 0; i < temp2.length(); i++) {

            if (i + 1 == pow_q) {

                pow_p++;
                pow_q = (int) pow(2, pow_p);
            } else {
                temp1 += message1.charAt(i);
            }
        }

        return temp1;

    }
}
