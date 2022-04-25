// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.RouteSpecTcpRouteAction;
import com.pulumi.aws.appmesh.outputs.RouteSpecTcpRouteTimeout;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecTcpRoute {
    /**
     * @return The action to take if a match is determined.
     * 
     */
    private final RouteSpecTcpRouteAction action;
    /**
     * @return The types of timeouts.
     * 
     */
    private final @Nullable RouteSpecTcpRouteTimeout timeout;

    @CustomType.Constructor
    private RouteSpecTcpRoute(
        @CustomType.Parameter("action") RouteSpecTcpRouteAction action,
        @CustomType.Parameter("timeout") @Nullable RouteSpecTcpRouteTimeout timeout) {
        this.action = action;
        this.timeout = timeout;
    }

    /**
     * @return The action to take if a match is determined.
     * 
     */
    public RouteSpecTcpRouteAction action() {
        return this.action;
    }
    /**
     * @return The types of timeouts.
     * 
     */
    public Optional<RouteSpecTcpRouteTimeout> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecTcpRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecTcpRouteAction action;
        private @Nullable RouteSpecTcpRouteTimeout timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecTcpRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.timeout = defaults.timeout;
        }

        public Builder action(RouteSpecTcpRouteAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder timeout(@Nullable RouteSpecTcpRouteTimeout timeout) {
            this.timeout = timeout;
            return this;
        }        public RouteSpecTcpRoute build() {
            return new RouteSpecTcpRoute(action, timeout);
        }
    }
}
