package com.longder.villagesecretapi.entity;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * 订单和商品关联
 */
public class OrderCommodityRef {
    /**
     * 商品id
     */
    private UUID commodityId;
    /**
     * 该商品数量
     */
    private Integer count;
    /**
     * 某商品在订单里的总价
     */
    private BigDecimal totalPrice;
}
