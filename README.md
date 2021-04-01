<b># Descrição do Projeto</b>
--------------------------------------------------------------------------------

## Criar um projeto em selenium webdrive (java) e cucumber usando Page objects 

### Caso de teste 1

<b>Acessar os formulários do site Tricentis</b>

<b>Cenario</b>: Preencher aba enter Vehicle Data
Dado que eu estou no site "http://sampleapp.tricentis.com/101/app.php"</br>
E seleciono Make e clico em "Nissan"</br>
E seleciono Model e clico em "Scooter"</br>
E informo em Cylinder Capacity "200"</br>
E informo em Engine Performance "20"</br>
E digito em Date of Manufacture "03/30/2021"</br>
E seleciono em Number of Seats e clico em "2"</br>
E seleciono em Right Hand Drive e clico em "Yes"</br>
E seleciono novamente Number of Seats e digito "2"</br>
E seleciono Fuel Type "Petrol"</br>
E informo em Payload "100"</br>
E informo em Total Weight "200"</br>
E informo em List Price "8000"</br>
E informo em Annual Mileage "20000"</br>
Entao devo clicar em Next para o formulario Insurant Data</br>


### Caso de teste 2

<b>Cenario</b>: Preencher aba enter Insurant Data</br>
Dado que eu estou no site da Trincentis no formulario "Enter Insurant Data"</br>
E seleciono First Name e digito "Cristiane"</br>
E seleciono Last Name e digito em "Silva"</br>
E seleciono Date of Birth e digito "18/10/1988"</br>
E seleciono Gender e clico em "Female"
E digito em Street Adress "Avenida Consolacao 1800 ap 08"</br>
E seleciono em Contry e clico em "Brazil"</br>
E seleciono em Zip Code e digito "0105000"</br>
E seleciono em City e digito "Sao Paulo"</br>
E seleciono Occupation e seleciono "Employee"</br>
E seleciono Hobbies e clico em "Speeding"</br>
Entao devo clicar em Next para o formulario Enter Product Data</br>


### Caso de teste 3

<b>Cenario</b>: Preencher a terceira aba Product Data</br>
Dado que eu estou no site da Trincentis no formulario "Enter Product Data"</br>
E seleciono Start Date e digito "05/05/2021"</br>
E seleciono Insurance Sum e clico em "5.000.000,00"</br>
E seleciono Merit Rating e clico em "Bonus 1"</br>
E seleciono Damage Insurance e clico em "No Coverage"</br>
E seleciono Optional Products e clico em "Euro Protection"</br>
E seleciono Courtesy Car e clico em "Yes"</br>
Entao devo clicar em Next para o formulario Select Price Option</br>


### Caso de teste 4

<b>Cenario</b>: Preencher a quarta aba Select Price Option</br>
Dado que eu estou no site da Trincentis no formulario "Select Price Option"</br>
E seleciono Select Option o plano Gold</br>
Entao devo clicar em Next para o formulario Send Quote</br>

### Caso de teste 5

<b>Cenario</b>: Acessar e preencher o quinto formulario da aba Send Quote
Dado que eu estou no site da Trincentis no formulario "Send Quote"
E seleciono E-mail e digito "criss.br@hotmail.com"
E seleciono Phone e digito "992693136"
E seleciono Username e digito "zircuser"
E seleciono Password e digito "Cris123"
E seleciono Confirm Password e digito "Cris123"
E seleciono Comments e digito "Aguardo um retorno imediato"
E devo clicar em Send
Entao ver a mensagem "Sending e-mail success!"

-------------------------------------------------------------------------------------
## Tecnologias utilizadas
:heavy_check_mark: Java</br>
Linguagem de programação para desenvolvimento da aplicação</br>

:heavy_check_mark: Maven</br>
Gerenciador de dependências para desenvolvimento da aplicação</br>

:heavy_check_mark: Cucumber</br>
Framework responsável por traduzir uma linguagem humana em código Java</br>

:heavy_check_mark: Selenium</br>
Framework responsável por fazer a integração do código com a linguagem Gherkin (Cucumber),
abrindo o browser e fazendo o teste de comportamento


## Como utilizar:
- Clone do projeto
```bash
git clone https://github.com/crissbr/projeto-individual-accenture.git
```

- Entrando na pasta do projeto
```bash
cd projeto-individual-accenture
```

- Limpando e validando maven Unix
```bash
./mvnw clean
```
- Limpando e validando maven Windows
```bash
 mvnw.cmd clean
```
