package section03;

public class run01 {
    public static void main(String[] args) {


        int score = 50;

        if (score >= 90) {
            System.out.println("a");

        } else if (score >= 80 && score < 90) {

            System.out.println("b");
        }else if (score >= 70 && score < 80) {

            System.out.println("c");
        }else if (score >= 60 && score < 70) {
            System.out.println("d");

        }else{
            System.out.println("f");
        }


    }
}
