// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.outputs;

import io.pulumi.azurenative.servicebus.outputs.SBSkuResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetNamespaceResult {
    /**
     * The time the namespace was created.
     * 
     */
    private final String createdAt;
    /**
     * Resource Id
     * 
     */
    private final String id;
    /**
     * The Geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * Identifier for Azure Insights metrics
     * 
     */
    private final String metricId;
    /**
     * Resource name
     * 
     */
    private final String name;
    /**
     * Provisioning state of the namespace.
     * 
     */
    private final String provisioningState;
    /**
     * Endpoint you can use to perform Service Bus operations.
     * 
     */
    private final String serviceBusEndpoint;
    /**
     * Properties of Sku
     * 
     */
    private final @Nullable SBSkuResponse sku;
    /**
     * Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Resource type
     * 
     */
    private final String type;
    /**
     * The time the namespace was updated.
     * 
     */
    private final String updatedAt;

    @CustomType.Constructor
    private GetNamespaceResult(
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("metricId") String metricId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("serviceBusEndpoint") String serviceBusEndpoint,
        @CustomType.Parameter("sku") @Nullable SBSkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("updatedAt") String updatedAt) {
        this.createdAt = createdAt;
        this.id = id;
        this.location = location;
        this.metricId = metricId;
        this.name = name;
        this.provisioningState = provisioningState;
        this.serviceBusEndpoint = serviceBusEndpoint;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
        this.updatedAt = updatedAt;
    }

    /**
     * The time the namespace was created.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Resource Id
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The Geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Identifier for Azure Insights metrics
     * 
    */
    public String getMetricId() {
        return this.metricId;
    }
    /**
     * Resource name
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Provisioning state of the namespace.
     * 
    */
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
     * Properties of Sku
     * 
    */
    public Optional<SBSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Resource type
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
        private @Nullable SBSkuResponse sku;
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

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder metricId(String metricId) {
            this.metricId = Objects.requireNonNull(metricId);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder serviceBusEndpoint(String serviceBusEndpoint) {
            this.serviceBusEndpoint = Objects.requireNonNull(serviceBusEndpoint);
            return this;
        }
        public Builder sku(@Nullable SBSkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = Objects.requireNonNull(updatedAt);
            return this;
        }        public GetNamespaceResult build() {
            return new GetNamespaceResult(createdAt, id, location, metricId, name, provisioningState, serviceBusEndpoint, sku, tags, type, updatedAt);
        }
    }
}
