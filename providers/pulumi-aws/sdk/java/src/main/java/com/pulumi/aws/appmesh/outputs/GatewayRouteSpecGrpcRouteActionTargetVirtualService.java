// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GatewayRouteSpecGrpcRouteActionTargetVirtualService {
    /**
     * @return The name of the virtual service that traffic is routed to. Must be between 1 and 255 characters in length.
     * 
     */
    private final String virtualServiceName;

    @CustomType.Constructor
    private GatewayRouteSpecGrpcRouteActionTargetVirtualService(@CustomType.Parameter("virtualServiceName") String virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
    }

    /**
     * @return The name of the virtual service that traffic is routed to. Must be between 1 and 255 characters in length.
     * 
     */
    public String virtualServiceName() {
        return this.virtualServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecGrpcRouteActionTargetVirtualService defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String virtualServiceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecGrpcRouteActionTargetVirtualService defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualServiceName = defaults.virtualServiceName;
        }

        public Builder virtualServiceName(String virtualServiceName) {
            this.virtualServiceName = Objects.requireNonNull(virtualServiceName);
            return this;
        }        public GatewayRouteSpecGrpcRouteActionTargetVirtualService build() {
            return new GatewayRouteSpecGrpcRouteActionTargetVirtualService(virtualServiceName);
        }
    }
}
