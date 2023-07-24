# Spring Batch - Importação de Arquivo CSV para o Banco de Dados
Este repositório contém uma aplicação Spring Batch que lê um arquivo CSV contendo informações de 10 mil pessoas e grava esses dados na tabela "pessoas" de um banco de dados. Além disso, a aplicação utiliza outro banco de dados separado para armazenar as tabelas padrão criadas automaticamente pelo Spring Batch.

# Pré-requisitos
Certifique-se de ter as seguintes ferramentas instaladas em sua máquina antes de prosseguir:
1.Java JDK 8 ou superior
2.Maven
3.Banco de dados (por exemplo, MySQL, PostgreSQL, etc.)

# Configuração do Banco de Dados
Antes de executar a aplicação, você precisa configurar os bancos de dados. Certifique-se de ter os bancos de dados criados e atualize as configurações de conexão em application.properties.
