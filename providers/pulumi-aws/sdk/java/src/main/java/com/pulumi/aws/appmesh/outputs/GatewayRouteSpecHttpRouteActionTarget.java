// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.aws.appmesh.outputs.GatewayRouteSpecHttpRouteActionTargetVirtualService;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class GatewayRouteSpecHttpRouteActionTarget {
    /**
     * @return The virtual service gateway route target.
     * 
     */
    private final GatewayRouteSpecHttpRouteActionTargetVirtualService virtualService;

    @CustomType.Constructor
    private GatewayRouteSpecHttpRouteActionTarget(@CustomType.Parameter("virtualService") GatewayRouteSpecHttpRouteActionTargetVirtualService virtualService) {
        this.virtualService = virtualService;
    }

    /**
     * @return The virtual service gateway route target.
     * 
     */
    public GatewayRouteSpecHttpRouteActionTargetVirtualService virtualService() {
        return this.virtualService;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteActionTarget defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecHttpRouteActionTargetVirtualService virtualService;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttpRouteActionTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualService = defaults.virtualService;
        }

        public Builder virtualService(GatewayRouteSpecHttpRouteActionTargetVirtualService virtualService) {
            this.virtualService = Objects.requireNonNull(virtualService);
            return this;
        }        public GatewayRouteSpecHttpRouteActionTarget build() {
            return new GatewayRouteSpecHttpRouteActionTarget(virtualService);
        }
    }
}
