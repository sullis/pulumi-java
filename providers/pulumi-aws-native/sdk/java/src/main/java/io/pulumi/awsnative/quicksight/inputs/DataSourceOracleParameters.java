// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


public final class DataSourceOracleParameters extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceOracleParameters Empty = new DataSourceOracleParameters();

    @InputImport(name="database", required=true)
    private final String database;

    public String getDatabase() {
        return this.database;
    }

    @InputImport(name="host", required=true)
    private final String host;

    public String getHost() {
        return this.host;
    }

    @InputImport(name="port", required=true)
    private final Double port;

    public Double getPort() {
        return this.port;
    }

    public DataSourceOracleParameters(
        String database,
        String host,
        Double port) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceOracleParameters() {
        this.database = null;
        this.host = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceOracleParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String host;
        private Double port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceOracleParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setHost(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }

        public Builder setPort(Double port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }

        public DataSourceOracleParameters build() {
            return new DataSourceOracleParameters(database, host, port);
        }
    }
}
