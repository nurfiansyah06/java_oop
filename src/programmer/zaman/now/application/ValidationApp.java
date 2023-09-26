package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest("null", "rahasia");

        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("data valid");
        } catch (ValidationException | NullPointerException exception) {
            System.out.println("error data : " + exception.getMessage());
        } finally {
            System.out.println("selalu eksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("sukses");
    }
}
