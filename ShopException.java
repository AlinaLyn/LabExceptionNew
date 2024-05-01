public class ShopException extends Exception {
    private String errorMessage;

    public ShopException(String errorMessage) {

        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {

        return errorMessage;
    }

}
