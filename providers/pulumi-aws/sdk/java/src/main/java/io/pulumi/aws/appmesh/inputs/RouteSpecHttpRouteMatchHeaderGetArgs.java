// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderMatchGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteMatchHeaderGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteMatchHeaderGetArgs Empty = new RouteSpecHttpRouteMatchHeaderGetArgs();

    /**
     * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
     * 
     */
    @Import(name="invert")
      private final @Nullable Output<Boolean> invert;

    public Output<Boolean> invert() {
        return this.invert == null ? Codegen.empty() : this.invert;
    }

    /**
     * The method and value to match the header value sent with a request. Specify one match method.
     * 
     */
    @Import(name="match")
      private final @Nullable Output<RouteSpecHttpRouteMatchHeaderMatchGetArgs> match;

    public Output<RouteSpecHttpRouteMatchHeaderMatchGetArgs> match() {
        return this.match == null ? Codegen.empty() : this.match;
    }

    /**
     * A name for the HTTP header in the client request that will be matched on.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    public RouteSpecHttpRouteMatchHeaderGetArgs(
        @Nullable Output<Boolean> invert,
        @Nullable Output<RouteSpecHttpRouteMatchHeaderMatchGetArgs> match,
        Output<String> name) {
        this.invert = invert;
        this.match = match;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private RouteSpecHttpRouteMatchHeaderGetArgs() {
        this.invert = Codegen.empty();
        this.match = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteMatchHeaderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> invert;
        private @Nullable Output<RouteSpecHttpRouteMatchHeaderMatchGetArgs> match;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteMatchHeaderGetArgs defaults) {
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
            this.invert = Codegen.ofNullable(invert);
            return this;
        }
        public Builder match(@Nullable Output<RouteSpecHttpRouteMatchHeaderMatchGetArgs> match) {
            this.match = match;
            return this;
        }
        public Builder match(@Nullable RouteSpecHttpRouteMatchHeaderMatchGetArgs match) {
            this.match = Codegen.ofNullable(match);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public RouteSpecHttpRouteMatchHeaderGetArgs build() {
            return new RouteSpecHttpRouteMatchHeaderGetArgs(invert, match, name);
        }
    }
}
