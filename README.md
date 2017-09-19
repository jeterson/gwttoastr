# gwttoastr

Para Adicionar ao Projeto inclua no seu gwt module: 
`<inherits name="com.jeterson.gwttoastr.Gwttoastr" />`

Se você ja tiver o Jquery adicionado no seu projeto, define a propriedade <code>Toastr.JQUERY_IS_INJECTED = true</code>


# basico
<code>Toastr.show("Olá mundo", "Sucesso", ToastrType.SUCCESS);</code>

# Usando eventos

`
	JsToastrOptions opt = new JsToastrOptions();
		opt.onclick = new Function() {
			
			@Override
			public void call() {
				Toastr.show("Sucesso ao clicar no Toast", "Sucesso", ToastrType.SUCCESS);
				
			}
		};
		Toastr.show("Ola Mundo", "Sucesso", ToastrType.SUCCESS, opt);
`
