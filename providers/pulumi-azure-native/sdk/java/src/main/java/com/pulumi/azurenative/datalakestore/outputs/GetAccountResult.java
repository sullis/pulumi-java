// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datalakestore.outputs;

import com.pulumi.azurenative.datalakestore.outputs.EncryptionConfigResponse;
import com.pulumi.azurenative.datalakestore.outputs.EncryptionIdentityResponse;
import com.pulumi.azurenative.datalakestore.outputs.FirewallRuleResponse;
import com.pulumi.azurenative.datalakestore.outputs.TrustedIdProviderResponse;
import com.pulumi.azurenative.datalakestore.outputs.VirtualNetworkRuleResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetAccountResult {
    /**
     * @return The unique identifier associated with this Data Lake Store account.
     * 
     */
    private final String accountId;
    /**
     * @return The account creation time.
     * 
     */
    private final String creationTime;
    /**
     * @return The commitment tier in use for the current month.
     * 
     */
    private final String currentTier;
    /**
     * @return The default owner group for all new folders and files created in the Data Lake Store account.
     * 
     */
    private final String defaultGroup;
    /**
     * @return The Key Vault encryption configuration.
     * 
     */
    private final EncryptionConfigResponse encryptionConfig;
    /**
     * @return The current state of encryption provisioning for this Data Lake Store account.
     * 
     */
    private final String encryptionProvisioningState;
    /**
     * @return The current state of encryption for this Data Lake Store account.
     * 
     */
    private final String encryptionState;
    /**
     * @return The full CName endpoint for this account.
     * 
     */
    private final String endpoint;
    /**
     * @return The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced.
     * 
     */
    private final String firewallAllowAzureIps;
    /**
     * @return The list of firewall rules associated with this Data Lake Store account.
     * 
     */
    private final List<FirewallRuleResponse> firewallRules;
    /**
     * @return The current state of the IP address firewall for this Data Lake Store account.
     * 
     */
    private final String firewallState;
    /**
     * @return The resource identifier.
     * 
     */
    private final String id;
    /**
     * @return The Key Vault encryption identity, if any.
     * 
     */
    private final EncryptionIdentityResponse identity;
    /**
     * @return The account last modified time.
     * 
     */
    private final String lastModifiedTime;
    /**
     * @return The resource location.
     * 
     */
    private final String location;
    /**
     * @return The resource name.
     * 
     */
    private final String name;
    /**
     * @return The commitment tier to use for next month.
     * 
     */
    private final String newTier;
    /**
     * @return The provisioning status of the Data Lake Store account.
     * 
     */
    private final String provisioningState;
    /**
     * @return The state of the Data Lake Store account.
     * 
     */
    private final String state;
    /**
     * @return The resource tags.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return The current state of the trusted identity provider feature for this Data Lake Store account.
     * 
     */
    private final String trustedIdProviderState;
    /**
     * @return The list of trusted identity providers associated with this Data Lake Store account.
     * 
     */
    private final List<TrustedIdProviderResponse> trustedIdProviders;
    /**
     * @return The resource type.
     * 
     */
    private final String type;
    /**
     * @return The list of virtual network rules associated with this Data Lake Store account.
     * 
     */
    private final List<VirtualNetworkRuleResponse> virtualNetworkRules;

    @CustomType.Constructor
    private GetAccountResult(
        @CustomType.Parameter("accountId") String accountId,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("currentTier") String currentTier,
        @CustomType.Parameter("defaultGroup") String defaultGroup,
        @CustomType.Parameter("encryptionConfig") EncryptionConfigResponse encryptionConfig,
        @CustomType.Parameter("encryptionProvisioningState") String encryptionProvisioningState,
        @CustomType.Parameter("encryptionState") String encryptionState,
        @CustomType.Parameter("endpoint") String endpoint,
        @CustomType.Parameter("firewallAllowAzureIps") String firewallAllowAzureIps,
        @CustomType.Parameter("firewallRules") List<FirewallRuleResponse> firewallRules,
        @CustomType.Parameter("firewallState") String firewallState,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identity") EncryptionIdentityResponse identity,
        @CustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("newTier") String newTier,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("trustedIdProviderState") String trustedIdProviderState,
        @CustomType.Parameter("trustedIdProviders") List<TrustedIdProviderResponse> trustedIdProviders,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("virtualNetworkRules") List<VirtualNetworkRuleResponse> virtualNetworkRules) {
        this.accountId = accountId;
        this.creationTime = creationTime;
        this.currentTier = currentTier;
        this.defaultGroup = defaultGroup;
        this.encryptionConfig = encryptionConfig;
        this.encryptionProvisioningState = encryptionProvisioningState;
        this.encryptionState = encryptionState;
        this.endpoint = endpoint;
        this.firewallAllowAzureIps = firewallAllowAzureIps;
        this.firewallRules = firewallRules;
        this.firewallState = firewallState;
        this.id = id;
        this.identity = identity;
        this.lastModifiedTime = lastModifiedTime;
        this.location = location;
        this.name = name;
        this.newTier = newTier;
        this.provisioningState = provisioningState;
        this.state = state;
        this.tags = tags;
        this.trustedIdProviderState = trustedIdProviderState;
        this.trustedIdProviders = trustedIdProviders;
        this.type = type;
        this.virtualNetworkRules = virtualNetworkRules;
    }

    /**
     * @return The unique identifier associated with this Data Lake Store account.
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    /**
     * @return The account creation time.
     * 
     */
    public String creationTime() {
        return this.creationTime;
    }
    /**
     * @return The commitment tier in use for the current month.
     * 
     */
    public String currentTier() {
        return this.currentTier;
    }
    /**
     * @return The default owner group for all new folders and files created in the Data Lake Store account.
     * 
     */
    public String defaultGroup() {
        return this.defaultGroup;
    }
    /**
     * @return The Key Vault encryption configuration.
     * 
     */
    public EncryptionConfigResponse encryptionConfig() {
        return this.encryptionConfig;
    }
    /**
     * @return The current state of encryption provisioning for this Data Lake Store account.
     * 
     */
    public String encryptionProvisioningState() {
        return this.encryptionProvisioningState;
    }
    /**
     * @return The current state of encryption for this Data Lake Store account.
     * 
     */
    public String encryptionState() {
        return this.encryptionState;
    }
    /**
     * @return The full CName endpoint for this account.
     * 
     */
    public String endpoint() {
        return this.endpoint;
    }
    /**
     * @return The current state of allowing or disallowing IPs originating within Azure through the firewall. If the firewall is disabled, this is not enforced.
     * 
     */
    public String firewallAllowAzureIps() {
        return this.firewallAllowAzureIps;
    }
    /**
     * @return The list of firewall rules associated with this Data Lake Store account.
     * 
     */
    public List<FirewallRuleResponse> firewallRules() {
        return this.firewallRules;
    }
    /**
     * @return The current state of the IP address firewall for this Data Lake Store account.
     * 
     */
    public String firewallState() {
        return this.firewallState;
    }
    /**
     * @return The resource identifier.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The Key Vault encryption identity, if any.
     * 
     */
    public EncryptionIdentityResponse identity() {
        return this.identity;
    }
    /**
     * @return The account last modified time.
     * 
     */
    public String lastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * @return The resource location.
     * 
     */
    public String location() {
        return this.location;
    }
    /**
     * @return The resource name.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return The commitment tier to use for next month.
     * 
     */
    public String newTier() {
        return this.newTier;
    }
    /**
     * @return The provisioning status of the Data Lake Store account.
     * 
     */
    public String provisioningState() {
        return this.provisioningState;
    }
    /**
     * @return The state of the Data Lake Store account.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The resource tags.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return The current state of the trusted identity provider feature for this Data Lake Store account.
     * 
     */
    public String trustedIdProviderState() {
        return this.trustedIdProviderState;
    }
    /**
     * @return The list of trusted identity providers associated with this Data Lake Store account.
     * 
     */
    public List<TrustedIdProviderResponse> trustedIdProviders() {
        return this.trustedIdProviders;
    }
    /**
     * @return The resource type.
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return The list of virtual network rules associated with this Data Lake Store account.
     * 
     */
    public List<VirtualNetworkRuleResponse> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAccountResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountId;
        private String creationTime;
        private String currentTier;
        private String defaultGroup;
        private EncryptionConfigResponse encryptionConfig;
        private String encryptionProvisioningState;
        private String encryptionState;
        private String endpoint;
        private String firewallAllowAzureIps;
        private List<FirewallRuleResponse> firewallRules;
        private String firewallState;
        private String id;
        private EncryptionIdentityResponse identity;
        private String lastModifiedTime;
        private String location;
        private String name;
        private String newTier;
        private String provisioningState;
        private String state;
        private Map<String,String> tags;
        private String trustedIdProviderState;
        private List<TrustedIdProviderResponse> trustedIdProviders;
        private String type;
        private List<VirtualNetworkRuleResponse> virtualNetworkRules;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.creationTime = defaults.creationTime;
    	      this.currentTier = defaults.currentTier;
    	      this.defaultGroup = defaults.defaultGroup;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.encryptionProvisioningState = defaults.encryptionProvisioningState;
    	      this.encryptionState = defaults.encryptionState;
    	      this.endpoint = defaults.endpoint;
    	      this.firewallAllowAzureIps = defaults.firewallAllowAzureIps;
    	      this.firewallRules = defaults.firewallRules;
    	      this.firewallState = defaults.firewallState;
    	      this.id = defaults.id;
    	      this.identity = defaults.identity;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.newTier = defaults.newTier;
    	      this.provisioningState = defaults.provisioningState;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.trustedIdProviderState = defaults.trustedIdProviderState;
    	      this.trustedIdProviders = defaults.trustedIdProviders;
    	      this.type = defaults.type;
    	      this.virtualNetworkRules = defaults.virtualNetworkRules;
        }

        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder currentTier(String currentTier) {
            this.currentTier = Objects.requireNonNull(currentTier);
            return this;
        }
        public Builder defaultGroup(String defaultGroup) {
            this.defaultGroup = Objects.requireNonNull(defaultGroup);
            return this;
        }
        public Builder encryptionConfig(EncryptionConfigResponse encryptionConfig) {
            this.encryptionConfig = Objects.requireNonNull(encryptionConfig);
            return this;
        }
        public Builder encryptionProvisioningState(String encryptionProvisioningState) {
            this.encryptionProvisioningState = Objects.requireNonNull(encryptionProvisioningState);
            return this;
        }
        public Builder encryptionState(String encryptionState) {
            this.encryptionState = Objects.requireNonNull(encryptionState);
            return this;
        }
        public Builder endpoint(String endpoint) {
            this.endpoint = Objects.requireNonNull(endpoint);
            return this;
        }
        public Builder firewallAllowAzureIps(String firewallAllowAzureIps) {
            this.firewallAllowAzureIps = Objects.requireNonNull(firewallAllowAzureIps);
            return this;
        }
        public Builder firewallRules(List<FirewallRuleResponse> firewallRules) {
            this.firewallRules = Objects.requireNonNull(firewallRules);
            return this;
        }
        public Builder firewallRules(FirewallRuleResponse... firewallRules) {
            return firewallRules(List.of(firewallRules));
        }
        public Builder firewallState(String firewallState) {
            this.firewallState = Objects.requireNonNull(firewallState);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identity(EncryptionIdentityResponse identity) {
            this.identity = Objects.requireNonNull(identity);
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder newTier(String newTier) {
            this.newTier = Objects.requireNonNull(newTier);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder trustedIdProviderState(String trustedIdProviderState) {
            this.trustedIdProviderState = Objects.requireNonNull(trustedIdProviderState);
            return this;
        }
        public Builder trustedIdProviders(List<TrustedIdProviderResponse> trustedIdProviders) {
            this.trustedIdProviders = Objects.requireNonNull(trustedIdProviders);
            return this;
        }
        public Builder trustedIdProviders(TrustedIdProviderResponse... trustedIdProviders) {
            return trustedIdProviders(List.of(trustedIdProviders));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder virtualNetworkRules(List<VirtualNetworkRuleResponse> virtualNetworkRules) {
            this.virtualNetworkRules = Objects.requireNonNull(virtualNetworkRules);
            return this;
        }
        public Builder virtualNetworkRules(VirtualNetworkRuleResponse... virtualNetworkRules) {
            return virtualNetworkRules(List.of(virtualNetworkRules));
        }        public GetAccountResult build() {
            return new GetAccountResult(accountId, creationTime, currentTier, defaultGroup, encryptionConfig, encryptionProvisioningState, encryptionState, endpoint, firewallAllowAzureIps, firewallRules, firewallState, id, identity, lastModifiedTime, location, name, newTier, provisioningState, state, tags, trustedIdProviderState, trustedIdProviders, type, virtualNetworkRules);
        }
    }
}
