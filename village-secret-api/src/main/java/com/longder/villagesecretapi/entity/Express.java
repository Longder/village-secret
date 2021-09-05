package com.longder.villagesecretapi.entity;

import com.longder.villagesecretapi.entity.enums.ExpressType;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;

/**
 * 快递运单
 */
@Getter
@Setter
@Entity
@Table(name = "express")
public class Express extends BaseEntity {
    /**
     * 运单号
     */
    private String waybillNo;

    /**
     * 类型，国内，国外
     */
    private ExpressType type;
    /**
     * 发出方
     */
    private String source;
    /**
     * 目标方
     */
    private String target;
    /**
     * 金额
     */
    private BigDecimal money;

}
