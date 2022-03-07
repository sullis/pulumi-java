// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.management.inputs;

import io.pulumi.azurenative.management.inputs.ManagementGroupPathElementResponse;
import io.pulumi.azurenative.management.inputs.ParentGroupInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The details of a management group.
 * 
 */
public final class ManagementGroupDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagementGroupDetailsResponse Empty = new ManagementGroupDetailsResponse();

    /**
     * (Optional) The ID of the parent management group.
     * 
     */
    @InputImport(name="parent")
      private final @Nullable ParentGroupInfoResponse parent;

    public Optional<ParentGroupInfoResponse> getParent() {
        return this.parent == null ? Optional.empty() : Optional.ofNullable(this.parent);
    }

    /**
     * The path from the root to the current group.
     * 
     */
    @InputImport(name="path")
      private final @Nullable List<ManagementGroupPathElementResponse> path;

    public List<ManagementGroupPathElementResponse> getPath() {
        return this.path == null ? List.of() : this.path;
    }

    /**
     * The identity of the principal or process that updated the object.
     * 
     */
    @InputImport(name="updatedBy")
      private final @Nullable String updatedBy;

    public Optional<String> getUpdatedBy() {
        return this.updatedBy == null ? Optional.empty() : Optional.ofNullable(this.updatedBy);
    }

    /**
     * The date and time when this object was last updated.
     * 
     */
    @InputImport(name="updatedTime")
      private final @Nullable String updatedTime;

    public Optional<String> getUpdatedTime() {
        return this.updatedTime == null ? Optional.empty() : Optional.ofNullable(this.updatedTime);
    }

    /**
     * The version number of the object.
     * 
     */
    @InputImport(name="version")
      private final @Nullable Double version;

    public Optional<Double> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ManagementGroupDetailsResponse(
        @Nullable ParentGroupInfoResponse parent,
        @Nullable List<ManagementGroupPathElementResponse> path,
        @Nullable String updatedBy,
        @Nullable String updatedTime,
        @Nullable Double version) {
        this.parent = parent;
        this.path = path;
        this.updatedBy = updatedBy;
        this.updatedTime = updatedTime;
        this.version = version;
    }

    private ManagementGroupDetailsResponse() {
        this.parent = null;
        this.path = List.of();
        this.updatedBy = null;
        this.updatedTime = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagementGroupDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ParentGroupInfoResponse parent;
        private @Nullable List<ManagementGroupPathElementResponse> path;
        private @Nullable String updatedBy;
        private @Nullable String updatedTime;
        private @Nullable Double version;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagementGroupDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parent = defaults.parent;
    	      this.path = defaults.path;
    	      this.updatedBy = defaults.updatedBy;
    	      this.updatedTime = defaults.updatedTime;
    	      this.version = defaults.version;
        }

        public Builder setParent(@Nullable ParentGroupInfoResponse parent) {
            this.parent = parent;
            return this;
        }

        public Builder setPath(@Nullable List<ManagementGroupPathElementResponse> path) {
            this.path = path;
            return this;
        }

        public Builder setUpdatedBy(@Nullable String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public Builder setUpdatedTime(@Nullable String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }

        public Builder setVersion(@Nullable Double version) {
            this.version = version;
            return this;
        }
        public ManagementGroupDetailsResponse build() {
            return new ManagementGroupDetailsResponse(parent, path, updatedBy, updatedTime, version);
        }
    }
}