/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package setterGetter;

/**
 *;
 * 
 * @author lenovo
 */
public class user {

    private String username;
    private String password;
    
    public void SetUsername (String username){
        this.username = username ;
    }
    public void SetPaassword (String password){
        this.password = password ;
    }
    public String GetUsername(){
        return this.username;
    }
    public String GetPassword(){
        return this.password;
    }
}
