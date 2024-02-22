/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author chait
 */
public class Doctor extends Person{


    private int yearsOfExperiencce;
    
    private String qualifications;
    
    private String specialty;
    
    public int getYearsOfExperiencce() {
        return yearsOfExperiencce;
    }

    public void setYearsOfExperiencce(int yearsOfExperiencce) {
        this.yearsOfExperiencce = yearsOfExperiencce;
    }

    public String getQualifications() {
        return qualifications;
    }

    public void setQualifications(String qualifications) {
        this.qualifications = qualifications;
    }

    

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
    
}
