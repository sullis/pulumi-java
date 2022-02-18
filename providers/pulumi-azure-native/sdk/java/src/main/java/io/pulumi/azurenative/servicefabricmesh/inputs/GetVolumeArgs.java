// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVolumeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVolumeArgs Empty = new GetVolumeArgs();

    /**
     * Azure resource group name
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The identity of the volume.
     * 
     */
    @InputImport(name="volumeResourceName", required=true)
    private final String volumeResourceName;

    public String getVolumeResourceName() {
        return this.volumeResourceName;
    }

    public GetVolumeArgs(
        String resourceGroupName,
        String volumeResourceName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.volumeResourceName = Objects.requireNonNull(volumeResourceName, "expected parameter 'volumeResourceName' to be non-null");
    }

    private GetVolumeArgs() {
        this.resourceGroupName = null;
        this.volumeResourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String volumeResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.volumeResourceName = defaults.volumeResourceName;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVolumeResourceName(String volumeResourceName) {
            this.volumeResourceName = Objects.requireNonNull(volumeResourceName);
            return this;
        }

        public GetVolumeArgs build() {
            return new GetVolumeArgs(resourceGroupName, volumeResourceName);
        }
    }
}
