// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream_v1alpha1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datastream_v1alpha1.outputs.MysqlTableResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MysqlDatabaseResponse {
    /**
     * @return Database name.
     * 
     */
    private final String databaseName;
    /**
     * @return Tables in the database.
     * 
     */
    private final List<MysqlTableResponse> mysqlTables;

    @CustomType.Constructor
    private MysqlDatabaseResponse(
        @CustomType.Parameter("databaseName") String databaseName,
        @CustomType.Parameter("mysqlTables") List<MysqlTableResponse> mysqlTables) {
        this.databaseName = databaseName;
        this.mysqlTables = mysqlTables;
    }

    /**
     * @return Database name.
     * 
     */
    public String databaseName() {
        return this.databaseName;
    }
    /**
     * @return Tables in the database.
     * 
     */
    public List<MysqlTableResponse> mysqlTables() {
        return this.mysqlTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MysqlDatabaseResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String databaseName;
        private List<MysqlTableResponse> mysqlTables;

        public Builder() {
    	      // Empty
        }

        public Builder(MysqlDatabaseResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.databaseName = defaults.databaseName;
    	      this.mysqlTables = defaults.mysqlTables;
        }

        public Builder databaseName(String databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder mysqlTables(List<MysqlTableResponse> mysqlTables) {
            this.mysqlTables = Objects.requireNonNull(mysqlTables);
            return this;
        }
        public Builder mysqlTables(MysqlTableResponse... mysqlTables) {
            return mysqlTables(List.of(mysqlTables));
        }        public MysqlDatabaseResponse build() {
            return new MysqlDatabaseResponse(databaseName, mysqlTables);
        }
    }
}
