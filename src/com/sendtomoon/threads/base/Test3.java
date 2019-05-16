package com.sendtomoon.threads.base;

/**
 * 3.匿名内部类的写法
 */
public class Test3 {
	public static void main(String[] args) {
		// 方式1：相当于继承了Thread类，作为子类重写run()实现
		new Thread() {
			public void run() {
				System.out.println("匿名内部类创建线程方式1...");
			};
		}.start();

		// 方式2:实现Runnable,Runnable作为匿名内部类
		new Thread(new Runnable() {
			public void run() {
				System.out.println("匿名内部类创建线程方式2...");
			}
		}).start();
	}
}
