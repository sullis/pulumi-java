// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CodeVersionResponse {
    /**
     * ARM resource ID of the datastore where the asset is located.
     * 
     */
    private final @Nullable String datastoreId;
    /**
     * The asset description text.
     * 
     */
    private final @Nullable String description;
    /**
     * If the name version are system generated (anonymous registration).
     * 
     */
    private final @Nullable Boolean isAnonymous;
    /**
     * The path of the file/directory in the datastore.
     * 
     */
    private final String path;
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

    @OutputCustomType.Constructor({"datastoreId","description","isAnonymous","path","properties","tags"})
    private CodeVersionResponse(
        @Nullable String datastoreId,
        @Nullable String description,
        @Nullable Boolean isAnonymous,
        String path,
        @Nullable Map<String,String> properties,
        @Nullable Map<String,String> tags) {
        this.datastoreId = datastoreId;
        this.description = description;
        this.isAnonymous = isAnonymous;
        this.path = Objects.requireNonNull(path);
        this.properties = properties;
        this.tags = tags;
    }

    /**
     * ARM resource ID of the datastore where the asset is located.
     * 
    */
    public Optional<String> getDatastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }
    /**
     * The asset description text.
     * 
    */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * If the name version are system generated (anonymous registration).
     * 
    */
    public Optional<Boolean> getIsAnonymous() {
        return Optional.ofNullable(this.isAnonymous);
    }
    /**
     * The path of the file/directory in the datastore.
     * 
    */
    public String getPath() {
        return this.path;
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

    public static Builder builder(CodeVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String datastoreId;
        private @Nullable String description;
        private @Nullable Boolean isAnonymous;
        private String path;
        private @Nullable Map<String,String> properties;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeVersionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreId = defaults.datastoreId;
    	      this.description = defaults.description;
    	      this.isAnonymous = defaults.isAnonymous;
    	      this.path = defaults.path;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder setDatastoreId(@Nullable String datastoreId) {
            this.datastoreId = datastoreId;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setIsAnonymous(@Nullable Boolean isAnonymous) {
            this.isAnonymous = isAnonymous;
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
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
        public CodeVersionResponse build() {
            return new CodeVersionResponse(datastoreId, description, isAnonymous, path, properties, tags);
        }
    }
}