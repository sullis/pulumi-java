// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci.outputs;

import io.pulumi.azurenative.azurestackhci.outputs.ClusterReportedPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetClusterResult {
    /**
     * App id of cluster AAD identity.
     * 
     */
    private final String aadClientId;
    /**
     * Tenant id of cluster AAD identity.
     * 
     */
    private final String aadTenantId;
    /**
     * Type of billing applied to the resource.
     * 
     */
    private final String billingModel;
    /**
     * Unique, immutable resource id.
     * 
     */
    private final String cloudId;
    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    private final @Nullable String createdAt;
    /**
     * The identity that created the resource.
     * 
     */
    private final @Nullable String createdBy;
    /**
     * The type of identity that created the resource.
     * 
     */
    private final @Nullable String createdByType;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * Most recent billing meter timestamp.
     * 
     */
    private final String lastBillingTimestamp;
    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    private final @Nullable String lastModifiedAt;
    /**
     * The identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedBy;
    /**
     * The type of identity that last modified the resource.
     * 
     */
    private final @Nullable String lastModifiedByType;
    /**
     * Most recent cluster sync timestamp.
     * 
     */
    private final String lastSyncTimestamp;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * First cluster sync timestamp.
     * 
     */
    private final String registrationTimestamp;
    /**
     * Properties reported by cluster agent.
     * 
     */
    private final @Nullable ClusterReportedPropertiesResponse reportedProperties;
    /**
     * Status of the cluster agent.
     * 
     */
    private final String status;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Number of days remaining in the trial period.
     * 
     */
    private final Double trialDaysRemaining;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"aadClientId","aadTenantId","billingModel","cloudId","createdAt","createdBy","createdByType","id","lastBillingTimestamp","lastModifiedAt","lastModifiedBy","lastModifiedByType","lastSyncTimestamp","location","name","provisioningState","registrationTimestamp","reportedProperties","status","tags","trialDaysRemaining","type"})
    private GetClusterResult(
        String aadClientId,
        String aadTenantId,
        String billingModel,
        String cloudId,
        @Nullable String createdAt,
        @Nullable String createdBy,
        @Nullable String createdByType,
        String id,
        String lastBillingTimestamp,
        @Nullable String lastModifiedAt,
        @Nullable String lastModifiedBy,
        @Nullable String lastModifiedByType,
        String lastSyncTimestamp,
        String location,
        String name,
        String provisioningState,
        String registrationTimestamp,
        @Nullable ClusterReportedPropertiesResponse reportedProperties,
        String status,
        @Nullable Map<String,String> tags,
        Double trialDaysRemaining,
        String type) {
        this.aadClientId = Objects.requireNonNull(aadClientId);
        this.aadTenantId = Objects.requireNonNull(aadTenantId);
        this.billingModel = Objects.requireNonNull(billingModel);
        this.cloudId = Objects.requireNonNull(cloudId);
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.id = Objects.requireNonNull(id);
        this.lastBillingTimestamp = Objects.requireNonNull(lastBillingTimestamp);
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
        this.lastSyncTimestamp = Objects.requireNonNull(lastSyncTimestamp);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.registrationTimestamp = Objects.requireNonNull(registrationTimestamp);
        this.reportedProperties = reportedProperties;
        this.status = Objects.requireNonNull(status);
        this.tags = tags;
        this.trialDaysRemaining = Objects.requireNonNull(trialDaysRemaining);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * App id of cluster AAD identity.
     * 
     */
    public String getAadClientId() {
        return this.aadClientId;
    }
    /**
     * Tenant id of cluster AAD identity.
     * 
     */
    public String getAadTenantId() {
        return this.aadTenantId;
    }
    /**
     * Type of billing applied to the resource.
     * 
     */
    public String getBillingModel() {
        return this.billingModel;
    }
    /**
     * Unique, immutable resource id.
     * 
     */
    public String getCloudId() {
        return this.cloudId;
    }
    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(this.createdAt);
    }
    /**
     * The identity that created the resource.
     * 
     */
    public Optional<String> getCreatedBy() {
        return Optional.ofNullable(this.createdBy);
    }
    /**
     * The type of identity that created the resource.
     * 
     */
    public Optional<String> getCreatedByType() {
        return Optional.ofNullable(this.createdByType);
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Most recent billing meter timestamp.
     * 
     */
    public String getLastBillingTimestamp() {
        return this.lastBillingTimestamp;
    }
    /**
     * The timestamp of resource last modification (UTC)
     * 
     */
    public Optional<String> getLastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }
    /**
     * The identity that last modified the resource.
     * 
     */
    public Optional<String> getLastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    /**
     * The type of identity that last modified the resource.
     * 
     */
    public Optional<String> getLastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }
    /**
     * Most recent cluster sync timestamp.
     * 
     */
    public String getLastSyncTimestamp() {
        return this.lastSyncTimestamp;
    }
    /**
     * The geo-location where the resource lives
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * First cluster sync timestamp.
     * 
     */
    public String getRegistrationTimestamp() {
        return this.registrationTimestamp;
    }
    /**
     * Properties reported by cluster agent.
     * 
     */
    public Optional<ClusterReportedPropertiesResponse> getReportedProperties() {
        return Optional.ofNullable(this.reportedProperties);
    }
    /**
     * Status of the cluster agent.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Resource tags.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Number of days remaining in the trial period.
     * 
     */
    public Double getTrialDaysRemaining() {
        return this.trialDaysRemaining;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aadClientId;
        private String aadTenantId;
        private String billingModel;
        private String cloudId;
        private @Nullable String createdAt;
        private @Nullable String createdBy;
        private @Nullable String createdByType;
        private String id;
        private String lastBillingTimestamp;
        private @Nullable String lastModifiedAt;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedByType;
        private String lastSyncTimestamp;
        private String location;
        private String name;
        private String provisioningState;
        private String registrationTimestamp;
        private @Nullable ClusterReportedPropertiesResponse reportedProperties;
        private String status;
        private @Nullable Map<String,String> tags;
        private Double trialDaysRemaining;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadClientId = defaults.aadClientId;
    	      this.aadTenantId = defaults.aadTenantId;
    	      this.billingModel = defaults.billingModel;
    	      this.cloudId = defaults.cloudId;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.id = defaults.id;
    	      this.lastBillingTimestamp = defaults.lastBillingTimestamp;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
    	      this.lastSyncTimestamp = defaults.lastSyncTimestamp;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.registrationTimestamp = defaults.registrationTimestamp;
    	      this.reportedProperties = defaults.reportedProperties;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.trialDaysRemaining = defaults.trialDaysRemaining;
    	      this.type = defaults.type;
        }

        public Builder setAadClientId(String aadClientId) {
            this.aadClientId = Objects.requireNonNull(aadClientId);
            return this;
        }

        public Builder setAadTenantId(String aadTenantId) {
            this.aadTenantId = Objects.requireNonNull(aadTenantId);
            return this;
        }

        public Builder setBillingModel(String billingModel) {
            this.billingModel = Objects.requireNonNull(billingModel);
            return this;
        }

        public Builder setCloudId(String cloudId) {
            this.cloudId = Objects.requireNonNull(cloudId);
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreatedByType(@Nullable String createdByType) {
            this.createdByType = createdByType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastBillingTimestamp(String lastBillingTimestamp) {
            this.lastBillingTimestamp = Objects.requireNonNull(lastBillingTimestamp);
            return this;
        }

        public Builder setLastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder setLastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder setLastModifiedByType(@Nullable String lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }

        public Builder setLastSyncTimestamp(String lastSyncTimestamp) {
            this.lastSyncTimestamp = Objects.requireNonNull(lastSyncTimestamp);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRegistrationTimestamp(String registrationTimestamp) {
            this.registrationTimestamp = Objects.requireNonNull(registrationTimestamp);
            return this;
        }

        public Builder setReportedProperties(@Nullable ClusterReportedPropertiesResponse reportedProperties) {
            this.reportedProperties = reportedProperties;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTrialDaysRemaining(Double trialDaysRemaining) {
            this.trialDaysRemaining = Objects.requireNonNull(trialDaysRemaining);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetClusterResult build() {
            return new GetClusterResult(aadClientId, aadTenantId, billingModel, cloudId, createdAt, createdBy, createdByType, id, lastBillingTimestamp, lastModifiedAt, lastModifiedBy, lastModifiedByType, lastSyncTimestamp, location, name, provisioningState, registrationTimestamp, reportedProperties, status, tags, trialDaysRemaining, type);
        }
    }
}
