package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * A classe TelaLogin é reponsavel de criar usuários
 * @author Gabriel Verlangieri de Souza
 */

public class TelaLogin {

    private static Map<String,String> userDatabase;

    /**
     * O LoginScreen cria em inicialização 1 usuario para userDatabase, não precisando de parametro para iniciar
     */
    public TelaLogin() {
        userDatabase = new HashMap<>();
        userDatabase.put("john","password123");
    }

    /**
     * login recebe e verifica uma string user e uma string senha, caso existam no banco de dados ele retorna True, caso não ele retorna False
     * @param User é uma string que simboliza o nome do usuário
     * @param password é a string que simboliza a senha do usuário
     * @return Boolean é o retorno de verdadeiro ou falso para a existencia de um usuario com o referido nome e senha
     */
    public boolean login(String User, String password) {

        if (userDatabase.containsKey(User)) {
            String storedPassword = userDatabase.get(User);
            if (storedPassword.equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * addUser recebe uma string user e uma string password para colocar no userDatabase
     * @param User é uma string que simboliza o nome do usuário
     * @param password é a string que simboliza a senha do usuário
     * @Return void não retorna nada, somente adiciona o novo usuario
     */
    public void addUser(String user, String password) {

        userDatabase.put(user,password);
    }
}
