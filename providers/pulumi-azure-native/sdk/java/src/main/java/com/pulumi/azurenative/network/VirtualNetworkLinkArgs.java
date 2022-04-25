// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network;

import com.pulumi.azurenative.network.inputs.SubResourceArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class VirtualNetworkLinkArgs extends com.pulumi.resources.ResourceArgs {

    public static final VirtualNetworkLinkArgs Empty = new VirtualNetworkLinkArgs();

    /**
     * The Azure Region where the resource lives
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The Azure Region where the resource lives
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the Private DNS zone (without a terminating dot).
     * 
     */
    @Import(name="privateZoneName", required=true)
    private Output<String> privateZoneName;

    /**
     * @return The name of the Private DNS zone (without a terminating dot).
     * 
     */
    public Output<String> privateZoneName() {
        return this.privateZoneName;
    }

    /**
     * Is auto-registration of virtual machine records in the virtual network in the Private DNS zone enabled?
     * 
     */
    @Import(name="registrationEnabled")
    private @Nullable Output<Boolean> registrationEnabled;

    /**
     * @return Is auto-registration of virtual machine records in the virtual network in the Private DNS zone enabled?
     * 
     */
    public Optional<Output<Boolean>> registrationEnabled() {
        return Optional.ofNullable(this.registrationEnabled);
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
     * Resource tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Resource tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The reference of the virtual network.
     * 
     */
    @Import(name="virtualNetwork")
    private @Nullable Output<SubResourceArgs> virtualNetwork;

    /**
     * @return The reference of the virtual network.
     * 
     */
    public Optional<Output<SubResourceArgs>> virtualNetwork() {
        return Optional.ofNullable(this.virtualNetwork);
    }

    /**
     * The name of the virtual network link.
     * 
     */
    @Import(name="virtualNetworkLinkName")
    private @Nullable Output<String> virtualNetworkLinkName;

    /**
     * @return The name of the virtual network link.
     * 
     */
    public Optional<Output<String>> virtualNetworkLinkName() {
        return Optional.ofNullable(this.virtualNetworkLinkName);
    }

    private VirtualNetworkLinkArgs() {}

    private VirtualNetworkLinkArgs(VirtualNetworkLinkArgs $) {
        this.location = $.location;
        this.privateZoneName = $.privateZoneName;
        this.registrationEnabled = $.registrationEnabled;
        this.resourceGroupName = $.resourceGroupName;
        this.tags = $.tags;
        this.virtualNetwork = $.virtualNetwork;
        this.virtualNetworkLinkName = $.virtualNetworkLinkName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(VirtualNetworkLinkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private VirtualNetworkLinkArgs $;

        public Builder() {
            $ = new VirtualNetworkLinkArgs();
        }

        public Builder(VirtualNetworkLinkArgs defaults) {
            $ = new VirtualNetworkLinkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location The Azure Region where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The Azure Region where the resource lives
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param privateZoneName The name of the Private DNS zone (without a terminating dot).
         * 
         * @return builder
         * 
         */
        public Builder privateZoneName(Output<String> privateZoneName) {
            $.privateZoneName = privateZoneName;
            return this;
        }

        /**
         * @param privateZoneName The name of the Private DNS zone (without a terminating dot).
         * 
         * @return builder
         * 
         */
        public Builder privateZoneName(String privateZoneName) {
            return privateZoneName(Output.of(privateZoneName));
        }

        /**
         * @param registrationEnabled Is auto-registration of virtual machine records in the virtual network in the Private DNS zone enabled?
         * 
         * @return builder
         * 
         */
        public Builder registrationEnabled(@Nullable Output<Boolean> registrationEnabled) {
            $.registrationEnabled = registrationEnabled;
            return this;
        }

        /**
         * @param registrationEnabled Is auto-registration of virtual machine records in the virtual network in the Private DNS zone enabled?
         * 
         * @return builder
         * 
         */
        public Builder registrationEnabled(Boolean registrationEnabled) {
            return registrationEnabled(Output.of(registrationEnabled));
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
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Resource tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param virtualNetwork The reference of the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetwork(@Nullable Output<SubResourceArgs> virtualNetwork) {
            $.virtualNetwork = virtualNetwork;
            return this;
        }

        /**
         * @param virtualNetwork The reference of the virtual network.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetwork(SubResourceArgs virtualNetwork) {
            return virtualNetwork(Output.of(virtualNetwork));
        }

        /**
         * @param virtualNetworkLinkName The name of the virtual network link.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkLinkName(@Nullable Output<String> virtualNetworkLinkName) {
            $.virtualNetworkLinkName = virtualNetworkLinkName;
            return this;
        }

        /**
         * @param virtualNetworkLinkName The name of the virtual network link.
         * 
         * @return builder
         * 
         */
        public Builder virtualNetworkLinkName(String virtualNetworkLinkName) {
            return virtualNetworkLinkName(Output.of(virtualNetworkLinkName));
        }

        public VirtualNetworkLinkArgs build() {
            $.privateZoneName = Objects.requireNonNull($.privateZoneName, "expected parameter 'privateZoneName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
