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
2. [Please insert assumptions for admin roles]
3. [Please insert assumptions for patient role]
4. Doctor can add new patient by creating new patient entry first, then diagnose vital signs. The encounters are recored after creation of new entries. Doctor cannot modify or delete patient encounters.

## Authors and acknowledgment
Chaitanya Sai Gandi <br>
Yihan Li <br>
Yiyang Xu <br>
