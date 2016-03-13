import java.util.*;
  
public class MyCalendar{
  static MyCalendar calendar = new MyCalendar();
  
  public static void main(String[] args){
    int month = calendar.get(MyCalendar.Month) + 1;
    int year = calendar.get(Mycalendar.Year);
    
    //if user input error month or year
    if(args.length > 2){
      system.out.print("only can input month and year");
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
}
