package Day16;

public class myProjectException extends Exception {   // this class extends the Exception class

    public myProjectException(String exceptionString)
    {
       super(exceptionString);   // Super keyword points the Exception class(parent)

    }
}
