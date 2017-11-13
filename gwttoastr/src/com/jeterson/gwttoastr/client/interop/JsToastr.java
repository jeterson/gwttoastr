package com.jeterson.gwttoastr.client.interop;

import com.google.gwt.dom.client.Element;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * O objeto Toastr
 * Informa��es sobre os m�todos em: https://github.com/CodeSeven/toastr"
 * @author jeterson
 * 
 * IMPORTANTE: Esse projeto � uma representa��o em GWT para o plugin de notifica��es ToastrNotification
              Voce pode ver mais em: https://github.com/CodeSeven/toastr
 *
 *  Copyright {2017} {Jeterson Miranda Gomes}
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
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

	@JsMethod(namespace="toastr")
	public static native void remove();

}