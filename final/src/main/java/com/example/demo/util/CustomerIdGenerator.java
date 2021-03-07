package com.example.demo.util;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

public class CustomerIdGenerator extends IdentityGenerator {
  @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) {
        // UUIDを生成し返却する
        return UUID.randomUUID().toString();
    }
}
