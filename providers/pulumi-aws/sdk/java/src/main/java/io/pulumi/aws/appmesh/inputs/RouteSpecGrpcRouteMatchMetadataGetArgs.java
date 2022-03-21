// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecGrpcRouteMatchMetadataMatchGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecGrpcRouteMatchMetadataGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecGrpcRouteMatchMetadataGetArgs Empty = new RouteSpecGrpcRouteMatchMetadataGetArgs();

    /**
     * If `true`, the match is on the opposite of the `match` criteria. Default is `false`.
     * 
     */
    @Import(name="invert")
      private final @Nullable Output<Boolean> invert;

    public Output<Boolean> getInvert() {
        return this.invert == null ? Output.empty() : this.invert;
    }

    /**
     * The data to match from the request.
     * 
     */
    @Import(name="match")
      private final @Nullable Output<RouteSpecGrpcRouteMatchMetadataMatchGetArgs> match;

    public Output<RouteSpecGrpcRouteMatchMetadataMatchGetArgs> getMatch() {
        return this.match == null ? Output.empty() : this.match;
    }

    /**
     * The name of the route. Must be between 1 and 50 characters in length.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public RouteSpecGrpcRouteMatchMetadataGetArgs(
        @Nullable Output<Boolean> invert,
        @Nullable Output<RouteSpecGrpcRouteMatchMetadataMatchGetArgs> match,
        Output<String> name) {
        this.invert = invert;
        this.match = match;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private RouteSpecGrpcRouteMatchMetadataGetArgs() {
        this.invert = Output.empty();
        this.match = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecGrpcRouteMatchMetadataGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> invert;
        private @Nullable Output<RouteSpecGrpcRouteMatchMetadataMatchGetArgs> match;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecGrpcRouteMatchMetadataGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invert = defaults.invert;
    	      this.match = defaults.match;
    	      this.name = defaults.name;
        }

        public Builder invert(@Nullable Output<Boolean> invert) {
            this.invert = invert;
            return this;
        }
        public Builder invert(@Nullable Boolean invert) {
            this.invert = Output.ofNullable(invert);
            return this;
        }
        public Builder match(@Nullable Output<RouteSpecGrpcRouteMatchMetadataMatchGetArgs> match) {
            this.match = match;
            return this;
        }
        public Builder match(@Nullable RouteSpecGrpcRouteMatchMetadataMatchGetArgs match) {
            this.match = Output.ofNullable(match);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public RouteSpecGrpcRouteMatchMetadataGetArgs build() {
            return new RouteSpecGrpcRouteMatchMetadataGetArgs(invert, match, name);
        }
    }
}
