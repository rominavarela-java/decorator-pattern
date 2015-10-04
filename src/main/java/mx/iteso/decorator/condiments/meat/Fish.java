package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Fish extends CondimentsDecorator {
    Taco taco;

    public Fish(Taco taco) throws IllegalArgumentException {
    	if( taco.getSize()== Size.regular || taco.getSize()== Size.mega)
    		this.taco = taco;
    	else
    		throw new IllegalArgumentException("illegal fish taco size");
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
        return  5 + taco.getSize().ordinal() + taco.cost();
    }

	@Override
	public Size getSize() {
		return this.taco.getSize();
	}

}