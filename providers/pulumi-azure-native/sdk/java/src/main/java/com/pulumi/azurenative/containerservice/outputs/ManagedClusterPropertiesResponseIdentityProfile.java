// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerservice.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ManagedClusterPropertiesResponseIdentityProfile {
    /**
     * @return The client id of the user assigned identity.
     * 
     */
    private final @Nullable String clientId;
    /**
     * @return The object id of the user assigned identity.
     * 
     */
    private final @Nullable String objectId;
    /**
     * @return The resource id of the user assigned identity.
     * 
     */
    private final @Nullable String resourceId;

    @CustomType.Constructor
    private ManagedClusterPropertiesResponseIdentityProfile(
        @CustomType.Parameter("clientId") @Nullable String clientId,
        @CustomType.Parameter("objectId") @Nullable String objectId,
        @CustomType.Parameter("resourceId") @Nullable String resourceId) {
        this.clientId = clientId;
        this.objectId = objectId;
        this.resourceId = resourceId;
    }

    /**
     * @return The client id of the user assigned identity.
     * 
     */
    public Optional<String> clientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * @return The object id of the user assigned identity.
     * 
     */
    public Optional<String> objectId() {
        return Optional.ofNullable(this.objectId);
    }
    /**
     * @return The resource id of the user assigned identity.
     * 
     */
    public Optional<String> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterPropertiesResponseIdentityProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String objectId;
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterPropertiesResponseIdentityProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.objectId = defaults.objectId;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder clientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder objectId(@Nullable String objectId) {
            this.objectId = objectId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }        public ManagedClusterPropertiesResponseIdentityProfile build() {
            return new ManagedClusterPropertiesResponseIdentityProfile(clientId, objectId, resourceId);
        }
    }
}
