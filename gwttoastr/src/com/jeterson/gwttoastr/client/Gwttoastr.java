package com.jeterson.gwttoastr.client;

import com.google.gwt.core.client.EntryPoint;
public class Gwttoastr implements EntryPoint {

	public void onModuleLoad() {
		
	}
	
	public static native void log(Object log)/*-{
		console.log(log);
	}-*/;
	
	public static native boolean jQueryIsLoaded()/*-{
		var carregado = true;
		if(typeof($wnd.jQuery) == 'undefined'){
			carregado = false;
		}
		
		return carregado;
	}-*/;
}
