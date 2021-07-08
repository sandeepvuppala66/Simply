// IMPLEMENTATION OF OOPS 
// INHERITANCE
class Shape{
    int length;
    int breadth;
   void shape(int length, int breadth )
    {
        this.length=length;
        this.breadth=breadth;
    }
    
    void display()
    {
        System.out.println("Length: "+ length + " bredth: "+breadth);
    }

}
    
   class Rectangle extends Shape
   {
       
      
       void area()
       {
           System.out.println("the area is : "+ (length* breadth));
       }
   }

public class Xyz{
    public static void main( String [] args) {

        Shape obj =new Shape();
       obj.shape(8,5);

       // obj.display();
       Rectangle x = new Rectangle();
        x.area();

        }
}