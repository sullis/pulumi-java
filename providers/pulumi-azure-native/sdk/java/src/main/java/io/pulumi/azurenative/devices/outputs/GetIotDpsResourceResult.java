// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.azurenative.devices.outputs.IotDpsPropertiesDescriptionResponse;
import io.pulumi.azurenative.devices.outputs.IotDpsSkuInfoResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIotDpsResourceResult {
    /**
     * The Etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal ETag convention.
     * 
     */
    private final @Nullable String etag;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The resource location.
     * 
     */
    private final String location;
    /**
     * The resource name.
     * 
     */
    private final String name;
    /**
     * Service specific properties for a provisioning service
     * 
     */
    private final IotDpsPropertiesDescriptionResponse properties;
    /**
     * Sku info for a provisioning Service.
     * 
     */
    private final IotDpsSkuInfoResponse sku;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"etag","id","location","name","properties","sku","tags","type"})
    private GetIotDpsResourceResult(
        @Nullable String etag,
        String id,
        String location,
        String name,
        IotDpsPropertiesDescriptionResponse properties,
        IotDpsSkuInfoResponse sku,
        @Nullable Map<String,String> tags,
        String type) {
        this.etag = etag;
        this.id = Objects.requireNonNull(id);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.sku = Objects.requireNonNull(sku);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The Etag field is *not* required. If it is provided in the response body, it must also be provided as a header per the normal ETag convention.
     * 
    */
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * The resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Service specific properties for a provisioning service
     * 
    */
    public IotDpsPropertiesDescriptionResponse getProperties() {
        return this.properties;
    }
    /**
     * Sku info for a provisioning Service.
     * 
    */
    public IotDpsSkuInfoResponse getSku() {
        return this.sku;
    }
    /**
     * The resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIotDpsResourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String etag;
        private String id;
        private String location;
        private String name;
        private IotDpsPropertiesDescriptionResponse properties;
        private IotDpsSkuInfoResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIotDpsResourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
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

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(IotDpsPropertiesDescriptionResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSku(IotDpsSkuInfoResponse sku) {
            this.sku = Objects.requireNonNull(sku);
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
        public GetIotDpsResourceResult build() {
            return new GetIotDpsResourceResult(etag, id, location, name, properties, sku, tags, type);
        }
    }
}