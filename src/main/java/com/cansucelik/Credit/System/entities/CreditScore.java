package com.cansucelik.Credit.System.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "creadit_score")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditScore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int score;

    @OneToOne(mappedBy = "creditScore")
    private User user;
}

