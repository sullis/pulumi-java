// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.azurenative.logic.outputs.BatchConfigurationPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetIntegrationAccountBatchConfigurationResult {
    /**
     * The resource id.
     * 
     */
    private final String id;
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
     * The batch configuration properties.
     * 
     */
    private final BatchConfigurationPropertiesResponse properties;
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

    @OutputCustomType.Constructor({"id","location","name","properties","tags","type"})
    private GetIntegrationAccountBatchConfigurationResult(
        String id,
        @Nullable String location,
        String name,
        BatchConfigurationPropertiesResponse properties,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.properties = Objects.requireNonNull(properties);
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
     * The batch configuration properties.
     * 
     */
    public BatchConfigurationPropertiesResponse getProperties() {
        return this.properties;
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

    public static Builder builder(GetIntegrationAccountBatchConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private String name;
        private BatchConfigurationPropertiesResponse properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetIntegrationAccountBatchConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
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

        public Builder setProperties(BatchConfigurationPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
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

        public GetIntegrationAccountBatchConfigurationResult build() {
            return new GetIntegrationAccountBatchConfigurationResult(id, location, name, properties, tags, type);
        }
    }
}
