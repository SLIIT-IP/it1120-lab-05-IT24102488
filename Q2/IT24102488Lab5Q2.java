import java.util.Scanner;
    public class IT24102488Lab5Q2{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("enter the number of new members introduced ;");
            int member = input.nextInt();
            if (member >= 0) {

                switch (member) {
                    case 0:
                        System.out.println("No Prize");
                        break;
                    case 1:
                        System.out.println("Prize is a pen");
                        break;
                    case 2:
                        System.out.println("Prize is a Umbrella");
                        break;
                    case 3:
                        System.out.println("Prize is a bag");
                        break;
                    case 4:
                        System.out.println("Prize is a Traverling chair");
                        break;
                    case 5:
                        System.out.println("Prize is a headphone");
                    default:
                        System.out.println("Prize is a headphone");

                        break;
                }

            }
        }
    }