class Pickle {
    public void taste() {
        System.out.println("Sweet");
    }
}

class AnonymousInnerClass {
    public static void main(String[] args) {
        Pickle p = new Pickle();
        p.taste();
        Pickle p1 = new Pickle() {
            public void taste() {
                System.out.println("Spicy");
            }
        };
        p1.taste();
    }
}
