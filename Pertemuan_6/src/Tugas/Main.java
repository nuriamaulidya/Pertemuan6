/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas;

/**
 *
 * @author lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TugasSetterGetter TSG = new TugasSetterGetter();
        
        TSG.SetNama("Nuria Maulidya Rahma");
        TSG.SetNim("2255201001");
        
        System.out.println("Nama = "+ TSG.GetNama());
        System.out.println("NIM = "+  TSG.GetNim());
    }
    
}
