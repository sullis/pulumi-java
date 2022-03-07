// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetCapabilityArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCapabilityArgs Empty = new GetCapabilityArgs();

    /**
     * String that represents a Capability resource name.
     * 
     */
    @InputImport(name="capabilityName", required=true)
      private final String capabilityName;

    public String getCapabilityName() {
        return this.capabilityName;
    }

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

    public GetCapabilityArgs(
        String capabilityName,
        String parentProviderNamespace,
        String parentResourceName,
        String parentResourceType,
        String resourceGroupName,
        String targetName) {
        this.capabilityName = Objects.requireNonNull(capabilityName, "expected parameter 'capabilityName' to be non-null");
        this.parentProviderNamespace = Objects.requireNonNull(parentProviderNamespace, "expected parameter 'parentProviderNamespace' to be non-null");
        this.parentResourceName = Objects.requireNonNull(parentResourceName, "expected parameter 'parentResourceName' to be non-null");
        this.parentResourceType = Objects.requireNonNull(parentResourceType, "expected parameter 'parentResourceType' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.targetName = Objects.requireNonNull(targetName, "expected parameter 'targetName' to be non-null");
    }

    private GetCapabilityArgs() {
        this.capabilityName = null;
        this.parentProviderNamespace = null;
        this.parentResourceName = null;
        this.parentResourceType = null;
        this.resourceGroupName = null;
        this.targetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCapabilityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String capabilityName;
        private String parentProviderNamespace;
        private String parentResourceName;
        private String parentResourceType;
        private String resourceGroupName;
        private String targetName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCapabilityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilityName = defaults.capabilityName;
    	      this.parentProviderNamespace = defaults.parentProviderNamespace;
    	      this.parentResourceName = defaults.parentResourceName;
    	      this.parentResourceType = defaults.parentResourceType;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.targetName = defaults.targetName;
        }

        public Builder setCapabilityName(String capabilityName) {
            this.capabilityName = Objects.requireNonNull(capabilityName);
            return this;
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
        public GetCapabilityArgs build() {
            return new GetCapabilityArgs(capabilityName, parentProviderNamespace, parentResourceName, parentResourceType, resourceGroupName, targetName);
        }
    }
}