// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.outputs;

import io.pulumi.azurenative.keyvault.outputs.MHSMNetworkRuleSetResponse;
import io.pulumi.azurenative.keyvault.outputs.MHSMPrivateEndpointConnectionItemResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManagedHsmPropertiesResponse {
    /**
     * The create mode to indicate whether the resource is being created or is being recovered from a deleted resource.
     * 
     */
    private final @Nullable String createMode;
    /**
     * Property specifying whether protection against purge is enabled for this managed HSM pool. Setting this property to true activates protection against purge for this managed HSM pool and its content - only the Managed HSM service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is also enabled. Enabling this functionality is irreversible.
     * 
     */
    private final @Nullable Boolean enablePurgeProtection;
    /**
     * Property to specify whether the 'soft delete' functionality is enabled for this managed HSM pool. If it's not set to any value(true or false) when creating new managed HSM pool, it will be set to true by default. Once set to true, it cannot be reverted to false.
     * 
     */
    private final @Nullable Boolean enableSoftDelete;
    /**
     * The URI of the managed hsm pool for performing operations on keys.
     * 
     */
    private final String hsmUri;
    /**
     * Array of initial administrators object ids for this managed hsm pool.
     * 
     */
    private final @Nullable List<String> initialAdminObjectIds;
    /**
     * Rules governing the accessibility of the key vault from specific network locations.
     * 
     */
    private final @Nullable MHSMNetworkRuleSetResponse networkAcls;
    /**
     * List of private endpoint connections associated with the managed hsm pool.
     * 
     */
    private final List<MHSMPrivateEndpointConnectionItemResponse> privateEndpointConnections;
    /**
     * Provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    private final @Nullable String publicNetworkAccess;
    /**
     * The scheduled purge date in UTC.
     * 
     */
    private final String scheduledPurgeDate;
    /**
     * softDelete data retention days. It accepts >=7 and <=90.
     * 
     */
    private final @Nullable Integer softDeleteRetentionInDays;
    /**
     * Resource Status Message.
     * 
     */
    private final String statusMessage;
    /**
     * The Azure Active Directory tenant ID that should be used for authenticating requests to the managed HSM pool.
     * 
     */
    private final @Nullable String tenantId;

    @OutputCustomType.Constructor({"createMode","enablePurgeProtection","enableSoftDelete","hsmUri","initialAdminObjectIds","networkAcls","privateEndpointConnections","provisioningState","publicNetworkAccess","scheduledPurgeDate","softDeleteRetentionInDays","statusMessage","tenantId"})
    private ManagedHsmPropertiesResponse(
        @Nullable String createMode,
        @Nullable Boolean enablePurgeProtection,
        @Nullable Boolean enableSoftDelete,
        String hsmUri,
        @Nullable List<String> initialAdminObjectIds,
        @Nullable MHSMNetworkRuleSetResponse networkAcls,
        List<MHSMPrivateEndpointConnectionItemResponse> privateEndpointConnections,
        String provisioningState,
        @Nullable String publicNetworkAccess,
        String scheduledPurgeDate,
        @Nullable Integer softDeleteRetentionInDays,
        String statusMessage,
        @Nullable String tenantId) {
        this.createMode = createMode;
        this.enablePurgeProtection = enablePurgeProtection;
        this.enableSoftDelete = enableSoftDelete;
        this.hsmUri = Objects.requireNonNull(hsmUri);
        this.initialAdminObjectIds = initialAdminObjectIds;
        this.networkAcls = networkAcls;
        this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.publicNetworkAccess = publicNetworkAccess;
        this.scheduledPurgeDate = Objects.requireNonNull(scheduledPurgeDate);
        this.softDeleteRetentionInDays = softDeleteRetentionInDays;
        this.statusMessage = Objects.requireNonNull(statusMessage);
        this.tenantId = tenantId;
    }

    /**
     * The create mode to indicate whether the resource is being created or is being recovered from a deleted resource.
     * 
     */
    public Optional<String> getCreateMode() {
        return Optional.ofNullable(this.createMode);
    }
    /**
     * Property specifying whether protection against purge is enabled for this managed HSM pool. Setting this property to true activates protection against purge for this managed HSM pool and its content - only the Managed HSM service may initiate a hard, irrecoverable deletion. The setting is effective only if soft delete is also enabled. Enabling this functionality is irreversible.
     * 
     */
    public Optional<Boolean> getEnablePurgeProtection() {
        return Optional.ofNullable(this.enablePurgeProtection);
    }
    /**
     * Property to specify whether the 'soft delete' functionality is enabled for this managed HSM pool. If it's not set to any value(true or false) when creating new managed HSM pool, it will be set to true by default. Once set to true, it cannot be reverted to false.
     * 
     */
    public Optional<Boolean> getEnableSoftDelete() {
        return Optional.ofNullable(this.enableSoftDelete);
    }
    /**
     * The URI of the managed hsm pool for performing operations on keys.
     * 
     */
    public String getHsmUri() {
        return this.hsmUri;
    }
    /**
     * Array of initial administrators object ids for this managed hsm pool.
     * 
     */
    public List<String> getInitialAdminObjectIds() {
        return this.initialAdminObjectIds == null ? List.of() : this.initialAdminObjectIds;
    }
    /**
     * Rules governing the accessibility of the key vault from specific network locations.
     * 
     */
    public Optional<MHSMNetworkRuleSetResponse> getNetworkAcls() {
        return Optional.ofNullable(this.networkAcls);
    }
    /**
     * List of private endpoint connections associated with the managed hsm pool.
     * 
     */
    public List<MHSMPrivateEndpointConnectionItemResponse> getPrivateEndpointConnections() {
        return this.privateEndpointConnections;
    }
    /**
     * Provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Control permission for data plane traffic coming from public networks while private endpoint is enabled.
     * 
     */
    public Optional<String> getPublicNetworkAccess() {
        return Optional.ofNullable(this.publicNetworkAccess);
    }
    /**
     * The scheduled purge date in UTC.
     * 
     */
    public String getScheduledPurgeDate() {
        return this.scheduledPurgeDate;
    }
    /**
     * softDelete data retention days. It accepts >=7 and <=90.
     * 
     */
    public Optional<Integer> getSoftDeleteRetentionInDays() {
        return Optional.ofNullable(this.softDeleteRetentionInDays);
    }
    /**
     * Resource Status Message.
     * 
     */
    public String getStatusMessage() {
        return this.statusMessage;
    }
    /**
     * The Azure Active Directory tenant ID that should be used for authenticating requests to the managed HSM pool.
     * 
     */
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedHsmPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String createMode;
        private @Nullable Boolean enablePurgeProtection;
        private @Nullable Boolean enableSoftDelete;
        private String hsmUri;
        private @Nullable List<String> initialAdminObjectIds;
        private @Nullable MHSMNetworkRuleSetResponse networkAcls;
        private List<MHSMPrivateEndpointConnectionItemResponse> privateEndpointConnections;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;
        private String scheduledPurgeDate;
        private @Nullable Integer softDeleteRetentionInDays;
        private String statusMessage;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedHsmPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createMode = defaults.createMode;
    	      this.enablePurgeProtection = defaults.enablePurgeProtection;
    	      this.enableSoftDelete = defaults.enableSoftDelete;
    	      this.hsmUri = defaults.hsmUri;
    	      this.initialAdminObjectIds = defaults.initialAdminObjectIds;
    	      this.networkAcls = defaults.networkAcls;
    	      this.privateEndpointConnections = defaults.privateEndpointConnections;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.scheduledPurgeDate = defaults.scheduledPurgeDate;
    	      this.softDeleteRetentionInDays = defaults.softDeleteRetentionInDays;
    	      this.statusMessage = defaults.statusMessage;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setCreateMode(@Nullable String createMode) {
            this.createMode = createMode;
            return this;
        }

        public Builder setEnablePurgeProtection(@Nullable Boolean enablePurgeProtection) {
            this.enablePurgeProtection = enablePurgeProtection;
            return this;
        }

        public Builder setEnableSoftDelete(@Nullable Boolean enableSoftDelete) {
            this.enableSoftDelete = enableSoftDelete;
            return this;
        }

        public Builder setHsmUri(String hsmUri) {
            this.hsmUri = Objects.requireNonNull(hsmUri);
            return this;
        }

        public Builder setInitialAdminObjectIds(@Nullable List<String> initialAdminObjectIds) {
            this.initialAdminObjectIds = initialAdminObjectIds;
            return this;
        }

        public Builder setNetworkAcls(@Nullable MHSMNetworkRuleSetResponse networkAcls) {
            this.networkAcls = networkAcls;
            return this;
        }

        public Builder setPrivateEndpointConnections(List<MHSMPrivateEndpointConnectionItemResponse> privateEndpointConnections) {
            this.privateEndpointConnections = Objects.requireNonNull(privateEndpointConnections);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setScheduledPurgeDate(String scheduledPurgeDate) {
            this.scheduledPurgeDate = Objects.requireNonNull(scheduledPurgeDate);
            return this;
        }

        public Builder setSoftDeleteRetentionInDays(@Nullable Integer softDeleteRetentionInDays) {
            this.softDeleteRetentionInDays = softDeleteRetentionInDays;
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }

        public Builder setTenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        public ManagedHsmPropertiesResponse build() {
            return new ManagedHsmPropertiesResponse(createMode, enablePurgeProtection, enableSoftDelete, hsmUri, initialAdminObjectIds, networkAcls, privateEndpointConnections, provisioningState, publicNetworkAccess, scheduledPurgeDate, softDeleteRetentionInDays, statusMessage, tenantId);
        }
    }
}
