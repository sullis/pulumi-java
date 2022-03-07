// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.RuleManagementEventClaimsDataSourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleManagementEventDataSourceResponse {
    /**
     * the claims.
     * 
     */
    private final @Nullable RuleManagementEventClaimsDataSourceResponse claims;
    /**
     * the event name.
     * 
     */
    private final @Nullable String eventName;
    /**
     * the event source.
     * 
     */
    private final @Nullable String eventSource;
    /**
     * the legacy resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
     */
    private final @Nullable String legacyResourceId;
    /**
     * the level.
     * 
     */
    private final @Nullable String level;
    /**
     * the namespace of the metric.
     * 
     */
    private final @Nullable String metricNamespace;
    /**
     * specifies the type of data source. There are two types of rule data sources: RuleMetricDataSource and RuleManagementEventDataSource
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.RuleManagementEventDataSource'.
     * 
     */
    private final String odataType;
    /**
     * The name of the operation that should be checked for. If no name is provided, any operation will match.
     * 
     */
    private final @Nullable String operationName;
    /**
     * the resource group name.
     * 
     */
    private final @Nullable String resourceGroupName;
    /**
     * the location of the resource.
     * 
     */
    private final @Nullable String resourceLocation;
    /**
     * the resource provider name.
     * 
     */
    private final @Nullable String resourceProviderName;
    /**
     * the resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
     */
    private final @Nullable String resourceUri;
    /**
     * The status of the operation that should be checked for. If no status is provided, any status will match.
     * 
     */
    private final @Nullable String status;
    /**
     * the substatus.
     * 
     */
    private final @Nullable String subStatus;

    @OutputCustomType.Constructor({"claims","eventName","eventSource","legacyResourceId","level","metricNamespace","odataType","operationName","resourceGroupName","resourceLocation","resourceProviderName","resourceUri","status","subStatus"})
    private RuleManagementEventDataSourceResponse(
        @Nullable RuleManagementEventClaimsDataSourceResponse claims,
        @Nullable String eventName,
        @Nullable String eventSource,
        @Nullable String legacyResourceId,
        @Nullable String level,
        @Nullable String metricNamespace,
        String odataType,
        @Nullable String operationName,
        @Nullable String resourceGroupName,
        @Nullable String resourceLocation,
        @Nullable String resourceProviderName,
        @Nullable String resourceUri,
        @Nullable String status,
        @Nullable String subStatus) {
        this.claims = claims;
        this.eventName = eventName;
        this.eventSource = eventSource;
        this.legacyResourceId = legacyResourceId;
        this.level = level;
        this.metricNamespace = metricNamespace;
        this.odataType = Objects.requireNonNull(odataType);
        this.operationName = operationName;
        this.resourceGroupName = resourceGroupName;
        this.resourceLocation = resourceLocation;
        this.resourceProviderName = resourceProviderName;
        this.resourceUri = resourceUri;
        this.status = status;
        this.subStatus = subStatus;
    }

    /**
     * the claims.
     * 
    */
    public Optional<RuleManagementEventClaimsDataSourceResponse> getClaims() {
        return Optional.ofNullable(this.claims);
    }
    /**
     * the event name.
     * 
    */
    public Optional<String> getEventName() {
        return Optional.ofNullable(this.eventName);
    }
    /**
     * the event source.
     * 
    */
    public Optional<String> getEventSource() {
        return Optional.ofNullable(this.eventSource);
    }
    /**
     * the legacy resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
    */
    public Optional<String> getLegacyResourceId() {
        return Optional.ofNullable(this.legacyResourceId);
    }
    /**
     * the level.
     * 
    */
    public Optional<String> getLevel() {
        return Optional.ofNullable(this.level);
    }
    /**
     * the namespace of the metric.
     * 
    */
    public Optional<String> getMetricNamespace() {
        return Optional.ofNullable(this.metricNamespace);
    }
    /**
     * specifies the type of data source. There are two types of rule data sources: RuleMetricDataSource and RuleManagementEventDataSource
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.RuleManagementEventDataSource'.
     * 
    */
    public String getOdataType() {
        return this.odataType;
    }
    /**
     * The name of the operation that should be checked for. If no name is provided, any operation will match.
     * 
    */
    public Optional<String> getOperationName() {
        return Optional.ofNullable(this.operationName);
    }
    /**
     * the resource group name.
     * 
    */
    public Optional<String> getResourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    /**
     * the location of the resource.
     * 
    */
    public Optional<String> getResourceLocation() {
        return Optional.ofNullable(this.resourceLocation);
    }
    /**
     * the resource provider name.
     * 
    */
    public Optional<String> getResourceProviderName() {
        return Optional.ofNullable(this.resourceProviderName);
    }
    /**
     * the resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
    */
    public Optional<String> getResourceUri() {
        return Optional.ofNullable(this.resourceUri);
    }
    /**
     * The status of the operation that should be checked for. If no status is provided, any status will match.
     * 
    */
    public Optional<String> getStatus() {
        return Optional.ofNullable(this.status);
    }
    /**
     * the substatus.
     * 
    */
    public Optional<String> getSubStatus() {
        return Optional.ofNullable(this.subStatus);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleManagementEventDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleManagementEventClaimsDataSourceResponse claims;
        private @Nullable String eventName;
        private @Nullable String eventSource;
        private @Nullable String legacyResourceId;
        private @Nullable String level;
        private @Nullable String metricNamespace;
        private String odataType;
        private @Nullable String operationName;
        private @Nullable String resourceGroupName;
        private @Nullable String resourceLocation;
        private @Nullable String resourceProviderName;
        private @Nullable String resourceUri;
        private @Nullable String status;
        private @Nullable String subStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleManagementEventDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claims = defaults.claims;
    	      this.eventName = defaults.eventName;
    	      this.eventSource = defaults.eventSource;
    	      this.legacyResourceId = defaults.legacyResourceId;
    	      this.level = defaults.level;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.odataType = defaults.odataType;
    	      this.operationName = defaults.operationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.resourceProviderName = defaults.resourceProviderName;
    	      this.resourceUri = defaults.resourceUri;
    	      this.status = defaults.status;
    	      this.subStatus = defaults.subStatus;
        }

        public Builder setClaims(@Nullable RuleManagementEventClaimsDataSourceResponse claims) {
            this.claims = claims;
            return this;
        }

        public Builder setEventName(@Nullable String eventName) {
            this.eventName = eventName;
            return this;
        }

        public Builder setEventSource(@Nullable String eventSource) {
            this.eventSource = eventSource;
            return this;
        }

        public Builder setLegacyResourceId(@Nullable String legacyResourceId) {
            this.legacyResourceId = legacyResourceId;
            return this;
        }

        public Builder setLevel(@Nullable String level) {
            this.level = level;
            return this;
        }

        public Builder setMetricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOperationName(@Nullable String operationName) {
            this.operationName = operationName;
            return this;
        }

        public Builder setResourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder setResourceLocation(@Nullable String resourceLocation) {
            this.resourceLocation = resourceLocation;
            return this;
        }

        public Builder setResourceProviderName(@Nullable String resourceProviderName) {
            this.resourceProviderName = resourceProviderName;
            return this;
        }

        public Builder setResourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setSubStatus(@Nullable String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public RuleManagementEventDataSourceResponse build() {
            return new RuleManagementEventDataSourceResponse(claims, eventName, eventSource, legacyResourceId, level, metricNamespace, odataType, operationName, resourceGroupName, resourceLocation, resourceProviderName, resourceUri, status, subStatus);
        }
    }
}