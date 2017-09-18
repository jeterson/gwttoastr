package com.jeterson.gwttoastr.client.interop;

import jsinterop.annotations.JsFunction;
/**
 * Representa uma funcão java script
 * @author jeterson
 *
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
public interface JsFunctions {

	/**
	 * Funcão com 1 parametro 
	 * @author jeterson
	 *
	 * @param <A>
	 */
	@FunctionalInterface
    @JsFunction
	public interface Function1<A>{
		public void call(A param);
	}
	
	/**
	 * Funcção sem parametro
	 * @author jeterson
	 *
	 */
	@FunctionalInterface
    @JsFunction
	public interface Function{
		public void call();
	}
}
