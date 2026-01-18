public class StringConcat {
    public static void main(String[] args) {
//        String s1=new String("CSE1");
//        System.out.println(s1);
//        s1.concat("CSE2");
//
//        System.out.println(s1);

        StringBuffer s1 = new StringBuffer("CSE1");
        System.out.println(s1);//CSE1
        s1.append("CSE2");

        System.out.println(s1);//CSE1CSE2
    }


}

//As string is immutable the value of s1 does not change when concat
//s1.concat("CSE2");
//this is a method call,it is executed at run time
//Due to the method call when in runtime if any changes occur with that changes one new object will be created
//so until and unless we assign s1= s1.concat("CSE2");
//A new object will be created and assigned s1.concat("CSE2")
//so the value of s1 will not be changed in that case

//StringBuffer sb=new StringBuffer("CSE");
//StringBuffer class has append() method which do same job as concat for String
//StringBuffer is modifiable ,it is mutable