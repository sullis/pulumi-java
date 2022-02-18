// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.outputs;

import io.pulumi.azurenative.containerservice.outputs.ManagedClusterIdentityResponseUserAssignedIdentities;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedClusterIdentityResponse {
    /**
     * The principal id of the system assigned identity which is used by master components.
     * 
     */
    private final String principalId;
    /**
     * The tenant id of the system assigned identity which is used by master components.
     * 
     */
    private final String tenantId;
    /**
     * The type of identity used for the managed cluster. Type 'SystemAssigned' will use an implicitly created identity in master components and an auto-created user assigned identity in MC_ resource group in agent nodes. Type 'None' will not use MSI for the managed cluster, service principal will be used instead.
     * 
     */
    private final @Nullable String type;
    /**
     * The user identity associated with the managed cluster. This identity will be used in control plane and only one user assigned identity is allowed. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    private final @Nullable Map<String,ManagedClusterIdentityResponseUserAssignedIdentities> userAssignedIdentities;

    @OutputCustomType.Constructor({"principalId","tenantId","type","userAssignedIdentities"})
    private ManagedClusterIdentityResponse(
        String principalId,
        String tenantId,
        @Nullable String type,
        @Nullable Map<String,ManagedClusterIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
        this.principalId = Objects.requireNonNull(principalId);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * The principal id of the system assigned identity which is used by master components.
     * 
     */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant id of the system assigned identity which is used by master components.
     * 
     */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The type of identity used for the managed cluster. Type 'SystemAssigned' will use an implicitly created identity in master components and an auto-created user assigned identity in MC_ resource group in agent nodes. Type 'None' will not use MSI for the managed cluster, service principal will be used instead.
     * 
     */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The user identity associated with the managed cluster. This identity will be used in control plane and only one user assigned identity is allowed. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    public Map<String,ManagedClusterIdentityResponseUserAssignedIdentities> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,ManagedClusterIdentityResponseUserAssignedIdentities> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterIdentityResponse defaults) {
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

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setUserAssignedIdentities(@Nullable Map<String,ManagedClusterIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }

        public ManagedClusterIdentityResponse build() {
            return new ManagedClusterIdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
