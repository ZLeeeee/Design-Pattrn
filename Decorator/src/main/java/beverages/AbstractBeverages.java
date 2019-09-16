package beverages;



public abstract class AbstractBeverages implements Beverages {
	protected Beverages beverages;
	protected String name;
	protected float cost;
	public AbstractBeverages(String name,float cost){
		this.name = name;
		this.cost = cost;
	}
	public AbstractBeverages setBeverages(Beverages beverages) {
		this.beverages = beverages;
		return this;
	}

	@Override
	public float getCost() {
		return cost+(beverages==null?0:beverages.getCost());
	}

	@Override
	public String getDescription() {
		return "one "+(beverages==null?"":(" + "+beverages.getDescription()));
	}
}
