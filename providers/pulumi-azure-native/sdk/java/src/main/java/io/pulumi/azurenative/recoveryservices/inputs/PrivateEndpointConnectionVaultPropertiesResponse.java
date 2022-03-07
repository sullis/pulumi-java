// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.VaultPrivateEndpointConnectionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Information to be stored in Vault properties as an element of privateEndpointConnections List.
 * 
 */
public final class PrivateEndpointConnectionVaultPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateEndpointConnectionVaultPropertiesResponse Empty = new PrivateEndpointConnectionVaultPropertiesResponse();

    /**
     * Format of id subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.[Service]/{resource}/{resourceName}/privateEndpointConnections/{connectionName}.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Private Endpoint Connection Response Properties.
     * 
     */
    @InputImport(name="properties", required=true)
      private final VaultPrivateEndpointConnectionResponse properties;

    public VaultPrivateEndpointConnectionResponse getProperties() {
        return this.properties;
    }

    public PrivateEndpointConnectionVaultPropertiesResponse(
        String id,
        VaultPrivateEndpointConnectionResponse properties) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
    }

    private PrivateEndpointConnectionVaultPropertiesResponse() {
        this.id = null;
        this.properties = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateEndpointConnectionVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private VaultPrivateEndpointConnectionResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateEndpointConnectionVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.properties = defaults.properties;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setProperties(VaultPrivateEndpointConnectionResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public PrivateEndpointConnectionVaultPropertiesResponse build() {
            return new PrivateEndpointConnectionVaultPropertiesResponse(id, properties);
        }
    }
}