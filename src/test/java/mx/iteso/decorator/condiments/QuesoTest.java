package mx.iteso.decorator.condiments;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Taco.Size;

import org.junit.Assert;
import org.junit.Test;

public class QuesoTest {
	
    @Test
    public void testDescription(){
    	Taco taco = mock((Taco.class));
        when(taco.getDescription()).thenReturn("Any taco");
        
        Taco decorator = new Queso(taco);
    	
    	Assert.assertTrue(decorator.getDescription().contentEquals("Any taco con queso"));
    }
    
    @Test
    public void testCostAndSize(){
    	for(Size size: Size.values())
    	{
    		Taco taco = mock((Taco.class));
    		double cost= Math.random();
    		
    		when(taco.cost()).thenReturn(cost);
            when(taco.getSize()).thenReturn(size);
            
            Taco decorator = new Queso(taco);
            Assert.assertTrue(decorator.getSize()==size);
            Assert.assertTrue(decorator.cost() == cost + 2.00 + size.ordinal() );
    	}
    }
    
}
