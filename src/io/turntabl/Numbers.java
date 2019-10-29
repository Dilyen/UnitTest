package io.turntabl;

public class Numbers {
    public static int sum(int a, int b){
        return a + b;
    }

    public static boolean isPositive(int a){
        if(a <= 0){
            return true;
        }else {
            return false;
        }
    }
   public static boolean isNegative(int a){
        if(a <= 0){
            return true;
        }else {
            return false;
        }
    }
    public static boolean isEvenAndGreaterThanZero(int a){
        if((a > 0) && (a % 2 == 0)){
            return true;
        }
        else return false;
    }


    public static boolean isALeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 4 == 0) {
                    System.out.println("leap year");
                    return true;
                } else {
                    System.out.println("not leap year");
                    return false;
                }
            } else {
                System.out.println("leap year");
                return false;
            }
        } else {
            System.out.println("not leap year");
            return false;
        }
    }


}
