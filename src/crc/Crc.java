/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crc;

import java.awt.Dimension;
import java.awt.Toolkit;
import static java.lang.System.out;
import java.util.Scanner;
import javax.swing.JFrame;

/**
 *
 * @author Magda
 */
public class Crc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        JFrame frame = new JFrame("Crc");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Panel());

        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension screenSize = tk.getScreenSize();

        frame.setPreferredSize(new Dimension(screenSize.width / 2, screenSize.height / 3*2));

        frame.pack();
        frame.setVisible(true);

    }
}
