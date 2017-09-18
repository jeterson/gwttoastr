package com.jeterson.gwttoastr.client;

import jsinterop.annotations.JsFunction;

public interface JsFunctions {

	@FunctionalInterface
    @JsFunction
	public interface Function1<A>{
		public void call(A param);
	}
	
	@FunctionalInterface
    @JsFunction
	public interface Function{
		public void call();
	}
}
