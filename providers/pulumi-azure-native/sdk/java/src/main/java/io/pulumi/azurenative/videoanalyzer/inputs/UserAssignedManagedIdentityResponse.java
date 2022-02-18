// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The details of the user assigned managed identity used by the Video Analyzer resource.
 * 
 */
public final class UserAssignedManagedIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final UserAssignedManagedIdentityResponse Empty = new UserAssignedManagedIdentityResponse();

    /**
     * The client ID.
     * 
     */
    @InputImport(name="clientId", required=true)
    private final String clientId;

    public String getClientId() {
        return this.clientId;
    }

    /**
     * The principal ID.
     * 
     */
    @InputImport(name="principalId", required=true)
    private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    public UserAssignedManagedIdentityResponse(
        String clientId,
        String principalId) {
        this.clientId = Objects.requireNonNull(clientId, "expected parameter 'clientId' to be non-null");
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
    }

    private UserAssignedManagedIdentityResponse() {
        this.clientId = null;
        this.principalId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedManagedIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clientId;
        private String principalId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedManagedIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.principalId = defaults.principalId;
        }

        public Builder setClientId(String clientId) {
            this.clientId = Objects.requireNonNull(clientId);
            return this;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public UserAssignedManagedIdentityResponse build() {
            return new UserAssignedManagedIdentityResponse(clientId, principalId);
        }
    }
}
