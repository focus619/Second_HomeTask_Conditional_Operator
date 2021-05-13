public class Temperature {

    public static void main(String[] args) {

        int t = -22;

        if (t > -5){
            System.out.println("It`s warm");
        }
        else if (-5 > t && t > -20){
            System.out.println("Normal temperature");
        }
        else if (-20 >= t){
            System.out.println("It`s cold");
        }
        else
            System.out.println("Pls enter correct temperature");
    }
}
