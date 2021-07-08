
class Super1{
     
    public static void display()
    {
        System.out.println("Super class");
    }
}
class Derived1 extends Super{
   
   public static void display(){
       System.out.println("base class");

    }

}


public class Methodhiding {
public static void main(String [] args) {
   Super obj = new Derived();
   obj.display();
   Derived obj1 = new Derived();
   obj1.display();
   Super obj3 = new Super();
   obj3.display();
   
}

}


