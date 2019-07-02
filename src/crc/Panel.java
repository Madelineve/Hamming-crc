/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crc;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.Style;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Magda
 */
public class Panel extends javax.swing.JPanel {

    private String area2Text = "";

    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
        setBackground(Color.GRAY);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonRestart = new javax.swing.JButton();
        buttonDecode = new javax.swing.JButton();
        buttonCode = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaBinaryXOR = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        areaMessange = new javax.swing.JEditorPane();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        areaBinary = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        areaBinaryXORHamming = new javax.swing.JTextPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        areaHamming = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        areaFinal = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        errorAnswer = new javax.swing.JLabel();

        buttonRestart.setText("Restart");
        buttonRestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRestartActionPerformed(evt);
            }
        });

        buttonDecode.setText("Dekoduj");
        buttonDecode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDecodeActionPerformed(evt);
            }
        });

        buttonCode.setText("Koduj");
        buttonCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCodeActionPerformed(evt);
            }
        });

        areaBinaryXOR.setEditable(false);
        areaBinaryXOR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaBinaryXORKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaBinaryXORKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(areaBinaryXOR);

        jScrollPane4.setHorizontalScrollBar(null);
        jScrollPane4.setRequestFocusEnabled(false);
        jScrollPane4.setViewportView(areaMessange);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CRC-12", "CRC-16", "CRC-16 REVERSE", "CRC-32", "SDLC", "SDLC REVERSE", "CRC-ITU", "ATM" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel4.setText("1. Wiadomość");

        jLabel5.setText("2. Wiadomość binarnie");

        areaBinary.setEditable(false);
        jScrollPane2.setViewportView(areaBinary);

        jLabel6.setText("3. Wiadomość binarnie + reszta XOR");

        jLabel7.setText("4. Wiadomość binarnie + reszta XOR + Hamming");

        jLabel8.setText("5. Poprawa błędu (Hamming)");

        jLabel9.setText("7. Wiadomość po odebraniu");

        jLabel10.setText("6. Czy wiadomość zawiera błędy?");

        jLabel11.setText("Klucz");

        areaBinaryXORHamming.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaBinaryXORHammingKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaBinaryXORHammingKeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(areaBinaryXORHamming);

        areaHamming.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaHammingKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaHammingKeyReleased(evt);
            }
        });
        jScrollPane5.setViewportView(areaHamming);

        areaFinal.setEditable(false);
        areaFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                areaFinalKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                areaFinalKeyReleased(evt);
            }
        });
        jScrollPane7.setViewportView(areaFinal);

        jButton1.setText("Napraw błąd");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(buttonCode, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonRestart, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(buttonDecode, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel5))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton1)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(errorAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel10))
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(jLabel6)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCode)
                        .addComponent(buttonRestart)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(buttonDecode))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorAnswer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRestartActionPerformed

        areaMessange.setText("");
        areaBinaryXOR.setText("");
        areaBinaryXORHamming.setText("");
        areaFinal.setText("");
        areaHamming.setText("");
        areaBinary.setText("");
    }//GEN-LAST:event_buttonRestartActionPerformed

    private void areaBinaryXORKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaBinaryXORKeyReleased

        StyledDocument doc = areaBinaryXOR.getStyledDocument();

        Style style = areaBinaryXOR.addStyle("I'm a Style", null);

        String text = areaBinaryXOR.getText();

        areaBinaryXOR.setText("");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != area2Text.charAt(i)) {
                StyleConstants.setForeground(style, Color.red);

                try {
                    doc.insertString(doc.getLength(), "" + text.charAt(i), style);
                } catch (BadLocationException e) {
                }
            } else {
                StyleConstants.setForeground(style, Color.blue);

                try {
                    doc.insertString(doc.getLength(), "" + text.charAt(i), style);
                } catch (BadLocationException e) {
                }
            }
        }
    }//GEN-LAST:event_areaBinaryXORKeyReleased

    private void areaBinaryXORKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaBinaryXORKeyPressed

    }//GEN-LAST:event_areaBinaryXORKeyPressed

    private void buttonDecodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDecodeActionPerformed

        Hamming hh = new Hamming(areaHamming.getText(), 3);
        String temp = hh.decodedMessage;
     
        

        if (jComboBox1.getSelectedIndex() == 0) //crc-12
        {
            
            CodeText cc = new CodeText(8, temp, 0);
            

            if (cc.isCorrect) {
                errorAnswer.setText("Wiadomość odebrana bez błędów.");
            } else {
                errorAnswer.setText("Wiadomość zawiera błędy");
            }
            areaFinal.setText(binaryToText(addSpace(cc.finalCode)));
        }
        if (jComboBox1.getSelectedIndex() == 1) //crc-16
        {
            
            CodeText cc = new CodeText(8, temp, 1);
            areaFinal.setText(binaryToText(addSpace(cc.finalCode)));
            
            if (cc.isCorrect) {
                errorAnswer.setText("Wiadomość odebrana bez błędów.");
            } else {
                errorAnswer.setText("Wiadomość zawiera błędy");
            }
        }
        if (jComboBox1.getSelectedIndex() == 2) //crc-16 reverse
        {
            
            CodeText cc = new CodeText(8, temp, 2);
            areaFinal.setText(binaryToText(addSpace(cc.finalCode)));

            if (cc.isCorrect) {
                errorAnswer.setText("Wiadomość odebrana bez błędów.");
            } else {
                errorAnswer.setText("Wiadomość zawiera błędy");
            }
        }
        if (jComboBox1.getSelectedIndex() == 3) //crc-32
        {
            
            CodeText cc = new CodeText(8, temp, 3);
            areaFinal.setText(binaryToText(addSpace(cc.finalCode)));

            if (cc.isCorrect) {
                errorAnswer.setText("Wiadomość odebrana bez błędów.");
            } else {
                errorAnswer.setText("Wiadomość zawiera błędy");
            }
        }
        if (jComboBox1.getSelectedIndex() == 4) //sdlc
        {
            
            CodeText cc = new CodeText(8, temp, 4);
            areaFinal.setText(binaryToText(addSpace(cc.finalCode)));

            if (cc.isCorrect) {
                errorAnswer.setText("Wiadomość odebrana bez błędów.");
            } else {
                errorAnswer.setText("Wiadomość zawiera błędy");
            }
        }
        if (jComboBox1.getSelectedIndex() == 5) //sdlc reverse
        {
            
            CodeText cc = new CodeText(8, temp, 5);
            areaFinal.setText(binaryToText(addSpace(cc.finalCode)));

            if (cc.isCorrect) {
                errorAnswer.setText("Wiadomość odebrana bez błędów.");
            } else {
                errorAnswer.setText("Wiadomość zawiera błędy");
            }
        }
        if (jComboBox1.getSelectedIndex() == 6) //crc_itu
        {
            
            CodeText cc = new CodeText(8, temp, 6);
            areaFinal.setText(binaryToText(addSpace(cc.finalCode)));

            if (cc.isCorrect) {
                errorAnswer.setText("Wiadomość odebrana bez błędów.");
            } else {
                errorAnswer.setText("Wiadomość zawiera błędy");
            }
        }
        if (jComboBox1.getSelectedIndex() == 7) //atm
        {
            
            CodeText cc = new CodeText(8, temp, 7);
            areaFinal.setText(binaryToText(addSpace(cc.finalCode)));

            if (cc.isCorrect) {
                errorAnswer.setText("Wiadomość odebrana bez błędów.");
            } else {
                errorAnswer.setText("Wiadomość zawiera błędy");
            }
        }


    }//GEN-LAST:event_buttonDecodeActionPerformed


    private void buttonCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCodeActionPerformed

        areaBinaryXOR.setText("");
        StyledDocument doc = areaBinaryXOR.getStyledDocument();
        Style style = areaBinaryXOR.addStyle("I'm a Style", null);

        areaBinary.setText(textToBinay(areaMessange.getText()));

        if (jComboBox1.getSelectedIndex() == 0) //crc-12
        {
            CodeText cc = new CodeText(0, textToBinay(areaMessange.getText()), 99);
            areaBinaryXOR.setText(addSpace(cc.finalCode));
        }
        if (jComboBox1.getSelectedIndex() == 1) //crc-16
        {
            CodeText cc = new CodeText(1, textToBinay(areaMessange.getText()), 99);
            areaBinaryXOR.setText(addSpace(cc.finalCode));
        }
        if (jComboBox1.getSelectedIndex() == 2) //crc-16 reverse
        {
            CodeText cc = new CodeText(2, textToBinay(areaMessange.getText()), 99);
            areaBinaryXOR.setText(addSpace(cc.finalCode));
        }
        if (jComboBox1.getSelectedIndex() == 3) //crc-32
        {
            CodeText cc = new CodeText(3, textToBinay(areaMessange.getText()), 99);
            areaBinaryXOR.setText(addSpace(cc.finalCode));
        }
        if (jComboBox1.getSelectedIndex() == 4) //sdlc
        {
            CodeText cc = new CodeText(4, textToBinay(areaMessange.getText()), 99);
            areaBinaryXOR.setText(addSpace(cc.finalCode));
        }
        if (jComboBox1.getSelectedIndex() == 5) //sdlc reverse
        {
            CodeText cc = new CodeText(5, textToBinay(areaMessange.getText()), 99);
            areaBinaryXOR.setText(addSpace(cc.finalCode));
        }
        if (jComboBox1.getSelectedIndex() == 6) //crc_itu
        {
            CodeText cc = new CodeText(6, textToBinay(areaMessange.getText()), 99);
            areaBinaryXOR.setText(addSpace(cc.finalCode));
        }
        if (jComboBox1.getSelectedIndex() == 7) //atm
        {
            CodeText cc = new CodeText(7, textToBinay(areaMessange.getText()), 99);
            areaBinaryXOR.setText(addSpace(cc.finalCode));
        }

        area2Text = areaBinaryXOR.getText();

        Hamming hh = new Hamming(areaBinaryXOR.getText(), 1);
        areaBinaryXORHamming.setText(addSpace(hh.message));


    }//GEN-LAST:event_buttonCodeActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void areaBinaryXORHammingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaBinaryXORHammingKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaBinaryXORHammingKeyPressed

    private void areaBinaryXORHammingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaBinaryXORHammingKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_areaBinaryXORHammingKeyReleased

    private void areaHammingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaHammingKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaHammingKeyPressed

    private void areaHammingKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaHammingKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_areaHammingKeyReleased

    private void areaFinalKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaFinalKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaFinalKeyPressed

    private void areaFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_areaFinalKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_areaFinalKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String temp = areaBinaryXORHamming.getText();
        Hamming hh = new Hamming(temp, 2);
        areaHamming.setText(addSpace(hh.fixedMessage));

    }//GEN-LAST:event_jButton1ActionPerformed

    int www = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane areaBinary;
    private javax.swing.JTextPane areaBinaryXOR;
    private javax.swing.JTextPane areaBinaryXORHamming;
    private javax.swing.JTextPane areaFinal;
    private javax.swing.JTextPane areaHamming;
    private javax.swing.JEditorPane areaMessange;
    private javax.swing.JButton buttonCode;
    private javax.swing.JButton buttonDecode;
    private javax.swing.JButton buttonRestart;
    private javax.swing.JLabel errorAnswer;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    // End of variables declaration//GEN-END:variables

    private String binaryToText(String usesrText) {
        String s = "";
        for (int index = 0; index < usesrText.length(); index += 9) {
            String temp = usesrText.substring(index, index + 8);
            int num = Integer.parseInt(temp, 2);
            char letter = (char) num;
            s = s + letter;
        }
        return s;
    }

    private String textToBinay(String usesrText) {
        String result = "";
        String tmpStr;
        int tmpInt;
        char[] messChar = usesrText.toCharArray();
        int bits = 8;

        for (int i = 0; i < messChar.length; i++) {
            tmpStr = Integer.toBinaryString(messChar[i]);
            tmpInt = tmpStr.length();
            if (tmpInt != bits) {
                tmpInt = bits - tmpInt;
                if (tmpInt == bits) {
                    result += tmpStr;
                } else if (tmpInt > 0) {
                    for (int j = 0; j < tmpInt; j++) {
                        result += "0";
                    }
                    result += tmpStr;
                } else {
                    System.err.println("argument 'bits' is too small");
                }
            } else {
                result += tmpStr;
            }
            result += " "; // separator
        }

        return result;
    }

    private String addSpace(String text) {
        String temp = "";

        for (int i = 0; i < text.length(); i++) {
            temp += text.charAt(i);
            if ((i + 1) % 8 == 0) {
                temp += ' ';
            }
        }
        return temp;
    }

}
