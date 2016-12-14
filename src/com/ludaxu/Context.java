package com.ludaxu;

public class Context {
	private iStrategy strategy;

	public Context(iStrategy strategy) {
		this.strategy = strategy;
	}

	public void operate() {
		this.strategy.operate();
	}
}
