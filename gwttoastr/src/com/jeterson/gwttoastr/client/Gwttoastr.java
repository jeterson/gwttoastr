package com.jeterson.gwttoastr.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
public class Gwttoastr implements EntryPoint {

	public void onModuleLoad() {
		
		Button btn = new Button("Click-me");
		btn.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				Toastr.show("Hello Word", "Info", ToastrType.INFO, ToastrPosition.TOP_CENTER);
				
			}
		});
		
		RootPanel.get().add(btn);
	}
}
