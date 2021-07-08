
public class New {
    public static void main(String args[]) {
        School1 obj1=new School1();
        School2 obj2=new School2();
        obj2.check();
    }
}
class School1{
   public int marks;
   School1()
   {
       marks=200;
   }
}
class School2 extends School1{
    
    public void check()
    {
          System.out.println(marks);

    }
}

