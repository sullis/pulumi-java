// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecHttpRouteAction;
import io.pulumi.aws.appmesh.outputs.RouteSpecHttpRouteMatch;
import io.pulumi.aws.appmesh.outputs.RouteSpecHttpRouteRetryPolicy;
import io.pulumi.aws.appmesh.outputs.RouteSpecHttpRouteTimeout;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecHttpRoute {
    /**
     * The action to take if a match is determined.
     * 
     */
    private final RouteSpecHttpRouteAction action;
    /**
     * The criteria for determining an HTTP request match.
     * 
     */
    private final RouteSpecHttpRouteMatch match;
    /**
     * The retry policy.
     * 
     */
    private final @Nullable RouteSpecHttpRouteRetryPolicy retryPolicy;
    /**
     * The types of timeouts.
     * 
     */
    private final @Nullable RouteSpecHttpRouteTimeout timeout;

    @CustomType.Constructor
    private RouteSpecHttpRoute(
        @CustomType.Parameter("action") RouteSpecHttpRouteAction action,
        @CustomType.Parameter("match") RouteSpecHttpRouteMatch match,
        @CustomType.Parameter("retryPolicy") @Nullable RouteSpecHttpRouteRetryPolicy retryPolicy,
        @CustomType.Parameter("timeout") @Nullable RouteSpecHttpRouteTimeout timeout) {
        this.action = action;
        this.match = match;
        this.retryPolicy = retryPolicy;
        this.timeout = timeout;
    }

    /**
     * The action to take if a match is determined.
     * 
    */
    public RouteSpecHttpRouteAction getAction() {
        return this.action;
    }
    /**
     * The criteria for determining an HTTP request match.
     * 
    */
    public RouteSpecHttpRouteMatch getMatch() {
        return this.match;
    }
    /**
     * The retry policy.
     * 
    */
    public Optional<RouteSpecHttpRouteRetryPolicy> getRetryPolicy() {
        return Optional.ofNullable(this.retryPolicy);
    }
    /**
     * The types of timeouts.
     * 
    */
    public Optional<RouteSpecHttpRouteTimeout> getTimeout() {
        return Optional.ofNullable(this.timeout);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRoute defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteSpecHttpRouteAction action;
        private RouteSpecHttpRouteMatch match;
        private @Nullable RouteSpecHttpRouteRetryPolicy retryPolicy;
        private @Nullable RouteSpecHttpRouteTimeout timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRoute defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.match = defaults.match;
    	      this.retryPolicy = defaults.retryPolicy;
    	      this.timeout = defaults.timeout;
        }

        public Builder action(RouteSpecHttpRouteAction action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder match(RouteSpecHttpRouteMatch match) {
            this.match = Objects.requireNonNull(match);
            return this;
        }
        public Builder retryPolicy(@Nullable RouteSpecHttpRouteRetryPolicy retryPolicy) {
            this.retryPolicy = retryPolicy;
            return this;
        }
        public Builder timeout(@Nullable RouteSpecHttpRouteTimeout timeout) {
            this.timeout = timeout;
            return this;
        }        public RouteSpecHttpRoute build() {
            return new RouteSpecHttpRoute(action, match, retryPolicy, timeout);
        }
    }
}
