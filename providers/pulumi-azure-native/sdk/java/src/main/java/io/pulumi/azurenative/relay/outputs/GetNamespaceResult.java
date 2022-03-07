// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay.outputs;

import io.pulumi.azurenative.relay.outputs.SkuResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetNamespaceResult {
    /**
     * The time the namespace was created.
     * 
     */
    private final String createdAt;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Identifier for Azure Insights metrics.
     * 
     */
    private final String metricId;
    /**
     * Resource name.
     * 
     */
    private final String name;
    private final String provisioningState;
    /**
     * Endpoint you can use to perform Service Bus operations.
     * 
     */
    private final String serviceBusEndpoint;
    /**
     * SKU of the namespace.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * The time the namespace was updated.
     * 
     */
    private final String updatedAt;

    @OutputCustomType.Constructor({"createdAt","id","location","metricId","name","provisioningState","serviceBusEndpoint","sku","tags","type","updatedAt"})
    private GetNamespaceResult(
        String createdAt,
        String id,
        String location,
        String metricId,
        String name,
        String provisioningState,
        String serviceBusEndpoint,
        @Nullable SkuResponse sku,
        @Nullable Map<String,String> tags,
        String type,
        String updatedAt) {
        this.createdAt = Objects.requireNonNull(createdAt);
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.metricId = Objects.requireNonNull(metricId);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.serviceBusEndpoint = Objects.requireNonNull(serviceBusEndpoint);
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
        this.updatedAt = Objects.requireNonNull(updatedAt);
    }

    /**
     * The time the namespace was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Identifier for Azure Insights metrics.
     * 
    */
    public String getMetricId() {
        return this.metricId;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Endpoint you can use to perform Service Bus operations.
     * 
    */
    public String getServiceBusEndpoint() {
        return this.serviceBusEndpoint;
    }
    /**
     * SKU of the namespace.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * The time the namespace was updated.
     * 
    */
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNamespaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String id;
        private String location;
        private String metricId;
        private String name;
        private String provisioningState;
        private String serviceBusEndpoint;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;
        private String updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNamespaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.metricId = defaults.metricId;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.serviceBusEndpoint = defaults.serviceBusEndpoint;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setMetricId(String metricId) {
            this.metricId = Objects.requireNonNull(metricId);
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

        public Builder setServiceBusEndpoint(String serviceBusEndpoint) {
            this.serviceBusEndpoint = Objects.requireNonNull(serviceBusEndpoint);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUpdatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }
        public GetNamespaceResult build() {
            return new GetNamespaceResult(createdAt, id, location, metricId, name, provisioningState, serviceBusEndpoint, sku, tags, type, updatedAt);
        }
    }
}