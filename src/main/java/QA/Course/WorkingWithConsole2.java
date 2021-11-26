package QA.Course;

public class WorkingWithConsole2
{
    public static void main(String [] args){


        weekDay(2);
       rectangle(2, 3);
    }
    public static void rectangle (int a, int b)
    {
        int Perimeter = 2*(a+b);
        System.out.println("The Perimeter is:" + Perimeter );
        int Area = a*b;
        System.out.println("The Area is:"  + Area);
    }














    public static void weekDay(int day)
    {
        switch (day){
            case 1:
                System.out.println(" You have selected 1. Day of the week is Monday.");
                break;
            case 2:
                System.out.println(" You have selected 2. Day of the week is Tuesday. ");
                break;
            case 3:
                System.out.println(" You have selected 3. Day of the week is Wednesday. ");
                break;
            case 4:
                System.out.println(" You have selected 4. Day of the week is Thursday. ");
                break;
            case 5:
                System.out.println(" You have selected 5. Day of the week is Friday. ");
                break;
            case 6:
                System.out.println(" You have selected 6. Day of the week is Saturday. ");
                break;
            case 7:
                System.out.println(" You have selected 7. Day of the week is Sunday. ");
                break;
            default:
                System.out.println(" Invalid weekday ");
                break;}




    }












}