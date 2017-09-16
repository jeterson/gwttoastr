package com.jeterson.gwttoastr.client;



import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
 * Site Official https://github.com/CodeSeven/toastr
 * Representação do ToastrOptions Notifications para GWT
 * @author jeterson
 *
 */
@JsType
public class JsToastrOptions{

	
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