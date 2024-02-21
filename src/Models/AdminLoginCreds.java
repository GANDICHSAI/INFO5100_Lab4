/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.ArrayList;

/**
 *
 * @author chait
 */
public class AdminLoginCreds {
    
    private ArrayList<String> communityIds;
    private ArrayList<String> communityPasswords;

    public AdminLoginCreds() {
        communityIds = new ArrayList<>();
        communityPasswords = new ArrayList<>();
    }

    public void addCredentials(String id, String password) {
        communityIds.add(id);
        communityPasswords.add(password);
    }

    public boolean authenticate(String id, String password) {
        int idIndex = communityIds.indexOf(id);
        
        int passwordIndex = communityPasswords.indexOf(password);
       
        if (idIndex != -1 && passwordIndex != -1) {
            
            if (communityIds.get(idIndex).equals(id)&& communityPasswords.get(passwordIndex).equals(password)){
                return true;
            }
         
        }
        return false;
    }
    
  
    public void addCreds(){
    addCredentials("C001", "helloworld");
    addCredentials("admin2", "password2");
    }

    
}
