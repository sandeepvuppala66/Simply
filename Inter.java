
interface Mobile1{

    public  void call();
     public void camera();
     public void Whatsapp();
    
    
    }
    
     class Oneplus1 implements Mobile1 
    {
    
     public void call(){
         System.out.println("Calling");
    
        }
        public void camera()
        {
            System.out.println("64 Mega Pixel");
        }
        public void Whatsapp()
        {
            System.out.println("Texting");
        }
       
    }
   
    public class Inter {
        public static void main(String [] args) {
            Oneplus1 obj =  new Oneplus1();
            obj.camera();
            obj.Whatsapp();
            obj.call();
        }
    }
    