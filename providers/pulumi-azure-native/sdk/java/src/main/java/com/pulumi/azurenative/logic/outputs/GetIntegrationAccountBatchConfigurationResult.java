// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.outputs;

import com.pulumi.azurenative.logic.outputs.BatchConfigurationPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetIntegrationAccountBatchConfigurationResult {
    /**
     * @return The resource id.
     * 
     */
    private final String id;
    /**
     * @return The resource location.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Gets the resource name.
     * 
     */
    private final String name;
    /**
     * @return The batch configuration properties.
     * 
     */
    private final BatchConfigurationPropertiesResponse properties;
    /**
     * @return The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Gets the resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetIntegrationAccountBatchConfigurationResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") BatchConfigurationPropertiesResponse properties,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return The resource id.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The resource location.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Gets the resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The batch configuration properties.
     * 
     */
    public BatchConfigurationPropertiesResponse properties() {
        return this.properties;
    }
    /**
     * @return The resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Gets the resource type.
     * 
     */
    public String type() {
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

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(BatchConfigurationPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetIntegrationAccountBatchConfigurationResult build() {
            return new GetIntegrationAccountBatchConfigurationResult(id, location, name, properties, tags, type);
        }
    }
}
