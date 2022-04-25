// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetContentTypeResult {
    /**
     * @return Content type description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Resource ID.
     * 
     */
    private final String id;
    /**
     * @return Resource name.
     * 
     */
    private final String name;
    /**
     * @return Content type schema.
     * 
     */
    private final @Nullable Object schema;
    /**
     * @return Resource type for API Management resource.
     * 
     */
    private final String type;
    /**
     * @return Content type version.
     * 
     */
    private final @Nullable String version;

    @CustomType.Constructor
    private GetContentTypeResult(
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("schema") @Nullable Object schema,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("version") @Nullable String version) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.schema = schema;
        this.type = type;
        this.version = version;
    }

    /**
     * @return Content type description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Resource ID.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Content type schema.
     * 
     */
    public Optional<Object> schema() {
        return Optional.ofNullable(this.schema);
    }
    /**
     * @return Resource type for API Management resource.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Content type version.
     * 
     */
    public Optional<String> version() {
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

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder schema(@Nullable Object schema) {
            this.schema = schema;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public GetContentTypeResult build() {
            return new GetContentTypeResult(description, id, name, schema, type, version);
        }
    }
}
