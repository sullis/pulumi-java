// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ExtendedLocationArgs;
import io.pulumi.azurenative.network.inputs.FrontendIPConfigurationArgs;
import io.pulumi.azurenative.network.inputs.PrivateLinkServiceIpConfigurationArgs;
import io.pulumi.azurenative.network.inputs.PrivateLinkServicePropertiesAutoApprovalArgs;
import io.pulumi.azurenative.network.inputs.PrivateLinkServicePropertiesVisibilityArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Private link service resource.
 * 
 */
public final class PrivateLinkServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PrivateLinkServiceArgs Empty = new PrivateLinkServiceArgs();

    /**
     * The auto-approval list of the private link service.
     * 
     */
    @InputImport(name="autoApproval")
    private final @Nullable Input<PrivateLinkServicePropertiesAutoApprovalArgs> autoApproval;

    public Input<PrivateLinkServicePropertiesAutoApprovalArgs> getAutoApproval() {
        return this.autoApproval == null ? Input.empty() : this.autoApproval;
    }

    /**
     * Whether the private link service is enabled for proxy protocol or not.
     * 
     */
    @InputImport(name="enableProxyProtocol")
    private final @Nullable Input<Boolean> enableProxyProtocol;

    public Input<Boolean> getEnableProxyProtocol() {
        return this.enableProxyProtocol == null ? Input.empty() : this.enableProxyProtocol;
    }

    /**
     * The extended location of the load balancer.
     * 
     */
    @InputImport(name="extendedLocation")
    private final @Nullable Input<ExtendedLocationArgs> extendedLocation;

    public Input<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Input.empty() : this.extendedLocation;
    }

    /**
     * The list of Fqdn.
     * 
     */
    @InputImport(name="fqdns")
    private final @Nullable Input<List<String>> fqdns;

    public Input<List<String>> getFqdns() {
        return this.fqdns == null ? Input.empty() : this.fqdns;
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
     * An array of private link service IP configurations.
     * 
     */
    @InputImport(name="ipConfigurations")
    private final @Nullable Input<List<PrivateLinkServiceIpConfigurationArgs>> ipConfigurations;

    public Input<List<PrivateLinkServiceIpConfigurationArgs>> getIpConfigurations() {
        return this.ipConfigurations == null ? Input.empty() : this.ipConfigurations;
    }

    /**
     * An array of references to the load balancer IP configurations.
     * 
     */
    @InputImport(name="loadBalancerFrontendIpConfigurations")
    private final @Nullable Input<List<FrontendIPConfigurationArgs>> loadBalancerFrontendIpConfigurations;

    public Input<List<FrontendIPConfigurationArgs>> getLoadBalancerFrontendIpConfigurations() {
        return this.loadBalancerFrontendIpConfigurations == null ? Input.empty() : this.loadBalancerFrontendIpConfigurations;
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
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The visibility list of the private link service.
     * 
     */
    @InputImport(name="visibility")
    private final @Nullable Input<PrivateLinkServicePropertiesVisibilityArgs> visibility;

    public Input<PrivateLinkServicePropertiesVisibilityArgs> getVisibility() {
        return this.visibility == null ? Input.empty() : this.visibility;
    }

    public PrivateLinkServiceArgs(
        @Nullable Input<PrivateLinkServicePropertiesAutoApprovalArgs> autoApproval,
        @Nullable Input<Boolean> enableProxyProtocol,
        @Nullable Input<ExtendedLocationArgs> extendedLocation,
        @Nullable Input<List<String>> fqdns,
        @Nullable Input<String> id,
        @Nullable Input<List<PrivateLinkServiceIpConfigurationArgs>> ipConfigurations,
        @Nullable Input<List<FrontendIPConfigurationArgs>> loadBalancerFrontendIpConfigurations,
        @Nullable Input<String> location,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<PrivateLinkServicePropertiesVisibilityArgs> visibility) {
        this.autoApproval = autoApproval;
        this.enableProxyProtocol = enableProxyProtocol;
        this.extendedLocation = extendedLocation;
        this.fqdns = fqdns;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.loadBalancerFrontendIpConfigurations = loadBalancerFrontendIpConfigurations;
        this.location = location;
        this.tags = tags;
        this.visibility = visibility;
    }

    private PrivateLinkServiceArgs() {
        this.autoApproval = Input.empty();
        this.enableProxyProtocol = Input.empty();
        this.extendedLocation = Input.empty();
        this.fqdns = Input.empty();
        this.id = Input.empty();
        this.ipConfigurations = Input.empty();
        this.loadBalancerFrontendIpConfigurations = Input.empty();
        this.location = Input.empty();
        this.tags = Input.empty();
        this.visibility = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<PrivateLinkServicePropertiesAutoApprovalArgs> autoApproval;
        private @Nullable Input<Boolean> enableProxyProtocol;
        private @Nullable Input<ExtendedLocationArgs> extendedLocation;
        private @Nullable Input<List<String>> fqdns;
        private @Nullable Input<String> id;
        private @Nullable Input<List<PrivateLinkServiceIpConfigurationArgs>> ipConfigurations;
        private @Nullable Input<List<FrontendIPConfigurationArgs>> loadBalancerFrontendIpConfigurations;
        private @Nullable Input<String> location;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<PrivateLinkServicePropertiesVisibilityArgs> visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoApproval = defaults.autoApproval;
    	      this.enableProxyProtocol = defaults.enableProxyProtocol;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.fqdns = defaults.fqdns;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.loadBalancerFrontendIpConfigurations = defaults.loadBalancerFrontendIpConfigurations;
    	      this.location = defaults.location;
    	      this.tags = defaults.tags;
    	      this.visibility = defaults.visibility;
        }

        public Builder setAutoApproval(@Nullable Input<PrivateLinkServicePropertiesAutoApprovalArgs> autoApproval) {
            this.autoApproval = autoApproval;
            return this;
        }

        public Builder setAutoApproval(@Nullable PrivateLinkServicePropertiesAutoApprovalArgs autoApproval) {
            this.autoApproval = Input.ofNullable(autoApproval);
            return this;
        }

        public Builder setEnableProxyProtocol(@Nullable Input<Boolean> enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }

        public Builder setEnableProxyProtocol(@Nullable Boolean enableProxyProtocol) {
            this.enableProxyProtocol = Input.ofNullable(enableProxyProtocol);
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

        public Builder setFqdns(@Nullable Input<List<String>> fqdns) {
            this.fqdns = fqdns;
            return this;
        }

        public Builder setFqdns(@Nullable List<String> fqdns) {
            this.fqdns = Input.ofNullable(fqdns);
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

        public Builder setIpConfigurations(@Nullable Input<List<PrivateLinkServiceIpConfigurationArgs>> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder setIpConfigurations(@Nullable List<PrivateLinkServiceIpConfigurationArgs> ipConfigurations) {
            this.ipConfigurations = Input.ofNullable(ipConfigurations);
            return this;
        }

        public Builder setLoadBalancerFrontendIpConfigurations(@Nullable Input<List<FrontendIPConfigurationArgs>> loadBalancerFrontendIpConfigurations) {
            this.loadBalancerFrontendIpConfigurations = loadBalancerFrontendIpConfigurations;
            return this;
        }

        public Builder setLoadBalancerFrontendIpConfigurations(@Nullable List<FrontendIPConfigurationArgs> loadBalancerFrontendIpConfigurations) {
            this.loadBalancerFrontendIpConfigurations = Input.ofNullable(loadBalancerFrontendIpConfigurations);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVisibility(@Nullable Input<PrivateLinkServicePropertiesVisibilityArgs> visibility) {
            this.visibility = visibility;
            return this;
        }

        public Builder setVisibility(@Nullable PrivateLinkServicePropertiesVisibilityArgs visibility) {
            this.visibility = Input.ofNullable(visibility);
            return this;
        }

        public PrivateLinkServiceArgs build() {
            return new PrivateLinkServiceArgs(autoApproval, enableProxyProtocol, extendedLocation, fqdns, id, ipConfigurations, loadBalancerFrontendIpConfigurations, location, tags, visibility);
        }
    }
}
