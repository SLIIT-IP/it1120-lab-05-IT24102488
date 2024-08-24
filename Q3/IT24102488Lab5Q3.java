import java.util.Scanner;
    public class IT24102488Lab5Q3{
        public static void main (String[] args) {
             final double  room_charge = 48000.00;
            double pay;



            Scanner input = new Scanner(System.in);
            System.out.print("enter start date :");
            int s_date = input.nextInt();

            System.out.print("enter End date :");
            int e_date = input.nextInt();
            if (s_date < e_date) {

                if ((1<=s_date)&&(s_date<=31)) {

                    if ((1<=e_date)&&(e_date<=31)) {
                        int n_days = e_date - s_date;

                        if (3 > n_days) {


                            pay = room_charge ;

                        System.out.print("Total amount to  be paid :" + pay);
                        }


                        else if ((2< n_days)&&(n_days<5)) {

                                pay = room_charge * 90 / 100* n_days;
                            System.out.print("Total amount to  be paid :"+pay);
                            }

                        else if (n_days > 4) {

                                pay = room_charge * 90 / 100* n_days;
                            System.out.print("Total amount to  be paid :"+pay);
                            }



                            }else{
                        System.out.print("ERROR :  days must be between 1 and 31 ");}

                }
                else {
                    System.out.print("ERROR :  days must be between 1 and 31 ");}


            }
            else {
                System.out.print("ERROR:Start date must be less than End date ");
            }
    }
    }
