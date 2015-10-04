package mx.iteso.decorator.condiments.meat;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Taco.Size;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {
	
    @Test
    public void testDescription(){
    	Taco taco = mock((Taco.class));
		when(taco.getDescription()).thenReturn("Any taco");
        when(taco.getSize()).thenReturn(Size.regular);
        
        Taco decorator = new Fish(taco);
        Assert.assertTrue(decorator.getDescription().contentEquals("Any taco de pescado"));
    }
    
    @Test
    public void testSize(){
    	for(Size size: Size.values())
    	{
    		Taco taco = mock((Taco.class));
            when(taco.getSize()).thenReturn(size);
            
            Taco decorator= null;
            Exception exception= null;
    		try
        	{
        		decorator = new Fish(taco);
        	}
        	catch(Exception ex)
        	{
        		exception= ex;
        	}
    		
    		if( size==Size.regular || size==Size.mega)
    			Assert.assertTrue(decorator.getSize() == size );
    		else
    			Assert.assertTrue(exception.getMessage().contentEquals("illegal fish taco size"));
    	}
    }
    
    @Test
    public void testCost(){
    	for(Size size: Size.values())
    		if( size==Size.regular || size==Size.mega)
	    	{
    			Taco taco = mock((Taco.class));
        		double cost= Math.random();
        		
        		when(taco.cost()).thenReturn(cost);
                when(taco.getSize()).thenReturn(size);
	            
	            Taco decorator= new Fish(taco);
	            
	            Assert.assertTrue(decorator.cost() == cost + 5.00 + size.ordinal() );
	    	}
    }
}
