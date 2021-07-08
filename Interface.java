interface Calculator{
    void add(int a, int b);
    void subtract (int a,int b);
    void mul(int a,int b);
    void div(int a,int b);
}
class Calcy implements Calculator{
   public void  add(int a, int b)  // methods should be public when inherited from interface
   {
        System.out.println(a+b);
    }   
    public void subtract (int a,int b){
        System.out.println(a-b);
    }

    public void mul(int a,int b){
        System.out.println(a*b);
    }
    public void div(int a,int b){
        System.out.println(a/b);
    }

}


public class Interface {

    public static void main( String []args) {
        Calcy obj = new Calcy();
        obj.add(5, 5);
        
    }
}
