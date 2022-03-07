// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.ServiceEndpointPolicyDefinitionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceEndpointPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceEndpointPolicyArgs Empty = new ServiceEndpointPolicyArgs();

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A collection of service endpoint policy definitions of the service endpoint policy.
     * 
     */
    @InputImport(name="serviceEndpointPolicyDefinitions")
      private final @Nullable Input<List<ServiceEndpointPolicyDefinitionArgs>> serviceEndpointPolicyDefinitions;

    public Input<List<ServiceEndpointPolicyDefinitionArgs>> getServiceEndpointPolicyDefinitions() {
        return this.serviceEndpointPolicyDefinitions == null ? Input.empty() : this.serviceEndpointPolicyDefinitions;
    }

    /**
     * The name of the service endpoint policy.
     * 
     */
    @InputImport(name="serviceEndpointPolicyName")
      private final @Nullable Input<String> serviceEndpointPolicyName;

    public Input<String> getServiceEndpointPolicyName() {
        return this.serviceEndpointPolicyName == null ? Input.empty() : this.serviceEndpointPolicyName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ServiceEndpointPolicyArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<List<ServiceEndpointPolicyDefinitionArgs>> serviceEndpointPolicyDefinitions,
        @Nullable Input<String> serviceEndpointPolicyName,
        @Nullable Input<Map<String,String>> tags) {
        this.id = id;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceEndpointPolicyDefinitions = serviceEndpointPolicyDefinitions;
        this.serviceEndpointPolicyName = serviceEndpointPolicyName;
        this.tags = tags;
    }

    private ServiceEndpointPolicyArgs() {
        this.id = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serviceEndpointPolicyDefinitions = Input.empty();
        this.serviceEndpointPolicyName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEndpointPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<List<ServiceEndpointPolicyDefinitionArgs>> serviceEndpointPolicyDefinitions;
        private @Nullable Input<String> serviceEndpointPolicyName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEndpointPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceEndpointPolicyDefinitions = defaults.serviceEndpointPolicyDefinitions;
    	      this.serviceEndpointPolicyName = defaults.serviceEndpointPolicyName;
    	      this.tags = defaults.tags;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setServiceEndpointPolicyDefinitions(@Nullable Input<List<ServiceEndpointPolicyDefinitionArgs>> serviceEndpointPolicyDefinitions) {
            this.serviceEndpointPolicyDefinitions = serviceEndpointPolicyDefinitions;
            return this;
        }

        public Builder setServiceEndpointPolicyDefinitions(@Nullable List<ServiceEndpointPolicyDefinitionArgs> serviceEndpointPolicyDefinitions) {
            this.serviceEndpointPolicyDefinitions = Input.ofNullable(serviceEndpointPolicyDefinitions);
            return this;
        }

        public Builder setServiceEndpointPolicyName(@Nullable Input<String> serviceEndpointPolicyName) {
            this.serviceEndpointPolicyName = serviceEndpointPolicyName;
            return this;
        }

        public Builder setServiceEndpointPolicyName(@Nullable String serviceEndpointPolicyName) {
            this.serviceEndpointPolicyName = Input.ofNullable(serviceEndpointPolicyName);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public ServiceEndpointPolicyArgs build() {
            return new ServiceEndpointPolicyArgs(id, location, resourceGroupName, serviceEndpointPolicyDefinitions, serviceEndpointPolicyName, tags);
        }
    }
}