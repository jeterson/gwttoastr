# gwttoastr
Versão do plugin Toastr https://github.com/CodeSeven/toastr para GWT

Para Adicionar ao Projeto inclua no seu gwt module: 
`<inherits name="com.jeterson.gwttoastr.Gwttoastr" />`



# basico
<code>Toastr.show("Olá mundo", "Sucesso", ToastrType.SUCCESS);</code>

# Usando eventos


	JsToastrOptions opt = new JsToastrOptions();
		opt.onclick = new Function() {
			
			@Override
			public void call() {
				Toastr.show("Sucesso ao clicar no Toast", "Sucesso", ToastrType.SUCCESS);
				
			}
		};
		Toastr.show("Ola Mundo", "Sucesso", ToastrType.SUCCESS, opt);

