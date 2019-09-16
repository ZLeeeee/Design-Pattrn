package beverages.seasoning;

import beverages.AbstractBeverages;
import beverages.Beverages;

public abstract class BeveragesDecorator implements Beverages {
	Beverages beverages;
	protected float cost;
	protected String name;
	public BeveragesDecorator(Beverages beverages){
		this.beverages = beverages;
		this.cost = beverages.getCost();
	}

	public BeveragesDecorator setSeasoning(Beverages seasoning){
		this.beverages = seasoning;
		return this;
	}
	@Override
	public float getCost() {
		return cost+(beverages==null?0:beverages.getCost());
	}

	@Override
	public String getDescription() {
		return name+(beverages==null?"":(" + "+beverages.getDescription()));
	}
	protected BeveragesDecorator setName (String name){
		this.name = name;
		return this;
	}
}
