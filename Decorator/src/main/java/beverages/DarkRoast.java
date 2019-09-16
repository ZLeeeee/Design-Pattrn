package beverages;

import beverages.Beverages;

public class DarkRoast implements Beverages {

	private int size;
	public DarkRoast(){

	}
	public DarkRoast setSize(int size){
		this.size = size;
		return this;
	}

	@Override
	public float getCost() {
		return 0;
	}

	@Override
	public String getDescription() {
		return "DarkRoast";
	}

	@Override
	public int getSize() {
		return 0;
	}
}
