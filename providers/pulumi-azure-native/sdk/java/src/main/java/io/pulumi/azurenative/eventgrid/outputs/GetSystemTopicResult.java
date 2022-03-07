// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.IdentityInfoResponse;
import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSystemTopicResult {
    /**
     * Fully qualified identifier of the resource.
     * 
     */
    private final String id;
    /**
     * Identity information for the resource.
     * 
     */
    private final @Nullable IdentityInfoResponse identity;
    /**
     * Location of the resource.
     * 
     */
    private final String location;
    /**
     * Metric resource id for the system topic.
     * 
     */
    private final String metricResourceId;
    /**
     * Name of the resource.
     * 
     */
    private final String name;
    /**
     * Provisioning state of the system topic.
     * 
     */
    private final String provisioningState;
    /**
     * Source for the system topic.
     * 
     */
    private final @Nullable String source;
    /**
     * The system metadata relating to System Topic resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Tags of the resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * TopicType for the system topic.
     * 
     */
    private final @Nullable String topicType;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","identity","location","metricResourceId","name","provisioningState","source","systemData","tags","topicType","type"})
    private GetSystemTopicResult(
        String id,
        @Nullable IdentityInfoResponse identity,
        String location,
        String metricResourceId,
        String name,
        String provisioningState,
        @Nullable String source,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        @Nullable String topicType,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = Objects.requireNonNull(location);
        this.metricResourceId = Objects.requireNonNull(metricResourceId);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.source = source;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.topicType = topicType;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Fully qualified identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Identity information for the resource.
     * 
    */
    public Optional<IdentityInfoResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * Location of the resource.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Metric resource id for the system topic.
     * 
    */
    public String getMetricResourceId() {
        return this.metricResourceId;
    }
    /**
     * Name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the system topic.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Source for the system topic.
     * 
    */
    public Optional<String> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The system metadata relating to System Topic resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Tags of the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * TopicType for the system topic.
     * 
    */
    public Optional<String> getTopicType() {
        return Optional.ofNullable(this.topicType);
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSystemTopicResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityInfoResponse identity;
        private String location;
        private String metricResourceId;
        private String name;
        private String provisioningState;
        private @Nullable String source;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private @Nullable String topicType;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSystemTopicResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.metricResourceId = defaults.metricResourceId;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.topicType = defaults.topicType;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityInfoResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMetricResourceId(String metricResourceId) {
            this.metricResourceId = Objects.requireNonNull(metricResourceId);
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

        public Builder setSource(@Nullable String source) {
            this.source = source;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTopicType(@Nullable String topicType) {
            this.topicType = topicType;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetSystemTopicResult build() {
            return new GetSystemTopicResult(id, identity, location, metricResourceId, name, provisioningState, source, systemData, tags, topicType, type);
        }
    }
}