/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author chait
 */
public class Doctor extends Person{


    private String yearsOfExperiencce;
    
    private String Qualifications;
    
    private String Specialty;
    
    public String getYearsOfExperiencce() {
        return yearsOfExperiencce;
    }

    public void setYearsOfExperiencce(String yearsOfExperiencce) {
        this.yearsOfExperiencce = yearsOfExperiencce;
    }

    public String getQualifications() {
        return Qualifications;
    }

    public void setQualifications(String Qualifications) {
        this.Qualifications = Qualifications;
    }

    public String getSpecialty() {
        return Specialty;
    }

    public void setSpecialty(String Specialty) {
        this.Specialty = Specialty;
    }
    
}
