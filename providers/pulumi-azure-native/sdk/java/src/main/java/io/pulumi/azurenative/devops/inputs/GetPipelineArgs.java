// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devops.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPipelineArgs Empty = new GetPipelineArgs();

    /**
     * The name of the Pipeline resource in ARM.
     * 
     */
    @InputImport(name="pipelineName", required=true)
    private final String pipelineName;

    public String getPipelineName() {
        return this.pipelineName;
    }

    /**
     * Name of the resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetPipelineArgs(
        String pipelineName,
        String resourceGroupName) {
        this.pipelineName = Objects.requireNonNull(pipelineName, "expected parameter 'pipelineName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetPipelineArgs() {
        this.pipelineName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String pipelineName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pipelineName = defaults.pipelineName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setPipelineName(String pipelineName) {
            this.pipelineName = Objects.requireNonNull(pipelineName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetPipelineArgs build() {
            return new GetPipelineArgs(pipelineName, resourceGroupName);
        }
    }
}
