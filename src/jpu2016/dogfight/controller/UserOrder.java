package jpu2016.dogfight.controller;

public class UserOrder {
	private int player;
	
	public void UserOrder(int player, Order order) {
		this.player = player;
	}
	
	public Order getOrder() {
		Order UP = Order.UP;
		
		
		return UP;
	}
	
	public int getPlayer() {
		return 1;
	}

}
