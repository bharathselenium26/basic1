package slokam;

import java.util.ArrayList;

public class Example {

	public void abc() {

		ArrayList<Car> batch31 = new ArrayList<Car>();

		BMW bm = new BMW();
		Polo p = new Polo();
		Dzire d = new Dzire();
		Polo p2 = new Polo();
		batch31.add(bm);
		batch31.add(p);
		batch31.add(d);
		batch31.add(p2);
		int s = batch31.size();
		Car e = batch31.get(0);
	
		for(int i = 0; i<s;i++) {
			Car c = batch31.get(i);

			c.breaks();
			c.wheels();
			c.steering();
			c.engine();
		}
		
	}

	public static void main(String[] args) {
		Example ex = new Example();
		ex.abc();
	}
}
