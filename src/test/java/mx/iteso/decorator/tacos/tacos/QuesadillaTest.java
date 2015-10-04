package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Taco.Size;
import mx.iteso.decorator.tacos.Quesadilla;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuesadillaTest {
	Taco mini;
    Taco regular;
    Taco mega;
    
    @Before
    public void setup() {
        mini = new Quesadilla(Size.mini);
        regular = new Quesadilla(Size.regular);
        mega = new Quesadilla(Size.mega);
    }
    
    @Test
    public void testCost() {
    	Assert.assertTrue(10.00 == mini.cost());
    	Assert.assertTrue(10.00 == regular.cost());
    	Assert.assertTrue(10.00 == mega.cost());
    }
    
    @Test
    public void testDescriptionContainsSize() {
    	Assert.assertTrue(mini.getDescription().contains(""+mini.getSize()));
    	Assert.assertTrue(regular.getDescription().contains(""+regular.getSize()));
    	Assert.assertTrue(mega.getDescription().contains(""+mega.getSize()));
    }
    
    @Test
    public void testDescriptionContainsType() {
    	Assert.assertTrue(mini.getDescription().contains("Quesadilla"));
    	Assert.assertTrue(regular.getDescription().contains("Quesadilla"));
    	Assert.assertTrue(mega.getDescription().contains("Quesadilla"));
    }
}
