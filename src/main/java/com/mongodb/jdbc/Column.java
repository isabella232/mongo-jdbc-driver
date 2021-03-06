package com.mongodb.jdbc;

import org.bson.BsonValue;

public class Column {
    public String database;
    public String table;
    public String tableAlias;
    public String column;
    public String columnAlias;
    public String bsonType;
    public BsonValue value;

    public Column() {}

    public Column(
            String database,
            String table,
            String tableAlias,
            String column,
            String columnAlias,
            String bsonType,
            BsonValue value) {
        this.database = database;
        this.table = table;
        this.tableAlias = tableAlias;
        this.column = column;
        this.columnAlias = columnAlias;
        this.bsonType = bsonType;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Column{"
                + "database='"
                + database
                + '\''
                + ", table='"
                + table
                + '\''
                + ", tableAlias='"
                + tableAlias
                + '\''
                + ", column='"
                + column
                + '\''
                + ", columnAlias='"
                + columnAlias
                + '\''
                + ", bsonType="
                + bsonType
                + '\''
                + ", value="
                + value
                + '}';
    }
}
