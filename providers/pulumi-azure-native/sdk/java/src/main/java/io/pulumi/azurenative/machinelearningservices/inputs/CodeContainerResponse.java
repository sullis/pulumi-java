// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Container for code asset versions.
 * 
 */
public final class CodeContainerResponse extends io.pulumi.resources.InvokeArgs {

    public static final CodeContainerResponse Empty = new CodeContainerResponse();

    /**
     * The asset description text.
     * 
     */
    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The asset property dictionary.
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Map<String,String> properties;

    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }

    /**
     * Tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Map<String,String> tags;

    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public CodeContainerResponse(
        @Nullable String description,
        @Nullable Map<String,String> properties,
        @Nullable Map<String,String> tags) {
        this.description = description;
        this.properties = properties;
        this.tags = tags;
    }

    private CodeContainerResponse() {
        this.description = null;
        this.properties = Map.of();
        this.tags = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable Map<String,String> properties;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeContainerResponse defaults) {
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

        public CodeContainerResponse build() {
            return new CodeContainerResponse(description, properties, tags);
        }
    }
}
