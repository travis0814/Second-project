package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import main.MyLabA;

class LabAtest {
	MyLabA myLabA;
 
	@BeforeEach
	void init() {
		 myLabA = new MyLabA();
	}
	@Test
	void addTest() {
		int expected = 5;
		int actual = myLabA.add(3,2);
	  assertEquals(actual, expected);
	}
	
	@Test
	void subtest() {
	assertEquals(myLabA.subtract(12,6),6,"Expected 5");
	}

    @Test
    void multTest() {
    	assertEquals(myLabA.multiply(6,6),36, "Expected 36");
    }
    @Test
    void divtest() {
    	assertEquals(myLabA.divide(40,2),20D,"Expected 20");
    }
    @Test
    void cirtest() {
    	assertEquals(myLabA.circumference(4),Math.PI*4,"Expected 4 pi");
    }

}

    
	
	
	
	
		
	
	
	


