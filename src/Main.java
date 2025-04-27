public class Main {
    public static void main(String[] args) {
        System.out.println("Havlayan Köpek");
        System.out.println(shouldWakeUp(true, 1) ? "true" : "false");
        System.out.println(shouldWakeUp(false, 2) ? "true" : "false");
        System.out.println(shouldWakeUp(true, 8) ? "true" : "false");
        System.out.println(shouldWakeUp(true, -1) ? "true" : "false");
        System.out.println("Yaş Tespiti");
        System.out.println(hasTeen(9, 99, 19) ? "true" : "false");
        System.out.println(hasTeen(9, 99, 19) ? "true" : "false");
        System.out.println(hasTeen(22, 23, 34) ? "true" : "false");
        System.out.println("Alan Hesaplama");
        System.out.println(area(5.0, 4.0));
        System.out.println(area(-1.0, 4.0));
    }

    private static boolean shouldWakeUp(boolean isBarking, int hours) {
        if(hours < 0 || hours > 23){
            return false;
        }
        if(hours > 8 && hours < 20){
            return true;
        }
        if(isBarking && hours > 0 && hours < 8){
            return true;
        }
        return false;
    }

    private static boolean hasTeen(int num1, int num2, int num3){
        if(num1 >= 13 && num1 <= 19){
            return true;
        }
        if(num2 >= 13 && num2 <= 19){
            return true;
        }
        if(num3 >= 13 && num3 <= 19){
            return true;
        }
        return false;
    }

    public static double area(double area1, double area2){
        if(area1 < 0 || area2 < 0){
            return -1;
        }
        return area1 * area2;
    }
}
