package mx.iteso.decorator.condiments.meat;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Taco.Size;

import org.junit.Assert;
import org.junit.Test;

public class LenguaTest {
	
    @Test
    public void testDescription(){
    	Taco taco = mock((Taco.class));
		when(taco.getDescription()).thenReturn("Any taco");
        when(taco.getSize()).thenReturn(Size.regular);
        
        Taco decorator = new Lengua(taco);
        Assert.assertTrue(decorator.getDescription().contentEquals("Any taco de lengua"));
    }
    
    @Test
    public void testCost(){
    	for(Size size: Size.values())
    	{
			Taco taco = mock((Taco.class));
    		double cost= Math.random();
    		
    		when(taco.cost()).thenReturn(cost);
            when(taco.getSize()).thenReturn(size);
            
            Taco decorator= new Lengua(taco);
            
            Assert.assertTrue(decorator.cost() == cost + 2.00 + size.ordinal() );
    	}
    }
    
    @Test
    public void testSize(){
    	
    	for(Size size: Size.values())
    	{
    		Taco taco = mock((Taco.class));
            when(taco.getSize()).thenReturn(size);
            
            Taco decorator = new Lengua(taco);
            Assert.assertTrue(decorator.getSize()==size);
    	}
    }
}
