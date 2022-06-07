// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetPipelineRunArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetPipelineRunArgs Empty = new GetPipelineRunArgs();

    /**
     * The name of the pipeline run.
     * 
     */
    @Import(name="pipelineRunName", required=true)
    private Output<String> pipelineRunName;

    /**
     * @return The name of the pipeline run.
     * 
     */
    public Output<String> pipelineRunName() {
        return this.pipelineRunName;
    }

    /**
     * The name of the container registry.
     * 
     */
    @Import(name="registryName", required=true)
    private Output<String> registryName;

    /**
     * @return The name of the container registry.
     * 
     */
    public Output<String> registryName() {
        return this.registryName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group to which the container registry belongs.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetPipelineRunArgs() {}

    private GetPipelineRunArgs(GetPipelineRunArgs $) {
        this.pipelineRunName = $.pipelineRunName;
        this.registryName = $.registryName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPipelineRunArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPipelineRunArgs $;

        public Builder() {
            $ = new GetPipelineRunArgs();
        }

        public Builder(GetPipelineRunArgs defaults) {
            $ = new GetPipelineRunArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param pipelineRunName The name of the pipeline run.
         * 
         * @return builder
         * 
         */
        public Builder pipelineRunName(Output<String> pipelineRunName) {
            $.pipelineRunName = pipelineRunName;
            return this;
        }

        /**
         * @param pipelineRunName The name of the pipeline run.
         * 
         * @return builder
         * 
         */
        public Builder pipelineRunName(String pipelineRunName) {
            return pipelineRunName(Output.of(pipelineRunName));
        }

        /**
         * @param registryName The name of the container registry.
         * 
         * @return builder
         * 
         */
        public Builder registryName(Output<String> registryName) {
            $.registryName = registryName;
            return this;
        }

        /**
         * @param registryName The name of the container registry.
         * 
         * @return builder
         * 
         */
        public Builder registryName(String registryName) {
            return registryName(Output.of(registryName));
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group to which the container registry belongs.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetPipelineRunArgs build() {
            $.pipelineRunName = Objects.requireNonNull($.pipelineRunName, "expected parameter 'pipelineRunName' to be non-null");
            $.registryName = Objects.requireNonNull($.registryName, "expected parameter 'registryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
