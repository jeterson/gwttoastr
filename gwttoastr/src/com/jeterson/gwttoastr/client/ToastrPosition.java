package com.jeterson.gwttoastr.client;

/**
 * Posição da notificação
 * @author jeterson
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
public enum ToastrPosition {

	TOP_RIGHT("toast-top-right"),
	BOTTON_RIGHT("toast-bottom-right"),
	BOTTON_LEFT("toast-bottom-left"),
	TOP_LEFT("toast-top-left"),
	BOTTON_CENTER("toast-bottom-center"),
	TOP_CENTER("toast-top-center"),
	TOP_FULL_WIDTH("toast-top-full-width"),
	BOTTON_FULL_WIDTH("toast-bottom-full-width");	
	
	private String value;
	private ToastrPosition(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
