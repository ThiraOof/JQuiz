/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Admin extends User{
    public Admin(){
        this("", "", "", "", "Admin");
    }
    public Admin(String Name, String Surname, String ID, String Mail, String Permission){
        super(Name, Surname, ID, Mail, "Admin");
    }
}