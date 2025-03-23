package com.cansucelik.Credit.System.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name = "firstName")
private String firstName;
@Column(name = "lastName")
private String lastName;
@Column(name = "email")
private String email;
@Column(name = "password")
private String password;
@Column(name = "monthlyIncome")
private double monthlyIncome;
@Column(name = "totalDebt")
private double totalDebt;

    @OneToOne
    private CreditScore creditScore;

    @OneToMany
    private List<LoanApplication>loanApplications;
}
