package com.dp.singleton;

public class Singleton {

	/* ??й????????????????? */
	private Singleton() {
	}

	/* ??????????????????????? */
	private static class SingletonFactory {
		private static Singleton instance = new Singleton();
	}

	/* ?????? */
	public static Singleton getInstance() {
		return SingletonFactory.instance;
	}

	/* ???????????????л??????????????????л???????? */
	public Object readResolve() {
		return getInstance();
	}
}