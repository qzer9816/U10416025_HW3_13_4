import java.util.*;
  
public class MyCalendar{
  static MyCalendar calendar = new MyCalendar();
  
  public static void main(String[] args){
    int month = calendar.get(MyCalendar.Month) + 1;
    int year = calendar.get(Mycalendar.Year);
    
    //if user input error month or year
    if(args.length > 2){
      System.out.print("only can input month and year");
    }
    //if user input the true month and year
    else if(args.length == 2){
      year = Integar.parseInt(args[1]);
      month = Integar.parseInt(args[0]);
      
      calendar.set(Calendar.Year, year);
      calendar.set(Calendar.Month, month - 1);
    }
    //if the user only input month
    else if(args.length == 1){
      month = Integar.parseInt(args[0]);
      
      calendar.set(Calendar.Month, month - 1);
    }
    //the first day of month is 1
    calendar.set(Calendar.Date, 1);
    printMonth(year , month);
  }
  
  static void printMonth(int year , int month){
    //get the first day of the week in the month
    int startDay = getStartDay();
    //get number of days in the month
    int DaysNumber = calendar.daysInMonth();
    //print title
    printMonthTitle(year , month);
    //print days of month
    printMonthBody(startDay , DaysNumber);
  }
  
  static int getStartDay(){
    return calendar.get(Calendar.DAY_OF_WEEK);
  }
  
  static void printMonthTitle(int year , int month){
    System.out.println("         "+calendar.getMonthName()+", "+year);
    System.out.println("-----------------------------");
    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
  }
  
  static void printMonthBody(int startDay , int DaysNumber){
    int i = 0;
    for (i = 0; i < startDay-1; i++)
      System.out.print("    ");

    for (i = 1; i <= numOfDaysInMonth; i++) {
      //beacuse the numbers less than 10 are smaller than 10 
      if (i < 10)
        System.out.print("   "+i);
      else
        System.out.print("  "+i);
      if ((i + startDay - 1) % 7 == 0)
        System.out.println();
    }
    System.out.println("");
  }
}
