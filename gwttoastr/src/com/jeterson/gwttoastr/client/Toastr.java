package com.jeterson.gwttoastr.client;

public class Toastr {

	public static void show(String message, String title, ToastrType toastrType, JsToastrOptions opt){
		if(toastrType == ToastrType.ERROR){
			JsToastr.error(message, title, opt);
		}else if(toastrType == ToastrType.INFO){
			JsToastr.info(message, title, opt);
		}else if(toastrType == ToastrType.SUCCESS){
			JsToastr.success(message, title, opt);
		}else if(toastrType == ToastrType.WARNING){
			JsToastr.warning(message, title, opt);
		}
	}
	
	public static void show(String message, String title, ToastrType toastrType){
		JsToastrOptions opt = new JsToastrOptions();
		opt.progressBar = true;
		opt.closeButton = true;
		show(message, title, toastrType, opt);
	}
	
	public static void remove(){
		JsToastr.remove();
	}
	public static void clear(){
		JsToastr.clear();
	}
	
	
	
	
}
