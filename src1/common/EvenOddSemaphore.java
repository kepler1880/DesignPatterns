package common;

import java.util.concurrent.Semaphore;

public class EvenOddSemaphore {

	public static void main(String[] args) {
		SharedPrinterSemo sp = new SharedPrinterSemo();
		Thread odd = new Thread(new Odd(sp, 10), "Odd");
		Thread even = new Thread(new Even(sp, 10), "Even");
		odd.start();
		even.start();
	}
}

	class SharedPrinterSemo {
	
		private Semaphore semEven = new Semaphore(0);
		private Semaphore semOdd = new Semaphore(1);
	
		void printEvenNum(int num) {
			try {
				semEven.acquire();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println(Thread.currentThread().getName() + num);
			semOdd.release();
		}
	
		void printOddNum(int num) {
			try {
				semOdd.acquire();
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
			System.out.println(Thread.currentThread().getName() + num);
			semEven.release();
	
		}
	}

	class Even implements Runnable {
		private SharedPrinterSemo sp;
		private int max;
	
		// standard constructor
	
		public Even(SharedPrinterSemo sp, int i) {
			this.max=i;
			this.sp=sp;
		}

		@Override
		public void run() {
			for (int i = 2; i <= max; i = i + 2) {
				sp.printEvenNum(i);
			}
		}
	}
	
	class Odd implements Runnable {
		private SharedPrinterSemo sp;
		private int max;
	
		public Odd(SharedPrinterSemo sp, int i) {
			this.sp= sp;
			this.max=i;
		}

		// standard constructors
		@Override
		public void run() {
			for (int i = 1; i <= max; i = i + 2) {
				sp.printOddNum(i);
			}
		}
	}