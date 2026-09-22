
import org.junit.Test;
import static org.junit.Assert.*;

public class PasswordValidatorTest {

    @Test
    void passwordWithLessThanEightCharactersIsInvalid() {

    PasswordValidator validator =
        new PasswordValidator();

    assertFalse(validator.isValid("abcdefg"));
    }

    @Test
    void passwordMustContainAnUppercaseLetter() {

    PasswordValidator validator =
        new PasswordValidator();

    assertFalse(validator.isValid("abcdefgh"));
    }


}
