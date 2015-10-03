package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class TacoNormal extends Taco {
    public TacoNormal(Size s)
    {
    	this.description= "Taco normal";
    	this.size= s;
    }

    @Override
    public double cost() {
        return 8.00;
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
