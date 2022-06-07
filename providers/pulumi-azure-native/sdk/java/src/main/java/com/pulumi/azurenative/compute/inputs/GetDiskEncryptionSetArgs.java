// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiskEncryptionSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiskEncryptionSetArgs Empty = new GetDiskEncryptionSetArgs();

    /**
     * The name of the disk encryption set that is being created. The name can&#39;t be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * 
     */
    @Import(name="diskEncryptionSetName", required=true)
    private Output<String> diskEncryptionSetName;

    /**
     * @return The name of the disk encryption set that is being created. The name can&#39;t be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * 
     */
    public Output<String> diskEncryptionSetName() {
        return this.diskEncryptionSetName;
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

    private GetDiskEncryptionSetArgs() {}

    private GetDiskEncryptionSetArgs(GetDiskEncryptionSetArgs $) {
        this.diskEncryptionSetName = $.diskEncryptionSetName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiskEncryptionSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiskEncryptionSetArgs $;

        public Builder() {
            $ = new GetDiskEncryptionSetArgs();
        }

        public Builder(GetDiskEncryptionSetArgs defaults) {
            $ = new GetDiskEncryptionSetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can&#39;t be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionSetName(Output<String> diskEncryptionSetName) {
            $.diskEncryptionSetName = diskEncryptionSetName;
            return this;
        }

        /**
         * @param diskEncryptionSetName The name of the disk encryption set that is being created. The name can&#39;t be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
         * 
         * @return builder
         * 
         */
        public Builder diskEncryptionSetName(String diskEncryptionSetName) {
            return diskEncryptionSetName(Output.of(diskEncryptionSetName));
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

        public GetDiskEncryptionSetArgs build() {
            $.diskEncryptionSetName = Objects.requireNonNull($.diskEncryptionSetName, "expected parameter 'diskEncryptionSetName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
