// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersSnowflakeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersSnowflakeGetArgs Empty = new DataSourceParametersSnowflakeGetArgs();

    /**
     * The database to which to connect.
     * 
     */
    @Import(name="database", required=true)
      private final Output<String> database;

    public Output<String> database() {
        return this.database;
    }

    /**
     * The host to which to connect.
     * 
     */
    @Import(name="host", required=true)
      private final Output<String> host;

    public Output<String> host() {
        return this.host;
    }

    /**
     * The warehouse to which to connect.
     * 
     */
    @Import(name="warehouse", required=true)
      private final Output<String> warehouse;

    public Output<String> warehouse() {
        return this.warehouse;
    }

    public DataSourceParametersSnowflakeGetArgs(
        Output<String> database,
        Output<String> host,
        Output<String> warehouse) {
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = Objects.requireNonNull(host, "expected parameter 'host' to be non-null");
        this.warehouse = Objects.requireNonNull(warehouse, "expected parameter 'warehouse' to be non-null");
    }

    private DataSourceParametersSnowflakeGetArgs() {
        this.database = Codegen.empty();
        this.host = Codegen.empty();
        this.warehouse = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersSnowflakeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> database;
        private Output<String> host;
        private Output<String> warehouse;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersSnowflakeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.warehouse = defaults.warehouse;
        }

        public Builder database(Output<String> database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder database(String database) {
            this.database = Output.of(Objects.requireNonNull(database));
            return this;
        }
        public Builder host(Output<String> host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder host(String host) {
            this.host = Output.of(Objects.requireNonNull(host));
            return this;
        }
        public Builder warehouse(Output<String> warehouse) {
            this.warehouse = Objects.requireNonNull(warehouse);
            return this;
        }
        public Builder warehouse(String warehouse) {
            this.warehouse = Output.of(Objects.requireNonNull(warehouse));
            return this;
        }        public DataSourceParametersSnowflakeGetArgs build() {
            return new DataSourceParametersSnowflakeGetArgs(database, host, warehouse);
        }
    }
}
