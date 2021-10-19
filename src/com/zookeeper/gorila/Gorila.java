package com.zookeeper.gorila;

import com.zookeeper1.Mammal;

public class Gorila extends Mammal {
	public Gorila(int energyLevel) {
		super(energyLevel);
	}
	public void throwSomething() {
		System.out.println("throwing peel bananas");
		energyLevel -= 5;
	}
	public void eatBanana() {
		System.out.println("eating bananas");
		energyLevel += 10;
	}
	public void climb() {
		System.out.println("climbing Three");
		energyLevel -= 10;
	}
}
