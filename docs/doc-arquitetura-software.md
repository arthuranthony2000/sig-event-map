#  Arquitetura MVC

<p> O sistema será dividido em duas partes. , o front-end, na qual irá consumir uma API, será hospedado na vercel, e a outra parte o back-end que irá fornecer a API REST.

<p> Model: A responsabilidade dos models é representar o negócio. Também é responsável pelo acesso e manipulação dos dados na sua aplicação.

<p> Controler: É a camada de controle, responsável por ligar o model e a view, fazendo com que os models possam ser repassados para as views e vice-versa.

<p> View: A view é responsável pela interface que será apresentada, mostrando as informações do model para o usuário.

![MVC](images/mvc.jpeg)

<p> Toda esta arquitetura é interligada e conversam entre si. API é um conjunto de regras que definem como aplicativos ou dispositivos podem se conectar e se comunicar uns com os outros.

##  Modelo da Arquitetura MVC

![Conexão Backend com Frontend](images/back-front.jpg)

<p> Ou seja, a aplicação fará requisições a um controlador REST no back-end, na qual possui outras camadas como a de serviço, que ficará responsável por fazer o intermédio entre os controladores rest, e a camada de acesso a dados. A camada de domínio, que ficará responsável por armazenar as regras de negócio. E a camada de acesso a dados (repository), na qual será responsável por implementar interfaces de acesso e manipulação aos dados, nesse caso em um banco de dados no sgbd postgresql.

## DTO

![DTO](images/DTO.jpeg)

**_Data Transfer Object_**  (DTO) ou simplesmente  **_Transfer Object_**  é um padrão de projetos bastante usado em Java para o transporte de dados entre diferentes componentes de um sistema, diferentes instâncias ou processos de um sistema distribuído ou diferentes sistemas via serialização.

A ideia consiste basicamente em agrupar um conjunto de atributos numa classe simples de forma a otimizar a comunicação.


_


 
