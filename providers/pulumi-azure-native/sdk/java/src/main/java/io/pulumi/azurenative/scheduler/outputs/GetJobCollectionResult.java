// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.azurenative.scheduler.outputs.JobCollectionPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetJobCollectionResult {
    /**
     * Gets the job collection resource identifier.
     * 
     */
    private final String id;
    /**
     * Gets or sets the storage account location.
     * 
     */
    private final @Nullable String location;
    /**
     * Gets or sets the job collection resource name.
     * 
     */
    private final @Nullable String name;
    /**
     * Gets or sets the job collection properties.
     * 
     */
    private final JobCollectionPropertiesResponse properties;
    /**
     * Gets or sets the tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets the job collection resource type.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"id","location","name","properties","tags","type"})
    private GetJobCollectionResult(
        String id,
        @Nullable String location,
        @Nullable String name,
        JobCollectionPropertiesResponse properties,
        @Nullable Map<String,String> tags,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.location = location;
        this.name = name;
        this.properties = Objects.requireNonNull(properties);
        this.tags = tags;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Gets the job collection resource identifier.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets the storage account location.
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * Gets or sets the job collection resource name.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Gets or sets the job collection properties.
     * 
    */
    public JobCollectionPropertiesResponse getProperties() {
        return this.properties;
    }
    /**
     * Gets or sets the tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Gets the job collection resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobCollectionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private @Nullable String location;
        private @Nullable String name;
        private JobCollectionPropertiesResponse properties;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetJobCollectionResult defaults) {
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

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProperties(JobCollectionPropertiesResponse properties) {
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
        public GetJobCollectionResult build() {
            return new GetJobCollectionResult(id, location, name, properties, tags, type);
        }
    }
}