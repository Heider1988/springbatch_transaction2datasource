package com.transaction2datasource.transaction.utils;

public class QueryUtils {

	public static final String INSERT_INTO_PESSOA = 
			"INSERT INTO pessoa (id, nome, email, data_nascimento, idade) VALUES (:id, :nome, :email, :dataNascimento, :idade)";

}
