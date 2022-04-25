// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EventSubscriptionIdentityResponse {
    /**
     * @return The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove any identity.
     * 
     */
    private final @Nullable String type;
    /**
     * @return The user identity associated with the resource.
     * 
     */
    private final @Nullable String userAssignedIdentity;

    @CustomType.Constructor
    private EventSubscriptionIdentityResponse(
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("userAssignedIdentity") @Nullable String userAssignedIdentity) {
        this.type = type;
        this.userAssignedIdentity = userAssignedIdentity;
    }

    /**
     * @return The type of managed identity used. The type &#39;SystemAssigned, UserAssigned&#39; includes both an implicitly created identity and a set of user-assigned identities. The type &#39;None&#39; will remove any identity.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }
    /**
     * @return The user identity associated with the resource.
     * 
     */
    public Optional<String> userAssignedIdentity() {
        return Optional.ofNullable(this.userAssignedIdentity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventSubscriptionIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;
        private @Nullable String userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(EventSubscriptionIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userAssignedIdentity(@Nullable String userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }        public EventSubscriptionIdentityResponse build() {
            return new EventSubscriptionIdentityResponse(type, userAssignedIdentity);
        }
    }
}
