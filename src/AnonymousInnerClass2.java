interface Interf {
    void m1();

}

public class AnonymousInnerClass2 {
    public static void main(String[] args) {
   Interf interf=new Interf(){
       public void m1(){
           System.out.println("The inner class which implements the interface");
       }
   };
   interf.m1();
    }
}
