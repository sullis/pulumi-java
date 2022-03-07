// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.attestation.outputs;

import io.pulumi.azurenative.attestation.outputs.PrivateEndpointConnectionResponse;
import io.pulumi.azurenative.attestation.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetAttestationProviderResult {
    /**
     * Gets the uri of attestation service
     * 
     */
    private final @Nullable String attestUri;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * List of private endpoint connections associated with the attestation provider.
     * 
     */
    private final List<PrivateEndpointConnectionResponse> privateEndpointConnections;
    /**
     * Status of attestation service.
     * 
     */
    private final @Nullable String status;
    /**
     * The system metadata relating to this resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Trust model for the attestation provider.
     * 
     */
    private final @Nullable String trustModel;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"attestUri","id","location","name","privateEndpointConnections","status","systemData","tags","trustModel","type"})
    private GetAttestationProviderResult(
        @Nullable String attestUri,
        String id,
        String location,
        String name,
        List<PrivateEndpointConnectionResponse> privateEndpointConnections,
        @Nullable String status,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        @Nullable String trustModel,
        String type) {
        this.attestUri = attestUri;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.status = status;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.trustModel = trustModel;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Gets the uri of attestation service
     * 
    */
    public Optional<String> getAttestUri() {
        return Optional.ofNullable(this.attestUri);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of private endpoint connections associated with the attestation provider.
     * 
    */
    public List<PrivateEndpointConnectionResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Status of attestation service.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * The system metadata relating to this resource
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Trust model for the attestation provider.
     * 
    */
    public Optional<String> getTrustModel() {
        return Optional.ofNullable(this.trustModel);
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAttestationProviderResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String attestUri;
        private String id;
        private String location;
        private String name;
        private List<PrivateEndpointConnectionResponse> privateEndpointConnections;
        private @Nullable String status;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable String trustModel;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAttestationProviderResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attestUri = defaults.attestUri;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.status = defaults.status;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.trustModel = defaults.trustModel;
    	      this.type = defaults.type;
        }

        public Builder setAttestUri(@Nullable String attestUri) {
            this.attestUri = attestUri;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpointConnections(List<PrivateEndpointConnectionResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTrustModel(@Nullable String trustModel) {
            this.trustModel = trustModel;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetAttestationProviderResult build() {
            return new GetAttestationProviderResult(attestUri, id, location, name, privateEndpointConnections, status, systemData, tags, trustModel, type);
        }
    }
}