// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.managednetwork.outputs;

import io.pulumi.azurenative.managednetwork.outputs.ManagedNetworkPeeringPolicyPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedNetworkPeeringPolicyResponse {
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Gets or sets the properties of a Managed Network Policy
     * 
     */
    private final @Nullable ManagedNetworkPeeringPolicyPropertiesResponse properties;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","properties","type"})
    private ManagedNetworkPeeringPolicyResponse(
        String id,
        @Nullable String location,
        String name,
        @Nullable ManagedNetworkPeeringPolicyPropertiesResponse properties,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = properties;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the properties of a Managed Network Policy
     * 
    */
    public Optional<ManagedNetworkPeeringPolicyPropertiesResponse> getProperties() {
        return Optional.ofNullable(this.properties);
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
    */
    public String getType() {
        return this.type;
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