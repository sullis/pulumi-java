// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.elastic.outputs;

import io.pulumi.azurenative.elastic.outputs.IdentityPropertiesResponse;
import io.pulumi.azurenative.elastic.outputs.MonitorPropertiesResponse;
import io.pulumi.azurenative.elastic.outputs.ResourceSkuResponse;
import io.pulumi.azurenative.elastic.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMonitorResult {
    /**
     * ARM id of the monitor resource.
     * 
     */
    private final String id;
    /**
     * Identity properties of the monitor resource.
     * 
     */
    private final @Nullable IdentityPropertiesResponse identity;
    /**
     * The location of the monitor resource
     * 
     */
    private final String location;
    /**
     * Name of the monitor resource.
     * 
     */
    private final String name;
    /**
     * Properties of the monitor resource.
     * 
     */
    private final MonitorPropertiesResponse properties;
    /**
     * SKU of the monitor resource.
     * 
     */
    private final @Nullable ResourceSkuResponse sku;
    /**
     * The system metadata relating to this resource
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The tags of the monitor resource.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the monitor resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","identity","location","name","properties","sku","systemData","tags","type"})
    private GetMonitorResult(
        String id,
        @Nullable IdentityPropertiesResponse identity,
        String location,
        String name,
        MonitorPropertiesResponse properties,
        @Nullable ResourceSkuResponse sku,
        SystemDataResponse systemData,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.sku = sku;
        this.systemData = Objects.requireNonNull(systemData);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * ARM id of the monitor resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Identity properties of the monitor resource.
     * 
     */
    public Optional<IdentityPropertiesResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The location of the monitor resource
     * 
     */
    public String getLocation() {
        return this.location;
    }
    /**
     * Name of the monitor resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Properties of the monitor resource.
     * 
     */
    public MonitorPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * SKU of the monitor resource.
     * 
     */
    public Optional<ResourceSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The system metadata relating to this resource
     * 
     */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The tags of the monitor resource.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the monitor resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMonitorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable IdentityPropertiesResponse identity;
        private String location;
        private String name;
        private MonitorPropertiesResponse properties;
        private @Nullable ResourceSkuResponse sku;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMonitorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable IdentityPropertiesResponse identity) {
            this.identity = identity;
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

        public Builder setProperties(MonitorPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSku(@Nullable ResourceSkuResponse sku) {
            this.sku = sku;
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

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetMonitorResult build() {
            return new GetMonitorResult(id, identity, location, name, properties, sku, systemData, tags, type);
        }
    }
}
