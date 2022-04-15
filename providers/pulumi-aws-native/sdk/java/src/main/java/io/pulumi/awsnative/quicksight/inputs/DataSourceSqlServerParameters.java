// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * <p>SQL Server parameters.</p>
 * 
 */
public final class DataSourceSqlServerParameters extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceSqlServerParameters Empty = new DataSourceSqlServerParameters();

    /**
     * <p>Database.</p>
     * 
     */
    @Import(name="database", required=true)
      private final String database;

    public String database() {
        return this.database;
    }

    /**
     * <p>Host.</p>
     * 
     */
    @Import(name="host", required=true)
      private final String host;

    public String host() {
        return this.host;
    }

    /**
     * <p>Port.</p>
     * 
     */
    @Import(name="port", required=true)
      private final Double port;

    public Double port() {
        return this.port;
    }

    public DataSourceSqlServerParameters(
        String database,
        String host,
        Double port) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private DataSourceSqlServerParameters() {
        this.database = null;
        this.host = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSqlServerParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String database;
        private String host;
        private Double port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSqlServerParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder port(Double port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }        public DataSourceSqlServerParameters build() {
            return new DataSourceSqlServerParameters(database, host, port);
        }
    }
}
