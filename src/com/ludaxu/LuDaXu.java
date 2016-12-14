package com.ludaxu;

public class LuDaXu {
	public static void main(String[] args) {
		Context context;
		System.out.println("--------刚刚到吴国的时候拆开第一个--------");
		context = new Context(new BackDoor());
		context.operate();// 拆开执行
		System.out.println("\n\n\n\n\n");

		System.out.println("-----------刘备乐不思蜀了，拆开第二个-------------");
		context = new Context(new GivenGreenLight());
		context.operate();
		System.out.println("\n\n\n\n\n\n");

		System.out.println("-------------孙权的小兵追到了，拆开第三个-------------");
		context = new Context(new BlockEnemy());
		context.operate();
		System.out.println("\n\n\n\n\n");

	}

}
