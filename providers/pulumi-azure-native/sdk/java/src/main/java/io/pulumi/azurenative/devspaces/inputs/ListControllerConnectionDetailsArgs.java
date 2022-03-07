// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devspaces.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListControllerConnectionDetailsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListControllerConnectionDetailsArgs Empty = new ListControllerConnectionDetailsArgs();

    /**
     * Name of the resource.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource ID of the target container host mapped to the Azure Dev Spaces Controller.
     * 
     */
    @InputImport(name="targetContainerHostResourceId", required=true)
      private final String targetContainerHostResourceId;

    public String getTargetContainerHostResourceId() {
        return this.targetContainerHostResourceId;
    }

    public ListControllerConnectionDetailsArgs(
        String name,
        String resourceGroupName,
        String targetContainerHostResourceId) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.targetContainerHostResourceId = Objects.requireNonNull(targetContainerHostResourceId, "expected parameter 'targetContainerHostResourceId' to be non-null");
    }

    private ListControllerConnectionDetailsArgs() {
        this.name = null;
        this.resourceGroupName = null;
        this.targetContainerHostResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListControllerConnectionDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String resourceGroupName;
        private String targetContainerHostResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ListControllerConnectionDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.targetContainerHostResourceId = defaults.targetContainerHostResourceId;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTargetContainerHostResourceId(String targetContainerHostResourceId) {
            this.targetContainerHostResourceId = Objects.requireNonNull(targetContainerHostResourceId);
            return this;
        }
        public ListControllerConnectionDetailsArgs build() {
            return new ListControllerConnectionDetailsArgs(name, resourceGroupName, targetContainerHostResourceId);
        }
    }
}