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

    public Doctor(String yearsOfExperiencce, String Qualifications, String Specialty, String firstName, String lastName, String id, String age, String phone, String email, House house, City city, Community community) {
        super(firstName, lastName, id, age, phone, email, house, city, community);
        this.yearsOfExperiencce = yearsOfExperiencce;
        this.Qualifications = Qualifications;
        this.Specialty = Specialty;
    }

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
