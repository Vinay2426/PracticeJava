package Inheritance;

public class SuperKeywordPracticeAnimal     //if you use public before class it can be access anywhere. If you don't specify it will be default
{
    String colour = "White";    //this been used for; super can be used to invoke immediate parent class variable

    void eating()               //this been used for; super can be used to invoke immediate parent class method
    {
        System.out.println("Eating..............");
    }
    SuperKeywordPracticeAnimal()        //constructor; super() can be used to invoke immediate parent class constructor. super() is one type of method
    {
        System.out.println("Animal is created");
    }
}
class Dog extends SuperKeywordPracticeAnimal
{
    String colour = "Black";    //this been used for; super can be used to invoke immediate parent class variable

    void eating()           //this been used for; super can be used to invoke immediate parent class method
    {
        System.out.println("Barking............");

        super.eating();     //it will print immediate parent class's method
    }

    void display()
    {
        System.out.println(colour);         //here, colour will be override in most recent class even though parent class has White colour
        System.out.println(super.colour); //print colour of immediate class variable/value
    }

    Dog()           //for constructor
    {
        //super(); //invokes parent class constructor, immediate class method
        System.out.println("Dog is created");
    }
}