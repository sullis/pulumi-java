// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.StaticRouteResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class VnetRouteResponse {
    /**
     * List of all Static Routes.
     * 
     */
    private final @Nullable List<StaticRouteResponse> staticRoutes;

    @OutputCustomType.Constructor({"staticRoutes"})
    private VnetRouteResponse(@Nullable List<StaticRouteResponse> staticRoutes) {
        this.staticRoutes = staticRoutes;
    }

    /**
     * List of all Static Routes.
     * 
    */
    public List<StaticRouteResponse> getStaticRoutes() {
        return this.staticRoutes == null ? List.of() : this.staticRoutes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VnetRouteResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<StaticRouteResponse> staticRoutes;

        public Builder() {
    	      // Empty
        }

        public Builder(VnetRouteResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.staticRoutes = defaults.staticRoutes;
        }

        public Builder setStaticRoutes(@Nullable List<StaticRouteResponse> staticRoutes) {
            this.staticRoutes = staticRoutes;
            return this;
        }
        public VnetRouteResponse build() {
            return new VnetRouteResponse(staticRoutes);
        }
    }
}