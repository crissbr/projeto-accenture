
 <b># Descrição do Projeto</b>
--------------------------------------------------------------------------------

# Criar um projeto em selenium webdrive (java) e cucumber usando Page objects 

### Caso de teste 1

<b>Acessar os formulários do site Tricentis</b>

<b>Cenario</b>: Preencher aba enter Vehicle Data
Dado que eu estou no site "http://sampleapp.tricentis.com/101/app.php"
E seleciono Make e clico em "Nissan"
E seleciono Model e clico em "Scooter"
E informo em Cylinder Capacity "200"
E informo em Engine Performance "20"
E digito em Date of Manufacture "03/30/2021"
E seleciono em Number of Seats e clico em "2"
E seleciono em Right Hand Drive e clico em "Yes"
E seleciono novamente Number of Seats e digito "2"
E seleciono Fuel Type "Petrol"
E informo em Payload "100"
E informo em Total Weight "200"
E informo em List Price "8000"
E informo em Annual Mileage "20000"
Entao devo clicar em Next para o formulario Insurant Data


### Caso de teste 2

<b>Cenario</b>: Preencher aba enter Insurant Data
Dado que eu estou no site da Trincentis no formulario "Enter Insurant Data"
E seleciono First Name e digito "Cristiane"
E seleciono Last Name e digito em "Silva"
E seleciono Date of Birth e digito "18/10/1988"
E seleciono Gender e clico em "Female"
E digito em Street Adress "Avenida Consolacao 1800 ap 08"
E seleciono em Contry e clico em "Brazil"
E seleciono em Zip Code e digito "0105000"
E seleciono em City e digito "Sao Paulo"
E seleciono Occupation e seleciono "Employee"
E seleciono Hobbies e clico em "Speeding"
Entao devo clicar em Next para o formulario Enter Product Data


### Caso de teste 3

<b>Cenario</b>: Preencher a terceira aba Product Data
Dado que eu estou no site da Trincentis no formulario "Enter Product Data"
E seleciono Start Date e digito "05/05/2021"
E seleciono Insurance Sum e clico em "5.000.000,00"
E seleciono Merit Rating e clico em "Bonus 1"
E seleciono Damage Insurance e clico em "No Coverage"
E seleciono Optional Products e clico em "Euro Protection"
E seleciono Courtesy Car e clico em "Yes" 
Entao devo clicar em Next para o formulario Select Price Option


### Caso de teste 4

<b>Cenario</b>: Preencher a quarta aba Select Price Option
Dado que eu estou no site da Trincentis no formulario "Select Price Option"
E seleciono Select Option o plano Gold
Entao devo clicar em Next para o formulario Send Quote

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
