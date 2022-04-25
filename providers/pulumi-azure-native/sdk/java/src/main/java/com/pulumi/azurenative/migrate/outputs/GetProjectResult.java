// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.outputs;

import com.pulumi.azurenative.migrate.outputs.ProjectPropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectResult {
    /**
     * @return For optimistic concurrency control.
     * 
     */
    private final @Nullable String eTag;
    /**
     * @return Path reference to this project /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Migrate/assessmentProjects/{projectName}
     * 
     */
    private final String id;
    /**
     * @return Azure location in which project is created.
     * 
     */
    private final @Nullable String location;
    /**
     * @return Name of the project.
     * 
     */
    private final String name;
    /**
     * @return Properties of the project.
     * 
     */
    private final ProjectPropertiesResponse properties;
    /**
     * @return Tags provided by Azure Tagging service.
     * 
     */
    private final @Nullable Object tags;
    /**
     * @return Type of the object = [Microsoft.Migrate/assessmentProjects].
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetProjectResult(
        @CustomType.Parameter("eTag") @Nullable String eTag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") ProjectPropertiesResponse properties,
        @CustomType.Parameter("tags") @Nullable Object tags,
        @CustomType.Parameter("type") String type) {
        this.eTag = eTag;
        this.id = id;
        this.location = location;
        this.name = name;
        this.properties = properties;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return For optimistic concurrency control.
     * 
     */
    public Optional<String> eTag() {
        return Optional.ofNullable(this.eTag);
    }
    /**
     * @return Path reference to this project /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Migrate/assessmentProjects/{projectName}
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Azure location in which project is created.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Name of the project.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Properties of the project.
     * 
     */
    public ProjectPropertiesResponse properties() {
        return this.properties;
    }
    /**
     * @return Tags provided by Azure Tagging service.
     * 
     */
    public Optional<Object> tags() {
        return Optional.ofNullable(this.tags);
    }
    /**
     * @return Type of the object = [Microsoft.Migrate/assessmentProjects].
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eTag;
        private String id;
        private @Nullable String location;
        private String name;
        private ProjectPropertiesResponse properties;
        private @Nullable Object tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eTag = defaults.eTag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder eTag(@Nullable String eTag) {
            this.eTag = eTag;
            return this;
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
        public Builder properties(ProjectPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder tags(@Nullable Object tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetProjectResult build() {
            return new GetProjectResult(eTag, id, location, name, properties, tags, type);
        }
    }
}
