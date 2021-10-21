package com.dio;

import com.dio.entity.Statement;
import com.dio.entity.User;
import com.dio.service.StatementService;
import com.dio.service.StatementServiceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class BankApi {

    public static void main(String[] args) {
	// write your code here
        final User userA = new User(UUID.randomUUID(), "Usuário 1");
        final User userB = new User(UUID.randomUUID(), "Usuário 2");
        final StatementService statementService = new StatementServiceImpl(userA, userB);

        statementService.findAllByUser(userA).forEach(System.out::println);
        statementService.findAllByUser(userB).forEach(System.out::println);

        //Demostração de Método Default
        List<Statement> statementsUserA = statementService.findAllByUser(userA);

        for (Statement statement : statementsUserA){
            System.out.println(statementService.findUser(statement).getName());
        }

        //Primeira Demostração de função Lambda
        statementsUserA.forEach((statement) -> {
            System.out.println(statementService.findUser(statement).getName());
        });

        //Segunda Demostração de função Lambda
        statementsUserA.forEach((statement) -> System.out.println(statementService.findUser(statement).getName()));

        //Terceira Demostração de função Lambda
        statementsUserA.forEach(statement -> System.out.println(statementService.findUser(statement).getName()));

        //Exemplo de Method references
        statementsUserA.forEach(System.out::println);

        //Date
        statementsUserA.forEach(statement -> {
            LocalDateTime localDateTime = statement.getCreatedAt();
            System.out.println("Data do Extrato + 1dia: " + localDateTime.plusDays(1));
            System.out.println("Dia do ano do Extrato: " + localDateTime.getDayOfYear());
            System.out.println("Dia do mês do Extrato: " + localDateTime.getDayOfMonth());
        });


    }
}