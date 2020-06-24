package tests;

import com.app.IPAddressValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPAddressValidatorTest {

    @Test
    public void testIpAddressValidation(){
        IPAddressValidator validator = new IPAddressValidator();
        assertTrue(validator.validate("127.0.0.1"));
        assertTrue(validator.validate("192.168.1.0"));
        assertTrue(validator.validate("192.168.0.1"));
        assertTrue(validator.validate("10.10.10.1"));
        assertTrue(validator.validate("10.0.0.2"));

        assertFalse(validator.validate("010.0.0.1"));
        assertFalse(validator.validate("192.16.00.1"));
        assertFalse(validator.validate("122.168.1A.0"));
        assertFalse(validator.validate("15%.0.0.0"));
        assertFalse(validator.validate(".0.0.10"));
    }
}