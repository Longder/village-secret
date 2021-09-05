package com.longder.villagesecretapi.entity;

import org.springframework.data.domain.Persistable;

import java.io.Serializable;

/**
 * 持久化对象
 * 扩展Persistable接口
 *
 * @see Persistable
 */
public interface PersistableIdEntity<T> extends Persistable<T>, Serializable {
    void setId(T id);
}
