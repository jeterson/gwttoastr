package com.jeterson.gwttoastr.client.interop;



import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Site Official https://github.com/CodeSeven/toastr
 * RepresentaÃ§Ã£o do ToastrOptions Notifications para GWT
 * @author jeterson
 *
 *
 *IMPORTANTE: Esse projeto é uma representação em GWT para o plugin de notificações ToastrNotification
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
 */
@JsType(isNative=true, name="Object", namespace=JsPackage.GLOBAL)
public class JsToastrOptions{

	@JsProperty
	public String positionClass;
	
	@JsProperty
	public JsFunctions.Function onShown;
	
	@JsProperty
	public JsFunctions.Function onHidden;
	
	@JsProperty
	public JsFunctions.Function onClick;
	@JsProperty
	public JsFunctions.Function onCloseClick;
	
	@JsProperty
	public String showEasing ;
	
	@JsProperty
	public String hideEasing;
	
	@JsProperty
	public String closeEasing;
	
	@JsProperty
	public String showMethod;

	@JsProperty
	public String closeMethod;
	
	@JsProperty
	public String hideMethod;
	
	@JsProperty
	public boolean preventDuplicates;
	
	@JsProperty
	public int timeOut;
	
	@JsProperty
	public int extendedTimeOut;
	
	@JsProperty
	public boolean progressBar ;
	
	@JsProperty
	public boolean rtl;
	
	@JsProperty
	public boolean newestOnTop ;
	
	@JsProperty
	public int closeDuration;

	@JsProperty
	public String closeHtml ;
	
	@JsProperty
	public boolean closeButton;
	
	@JsProperty
	public boolean escapeHtml ;
	
	

}