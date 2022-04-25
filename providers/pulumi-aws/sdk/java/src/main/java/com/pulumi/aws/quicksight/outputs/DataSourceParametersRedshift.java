// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceParametersRedshift {
    /**
     * @return The ID of the cluster to which to connect.
     * 
     */
    private final @Nullable String clusterId;
    /**
     * @return The database to which to connect.
     * 
     */
    private final String database;
    /**
     * @return The host to which to connect.
     * 
     */
    private final @Nullable String host;
    /**
     * @return The port to which to connect.
     * 
     */
    private final @Nullable Integer port;

    @CustomType.Constructor
    private DataSourceParametersRedshift(
        @CustomType.Parameter("clusterId") @Nullable String clusterId,
        @CustomType.Parameter("database") String database,
        @CustomType.Parameter("host") @Nullable String host,
        @CustomType.Parameter("port") @Nullable Integer port) {
        this.clusterId = clusterId;
        this.database = database;
        this.host = host;
        this.port = port;
    }

    /**
     * @return The ID of the cluster to which to connect.
     * 
     */
    public Optional<String> clusterId() {
        return Optional.ofNullable(this.clusterId);
    }
    /**
     * @return The database to which to connect.
     * 
     */
    public String database() {
        return this.database;
    }
    /**
     * @return The host to which to connect.
     * 
     */
    public Optional<String> host() {
        return Optional.ofNullable(this.host);
    }
    /**
     * @return The port to which to connect.
     * 
     */
    public Optional<Integer> port() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersRedshift defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterId;
        private String database;
        private @Nullable String host;
        private @Nullable Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersRedshift defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Builder database(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = host;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }        public DataSourceParametersRedshift build() {
            return new DataSourceParametersRedshift(clusterId, database, host, port);
        }
    }
}
