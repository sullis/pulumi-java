// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetDiskAccessArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiskAccessArgs Empty = new GetDiskAccessArgs();

    /**
     * The name of the disk access resource that is being created. The name can&#39;t be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * 
     */
    @Import(name="diskAccessName", required=true)
    private String diskAccessName;

    /**
     * @return The name of the disk access resource that is being created. The name can&#39;t be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
     * 
     */
    public String diskAccessName() {
        return this.diskAccessName;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    private GetDiskAccessArgs() {}

    private GetDiskAccessArgs(GetDiskAccessArgs $) {
        this.diskAccessName = $.diskAccessName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiskAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiskAccessArgs $;

        public Builder() {
            $ = new GetDiskAccessArgs();
        }

        public Builder(GetDiskAccessArgs defaults) {
            $ = new GetDiskAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param diskAccessName The name of the disk access resource that is being created. The name can&#39;t be changed after the disk encryption set is created. Supported characters for the name are a-z, A-Z, 0-9 and _. The maximum name length is 80 characters.
         * 
         * @return builder
         * 
         */
        public Builder diskAccessName(String diskAccessName) {
            $.diskAccessName = diskAccessName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public GetDiskAccessArgs build() {
            $.diskAccessName = Objects.requireNonNull($.diskAccessName, "expected parameter 'diskAccessName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
