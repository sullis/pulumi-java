// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.videoanalyzer.outputs;

import com.pulumi.azurenative.videoanalyzer.outputs.PrivateEndpointResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.PrivateLinkServiceConnectionStateResponse;
import com.pulumi.azurenative.videoanalyzer.outputs.SystemDataResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPrivateEndpointConnectionResult {
    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * @return The name of the resource
     * 
     */
    private final String name;
    /**
     * @return The resource of private end point.
     * 
     */
    private final @Nullable PrivateEndpointResponse privateEndpoint;
    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    private final PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
    /**
     * @return The provisioning state of the private endpoint connection resource.
     * 
     */
    private final String provisioningState;
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPrivateEndpointConnectionResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpoint") @Nullable PrivateEndpointResponse privateEndpoint,
        @CustomType.Parameter("privateLinkServiceConnectionState") PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * @return Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The name of the resource
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The resource of private end point.
     * 
     */
    public Optional<PrivateEndpointResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * @return A collection of information about the state of the connection between service consumer and provider.
     * 
     */
    public PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState;
    }
    /**
     * @return The provisioning state of the private endpoint connection resource.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     */
    public SystemDataResponse systemData() {
        return this.systemData;
    }
    /**
     * @return The type of the resource. E.g. &#34;Microsoft.Compute/virtualMachines&#34; or &#34;Microsoft.Storage/storageAccounts&#34;
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable PrivateEndpointResponse privateEndpoint;
        private PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder privateEndpoint(@Nullable PrivateEndpointResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateLinkServiceConnectionState(PrivateLinkServiceConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = Objects.requireNonNull(privateLinkServiceConnectionState);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetPrivateEndpointConnectionResult build() {
            return new GetPrivateEndpointConnectionResult(id, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, systemData, type);
        }
    }
}
