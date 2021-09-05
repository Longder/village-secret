package com.longder.villagesecretapi.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 销售人员
 */
@Getter
@Setter
@Entity
@Table(name = "salesman")
public class Salesman extends BaseEntity {
    /**
     * 姓名
     */
    private String name;
    /**
     * 英文名
     */
    private String englishName;
    /**
     * 电话
     */
    private String mobile;
}
