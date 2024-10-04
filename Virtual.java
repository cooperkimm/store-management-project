public class Virtual extends Tutoring{

  // Instance variables
  private String platform;

  /*
   * No argument Constructor
   * Sets the platform to ""
   */
  public Virtual(){
    platform = "";
  }

  /*
   * Parameterized Constructor
   * Sets the name, hours, subject, finalPrice, and platform 
   * to the specified name, hours, subject, finalPrice, and platform 
   */
  public Virtual(String name, int hours, String subject, double finalPrice, String platform){
    super(name, hours, subject, finalPrice);
    this.platform = platform;
  }

   /*
   * Returns the user's preferred platform
   */
  public String getPlatform(){
    return platform;
  }

  /*
   * Sets the user's preferred platform to the specified platform
   */
  public void setPlatform(String platform){
    this.platform = platform; 
  }

  /*
   * toString method
   * Prints out the name, hours, subject, finalPrice, and platform of this class
   */
  public String toString(){
    return "Name: " + name + "\nHours: " + hours + "\nSubject: " + subject + "\nFinal Price: " + finalPrice + "\nPlatform: " + platform;
  }
  
}