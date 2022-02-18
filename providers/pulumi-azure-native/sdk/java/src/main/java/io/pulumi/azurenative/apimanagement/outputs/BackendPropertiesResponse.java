// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.azurenative.apimanagement.outputs.BackendServiceFabricClusterPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BackendPropertiesResponse {
    /**
     * Backend Service Fabric Cluster Properties
     * 
     */
    private final @Nullable BackendServiceFabricClusterPropertiesResponse serviceFabricCluster;

    @OutputCustomType.Constructor({"serviceFabricCluster"})
    private BackendPropertiesResponse(@Nullable BackendServiceFabricClusterPropertiesResponse serviceFabricCluster) {
        this.serviceFabricCluster = serviceFabricCluster;
    }

    /**
     * Backend Service Fabric Cluster Properties
     * 
     */
    public Optional<BackendServiceFabricClusterPropertiesResponse> getServiceFabricCluster() {
        return Optional.ofNullable(this.serviceFabricCluster);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BackendServiceFabricClusterPropertiesResponse serviceFabricCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceFabricCluster = defaults.serviceFabricCluster;
        }

        public Builder setServiceFabricCluster(@Nullable BackendServiceFabricClusterPropertiesResponse serviceFabricCluster) {
            this.serviceFabricCluster = serviceFabricCluster;
            return this;
        }

        public BackendPropertiesResponse build() {
            return new BackendPropertiesResponse(serviceFabricCluster);
        }
    }
}
