import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

//int[] intArray = new int[]
public class Clock {
    public static void main(String[] args) {
        String[] days = {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};  //create a array using index to signify which day it is.
        Scanner sc = new Scanner(System.in);

        //get the starting day and time
        System.out.println("What is the current day and time (Day:hh:mm)? ");//look to change in the future to get day and time as sepperate strings
        String i_date = sc.nextLine();
        i_date = i_date.toLowerCase();
        String[] strt_date = i_date.split(":");

        //get the amount of day, hours, and minutes that you want to move ahead by.
        System.out.println("How far into the future do you wish to see (days:hours:minutes)?");
        String delta_time = sc.next();
        String[] d_time = delta_time.split(":");

        //take all input info and divide into vars.
        int i_day = Arrays.asList(days).indexOf(strt_date[0]);
        int i_hour = Integer.parseInt(strt_date[1]);
        int i_minute = Integer.parseInt(strt_date[2]);
        int d_days = Integer.parseInt(d_time[0]);
        int d_hours = Integer.parseInt(d_time[1]);
        int d_minutes = Integer.parseInt(d_time[2]); // adding 55 mins
        int o_day_index;
        int o_hour;
        int o_minute;

        //calculations
       o_minute = (i_minute + d_minutes) % 60;
       int ovrflow_hrs = (i_minute + d_minutes)/60;
       o_hour = (i_hour + d_hours + ovrflow_hrs)%24;
       int ovrflow_days = (i_hour + d_hours + ovrflow_hrs)/24;
       o_day_index = (i_day + d_days + ovrflow_days)%7;

//        day_index = day_index % 7;
//        int days_inc = hours / 24;
//        hours = hours % 24;
//        day_index += days_inc;
//        int hrs_added = minutes/60;
//        minutes = minutes % 60;
//        hours += hrs_added;

        System.out.printf("The time in %02d:%02d:%02d from %s is %s %02d:%02d\n",d_days,d_hours,d_minutes,i_date,days[o_day_index],o_hour,o_minute);
    }

}