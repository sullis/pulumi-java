// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerregistry.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListTaskRunDetailsArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListTaskRunDetailsArgs Empty = new ListTaskRunDetailsArgs();

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

    /**
     * The name of the task run.
     * 
     */
    @Import(name="taskRunName", required=true)
    private Output<String> taskRunName;

    /**
     * @return The name of the task run.
     * 
     */
    public Output<String> taskRunName() {
        return this.taskRunName;
    }

    private ListTaskRunDetailsArgs() {}

    private ListTaskRunDetailsArgs(ListTaskRunDetailsArgs $) {
        this.registryName = $.registryName;
        this.resourceGroupName = $.resourceGroupName;
        this.taskRunName = $.taskRunName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListTaskRunDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListTaskRunDetailsArgs $;

        public Builder() {
            $ = new ListTaskRunDetailsArgs();
        }

        public Builder(ListTaskRunDetailsArgs defaults) {
            $ = new ListTaskRunDetailsArgs(Objects.requireNonNull(defaults));
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

        /**
         * @param taskRunName The name of the task run.
         * 
         * @return builder
         * 
         */
        public Builder taskRunName(Output<String> taskRunName) {
            $.taskRunName = taskRunName;
            return this;
        }

        /**
         * @param taskRunName The name of the task run.
         * 
         * @return builder
         * 
         */
        public Builder taskRunName(String taskRunName) {
            return taskRunName(Output.of(taskRunName));
        }

        public ListTaskRunDetailsArgs build() {
            $.registryName = Objects.requireNonNull($.registryName, "expected parameter 'registryName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.taskRunName = Objects.requireNonNull($.taskRunName, "expected parameter 'taskRunName' to be non-null");
            return $;
        }
    }

}
