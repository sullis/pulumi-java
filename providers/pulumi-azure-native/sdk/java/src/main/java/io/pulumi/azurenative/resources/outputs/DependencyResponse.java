// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.outputs;

import io.pulumi.azurenative.resources.outputs.BasicDependencyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DependencyResponse {
    /**
     * The list of dependencies.
     * 
     */
    private final @Nullable List<BasicDependencyResponse> dependsOn;
    /**
     * The ID of the dependency.
     * 
     */
    private final @Nullable String id;
    /**
     * The dependency resource name.
     * 
     */
    private final @Nullable String resourceName;
    /**
     * The dependency resource type.
     * 
     */
    private final @Nullable String resourceType;

    @OutputCustomType.Constructor({"dependsOn","id","resourceName","resourceType"})
    private DependencyResponse(
        @Nullable List<BasicDependencyResponse> dependsOn,
        @Nullable String id,
        @Nullable String resourceName,
        @Nullable String resourceType) {
        this.dependsOn = dependsOn;
        this.id = id;
        this.resourceName = resourceName;
        this.resourceType = resourceType;
    }

    /**
     * The list of dependencies.
     * 
    */
    public List<BasicDependencyResponse> getDependsOn() {
        return this.dependsOn == null ? List.of() : this.dependsOn;
    }
    /**
     * The ID of the dependency.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The dependency resource name.
     * 
    */
    public Optional<String> getPropResourceName() {
        return Optional.ofNullable(this.resourceName);
    }
    /**
     * The dependency resource type.
     * 
    */
    public Optional<String> getPropResourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DependencyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BasicDependencyResponse> dependsOn;
        private @Nullable String id;
        private @Nullable String resourceName;
        private @Nullable String resourceType;

        public Builder() {
    	      // Empty
        }

        public Builder(DependencyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dependsOn = defaults.dependsOn;
    	      this.id = defaults.id;
    	      this.resourceName = defaults.resourceName;
    	      this.resourceType = defaults.resourceType;
        }

        public Builder setDependsOn(@Nullable List<BasicDependencyResponse> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
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
        public DependencyResponse build() {
            return new DependencyResponse(dependsOn, id, resourceName, resourceType);
        }
    }
}