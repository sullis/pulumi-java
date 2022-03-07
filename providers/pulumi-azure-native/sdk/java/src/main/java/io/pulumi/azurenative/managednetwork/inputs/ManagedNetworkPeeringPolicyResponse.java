// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.inputs;

import io.pulumi.azurenative.managednetwork.inputs.ManagedNetworkPeeringPolicyPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Managed Network Peering Policy resource
 * 
 */
public final class ManagedNetworkPeeringPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedNetworkPeeringPolicyResponse Empty = new ManagedNetworkPeeringPolicyResponse();

    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @InputImport(name="location")
      private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Gets or sets the properties of a Managed Network Policy
     * 
     */
    @InputImport(name="properties")
      private final @Nullable ManagedNetworkPeeringPolicyPropertiesResponse properties;

    public Optional<ManagedNetworkPeeringPolicyPropertiesResponse> getProperties() {
        return this.properties == null ? Optional.empty() : Optional.ofNullable(this.properties);
    }

    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ManagedNetworkPeeringPolicyResponse(
        String id,
        @Nullable String location,
        String name,
        @Nullable ManagedNetworkPeeringPolicyPropertiesResponse properties,
        String type) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.properties = properties;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagedNetworkPeeringPolicyResponse() {
        this.id = null;
        this.location = null;
        this.name = null;
        this.properties = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedNetworkPeeringPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private String name;
        private @Nullable ManagedNetworkPeeringPolicyPropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedNetworkPeeringPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(@Nullable ManagedNetworkPeeringPolicyPropertiesResponse properties) {
            this.properties = properties;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ManagedNetworkPeeringPolicyResponse build() {
            return new ManagedNetworkPeeringPolicyResponse(id, location, name, properties, type);
        }
    }
}