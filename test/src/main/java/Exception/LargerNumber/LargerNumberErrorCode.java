package Exception.LargerNumber;

public enum LargerNumberErrorCode {
    ARRAY_IS_SHORT("В массиве должно быть больше элементов");

    private String errorString;

    LargerNumberErrorCode (String exText) {
        errorString = exText;
    }

    public String getErrorString() {
        return errorString;
    }
}
