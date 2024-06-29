/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc
 */
public class Student extends User{
    public Student(){
        this(0, "", "", "", "", "");
    }
    public Student(int id, String username, String password, String fullname, String email, String role){
        super(id, username, password, fullname, email, "Student");
    }
}