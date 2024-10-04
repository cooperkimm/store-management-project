public class InPerson extends Tutoring{

  // Instance variables
  private boolean isSports;

   /*
   * No argument Constructor
   * Sets the isSports to false
   */
  public InPerson(){
    isSports = false;
  }

  /*
   * Parameterized Constructor
   * Sets the name, hours, subject, finalPrice, and isSports 
   * to the specified name, hours, subject, finalPrice, and isSports
   */
  public InPerson(String name, int hours, String subject, double finalPrice, boolean isSports){
    super(name, hours, subject, finalPrice);
    this.isSports = isSports;
  }

  /*
   * Returns the isSports of the service
   */
  public boolean getIsSports(){
    return isSports;
  }

  /*
   * Sets the isSports of the service to the specified isSports
   */
  public void setIsSports(boolean isSports){
    this.isSports = isSports;
  }

  /*
   * toString method
   * Prints out the name, hours, subject, finalPrice, and isSports of this class
   */
  public String toString(){
    return "Name: " + name + "\nHours: " + hours + "\nSubject: " + subject + "\nFinal Price: " + finalPrice + "\nSports?: " + isSports;
  }
  
}