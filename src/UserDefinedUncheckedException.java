//This is my userDefined Exception which is extending an unchecked exception no arg constructor
class TooOldException extends RuntimeException {
    TooOldException() {
        super();
    }
}

////This is my userDefined Exception which is extending an unchecked exception String arg constructor
/// Exception in thread "main" TooYoungException: Age too young
/// 	at UserDefinedUncheckedException.main(UserDefinedUncheckedException.java:23)
/// This message will be shown for string arg constructor
/// TooYoungException->RuntimeException->Exception->Throwable
/// Now Throwable class printStackTrace method will print the error
class TooYoungException extends RuntimeException {
    TooYoungException(String s) {
        super(s);
    }
}

public class UserDefinedUncheckedException {
    public static void main(String[] args) {
        int age = 12;
        if (age == 18) {
            System.out.println("You are of right age");
        } else if (age > 60) {
            throw new TooOldException();
        } else {
            throw new TooYoungException("Age too young");
        }

    }

}
