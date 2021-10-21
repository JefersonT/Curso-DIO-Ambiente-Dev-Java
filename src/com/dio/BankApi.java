package com.dio;

import com.dio.entity.User;
import com.dio.service.StatementService;

import java.util.UUID;

public class BankApi {

    public static void main(String[] args) {
	// write your code here
        final User userA = new User(UUID.randomUUID(), "Usuário 1");
        final User userB = new User(UUID.randomUUID(), "Usuário 2");
        final StatementService statementService = new StatementService(userA, userB);

        statementService.findAllByUser(userA).forEach(System.out::println);
        statementService.findAllByUser(userB).forEach(System.out::println);
    }
}
