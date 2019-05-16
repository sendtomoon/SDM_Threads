package com.sendtomoon.threads.base;

/**
 * 2.实现Runnable接口
 *
 */
public class Test2 implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Thread thread = Thread.currentThread();
		System.err.println("线程:" + thread.getId());
	}

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		Test1 t2 = new Test1();
		Test1 t3 = new Test1();
		Test1 t4 = new Test1();
		Test1 t5 = new Test1();
		Test1 t6 = new Test1();
		Test1 t7 = new Test1();
		Test1 t8 = new Test1();
		Test1 t9 = new Test1();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
	}

}
