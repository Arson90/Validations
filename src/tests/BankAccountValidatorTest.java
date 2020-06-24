package tests;

import com.app.BankAccountValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountValidatorTest {

    @Test
    public void testBankAccountValidation(){
        BankAccountValidator validator = new BankAccountValidator();
        assertTrue(validator.validate("PL12345678901234567890123456"));
        assertTrue(validator.validate("PL12345678901234567890123456"));
        assertTrue(validator.validate("PL78988878901234567890127456"));
        assertTrue(validator.validate("PL12345678901454846460123456"));
        assertTrue(validator.validate("PL48456154849462317890123456"));

        assertFalse(validator.validate("PL123456789012345678901234"));
        assertFalse(validator.validate("PL1234567890123456789012345$"));
        assertFalse(validator.validate("PB12345678901234567890123456"));
        assertFalse(validator.validate("PL"));
        assertFalse(validator.validate("12345678901234567890123456"));
    }

}