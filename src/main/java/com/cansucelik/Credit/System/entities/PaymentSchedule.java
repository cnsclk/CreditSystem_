package com.cansucelik.Credit.System.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "payment_schedule")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentSchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "loan_id")
    private LoanApplication loan;

    private LocalDate paymentDate;
    private double amount;

    private boolean isPaid;

}
