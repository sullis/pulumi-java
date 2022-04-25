// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConnectionErrorResponse {
    /**
     * @return Code of the status
     * 
     */
    private final @Nullable String code;
    /**
     * @return Resource ETag
     * 
     */
    private final @Nullable String etag;
    /**
     * @return Resource id
     * 
     */
    private final String id;
    /**
     * @return Resource location
     * 
     */
    private final @Nullable String location;
    /**
     * @return Description of the status
     * 
     */
    private final @Nullable String message;
    /**
     * @return Resource name
     * 
     */
    private final String name;
    /**
     * @return Resource tags
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * @return Resource type
     * 
     */
    private final String type;

    @CustomType.Constructor
    private ConnectionErrorResponse(
        @CustomType.Parameter("code") @Nullable String code,
        @CustomType.Parameter("etag") @Nullable String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.code = code;
        this.etag = etag;
        this.id = id;
        this.location = location;
        this.message = message;
        this.name = name;
        this.tags = tags;
        this.type = type;
    }

    /**
     * @return Code of the status
     * 
     */
    public Optional<String> code() {
        return Optional.ofNullable(this.code);
    }
    /**
     * @return Resource ETag
     * 
     */
    public Optional<String> etag() {
        return Optional.ofNullable(this.etag);
    }
    /**
     * @return Resource id
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Resource location
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Description of the status
     * 
     */
    public Optional<String> message() {
        return Optional.ofNullable(this.message);
    }
    /**
     * @return Resource name
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Resource tags
     * 
     */
    public Map<String,String> tags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * @return Resource type
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionErrorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String etag;
        private String id;
        private @Nullable String location;
        private @Nullable String message;
        private String name;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionErrorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.message = defaults.message;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder code(@Nullable String code) {
            this.code = code;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = etag;
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
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public ConnectionErrorResponse build() {
            return new ConnectionErrorResponse(code, etag, id, location, message, name, tags, type);
        }
    }
}
