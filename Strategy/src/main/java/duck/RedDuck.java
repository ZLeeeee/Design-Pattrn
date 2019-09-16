package duck;

import duck.behavior.*;

public class RedDuck extends Duck {
	public RedDuck() {

		FlyBehavior flyBehavior = new FlyNoWay();
		QuackBehavior quackBehavior = new MuteQuack();
		setFlyBehavior(flyBehavior);
		setQuackBehavior(quackBehavior);

	}

	@Override
	public void display() {
		System.out.println("I'm redDuck");
	}
}
