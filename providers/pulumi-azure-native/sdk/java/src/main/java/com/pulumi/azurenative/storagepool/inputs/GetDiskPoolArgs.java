// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.storagepool.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiskPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiskPoolArgs Empty = new GetDiskPoolArgs();

    /**
     * The name of the Disk pool.
     * 
     */
    @Import(name="diskPoolName", required=true)
    private Output<String> diskPoolName;

    /**
     * @return The name of the Disk pool.
     * 
     */
    public Output<String> diskPoolName() {
        return this.diskPoolName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDiskPoolArgs() {}

    private GetDiskPoolArgs(GetDiskPoolArgs $) {
        this.diskPoolName = $.diskPoolName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiskPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiskPoolArgs $;

        public Builder() {
            $ = new GetDiskPoolArgs();
        }

        public Builder(GetDiskPoolArgs defaults) {
            $ = new GetDiskPoolArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskPoolName The name of the Disk pool.
         * 
         * @return builder
         * 
         */
        public Builder diskPoolName(Output<String> diskPoolName) {
            $.diskPoolName = diskPoolName;
            return this;
        }

        /**
         * @param diskPoolName The name of the Disk pool.
         * 
         * @return builder
         * 
         */
        public Builder diskPoolName(String diskPoolName) {
            return diskPoolName(Output.of(diskPoolName));
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public GetDiskPoolArgs build() {
            $.diskPoolName = Objects.requireNonNull($.diskPoolName, "expected parameter 'diskPoolName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
