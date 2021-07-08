
public class Mh1 {
    public static void main(String args[]) {
        M.n1();
       N.n1();
       //creating object
       N obj=new N();
       obj.n1();

       N obj1=new M();
       obj1.n1();

    }
}
class N{
    int val=20;
    public static void n1() {
        System.out.println("iam from N");
    }
}
class M extends N{
    public static void n1() {
        System.out.println("iam from M");
       // System.out.println("super"+" "+super.val);

    }
       // System.out.println("super"+" "+super.val);

}