package com.multiThreading;

public class OddEvenNumberGenerateByThreads implements Runnable {
	static int count = 0;
	Object object;

	public OddEvenNumberGenerateByThreads(Object object) {
		this.object = object;
	}

	@Override
	public void run() {
		while (count <= 10) {
			if (count % 2 == 0 && Thread.currentThread().getName().equals("even")) {
				synchronized (object) {
					System.out.println("Thread Name:" + Thread.currentThread().getName() + ": " + count);
					count++;
					try {
						object.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
			if (count % 2 != 0 && Thread.currentThread().getName().equals("odd")) {
				synchronized (object) {
					System.out.println("Thread Name:" + Thread.currentThread().getName() + ": " + count);
					count++;
					object.notify();

				}

			}
		}
	}

	public static void main(String[] args) {
		Object threadcollection = new Object();
		Runnable t1 = new OddEvenNumberGenerateByThreads(threadcollection);
		Runnable t2 = new OddEvenNumberGenerateByThreads(threadcollection);

		new Thread(t1, "odd").start();
		new Thread(t2, "even").start();

	}

}
