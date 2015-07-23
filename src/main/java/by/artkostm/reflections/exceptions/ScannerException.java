package by.artkostm.reflections.exceptions;

public class ScannerException extends BaseException
{
    public enum ScannerType
    {
        PACKAGE;
    }

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public ScannerException()
    {
        super();
        // TODO Auto-generated constructor stub
    }

    public ScannerException(String message, Throwable cause, 
        boolean enableSuppression, boolean writableStackTrace, ScannerType type)
    {
        super(message + " Scanner type: " + type.name(), cause, enableSuppression, writableStackTrace);
    }

    public ScannerException(String message, Throwable cause,
        ScannerType type)
    {
        super(message + " Scanner type: " + type.name(), cause);
        // TODO Auto-generated constructor stub
    }

    public ScannerException(String message, ScannerType type)
    {
        super(message + " Scanner type: " + type.name());
        // TODO Auto-generated constructor stub
    }

    public ScannerException(Throwable cause)
    {
        super(cause);
        // TODO Auto-generated constructor stub
    }
    
    

}
