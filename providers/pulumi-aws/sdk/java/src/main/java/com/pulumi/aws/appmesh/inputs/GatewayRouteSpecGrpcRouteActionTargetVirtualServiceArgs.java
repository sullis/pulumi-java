// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs Empty = new GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs();

    /**
     * The name of the virtual service that traffic is routed to. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="virtualServiceName", required=true)
    private Output<String> virtualServiceName;

    /**
     * @return The name of the virtual service that traffic is routed to. Must be between 1 and 255 characters in length.
     * 
     */
    public Output<String> virtualServiceName() {
        return this.virtualServiceName;
    }

    private GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs() {}

    private GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs(GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs $) {
        this.virtualServiceName = $.virtualServiceName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs $;

        public Builder() {
            $ = new GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs();
        }

        public Builder(GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs defaults) {
            $ = new GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param virtualServiceName The name of the virtual service that traffic is routed to. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder virtualServiceName(Output<String> virtualServiceName) {
            $.virtualServiceName = virtualServiceName;
            return this;
        }

        /**
         * @param virtualServiceName The name of the virtual service that traffic is routed to. Must be between 1 and 255 characters in length.
         * 
         * @return builder
         * 
         */
        public Builder virtualServiceName(String virtualServiceName) {
            return virtualServiceName(Output.of(virtualServiceName));
        }

        public GatewayRouteSpecGrpcRouteActionTargetVirtualServiceArgs build() {
            $.virtualServiceName = Objects.requireNonNull($.virtualServiceName, "expected parameter 'virtualServiceName' to be non-null");
            return $;
        }
    }

}
