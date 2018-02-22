package org.yan.eevee;

public class T {
	public static Ball root = new Balls().mkBall(100);

	public static void main(String[] args) {
		root.swap();
	}
	
	static class Ball {
		int index;
		boolean isRed = false;
		Ball nextBall;

		@Override
		public String toString() {
			return (isRed ? 1 : 0) + "";
		}

		public void printBall() {
			Ball print = root;
			do {
				System.out.print(print);
			} while ((print = print.nextBall) != null);
			System.out.println();
		}

		void swap() {
			if(nextBall == null){
				printBall();
			}
			
			if (nextBall != null) {
				nextBall.swap();
			}
			
			isRed = !isRed;
			
			if(nextBall == null){
				printBall();
			}
			if (nextBall != null) {
				nextBall.swap();
			}
		}

	}

	static class Balls {
		Ball mkBall(int n) {
			Ball root = new Ball();
			root.index = 0;
			Ball preBall = root;
			for (int i = 1; i < n; i++) {
				Ball ball = new Ball();
				ball.index = i;
				preBall.nextBall = ball;
				preBall = ball;
			}
			return root;
		}
	}
}
