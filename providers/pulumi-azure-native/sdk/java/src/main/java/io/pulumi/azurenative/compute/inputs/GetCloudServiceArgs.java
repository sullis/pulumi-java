// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCloudServiceArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCloudServiceArgs Empty = new GetCloudServiceArgs();

    /**
     * Name of the cloud service.
     * 
     */
    @InputImport(name="cloudServiceName", required=true)
    private final String cloudServiceName;

    public String getCloudServiceName() {
        return this.cloudServiceName;
    }

    /**
     * Name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetCloudServiceArgs(
        String cloudServiceName,
        String resourceGroupName) {
        this.cloudServiceName = Objects.requireNonNull(cloudServiceName, "expected parameter 'cloudServiceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetCloudServiceArgs() {
        this.cloudServiceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCloudServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String cloudServiceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCloudServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudServiceName = defaults.cloudServiceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setCloudServiceName(String cloudServiceName) {
            this.cloudServiceName = Objects.requireNonNull(cloudServiceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetCloudServiceArgs build() {
            return new GetCloudServiceArgs(cloudServiceName, resourceGroupName);
        }
    }
}
