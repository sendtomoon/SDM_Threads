package com.sendtomoon.threads.base;

import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 4.带返回值的写法
 */
public class Test4 implements Callable<String> {

	public String call() {
		return UUID.randomUUID().toString();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Test4 test4 = new Test4();
		FutureTask<String> task = new FutureTask<String>(test4);
		Thread t = new Thread(task);
		t.start();
		String result = task.get();
		System.err.println(result);
	}

}
