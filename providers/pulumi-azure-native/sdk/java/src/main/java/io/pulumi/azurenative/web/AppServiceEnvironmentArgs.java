// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.enums.LoadBalancingMode;
import io.pulumi.azurenative.web.inputs.NameValuePairArgs;
import io.pulumi.azurenative.web.inputs.VirtualNetworkProfileArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AppServiceEnvironmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppServiceEnvironmentArgs Empty = new AppServiceEnvironmentArgs();

    /**
     * Custom settings for changing the behavior of the App Service Environment.
     * 
     */
    @InputImport(name="clusterSettings")
      private final @Nullable Input<List<NameValuePairArgs>> clusterSettings;

    public Input<List<NameValuePairArgs>> getClusterSettings() {
        return this.clusterSettings == null ? Input.empty() : this.clusterSettings;
    }

    /**
     * DNS suffix of the App Service Environment.
     * 
     */
    @InputImport(name="dnsSuffix")
      private final @Nullable Input<String> dnsSuffix;

    public Input<String> getDnsSuffix() {
        return this.dnsSuffix == null ? Input.empty() : this.dnsSuffix;
    }

    /**
     * Scale factor for front-ends.
     * 
     */
    @InputImport(name="frontEndScaleFactor")
      private final @Nullable Input<Integer> frontEndScaleFactor;

    public Input<Integer> getFrontEndScaleFactor() {
        return this.frontEndScaleFactor == null ? Input.empty() : this.frontEndScaleFactor;
    }

    /**
     * Specifies which endpoints to serve internally in the Virtual Network for the App Service Environment.
     * 
     */
    @InputImport(name="internalLoadBalancingMode")
      private final @Nullable Input<Either<String,LoadBalancingMode>> internalLoadBalancingMode;

    public Input<Either<String,LoadBalancingMode>> getInternalLoadBalancingMode() {
        return this.internalLoadBalancingMode == null ? Input.empty() : this.internalLoadBalancingMode;
    }

    /**
     * Number of IP SSL addresses reserved for the App Service Environment.
     * 
     */
    @InputImport(name="ipsslAddressCount")
      private final @Nullable Input<Integer> ipsslAddressCount;

    public Input<Integer> getIpsslAddressCount() {
        return this.ipsslAddressCount == null ? Input.empty() : this.ipsslAddressCount;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    /**
     * Resource Location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Front-end VM size, e.g. "Medium", "Large".
     * 
     */
    @InputImport(name="multiSize")
      private final @Nullable Input<String> multiSize;

    public Input<String> getMultiSize() {
        return this.multiSize == null ? Input.empty() : this.multiSize;
    }

    /**
     * Name of the App Service Environment.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
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

    /**
     * User added ip ranges to whitelist on ASE db
     * 
     */
    @InputImport(name="userWhitelistedIpRanges")
      private final @Nullable Input<List<String>> userWhitelistedIpRanges;

    public Input<List<String>> getUserWhitelistedIpRanges() {
        return this.userWhitelistedIpRanges == null ? Input.empty() : this.userWhitelistedIpRanges;
    }

    /**
     * Description of the Virtual Network.
     * 
     */
    @InputImport(name="virtualNetwork", required=true)
      private final Input<VirtualNetworkProfileArgs> virtualNetwork;

    public Input<VirtualNetworkProfileArgs> getVirtualNetwork() {
        return this.virtualNetwork;
    }

    public AppServiceEnvironmentArgs(
        @Nullable Input<List<NameValuePairArgs>> clusterSettings,
        @Nullable Input<String> dnsSuffix,
        @Nullable Input<Integer> frontEndScaleFactor,
        @Nullable Input<Either<String,LoadBalancingMode>> internalLoadBalancingMode,
        @Nullable Input<Integer> ipsslAddressCount,
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> multiSize,
        @Nullable Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<List<String>> userWhitelistedIpRanges,
        Input<VirtualNetworkProfileArgs> virtualNetwork) {
        this.clusterSettings = clusterSettings;
        this.dnsSuffix = dnsSuffix;
        this.frontEndScaleFactor = frontEndScaleFactor;
        this.internalLoadBalancingMode = internalLoadBalancingMode;
        this.ipsslAddressCount = ipsslAddressCount;
        this.kind = kind;
        this.location = location;
        this.multiSize = multiSize;
        this.name = name;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.userWhitelistedIpRanges = userWhitelistedIpRanges;
        this.virtualNetwork = Objects.requireNonNull(virtualNetwork, "expected parameter 'virtualNetwork' to be non-null");
    }

    private AppServiceEnvironmentArgs() {
        this.clusterSettings = Input.empty();
        this.dnsSuffix = Input.empty();
        this.frontEndScaleFactor = Input.empty();
        this.internalLoadBalancingMode = Input.empty();
        this.ipsslAddressCount = Input.empty();
        this.kind = Input.empty();
        this.location = Input.empty();
        this.multiSize = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.userWhitelistedIpRanges = Input.empty();
        this.virtualNetwork = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppServiceEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<NameValuePairArgs>> clusterSettings;
        private @Nullable Input<String> dnsSuffix;
        private @Nullable Input<Integer> frontEndScaleFactor;
        private @Nullable Input<Either<String,LoadBalancingMode>> internalLoadBalancingMode;
        private @Nullable Input<Integer> ipsslAddressCount;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> multiSize;
        private @Nullable Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<List<String>> userWhitelistedIpRanges;
        private Input<VirtualNetworkProfileArgs> virtualNetwork;

        public Builder() {
    	      // Empty
        }

        public Builder(AppServiceEnvironmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterSettings = defaults.clusterSettings;
    	      this.dnsSuffix = defaults.dnsSuffix;
    	      this.frontEndScaleFactor = defaults.frontEndScaleFactor;
    	      this.internalLoadBalancingMode = defaults.internalLoadBalancingMode;
    	      this.ipsslAddressCount = defaults.ipsslAddressCount;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.multiSize = defaults.multiSize;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.userWhitelistedIpRanges = defaults.userWhitelistedIpRanges;
    	      this.virtualNetwork = defaults.virtualNetwork;
        }

        public Builder setClusterSettings(@Nullable Input<List<NameValuePairArgs>> clusterSettings) {
            this.clusterSettings = clusterSettings;
            return this;
        }

        public Builder setClusterSettings(@Nullable List<NameValuePairArgs> clusterSettings) {
            this.clusterSettings = Input.ofNullable(clusterSettings);
            return this;
        }

        public Builder setDnsSuffix(@Nullable Input<String> dnsSuffix) {
            this.dnsSuffix = dnsSuffix;
            return this;
        }

        public Builder setDnsSuffix(@Nullable String dnsSuffix) {
            this.dnsSuffix = Input.ofNullable(dnsSuffix);
            return this;
        }

        public Builder setFrontEndScaleFactor(@Nullable Input<Integer> frontEndScaleFactor) {
            this.frontEndScaleFactor = frontEndScaleFactor;
            return this;
        }

        public Builder setFrontEndScaleFactor(@Nullable Integer frontEndScaleFactor) {
            this.frontEndScaleFactor = Input.ofNullable(frontEndScaleFactor);
            return this;
        }

        public Builder setInternalLoadBalancingMode(@Nullable Input<Either<String,LoadBalancingMode>> internalLoadBalancingMode) {
            this.internalLoadBalancingMode = internalLoadBalancingMode;
            return this;
        }

        public Builder setInternalLoadBalancingMode(@Nullable Either<String,LoadBalancingMode> internalLoadBalancingMode) {
            this.internalLoadBalancingMode = Input.ofNullable(internalLoadBalancingMode);
            return this;
        }

        public Builder setIpsslAddressCount(@Nullable Input<Integer> ipsslAddressCount) {
            this.ipsslAddressCount = ipsslAddressCount;
            return this;
        }

        public Builder setIpsslAddressCount(@Nullable Integer ipsslAddressCount) {
            this.ipsslAddressCount = Input.ofNullable(ipsslAddressCount);
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
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

        public Builder setMultiSize(@Nullable Input<String> multiSize) {
            this.multiSize = multiSize;
            return this;
        }

        public Builder setMultiSize(@Nullable String multiSize) {
            this.multiSize = Input.ofNullable(multiSize);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
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

        public Builder setUserWhitelistedIpRanges(@Nullable Input<List<String>> userWhitelistedIpRanges) {
            this.userWhitelistedIpRanges = userWhitelistedIpRanges;
            return this;
        }

        public Builder setUserWhitelistedIpRanges(@Nullable List<String> userWhitelistedIpRanges) {
            this.userWhitelistedIpRanges = Input.ofNullable(userWhitelistedIpRanges);
            return this;
        }

        public Builder setVirtualNetwork(Input<VirtualNetworkProfileArgs> virtualNetwork) {
            this.virtualNetwork = Objects.requireNonNull(virtualNetwork);
            return this;
        }

        public Builder setVirtualNetwork(VirtualNetworkProfileArgs virtualNetwork) {
            this.virtualNetwork = Input.of(Objects.requireNonNull(virtualNetwork));
            return this;
        }
        public AppServiceEnvironmentArgs build() {
            return new AppServiceEnvironmentArgs(clusterSettings, dnsSuffix, frontEndScaleFactor, internalLoadBalancingMode, ipsslAddressCount, kind, location, multiSize, name, resourceGroupName, tags, userWhitelistedIpRanges, virtualNetwork);
        }
    }
}