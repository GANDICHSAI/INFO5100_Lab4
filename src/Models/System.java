/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * @author yihan
 */
public class System {
    private ArrayList<City> ListOfCities;
    private ArrayList<Hospital> ListOfHospitals;
    private ArrayList<PatientHistory> ListOfPatientHistories;
    
    

    public System() {
        this.ListOfCities = new ArrayList<>();
        this.ListOfHospitals = new ArrayList<>();
        this.ListOfPatientHistories = new ArrayList<>();
        initCityData();
        initHospitalData();
        initPatientHistoryData();

    }

    public ArrayList<PatientHistory> getListOfPatientHistories() {
        return ListOfPatientHistories;
    }

    public void setListOfPatientHistories(ArrayList<PatientHistory> ListOfPatientHistories) {
        this.ListOfPatientHistories = ListOfPatientHistories;
    }
    
    public void addListOfPatientHistories(PatientHistory patientHistory) {
        this.ListOfPatientHistories.add(patientHistory);
    }

    public void deleteListOfPatientHistories(PatientHistory patientHistory) {
        this.ListOfPatientHistories.remove(patientHistory);
    }

    public ArrayList<City> getListOfCities() {
        return ListOfCities;
    }

    public void setListOfCities(ArrayList<City> rootCityDirectory) {
        this.ListOfCities = rootCityDirectory;
    }
    
    public void addListOfCities(City city) {
        this.ListOfCities.add(city);
    }

    public void deleteListOfCities(City city) {
        this.ListOfCities.remove(city);
    }
    
    public ArrayList<Hospital> getListOfHospitals() {
        return ListOfHospitals;
    }

    public void setListOfHospitals(ArrayList<Hospital> rootHospitalDirectory) {
        this.ListOfHospitals = rootHospitalDirectory;
    }
    
    public void addListOfHospitals(Hospital hospital) {
        this.ListOfHospitals.add(hospital);
    }

    public void deleteListOfHospitals(Hospital hospital) {
        this.ListOfHospitals.remove(hospital);
    }



    public House mockHouse(String houseNo, String streetName) {
        House house = new House();
        house.setHouseNumber(Integer.parseInt(houseNo));
        house.setStreetName(streetName);
        return house;
    }

    public Community mockCommunity(String name) {
        Community community = new Community();
        community.setCommunityName(name);
        return community;
    }

    public Doctor mockDoctor(String firstName, String lastName, String personId, String phone, String email, House house, Community community, City city, int yearsOfExperiencce, String qualifications, String specialty) {
        Doctor doctor = new Doctor();
        doctor.setFirstName(firstName);
        doctor.setLastName(lastName);
        doctor.setId(Integer.parseInt(personId));
        doctor.setPhone(Long.valueOf(phone));
        doctor.setEmail(email);
        doctor.setHouse(house);
        doctor.setCommunity(community);
        doctor.setCity(city);
        doctor.setYearsOfExperiencce(yearsOfExperiencce);
        doctor.setQualifications(qualifications);
        doctor.setSpecialty(specialty);
        return doctor;
    }

    public Patient mockPatient(String firstName, String lastName, String personId, String phone, String email, House house, Community community, City city, String patientType, int age) {
        Patient patient = new Patient();
        patient.setFirstName(firstName);
        patient.setLastName(lastName);
        patient.setId(Integer.parseInt(personId));
        patient.setPhone(Long.valueOf(phone));
        patient.setEmail(email);
        patient.setHouse(house);
        patient.setCommunity(community);
        patient.setCity(city);
        patient.setPatientType(patientType);
        patient.setAge(age);
        return patient;
    }

    public Encounter mockEncounter(Doctor doctor, Patient patient, VitalSigns vitalSigns) {
        Encounter encounter = new Encounter();
        encounter.setPatient(patient);
        encounter.setDoctor(doctor);
        encounter.setVitalSigns(vitalSigns);
        return encounter;
    }

    public VitalSigns mockVitalSigns(double temperature, String bloodPressure, double bloodGlucose, int pulse, double weight, Date dateOfVitalEntry) {
        VitalSigns vitalSigns = new VitalSigns();
        vitalSigns.setTemperature(temperature);
        vitalSigns.setBloodPressure(bloodPressure);
        vitalSigns.setBloodGlucose(bloodGlucose);
        vitalSigns.setPulse(pulse);
        vitalSigns.setWeight(weight);
        vitalSigns.setDateOfVitalEntry(dateOfVitalEntry);

        return vitalSigns;
    }

    public City mockCity(String cityName, String postalCode, ArrayList<Community> communities) {
        City newCity = new City("","");
        newCity.setCityName(cityName);
        newCity.setPostalCode(postalCode);

        newCity.setCommunityDirectory(communities);
        java.lang.System.out.println(newCity);

        return newCity;
    }

