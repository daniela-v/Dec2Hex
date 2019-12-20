import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class Dec2HexTest{  
    
    @Test
    public void test(){
        assertTrue(Dec2Hex.convertDec2Hex(444).equals("1BC"));
        assertTrue(Dec2Hex.convertDec2Hex(5514).equals("158A"));
        assertTrue(Dec2Hex.convertDec2Hex(4192).equals("1060"));
        assertTrue(Dec2Hex.convertDec2Hex(84).equals("54"));
        System.out.println("Test successful");
        } 
  }