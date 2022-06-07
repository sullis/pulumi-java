// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListBuildTaskSourceRepositoryPropertiesArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListBuildTaskSourceRepositoryPropertiesArgs Empty = new ListBuildTaskSourceRepositoryPropertiesArgs();

    /**
     * The name of the container registry build task.
     * 
     */
    @Import(name="buildTaskName", required=true)
    private Output<String> buildTaskName;

    /**
     * @return The name of the container registry build task.
     * 
     */
    public Output<String> buildTaskName() {
        return this.buildTaskName;
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

    private ListBuildTaskSourceRepositoryPropertiesArgs() {}

    private ListBuildTaskSourceRepositoryPropertiesArgs(ListBuildTaskSourceRepositoryPropertiesArgs $) {
        this.buildTaskName = $.buildTaskName;
        this.registryName = $.registryName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListBuildTaskSourceRepositoryPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListBuildTaskSourceRepositoryPropertiesArgs $;

        public Builder() {
            $ = new ListBuildTaskSourceRepositoryPropertiesArgs();
        }

        public Builder(ListBuildTaskSourceRepositoryPropertiesArgs defaults) {
            $ = new ListBuildTaskSourceRepositoryPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buildTaskName The name of the container registry build task.
         * 
         * @return builder
         * 
         */
        public Builder buildTaskName(Output<String> buildTaskName) {
            $.buildTaskName = buildTaskName;
            return this;
        }

        /**
         * @param buildTaskName The name of the container registry build task.
         * 
         * @return builder
         * 
         */
        public Builder buildTaskName(String buildTaskName) {
            return buildTaskName(Output.of(buildTaskName));
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

        public ListBuildTaskSourceRepositoryPropertiesArgs build() {
            $.buildTaskName = Objects.requireNonNull($.buildTaskName, "expected parameter 'buildTaskName' to be non-null");
            $.registryName = Objects.requireNonNull($.registryName, "expected parameter 'registryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
