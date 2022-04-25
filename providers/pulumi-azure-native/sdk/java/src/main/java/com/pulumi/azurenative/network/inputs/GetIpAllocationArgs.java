// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetIpAllocationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetIpAllocationArgs Empty = new GetIpAllocationArgs();

    /**
     * Expands referenced resources.
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    /**
     * @return Expands referenced resources.
     * 
     */
    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * The name of the IpAllocation.
     * 
     */
    @Import(name="ipAllocationName", required=true)
    private String ipAllocationName;

    /**
     * @return The name of the IpAllocation.
     * 
     */
    public String ipAllocationName() {
        return this.ipAllocationName;
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

    private GetIpAllocationArgs() {}

    private GetIpAllocationArgs(GetIpAllocationArgs $) {
        this.expand = $.expand;
        this.ipAllocationName = $.ipAllocationName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetIpAllocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetIpAllocationArgs $;

        public Builder() {
            $ = new GetIpAllocationArgs();
        }

        public Builder(GetIpAllocationArgs defaults) {
            $ = new GetIpAllocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param expand Expands referenced resources.
         * 
         * @return builder
         * 
         */
        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        /**
         * @param ipAllocationName The name of the IpAllocation.
         * 
         * @return builder
         * 
         */
        public Builder ipAllocationName(String ipAllocationName) {
            $.ipAllocationName = ipAllocationName;
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

        public GetIpAllocationArgs build() {
            $.ipAllocationName = Objects.requireNonNull($.ipAllocationName, "expected parameter 'ipAllocationName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
