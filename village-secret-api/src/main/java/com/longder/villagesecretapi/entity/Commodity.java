package com.longder.villagesecretapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "commodity")
public class Commodity extends BaseEntity {
    /**
     * 商品名称
     */
    private String name;
    /**
     * 单价
     */
    private BigDecimal unitPrice;
    /**
     * 型号
     */
    private String model;
    /**
     * 颜色
     */
    private String color;
    /**
     * 厂家
     */
    private String manufacturer;
}
