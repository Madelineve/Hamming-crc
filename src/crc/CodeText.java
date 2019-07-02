/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crc;

/**
 *
 * @author Magda
 */
public class CodeText {

    private String polynomial = "";

    int codeCase;
    String finalCode;
    boolean isCorrect;
    int crc;

    public CodeText(int codeCase, String text, int crc) {
        this.codeCase = codeCase;

        String noSpaceText = "";
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                noSpaceText += text.charAt(i);
            }
        }
        this.crc = crc;

        if (codeCase == 0) {
            this.finalCode = crc12(noSpaceText);
        } else if (codeCase == 1) {
            this.finalCode = crc16(noSpaceText);
        } else if (codeCase == 2) {
            this.finalCode = crc16Reverse(noSpaceText);
        } else if (codeCase == 3) {
            this.finalCode = crc32(noSpaceText);
        } else if (codeCase == 4) {
            this.finalCode = sdlc(noSpaceText);
        } else if (codeCase == 5) {
            this.finalCode = sdlcReverse(noSpaceText);
        } else if (codeCase == 6) {
            this.finalCode = crc_itu(noSpaceText);
        } else if (codeCase == 7) {
            this.finalCode = atm(noSpaceText);
        } else if (codeCase == 8) {

            this.isCorrect = checkCorrect(noSpaceText, crc);
            this.finalCode = decode(noSpaceText);
        }
    }

    private String crc12(String text) {
        polynomial = "1100000001111"; // x^12+x^11+x^3+x^2+x+1

        String temp = text;

        text = calculate(temp, polynomial, 0);

        return text;

    }

    private String crc16(String text) {
        polynomial = "11000000000000101"; // 

        String temp = text;

        text = calculate(temp, polynomial, 0);

        return text;

    }

    private String crc16Reverse(String text) {
        polynomial = "10100000000000011"; // 

        String temp = text;

        text = calculate(temp, polynomial, 0);

        return text;

    }

    private String crc32(String text) {
        polynomial = "100000100011000000001110110110111"; //

        String temp = text;

        text = calculate(temp, polynomial, 0);

        return text;

    }

    private String sdlc(String text) {
        polynomial = "10001000000100001"; //

        String temp = text;

        text = calculate(temp, polynomial, 0);

        return text;

    }

    private String sdlcReverse(String text) {
        polynomial = "10000100000010001"; //

        String temp = text;

        text = calculate(temp, polynomial, 0);

        return text;

    }

    private String crc_itu(String text) {
        polynomial = "10001000000100001"; //

        String temp = text;

        text = calculate(temp, polynomial, 0);

        return text;

    }

    private String atm(String text) {
        polynomial = "100000111"; //

        String temp = text;

        text = calculate(temp, polynomial, 0);

        return text;

    }

    private String calculate(String text1, String key, int e) {
        String reminder = "";
        int l = 0;

        String noSpaceText = "";
        for (int i = 0; i < text1.length(); i++) {
            if (text1.charAt(i) == '1' || text1.charAt(i) == '0') {
                noSpaceText += text1.charAt(i);
            }
        }

        if (e == 0) {
            l = noSpaceText.length() + key.length() - 1;
        } else {
            l = noSpaceText.length();
        }

        char[] text = new char[l];
        int p = 0;

        for (int i = 0; i < noSpaceText.length(); i++) { //usuwanie spacji
            if (noSpaceText.charAt(i) == '1' || noSpaceText.charAt(i) == '0') {
                text[p] += noSpaceText.charAt(i);
                p++;
            }

        }

        if (e == 0) {
            for (int i = 0; i < (key.length() - 1); i++) { //uzupelnienie zerami 
                text[p + i] += '0';
            }
        }

        for (int i = 0; i < (text.length - key.length() + 1); i++) {

            if (text[i] != '0') {

                for (int j = 0; j < key.length(); j++) {
                    if (text[i + j] == key.charAt(j)) {
                        text[i + j] = '0';
                    } else {
                        text[i + j] = '1';
                    }
                }
            }
        }

        if (e == 1) {
            for (int i = 0; i < text1.length(); i++) {
                reminder += text[i];
            }

            return reminder;
        }
        for (int i = 0; i < (text1.length() + key.length() - 1); i++) {

            if ((text.length - key.length() + 1) > i) {
                reminder += text1.charAt(i);
            } else {
                reminder += text[i];
            }

        }

        return reminder;
    }

    private String decode(String message1) {

        String temp = "";
        int p = 0;
        if (crc == 0) {
            p = 12;
        } else if (crc == 1 || crc == 2 || crc == 4 || crc == 5 || crc == 6) {
            p = 16;
        } else if (crc == 3) {
            p = 32;
        } else if (crc == 7) {
            p = 8;
        }

        for (int i = 0; i < message1.length() - p; i++) {
            temp += message1.charAt(i);
        }

        return temp;
    }

    private String polynomial(int crc) {
        if (crc == 0) {
            return "1100000001111";
        }
        if (crc == 1) {
            return "11000000000000101";
        }
        if (crc == 2) {
            return "10100000000000011";
        }
        if (crc == 3) {
            return "100000100011000000001110110110111";
        }
        if (crc == 4) {
            return "10001000000100001";
        }
        if (crc == 5) {
            return "10000100000010001";
        }
        if (crc == 6) {
            return "10001000000100001";
        }
        if (crc == 7) {
            return "100000111";
        }
        return null;

    }

    private boolean checkCorrect(String text1, int crc) {
        String polynomial1 = polynomial(crc);

        String text = calculate(text1, polynomial1, 1);
       // System.out.println(text1);

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '1') {
               // System.out.print("%");

                return false;

            }
        }

        return true;
    }

}
