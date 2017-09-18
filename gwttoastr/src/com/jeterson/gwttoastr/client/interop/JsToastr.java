package com.jeterson.gwttoastr.client;

import com.google.gwt.dom.client.Element;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class JsToastr {


	@JsMethod(namespace="toastr")
	public static native Element info(String mensagem, String title, JsToastrOptions options);

	@JsMethod(namespace="toastr")
	public static native Element warning(String mensagem, String title, JsToastrOptions options);


	@JsMethod(namespace="toastr")
	public static native Element success(String mensagem, String title, JsToastrOptions options);


	@JsMethod(namespace="toastr")
	public static native Element error(String mensagem, String title, JsToastrOptions options);


	@JsMethod(namespace="toastr")
	public static native void clear();

	@JsMethod
	public static native void remove();

}