// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataContainerResponse {
    /**
     * The asset description text.
     * 
     */
    private final @Nullable String description;
    /**
     * The asset property dictionary.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    private final @Nullable Map<String,String> tags;

    @OutputCustomType.Constructor({"description","properties","tags"})
    private DataContainerResponse(
        @Nullable String description,
        @Nullable Map<String,String> properties,
        @Nullable Map<String,String> tags) {
        this.description = description;
        this.properties = properties;
        this.tags = tags;
    }

    /**
     * The asset description text.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * The asset property dictionary.
     * 
     */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Map<String,String> properties;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(DataContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public DataContainerResponse build() {
            return new DataContainerResponse(description, properties, tags);
        }
    }
}
