// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SqlConnectivityUpdateSettingsResponse {
    /**
     * SQL Server connectivity option.
     * 
     */
    private final @Nullable String connectivityType;
    /**
     * SQL Server port.
     * 
     */
    private final @Nullable Integer port;

    @OutputCustomType.Constructor({"connectivityType","port"})
    private SqlConnectivityUpdateSettingsResponse(
        @Nullable String connectivityType,
        @Nullable Integer port) {
        this.connectivityType = connectivityType;
        this.port = port;
    }

    /**
     * SQL Server connectivity option.
     * 
    */
    public Optional<String> getConnectivityType() {
        return Optional.ofNullable(this.connectivityType);
    }
    /**
     * SQL Server port.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlConnectivityUpdateSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectivityType;
        private @Nullable Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlConnectivityUpdateSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectivityType = defaults.connectivityType;
    	      this.port = defaults.port;
        }

        public Builder setConnectivityType(@Nullable String connectivityType) {
            this.connectivityType = connectivityType;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public SqlConnectivityUpdateSettingsResponse build() {
            return new SqlConnectivityUpdateSettingsResponse(connectivityType, port);
        }
    }
}