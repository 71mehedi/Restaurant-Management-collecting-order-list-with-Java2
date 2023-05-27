/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmsx.ih.rmsx.Login_Layer.model;


import java.io.Serializable;

/**
 *
 * @author ihzonaid
 */
public class Customer implements Serializable{
   public String fullName;
   public String userName;
   public String address;
   public String password;
   public String  number;
   
   public Customer(String userName, 
           String pass){
       this.userName = userName;
       this.password = pass;
       
   }
   public Customer(){}
   
   
    
   
    
}
