// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.outputs;

import com.pulumi.azurenative.sql.outputs.ManagedInstancePrivateEndpointPropertyResponse;
import com.pulumi.azurenative.sql.outputs.ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetManagedInstancePrivateEndpointConnectionResult {
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Private endpoint which the connection belongs to.
     * 
     */
    private final @Nullable ManagedInstancePrivateEndpointPropertyResponse privateEndpoint;
    /**
     * @return Connection State of the Private Endpoint Connection.
     * 
     */
    private final @Nullable ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
    /**
     * @return State of the Private Endpoint Connection.
     * 
     */
    private final String provisioningState;
    /**
     * @return Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetManagedInstancePrivateEndpointConnectionResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("privateEndpoint") @Nullable ManagedInstancePrivateEndpointPropertyResponse privateEndpoint,
        @CustomType.Parameter("privateLinkServiceConnectionState") @Nullable ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.name = name;
        this.privateEndpoint = privateEndpoint;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.provisioningState = provisioningState;
        this.type = type;
    }

    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Private endpoint which the connection belongs to.
     * 
     */
    public Optional<ManagedInstancePrivateEndpointPropertyResponse> privateEndpoint() {
        return Optional.ofNullable(this.privateEndpoint);
    }
    /**
     * @return Connection State of the Private Endpoint Connection.
     * 
     */
    public Optional<ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse> privateLinkServiceConnectionState() {
        return Optional.ofNullable(this.privateLinkServiceConnectionState);
    }
    /**
     * @return State of the Private Endpoint Connection.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return Resource type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedInstancePrivateEndpointConnectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private @Nullable ManagedInstancePrivateEndpointPropertyResponse privateEndpoint;
        private @Nullable ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedInstancePrivateEndpointConnectionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.privateEndpoint = defaults.privateEndpoint;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.provisioningState = defaults.provisioningState;
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
        public Builder privateEndpoint(@Nullable ManagedInstancePrivateEndpointPropertyResponse privateEndpoint) {
            this.privateEndpoint = privateEndpoint;
            return this;
        }
        public Builder privateLinkServiceConnectionState(@Nullable ManagedInstancePrivateLinkServiceConnectionStatePropertyResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetManagedInstancePrivateEndpointConnectionResult build() {
            return new GetManagedInstancePrivateEndpointConnectionResult(id, name, privateEndpoint, privateLinkServiceConnectionState, provisioningState, type);
        }
    }
}
