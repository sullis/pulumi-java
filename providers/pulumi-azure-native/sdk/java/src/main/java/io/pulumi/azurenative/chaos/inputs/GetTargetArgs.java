// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTargetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTargetArgs Empty = new GetTargetArgs();

    /**
     * String that represents a resource provider namespace.
     * 
     */
    @InputImport(name="parentProviderNamespace", required=true)
    private final String parentProviderNamespace;

    public String getParentProviderNamespace() {
        return this.parentProviderNamespace;
    }

    /**
     * String that represents a resource name.
     * 
     */
    @InputImport(name="parentResourceName", required=true)
    private final String parentResourceName;

    public String getParentResourceName() {
        return this.parentResourceName;
    }

    /**
     * String that represents a resource type.
     * 
     */
    @InputImport(name="parentResourceType", required=true)
    private final String parentResourceType;

    public String getParentResourceType() {
        return this.parentResourceType;
    }

    /**
     * String that represents an Azure resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * String that represents a Target resource name.
     * 
     */
    @InputImport(name="targetName", required=true)
    private final String targetName;

    public String getTargetName() {
        return this.targetName;
    }

    public GetTargetArgs(
        String parentProviderNamespace,
        String parentResourceName,
        String parentResourceType,
        String resourceGroupName,
        String targetName) {
        this.parentProviderNamespace = Objects.requireNonNull(parentProviderNamespace, "expected parameter 'parentProviderNamespace' to be non-null");
        this.parentResourceName = Objects.requireNonNull(parentResourceName, "expected parameter 'parentResourceName' to be non-null");
        this.parentResourceType = Objects.requireNonNull(parentResourceType, "expected parameter 'parentResourceType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.targetName = Objects.requireNonNull(targetName, "expected parameter 'targetName' to be non-null");
    }

    private GetTargetArgs() {
        this.parentProviderNamespace = null;
        this.parentResourceName = null;
        this.parentResourceType = null;
        this.resourceGroupName = null;
        this.targetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parentProviderNamespace;
        private String parentResourceName;
        private String parentResourceType;
        private String resourceGroupName;
        private String targetName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parentProviderNamespace = defaults.parentProviderNamespace;
    	      this.parentResourceName = defaults.parentResourceName;
    	      this.parentResourceType = defaults.parentResourceType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.targetName = defaults.targetName;
        }

        public Builder setParentProviderNamespace(String parentProviderNamespace) {
            this.parentProviderNamespace = Objects.requireNonNull(parentProviderNamespace);
            return this;
        }

        public Builder setParentResourceName(String parentResourceName) {
            this.parentResourceName = Objects.requireNonNull(parentResourceName);
            return this;
        }

        public Builder setParentResourceType(String parentResourceType) {
            this.parentResourceType = Objects.requireNonNull(parentResourceType);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setTargetName(String targetName) {
            this.targetName = Objects.requireNonNull(targetName);
            return this;
        }

        public GetTargetArgs build() {
            return new GetTargetArgs(parentProviderNamespace, parentResourceName, parentResourceType, resourceGroupName, targetName);
        }
    }
}
