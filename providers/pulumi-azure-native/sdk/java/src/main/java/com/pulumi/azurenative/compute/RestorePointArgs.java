// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute;

import com.pulumi.azurenative.compute.inputs.ApiEntityReferenceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RestorePointArgs extends com.pulumi.resources.ResourceArgs {

    public static final RestorePointArgs Empty = new RestorePointArgs();

    /**
     * List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified, all disks will be included.
     * 
     */
    @Import(name="excludeDisks")
    private @Nullable Output<List<ApiEntityReferenceArgs>> excludeDisks;

    /**
     * @return List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified, all disks will be included.
     * 
     */
    public Optional<Output<List<ApiEntityReferenceArgs>>> excludeDisks() {
        return Optional.ofNullable(this.excludeDisks);
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the restore point collection.
     * 
     */
    @Import(name="restorePointCollectionName", required=true)
    private Output<String> restorePointCollectionName;

    /**
     * @return The name of the restore point collection.
     * 
     */
    public Output<String> restorePointCollectionName() {
        return this.restorePointCollectionName;
    }

    /**
     * The name of the restore point.
     * 
     */
    @Import(name="restorePointName")
    private @Nullable Output<String> restorePointName;

    /**
     * @return The name of the restore point.
     * 
     */
    public Optional<Output<String>> restorePointName() {
        return Optional.ofNullable(this.restorePointName);
    }

    /**
     * Gets the creation time of the restore point.
     * 
     */
    @Import(name="timeCreated")
    private @Nullable Output<String> timeCreated;

    /**
     * @return Gets the creation time of the restore point.
     * 
     */
    public Optional<Output<String>> timeCreated() {
        return Optional.ofNullable(this.timeCreated);
    }

    private RestorePointArgs() {}

    private RestorePointArgs(RestorePointArgs $) {
        this.excludeDisks = $.excludeDisks;
        this.resourceGroupName = $.resourceGroupName;
        this.restorePointCollectionName = $.restorePointCollectionName;
        this.restorePointName = $.restorePointName;
        this.timeCreated = $.timeCreated;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RestorePointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RestorePointArgs $;

        public Builder() {
            $ = new RestorePointArgs();
        }

        public Builder(RestorePointArgs defaults) {
            $ = new RestorePointArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param excludeDisks List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified, all disks will be included.
         * 
         * @return builder
         * 
         */
        public Builder excludeDisks(@Nullable Output<List<ApiEntityReferenceArgs>> excludeDisks) {
            $.excludeDisks = excludeDisks;
            return this;
        }

        /**
         * @param excludeDisks List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified, all disks will be included.
         * 
         * @return builder
         * 
         */
        public Builder excludeDisks(List<ApiEntityReferenceArgs> excludeDisks) {
            return excludeDisks(Output.of(excludeDisks));
        }

        /**
         * @param excludeDisks List of disk resource ids that the customer wishes to exclude from the restore point. If no disks are specified, all disks will be included.
         * 
         * @return builder
         * 
         */
        public Builder excludeDisks(ApiEntityReferenceArgs... excludeDisks) {
            return excludeDisks(List.of(excludeDisks));
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param restorePointCollectionName The name of the restore point collection.
         * 
         * @return builder
         * 
         */
        public Builder restorePointCollectionName(Output<String> restorePointCollectionName) {
            $.restorePointCollectionName = restorePointCollectionName;
            return this;
        }

        /**
         * @param restorePointCollectionName The name of the restore point collection.
         * 
         * @return builder
         * 
         */
        public Builder restorePointCollectionName(String restorePointCollectionName) {
            return restorePointCollectionName(Output.of(restorePointCollectionName));
        }

        /**
         * @param restorePointName The name of the restore point.
         * 
         * @return builder
         * 
         */
        public Builder restorePointName(@Nullable Output<String> restorePointName) {
            $.restorePointName = restorePointName;
            return this;
        }

        /**
         * @param restorePointName The name of the restore point.
         * 
         * @return builder
         * 
         */
        public Builder restorePointName(String restorePointName) {
            return restorePointName(Output.of(restorePointName));
        }

        /**
         * @param timeCreated Gets the creation time of the restore point.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(@Nullable Output<String> timeCreated) {
            $.timeCreated = timeCreated;
            return this;
        }

        /**
         * @param timeCreated Gets the creation time of the restore point.
         * 
         * @return builder
         * 
         */
        public Builder timeCreated(String timeCreated) {
            return timeCreated(Output.of(timeCreated));
        }

        public RestorePointArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.restorePointCollectionName = Objects.requireNonNull($.restorePointCollectionName, "expected parameter 'restorePointCollectionName' to be non-null");
            return $;
        }
    }

}
