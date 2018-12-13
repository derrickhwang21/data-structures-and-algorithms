package multibracketvalidation;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    @Test
    public void testEmptyBracketString() {
        assertTrue(MultiBracketValidation.multiBracketValidation("no brackets"));

    }

    @Test
     public void testBalancedBrackets(){
        assertTrue( MultiBracketValidation.multiBracketValidation("{}"));
        assertTrue( MultiBracketValidation.multiBracketValidation("{}(){}"));
        assertTrue( MultiBracketValidation.multiBracketValidation("(){}[[]]"));
        assertTrue( MultiBracketValidation.multiBracketValidation("()[[Extra Characters]]"));
        assertTrue( MultiBracketValidation.multiBracketValidation("{}{Code}[Fellows](())"));

    }

    @Test
    public void testUnbalancedBrackets(){
        assertFalse( MultiBracketValidation.multiBracketValidation("[({}]"));
        assertFalse( MultiBracketValidation.multiBracketValidation("(]("));
        assertFalse( MultiBracketValidation.multiBracketValidation("{(})"));

    }







}