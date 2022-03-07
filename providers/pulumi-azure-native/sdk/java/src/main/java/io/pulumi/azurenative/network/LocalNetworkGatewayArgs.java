// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.inputs.AddressSpaceArgs;
import io.pulumi.azurenative.network.inputs.BgpSettingsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LocalNetworkGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final LocalNetworkGatewayArgs Empty = new LocalNetworkGatewayArgs();

    /**
     * Local network gateway's BGP speaker settings.
     * 
     */
    @InputImport(name="bgpSettings")
      private final @Nullable Input<BgpSettingsArgs> bgpSettings;

    public Input<BgpSettingsArgs> getBgpSettings() {
        return this.bgpSettings == null ? Input.empty() : this.bgpSettings;
    }

    /**
     * FQDN of local network gateway.
     * 
     */
    @InputImport(name="fqdn")
      private final @Nullable Input<String> fqdn;

    public Input<String> getFqdn() {
        return this.fqdn == null ? Input.empty() : this.fqdn;
    }

    /**
     * IP address of local network gateway.
     * 
     */
    @InputImport(name="gatewayIpAddress")
      private final @Nullable Input<String> gatewayIpAddress;

    public Input<String> getGatewayIpAddress() {
        return this.gatewayIpAddress == null ? Input.empty() : this.gatewayIpAddress;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Local network site address space.
     * 
     */
    @InputImport(name="localNetworkAddressSpace")
      private final @Nullable Input<AddressSpaceArgs> localNetworkAddressSpace;

    public Input<AddressSpaceArgs> getLocalNetworkAddressSpace() {
        return this.localNetworkAddressSpace == null ? Input.empty() : this.localNetworkAddressSpace;
    }

    /**
     * The name of the local network gateway.
     * 
     */
    @InputImport(name="localNetworkGatewayName")
      private final @Nullable Input<String> localNetworkGatewayName;

    public Input<String> getLocalNetworkGatewayName() {
        return this.localNetworkGatewayName == null ? Input.empty() : this.localNetworkGatewayName;
    }

    /**
     * Resource location.
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
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LocalNetworkGatewayArgs(
        @Nullable Input<BgpSettingsArgs> bgpSettings,
        @Nullable Input<String> fqdn,
        @Nullable Input<String> gatewayIpAddress,
        @Nullable Input<String> id,
        @Nullable Input<AddressSpaceArgs> localNetworkAddressSpace,
        @Nullable Input<String> localNetworkGatewayName,
        @Nullable Input<String> location,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.bgpSettings = bgpSettings;
        this.fqdn = fqdn;
        this.gatewayIpAddress = gatewayIpAddress;
        this.id = id;
        this.localNetworkAddressSpace = localNetworkAddressSpace;
        this.localNetworkGatewayName = localNetworkGatewayName;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private LocalNetworkGatewayArgs() {
        this.bgpSettings = Input.empty();
        this.fqdn = Input.empty();
        this.gatewayIpAddress = Input.empty();
        this.id = Input.empty();
        this.localNetworkAddressSpace = Input.empty();
        this.localNetworkGatewayName = Input.empty();
        this.location = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocalNetworkGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BgpSettingsArgs> bgpSettings;
        private @Nullable Input<String> fqdn;
        private @Nullable Input<String> gatewayIpAddress;
        private @Nullable Input<String> id;
        private @Nullable Input<AddressSpaceArgs> localNetworkAddressSpace;
        private @Nullable Input<String> localNetworkGatewayName;
        private @Nullable Input<String> location;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LocalNetworkGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpSettings = defaults.bgpSettings;
    	      this.fqdn = defaults.fqdn;
    	      this.gatewayIpAddress = defaults.gatewayIpAddress;
    	      this.id = defaults.id;
    	      this.localNetworkAddressSpace = defaults.localNetworkAddressSpace;
    	      this.localNetworkGatewayName = defaults.localNetworkGatewayName;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setBgpSettings(@Nullable Input<BgpSettingsArgs> bgpSettings) {
            this.bgpSettings = bgpSettings;
            return this;
        }

        public Builder setBgpSettings(@Nullable BgpSettingsArgs bgpSettings) {
            this.bgpSettings = Input.ofNullable(bgpSettings);
            return this;
        }

        public Builder setFqdn(@Nullable Input<String> fqdn) {
            this.fqdn = fqdn;
            return this;
        }

        public Builder setFqdn(@Nullable String fqdn) {
            this.fqdn = Input.ofNullable(fqdn);
            return this;
        }

        public Builder setGatewayIpAddress(@Nullable Input<String> gatewayIpAddress) {
            this.gatewayIpAddress = gatewayIpAddress;
            return this;
        }

        public Builder setGatewayIpAddress(@Nullable String gatewayIpAddress) {
            this.gatewayIpAddress = Input.ofNullable(gatewayIpAddress);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setLocalNetworkAddressSpace(@Nullable Input<AddressSpaceArgs> localNetworkAddressSpace) {
            this.localNetworkAddressSpace = localNetworkAddressSpace;
            return this;
        }

        public Builder setLocalNetworkAddressSpace(@Nullable AddressSpaceArgs localNetworkAddressSpace) {
            this.localNetworkAddressSpace = Input.ofNullable(localNetworkAddressSpace);
            return this;
        }

        public Builder setLocalNetworkGatewayName(@Nullable Input<String> localNetworkGatewayName) {
            this.localNetworkGatewayName = localNetworkGatewayName;
            return this;
        }

        public Builder setLocalNetworkGatewayName(@Nullable String localNetworkGatewayName) {
            this.localNetworkGatewayName = Input.ofNullable(localNetworkGatewayName);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LocalNetworkGatewayArgs build() {
            return new LocalNetworkGatewayArgs(bgpSettings, fqdn, gatewayIpAddress, id, localNetworkAddressSpace, localNetworkGatewayName, location, resourceGroupName, tags);
        }
    }
}