 class StringTest {
     public static void main(String[] args) {
         //Empty String
         String s1=new String();
         System.out.println(s1);

         String s2=new String("CSE");
         System.out.println(s2);

         String s="CSE";

         //new keyword will always create a new object in the heap memory,this will have a reference variable
         //But the reference variable will be stored in the stack memory as local variables for a method always stays in the stack memory
         //Implicitly it will also create a string object which will stay in SCP(String constant pool),but it will not have any reference variable attached to it
         //But in String s="CSE", only string object will be created in hEap memory,with the reference variable s.
     }
}
