package com.jeterson.gwttoastr.client;

import com.jeterson.gwttoastr.client.resources.ResourceInjector;
import com.jeterson.gwttoastr.client.resources.Resources;

public class Toastr {

	
	static{
		ResourceInjector.injectJS(Resources.INSTANCE.jqueryMin());
		ResourceInjector.injectJS(Resources.INSTANCE.jqueryEasingMin());
		ResourceInjector.injectJS(Resources.INSTANCE.toastrMin());
	}
	
	public static void show(String message, String title, ToastrType toastrType, JsToastrOptions opt, ToastrPosition pos){
		opt.positionClass = pos.getValue();
		
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
		show(message, title, toastrType, opt, ToastrPosition.TOP_RIGHT);
	}
	
	public static void show(String message, String title, ToastrType toastrType, ToastrPosition pos){
		JsToastrOptions opt = new JsToastrOptions();
		opt.progressBar = true;
		opt.closeButton = true;
		show(message, title, toastrType, opt, pos);
	}
	
	public static void remove(){
		JsToastr.remove();
	}
	public static void clear(){
		JsToastr.clear();
	}
	
	
	
	
}
