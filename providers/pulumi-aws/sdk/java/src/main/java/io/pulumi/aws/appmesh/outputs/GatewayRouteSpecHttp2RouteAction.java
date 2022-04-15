// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttp2RouteActionTarget;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GatewayRouteSpecHttp2RouteAction {
    /**
     * The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    private final GatewayRouteSpecHttp2RouteActionTarget target;

    @CustomType.Constructor
    private GatewayRouteSpecHttp2RouteAction(@CustomType.Parameter("target") GatewayRouteSpecHttp2RouteActionTarget target) {
        this.target = target;
    }

    /**
     * The target that traffic is routed to when a request matches the gateway route.
     * 
    */
    public GatewayRouteSpecHttp2RouteActionTarget target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttp2RouteAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecHttp2RouteActionTarget target;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttp2RouteAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder target(GatewayRouteSpecHttp2RouteActionTarget target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public GatewayRouteSpecHttp2RouteAction build() {
            return new GatewayRouteSpecHttp2RouteAction(target);
        }
    }
}
