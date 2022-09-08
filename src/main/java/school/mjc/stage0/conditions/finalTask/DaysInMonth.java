package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
       boolean isLeapYear = ((year%4==0)&&((year%400==0)||(year%100!=0)));
        if(month==12 || month==1||month==3||month==4||month==7||month==10||month==8){
            System.out.println(31);
        }else if(month==5||month==6||month==9||month==11) {
            System.out.println(30);
        }
        else if (month==2){
            if(isLeapYear) System.out.println(29);
            else System.out.println(28);
        }else System.out.println("invalid date");

    }
}
