package org.pub.whitebox;

public class SimpleGraph {
	private SimpleGraph() {
	}

	public static int simpleFunction(int a, int b, int c) {
		if (a == 354) {
			if (b > c) {
				a = b;
			} else {
				a = c;
			}
		}
		return a;
	}
}
