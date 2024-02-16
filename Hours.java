class Hours extends ConsoleProgram {

  /**
  * this code lets you enter a number of hours, and that converts it to days and hour
  * @author:n.judd
  */
  
  public void run() {
    // declare variables
    double dblHours;
    double dblTotDays;
    double dblTotHours;

    // receive input
    dblHours = readDouble("Imput a number of hours: ");

    // calculate output
    dblTotDays = Math.floor(dblHours / 24);
    dblTotHours = ((dblHours / 24) - dblTotDays) * 24;

    // output
    System.out.println(dblHours + " hours equals " + dblTotDays + " day(s) and " + dblTotHours + " hour(s)");
    
  }
}