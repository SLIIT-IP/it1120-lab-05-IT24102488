import java.util.Scanner;

public class IT24102488Lab5Q1{
    public static void main(String[] args) {
        int num1;
        int num2;
        int num3;
        double high;
        double low;



    Scanner input=new Scanner(System.in);
        System.out.print("Enter the first inteager");
        num1=input.nextInt();

        System.out.print("Enter the first inteager");
        num2=input.nextInt();

        System.out.print("Enter the first inteager");
        num3=input.nextInt();

        System.out.println("User enterd numbers are : "+num1+" "+num2+" "+num3);
         if (num1>num2){
             high=num1;
             low=num2;
         }
         else{
             high=num2;
              low=num1 ;

             }
        if (num2>num3){
            high=high;
            low=num3;
        }
        else{
        high = num3;
        low= low;
        }

       System.out.println("Smallest number :"+ low);
        System.out.println("highest number :"+ high);





}
}