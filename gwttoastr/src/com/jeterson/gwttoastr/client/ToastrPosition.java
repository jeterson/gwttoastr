package com.jeterson.gwttoastr.client;

public enum ToastrPosition {

	TOP_RIGHT("toast-top-right"),
	BOTTON_RIGHT("toast-bottom-right"),
	BOTTON_LEFT("toast-bottom-left"),
	TOP_LEFT("toast-top-left"),
	BOTTON_CENTER("toast-bottom-center"),
	TOP_CENTER("toast-top-center"),
	TOP_FULL_WIDTH("toast-top-full-width"),
	BOTTON_FULL_WIDTH("toast-bottom-full-width");	
	
	private String value;
	private ToastrPosition(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
