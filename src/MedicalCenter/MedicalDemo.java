package MedicalCenter;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import static MedicalCenter.Interface1.Commands.*;

public class MedicalDemo {
    static Scanner scanner = new Scanner(System.in);
    static DoctorStorage doctorStorage = new DoctorStorage();
    static PatientStorage patientStorage = new PatientStorage();

    public static void main(String[] args) throws ParseException {

        boolean isRun = true;

        Doctor doctor = new Doctor("aA001", "Saqo", "Vardanyan", "valod@mail.ru");
        Doctor doctor1 = new Doctor("aA001", "Noro", "Akopyan", "ardo@mail.ru");
        Doctor doctor2 = new Doctor("aA001", "karine", "Sargsyan", "margo@mail.ru");


        patientStorage.add(new Patient("Armen", "Poxosyan", "94539547", "Saqo", new Date(), DateUtil.stringToDate("22.02.1980")));

        patientStorage.add(new Patient("Vardan", "Soxomonyan", "94772256", "Noro", new Date(), DateUtil.stringToDate("17.04.1976")));
        patientStorage.add(new Patient("Karen", "Abrahamyan", "946854274", "karine", new Date(), DateUtil.stringToDate("20.06.1994")));

        while (isRun) {
            Interface1.Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case PRINT_DELETE_DOCTOR_BY_ID:
                    printDeleteDoctorById();
                    break;
                case CHANGE_DOCTOR_DATA_BY_ID:
                    changeDoctorDataById();
                    break;
                case ADD_PATIENTS:
                    addPatients();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TO_DAYS_PATIENTS:
                    printTodaysPatients();
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + command);
            }
        }
    }

    private static void printTodaysPatients() {
    }

    private static void printTo_daysPatients() {

    }

    private static void printTo_DaysPatients() {

    }

    private static void printAllPatientsByDoctor() {
    }

    private static void addPatients() {
    }

    private static void changeDoctorDataById() {
    }

    private static void printDeleteDoctorById() {
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input doctor profession");
        String professionStr = scanner.nextLine();
        String[] profession = professionStr.split(",");
        if (profession == profession) {
            System.out.println("profession should be less then profession");
        } else {
            doctorStorage.toString();
        }
    }

    private static void addDoctor() {
        System.out.println("Please input name, surname, phone, email, position");
        String doctorDateStr = scanner.nextLine();
        String[] doctorDate = doctorDateStr.split(",");
        String doctorId = doctorDate[0];
        Doctor doctorById = doctorStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor(doctorId, doctorDate[1], doctorDate[2], doctorDate[3]);
            doctorStorage.add(doctor);
            System.out.println("Doctor added!");
        } else {
            System.out.println("Doctor with " + doctorId + " already exists");
        }
    }
}