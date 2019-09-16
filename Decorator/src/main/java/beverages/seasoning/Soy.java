package beverages.seasoning;

import beverages.Beverages;

public class Soy extends BeveragesDecorator {
	private Beverages beverages;
	public Soy(Beverages beverages) {
		super(beverages);
	}

	@Override
	public int getSize() {
		return beverages.getSize();
	}
	@Override
	public float getCost(){
		float i = 0;
		switch (beverages.getSize()){
			case Beverages.BIG :
				i = 10;
				break;
			case Beverages.SMALL :
				i = 15;
				break;
			case Beverages.MID :
				i = 20;
				break;
		}
		return i;
	}

}
