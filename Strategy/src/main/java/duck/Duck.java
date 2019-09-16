package duck;

import duck.behavior.FlyBehavior;
import duck.behavior.QuackBehavior;

public abstract class Duck {
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	public Duck(){

	}
	public abstract void display();
	public void quack(){
		quackBehavior.quack();
	}
	public void fly(){
		flyBehavior.fly();
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public Duck setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
		return this;
	}
	public Duck setQuackBehavior(QuackBehavior quackBehavior){
		this.quackBehavior = quackBehavior;
		return this;
	}
}
