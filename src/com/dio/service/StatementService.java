package com.dio.service;

import com.dio.entity.Statement;
import com.dio.entity.User;
import com.dio.repository.StatementRepository;

import java.util.List;

public interface StatementService {

    List<Statement> findAllByUser(final User user);

    default User findUser(final Statement statement){
        return statement.getUser();
    }

    /*private final StatementRepository statementRepository;

    public StatementService(final User userA, final User userB) {
        this.statementRepository = new StatementRepository(userA, userB);
    }

    public List<Statement> findAllByUser(final User user) {
        return statementRepository.findAllByUser(user);
    }*/
}
