
package com.zookeeper.test;

import com.zookeeper.gorila.Gorila;

public class ZooKeeperTest {
	
    public static void main( String args[] ){

    Gorila Kangaroo = new Gorila(65);
	
    Kangaroo.displayEnergy();
    Kangaroo.throwSomething();
    Kangaroo.displayEnergy();
    Kangaroo.eatBanana();
    Kangaroo.displayEnergy();
    Kangaroo.climb();
    Kangaroo.displayEnergy();
    System.out.println("*============================*");

    }

	
}
