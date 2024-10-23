
class A 
{
    public class B
    {
        void show()
        {
            System.out.println("In B");
        }
    }
}


public class Test {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj1 = obj.new B();
        obj1.show();
       }
}
