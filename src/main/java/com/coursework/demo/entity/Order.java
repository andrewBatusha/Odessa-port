package com.coursework.demo.entity;

import com.coursework.demo.entity.enums.OrderStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "orders")
public class Order implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String description;

    private String client;

    private int reward;

    @ManyToOne
    @JoinColumn(name = "crew_id")
    private Crew crew;

    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

}
