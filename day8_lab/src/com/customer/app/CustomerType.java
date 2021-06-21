package com.customer.app;

public enum CustomerType {
	SLIVER,GOLD,PLATINUM;
	public String toString() {
		return name().toLowerCase();
	}
}
