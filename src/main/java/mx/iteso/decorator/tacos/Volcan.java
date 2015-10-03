package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Volcan extends Taco {
    public Volcan(Size s) throws IllegalArgumentException {
    	if( s != Size.regular )
    		throw new IllegalArgumentException("illegal volcanoe size");
    	
    	this.description= "Volcan";
    	this.size= s;
    }

    @Override
    public double cost() throws IllegalArgumentException
    {
    	return 12.00;
    }

    @Override
	public String getDescription() {
		return this.description + " " + this.size;
	}

	@Override
	public Size getSize() {
		return this.size;
	}
}
