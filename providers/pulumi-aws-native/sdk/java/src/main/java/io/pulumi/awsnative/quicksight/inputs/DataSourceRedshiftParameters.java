// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>Amazon Redshift parameters. The <code>ClusterId</code> field can be blank if
 *             <code>Host</code> and <code>Port</code> are both set. The <code>Host</code> and
 *             <code>Port</code> fields can be blank if the <code>ClusterId</code> field is set.</p>
 * 
 */
public final class DataSourceRedshiftParameters extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceRedshiftParameters Empty = new DataSourceRedshiftParameters();

    /**
     * <p>Cluster ID. This field can be blank if the <code>Host</code> and <code>Port</code> are
     *             provided.</p>
     * 
     */
    @InputImport(name="clusterId")
    private final @Nullable String clusterId;

    public Optional<String> getClusterId() {
        return this.clusterId == null ? Optional.empty() : Optional.ofNullable(this.clusterId);
    }

    /**
     * <p>Database.</p>
     * 
     */
    @InputImport(name="database", required=true)
    private final String database;

    public String getDatabase() {
        return this.database;
    }

    /**
     * <p>Host. This field can be blank if <code>ClusterId</code> is provided.</p>
     * 
     */
    @InputImport(name="host")
    private final @Nullable String host;

    public Optional<String> getHost() {
        return this.host == null ? Optional.empty() : Optional.ofNullable(this.host);
    }

    /**
     * <p>Port. This field can be blank if the <code>ClusterId</code> is provided.</p>
     * 
     */
    @InputImport(name="port")
    private final @Nullable Double port;

    public Optional<Double> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    public DataSourceRedshiftParameters(
        @Nullable String clusterId,
        String database,
        @Nullable String host,
        @Nullable Double port) {
        this.clusterId = clusterId;
        this.database = Objects.requireNonNull(database, "expected parameter 'database' to be non-null");
        this.host = host;
        this.port = port;
    }

    private DataSourceRedshiftParameters() {
        this.clusterId = null;
        this.database = null;
        this.host = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRedshiftParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clusterId;
        private String database;
        private @Nullable String host;
        private @Nullable Double port;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceRedshiftParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.database = defaults.database;
    	      this.host = defaults.host;
    	      this.port = defaults.port;
        }

        public Builder setClusterId(@Nullable String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        public Builder setDatabase(String database) {
            this.database = Objects.requireNonNull(database);
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setPort(@Nullable Double port) {
            this.port = port;
            return this;
        }

        public DataSourceRedshiftParameters build() {
            return new DataSourceRedshiftParameters(clusterId, database, host, port);
        }
    }
}
