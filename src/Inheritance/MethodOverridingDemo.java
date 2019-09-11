package Inheritance;
//redefined/rewrite the same method in child classes; method definition should be same and body should be changed in every child classes
//Bank parent class is base of all the classes. all the child class are derived from parent/base class
class Bank
{
    double rateOfInterest()     //method called rateOfInterest
    {                           //interest rate always comes in double
        return 0;
    }
}
class SBI extends Bank
{
    double rateOfInterest()     //method definition should be changed in overriding
    {
        return 10.5;            //body of the method should be changed
    }
}
class ICICI extends Bank
{
    double rateOfInterest()
    {
        return 9.7;
    }
}
class AXIS extends Bank
{
    double rateOfInterest()
    {
        return 8.5;
    }
}
public class MethodOverridingDemo
{
    public static void main(String[] args)
    {
        SBI sbi = new SBI();                //SBI is extends of Bank but new interest rate will override it
        System.out.println(sbi.rateOfInterest());

        ICICI icici = new ICICI();
        System.out.println(icici.rateOfInterest());

        AXIS axis = new AXIS();
        System.out.println(axis.rateOfInterest());
    }
}