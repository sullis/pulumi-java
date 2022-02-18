// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.cdn.enums.AFDEndpointProtocols;
import io.pulumi.azurenative.cdn.enums.AfdQueryStringCachingBehavior;
import io.pulumi.azurenative.cdn.enums.EnabledState;
import io.pulumi.azurenative.cdn.enums.ForwardingProtocol;
import io.pulumi.azurenative.cdn.enums.HttpsRedirect;
import io.pulumi.azurenative.cdn.enums.LinkToDefaultDomain;
import io.pulumi.azurenative.cdn.inputs.CompressionSettingsArgs;
import io.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteArgs Empty = new RouteArgs();

    /**
     * compression settings.
     * 
     */
    @InputImport(name="compressionSettings")
    private final @Nullable Input<CompressionSettingsArgs> compressionSettings;

    public Input<CompressionSettingsArgs> getCompressionSettings() {
        return this.compressionSettings == null ? Input.empty() : this.compressionSettings;
    }

    /**
     * Domains referenced by this endpoint.
     * 
     */
    @InputImport(name="customDomains")
    private final @Nullable Input<List<ResourceReferenceArgs>> customDomains;

    public Input<List<ResourceReferenceArgs>> getCustomDomains() {
        return this.customDomains == null ? Input.empty() : this.customDomains;
    }

    /**
     * Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'
     * 
     */
    @InputImport(name="enabledState")
    private final @Nullable Input<Either<String,EnabledState>> enabledState;

    public Input<Either<String,EnabledState>> getEnabledState() {
        return this.enabledState == null ? Input.empty() : this.enabledState;
    }

    /**
     * Name of the endpoint under the profile which is unique globally.
     * 
     */
    @InputImport(name="endpointName", required=true)
    private final Input<String> endpointName;

    public Input<String> getEndpointName() {
        return this.endpointName;
    }

    /**
     * Protocol this rule will use when forwarding traffic to backends.
     * 
     */
    @InputImport(name="forwardingProtocol")
    private final @Nullable Input<Either<String,ForwardingProtocol>> forwardingProtocol;

    public Input<Either<String,ForwardingProtocol>> getForwardingProtocol() {
        return this.forwardingProtocol == null ? Input.empty() : this.forwardingProtocol;
    }

    /**
     * Whether to automatically redirect HTTP traffic to HTTPS traffic. Note that this is a easy way to set up this rule and it will be the first rule that gets executed.
     * 
     */
    @InputImport(name="httpsRedirect")
    private final @Nullable Input<Either<String,HttpsRedirect>> httpsRedirect;

    public Input<Either<String,HttpsRedirect>> getHttpsRedirect() {
        return this.httpsRedirect == null ? Input.empty() : this.httpsRedirect;
    }

    /**
     * whether this route will be linked to the default endpoint domain.
     * 
     */
    @InputImport(name="linkToDefaultDomain")
    private final @Nullable Input<Either<String,LinkToDefaultDomain>> linkToDefaultDomain;

    public Input<Either<String,LinkToDefaultDomain>> getLinkToDefaultDomain() {
        return this.linkToDefaultDomain == null ? Input.empty() : this.linkToDefaultDomain;
    }

    /**
     * A reference to the origin group.
     * 
     */
    @InputImport(name="originGroup", required=true)
    private final Input<ResourceReferenceArgs> originGroup;

    public Input<ResourceReferenceArgs> getOriginGroup() {
        return this.originGroup;
    }

    /**
     * A directory path on the origin that AzureFrontDoor can use to retrieve content from, e.g. contoso.cloudapp.net/originpath.
     * 
     */
    @InputImport(name="originPath")
    private final @Nullable Input<String> originPath;

    public Input<String> getOriginPath() {
        return this.originPath == null ? Input.empty() : this.originPath;
    }

    /**
     * The route patterns of the rule.
     * 
     */
    @InputImport(name="patternsToMatch")
    private final @Nullable Input<List<String>> patternsToMatch;

    public Input<List<String>> getPatternsToMatch() {
        return this.patternsToMatch == null ? Input.empty() : this.patternsToMatch;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @InputImport(name="profileName", required=true)
    private final Input<String> profileName;

    public Input<String> getProfileName() {
        return this.profileName;
    }

    /**
     * Defines how CDN caches requests that include query strings. You can ignore any query strings when caching, bypass caching to prevent requests that contain query strings from being cached, or cache every request with a unique URL.
     * 
     */
    @InputImport(name="queryStringCachingBehavior")
    private final @Nullable Input<AfdQueryStringCachingBehavior> queryStringCachingBehavior;

    public Input<AfdQueryStringCachingBehavior> getQueryStringCachingBehavior() {
        return this.queryStringCachingBehavior == null ? Input.empty() : this.queryStringCachingBehavior;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the routing rule.
     * 
     */
    @InputImport(name="routeName")
    private final @Nullable Input<String> routeName;

    public Input<String> getRouteName() {
        return this.routeName == null ? Input.empty() : this.routeName;
    }

    /**
     * rule sets referenced by this endpoint.
     * 
     */
    @InputImport(name="ruleSets")
    private final @Nullable Input<List<ResourceReferenceArgs>> ruleSets;

    public Input<List<ResourceReferenceArgs>> getRuleSets() {
        return this.ruleSets == null ? Input.empty() : this.ruleSets;
    }

    /**
     * List of supported protocols for this route.
     * 
     */
    @InputImport(name="supportedProtocols")
    private final @Nullable Input<List<Either<String,AFDEndpointProtocols>>> supportedProtocols;

    public Input<List<Either<String,AFDEndpointProtocols>>> getSupportedProtocols() {
        return this.supportedProtocols == null ? Input.empty() : this.supportedProtocols;
    }

    public RouteArgs(
        @Nullable Input<CompressionSettingsArgs> compressionSettings,
        @Nullable Input<List<ResourceReferenceArgs>> customDomains,
        @Nullable Input<Either<String,EnabledState>> enabledState,
        Input<String> endpointName,
        @Nullable Input<Either<String,ForwardingProtocol>> forwardingProtocol,
        @Nullable Input<Either<String,HttpsRedirect>> httpsRedirect,
        @Nullable Input<Either<String,LinkToDefaultDomain>> linkToDefaultDomain,
        Input<ResourceReferenceArgs> originGroup,
        @Nullable Input<String> originPath,
        @Nullable Input<List<String>> patternsToMatch,
        Input<String> profileName,
        @Nullable Input<AfdQueryStringCachingBehavior> queryStringCachingBehavior,
        Input<String> resourceGroupName,
        @Nullable Input<String> routeName,
        @Nullable Input<List<ResourceReferenceArgs>> ruleSets,
        @Nullable Input<List<Either<String,AFDEndpointProtocols>>> supportedProtocols) {
        this.compressionSettings = compressionSettings;
        this.customDomains = customDomains;
        this.enabledState = enabledState;
        this.endpointName = Objects.requireNonNull(endpointName, "expected parameter 'endpointName' to be non-null");
        this.forwardingProtocol = forwardingProtocol;
        this.httpsRedirect = httpsRedirect;
        this.linkToDefaultDomain = linkToDefaultDomain;
        this.originGroup = Objects.requireNonNull(originGroup, "expected parameter 'originGroup' to be non-null");
        this.originPath = originPath;
        this.patternsToMatch = patternsToMatch;
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.queryStringCachingBehavior = queryStringCachingBehavior;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.routeName = routeName;
        this.ruleSets = ruleSets;
        this.supportedProtocols = supportedProtocols;
    }

    private RouteArgs() {
        this.compressionSettings = Input.empty();
        this.customDomains = Input.empty();
        this.enabledState = Input.empty();
        this.endpointName = Input.empty();
        this.forwardingProtocol = Input.empty();
        this.httpsRedirect = Input.empty();
        this.linkToDefaultDomain = Input.empty();
        this.originGroup = Input.empty();
        this.originPath = Input.empty();
        this.patternsToMatch = Input.empty();
        this.profileName = Input.empty();
        this.queryStringCachingBehavior = Input.empty();
        this.resourceGroupName = Input.empty();
        this.routeName = Input.empty();
        this.ruleSets = Input.empty();
        this.supportedProtocols = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<CompressionSettingsArgs> compressionSettings;
        private @Nullable Input<List<ResourceReferenceArgs>> customDomains;
        private @Nullable Input<Either<String,EnabledState>> enabledState;
        private Input<String> endpointName;
        private @Nullable Input<Either<String,ForwardingProtocol>> forwardingProtocol;
        private @Nullable Input<Either<String,HttpsRedirect>> httpsRedirect;
        private @Nullable Input<Either<String,LinkToDefaultDomain>> linkToDefaultDomain;
        private Input<ResourceReferenceArgs> originGroup;
        private @Nullable Input<String> originPath;
        private @Nullable Input<List<String>> patternsToMatch;
        private Input<String> profileName;
        private @Nullable Input<AfdQueryStringCachingBehavior> queryStringCachingBehavior;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> routeName;
        private @Nullable Input<List<ResourceReferenceArgs>> ruleSets;
        private @Nullable Input<List<Either<String,AFDEndpointProtocols>>> supportedProtocols;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compressionSettings = defaults.compressionSettings;
    	      this.customDomains = defaults.customDomains;
    	      this.enabledState = defaults.enabledState;
    	      this.endpointName = defaults.endpointName;
    	      this.forwardingProtocol = defaults.forwardingProtocol;
    	      this.httpsRedirect = defaults.httpsRedirect;
    	      this.linkToDefaultDomain = defaults.linkToDefaultDomain;
    	      this.originGroup = defaults.originGroup;
    	      this.originPath = defaults.originPath;
    	      this.patternsToMatch = defaults.patternsToMatch;
    	      this.profileName = defaults.profileName;
    	      this.queryStringCachingBehavior = defaults.queryStringCachingBehavior;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.routeName = defaults.routeName;
    	      this.ruleSets = defaults.ruleSets;
    	      this.supportedProtocols = defaults.supportedProtocols;
        }

        public Builder setCompressionSettings(@Nullable Input<CompressionSettingsArgs> compressionSettings) {
            this.compressionSettings = compressionSettings;
            return this;
        }

        public Builder setCompressionSettings(@Nullable CompressionSettingsArgs compressionSettings) {
            this.compressionSettings = Input.ofNullable(compressionSettings);
            return this;
        }

        public Builder setCustomDomains(@Nullable Input<List<ResourceReferenceArgs>> customDomains) {
            this.customDomains = customDomains;
            return this;
        }

        public Builder setCustomDomains(@Nullable List<ResourceReferenceArgs> customDomains) {
            this.customDomains = Input.ofNullable(customDomains);
            return this;
        }

        public Builder setEnabledState(@Nullable Input<Either<String,EnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setEnabledState(@Nullable Either<String,EnabledState> enabledState) {
            this.enabledState = Input.ofNullable(enabledState);
            return this;
        }

        public Builder setEndpointName(Input<String> endpointName) {
            this.endpointName = Objects.requireNonNull(endpointName);
            return this;
        }

        public Builder setEndpointName(String endpointName) {
            this.endpointName = Input.of(Objects.requireNonNull(endpointName));
            return this;
        }

        public Builder setForwardingProtocol(@Nullable Input<Either<String,ForwardingProtocol>> forwardingProtocol) {
            this.forwardingProtocol = forwardingProtocol;
            return this;
        }

        public Builder setForwardingProtocol(@Nullable Either<String,ForwardingProtocol> forwardingProtocol) {
            this.forwardingProtocol = Input.ofNullable(forwardingProtocol);
            return this;
        }

        public Builder setHttpsRedirect(@Nullable Input<Either<String,HttpsRedirect>> httpsRedirect) {
            this.httpsRedirect = httpsRedirect;
            return this;
        }

        public Builder setHttpsRedirect(@Nullable Either<String,HttpsRedirect> httpsRedirect) {
            this.httpsRedirect = Input.ofNullable(httpsRedirect);
            return this;
        }

        public Builder setLinkToDefaultDomain(@Nullable Input<Either<String,LinkToDefaultDomain>> linkToDefaultDomain) {
            this.linkToDefaultDomain = linkToDefaultDomain;
            return this;
        }

        public Builder setLinkToDefaultDomain(@Nullable Either<String,LinkToDefaultDomain> linkToDefaultDomain) {
            this.linkToDefaultDomain = Input.ofNullable(linkToDefaultDomain);
            return this;
        }

        public Builder setOriginGroup(Input<ResourceReferenceArgs> originGroup) {
            this.originGroup = Objects.requireNonNull(originGroup);
            return this;
        }

        public Builder setOriginGroup(ResourceReferenceArgs originGroup) {
            this.originGroup = Input.of(Objects.requireNonNull(originGroup));
            return this;
        }

        public Builder setOriginPath(@Nullable Input<String> originPath) {
            this.originPath = originPath;
            return this;
        }

        public Builder setOriginPath(@Nullable String originPath) {
            this.originPath = Input.ofNullable(originPath);
            return this;
        }

        public Builder setPatternsToMatch(@Nullable Input<List<String>> patternsToMatch) {
            this.patternsToMatch = patternsToMatch;
            return this;
        }

        public Builder setPatternsToMatch(@Nullable List<String> patternsToMatch) {
            this.patternsToMatch = Input.ofNullable(patternsToMatch);
            return this;
        }

        public Builder setProfileName(Input<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder setProfileName(String profileName) {
            this.profileName = Input.of(Objects.requireNonNull(profileName));
            return this;
        }

        public Builder setQueryStringCachingBehavior(@Nullable Input<AfdQueryStringCachingBehavior> queryStringCachingBehavior) {
            this.queryStringCachingBehavior = queryStringCachingBehavior;
            return this;
        }

        public Builder setQueryStringCachingBehavior(@Nullable AfdQueryStringCachingBehavior queryStringCachingBehavior) {
            this.queryStringCachingBehavior = Input.ofNullable(queryStringCachingBehavior);
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

        public Builder setRouteName(@Nullable Input<String> routeName) {
            this.routeName = routeName;
            return this;
        }

        public Builder setRouteName(@Nullable String routeName) {
            this.routeName = Input.ofNullable(routeName);
            return this;
        }

        public Builder setRuleSets(@Nullable Input<List<ResourceReferenceArgs>> ruleSets) {
            this.ruleSets = ruleSets;
            return this;
        }

        public Builder setRuleSets(@Nullable List<ResourceReferenceArgs> ruleSets) {
            this.ruleSets = Input.ofNullable(ruleSets);
            return this;
        }

        public Builder setSupportedProtocols(@Nullable Input<List<Either<String,AFDEndpointProtocols>>> supportedProtocols) {
            this.supportedProtocols = supportedProtocols;
            return this;
        }

        public Builder setSupportedProtocols(@Nullable List<Either<String,AFDEndpointProtocols>> supportedProtocols) {
            this.supportedProtocols = Input.ofNullable(supportedProtocols);
            return this;
        }

        public RouteArgs build() {
            return new RouteArgs(compressionSettings, customDomains, enabledState, endpointName, forwardingProtocol, httpsRedirect, linkToDefaultDomain, originGroup, originPath, patternsToMatch, profileName, queryStringCachingBehavior, resourceGroupName, routeName, ruleSets, supportedProtocols);
        }
    }
}
