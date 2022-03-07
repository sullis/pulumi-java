// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class UserAssignedIdentityAuthInfoResponse {
    /**
     * The authentication type.
     * Expected value is 'userAssignedIdentity'.
     * 
     */
    private final String authType;
    /**
     * Client Id for userAssignedIdentity.
     * 
     */
    private final String clientId;
    /**
     * Subscription id for userAssignedIdentity.
     * 
     */
    private final String subscriptionId;

    @OutputCustomType.Constructor({"authType","clientId","subscriptionId"})
    private UserAssignedIdentityAuthInfoResponse(
        String authType,
        String clientId,
        String subscriptionId) {
        this.authType = Objects.requireNonNull(authType);
        this.clientId = Objects.requireNonNull(clientId);
        this.subscriptionId = Objects.requireNonNull(subscriptionId);
    }

    /**
     * The authentication type.
     * Expected value is 'userAssignedIdentity'.
     * 
    */
    public String getAuthType() {
        return this.authType;
    }
    /**
     * Client Id for userAssignedIdentity.
     * 
    */
    public String getClientId() {
        return this.clientId;
    }
    /**
     * Subscription id for userAssignedIdentity.
     * 
    */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityAuthInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authType;
        private String clientId;
        private String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityAuthInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
    	      this.clientId = defaults.clientId;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder setAuthType(String authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }
        public UserAssignedIdentityAuthInfoResponse build() {
            return new UserAssignedIdentityAuthInfoResponse(authType, clientId, subscriptionId);
        }
    }
}