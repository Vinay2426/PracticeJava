public class ThisKeyword
{                               //will learn here how to use This keyword
    int a, b;                   //instance variables or class variables

    void getValues(int x, int y)    //method variables / external variables
    {
        a = x;
        b = y;                      //this keywords are belongs to class (here exm; a and b)
    }                               //if you want to use this key word in method then use it this.a, this.b, if you are using same word under the method ex. a = a, b = b
                                    //you can use this keywords in constructor as well
    void printValues()
    {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args)
    {
        ThisKeyword thisKeyword = new ThisKeyword();
        thisKeyword.getValues(10, 20);
        thisKeyword.printValues();
    }
}