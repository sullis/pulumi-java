// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute;

import io.pulumi.azurenative.compute.inputs.ApiEntityReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RestorePointArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestorePointArgs Empty = new RestorePointArgs();

    /**
     * List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified, all disks will be included.
     * 
     */
    @InputImport(name="excludeDisks")
    private final @Nullable Input<List<ApiEntityReferenceArgs>> excludeDisks;

    public Input<List<ApiEntityReferenceArgs>> getExcludeDisks() {
        return this.excludeDisks == null ? Input.empty() : this.excludeDisks;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the restore point collection.
     * 
     */
    @InputImport(name="restorePointCollectionName", required=true)
    private final Input<String> restorePointCollectionName;

    public Input<String> getRestorePointCollectionName() {
        return this.restorePointCollectionName;
    }

    /**
     * The name of the restore point.
     * 
     */
    @InputImport(name="restorePointName")
    private final @Nullable Input<String> restorePointName;

    public Input<String> getRestorePointName() {
        return this.restorePointName == null ? Input.empty() : this.restorePointName;
    }

    /**
     * Gets the creation time of the restore point.
     * 
     */
    @InputImport(name="timeCreated")
    private final @Nullable Input<String> timeCreated;

    public Input<String> getTimeCreated() {
        return this.timeCreated == null ? Input.empty() : this.timeCreated;
    }

    public RestorePointArgs(
        @Nullable Input<List<ApiEntityReferenceArgs>> excludeDisks,
        Input<String> resourceGroupName,
        Input<String> restorePointCollectionName,
        @Nullable Input<String> restorePointName,
        @Nullable Input<String> timeCreated) {
        this.excludeDisks = excludeDisks;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.restorePointCollectionName = Objects.requireNonNull(restorePointCollectionName, "expected parameter 'restorePointCollectionName' to be non-null");
        this.restorePointName = restorePointName;
        this.timeCreated = timeCreated;
    }

    private RestorePointArgs() {
        this.excludeDisks = Input.empty();
        this.resourceGroupName = Input.empty();
        this.restorePointCollectionName = Input.empty();
        this.restorePointName = Input.empty();
        this.timeCreated = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ApiEntityReferenceArgs>> excludeDisks;
        private Input<String> resourceGroupName;
        private Input<String> restorePointCollectionName;
        private @Nullable Input<String> restorePointName;
        private @Nullable Input<String> timeCreated;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludeDisks = defaults.excludeDisks;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.restorePointCollectionName = defaults.restorePointCollectionName;
    	      this.restorePointName = defaults.restorePointName;
    	      this.timeCreated = defaults.timeCreated;
        }

        public Builder setExcludeDisks(@Nullable Input<List<ApiEntityReferenceArgs>> excludeDisks) {
            this.excludeDisks = excludeDisks;
            return this;
        }

        public Builder setExcludeDisks(@Nullable List<ApiEntityReferenceArgs> excludeDisks) {
            this.excludeDisks = Input.ofNullable(excludeDisks);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setRestorePointCollectionName(Input<String> restorePointCollectionName) {
            this.restorePointCollectionName = Objects.requireNonNull(restorePointCollectionName);
            return this;
        }

        public Builder setRestorePointCollectionName(String restorePointCollectionName) {
            this.restorePointCollectionName = Input.of(Objects.requireNonNull(restorePointCollectionName));
            return this;
        }

        public Builder setRestorePointName(@Nullable Input<String> restorePointName) {
            this.restorePointName = restorePointName;
            return this;
        }

        public Builder setRestorePointName(@Nullable String restorePointName) {
            this.restorePointName = Input.ofNullable(restorePointName);
            return this;
        }

        public Builder setTimeCreated(@Nullable Input<String> timeCreated) {
            this.timeCreated = timeCreated;
            return this;
        }

        public Builder setTimeCreated(@Nullable String timeCreated) {
            this.timeCreated = Input.ofNullable(timeCreated);
            return this;
        }

        public RestorePointArgs build() {
            return new RestorePointArgs(excludeDisks, resourceGroupName, restorePointCollectionName, restorePointName, timeCreated);
        }
    }
}
