
public class PasswordValidator {

    public boolean isValid(String password) {
        if (password.length() >= 8) {
            return true;
        }
        return false;
    }
}