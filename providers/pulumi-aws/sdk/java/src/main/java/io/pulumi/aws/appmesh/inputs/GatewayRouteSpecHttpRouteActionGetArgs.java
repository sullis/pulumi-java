// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.GatewayRouteSpecHttpRouteActionTargetGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class GatewayRouteSpecHttpRouteActionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GatewayRouteSpecHttpRouteActionGetArgs Empty = new GatewayRouteSpecHttpRouteActionGetArgs();

    /**
     * The target that traffic is routed to when a request matches the gateway route.
     * 
     */
    @Import(name="target", required=true)
      private final Output<GatewayRouteSpecHttpRouteActionTargetGetArgs> target;

    public Output<GatewayRouteSpecHttpRouteActionTargetGetArgs> getTarget() {
        return this.target;
    }

    public GatewayRouteSpecHttpRouteActionGetArgs(Output<GatewayRouteSpecHttpRouteActionTargetGetArgs> target) {
        this.target = Objects.requireNonNull(target, "expected parameter 'target' to be non-null");
    }

    private GatewayRouteSpecHttpRouteActionGetArgs() {
        this.target = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayRouteSpecHttpRouteActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<GatewayRouteSpecHttpRouteActionTargetGetArgs> target;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayRouteSpecHttpRouteActionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.target = defaults.target;
        }

        public Builder target(Output<GatewayRouteSpecHttpRouteActionTargetGetArgs> target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }
        public Builder target(GatewayRouteSpecHttpRouteActionTargetGetArgs target) {
            this.target = Output.of(Objects.requireNonNull(target));
            return this;
        }        public GatewayRouteSpecHttpRouteActionGetArgs build() {
            return new GatewayRouteSpecHttpRouteActionGetArgs(target);
        }
    }
}
