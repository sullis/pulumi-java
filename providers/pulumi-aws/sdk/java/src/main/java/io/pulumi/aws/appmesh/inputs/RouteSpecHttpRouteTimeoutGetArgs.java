// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutIdleGetArgs;
import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteTimeoutPerRequestGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteTimeoutGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteTimeoutGetArgs Empty = new RouteSpecHttpRouteTimeoutGetArgs();

    /**
     * The idle timeout. An idle timeout bounds the amount of time that a connection may be idle.
     * 
     */
    @Import(name="idle")
      private final @Nullable Output<RouteSpecHttpRouteTimeoutIdleGetArgs> idle;

    public Output<RouteSpecHttpRouteTimeoutIdleGetArgs> idle() {
        return this.idle == null ? Codegen.empty() : this.idle;
    }

    /**
     * The per request timeout.
     * 
     */
    @Import(name="perRequest")
      private final @Nullable Output<RouteSpecHttpRouteTimeoutPerRequestGetArgs> perRequest;

    public Output<RouteSpecHttpRouteTimeoutPerRequestGetArgs> perRequest() {
        return this.perRequest == null ? Codegen.empty() : this.perRequest;
    }

    public RouteSpecHttpRouteTimeoutGetArgs(
        @Nullable Output<RouteSpecHttpRouteTimeoutIdleGetArgs> idle,
        @Nullable Output<RouteSpecHttpRouteTimeoutPerRequestGetArgs> perRequest) {
        this.idle = idle;
        this.perRequest = perRequest;
    }

    private RouteSpecHttpRouteTimeoutGetArgs() {
        this.idle = Codegen.empty();
        this.perRequest = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteTimeoutGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RouteSpecHttpRouteTimeoutIdleGetArgs> idle;
        private @Nullable Output<RouteSpecHttpRouteTimeoutPerRequestGetArgs> perRequest;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteTimeoutGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.idle = defaults.idle;
    	      this.perRequest = defaults.perRequest;
        }

        public Builder idle(@Nullable Output<RouteSpecHttpRouteTimeoutIdleGetArgs> idle) {
            this.idle = idle;
            return this;
        }
        public Builder idle(@Nullable RouteSpecHttpRouteTimeoutIdleGetArgs idle) {
            this.idle = Codegen.ofNullable(idle);
            return this;
        }
        public Builder perRequest(@Nullable Output<RouteSpecHttpRouteTimeoutPerRequestGetArgs> perRequest) {
            this.perRequest = perRequest;
            return this;
        }
        public Builder perRequest(@Nullable RouteSpecHttpRouteTimeoutPerRequestGetArgs perRequest) {
            this.perRequest = Codegen.ofNullable(perRequest);
            return this;
        }        public RouteSpecHttpRouteTimeoutGetArgs build() {
            return new RouteSpecHttpRouteTimeoutGetArgs(idle, perRequest);
        }
    }
}
