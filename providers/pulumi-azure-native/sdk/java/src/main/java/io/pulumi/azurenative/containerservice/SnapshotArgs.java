// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice;

import io.pulumi.azurenative.containerservice.enums.SnapshotType;
import io.pulumi.azurenative.containerservice.inputs.CreationDataArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SnapshotArgs extends io.pulumi.resources.ResourceArgs {

    public static final SnapshotArgs Empty = new SnapshotArgs();

    /**
     * CreationData to be used to specify the source agent pool resource ID to create this snapshot.
     * 
     */
    @InputImport(name="creationData")
    private final @Nullable Input<CreationDataArgs> creationData;

    public Input<CreationDataArgs> getCreationData() {
        return this.creationData == null ? Input.empty() : this.creationData;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
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
     * The name of the managed cluster resource.
     * 
     */
    @InputImport(name="resourceName")
    private final @Nullable Input<String> resourceName;

    public Input<String> getPropResourceName() {
        return this.resourceName == null ? Input.empty() : this.resourceName;
    }

    /**
     * The type of a snapshot. The default is NodePool.
     * 
     */
    @InputImport(name="snapshotType")
    private final @Nullable Input<Either<String,SnapshotType>> snapshotType;

    public Input<Either<String,SnapshotType>> getSnapshotType() {
        return this.snapshotType == null ? Input.empty() : this.snapshotType;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public SnapshotArgs(
        @Nullable Input<CreationDataArgs> creationData,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<String> resourceName,
        @Nullable Input<Either<String,SnapshotType>> snapshotType,
        @Nullable Input<Map<String,String>> tags) {
        this.creationData = creationData;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = resourceName;
        this.snapshotType = snapshotType;
        this.tags = tags;
    }

    private SnapshotArgs() {
        this.creationData = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.resourceName = Input.empty();
        this.snapshotType = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SnapshotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CreationDataArgs> creationData;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> resourceName;
        private @Nullable Input<Either<String,SnapshotType>> snapshotType;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(SnapshotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.creationData = defaults.creationData;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
    	      this.snapshotType = defaults.snapshotType;
    	      this.tags = defaults.tags;
        }

        public Builder setCreationData(@Nullable Input<CreationDataArgs> creationData) {
            this.creationData = creationData;
            return this;
        }

        public Builder setCreationData(@Nullable CreationDataArgs creationData) {
            this.creationData = Input.ofNullable(creationData);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
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

        public Builder setResourceName(@Nullable Input<String> resourceName) {
            this.resourceName = resourceName;
            return this;
        }

        public Builder setResourceName(@Nullable String resourceName) {
            this.resourceName = Input.ofNullable(resourceName);
            return this;
        }

        public Builder setSnapshotType(@Nullable Input<Either<String,SnapshotType>> snapshotType) {
            this.snapshotType = snapshotType;
            return this;
        }

        public Builder setSnapshotType(@Nullable Either<String,SnapshotType> snapshotType) {
            this.snapshotType = Input.ofNullable(snapshotType);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public SnapshotArgs build() {
            return new SnapshotArgs(creationData, location, resourceGroupName, resourceName, snapshotType, tags);
        }
    }
}
