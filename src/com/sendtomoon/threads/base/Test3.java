package com.sendtomoon.threads.base;

/**
 * 3.�����ڲ����д��
 */
public class Test3 {
	public static void main(String[] args) {
		// ��ʽ1���൱�ڼ̳���Thread�࣬��Ϊ������дrun()ʵ��
		new Thread() {
			public void run() {
				System.out.println("�����ڲ��ഴ���̷߳�ʽ1...");
			};
		}.start();

		// ��ʽ2:ʵ��Runnable,Runnable��Ϊ�����ڲ���
		new Thread(new Runnable() {
			public void run() {
				System.out.println("�����ڲ��ഴ���̷߳�ʽ2...");
			}
		}).start();
	}
}
