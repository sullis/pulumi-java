// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate.inputs;

import io.pulumi.azurenative.deviceupdate.inputs.UserAssignedIdentityResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Managed service identity (system assigned and/or user assigned identities)
 * 
 */
public final class ManagedServiceIdentityResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedServiceIdentityResponse Empty = new ManagedServiceIdentityResponse();

    /**
     * The service principal ID of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
     */
    @InputImport(name="principalId", required=true)
    private final String principalId;

    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * The tenant ID of the system assigned identity. This property will only be provided for a system assigned identity.
     * 
     */
    @InputImport(name="tenantId", required=true)
    private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Type of managed service identity (where both SystemAssigned and UserAssigned types are allowed).
     * 
     */
    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * The set of user assigned identities associated with the resource. The userAssignedIdentities dictionary keys will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}. The dictionary values can be empty objects ({}) in requests.
     * 
     */
    @InputImport(name="userAssignedIdentities")
    private final @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

    public Map<String,UserAssignedIdentityResponse> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public ManagedServiceIdentityResponse(
        String principalId,
        String tenantId,
        String type,
        @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
        this.principalId = Objects.requireNonNull(principalId, "expected parameter 'principalId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.userAssignedIdentities = userAssignedIdentities;
    }

    private ManagedServiceIdentityResponse() {
        this.principalId = null;
        this.tenantId = null;
        this.type = null;
        this.userAssignedIdentities = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedServiceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;
        private @Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedServiceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,UserAssignedIdentityResponse> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public ManagedServiceIdentityResponse build() {
            return new ManagedServiceIdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
