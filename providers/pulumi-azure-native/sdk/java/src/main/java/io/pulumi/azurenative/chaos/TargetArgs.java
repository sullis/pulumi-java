// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.chaos;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TargetArgs Empty = new TargetArgs();

    /**
     * Location of the target resource.
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * String that represents a resource provider namespace.
     * 
     */
    @InputImport(name="parentProviderNamespace", required=true)
    private final Input<String> parentProviderNamespace;

    public Input<String> getParentProviderNamespace() {
        return this.parentProviderNamespace;
    }

    /**
     * String that represents a resource name.
     * 
     */
    @InputImport(name="parentResourceName", required=true)
    private final Input<String> parentResourceName;

    public Input<String> getParentResourceName() {
        return this.parentResourceName;
    }

    /**
     * String that represents a resource type.
     * 
     */
    @InputImport(name="parentResourceType", required=true)
    private final Input<String> parentResourceType;

    public Input<String> getParentResourceType() {
        return this.parentResourceType;
    }

    /**
     * The properties of the target resource.
     * 
     */
    @InputImport(name="properties", required=true)
    private final Input<Object> properties;

    public Input<Object> getProperties() {
        return this.properties;
    }

    /**
     * String that represents an Azure resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * String that represents a Target resource name.
     * 
     */
    @InputImport(name="targetName")
    private final @Nullable Input<String> targetName;

    public Input<String> getTargetName() {
        return this.targetName == null ? Input.empty() : this.targetName;
    }

    public TargetArgs(
        @Nullable Input<String> location,
        Input<String> parentProviderNamespace,
        Input<String> parentResourceName,
        Input<String> parentResourceType,
        Input<Object> properties,
        Input<String> resourceGroupName,
        @Nullable Input<String> targetName) {
        this.location = location;
        this.parentProviderNamespace = Objects.requireNonNull(parentProviderNamespace, "expected parameter 'parentProviderNamespace' to be non-null");
        this.parentResourceName = Objects.requireNonNull(parentResourceName, "expected parameter 'parentResourceName' to be non-null");
        this.parentResourceType = Objects.requireNonNull(parentResourceType, "expected parameter 'parentResourceType' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.targetName = targetName;
    }

    private TargetArgs() {
        this.location = Input.empty();
        this.parentProviderNamespace = Input.empty();
        this.parentResourceName = Input.empty();
        this.parentResourceType = Input.empty();
        this.properties = Input.empty();
        this.resourceGroupName = Input.empty();
        this.targetName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> location;
        private Input<String> parentProviderNamespace;
        private Input<String> parentResourceName;
        private Input<String> parentResourceType;
        private Input<Object> properties;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> targetName;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.parentProviderNamespace = defaults.parentProviderNamespace;
    	      this.parentResourceName = defaults.parentResourceName;
    	      this.parentResourceType = defaults.parentResourceType;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.targetName = defaults.targetName;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setParentProviderNamespace(Input<String> parentProviderNamespace) {
            this.parentProviderNamespace = Objects.requireNonNull(parentProviderNamespace);
            return this;
        }

        public Builder setParentProviderNamespace(String parentProviderNamespace) {
            this.parentProviderNamespace = Input.of(Objects.requireNonNull(parentProviderNamespace));
            return this;
        }

        public Builder setParentResourceName(Input<String> parentResourceName) {
            this.parentResourceName = Objects.requireNonNull(parentResourceName);
            return this;
        }

        public Builder setParentResourceName(String parentResourceName) {
            this.parentResourceName = Input.of(Objects.requireNonNull(parentResourceName));
            return this;
        }

        public Builder setParentResourceType(Input<String> parentResourceType) {
            this.parentResourceType = Objects.requireNonNull(parentResourceType);
            return this;
        }

        public Builder setParentResourceType(String parentResourceType) {
            this.parentResourceType = Input.of(Objects.requireNonNull(parentResourceType));
            return this;
        }

        public Builder setProperties(Input<Object> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(Object properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTargetName(@Nullable Input<String> targetName) {
            this.targetName = targetName;
            return this;
        }

        public Builder setTargetName(@Nullable String targetName) {
            this.targetName = Input.ofNullable(targetName);
            return this;
        }

        public TargetArgs build() {
            return new TargetArgs(location, parentProviderNamespace, parentResourceName, parentResourceType, properties, resourceGroupName, targetName);
        }
    }
}
