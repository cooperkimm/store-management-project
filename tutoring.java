public class Tutoring {
  
  // Instance variables
  public String name;
  public int hours;
  public String subject;
  public double finalPrice = 16 * hours;

  /*
   * No argument Constructor
   * Sets the name to "", hours to 0, subject to "", and finalPrice to 0.00
   */
  public Tutoring() {
    name = "";
    hours = 0;
    subject = "";
    finalPrice = 0.00;
  }
  
  /*
   * Parameterized Constructor
   * Sets the name, hours, subject, and finalPrice to the specified name, hours, subject, and finalPrice
   */
  public Tutoring(String name, int hours, String subject, double finalPrice){
    this.name = name;
    this.hours = hours;
    this.subject = subject;
    this.finalPrice = finalPrice;
  }
  
  /*
   * Returns the name of the user
   */
  public String getName(){
    return name;
  }
  
  /*
   * Returns the number of hours that the user requests
   */
  public int getHours(){
    return hours;
  }
  
  /*
   * Returns the subject that the user requests
   */
  public String getSubject(){
    return subject;
  }
  
  /*
   * Returns the finalPrice of the service
   */
  public double getFinalPrice(){
    finalPrice = 16 * hours;
    return finalPrice;
  }
  
  /*
   * Sets the name of the user to the specified name
   */
  public void setName(String name){
    this.name = name;
  }
  
  /*
   * Sets the number of hours that the user requests to the specifed hours
   */
  public void setHours(int hours){
    this.hours = hours;
  }
  
  /*
   * Sets the subject that the user requests to the specified subject
   */
  public void setSubject(String subject){
    this.subject = subject;
  }
  
  /*
   * Sets the final price of the service to the specified final price
   */
  public void setFinalPrice(double finalPrice){
    this.finalPrice = finalPrice;
  }
  
  /*
   * toString method
   * Prints out the name, hours, subject, and finalPrice of this class
   */
  public String toString(){
    return "Name: " + name + "\nHours: " + hours + "\nSubject: " + subject + "\nFinal Price: " + finalPrice;
  }
}
