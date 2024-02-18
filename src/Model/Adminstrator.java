/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author chait
 */
public class Adminstrator extends Person{

    public Adminstrator(String adminType, String firstName, String lastName, String id, String age, String phone, String email, House house, City city, Community community) {
        super(firstName, lastName, id, age, phone, email, house, city, community);
        this.adminType = adminType;
    }
    private String adminType;

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }
    
    
}
