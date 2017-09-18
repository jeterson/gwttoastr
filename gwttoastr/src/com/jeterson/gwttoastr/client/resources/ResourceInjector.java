package com.jeterson.gwttoastr.client.resources;

import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.resources.client.TextResource;

public class ResourceInjector {

	public static void injectJS(TextResource resource){
		ScriptInjector.fromString(resource.getText()).setWindow(ScriptInjector.TOP_WINDOW).setRemoveTag(false).inject();
	}
	
	public static void injetcCss(TextResource resource){
		StyleInjector.inject(resource.getText());
	}
}
