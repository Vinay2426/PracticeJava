package Inheritance;

public class FinalVariable
{
    final int speed = 40;       //final variable, so can not change this value
                                //final keyword use for variable
    public static void main(String[] args)
    {
        FinalVariable finalVariable = new FinalVariable();
        //finalVariable.speed = 100;      //if we initial final key word to global variable it will give compile error here
        System.out.println(finalVariable.speed);

    }
}
