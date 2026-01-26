public class ExceptionHandling {

    //The method where the exception occurs,the method hands over the exception object to JVM
//    public static void main(String[] args) {
//        System.out.println(10/0);
//    }
    //when we as a programmer give the exception object to JVM
//    public static void main(String[] args) {
//        try {
//            throw new Throwable();
//        }catch(Throwable t){
//            System.out.println("Throwable exception is caught");
//        }
//   }


   //Throwing exception with string argument
   public static void main(String[] args){
      try{
          throw new CustomException("Custom");
      }catch(CustomException c){
         System.out.println("Caught");
         System.out.println(c); //Internally calls the toString() method
         System.out.println(c.getMessage());

      }
   }

}

//Extending Checked Exception
class CustomException extends Exception{
      CustomException(String s){
         super(s);
      }

}

