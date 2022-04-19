// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web;

import com.pulumi.azurenative.web.enums.ClientCertMode;
import com.pulumi.azurenative.web.enums.RedundancyMode;
import com.pulumi.azurenative.web.inputs.CloningInfoArgs;
import com.pulumi.azurenative.web.inputs.HostNameSslStateArgs;
import com.pulumi.azurenative.web.inputs.HostingEnvironmentProfileArgs;
import com.pulumi.azurenative.web.inputs.ManagedServiceIdentityArgs;
import com.pulumi.azurenative.web.inputs.SiteConfigArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppSlotArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAppSlotArgs Empty = new WebAppSlotArgs();

    /**
     * <code>true</code> to enable client affinity; <code>false</code> to stop sending session affinity cookies, which route client requests in the same session to the same instance. Default is <code>true</code>.
     * 
     */
    @Import(name="clientAffinityEnabled")
      private final @Nullable Output<Boolean> clientAffinityEnabled;

    public Output<Boolean> clientAffinityEnabled() {
        return this.clientAffinityEnabled == null ? Codegen.empty() : this.clientAffinityEnabled;
    }

    /**
     * <code>true</code> to enable client certificate authentication (TLS mutual authentication); otherwise, <code>false</code>. Default is <code>false</code>.
     * 
     */
    @Import(name="clientCertEnabled")
      private final @Nullable Output<Boolean> clientCertEnabled;

    public Output<Boolean> clientCertEnabled() {
        return this.clientCertEnabled == null ? Codegen.empty() : this.clientCertEnabled;
    }

    /**
     * client certificate authentication comma-separated exclusion paths
     * 
     */
    @Import(name="clientCertExclusionPaths")
      private final @Nullable Output<String> clientCertExclusionPaths;

    public Output<String> clientCertExclusionPaths() {
        return this.clientCertExclusionPaths == null ? Codegen.empty() : this.clientCertExclusionPaths;
    }

    /**
     * This composes with ClientCertEnabled setting.
     * - ClientCertEnabled: false means ClientCert is ignored.
     * - ClientCertEnabled: true and ClientCertMode: Required means ClientCert is required.
     * - ClientCertEnabled: true and ClientCertMode: Optional means ClientCert is optional or accepted.
     * 
     */
    @Import(name="clientCertMode")
      private final @Nullable Output<ClientCertMode> clientCertMode;

    public Output<ClientCertMode> clientCertMode() {
        return this.clientCertMode == null ? Codegen.empty() : this.clientCertMode;
    }

    /**
     * If specified during app creation, the app is cloned from a source app.
     * 
     */
    @Import(name="cloningInfo")
      private final @Nullable Output<CloningInfoArgs> cloningInfo;

    public Output<CloningInfoArgs> cloningInfo() {
        return this.cloningInfo == null ? Codegen.empty() : this.cloningInfo;
    }

    /**
     * Size of the function container.
     * 
     */
    @Import(name="containerSize")
      private final @Nullable Output<Integer> containerSize;

    public Output<Integer> containerSize() {
        return this.containerSize == null ? Codegen.empty() : this.containerSize;
    }

    /**
     * Unique identifier that verifies the custom domains assigned to the app. Customer will add this id to a txt record for verification.
     * 
     */
    @Import(name="customDomainVerificationId")
      private final @Nullable Output<String> customDomainVerificationId;

    public Output<String> customDomainVerificationId() {
        return this.customDomainVerificationId == null ? Codegen.empty() : this.customDomainVerificationId;
    }

    /**
     * Maximum allowed daily memory-time quota (applicable on dynamic apps only).
     * 
     */
    @Import(name="dailyMemoryTimeQuota")
      private final @Nullable Output<Integer> dailyMemoryTimeQuota;

    public Output<Integer> dailyMemoryTimeQuota() {
        return this.dailyMemoryTimeQuota == null ? Codegen.empty() : this.dailyMemoryTimeQuota;
    }

    /**
     * <code>true</code> if the app is enabled; otherwise, <code>false</code>. Setting this value to false disables the app (takes the app offline).
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    /**
     * Hostname SSL states are used to manage the SSL bindings for app's hostnames.
     * 
     */
    @Import(name="hostNameSslStates")
      private final @Nullable Output<List<HostNameSslStateArgs>> hostNameSslStates;

    public Output<List<HostNameSslStateArgs>> hostNameSslStates() {
        return this.hostNameSslStates == null ? Codegen.empty() : this.hostNameSslStates;
    }

    /**
     * <code>true</code> to disable the public hostnames of the app; otherwise, <code>false</code>.
     *  If <code>true</code>, the app is only accessible via API management process.
     * 
     */
    @Import(name="hostNamesDisabled")
      private final @Nullable Output<Boolean> hostNamesDisabled;

    public Output<Boolean> hostNamesDisabled() {
        return this.hostNamesDisabled == null ? Codegen.empty() : this.hostNamesDisabled;
    }

    /**
     * App Service Environment to use for the app.
     * 
     */
    @Import(name="hostingEnvironmentProfile")
      private final @Nullable Output<HostingEnvironmentProfileArgs> hostingEnvironmentProfile;

    public Output<HostingEnvironmentProfileArgs> hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile == null ? Codegen.empty() : this.hostingEnvironmentProfile;
    }

    /**
     * HttpsOnly: configures a web site to accept only https requests. Issues redirect for
     * http requests
     * 
     */
    @Import(name="httpsOnly")
      private final @Nullable Output<Boolean> httpsOnly;

    public Output<Boolean> httpsOnly() {
        return this.httpsOnly == null ? Codegen.empty() : this.httpsOnly;
    }

    /**
     * Hyper-V sandbox.
     * 
     */
    @Import(name="hyperV")
      private final @Nullable Output<Boolean> hyperV;

    public Output<Boolean> hyperV() {
        return this.hyperV == null ? Codegen.empty() : this.hyperV;
    }

    /**
     * Managed service identity.
     * 
     */
    @Import(name="identity")
      private final @Nullable Output<ManagedServiceIdentityArgs> identity;

    public Output<ManagedServiceIdentityArgs> identity() {
        return this.identity == null ? Codegen.empty() : this.identity;
    }

    /**
     * Obsolete: Hyper-V sandbox.
     * 
     */
    @Import(name="isXenon")
      private final @Nullable Output<Boolean> isXenon;

    public Output<Boolean> isXenon() {
        return this.isXenon == null ? Codegen.empty() : this.isXenon;
    }

    /**
     * Identity to use for Key Vault Reference authentication.
     * 
     */
    @Import(name="keyVaultReferenceIdentity")
      private final @Nullable Output<String> keyVaultReferenceIdentity;

    public Output<String> keyVaultReferenceIdentity() {
        return this.keyVaultReferenceIdentity == null ? Codegen.empty() : this.keyVaultReferenceIdentity;
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> kind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Resource Location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Unique name of the app to create or update. To create or update a deployment slot, use the {slot} parameter.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> name() {
        return this.name;
    }

    /**
     * Site redundancy mode
     * 
     */
    @Import(name="redundancyMode")
      private final @Nullable Output<RedundancyMode> redundancyMode;

    public Output<RedundancyMode> redundancyMode() {
        return this.redundancyMode == null ? Codegen.empty() : this.redundancyMode;
    }

    /**
     * <code>true</code> if reserved; otherwise, <code>false</code>.
     * 
     */
    @Import(name="reserved")
      private final @Nullable Output<Boolean> reserved;

    public Output<Boolean> reserved() {
        return this.reserved == null ? Codegen.empty() : this.reserved;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * <code>true</code> to stop SCM (KUDU) site when the app is stopped; otherwise, <code>false</code>. The default is <code>false</code>.
     * 
     */
    @Import(name="scmSiteAlsoStopped")
      private final @Nullable Output<Boolean> scmSiteAlsoStopped;

    public Output<Boolean> scmSiteAlsoStopped() {
        return this.scmSiteAlsoStopped == null ? Codegen.empty() : this.scmSiteAlsoStopped;
    }

    /**
     * Resource ID of the associated App Service plan, formatted as: "/subscriptions/{subscriptionID}/resourceGroups/{groupName}/providers/Microsoft.Web/serverfarms/{appServicePlanName}".
     * 
     */
    @Import(name="serverFarmId")
      private final @Nullable Output<String> serverFarmId;

    public Output<String> serverFarmId() {
        return this.serverFarmId == null ? Codegen.empty() : this.serverFarmId;
    }

    /**
     * Configuration of the app.
     * 
     */
    @Import(name="siteConfig")
      private final @Nullable Output<SiteConfigArgs> siteConfig;

    public Output<SiteConfigArgs> siteConfig() {
        return this.siteConfig == null ? Codegen.empty() : this.siteConfig;
    }

    /**
     * Name of the deployment slot to create or update. The name 'production' is reserved.
     * 
     */
    @Import(name="slot")
      private final @Nullable Output<String> slot;

    public Output<String> slot() {
        return this.slot == null ? Codegen.empty() : this.slot;
    }

    /**
     * Checks if Customer provided storage account is required
     * 
     */
    @Import(name="storageAccountRequired")
      private final @Nullable Output<Boolean> storageAccountRequired;

    public Output<Boolean> storageAccountRequired() {
        return this.storageAccountRequired == null ? Codegen.empty() : this.storageAccountRequired;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Azure Resource Manager ID of the Virtual network and subnet to be joined by Regional VNET Integration.
     * This must be of the form /subscriptions/{subscriptionName}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualNetworks/{vnetName}/subnets/{subnetName}
     * 
     */
    @Import(name="virtualNetworkSubnetId")
      private final @Nullable Output<String> virtualNetworkSubnetId;

    public Output<String> virtualNetworkSubnetId() {
        return this.virtualNetworkSubnetId == null ? Codegen.empty() : this.virtualNetworkSubnetId;
    }

    public WebAppSlotArgs(
        @Nullable Output<Boolean> clientAffinityEnabled,
        @Nullable Output<Boolean> clientCertEnabled,
        @Nullable Output<String> clientCertExclusionPaths,
        @Nullable Output<ClientCertMode> clientCertMode,
        @Nullable Output<CloningInfoArgs> cloningInfo,
        @Nullable Output<Integer> containerSize,
        @Nullable Output<String> customDomainVerificationId,
        @Nullable Output<Integer> dailyMemoryTimeQuota,
        @Nullable Output<Boolean> enabled,
        @Nullable Output<List<HostNameSslStateArgs>> hostNameSslStates,
        @Nullable Output<Boolean> hostNamesDisabled,
        @Nullable Output<HostingEnvironmentProfileArgs> hostingEnvironmentProfile,
        @Nullable Output<Boolean> httpsOnly,
        @Nullable Output<Boolean> hyperV,
        @Nullable Output<ManagedServiceIdentityArgs> identity,
        @Nullable Output<Boolean> isXenon,
        @Nullable Output<String> keyVaultReferenceIdentity,
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        Output<String> name,
        @Nullable Output<RedundancyMode> redundancyMode,
        @Nullable Output<Boolean> reserved,
        Output<String> resourceGroupName,
        @Nullable Output<Boolean> scmSiteAlsoStopped,
        @Nullable Output<String> serverFarmId,
        @Nullable Output<SiteConfigArgs> siteConfig,
        @Nullable Output<String> slot,
        @Nullable Output<Boolean> storageAccountRequired,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> virtualNetworkSubnetId) {
        this.clientAffinityEnabled = clientAffinityEnabled;
        this.clientCertEnabled = clientCertEnabled;
        this.clientCertExclusionPaths = clientCertExclusionPaths;
        this.clientCertMode = clientCertMode;
        this.cloningInfo = cloningInfo;
        this.containerSize = containerSize;
        this.customDomainVerificationId = customDomainVerificationId;
        this.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
        this.enabled = enabled;
        this.hostNameSslStates = hostNameSslStates;
        this.hostNamesDisabled = hostNamesDisabled;
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        this.httpsOnly = httpsOnly;
        this.hyperV = Codegen.booleanProp("hyperV").output().arg(hyperV).def(false).getNullable();
        this.identity = identity;
        this.isXenon = Codegen.booleanProp("isXenon").output().arg(isXenon).def(false).getNullable();
        this.keyVaultReferenceIdentity = keyVaultReferenceIdentity;
        this.kind = kind;
        this.location = location;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.redundancyMode = redundancyMode;
        this.reserved = Codegen.booleanProp("reserved").output().arg(reserved).def(false).getNullable();
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.scmSiteAlsoStopped = Codegen.booleanProp("scmSiteAlsoStopped").output().arg(scmSiteAlsoStopped).def(false).getNullable();
        this.serverFarmId = serverFarmId;
        this.siteConfig = siteConfig;
        this.slot = slot;
        this.storageAccountRequired = storageAccountRequired;
        this.tags = tags;
        this.virtualNetworkSubnetId = virtualNetworkSubnetId;
    }

    private WebAppSlotArgs() {
        this.clientAffinityEnabled = Codegen.empty();
        this.clientCertEnabled = Codegen.empty();
        this.clientCertExclusionPaths = Codegen.empty();
        this.clientCertMode = Codegen.empty();
        this.cloningInfo = Codegen.empty();
        this.containerSize = Codegen.empty();
        this.customDomainVerificationId = Codegen.empty();
        this.dailyMemoryTimeQuota = Codegen.empty();
        this.enabled = Codegen.empty();
        this.hostNameSslStates = Codegen.empty();
        this.hostNamesDisabled = Codegen.empty();
        this.hostingEnvironmentProfile = Codegen.empty();
        this.httpsOnly = Codegen.empty();
        this.hyperV = Codegen.empty();
        this.identity = Codegen.empty();
        this.isXenon = Codegen.empty();
        this.keyVaultReferenceIdentity = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.redundancyMode = Codegen.empty();
        this.reserved = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.scmSiteAlsoStopped = Codegen.empty();
        this.serverFarmId = Codegen.empty();
        this.siteConfig = Codegen.empty();
        this.slot = Codegen.empty();
        this.storageAccountRequired = Codegen.empty();
        this.tags = Codegen.empty();
        this.virtualNetworkSubnetId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> clientAffinityEnabled;
        private @Nullable Output<Boolean> clientCertEnabled;
        private @Nullable Output<String> clientCertExclusionPaths;
        private @Nullable Output<ClientCertMode> clientCertMode;
        private @Nullable Output<CloningInfoArgs> cloningInfo;
        private @Nullable Output<Integer> containerSize;
        private @Nullable Output<String> customDomainVerificationId;
        private @Nullable Output<Integer> dailyMemoryTimeQuota;
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<List<HostNameSslStateArgs>> hostNameSslStates;
        private @Nullable Output<Boolean> hostNamesDisabled;
        private @Nullable Output<HostingEnvironmentProfileArgs> hostingEnvironmentProfile;
        private @Nullable Output<Boolean> httpsOnly;
        private @Nullable Output<Boolean> hyperV;
        private @Nullable Output<ManagedServiceIdentityArgs> identity;
        private @Nullable Output<Boolean> isXenon;
        private @Nullable Output<String> keyVaultReferenceIdentity;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private Output<String> name;
        private @Nullable Output<RedundancyMode> redundancyMode;
        private @Nullable Output<Boolean> reserved;
        private Output<String> resourceGroupName;
        private @Nullable Output<Boolean> scmSiteAlsoStopped;
        private @Nullable Output<String> serverFarmId;
        private @Nullable Output<SiteConfigArgs> siteConfig;
        private @Nullable Output<String> slot;
        private @Nullable Output<Boolean> storageAccountRequired;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> virtualNetworkSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAffinityEnabled = defaults.clientAffinityEnabled;
    	      this.clientCertEnabled = defaults.clientCertEnabled;
    	      this.clientCertExclusionPaths = defaults.clientCertExclusionPaths;
    	      this.clientCertMode = defaults.clientCertMode;
    	      this.cloningInfo = defaults.cloningInfo;
    	      this.containerSize = defaults.containerSize;
    	      this.customDomainVerificationId = defaults.customDomainVerificationId;
    	      this.dailyMemoryTimeQuota = defaults.dailyMemoryTimeQuota;
    	      this.enabled = defaults.enabled;
    	      this.hostNameSslStates = defaults.hostNameSslStates;
    	      this.hostNamesDisabled = defaults.hostNamesDisabled;
    	      this.hostingEnvironmentProfile = defaults.hostingEnvironmentProfile;
    	      this.httpsOnly = defaults.httpsOnly;
    	      this.hyperV = defaults.hyperV;
    	      this.identity = defaults.identity;
    	      this.isXenon = defaults.isXenon;
    	      this.keyVaultReferenceIdentity = defaults.keyVaultReferenceIdentity;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.redundancyMode = defaults.redundancyMode;
    	      this.reserved = defaults.reserved;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.scmSiteAlsoStopped = defaults.scmSiteAlsoStopped;
    	      this.serverFarmId = defaults.serverFarmId;
    	      this.siteConfig = defaults.siteConfig;
    	      this.slot = defaults.slot;
    	      this.storageAccountRequired = defaults.storageAccountRequired;
    	      this.tags = defaults.tags;
    	      this.virtualNetworkSubnetId = defaults.virtualNetworkSubnetId;
        }

        public Builder clientAffinityEnabled(@Nullable Output<Boolean> clientAffinityEnabled) {
            this.clientAffinityEnabled = clientAffinityEnabled;
            return this;
        }
        public Builder clientAffinityEnabled(@Nullable Boolean clientAffinityEnabled) {
            this.clientAffinityEnabled = Codegen.ofNullable(clientAffinityEnabled);
            return this;
        }
        public Builder clientCertEnabled(@Nullable Output<Boolean> clientCertEnabled) {
            this.clientCertEnabled = clientCertEnabled;
            return this;
        }
        public Builder clientCertEnabled(@Nullable Boolean clientCertEnabled) {
            this.clientCertEnabled = Codegen.ofNullable(clientCertEnabled);
            return this;
        }
        public Builder clientCertExclusionPaths(@Nullable Output<String> clientCertExclusionPaths) {
            this.clientCertExclusionPaths = clientCertExclusionPaths;
            return this;
        }
        public Builder clientCertExclusionPaths(@Nullable String clientCertExclusionPaths) {
            this.clientCertExclusionPaths = Codegen.ofNullable(clientCertExclusionPaths);
            return this;
        }
        public Builder clientCertMode(@Nullable Output<ClientCertMode> clientCertMode) {
            this.clientCertMode = clientCertMode;
            return this;
        }
        public Builder clientCertMode(@Nullable ClientCertMode clientCertMode) {
            this.clientCertMode = Codegen.ofNullable(clientCertMode);
            return this;
        }
        public Builder cloningInfo(@Nullable Output<CloningInfoArgs> cloningInfo) {
            this.cloningInfo = cloningInfo;
            return this;
        }
        public Builder cloningInfo(@Nullable CloningInfoArgs cloningInfo) {
            this.cloningInfo = Codegen.ofNullable(cloningInfo);
            return this;
        }
        public Builder containerSize(@Nullable Output<Integer> containerSize) {
            this.containerSize = containerSize;
            return this;
        }
        public Builder containerSize(@Nullable Integer containerSize) {
            this.containerSize = Codegen.ofNullable(containerSize);
            return this;
        }
        public Builder customDomainVerificationId(@Nullable Output<String> customDomainVerificationId) {
            this.customDomainVerificationId = customDomainVerificationId;
            return this;
        }
        public Builder customDomainVerificationId(@Nullable String customDomainVerificationId) {
            this.customDomainVerificationId = Codegen.ofNullable(customDomainVerificationId);
            return this;
        }
        public Builder dailyMemoryTimeQuota(@Nullable Output<Integer> dailyMemoryTimeQuota) {
            this.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
            return this;
        }
        public Builder dailyMemoryTimeQuota(@Nullable Integer dailyMemoryTimeQuota) {
            this.dailyMemoryTimeQuota = Codegen.ofNullable(dailyMemoryTimeQuota);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }
        public Builder hostNameSslStates(@Nullable Output<List<HostNameSslStateArgs>> hostNameSslStates) {
            this.hostNameSslStates = hostNameSslStates;
            return this;
        }
        public Builder hostNameSslStates(@Nullable List<HostNameSslStateArgs> hostNameSslStates) {
            this.hostNameSslStates = Codegen.ofNullable(hostNameSslStates);
            return this;
        }
        public Builder hostNameSslStates(HostNameSslStateArgs... hostNameSslStates) {
            return hostNameSslStates(List.of(hostNameSslStates));
        }
        public Builder hostNamesDisabled(@Nullable Output<Boolean> hostNamesDisabled) {
            this.hostNamesDisabled = hostNamesDisabled;
            return this;
        }
        public Builder hostNamesDisabled(@Nullable Boolean hostNamesDisabled) {
            this.hostNamesDisabled = Codegen.ofNullable(hostNamesDisabled);
            return this;
        }
        public Builder hostingEnvironmentProfile(@Nullable Output<HostingEnvironmentProfileArgs> hostingEnvironmentProfile) {
            this.hostingEnvironmentProfile = hostingEnvironmentProfile;
            return this;
        }
        public Builder hostingEnvironmentProfile(@Nullable HostingEnvironmentProfileArgs hostingEnvironmentProfile) {
            this.hostingEnvironmentProfile = Codegen.ofNullable(hostingEnvironmentProfile);
            return this;
        }
        public Builder httpsOnly(@Nullable Output<Boolean> httpsOnly) {
            this.httpsOnly = httpsOnly;
            return this;
        }
        public Builder httpsOnly(@Nullable Boolean httpsOnly) {
            this.httpsOnly = Codegen.ofNullable(httpsOnly);
            return this;
        }
        public Builder hyperV(@Nullable Output<Boolean> hyperV) {
            this.hyperV = hyperV;
            return this;
        }
        public Builder hyperV(@Nullable Boolean hyperV) {
            this.hyperV = Codegen.ofNullable(hyperV);
            return this;
        }
        public Builder identity(@Nullable Output<ManagedServiceIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }
        public Builder identity(@Nullable ManagedServiceIdentityArgs identity) {
            this.identity = Codegen.ofNullable(identity);
            return this;
        }
        public Builder isXenon(@Nullable Output<Boolean> isXenon) {
            this.isXenon = isXenon;
            return this;
        }
        public Builder isXenon(@Nullable Boolean isXenon) {
            this.isXenon = Codegen.ofNullable(isXenon);
            return this;
        }
        public Builder keyVaultReferenceIdentity(@Nullable Output<String> keyVaultReferenceIdentity) {
            this.keyVaultReferenceIdentity = keyVaultReferenceIdentity;
            return this;
        }
        public Builder keyVaultReferenceIdentity(@Nullable String keyVaultReferenceIdentity) {
            this.keyVaultReferenceIdentity = Codegen.ofNullable(keyVaultReferenceIdentity);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder redundancyMode(@Nullable Output<RedundancyMode> redundancyMode) {
            this.redundancyMode = redundancyMode;
            return this;
        }
        public Builder redundancyMode(@Nullable RedundancyMode redundancyMode) {
            this.redundancyMode = Codegen.ofNullable(redundancyMode);
            return this;
        }
        public Builder reserved(@Nullable Output<Boolean> reserved) {
            this.reserved = reserved;
            return this;
        }
        public Builder reserved(@Nullable Boolean reserved) {
            this.reserved = Codegen.ofNullable(reserved);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder scmSiteAlsoStopped(@Nullable Output<Boolean> scmSiteAlsoStopped) {
            this.scmSiteAlsoStopped = scmSiteAlsoStopped;
            return this;
        }
        public Builder scmSiteAlsoStopped(@Nullable Boolean scmSiteAlsoStopped) {
            this.scmSiteAlsoStopped = Codegen.ofNullable(scmSiteAlsoStopped);
            return this;
        }
        public Builder serverFarmId(@Nullable Output<String> serverFarmId) {
            this.serverFarmId = serverFarmId;
            return this;
        }
        public Builder serverFarmId(@Nullable String serverFarmId) {
            this.serverFarmId = Codegen.ofNullable(serverFarmId);
            return this;
        }
        public Builder siteConfig(@Nullable Output<SiteConfigArgs> siteConfig) {
            this.siteConfig = siteConfig;
            return this;
        }
        public Builder siteConfig(@Nullable SiteConfigArgs siteConfig) {
            this.siteConfig = Codegen.ofNullable(siteConfig);
            return this;
        }
        public Builder slot(@Nullable Output<String> slot) {
            this.slot = slot;
            return this;
        }
        public Builder slot(@Nullable String slot) {
            this.slot = Codegen.ofNullable(slot);
            return this;
        }
        public Builder storageAccountRequired(@Nullable Output<Boolean> storageAccountRequired) {
            this.storageAccountRequired = storageAccountRequired;
            return this;
        }
        public Builder storageAccountRequired(@Nullable Boolean storageAccountRequired) {
            this.storageAccountRequired = Codegen.ofNullable(storageAccountRequired);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder virtualNetworkSubnetId(@Nullable Output<String> virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = virtualNetworkSubnetId;
            return this;
        }
        public Builder virtualNetworkSubnetId(@Nullable String virtualNetworkSubnetId) {
            this.virtualNetworkSubnetId = Codegen.ofNullable(virtualNetworkSubnetId);
            return this;
        }        public WebAppSlotArgs build() {
            return new WebAppSlotArgs(clientAffinityEnabled, clientCertEnabled, clientCertExclusionPaths, clientCertMode, cloningInfo, containerSize, customDomainVerificationId, dailyMemoryTimeQuota, enabled, hostNameSslStates, hostNamesDisabled, hostingEnvironmentProfile, httpsOnly, hyperV, identity, isXenon, keyVaultReferenceIdentity, kind, location, name, redundancyMode, reserved, resourceGroupName, scmSiteAlsoStopped, serverFarmId, siteConfig, slot, storageAccountRequired, tags, virtualNetworkSubnetId);
        }
    }
}
