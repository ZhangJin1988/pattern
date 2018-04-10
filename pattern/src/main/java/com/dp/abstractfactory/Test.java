package com.dp.abstractfactory;

/**
 * ��������Բ��ͣ�http://blog.csdn.net/zhangerqing 
 * email:xtfggef@gmail.com
 * ΢����http://weibo.com/xtfggef
 * @author egg
 * 
 */
public class Test {

	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}
