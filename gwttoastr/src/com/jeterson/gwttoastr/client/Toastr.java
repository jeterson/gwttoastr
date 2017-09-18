package com.jeterson.gwttoastr.client;

import com.jeterson.gwttoastr.client.interop.JsToastr;
import com.jeterson.gwttoastr.client.interop.JsToastrOptions;
import com.jeterson.gwttoastr.client.resources.ResourceInjector;
import com.jeterson.gwttoastr.client.resources.Resources;

/**
 * Classe para exibição das notificações
 * @author jeterson
 * 
 *  IMPORTANTE: Esse projeto é uma representação em GWT para o plugin de notificações ToastrNotification
 *             Voce pode ver mais em: https://github.com/CodeSeven/toastr
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
 */
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
