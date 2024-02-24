# Hospital Management System

## Description
Hospital Management system is a JAVA SWING application that allows patients, doctors and admins to access hospital appointment data from a JAVA GUI.<br> 
The system has admins with 4 different roles (patient, doctor, community and hospital). Admin can modify or update data corresponding to their role. The admins and doctors can login to system using credentials. <br>
Patient users can search for doctors based on hospitals in their community.<br>
Doctors users can create new entry for new patient, diagnose vital signs and save data diagnosed patients in encounters history.

## Class Diagram
![Lab4-ClassDiagram](https://github.com/GANDICHSAI/INFO5100_Lab4/assets/157151106/07d67423-7ec1-4dee-bb99-77ad1ac8ff1c)

## Dependencies
Date selection uses library jcalendar-1.4

## Assumptions
This system is implemented based on the following assumptions:
1. The credentials for admin and doctor log-in are as follows:
    ```java
    addCredentials("C001", "helloworld");
    addCredentials("admin2", "password2");
2. A community admin can modify hospital data, patient data, doctor data, and community data under a community. A system admin can access and modify all data.
3. A patient can search hospital and doctor based on city and community, and choose a doctor to make an appointment.
4. Doctor can add new patient by creating new patient entry first, then diagnose vital signs. The encounters are recored after creation of new entries. Doctor cannot modify or delete patient encounters.
5. version-1: data mocked by Systems.java

## File Structure
- `src/`: Contains the source code of the project.
  - `UserInterface/`: Contains the user interface components.
    - `MainForm/`: Application framework.
    - `Admin/`: Contains files related to the admin interface.
    - `Doctor/`: Contains files related to the doctor interface.
    - `Patient/`: Contains files related to the patient interface.
  - `Models/`: Contains the model classes representing entities in the system.
    - `Systems/`: Create mock data 
    
## Authors and acknowledgment
Chaitanya Sai Gandi <br>
Yihan Li <br>
Yiyang Xu <br>
