package HanoiTower;

import java.util.Stack;

public class Hanoi {

	static class Top {

		char index;
		Stack<Integer> stack;

		public Top(char index) {
			this.index = index;
			this.stack = new Stack<>();
		}
	}

	static Top t1;
	static Top t2;
	static Top t3;

	public static void move(int n, Top origin, Top target) {
		System.out.println("----------\n" + n + "을 " + origin.index + "에서 " + target.index + "으로");
		target.stack.push(origin.stack.pop());
		System.out.println(t1.stack + "/" + t2.stack + "/" + t3.stack);
	}

	public static void hanoi(int n, Top origin, Top spare, Top target) {
		if (n == 1) {
			move(n, origin, target);
		} else {
			hanoi(n - 1, origin, target, spare);
			move(n, origin, target);
			hanoi(n - 1, spare, origin, target);
		}
	}

	public static int[][] solution(int n) {
		t1 = new Top('A');
		t2 = new Top('B');
		t3 = new Top('C');

		for (int i = n; i >= 1; i--) {
			t1.stack.push(i);
		}

		System.out.println(t1.stack + "/" + t2.stack + "/" + t3.stack);
		hanoi(n, t1, t2, t3);
		return new int[2][2];
	}

	public static void main(String[] args) {
		solution(5);
	}
}

