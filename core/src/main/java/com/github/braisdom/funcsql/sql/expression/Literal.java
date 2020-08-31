package com.github.braisdom.funcsql.sql.expression;

import com.github.braisdom.funcsql.sql.Expression;
import com.github.braisdom.funcsql.sql.SQLContext;

public class Literal implements Expression {

    private final Object rawLiteral;

    public Literal(Object rawLiteral) {
        this.rawLiteral = rawLiteral;
    }

    @Override
    public Expression as(String alias) {
        return null;
    }

    @Override
    public String toSql(SQLContext sqlContext) {
        return null;
    }
}
