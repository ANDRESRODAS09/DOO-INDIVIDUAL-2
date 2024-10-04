package co.edu.uco.crosscutting.unittesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import co.edu.uco.crosscutting.helpers.ObjectHelper;

class HelpersUnitTestCase {

    @Test
    void givenWantValidateIfObjectIsNullWhenObjectIsNullThenResultIsTrue() {
        // Arrange: initial Context
        String object = null;
        
        // Act
        boolean result = ObjectHelper.isNull(object); 
        
        // Assert
        assertTrue(result);
    }
    
    @Test
    void givenWantValidateIfObjectIsNullWhenObjectIsNotNullThenResultIsFalse() {
        // Arrange: initial Context
        String object = ""; 
        
        // Act: Execute action
        boolean result = ObjectHelper.isNull(object); 
        
        // Assert
        assertFalse(result);
    }
    
    @Test
    void givenWantValidateIfObjectIsNotNullWhenObjectIsNotNullThenReturnObject() {
        // Arrange: Initial Context
        String object = "Casa";
        String defaultValue = "Default";
        
        // Act: Execute action
        String result = ObjectHelper.getDefault(object, defaultValue);
        
        // Assert: Validate Result
        assertEquals(object, result);  
    }
    
    @Test
    void givenWantValidateIfObjectIsNullWhenObjectIsNullThenReturnDefaultValue() {
        // Arrange: Initial Context
        String object = null;
        String defaultValue = "Default";
        
        // Act: Execute action
        String result = ObjectHelper.getDefault(object, defaultValue);
        
        // Assert: Validate Result
        assertEquals(defaultValue, result);  
    }
}
