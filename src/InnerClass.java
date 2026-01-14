//class Outer {
//    public static void main(String[] args) {
//        Outer o = new Outer();
//Although main() is inside the outer class, it is static. A non-static inner class requires an instance of the outer class, so we must explicitly create an outer object inside main().
//        Outer.Inner inner = o.new Inner();
//        inner.m1();
//    }
//
//    class Inner {
//        public void m1() {
//            System.out.println("Method inside inner class");
//        }
//
//    }
//}
class Outer {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.m2();
    }

    public void m2() {
        System.out.println("Method inside outer class");
        Inner i = new Inner();
        //Here we could access the inner class like this because we could only access m2 through the outer class only so if we can come here
        //only throughjouter class so can also call the inner class directly
        //so in a way we are calling inner class through outer class only
        i.m1();
    }

    class Inner {
        public void m1() {
            System.out.println("Method inside inner class");
        }

    }


}
