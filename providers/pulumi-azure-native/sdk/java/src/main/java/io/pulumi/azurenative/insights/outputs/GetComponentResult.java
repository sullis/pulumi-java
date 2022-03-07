// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.PrivateLinkScopedResourceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetComponentResult {
    /**
     * Application Insights Unique ID for your Application.
     * 
     */
    private final String appId;
    /**
     * The unique ID of your application. This field mirrors the 'Name' field and cannot be changed.
     * 
     */
    private final String applicationId;
    /**
     * Type of application being monitored.
     * 
     */
    private final String applicationType;
    /**
     * Application Insights component connection string.
     * 
     */
    private final String connectionString;
    /**
     * Creation Date for the Application Insights component, in ISO 8601 format.
     * 
     */
    private final String creationDate;
    /**
     * Disable IP masking.
     * 
     */
    private final @Nullable Boolean disableIpMasking;
    /**
     * Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to 'Bluefield' when creating/updating a component via the REST API.
     * 
     */
    private final @Nullable String flowType;
    /**
     * The unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
     * 
     */
    private final @Nullable String hockeyAppId;
    /**
     * Token used to authenticate communications with between Application Insights and HockeyApp.
     * 
     */
    private final String hockeyAppToken;
    /**
     * Azure resource Id
     * 
     */
    private final String id;
    /**
     * Purge data immediately after 30 days.
     * 
     */
    private final @Nullable Boolean immediatePurgeDataOn30Days;
    /**
     * Indicates the flow of the ingestion.
     * 
     */
    private final @Nullable String ingestionMode;
    /**
     * Application Insights Instrumentation key. A read-only value that applications can use to identify the destination for all telemetry sent to Azure Application Insights. This value will be supplied upon construction of each new Application Insights component.
     * 
     */
    private final String instrumentationKey;
    /**
     * The kind of application that this component refers to, used to customize UI. This value is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     * 
     */
    private final String kind;
    /**
     * Resource location
     * 
     */
    private final String location;
    /**
     * Azure resource name
     * 
     */
    private final String name;
    /**
     * List of linked private link scope resources.
     * 
     */
    private final List<PrivateLinkScopedResourceResponse> privateLinkScopedResources;
    /**
     * Current state of this component: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
     */
    private final String provisioningState;
    /**
     * Describes what tool created this Application Insights component. Customers using this API should set this to the default 'rest'.
     * 
     */
    private final @Nullable String requestSource;
    /**
     * Retention period in days.
     * 
     */
    private final @Nullable Integer retentionInDays;
    /**
     * Percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
     * 
     */
    private final @Nullable Double samplingPercentage;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Azure Tenant Id.
     * 
     */
    private final String tenantId;
    /**
     * Azure resource type
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"appId","applicationId","applicationType","connectionString","creationDate","disableIpMasking","flowType","hockeyAppId","hockeyAppToken","id","immediatePurgeDataOn30Days","ingestionMode","instrumentationKey","kind","location","name","privateLinkScopedResources","provisioningState","requestSource","retentionInDays","samplingPercentage","tags","tenantId","type"})
    private GetComponentResult(
        String appId,
        String applicationId,
        String applicationType,
        String connectionString,
        String creationDate,
        @Nullable Boolean disableIpMasking,
        @Nullable String flowType,
        @Nullable String hockeyAppId,
        String hockeyAppToken,
        String id,
        @Nullable Boolean immediatePurgeDataOn30Days,
        @Nullable String ingestionMode,
        String instrumentationKey,
        String kind,
        String location,
        String name,
        List<PrivateLinkScopedResourceResponse> privateLinkScopedResources,
        String provisioningState,
        @Nullable String requestSource,
        @Nullable Integer retentionInDays,
        @Nullable Double samplingPercentage,
        @Nullable Map<String,String> tags,
        String tenantId,
        String type) {
        this.appId = Objects.requireNonNull(appId);
        this.applicationId = Objects.requireNonNull(applicationId);
        this.applicationType = Objects.requireNonNull(applicationType);
        this.connectionString = Objects.requireNonNull(connectionString);
        this.creationDate = Objects.requireNonNull(creationDate);
        this.disableIpMasking = disableIpMasking;
        this.flowType = flowType;
        this.hockeyAppId = hockeyAppId;
        this.hockeyAppToken = Objects.requireNonNull(hockeyAppToken);
        this.id = Objects.requireNonNull(id);
        this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
        this.ingestionMode = ingestionMode;
        this.instrumentationKey = Objects.requireNonNull(instrumentationKey);
        this.kind = Objects.requireNonNull(kind);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.privateLinkScopedResources = Objects.requireNonNull(privateLinkScopedResources);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.requestSource = requestSource;
        this.retentionInDays = retentionInDays;
        this.samplingPercentage = samplingPercentage;
        this.tags = tags;
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Application Insights Unique ID for your Application.
     * 
    */
    public String getAppId() {
        return this.appId;
    }
    /**
     * The unique ID of your application. This field mirrors the 'Name' field and cannot be changed.
     * 
    */
    public String getApplicationId() {
        return this.applicationId;
    }
    /**
     * Type of application being monitored.
     * 
    */
    public String getApplicationType() {
        return this.applicationType;
    }
    /**
     * Application Insights component connection string.
     * 
    */
    public String getConnectionString() {
        return this.connectionString;
    }
    /**
     * Creation Date for the Application Insights component, in ISO 8601 format.
     * 
    */
    public String getCreationDate() {
        return this.creationDate;
    }
    /**
     * Disable IP masking.
     * 
    */
    public Optional<Boolean> getDisableIpMasking() {
        return Optional.ofNullable(this.disableIpMasking);
    }
    /**
     * Used by the Application Insights system to determine what kind of flow this component was created by. This is to be set to 'Bluefield' when creating/updating a component via the REST API.
     * 
    */
    public Optional<String> getFlowType() {
        return Optional.ofNullable(this.flowType);
    }
    /**
     * The unique application ID created when a new application is added to HockeyApp, used for communications with HockeyApp.
     * 
    */
    public Optional<String> getHockeyAppId() {
        return Optional.ofNullable(this.hockeyAppId);
    }
    /**
     * Token used to authenticate communications with between Application Insights and HockeyApp.
     * 
    */
    public String getHockeyAppToken() {
        return this.hockeyAppToken;
    }
    /**
     * Azure resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Purge data immediately after 30 days.
     * 
    */
    public Optional<Boolean> getImmediatePurgeDataOn30Days() {
        return Optional.ofNullable(this.immediatePurgeDataOn30Days);
    }
    /**
     * Indicates the flow of the ingestion.
     * 
    */
    public Optional<String> getIngestionMode() {
        return Optional.ofNullable(this.ingestionMode);
    }
    /**
     * Application Insights Instrumentation key. A read-only value that applications can use to identify the destination for all telemetry sent to Azure Application Insights. This value will be supplied upon construction of each new Application Insights component.
     * 
    */
    public String getInstrumentationKey() {
        return this.instrumentationKey;
    }
    /**
     * The kind of application that this component refers to, used to customize UI. This value is a freeform string, values should typically be one of the following: web, ios, other, store, java, phone.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Resource location
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Azure resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * List of linked private link scope resources.
     * 
    */
    public List<PrivateLinkScopedResourceResponse> getPrivateLinkScopedResources() {
        return this.privateLinkScopedResources;
    }
    /**
     * Current state of this component: whether or not is has been provisioned within the resource group it is defined. Users cannot change this value but are able to read from it. Values will include Succeeded, Deploying, Canceled, and Failed.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Describes what tool created this Application Insights component. Customers using this API should set this to the default 'rest'.
     * 
    */
    public Optional<String> getRequestSource() {
        return Optional.ofNullable(this.requestSource);
    }
    /**
     * Retention period in days.
     * 
    */
    public Optional<Integer> getRetentionInDays() {
        return Optional.ofNullable(this.retentionInDays);
    }
    /**
     * Percentage of the data produced by the application being monitored that is being sampled for Application Insights telemetry.
     * 
    */
    public Optional<Double> getSamplingPercentage() {
        return Optional.ofNullable(this.samplingPercentage);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Azure Tenant Id.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * Azure resource type
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetComponentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String appId;
        private String applicationId;
        private String applicationType;
        private String connectionString;
        private String creationDate;
        private @Nullable Boolean disableIpMasking;
        private @Nullable String flowType;
        private @Nullable String hockeyAppId;
        private String hockeyAppToken;
        private String id;
        private @Nullable Boolean immediatePurgeDataOn30Days;
        private @Nullable String ingestionMode;
        private String instrumentationKey;
        private String kind;
        private String location;
        private String name;
        private List<PrivateLinkScopedResourceResponse> privateLinkScopedResources;
        private String provisioningState;
        private @Nullable String requestSource;
        private @Nullable Integer retentionInDays;
        private @Nullable Double samplingPercentage;
        private @Nullable Map<String,String> tags;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetComponentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.applicationId = defaults.applicationId;
    	      this.applicationType = defaults.applicationType;
    	      this.connectionString = defaults.connectionString;
    	      this.creationDate = defaults.creationDate;
    	      this.disableIpMasking = defaults.disableIpMasking;
    	      this.flowType = defaults.flowType;
    	      this.hockeyAppId = defaults.hockeyAppId;
    	      this.hockeyAppToken = defaults.hockeyAppToken;
    	      this.id = defaults.id;
    	      this.immediatePurgeDataOn30Days = defaults.immediatePurgeDataOn30Days;
    	      this.ingestionMode = defaults.ingestionMode;
    	      this.instrumentationKey = defaults.instrumentationKey;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.privateLinkScopedResources = defaults.privateLinkScopedResources;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestSource = defaults.requestSource;
    	      this.retentionInDays = defaults.retentionInDays;
    	      this.samplingPercentage = defaults.samplingPercentage;
    	      this.tags = defaults.tags;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setAppId(String appId) {
            this.appId = Objects.requireNonNull(appId);
            return this;
        }

        public Builder setApplicationId(String applicationId) {
            this.applicationId = Objects.requireNonNull(applicationId);
            return this;
        }

        public Builder setApplicationType(String applicationType) {
            this.applicationType = Objects.requireNonNull(applicationType);
            return this;
        }

        public Builder setConnectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }

        public Builder setCreationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }

        public Builder setDisableIpMasking(@Nullable Boolean disableIpMasking) {
            this.disableIpMasking = disableIpMasking;
            return this;
        }

        public Builder setFlowType(@Nullable String flowType) {
            this.flowType = flowType;
            return this;
        }

        public Builder setHockeyAppId(@Nullable String hockeyAppId) {
            this.hockeyAppId = hockeyAppId;
            return this;
        }

        public Builder setHockeyAppToken(String hockeyAppToken) {
            this.hockeyAppToken = Objects.requireNonNull(hockeyAppToken);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setImmediatePurgeDataOn30Days(@Nullable Boolean immediatePurgeDataOn30Days) {
            this.immediatePurgeDataOn30Days = immediatePurgeDataOn30Days;
            return this;
        }

        public Builder setIngestionMode(@Nullable String ingestionMode) {
            this.ingestionMode = ingestionMode;
            return this;
        }

        public Builder setInstrumentationKey(String instrumentationKey) {
            this.instrumentationKey = Objects.requireNonNull(instrumentationKey);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
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

        public Builder setPrivateLinkScopedResources(List<PrivateLinkScopedResourceResponse> privateLinkScopedResources) {
            this.privateLinkScopedResources = Objects.requireNonNull(privateLinkScopedResources);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRequestSource(@Nullable String requestSource) {
            this.requestSource = requestSource;
            return this;
        }

        public Builder setRetentionInDays(@Nullable Integer retentionInDays) {
            this.retentionInDays = retentionInDays;
            return this;
        }

        public Builder setSamplingPercentage(@Nullable Double samplingPercentage) {
            this.samplingPercentage = samplingPercentage;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
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
        public GetComponentResult build() {
            return new GetComponentResult(appId, applicationId, applicationType, connectionString, creationDate, disableIpMasking, flowType, hockeyAppId, hockeyAppToken, id, immediatePurgeDataOn30Days, ingestionMode, instrumentationKey, kind, location, name, privateLinkScopedResources, provisioningState, requestSource, retentionInDays, samplingPercentage, tags, tenantId, type);
        }
    }
}