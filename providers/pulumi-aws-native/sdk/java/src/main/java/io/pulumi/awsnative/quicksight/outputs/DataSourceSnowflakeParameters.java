// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceSnowflakeParameters {
    /**
     * <p>Database.</p>
     * 
     */
    private final String database;
    /**
     * <p>Host.</p>
     * 
     */
    private final String host;
    /**
     * <p>Warehouse.</p>
     * 
     */
    private final String warehouse;

    @OutputCustomType.Constructor({"database","host","warehouse"})
    private DataSourceSnowflakeParameters(
        String database,
        String host,
        String warehouse) {
        this.database = Objects.requireNonNull(database);
        this.host = Objects.requireNonNull(host);
        this.warehouse = Objects.requireNonNull(warehouse);
    }

    /**
     * <p>Database.</p>
     * 
     */
    public String getDatabase() {
        return this.database;
    }
    /**
     * <p>Host.</p>
     * 
     */
    public String getHost() {
        return this.host;
    }
    /**
     * <p>Warehouse.</p>
     * 
     */
    public String getWarehouse() {
        return this.warehouse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSnowflakeParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String host;
        private String warehouse;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSnowflakeParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.warehouse = defaults.warehouse;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setWarehouse(String warehouse) {
            this.warehouse = Objects.requireNonNull(warehouse);
            return this;
        }

        public DataSourceSnowflakeParameters build() {
            return new DataSourceSnowflakeParameters(database, host, warehouse);
        }
    }
}
