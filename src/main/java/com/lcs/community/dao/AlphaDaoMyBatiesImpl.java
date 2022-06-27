package com.lcs.community.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AlphaDaoMyBatiesImpl implements AlphaDao {
    @Override
    public String select() {
        return "MyBatis";
    }
}
