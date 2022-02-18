// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.enterpriseknowledgegraph.outputs;

import io.pulumi.azurenative.enterpriseknowledgegraph.outputs.EnterpriseKnowledgeGraphPropertiesResponse;
import io.pulumi.azurenative.enterpriseknowledgegraph.outputs.SkuResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEnterpriseKnowledgeGraphResult {
    /**
     * Specifies the resource ID.
     * 
     */
    private final String id;
    /**
     * Specifies the location of the resource.
     * 
     */
    private final @Nullable String location;
    /**
     * Specifies the name of the resource.
     * 
     */
    private final String name;
    /**
     * The set of properties specific to EnterpriseKnowledgeGraph resource
     * 
     */
    private final EnterpriseKnowledgeGraphPropertiesResponse properties;
    /**
     * Gets or sets the SKU of the resource.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Specifies the type of the resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","properties","sku","tags","type"})
    private GetEnterpriseKnowledgeGraphResult(
        String id,
        @Nullable String location,
        String name,
        EnterpriseKnowledgeGraphPropertiesResponse properties,
        @Nullable SkuResponse sku,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
        this.sku = sku;
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Specifies the resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Specifies the location of the resource.
     * 
     */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Specifies the name of the resource.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The set of properties specific to EnterpriseKnowledgeGraph resource
     * 
     */
    public EnterpriseKnowledgeGraphPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Gets or sets the SKU of the resource.
     * 
     */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Contains resource tags defined as key/value pairs.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Specifies the type of the resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnterpriseKnowledgeGraphResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private String name;
        private EnterpriseKnowledgeGraphPropertiesResponse properties;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnterpriseKnowledgeGraphResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
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

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProperties(EnterpriseKnowledgeGraphPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
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

        public GetEnterpriseKnowledgeGraphResult build() {
            return new GetEnterpriseKnowledgeGraphResult(id, location, name, properties, sku, tags, type);
        }
    }
}
