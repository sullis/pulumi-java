// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.DestinationPortBehavior;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes the TCP configuration.
 * 
 */
public final class ConnectionMonitorTcpConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionMonitorTcpConfigurationArgs Empty = new ConnectionMonitorTcpConfigurationArgs();

    /**
     * Destination port behavior.
     * 
     */
    @InputImport(name="destinationPortBehavior")
    private final @Nullable Input<Either<String,DestinationPortBehavior>> destinationPortBehavior;

    public Input<Either<String,DestinationPortBehavior>> getDestinationPortBehavior() {
        return this.destinationPortBehavior == null ? Input.empty() : this.destinationPortBehavior;
    }

    /**
     * Value indicating whether path evaluation with trace route should be disabled.
     * 
     */
    @InputImport(name="disableTraceRoute")
    private final @Nullable Input<Boolean> disableTraceRoute;

    public Input<Boolean> getDisableTraceRoute() {
        return this.disableTraceRoute == null ? Input.empty() : this.disableTraceRoute;
    }

    /**
     * The port to connect to.
     * 
     */
    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    public ConnectionMonitorTcpConfigurationArgs(
        @Nullable Input<Either<String,DestinationPortBehavior>> destinationPortBehavior,
        @Nullable Input<Boolean> disableTraceRoute,
        @Nullable Input<Integer> port) {
        this.destinationPortBehavior = destinationPortBehavior;
        this.disableTraceRoute = disableTraceRoute;
        this.port = port;
    }

    private ConnectionMonitorTcpConfigurationArgs() {
        this.destinationPortBehavior = Input.empty();
        this.disableTraceRoute = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorTcpConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,DestinationPortBehavior>> destinationPortBehavior;
        private @Nullable Input<Boolean> disableTraceRoute;
        private @Nullable Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorTcpConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPortBehavior = defaults.destinationPortBehavior;
    	      this.disableTraceRoute = defaults.disableTraceRoute;
    	      this.port = defaults.port;
        }

        public Builder setDestinationPortBehavior(@Nullable Input<Either<String,DestinationPortBehavior>> destinationPortBehavior) {
            this.destinationPortBehavior = destinationPortBehavior;
            return this;
        }

        public Builder setDestinationPortBehavior(@Nullable Either<String,DestinationPortBehavior> destinationPortBehavior) {
            this.destinationPortBehavior = Input.ofNullable(destinationPortBehavior);
            return this;
        }

        public Builder setDisableTraceRoute(@Nullable Input<Boolean> disableTraceRoute) {
            this.disableTraceRoute = disableTraceRoute;
            return this;
        }

        public Builder setDisableTraceRoute(@Nullable Boolean disableTraceRoute) {
            this.disableTraceRoute = Input.ofNullable(disableTraceRoute);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public ConnectionMonitorTcpConfigurationArgs build() {
            return new ConnectionMonitorTcpConfigurationArgs(destinationPortBehavior, disableTraceRoute, port);
        }
    }
}
