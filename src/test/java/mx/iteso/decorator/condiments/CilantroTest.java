package mx.iteso.decorator.condiments;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Taco.Size;

import org.junit.Assert;
import org.junit.Test;

public class CilantroTest {
	
    @Test
    public void testDescription(){
    	Taco taco = mock((Taco.class));
        when(taco.getDescription()).thenReturn("Any taco");
        
        Taco decorator = new Cilantro(taco);
    	
    	Assert.assertTrue(decorator.getDescription().contentEquals("Any taco con cilantro"));
    }
    
    @Test
    public void testCost(){
    	Taco taco = mock((Taco.class));
    	double cost= Math.random();
    	when(taco.cost()).thenReturn(cost);
    	
    	Taco decorator = new Cilantro(taco);
    	
    	Assert.assertTrue(decorator.cost()==cost);
    }
    
    @Test
    public void testSize(){
    	
    	for(Size size: Size.values())
    	{
    		Taco taco = mock((Taco.class));
            when(taco.getSize()).thenReturn(size);
            
            Taco decorator = new Cilantro(taco);
            Assert.assertTrue(decorator.getSize()==size);
    	}
    }
}
