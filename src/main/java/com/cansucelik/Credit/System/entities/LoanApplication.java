package com.cansucelik.Credit.System.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "loan_application")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoanApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double requestedAmount; // Kullanıcının talep ettiği kredi miktarı
    private int termInMonths; // Kredi vadesi (12, 24, 36 ay)

    @Enumerated(EnumType.STRING)
    private LoanStatus status; // PENDING, APPROVED, REJECTED

    private double interestRate;
    private double monthlyPayment;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}


