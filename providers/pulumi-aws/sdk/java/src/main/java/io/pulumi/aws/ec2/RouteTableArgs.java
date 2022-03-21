// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.aws.ec2.inputs.RouteTableRouteArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteTableArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteTableArgs Empty = new RouteTableArgs();

    /**
     * A list of virtual gateways for propagation.
     * 
     */
    @Import(name="propagatingVgws")
      private final @Nullable Output<List<String>> propagatingVgws;

    public Output<List<String>> getPropagatingVgws() {
        return this.propagatingVgws == null ? Output.empty() : this.propagatingVgws;
    }

    /**
     * A list of route objects. Their keys are documented below.
     * 
     */
    @Import(name="routes")
      private final @Nullable Output<List<RouteTableRouteArgs>> routes;

    public Output<List<RouteTableRouteArgs>> getRoutes() {
        return this.routes == null ? Output.empty() : this.routes;
    }

    /**
     * A map of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The VPC ID.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public RouteTableArgs(
        @Nullable Output<List<String>> propagatingVgws,
        @Nullable Output<List<RouteTableRouteArgs>> routes,
        @Nullable Output<Map<String,String>> tags,
        Output<String> vpcId) {
        this.propagatingVgws = propagatingVgws;
        this.routes = routes;
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private RouteTableArgs() {
        this.propagatingVgws = Output.empty();
        this.routes = Output.empty();
        this.tags = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteTableArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> propagatingVgws;
        private @Nullable Output<List<RouteTableRouteArgs>> routes;
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteTableArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propagatingVgws = defaults.propagatingVgws;
    	      this.routes = defaults.routes;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder propagatingVgws(@Nullable Output<List<String>> propagatingVgws) {
            this.propagatingVgws = propagatingVgws;
            return this;
        }
        public Builder propagatingVgws(@Nullable List<String> propagatingVgws) {
            this.propagatingVgws = Output.ofNullable(propagatingVgws);
            return this;
        }
        public Builder propagatingVgws(String... propagatingVgws) {
            return propagatingVgws(List.of(propagatingVgws));
        }
        public Builder routes(@Nullable Output<List<RouteTableRouteArgs>> routes) {
            this.routes = routes;
            return this;
        }
        public Builder routes(@Nullable List<RouteTableRouteArgs> routes) {
            this.routes = Output.ofNullable(routes);
            return this;
        }
        public Builder routes(RouteTableRouteArgs... routes) {
            return routes(List.of(routes));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }        public RouteTableArgs build() {
            return new RouteTableArgs(propagatingVgws, routes, tags, vpcId);
        }
    }
}
