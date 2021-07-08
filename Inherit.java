// Multiple Inheritance
interface Addition{
    void add(int a, int b);
    
    
}
interface Subtraction 
{
    void subtract (int a,int b);
}

class Calculate  implements Addition,Subtraction{
   public  void add(int a, int b){
        System.out.println(a+b);
    }
  

    
}
class Subbb extends Calculate // we cannot inherit the properties of implemented class through interface
{
    public  void subtract (int a,int b){
        System.out.println(a-b);

    }
}

public class Inherit  {
    public static void main( String [] args) {
 Subbb obj = new Subbb();
 obj.add(55,44);
 obj.subtract(10,5);
 
        
    }
}
