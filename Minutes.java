class Minutes extends ConsoleProgram {

  /**
  * this code lets you enter a number of minutes, then will calculate the number of days, hours and minutes
  * @author:n.judd
  */
  
  public void run() {
    // declare variables
    double dblM;
    double dblDay;
    double dblHour;
    double dblMin;

    // receive input
    dblM = readDouble("Input an amount of minutes: ");

    // calculate output
    dblDay = Math.floor(dblM / 1440);
    dblHour = Math.floor(((dblM / 1440) - dblDay) * 24);
    dblMin = ((((dblM / 1440) - dblDay) * 24) - dblHour) * 60;

    // output
    System.out.println(dblM + " minutes equals " + dblDay + " day(s), " + dblHour + " hour(s), and " + dblMin + " minute(s)");
  }
}