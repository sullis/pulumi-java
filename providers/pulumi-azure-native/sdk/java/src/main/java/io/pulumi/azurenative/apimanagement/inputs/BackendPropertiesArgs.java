// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.BackendServiceFabricClusterPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties specific to the Backend Type.
 * 
 */
public final class BackendPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendPropertiesArgs Empty = new BackendPropertiesArgs();

    /**
     * Backend Service Fabric Cluster Properties
     * 
     */
    @InputImport(name="serviceFabricCluster")
      private final @Nullable Input<BackendServiceFabricClusterPropertiesArgs> serviceFabricCluster;

    public Input<BackendServiceFabricClusterPropertiesArgs> getServiceFabricCluster() {
        return this.serviceFabricCluster == null ? Input.empty() : this.serviceFabricCluster;
    }

    public BackendPropertiesArgs(@Nullable Input<BackendServiceFabricClusterPropertiesArgs> serviceFabricCluster) {
        this.serviceFabricCluster = serviceFabricCluster;
    }

    private BackendPropertiesArgs() {
        this.serviceFabricCluster = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BackendServiceFabricClusterPropertiesArgs> serviceFabricCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceFabricCluster = defaults.serviceFabricCluster;
        }

        public Builder setServiceFabricCluster(@Nullable Input<BackendServiceFabricClusterPropertiesArgs> serviceFabricCluster) {
            this.serviceFabricCluster = serviceFabricCluster;
            return this;
        }

        public Builder setServiceFabricCluster(@Nullable BackendServiceFabricClusterPropertiesArgs serviceFabricCluster) {
            this.serviceFabricCluster = Input.ofNullable(serviceFabricCluster);
            return this;
        }
        public BackendPropertiesArgs build() {
            return new BackendPropertiesArgs(serviceFabricCluster);
        }
    }
}