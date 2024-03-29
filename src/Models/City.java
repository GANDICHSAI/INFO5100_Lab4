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
public class City {

 
    
    private String cityName;
    
    private String postalCode;
    
    private ArrayList<Community> CommunityDirectory;
    
    public City(String cityName, String postalCode) {
        this.cityName = cityName;
        this.postalCode = postalCode;
        this.CommunityDirectory = new ArrayList<>();
    }
       
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public ArrayList<Community> getCommunityDirectory() {
        return CommunityDirectory;
    }

    public void setCommunityDirectory(ArrayList<Community> CommunityDirectory) {
        this.CommunityDirectory = CommunityDirectory;
    }
    
    
}
