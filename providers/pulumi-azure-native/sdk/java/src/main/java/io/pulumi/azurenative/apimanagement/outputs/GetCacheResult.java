// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetCacheResult {
    /**
     * Runtime connection string to cache
     * 
     */
    private final String connectionString;
    /**
     * Cache description
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
     * Original uri of entity in external system cache points to
     * 
     */
    private final @Nullable String resourceId;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;
    /**
     * Location identifier to use cache from (should be either 'default' or valid Azure region identifier)
     * 
     */
    private final String useFromLocation;

    @OutputCustomType.Constructor({"connectionString","description","id","name","resourceId","type","useFromLocation"})
    private GetCacheResult(
        String connectionString,
        @Nullable String description,
        String id,
        String name,
        @Nullable String resourceId,
        String type,
        String useFromLocation) {
        this.connectionString = Objects.requireNonNull(connectionString);
        this.description = description;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.resourceId = resourceId;
        this.type = Objects.requireNonNull(type);
        this.useFromLocation = Objects.requireNonNull(useFromLocation);
    }

    /**
     * Runtime connection string to cache
     * 
    */
    public String getConnectionString() {
        return this.connectionString;
    }
    /**
     * Cache description
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
     * Original uri of entity in external system cache points to
     * 
    */
    public Optional<String> getResourceId() {
        return Optional.ofNullable(this.resourceId);
    }
    /**
     * Resource type for API Management resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Location identifier to use cache from (should be either 'default' or valid Azure region identifier)
     * 
    */
    public String getUseFromLocation() {
        return this.useFromLocation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCacheResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionString;
        private @Nullable String description;
        private String id;
        private String name;
        private @Nullable String resourceId;
        private String type;
        private String useFromLocation;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCacheResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.resourceId = defaults.resourceId;
    	      this.type = defaults.type;
    	      this.useFromLocation = defaults.useFromLocation;
        }

        public Builder setConnectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
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

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUseFromLocation(String useFromLocation) {
            this.useFromLocation = Objects.requireNonNull(useFromLocation);
            return this;
        }
        public GetCacheResult build() {
            return new GetCacheResult(connectionString, description, id, name, resourceId, type, useFromLocation);
        }
    }
}