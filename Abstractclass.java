abstract class Mobile{

abstract void call();
abstract void camera();
abstract void Whatsapp();


}

abstract class Oneplus extends Mobile 
{

 void call(){
     System.out.println("Calling");

    }
    void camera()
    {
        System.out.println("64 Mega Pixel");
    }
   
}
class Iphone extends Oneplus
{
    void Whatsapp()
    {
        System.out.println("Texting");
    }
}
public class Abstractclass {
    public static void main(String [] args) {
        Iphone obj =  new Iphone();
        obj.camera();
        obj.Whatsapp();
        obj.call();
    }
}
