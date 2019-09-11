package Inheritance;

public class TestingSuperKeyword
{
    public static void main(String[] args)
    {
        Dog dog = new Dog();
       // dog.display();     (1) // (for variable)it is child class but colour will be override in most recent class
                            // after super word has been used in dog class it will print the value/variable of immediate class

        //dog.eating();     (2)  //it will print dog class's method which is override of parent
                            // after super word has been used in dog class it will print the parent class's method

        //if you comment both of above methods then constructor method will be printed if there is constructor has been created in dog class
        //(3)
        // if you want to access immediate class's method than super() will be used
        // after usage of super() in class outcome has not any difference, internal approach is difference
    }
}
