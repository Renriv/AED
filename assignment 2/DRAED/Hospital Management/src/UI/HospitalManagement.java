/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UI;

import java.awt.BorderLayout;

/**
 *
 * @author BARATHI
 */
public class HospitalManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainScreen ms=new MainScreen();
        ms.setVisible(true);
        LoginPanelPatient lp=new LoginPanelPatient();
        ms.add(lp,BorderLayout.CENTER);
    }
    
}
