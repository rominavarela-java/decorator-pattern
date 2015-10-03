package mx.iteso;

import mx.iteso.decorator.Taco;
import mx.iteso.decorator.Taco.Size;
import mx.iteso.decorator.condiments.Cebolla;
import mx.iteso.decorator.condiments.Cilantro;
import mx.iteso.decorator.condiments.Queso;
import mx.iteso.decorator.condiments.TortillaHarina;
import mx.iteso.decorator.condiments.TortillaMaiz;
import mx.iteso.decorator.condiments.meat.Bistec;
import mx.iteso.decorator.condiments.meat.Chorizo;
import mx.iteso.decorator.condiments.meat.Shrimp;
import mx.iteso.decorator.tacos.Quesadilla;
import mx.iteso.decorator.tacos.TacoNormal;
import mx.iteso.decorator.tacos.Volcan;

public class TuTaco {
    public static void main(String[] args)
    {
    	System.out.println("\n--- TACOS ---");
    	for(Size size: Size.values())
    	{
    		System.out.println("\n--- "+size+" ---");
    		try
    		{
    			Taco t= new TacoNormal(size);
    			print(t);
    			
    			t= new Bistec(t);
    			t= new Cilantro(t);
    			t= new Cebolla(t);
    			
    			Taco t1= new TortillaMaiz(t);
    			print(t1);
    			
    			Taco t2= new TortillaHarina(t);
    			print(t2);
    		}
    		catch(Exception ex)
    		{
    			System.out.println(ex.getMessage());
    		}
    	}
    	
    	System.out.println("\n--- QUESADILLAS ---");
    	for(Size size: Size.values())
    	{
    		System.out.println("\n--- "+size+" ---");
    		try
    		{
    			Taco t= new Quesadilla(size);
    			t= new TortillaMaiz(t);
    			print(t);
    			
    			t= new Queso(t);
    			print(t);
    			
    			Taco t1= new Chorizo(t);
    			print(t1);
    			
    			Taco t2= new Shrimp(t);
    			print(t2);
    		}
    		catch(Exception ex)
    		{
    			System.out.println(ex.getMessage());
    		}
    	}
    	
    	System.out.println("\n--- VOLCANOES ---");
    	for(Size size: Size.values())
    	{
    		try
    		{
    			Taco t= new Volcan(size);
    			print(t);
    		}
    		catch(Exception ex)
    		{
    			System.out.println(ex.getMessage());
    		}
    	}
    				
    }
    
    public static void print(Taco taco) {
        System.out.println(taco.getDescription());
        System.out.println("$" + taco.cost() + " MXN");
    }
}
