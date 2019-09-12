package Inheritance;

class Bike
{
     void run()        //final method, so we cannot use override this method in child class
    //final void run()
    {
        System.out.println("Running...........");
    }
}
class Honda extends Bike
        {
            void run()      //there will be compile time error if class Bike's method is initialise by final key word
        {
            System.out.println("Started..............");
        }
        }
public class FinalMethod
{
    public static void main(String[] args)
    {
    }
}
