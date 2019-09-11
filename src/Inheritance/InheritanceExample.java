package Inheritance;

class A     //parent  class
{
    int a;
    void display()
    {
        System.out.println(a);
    }
}
class B extends A       //single level inheritance  //B is child class, A is parent class
{
    int b;
    void print()
    {
        System.out.println(b);
    }
}
class C extends B       //multilevel inheritance
{
    int c;
    void show()
    {
        System.out.println(c);
    }
}
public class InheritanceExample
{
    public static void main(String[] args)
    {
        A aobj = new A();
        aobj.a = 100;
        aobj.display();

        B bobj = new B();
        bobj.a=10;          //variable 'a' belongs to class A    coming through the class B which is extended to A as child class
        bobj.b=20;          //variable 'b' belongs to class B

        bobj.display();     // method A        you can access method as well
        bobj.print();       //method B

        C cobj = new C();
        cobj.a = 77;         //variable 'a' belongs to class A
        cobj.b = 88;        //variable 'b' belongs to class B
        cobj.c = 99;        //variable 'c' belongs to class C

        cobj.display();
        cobj.print();
        cobj.show();
    }
}