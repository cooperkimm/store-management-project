import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Instantiates three objects (student, classmate, peer)
    Tutoring student = new Tutoring("Jaden", 4, "Math", 64.00);
    InPerson classmate = new InPerson("Justin", 3, "English", 48.00, true);
    Virtual peer = new Virtual("Jeidam", 3, "History", 32.00, "Zoom");

    // Uses the toString method to print out information about the three objects
    System.out.println("---------------------------------------------------------");
    System.out.println(student);
    System.out.println("---------------------------------------------------------");
    System.out.println(classmate);
    System.out.println("---------------------------------------------------------");
    System.out.println(peer);
    System.out.println("---------------------------------------------------------");

    // Prints out a welcoming message
    System.out.println("Welcome to our tutoring service!" + "\nPlease answer the following questions! ");
    System.out.println("---------------------------------------------------------");

    Scanner input = new Scanner(System.in);

    // Prints out a question and allows the user to input information(name)
    System.out.println("What is your name?(name)");
    String userName = input.nextLine();

    // Prints out a question and allows the user to input information(hours)
    System.out.println("\nHow many hours do you need for tutoring?(number)");
    int userHours = input.nextInt();

    // Prints out a question and allows the user to input information(subject)
    System.out.println("\nWhat subject do you need for tutoring?(subject)");
    String userSubject = input.next();

    // Prints out a question and allows the user to input information(In person or virtual)
    System.out.println("\nWhere would you like our tutoring services?" + "\n 1. In person(1)" + "\n 2. Virtual(2)");
    int userServiceType = input.nextInt();

    // Sets the user's name, hours, and subject to the specified name, hours, and subject
    student.setName(userName);
    student.setHours(userHours);
    student.setSubject(userSubject);

    // if the user inputs a 1(in person)
    // the program asks if the user wants to play any sports
    // after, the program prints out all the information
     if(userServiceType == 1){
      System.out.println("\nDo you want to play any sports? (true/false)");
      boolean userIsSports = input.nextBoolean();
      classmate.setIsSports(userIsSports);
      System.out.println("---------------------------------------------------------");
      System.out.println("Name: " + student.getName());
      System.out.println("Hours: " + student.getHours());
      System.out.println("Subject: " + student.getSubject());
      System.out.println("Price: " + student.getFinalPrice());
      System.out.println("Sport: " + classmate.getIsSports());
      System.out.println("---------------------------------------------------------");
    }
     // if the user inputs a 2(virtual)
    // the program asks what platform they want 
    // after, the program prints out all the information
    if(userServiceType == 2){
      System.out.println("\nWhich Platform? (platform)");
      String userPlatform = input.next();
      peer.setPlatform(userPlatform);
      System.out.println("---------------------------------------------------------");
      System.out.println("Name: " + student.getName());
      System.out.println("Hours: " + student.getHours());
      System.out.println("Subject: " + student.getSubject());
      System.out.println("Price: " + student.getFinalPrice());
      System.out.println("Platform: " + peer.getPlatform());
      System.out.println("---------------------------------------------------------");
    }
    // if the user doesn't input 1 or 2
    // the program outputs that the input could not be verified
    if(userServiceType != 1 && userServiceType != 2){
      System.out.println("input could not be verified");
      input.close();
    }
  }
}