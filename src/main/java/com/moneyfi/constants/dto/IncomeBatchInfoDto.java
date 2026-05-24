package com.moneyfi.constants.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class IncomeBatchInfoDto implements Serializable {
    private static final long serialVersionUID = 1L;

    private String transactionType;
    private String description;
    private BigDecimal amount;
    private String name;

    public IncomeBatchInfoDto(String transactionType, String description, BigDecimal amount, String name) {
        this.transactionType = transactionType;
        this.description = description;
        this.amount = amount;
        this.name = name;
    }

    public IncomeBatchInfoDto() {
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "IncomeBatchInfoDto{" +
                "transactionType='" + transactionType + '\'' +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        IncomeBatchInfoDto that = (IncomeBatchInfoDto) o;
        return Objects.equals(transactionType, that.transactionType) && Objects.equals(description, that.description) && Objects.equals(amount, that.amount) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionType, description, amount, name);
    }
}
