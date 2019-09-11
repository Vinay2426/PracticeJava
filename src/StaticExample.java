public class StaticExample      //static method and variables
{
    static int a = 10; //static variable
    int b = 20;         //non static variable

    static void m1()      //static method
    {
        System.out.println("this is m1 - static method");
    }

    void m2()              //non static method
    {
        System.out.println("this is - Non static method");
    }

    void m3()
    {
        System.out.println("this is m3 method -- non-static");
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }

    public static void main(String[] args)
    {
        //static methods can access only static stuff (directly). without creating an object
        System.out.println(a);
        m1();

        //we can call static variables and method in different class as well by using class name with it. without creating an object
        System.out.println(StaticExample.a);
        StaticExample.m1();
          
        //static methods can also access non-static stuff but through an object.
        StaticExample staticExample = new StaticExample();
        System.out.println(staticExample.b);    //non static variable through object
        staticExample.m2();

        //non static method can access both static & non-static stuff directly
        staticExample.m3();
    }
}