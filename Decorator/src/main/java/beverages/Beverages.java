package beverages;

public interface Beverages {
	float getCost();
	String getDescription();
	int getSize();
	static int BIG = 1;
	static int MID = 2;
	static int SMALL = 3;
}
