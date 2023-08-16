package _2_augest.easy_questions;

// https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion/problem
public class TimeConversion {


    public static void main(String[] args) {
        //String s = "07:05:45PM";
        String s = "06:40:03AM";
        System.out.println(timeConversion(s));
    }

    public static String timeConversion(String s) {
        // Write your code here
        String hours = "", mins = "", sec = "";

        if(s.contains("PM")){
            if(Integer.valueOf(s.substring(0, 2))==12)
                hours = String.valueOf(Integer.valueOf(s.substring(0, 2)));
            else hours = String.valueOf(Integer.valueOf(s.substring(0, 2)) +12);
            mins = s.substring(3, 5);
            sec = s.substring(6, 8);

            if(hours.length()==1) hours = "0"+hours;
            if(mins.length()==1) mins = "0" + mins;
            if(sec.length()==1) mins = "0"+ sec;
            return hours+":"+mins+":"+sec;
        }

        else {
            if(Integer.valueOf(s.substring(0, 2))<12)
                hours = String.valueOf(Integer.valueOf(s.substring(0, 2)));
            else hours = String.valueOf(Integer.valueOf(s.substring(0, 2)) -12);
            mins = s.substring(3, 5);
            sec = s.substring(6, 8);

            if(hours.length()==1) hours = "0"+hours;
            if(mins.length()==1) mins = "0" + mins;
            if(sec.length()==1) mins = "0"+ sec;
            return hours+":"+mins+":"+sec;
        }
    }
}
