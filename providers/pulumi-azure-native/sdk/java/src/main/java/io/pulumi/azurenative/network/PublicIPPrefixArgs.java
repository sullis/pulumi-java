// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.IPVersion;
import io.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.network.inputs.IpTagArgs;
import io.pulumi.azurenative.network.inputs.NatGatewayArgs;
import io.pulumi.azurenative.network.inputs.PublicIPPrefixSkuArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PublicIPPrefixArgs extends io.pulumi.resources.ResourceArgs {

    public static final PublicIPPrefixArgs Empty = new PublicIPPrefixArgs();

    /**
     * The customIpPrefix that this prefix is associated with.
     * 
     */
    @InputImport(name="customIPPrefix")
    private final @Nullable Input<SubResourceArgs> customIPPrefix;

    public Input<SubResourceArgs> getCustomIPPrefix() {
        return this.customIPPrefix == null ? Input.empty() : this.customIPPrefix;
    }

    /**
     * The extended location of the public ip address.
     * 
     */
    @InputImport(name="extendedLocation")
    private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
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
     * The list of tags associated with the public IP prefix.
     * 
     */
    @InputImport(name="ipTags")
    private final @Nullable Input<List<IpTagArgs>> ipTags;

    public Input<List<IpTagArgs>> getIpTags() {
        return this.ipTags == null ? Input.empty() : this.ipTags;
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
     * NatGateway of Public IP Prefix.
     * 
     */
    @InputImport(name="natGateway")
    private final @Nullable Input<NatGatewayArgs> natGateway;

    public Input<NatGatewayArgs> getNatGateway() {
        return this.natGateway == null ? Input.empty() : this.natGateway;
    }

    /**
     * The Length of the Public IP Prefix.
     * 
     */
    @InputImport(name="prefixLength")
    private final @Nullable Input<Integer> prefixLength;

    public Input<Integer> getPrefixLength() {
        return this.prefixLength == null ? Input.empty() : this.prefixLength;
    }

    /**
     * The public IP address version.
     * 
     */
    @InputImport(name="publicIPAddressVersion")
    private final @Nullable Input<Either<String,IPVersion>> publicIPAddressVersion;

    public Input<Either<String,IPVersion>> getPublicIPAddressVersion() {
        return this.publicIPAddressVersion == null ? Input.empty() : this.publicIPAddressVersion;
    }

    /**
     * The name of the public IP prefix.
     * 
     */
    @InputImport(name="publicIpPrefixName")
    private final @Nullable Input<String> publicIpPrefixName;

    public Input<String> getPublicIpPrefixName() {
        return this.publicIpPrefixName == null ? Input.empty() : this.publicIpPrefixName;
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
     * The public IP prefix SKU.
     * 
     */
    @InputImport(name="sku")
    private final @Nullable Input<PublicIPPrefixSkuArgs> sku;

    public Input<PublicIPPrefixSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
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

    /**
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    @InputImport(name="zones")
    private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public PublicIPPrefixArgs(
        @Nullable Input<SubResourceArgs> customIPPrefix,
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        @Nullable Input<String> id,
        @Nullable Input<List<IpTagArgs>> ipTags,
        @Nullable Input<String> location,
        @Nullable Input<NatGatewayArgs> natGateway,
        @Nullable Input<Integer> prefixLength,
        @Nullable Input<Either<String,IPVersion>> publicIPAddressVersion,
        @Nullable Input<String> publicIpPrefixName,
        Input<String> resourceGroupName,
        @Nullable Input<PublicIPPrefixSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<String>> zones) {
        this.customIPPrefix = customIPPrefix;
        this.extendedLocation = extendedLocation;
        this.id = id;
        this.ipTags = ipTags;
        this.location = location;
        this.natGateway = natGateway;
        this.prefixLength = prefixLength;
        this.publicIPAddressVersion = publicIPAddressVersion;
        this.publicIpPrefixName = publicIpPrefixName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.zones = zones;
    }

    private PublicIPPrefixArgs() {
        this.customIPPrefix = Input.empty();
        this.extendedLocation = Input.empty();
        this.id = Input.empty();
        this.ipTags = Input.empty();
        this.location = Input.empty();
        this.natGateway = Input.empty();
        this.prefixLength = Input.empty();
        this.publicIPAddressVersion = Input.empty();
        this.publicIpPrefixName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PublicIPPrefixArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SubResourceArgs> customIPPrefix;
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private @Nullable Input<String> id;
        private @Nullable Input<List<IpTagArgs>> ipTags;
        private @Nullable Input<String> location;
        private @Nullable Input<NatGatewayArgs> natGateway;
        private @Nullable Input<Integer> prefixLength;
        private @Nullable Input<Either<String,IPVersion>> publicIPAddressVersion;
        private @Nullable Input<String> publicIpPrefixName;
        private Input<String> resourceGroupName;
        private @Nullable Input<PublicIPPrefixSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(PublicIPPrefixArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customIPPrefix = defaults.customIPPrefix;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.id = defaults.id;
    	      this.ipTags = defaults.ipTags;
    	      this.location = defaults.location;
    	      this.natGateway = defaults.natGateway;
    	      this.prefixLength = defaults.prefixLength;
    	      this.publicIPAddressVersion = defaults.publicIPAddressVersion;
    	      this.publicIpPrefixName = defaults.publicIpPrefixName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.zones = defaults.zones;
        }

        public Builder setCustomIPPrefix(@Nullable Input<SubResourceArgs> customIPPrefix) {
            this.customIPPrefix = customIPPrefix;
            return this;
        }

        public Builder setCustomIPPrefix(@Nullable SubResourceArgs customIPPrefix) {
            this.customIPPrefix = Input.ofNullable(customIPPrefix);
            return this;
        }

        public Builder setExtendedLocation(@Nullable Input<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }

        public Builder setExtendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Input.ofNullable(extendedLocation);
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

        public Builder setIpTags(@Nullable Input<List<IpTagArgs>> ipTags) {
            this.ipTags = ipTags;
            return this;
        }

        public Builder setIpTags(@Nullable List<IpTagArgs> ipTags) {
            this.ipTags = Input.ofNullable(ipTags);
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

        public Builder setNatGateway(@Nullable Input<NatGatewayArgs> natGateway) {
            this.natGateway = natGateway;
            return this;
        }

        public Builder setNatGateway(@Nullable NatGatewayArgs natGateway) {
            this.natGateway = Input.ofNullable(natGateway);
            return this;
        }

        public Builder setPrefixLength(@Nullable Input<Integer> prefixLength) {
            this.prefixLength = prefixLength;
            return this;
        }

        public Builder setPrefixLength(@Nullable Integer prefixLength) {
            this.prefixLength = Input.ofNullable(prefixLength);
            return this;
        }

        public Builder setPublicIPAddressVersion(@Nullable Input<Either<String,IPVersion>> publicIPAddressVersion) {
            this.publicIPAddressVersion = publicIPAddressVersion;
            return this;
        }

        public Builder setPublicIPAddressVersion(@Nullable Either<String,IPVersion> publicIPAddressVersion) {
            this.publicIPAddressVersion = Input.ofNullable(publicIPAddressVersion);
            return this;
        }

        public Builder setPublicIpPrefixName(@Nullable Input<String> publicIpPrefixName) {
            this.publicIpPrefixName = publicIpPrefixName;
            return this;
        }

        public Builder setPublicIpPrefixName(@Nullable String publicIpPrefixName) {
            this.publicIpPrefixName = Input.ofNullable(publicIpPrefixName);
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

        public Builder setSku(@Nullable Input<PublicIPPrefixSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable PublicIPPrefixSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
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

        public Builder setZones(@Nullable Input<List<String>> zones) {
            this.zones = zones;
            return this;
        }

        public Builder setZones(@Nullable List<String> zones) {
            this.zones = Input.ofNullable(zones);
            return this;
        }

        public PublicIPPrefixArgs build() {
            return new PublicIPPrefixArgs(customIPPrefix, extendedLocation, id, ipTags, location, natGateway, prefixLength, publicIPAddressVersion, publicIpPrefixName, resourceGroupName, sku, tags, zones);
        }
    }
}
