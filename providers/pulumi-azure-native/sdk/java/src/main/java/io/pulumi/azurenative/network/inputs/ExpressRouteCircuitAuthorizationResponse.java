// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Authorization in an ExpressRouteCircuit resource.
 * 
 */
public final class ExpressRouteCircuitAuthorizationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExpressRouteCircuitAuthorizationResponse Empty = new ExpressRouteCircuitAuthorizationResponse();

    /**
     * The authorization key.
     * 
     */
    @InputImport(name="authorizationKey")
      private final @Nullable String authorizationKey;

    public Optional<String> getAuthorizationKey() {
        return this.authorizationKey == null ? Optional.empty() : Optional.ofNullable(this.authorizationKey);
    }

    /**
     * The authorization use status.
     * 
     */
    @InputImport(name="authorizationUseStatus")
      private final @Nullable String authorizationUseStatus;

    public Optional<String> getAuthorizationUseStatus() {
        return this.authorizationUseStatus == null ? Optional.empty() : Optional.ofNullable(this.authorizationUseStatus);
    }

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the authorization resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Type of the resource.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ExpressRouteCircuitAuthorizationResponse(
        @Nullable String authorizationKey,
        @Nullable String authorizationUseStatus,
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        String type) {
        this.authorizationKey = authorizationKey;
        this.authorizationUseStatus = authorizationUseStatus;
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ExpressRouteCircuitAuthorizationResponse() {
        this.authorizationKey = null;
        this.authorizationUseStatus = null;
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExpressRouteCircuitAuthorizationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String authorizationKey;
        private @Nullable String authorizationUseStatus;
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExpressRouteCircuitAuthorizationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationKey = defaults.authorizationKey;
    	      this.authorizationUseStatus = defaults.authorizationUseStatus;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.type = defaults.type;
        }

        public Builder setAuthorizationKey(@Nullable String authorizationKey) {
            this.authorizationKey = authorizationKey;
            return this;
        }

        public Builder setAuthorizationUseStatus(@Nullable String authorizationUseStatus) {
            this.authorizationUseStatus = authorizationUseStatus;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ExpressRouteCircuitAuthorizationResponse build() {
            return new ExpressRouteCircuitAuthorizationResponse(authorizationKey, authorizationUseStatus, etag, id, name, provisioningState, type);
        }
    }
}