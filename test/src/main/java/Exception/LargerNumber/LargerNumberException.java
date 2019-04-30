package Exception.LargerNumber;

public class LargerNumberException extends Exception {

    private LargerNumberErrorCode largerNumberErrorCode;

    public LargerNumberException(LargerNumberErrorCode colorErrorCode) {
        super();
        this.largerNumberErrorCode = colorErrorCode;
    }

    public LargerNumberErrorCode getErrorCode (){
        return largerNumberErrorCode;
    }
}