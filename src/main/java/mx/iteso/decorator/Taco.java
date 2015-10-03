package mx.iteso.decorator;

public abstract class Taco {
    
	protected String description;
	protected Size size;
    
    public abstract double cost();
    
    public enum Size {
    	mini, regular, mega
    }
    
    //getters and setters
    public abstract String getDescription();
    public abstract Size getSize();
}
