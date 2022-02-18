// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.RuleManagementEventClaimsDataSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A rule management event data source. The discriminator fields is always RuleManagementEventDataSource in this case.
 * 
 */
public final class RuleManagementEventDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleManagementEventDataSourceArgs Empty = new RuleManagementEventDataSourceArgs();

    /**
     * the claims.
     * 
     */
    @InputImport(name="claims")
    private final @Nullable Input<RuleManagementEventClaimsDataSourceArgs> claims;

    public Input<RuleManagementEventClaimsDataSourceArgs> getClaims() {
        return this.claims == null ? Input.empty() : this.claims;
    }

    /**
     * the event name.
     * 
     */
    @InputImport(name="eventName")
    private final @Nullable Input<String> eventName;

    public Input<String> getEventName() {
        return this.eventName == null ? Input.empty() : this.eventName;
    }

    /**
     * the event source.
     * 
     */
    @InputImport(name="eventSource")
    private final @Nullable Input<String> eventSource;

    public Input<String> getEventSource() {
        return this.eventSource == null ? Input.empty() : this.eventSource;
    }

    /**
     * the legacy resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
     */
    @InputImport(name="legacyResourceId")
    private final @Nullable Input<String> legacyResourceId;

    public Input<String> getLegacyResourceId() {
        return this.legacyResourceId == null ? Input.empty() : this.legacyResourceId;
    }

    /**
     * the level.
     * 
     */
    @InputImport(name="level")
    private final @Nullable Input<String> level;

    public Input<String> getLevel() {
        return this.level == null ? Input.empty() : this.level;
    }

    /**
     * the namespace of the metric.
     * 
     */
    @InputImport(name="metricNamespace")
    private final @Nullable Input<String> metricNamespace;

    public Input<String> getMetricNamespace() {
        return this.metricNamespace == null ? Input.empty() : this.metricNamespace;
    }

    /**
     * specifies the type of data source. There are two types of rule data sources: RuleMetricDataSource and RuleManagementEventDataSource
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.RuleManagementEventDataSource'.
     * 
     */
    @InputImport(name="odataType", required=true)
    private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * The name of the operation that should be checked for. If no name is provided, any operation will match.
     * 
     */
    @InputImport(name="operationName")
    private final @Nullable Input<String> operationName;

    public Input<String> getOperationName() {
        return this.operationName == null ? Input.empty() : this.operationName;
    }

    /**
     * the resource group name.
     * 
     */
    @InputImport(name="resourceGroupName")
    private final @Nullable Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName == null ? Input.empty() : this.resourceGroupName;
    }

    /**
     * the location of the resource.
     * 
     */
    @InputImport(name="resourceLocation")
    private final @Nullable Input<String> resourceLocation;

    public Input<String> getResourceLocation() {
        return this.resourceLocation == null ? Input.empty() : this.resourceLocation;
    }

    /**
     * the resource provider name.
     * 
     */
    @InputImport(name="resourceProviderName")
    private final @Nullable Input<String> resourceProviderName;

    public Input<String> getResourceProviderName() {
        return this.resourceProviderName == null ? Input.empty() : this.resourceProviderName;
    }

    /**
     * the resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
     */
    @InputImport(name="resourceUri")
    private final @Nullable Input<String> resourceUri;

    public Input<String> getResourceUri() {
        return this.resourceUri == null ? Input.empty() : this.resourceUri;
    }

    /**
     * The status of the operation that should be checked for. If no status is provided, any status will match.
     * 
     */
    @InputImport(name="status")
    private final @Nullable Input<String> status;

    public Input<String> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    /**
     * the substatus.
     * 
     */
    @InputImport(name="subStatus")
    private final @Nullable Input<String> subStatus;

    public Input<String> getSubStatus() {
        return this.subStatus == null ? Input.empty() : this.subStatus;
    }

    public RuleManagementEventDataSourceArgs(
        @Nullable Input<RuleManagementEventClaimsDataSourceArgs> claims,
        @Nullable Input<String> eventName,
        @Nullable Input<String> eventSource,
        @Nullable Input<String> legacyResourceId,
        @Nullable Input<String> level,
        @Nullable Input<String> metricNamespace,
        Input<String> odataType,
        @Nullable Input<String> operationName,
        @Nullable Input<String> resourceGroupName,
        @Nullable Input<String> resourceLocation,
        @Nullable Input<String> resourceProviderName,
        @Nullable Input<String> resourceUri,
        @Nullable Input<String> status,
        @Nullable Input<String> subStatus) {
        this.claims = claims;
        this.eventName = eventName;
        this.eventSource = eventSource;
        this.legacyResourceId = legacyResourceId;
        this.level = level;
        this.metricNamespace = metricNamespace;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operationName = operationName;
        this.resourceGroupName = resourceGroupName;
        this.resourceLocation = resourceLocation;
        this.resourceProviderName = resourceProviderName;
        this.resourceUri = resourceUri;
        this.status = status;
        this.subStatus = subStatus;
    }

    private RuleManagementEventDataSourceArgs() {
        this.claims = Input.empty();
        this.eventName = Input.empty();
        this.eventSource = Input.empty();
        this.legacyResourceId = Input.empty();
        this.level = Input.empty();
        this.metricNamespace = Input.empty();
        this.odataType = Input.empty();
        this.operationName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceLocation = Input.empty();
        this.resourceProviderName = Input.empty();
        this.resourceUri = Input.empty();
        this.status = Input.empty();
        this.subStatus = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleManagementEventDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuleManagementEventClaimsDataSourceArgs> claims;
        private @Nullable Input<String> eventName;
        private @Nullable Input<String> eventSource;
        private @Nullable Input<String> legacyResourceId;
        private @Nullable Input<String> level;
        private @Nullable Input<String> metricNamespace;
        private Input<String> odataType;
        private @Nullable Input<String> operationName;
        private @Nullable Input<String> resourceGroupName;
        private @Nullable Input<String> resourceLocation;
        private @Nullable Input<String> resourceProviderName;
        private @Nullable Input<String> resourceUri;
        private @Nullable Input<String> status;
        private @Nullable Input<String> subStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleManagementEventDataSourceArgs defaults) {
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

        public Builder setClaims(@Nullable Input<RuleManagementEventClaimsDataSourceArgs> claims) {
            this.claims = claims;
            return this;
        }

        public Builder setClaims(@Nullable RuleManagementEventClaimsDataSourceArgs claims) {
            this.claims = Input.ofNullable(claims);
            return this;
        }

        public Builder setEventName(@Nullable Input<String> eventName) {
            this.eventName = eventName;
            return this;
        }

        public Builder setEventName(@Nullable String eventName) {
            this.eventName = Input.ofNullable(eventName);
            return this;
        }

        public Builder setEventSource(@Nullable Input<String> eventSource) {
            this.eventSource = eventSource;
            return this;
        }

        public Builder setEventSource(@Nullable String eventSource) {
            this.eventSource = Input.ofNullable(eventSource);
            return this;
        }

        public Builder setLegacyResourceId(@Nullable Input<String> legacyResourceId) {
            this.legacyResourceId = legacyResourceId;
            return this;
        }

        public Builder setLegacyResourceId(@Nullable String legacyResourceId) {
            this.legacyResourceId = Input.ofNullable(legacyResourceId);
            return this;
        }

        public Builder setLevel(@Nullable Input<String> level) {
            this.level = level;
            return this;
        }

        public Builder setLevel(@Nullable String level) {
            this.level = Input.ofNullable(level);
            return this;
        }

        public Builder setMetricNamespace(@Nullable Input<String> metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        public Builder setMetricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = Input.ofNullable(metricNamespace);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setOperationName(@Nullable Input<String> operationName) {
            this.operationName = operationName;
            return this;
        }

        public Builder setOperationName(@Nullable String operationName) {
            this.operationName = Input.ofNullable(operationName);
            return this;
        }

        public Builder setResourceGroupName(@Nullable Input<String> resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder setResourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = Input.ofNullable(resourceGroupName);
            return this;
        }

        public Builder setResourceLocation(@Nullable Input<String> resourceLocation) {
            this.resourceLocation = resourceLocation;
            return this;
        }

        public Builder setResourceLocation(@Nullable String resourceLocation) {
            this.resourceLocation = Input.ofNullable(resourceLocation);
            return this;
        }

        public Builder setResourceProviderName(@Nullable Input<String> resourceProviderName) {
            this.resourceProviderName = resourceProviderName;
            return this;
        }

        public Builder setResourceProviderName(@Nullable String resourceProviderName) {
            this.resourceProviderName = Input.ofNullable(resourceProviderName);
            return this;
        }

        public Builder setResourceUri(@Nullable Input<String> resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public Builder setResourceUri(@Nullable String resourceUri) {
            this.resourceUri = Input.ofNullable(resourceUri);
            return this;
        }

        public Builder setStatus(@Nullable Input<String> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = Input.ofNullable(status);
            return this;
        }

        public Builder setSubStatus(@Nullable Input<String> subStatus) {
            this.subStatus = subStatus;
            return this;
        }

        public Builder setSubStatus(@Nullable String subStatus) {
            this.subStatus = Input.ofNullable(subStatus);
            return this;
        }

        public RuleManagementEventDataSourceArgs build() {
            return new RuleManagementEventDataSourceArgs(claims, eventName, eventSource, legacyResourceId, level, metricNamespace, odataType, operationName, resourceGroupName, resourceLocation, resourceProviderName, resourceUri, status, subStatus);
        }
    }
}
