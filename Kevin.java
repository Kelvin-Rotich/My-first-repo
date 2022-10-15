import java.util.Scanner;

public class Kevin {
        public static void main(String[] args) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("please choose place of stay:\nA=Apartment\nD=Dormitory\nH=House");
            char placeofstaychosen = myObj. next().charAt(0);
            System.out.println();
            boolean A=true;
            boolean a=true;
            boolean Apartment=true;
            boolean apartment=true;
            boolean D=true;
            boolean d=true;
            boolean Dormitory=true;
            boolean dormitory=true;
            boolean H=true;
            boolean h=true;
            boolean House=true;
            boolean house=true;
            if(placeofstaychosen == 'A'|| placeofstaychosen =='a'||  apartment || Apartment )
            {
                System.out.println("Enter no of hrs you are at home for pet recommendation basing on your lifestyle :\n18 or more\n10 to 17\n8 to 9\n6 to 7\n0 to 5\nThis is time in hrs.");
                int hrs= myObj.nextInt();
                if(hrs>=10)
                {
                    System.out.println("Your recommended pet is Cat");
                }
                if(hrs<10)
                {
                    System.out.println("Your recommended pet is Harnster");
                }
                System.out.println("Stay safe with your pet.");
            }
            else if(placeofstaychosen =='H'|| placeofstaychosen =='h'|| house|| House)
            {
                System.out.println("Enter no of hrs you are at home for pet recommendation basing on your lifestyle:\n18 or more\n10 to 17\n8 to 9\n6 to 7\n0 to 5\nThis is time in hrs.");
                int hrs= myObj.nextInt();
                System.out.println();
                if(hrs>=18)
                {
                    System.out.println("Your recommended pet is a pot bellied pig");
                }
                if(hrs>8 && hrs<=17)
                {
                    System.out.println("Your recommended pet is a Dog");
                }
                if(hrs<=8)
                {
                    System.out.println("Your recommended pet is a snake");
                }
                System.out.println("Stay safe with your pet.");
            }
            else if(placeofstaychosen =='D'|| placeofstaychosen =='d' || dormitory|| Dormitory)
            {
                System.out.println("Enter no of hrs you are at home for pet recommendation basing on your lifestyle:\n18 or more\n10 to 17\n8 to 9\n6 to 7\n0 to 5\nThis is time in hrs.");
                int hrs= myObj.nextInt();
                System.out.println();
                if(hrs>6)
                {
                    System.out.println("Your recommended pet is a Fish");
                }
                if(hrs<=6)
                {
                    System.out.println("Your recommended pet is a AntFarm");
                }

                System.out.println("Stay safe with your pet.");
            }
        }
}