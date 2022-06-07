// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.netapp.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVolumeGroupPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVolumeGroupPlainArgs Empty = new GetVolumeGroupPlainArgs();

    /**
     * The name of the NetApp account
     * 
     */
    @Import(name="accountName", required=true)
    private String accountName;

    /**
     * @return The name of the NetApp account
     * 
     */
    public String accountName() {
        return this.accountName;
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

    /**
     * The name of the volumeGroup
     * 
     */
    @Import(name="volumeGroupName", required=true)
    private String volumeGroupName;

    /**
     * @return The name of the volumeGroup
     * 
     */
    public String volumeGroupName() {
        return this.volumeGroupName;
    }

    private GetVolumeGroupPlainArgs() {}

    private GetVolumeGroupPlainArgs(GetVolumeGroupPlainArgs $) {
        this.accountName = $.accountName;
        this.resourceGroupName = $.resourceGroupName;
        this.volumeGroupName = $.volumeGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVolumeGroupPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVolumeGroupPlainArgs $;

        public Builder() {
            $ = new GetVolumeGroupPlainArgs();
        }

        public Builder(GetVolumeGroupPlainArgs defaults) {
            $ = new GetVolumeGroupPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The name of the NetApp account
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            $.accountName = accountName;
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

        /**
         * @param volumeGroupName The name of the volumeGroup
         * 
         * @return builder
         * 
         */
        public Builder volumeGroupName(String volumeGroupName) {
            $.volumeGroupName = volumeGroupName;
            return this;
        }

        public GetVolumeGroupPlainArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.volumeGroupName = Objects.requireNonNull($.volumeGroupName, "expected parameter 'volumeGroupName' to be non-null");
            return $;
        }
    }

}
