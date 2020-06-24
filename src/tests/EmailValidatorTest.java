package tests;

import com.app.EmailValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailValidatorTest {

    @Test
    public void testEmailValidation(){
        EmailValidator validator = new EmailValidator();
        assertTrue(validator.validate("user@domain.com"));
        assertTrue(validator.validate("very.common@example.com"));
        assertTrue(validator.validate("disposable.style.email.with+symbol@example.com"));
        assertTrue(validator.validate("other.email-with-hyphen@example.com"));
        assertTrue(validator.validate("fully-qualified-domain@example.com"));
        assertTrue(validator.validate("user.name+tag+sorting@example.com"));
        assertTrue(validator.validate("x@example.com"));
        assertTrue(validator.validate("example-indeed@strange-example.com"));
        assertTrue(validator.validate("admin@mailserver1"));
        assertTrue(validator.validate("example@s.example"));
        assertTrue(validator.validate("mailhost!username@example.org"));
        assertTrue(validator.validate("user%example.com@example.org"));

        assertFalse(validator.validate("@yahoo.com"));
        assertFalse(validator.validate("Abc.example.com"));
        assertFalse(validator.validate("A@b@c@example.com"));
        assertFalse(validator.validate("a\"b(c)d,e:f;g<h>i[j\\k]l@example.com"));
        assertFalse(validator.validate("just\"not\"right@example.com"));
        assertFalse(validator.validate("this is\"not\\allowed@example.com"));
        assertFalse(validator.validate("this\\ still\\\"not\\\\allowed@example.com"));
        assertFalse(validator.validate("1234567890123456789012345678901234567890123456789012345678901234+x@example.com"));
        assertFalse(validator.validate("i_like_underscore@but_its_not_allow_in _this_part.example.com"));
    }

}









