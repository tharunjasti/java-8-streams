package java.com.java.telsukoLearning;


import org.junit.Before;
import org.junit.Test;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.junit.Assert.assertFalse;

public class TestJunit1 {

    private static Validator validator;

    @Before
    public void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void testContactSuccess() {
        // I'd name the test to something like
        // invalidEmailShouldFailValidation()

        Contact contact = new Contact();
        contact.setEmail("Jackyahoo.com");
        contact.setName("Jack");
        Set<ConstraintViolation<Contact>> violations = validator.validate(contact);
        assertFalse(violations.isEmpty());
    }
}