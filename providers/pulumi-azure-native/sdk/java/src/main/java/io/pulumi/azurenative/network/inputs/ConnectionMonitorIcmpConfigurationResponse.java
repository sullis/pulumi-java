// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the ICMP configuration.
 * 
 */
public final class ConnectionMonitorIcmpConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorIcmpConfigurationResponse Empty = new ConnectionMonitorIcmpConfigurationResponse();

    /**
     * Value indicating whether path evaluation with trace route should be disabled.
     * 
     */
    @InputImport(name="disableTraceRoute")
      private final @Nullable Boolean disableTraceRoute;

    public Optional<Boolean> getDisableTraceRoute() {
        return this.disableTraceRoute == null ? Optional.empty() : Optional.ofNullable(this.disableTraceRoute);
    }

    public ConnectionMonitorIcmpConfigurationResponse(@Nullable Boolean disableTraceRoute) {
        this.disableTraceRoute = disableTraceRoute;
    }

    private ConnectionMonitorIcmpConfigurationResponse() {
        this.disableTraceRoute = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorIcmpConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean disableTraceRoute;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorIcmpConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disableTraceRoute = defaults.disableTraceRoute;
        }

        public Builder setDisableTraceRoute(@Nullable Boolean disableTraceRoute) {
            this.disableTraceRoute = disableTraceRoute;
            return this;
        }
        public ConnectionMonitorIcmpConfigurationResponse build() {
            return new ConnectionMonitorIcmpConfigurationResponse(disableTraceRoute);
        }
    }
}