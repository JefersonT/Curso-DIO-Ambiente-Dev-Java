package com.dio.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Statement {
    private final BigDecimal valeu;
    private final LocalDateTime createdAt;
    private final User user;

    public Statement(BigDecimal valeu, LocalDateTime createdAt, User user) {
        this.valeu = valeu;
        this.createdAt = createdAt;
        this.user = user;
    }

    public BigDecimal getValeu() {
        return valeu;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public User getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "Statement{" +
                "valeu=" + valeu +
                ", createdAt=" + createdAt +
                ", user=" + user +
                '}';
    }
}
