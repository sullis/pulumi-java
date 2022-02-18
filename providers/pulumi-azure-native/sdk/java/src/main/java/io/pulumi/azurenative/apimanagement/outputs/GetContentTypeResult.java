// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetContentTypeResult {
    /**
     * Content type description.
     * 
     */
    private final @Nullable String description;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Content type schema.
     * 
     */
    private final @Nullable Object schema;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;
    /**
     * Content type version.
     * 
     */
    private final @Nullable String version;

    @OutputCustomType.Constructor({"description","id","name","schema","type","version"})
    private GetContentTypeResult(
        @Nullable String description,
        String id,
        String name,
        @Nullable Object schema,
        String type,
        @Nullable String version) {
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.schema = schema;
        this.type = Objects.requireNonNull(type);
        this.version = version;
    }

    /**
     * Content type description.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Content type schema.
     * 
     */
    public Optional<Object> getSchema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * Content type version.
     * 
     */
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContentTypeResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String id;
        private String name;
        private @Nullable Object schema;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContentTypeResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.schema = defaults.schema;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setSchema(@Nullable Object schema) {
            this.schema = schema;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public GetContentTypeResult build() {
            return new GetContentTypeResult(description, id, name, schema, type, version);
        }
    }
}
