package com.yoons.recipebook.model;

import com.yoons.recipebook.baisc.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Getter @Setter
@Builder
@DynamicInsert
@DynamicUpdate
public class Point extends BaseTimeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ColumnDefault("0")
    private int quantity;

    public Point() {
    }

    public Point(Long id, int quantity) {
        this.id = id;
        this.quantity = quantity;
    }
}
