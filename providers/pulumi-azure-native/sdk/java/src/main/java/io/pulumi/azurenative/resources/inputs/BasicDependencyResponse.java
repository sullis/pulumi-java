// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Deployment dependency information.
 * 
 */
public final class BasicDependencyResponse extends io.pulumi.resources.InvokeArgs {

    public static final BasicDependencyResponse Empty = new BasicDependencyResponse();

    /**
     * The ID of the dependency.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * The dependency resource name.
     * 
     */
    @InputImport(name="resourceName")
      private final @Nullable String resourceName;

    public Optional<String> getPropResourceName() {
        return this.resourceName == null ? Optional.empty() : Optional.ofNullable(this.resourceName);
    }

    /**
     * The dependency resource type.
     * 
     */
    @InputImport(name="resourceType")
      private final @Nullable String resourceType;

    public Optional<String> getPropResourceType() {
        return this.resourceType == null ? Optional.empty() : Optional.ofNullable(this.resourceType);
    }

    public BasicDependencyResponse(
        @Nullable String id,
        @Nullable String resourceName,
        @Nullable String resourceType) {
        this.id = id;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
    }

    private BasicDependencyResponse() {
        this.id = null;
        this.resourceName = null;
        this.resourceType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BasicDependencyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String resourceName;
        private @Nullable String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(BasicDependencyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceType(@Nullable String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public BasicDependencyResponse build() {
            return new BasicDependencyResponse(id, resourceName, resourceType);
        }
    }
}