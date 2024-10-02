package it2e.basalo.ems;

import java.util.Scanner;



public class IT2EBASALOEMS {
    config conf = new config();
    
      public void addEvent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Event Date: ");
        String date = sc.nextLine();

        System.out.print("Event Time: ");
        String time = sc.nextLine();

        System.out.print("Event Location: ");
        String location = sc.nextLine();

        System.out.print("Event Description: ");
        String description = sc.nextLine();

        System.out.print("Number of Attendees: ");
        int numAttendees = sc.nextInt();
        sc.nextLine();

        System.out.print("Registration Status: ");
        String registrationStatus = sc.nextLine();

        String sql = "INSERT INTO event (e_name, date, time, location, description, n_attendees, r_status) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        conf.addRecord(sql, eventName, date, time, location, description, numAttendees, registrationStatus);
    }
     
       public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
           System.out.println("1.ADD EVENT");
           System.out.println("2.VIEW EVENT");
           System.out.println("3.DELETE EVENT");
           System.out.println("4.UPDATE EVENT");
           
           System.out.println("Enter action: ");
           int action = s.nextInt();
           
           switch(action){
                case 1:
                   IT2EBASALOEMS test = new IT2EBASALOEMS();
                   test.addEvent();
                break;
                   
                   
           }
    }
}
