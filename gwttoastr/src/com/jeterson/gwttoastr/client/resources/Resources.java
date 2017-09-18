package com.jeterson.gwttoastr.client.resources;

import com.google.gwt.core.shared.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface Resources extends ClientBundle{

	public static final Resources INSTANCE = GWT.create(Resources.class);
	@Source("js/toastr.min.js")
	TextResource toastrMin();
	
	@Source("js/jquery.min.js")
	TextResource jqueryMin();
	
	@Source("js/jquery.easing.js")
	TextResource jqueryEasingMin();
	
}
