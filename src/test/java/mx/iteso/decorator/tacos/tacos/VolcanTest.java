package mx.iteso.decorator.tacos.tacos;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Taco.Size;
import mx.iteso.decorator.tacos.Volcan;

import org.junit.Assert;
import org.junit.Test;

public class VolcanTest {
	
    @Test
    public void testSize() {
    	for(Size size: Size.values())
    	{
    		Taco taco= null;
    		Exception exception= null;
    		
    		try
    		{
				taco= new Volcan(size);
			}
    		catch (Exception ex)
    		{
				exception= ex;
			}
    		
    		if(size == Size.regular)
    			Assert.assertTrue(taco.getSize() == size );
    		else
    			Assert.assertTrue(exception.getMessage().contains("illegal volcanoe size"));
    	}
    	
    	
    }
    
    @Test
    public void testCost() {
    	Taco regular = new Volcan(Size.regular);
    	Assert.assertTrue(12.00 == regular.cost());
    }
    
    @Test
    public void testDescriptionContainsSize() {
    	Taco regular = new Volcan(Size.regular);
    	Assert.assertTrue(regular.getDescription().contains(""+regular.getSize()));
    }
    
    @Test
    public void testDescriptionContainsType() {
    	Taco regular = new Volcan(Size.regular);
    	Assert.assertTrue(regular.getDescription().contains("Volcan"));
    }
}
