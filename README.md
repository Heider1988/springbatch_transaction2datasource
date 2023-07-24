<p align="center">

<img src="https://media.giphy.com/media/M9gbBd9nbDrOTu1Mqx/giphy.gif" width="120" height="120"/>
 <br>
<img src="http://img.shields.io/static/v1?label=STATUS%20DO%20PROJETO&message=CONCLUIDO&color=GREEN&style=for-the-badge" width="300" height="100"/>
</p>

### Tópicos 

- [Descrição do projeto](#descrição-do-projeto)

- [Pré-requisitos](#[pre-requisitos)

- [Configuração do Banco de Dados](#aplicação)

- [Executando a Aplicação](#ferramentas-e-tecnolgoias-utilizadas)

- [Estrutura do Arquivo CSV](#acesso-ao-projeto)

- [Considerações Finais](#abrir-e-rodar-o-projeto)

- [Desenvolvedores](#desenvolvedores)

## Descrição do projeto
# Spring Batch - Importação de Arquivo CSV para o Banco de Dados
Este repositório contém uma aplicação Spring Batch que lê um arquivo CSV contendo informações de 10 mil pessoas e grava esses dados na tabela "pessoas" de um banco de dados. Além disso, a aplicação utiliza outro banco de dados separado para armazenar as tabelas padrão criadas automaticamente pelo Spring Batch.

## Pre-requisitos
Certifique-se de ter as seguintes ferramentas instaladas em sua máquina antes de prosseguir:
1.Java JDK 8 ou superior
2.Maven
3.Banco de dados (por exemplo, MySQL, PostgreSQL, etc.)

## Configuração do Banco de Dados
Antes de executar a aplicação, você precisa configurar os bancos de dados. Certifique-se de ter os bancos de dados criados e atualize as configurações de conexão em application.properties.

  1. Banco de dados para tabelas padrão do Spring Batch:
     spring.datasource.url=jdbc:mysql://localhost:3306/spring_batch_metadata
     spring.datasource.username=seu_usuario
     spring.datasource.password=sua_senha
     
  3. Banco de dados para a tabela "pessoas":
     app.pessoas.datasource.url=jdbc:mysql://localhost:3306/meu_banco_de_dados
     app.pessoas.datasource.username=seu_usuario
     app.pessoas.datasource.password=sua_senha

## Executando a Aplicação
Siga os passos abaixo para executar a aplicação:
1.Clone este repositório para sua máquina local.
2. Navegue até o diretório do projeto.
3. Compile o projeto usando o Maven: mvn clean package

## Estrutura do Arquivo CSV
nome, email, data_nascimento, idade e id

## Considerações Finais
Esta aplicação utiliza o Spring Batch para processar grandes volumes de dados de forma eficiente. O processo de importação do arquivo CSV é dividido em etapas (leitura, processamento e gravação), o que permite um melhor controle do processo e possibilita a recuperação de falhas em caso de problemas.

Certifique-se de ajustar as configurações do banco de dados e o formato do arquivo CSV, caso necessário, para que a importação ocorra com sucesso.

Em caso de dúvidas ou problemas, sinta-se à vontade para abrir uma "issue" neste repositório ou entrar em contato com o desenvolvedor.

Aproveite a aplicação Spring Batch para importar seus dados com facilidade e eficiência!

## Desenvolvedores
<div id="badges">
 :heavy_check_mark: Heider Oliveira 
 <br>
  <img src="https://avatars.githubusercontent.com/u/33627744?v=4" width=130>
 <br>
  <a target="_blank" href="https://www.linkedin.com/in/heider1988/">
    <img src="https://img.shields.io/badge/LinkedIn-blue?style=for-the-badge&logo=linkedin&logoColor=white" alt="LinkedIn"/ width="130">
  </a>
 <br>
  <a target="_blank" href="https://www.instagram.com/heider.oliveira/">
  <img src="https://img.shields.io/badge/Instagram-blue?style=for-the-badge&logo=instagram&logoColor=white" alt="Instagram"/ width="130">
  </a>
 <br>
  <a target="_blank" href="https://www.youtube.com/channel/UCAIx0AsetLKoPyyAGDTcZCQ">
    <img src="https://img.shields.io/badge/YouTube-FF0000?style=for-the-badge&logo=youtube&logoColor=white" alt="Youtube"/ width="130">
  </a>
</div>
