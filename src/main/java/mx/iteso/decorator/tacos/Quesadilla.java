package mx.iteso.decorator.tacos;

import mx.iteso.decorator.Taco;

public class Quesadilla extends Taco {
    public Quesadilla(Size s)
    {
    	this.description= "Quesadilla";
    	this.size= s;
    }

    @Override
    public double cost() {
        return 10.00;
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
