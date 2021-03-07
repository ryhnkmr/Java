package com.example.demo.util;

import java.io.Serializable;
import java.util.UUID;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentityGenerator;

public class CustomerIdGenerator extends IdentityGenerator {
  @Override
    public Serializable generate(SharedSessionContractImplementor session, Object obj) {
        // ランダムに大文字のアルファベットを生成
        char character = Character.toUpperCase((char) Math.floor( Math.random() * 26 + 97 ));
        // ランダムな4桁の数字を生成
        Integer num = (int) Math.floor( Math.random() * 10000) - 1;
        return character + String.format("%04d", num);
    }
}