    private void initCityData() {
        ArrayList<Community> torontoCommunityList = new ArrayList<>();
        ArrayList<Community> vancouverCommunityList = new ArrayList<>();

        Community torontoCommunity1 = mockCommunity("Etobicoke");
        Community torontoCommunity2 = mockCommunity("North York");
        Community vancouverCommunity1 = mockCommunity("Downtown");
        Community vancouverCommunity2 = mockCommunity("Fairview");
        torontoCommunityList.add(torontoCommunity1);
        torontoCommunityList.add(torontoCommunity2);
        vancouverCommunityList.add(vancouverCommunity1);
        vancouverCommunityList.add(vancouverCommunity2);

        City newCity1 = mockCity("Toronto", "M4Y 2W1", torontoCommunityList);
        City newCity2 = mockCity("Vancouver", "V5K 0A1", vancouverCommunityList);
        addListOfCities(newCity1);
        addListOfCities(newCity2);
    }
    private void initPatientHistoryData() {
        PatientHistory patientHistory1 = new PatientHistory();
        PatientHistory patientHistory2 = new PatientHistory();

        
        patientHistory1.setPatientID("1125350");
        patientHistory1.setPatientName("charles");
        patientHistory1.setAge(25);
        patientHistory1.setGender("MALE");
        patientHistory1.setTemperature(105);
        patientHistory1.setBloodPressure(120);
        patientHistory1.setBloodGlucose(180);
        patientHistory1.setPulse(89);
        patientHistory1.setWeight(75);
        patientHistory1.setDiagnosisComments("Patient is suffering with high fever, swallow Dolo 650");
        
        patientHistory2.setPatientID("1125351");
        patientHistory2.setPatientName("Marcus");
        patientHistory2.setAge(26);
        patientHistory2.setGender("MALE");
        patientHistory2.setTemperature(98);
        patientHistory2.setBloodPressure(120);
        patientHistory2.setBloodGlucose(180);
        patientHistory2.setPulse(89);
        patientHistory2.setWeight(75);
        patientHistory2.setDiagnosisComments("Patient is in good health condition");
        
        addListOfPatientHistories(patientHistory1);
        addListOfPatientHistories(patientHistory2);

        }

    private void initHospitalData() {
        Hospital newHospital = new Hospital();
        newHospital.setHospitalName("Alpha Hospital");

        // community
        Community mockedCommunity1 = mockCommunity("Etobicoke");
        newHospital.setCommunity(mockedCommunity1);

        // city
        Community mockedCommunity2 = mockCommunity("North York");
        ArrayList<Community> torontoCommunityList = new ArrayList<>();
        torontoCommunityList.add(mockedCommunity1);
        torontoCommunityList.add(mockedCommunity2);
        City hospitalCity = mockCity("Toronto", "M4X 1W5", torontoCommunityList);
        newHospital.setCity(hospitalCity);

        // phone
        newHospital.setPhoneNumber(Long.valueOf("888888"));

        // doctor Dir
        DoctorDirectory newDoctorDirectory = new DoctorDirectory();
        newHospital.setDoctorsDirectory(newDoctorDirectory);

        Community mockedCommunityForDr1 = mockCommunity("downtown");
        City mockedCityForDr1 = mockCity("Toronto", "M4Y", torontoCommunityList);
        House mockedHouseForDr1 = mockHouse("55", "Bay St");

        Doctor mockedDoctor1 = mockDoctor("Yihan", "Li", "001", "4873829903", "yihan@gmail.com", mockedHouseForDr1, mockedCommunityForDr1, mockedCityForDr1, 10, "Ph.D.", "Internal Medicine");

        Community mockedCommunityForDr2 = mockCommunity("downtown");
        City mockedCityForDr2 = mockCity("Toronto", "M4Y", torontoCommunityList);
        House mockedHouseForDr2 = mockHouse("66", "King St");

        Doctor mockedDoctor2 = mockDoctor("Alison", "Xu", "002", "4875345634", "alison@gmail.com", mockedHouseForDr2, mockedCommunityForDr2, mockedCityForDr2, 20, "Ph.D.", "Anesthesiology");

        newDoctorDirectory.addDoctor(mockedDoctor1);
        newDoctorDirectory.addDoctor(mockedDoctor2);
        newHospital.setDoctorsDirectory(newDoctorDirectory);

        //Encounter Dir
        Calendar calendar = Calendar.getInstance();
        calendar.set(2024, Calendar.FEBRUARY, 20, 0, 0, 0);
        Date dateOfVitalEntry = calendar.getTime();
        EncounterDirectory encounterDirectory = new EncounterDirectory();
        Community mockedCommunityForPatient1 = mockCommunity("downtown");
        City mockedCityForPatient1 = mockCity("Toronto", "M4Y", torontoCommunityList);
        House mockedHouseForPatient1 = mockHouse("20", "Queen St");
        Patient mockedPatient1 = mockPatient("Coco", "Wang", "101", "4345838334", "coco@gmail.com", mockedHouseForPatient1, mockedCommunityForPatient1, mockedCityForPatient1, "Outpatient", 50);
        VitalSigns mockedVitalSigns = mockVitalSigns(37.8, "90/120", 70, 60, 50, dateOfVitalEntry);
        Encounter mockedEncounter = mockEncounter(mockedDoctor1, mockedPatient1, mockedVitalSigns);
        encounterDirectory.addEncounter(mockedEncounter);
        newHospital.setEncounterDirectory(encounterDirectory);

        addListOfHospitals(newHospital);
    }
}
