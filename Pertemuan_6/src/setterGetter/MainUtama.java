/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setterGetter;

/**
 *
 * @author lenovo
 */
public class MainUtama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        user u = new user();
        
        u.SetUsername("PikaNuria39");
        u.SetPaassword("WakhidPrik30");
        
        System.out.println("Usernamenya = "+ u.GetUsername());
        System.out.println("Passwornya = "+ u.GetPassword());
    }
    
}
