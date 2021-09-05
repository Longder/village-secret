package com.longder.villagesecretapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

/**
 * 订单
 */
@Getter
@Setter
@Entity
@Table(name = "order")
public class Order extends BaseEntity {
    /**
     * 买方（下单客户）
     */
    private String buyer;
    /**
     * 下单日期
     */
    private LocalDate placeDate;
    /**
     * 关联销售人员 id
     */
    private UUID salesmanId;
    /**
     * 运费总价
     */
    private BigDecimal expressTotalPrice;
    /**
     *
     */
    private BigDecimal commodityTotalPrice;

}
