package com.coursework.demo.entity;

import com.coursework.demo.entity.enums.HoldType;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
@Table(name = "hold_items")
public class HoldItem implements Serializable {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    private int quantity;

    @Enumerated(EnumType.STRING)
    private HoldType holdType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ship_id")
    private Ship ship;
}
