#language: pt

Funcionalidade: Acessar os formularios da Tricentis
Criando uma rotina de teste para validar o site Tricentis

    Cenario: Acessar e preencher o quinto formulario da aba Send Quote
    Dado que eu estou no site da Trincentis no formulario "Send Quote"
    E seleciono E-mail e digito "criss.br@hotmail.com"
    E seleciono Phone e digito "992693136"
    E seleciono Username e digito "zircuser"
    E seleciono Password e digito "Cris123"
    E seleciono Confirm Password e digito "Cris123"
    E seleciono Comments e digito "Aguardo um retorno imediato"
    E devo clicar em Send
    Entao ver a mensagem "Sending e-mail success!"