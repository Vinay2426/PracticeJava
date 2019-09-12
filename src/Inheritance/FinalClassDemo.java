package Inheritance;

class Bike1     //if this class is declared final then we can not extend into child class
// final class Bike1
{
    int speed = 40;
    void run()
    {
        System.out.println(speed);
    }
}
class Honda1 extends Bike1      //there will be compile time error if 'class Bike1' has been declared 'final'
{

}
public class FinalClassDemo
{
    public static void main(String[] args)
    {
    }
}
