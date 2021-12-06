package com.dshunevich.hellospring.controller.dto;

import com.dshunevich.hellospring.entity.Account;

public class AccountResponseDTO {
    private Long AccountId;
    private String name;
    private String email;
    private Integer bill;

    public AccountResponseDTO(Long accountId, String name, String email, Integer bill) {
        this.AccountId = accountId;
        this.name = name;
        this.email = email;
        this.bill = bill;
    }

    public AccountResponseDTO(Account account){
        AccountId = account.getId();
        name = account.getName();
        email = account.getEmail();
        bill = account.getBill();
    }

    public Long getAccountId() {
        return AccountId;
    }

    public void setAccountId(Long accountId) {
        AccountId = accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getBill() {
        return bill;
    }

    public void setBill(Integer bill) {
        this.bill = bill;
    }
}
