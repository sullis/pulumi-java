// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network;

import io.pulumi.azurenative.network.enums.AzureFirewallThreatIntelMode;
import io.pulumi.azurenative.network.inputs.AzureFirewallApplicationRuleCollectionArgs;
import io.pulumi.azurenative.network.inputs.AzureFirewallIPConfigurationArgs;
import io.pulumi.azurenative.network.inputs.AzureFirewallNatRuleCollectionArgs;
import io.pulumi.azurenative.network.inputs.AzureFirewallNetworkRuleCollectionArgs;
import io.pulumi.azurenative.network.inputs.AzureFirewallSkuArgs;
import io.pulumi.azurenative.network.inputs.HubIPAddressesArgs;
import io.pulumi.azurenative.network.inputs.SubResourceArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureFirewallArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureFirewallArgs Empty = new AzureFirewallArgs();

    /**
     * The additional properties used to further config this azure firewall.
     * 
     */
    @InputImport(name="additionalProperties")
    private final @Nullable Input<Map<String,String>> additionalProperties;

    public Input<Map<String,String>> getAdditionalProperties() {
        return this.additionalProperties == null ? Input.empty() : this.additionalProperties;
    }

    /**
     * Collection of application rule collections used by Azure Firewall.
     * 
     */
    @InputImport(name="applicationRuleCollections")
    private final @Nullable Input<List<AzureFirewallApplicationRuleCollectionArgs>> applicationRuleCollections;

    public Input<List<AzureFirewallApplicationRuleCollectionArgs>> getApplicationRuleCollections() {
        return this.applicationRuleCollections == null ? Input.empty() : this.applicationRuleCollections;
    }

    /**
     * The name of the Azure Firewall.
     * 
     */
    @InputImport(name="azureFirewallName")
    private final @Nullable Input<String> azureFirewallName;

    public Input<String> getAzureFirewallName() {
        return this.azureFirewallName == null ? Input.empty() : this.azureFirewallName;
    }

    /**
     * The firewallPolicy associated with this azure firewall.
     * 
     */
    @InputImport(name="firewallPolicy")
    private final @Nullable Input<SubResourceArgs> firewallPolicy;

    public Input<SubResourceArgs> getFirewallPolicy() {
        return this.firewallPolicy == null ? Input.empty() : this.firewallPolicy;
    }

    /**
     * IP addresses associated with AzureFirewall.
     * 
     */
    @InputImport(name="hubIPAddresses")
    private final @Nullable Input<HubIPAddressesArgs> hubIPAddresses;

    public Input<HubIPAddressesArgs> getHubIPAddresses() {
        return this.hubIPAddresses == null ? Input.empty() : this.hubIPAddresses;
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
     * IP configuration of the Azure Firewall resource.
     * 
     */
    @InputImport(name="ipConfigurations")
    private final @Nullable Input<List<AzureFirewallIPConfigurationArgs>> ipConfigurations;

    public Input<List<AzureFirewallIPConfigurationArgs>> getIpConfigurations() {
        return this.ipConfigurations == null ? Input.empty() : this.ipConfigurations;
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
     * IP configuration of the Azure Firewall used for management traffic.
     * 
     */
    @InputImport(name="managementIpConfiguration")
    private final @Nullable Input<AzureFirewallIPConfigurationArgs> managementIpConfiguration;

    public Input<AzureFirewallIPConfigurationArgs> getManagementIpConfiguration() {
        return this.managementIpConfiguration == null ? Input.empty() : this.managementIpConfiguration;
    }

    /**
     * Collection of NAT rule collections used by Azure Firewall.
     * 
     */
    @InputImport(name="natRuleCollections")
    private final @Nullable Input<List<AzureFirewallNatRuleCollectionArgs>> natRuleCollections;

    public Input<List<AzureFirewallNatRuleCollectionArgs>> getNatRuleCollections() {
        return this.natRuleCollections == null ? Input.empty() : this.natRuleCollections;
    }

    /**
     * Collection of network rule collections used by Azure Firewall.
     * 
     */
    @InputImport(name="networkRuleCollections")
    private final @Nullable Input<List<AzureFirewallNetworkRuleCollectionArgs>> networkRuleCollections;

    public Input<List<AzureFirewallNetworkRuleCollectionArgs>> getNetworkRuleCollections() {
        return this.networkRuleCollections == null ? Input.empty() : this.networkRuleCollections;
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
     * The Azure Firewall Resource SKU.
     * 
     */
    @InputImport(name="sku")
    private final @Nullable Input<AzureFirewallSkuArgs> sku;

    public Input<AzureFirewallSkuArgs> getSku() {
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
     * The operation mode for Threat Intelligence.
     * 
     */
    @InputImport(name="threatIntelMode")
    private final @Nullable Input<Either<String,AzureFirewallThreatIntelMode>> threatIntelMode;

    public Input<Either<String,AzureFirewallThreatIntelMode>> getThreatIntelMode() {
        return this.threatIntelMode == null ? Input.empty() : this.threatIntelMode;
    }

    /**
     * The virtualHub to which the firewall belongs.
     * 
     */
    @InputImport(name="virtualHub")
    private final @Nullable Input<SubResourceArgs> virtualHub;

    public Input<SubResourceArgs> getVirtualHub() {
        return this.virtualHub == null ? Input.empty() : this.virtualHub;
    }

    /**
     * A list of availability zones denoting where the resource needs to come from.
     * 
     */
    @InputImport(name="zones")
    private final @Nullable Input<List<String>> zones;

    public Input<List<String>> getZones() {
        return this.zones == null ? Input.empty() : this.zones;
    }

    public AzureFirewallArgs(
        @Nullable Input<Map<String,String>> additionalProperties,
        @Nullable Input<List<AzureFirewallApplicationRuleCollectionArgs>> applicationRuleCollections,
        @Nullable Input<String> azureFirewallName,
        @Nullable Input<SubResourceArgs> firewallPolicy,
        @Nullable Input<HubIPAddressesArgs> hubIPAddresses,
        @Nullable Input<String> id,
        @Nullable Input<List<AzureFirewallIPConfigurationArgs>> ipConfigurations,
        @Nullable Input<String> location,
        @Nullable Input<AzureFirewallIPConfigurationArgs> managementIpConfiguration,
        @Nullable Input<List<AzureFirewallNatRuleCollectionArgs>> natRuleCollections,
        @Nullable Input<List<AzureFirewallNetworkRuleCollectionArgs>> networkRuleCollections,
        Input<String> resourceGroupName,
        @Nullable Input<AzureFirewallSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Either<String,AzureFirewallThreatIntelMode>> threatIntelMode,
        @Nullable Input<SubResourceArgs> virtualHub,
        @Nullable Input<List<String>> zones) {
        this.additionalProperties = additionalProperties;
        this.applicationRuleCollections = applicationRuleCollections;
        this.azureFirewallName = azureFirewallName;
        this.firewallPolicy = firewallPolicy;
        this.hubIPAddresses = hubIPAddresses;
        this.id = id;
        this.ipConfigurations = ipConfigurations;
        this.location = location;
        this.managementIpConfiguration = managementIpConfiguration;
        this.natRuleCollections = natRuleCollections;
        this.networkRuleCollections = networkRuleCollections;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.threatIntelMode = threatIntelMode;
        this.virtualHub = virtualHub;
        this.zones = zones;
    }

    private AzureFirewallArgs() {
        this.additionalProperties = Input.empty();
        this.applicationRuleCollections = Input.empty();
        this.azureFirewallName = Input.empty();
        this.firewallPolicy = Input.empty();
        this.hubIPAddresses = Input.empty();
        this.id = Input.empty();
        this.ipConfigurations = Input.empty();
        this.location = Input.empty();
        this.managementIpConfiguration = Input.empty();
        this.natRuleCollections = Input.empty();
        this.networkRuleCollections = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.threatIntelMode = Input.empty();
        this.virtualHub = Input.empty();
        this.zones = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> additionalProperties;
        private @Nullable Input<List<AzureFirewallApplicationRuleCollectionArgs>> applicationRuleCollections;
        private @Nullable Input<String> azureFirewallName;
        private @Nullable Input<SubResourceArgs> firewallPolicy;
        private @Nullable Input<HubIPAddressesArgs> hubIPAddresses;
        private @Nullable Input<String> id;
        private @Nullable Input<List<AzureFirewallIPConfigurationArgs>> ipConfigurations;
        private @Nullable Input<String> location;
        private @Nullable Input<AzureFirewallIPConfigurationArgs> managementIpConfiguration;
        private @Nullable Input<List<AzureFirewallNatRuleCollectionArgs>> natRuleCollections;
        private @Nullable Input<List<AzureFirewallNetworkRuleCollectionArgs>> networkRuleCollections;
        private Input<String> resourceGroupName;
        private @Nullable Input<AzureFirewallSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Either<String,AzureFirewallThreatIntelMode>> threatIntelMode;
        private @Nullable Input<SubResourceArgs> virtualHub;
        private @Nullable Input<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalProperties = defaults.additionalProperties;
    	      this.applicationRuleCollections = defaults.applicationRuleCollections;
    	      this.azureFirewallName = defaults.azureFirewallName;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.hubIPAddresses = defaults.hubIPAddresses;
    	      this.id = defaults.id;
    	      this.ipConfigurations = defaults.ipConfigurations;
    	      this.location = defaults.location;
    	      this.managementIpConfiguration = defaults.managementIpConfiguration;
    	      this.natRuleCollections = defaults.natRuleCollections;
    	      this.networkRuleCollections = defaults.networkRuleCollections;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.threatIntelMode = defaults.threatIntelMode;
    	      this.virtualHub = defaults.virtualHub;
    	      this.zones = defaults.zones;
        }

        public Builder setAdditionalProperties(@Nullable Input<Map<String,String>> additionalProperties) {
            this.additionalProperties = additionalProperties;
            return this;
        }

        public Builder setAdditionalProperties(@Nullable Map<String,String> additionalProperties) {
            this.additionalProperties = Input.ofNullable(additionalProperties);
            return this;
        }

        public Builder setApplicationRuleCollections(@Nullable Input<List<AzureFirewallApplicationRuleCollectionArgs>> applicationRuleCollections) {
            this.applicationRuleCollections = applicationRuleCollections;
            return this;
        }

        public Builder setApplicationRuleCollections(@Nullable List<AzureFirewallApplicationRuleCollectionArgs> applicationRuleCollections) {
            this.applicationRuleCollections = Input.ofNullable(applicationRuleCollections);
            return this;
        }

        public Builder setAzureFirewallName(@Nullable Input<String> azureFirewallName) {
            this.azureFirewallName = azureFirewallName;
            return this;
        }

        public Builder setAzureFirewallName(@Nullable String azureFirewallName) {
            this.azureFirewallName = Input.ofNullable(azureFirewallName);
            return this;
        }

        public Builder setFirewallPolicy(@Nullable Input<SubResourceArgs> firewallPolicy) {
            this.firewallPolicy = firewallPolicy;
            return this;
        }

        public Builder setFirewallPolicy(@Nullable SubResourceArgs firewallPolicy) {
            this.firewallPolicy = Input.ofNullable(firewallPolicy);
            return this;
        }

        public Builder setHubIPAddresses(@Nullable Input<HubIPAddressesArgs> hubIPAddresses) {
            this.hubIPAddresses = hubIPAddresses;
            return this;
        }

        public Builder setHubIPAddresses(@Nullable HubIPAddressesArgs hubIPAddresses) {
            this.hubIPAddresses = Input.ofNullable(hubIPAddresses);
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

        public Builder setIpConfigurations(@Nullable Input<List<AzureFirewallIPConfigurationArgs>> ipConfigurations) {
            this.ipConfigurations = ipConfigurations;
            return this;
        }

        public Builder setIpConfigurations(@Nullable List<AzureFirewallIPConfigurationArgs> ipConfigurations) {
            this.ipConfigurations = Input.ofNullable(ipConfigurations);
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

        public Builder setManagementIpConfiguration(@Nullable Input<AzureFirewallIPConfigurationArgs> managementIpConfiguration) {
            this.managementIpConfiguration = managementIpConfiguration;
            return this;
        }

        public Builder setManagementIpConfiguration(@Nullable AzureFirewallIPConfigurationArgs managementIpConfiguration) {
            this.managementIpConfiguration = Input.ofNullable(managementIpConfiguration);
            return this;
        }

        public Builder setNatRuleCollections(@Nullable Input<List<AzureFirewallNatRuleCollectionArgs>> natRuleCollections) {
            this.natRuleCollections = natRuleCollections;
            return this;
        }

        public Builder setNatRuleCollections(@Nullable List<AzureFirewallNatRuleCollectionArgs> natRuleCollections) {
            this.natRuleCollections = Input.ofNullable(natRuleCollections);
            return this;
        }

        public Builder setNetworkRuleCollections(@Nullable Input<List<AzureFirewallNetworkRuleCollectionArgs>> networkRuleCollections) {
            this.networkRuleCollections = networkRuleCollections;
            return this;
        }

        public Builder setNetworkRuleCollections(@Nullable List<AzureFirewallNetworkRuleCollectionArgs> networkRuleCollections) {
            this.networkRuleCollections = Input.ofNullable(networkRuleCollections);
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

        public Builder setSku(@Nullable Input<AzureFirewallSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable AzureFirewallSkuArgs sku) {
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

        public Builder setThreatIntelMode(@Nullable Input<Either<String,AzureFirewallThreatIntelMode>> threatIntelMode) {
            this.threatIntelMode = threatIntelMode;
            return this;
        }

        public Builder setThreatIntelMode(@Nullable Either<String,AzureFirewallThreatIntelMode> threatIntelMode) {
            this.threatIntelMode = Input.ofNullable(threatIntelMode);
            return this;
        }

        public Builder setVirtualHub(@Nullable Input<SubResourceArgs> virtualHub) {
            this.virtualHub = virtualHub;
            return this;
        }

        public Builder setVirtualHub(@Nullable SubResourceArgs virtualHub) {
            this.virtualHub = Input.ofNullable(virtualHub);
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

        public AzureFirewallArgs build() {
            return new AzureFirewallArgs(additionalProperties, applicationRuleCollections, azureFirewallName, firewallPolicy, hubIPAddresses, id, ipConfigurations, location, managementIpConfiguration, natRuleCollections, networkRuleCollections, resourceGroupName, sku, tags, threatIntelMode, virtualHub, zones);
        }
    }
}
