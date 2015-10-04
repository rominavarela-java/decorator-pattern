package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

public class Shrimp extends CondimentsDecorator {
    Taco taco;

    public Shrimp(Taco taco) throws IllegalArgumentException {
    	if( taco.getSize()== Size.regular || taco.getSize()== Size.mega)
    		this.taco = taco;
    	else
    		throw new IllegalArgumentException("illegal shrimp taco size");
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de camarón";
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