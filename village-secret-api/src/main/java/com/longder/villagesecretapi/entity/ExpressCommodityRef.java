package com.longder.villagesecretapi.entity;

import javax.persistence.Embeddable;
import java.util.UUID;

/**
 * 运单和商品关联
 */
@Embeddable
public class ExpressCommodityRef {
    /**
     * 商品id
     */
    private UUID commodityId;
    /**
     * 商品数量
     */
    private Integer count;
}
