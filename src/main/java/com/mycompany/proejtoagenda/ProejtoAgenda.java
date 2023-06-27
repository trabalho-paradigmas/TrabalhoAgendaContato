/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proejtoagenda;

import VIEW.frmLoginVIEW;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;

/**
 *
 * @author Precision M6700
 */
public class ProejtoAgenda {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    //    frmLoginVIEW login = new frmLoginVIEW();
    //    login.setVisible(true);
    
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf());
        } catch(Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmLoginVIEW login = new frmLoginVIEW();
                login.setVisible(true);
                
            }
        });
    }
}
