// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmentPropertiesResponse;
import io.pulumi.azurenative.logic.outputs.IntegrationServiceEnvironmentSkuResponse;
import io.pulumi.azurenative.logic.outputs.ManagedServiceIdentityResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIntegrationServiceEnvironmentResult {
    /**
     * The resource id.
     * 
     */
    private final String id;
    /**
     * Managed service identity properties.
     * 
     */
    private final @Nullable ManagedServiceIdentityResponse identity;
    /**
     * The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * Gets the resource name.
     * 
     */
    private final String name;
    /**
     * The integration service environment properties.
     * 
     */
    private final IntegrationServiceEnvironmentPropertiesResponse properties;
    /**
     * The sku.
     * 
     */
    private final @Nullable IntegrationServiceEnvironmentSkuResponse sku;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets the resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","identity","location","name","properties","sku","tags","type"})
    private GetIntegrationServiceEnvironmentResult(
        String id,
        @Nullable ManagedServiceIdentityResponse identity,
        @Nullable String location,
        String name,
        IntegrationServiceEnvironmentPropertiesResponse properties,
        @Nullable IntegrationServiceEnvironmentSkuResponse sku,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.identity = identity;
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The resource id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Managed service identity properties.
     * 
    */
    public Optional<ManagedServiceIdentityResponse> getIdentity() {
        return Optional.ofNullable(this.identity);
    }
    /**
     * The resource location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Gets the resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The integration service environment properties.
     * 
    */
    public IntegrationServiceEnvironmentPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * The sku.
     * 
    */
    public Optional<IntegrationServiceEnvironmentSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Gets the resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIntegrationServiceEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable ManagedServiceIdentityResponse identity;
        private @Nullable String location;
        private String name;
        private IntegrationServiceEnvironmentPropertiesResponse properties;
        private @Nullable IntegrationServiceEnvironmentSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationServiceEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIdentity(@Nullable ManagedServiceIdentityResponse identity) {
            this.identity = identity;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(IntegrationServiceEnvironmentPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setSku(@Nullable IntegrationServiceEnvironmentSkuResponse sku) {
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
        public GetIntegrationServiceEnvironmentResult build() {
            return new GetIntegrationServiceEnvironmentResult(id, identity, location, name, properties, sku, tags, type);
        }
    }
}