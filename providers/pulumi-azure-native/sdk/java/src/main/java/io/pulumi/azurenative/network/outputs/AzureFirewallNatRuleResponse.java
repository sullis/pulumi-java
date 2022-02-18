// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureFirewallNatRuleResponse {
    /**
     * Description of the rule.
     * 
     */
    private final @Nullable String description;
    /**
     * List of destination IP addresses for this rule. Supports IP ranges, prefixes, and service tags.
     * 
     */
    private final @Nullable List<String> destinationAddresses;
    /**
     * List of destination ports.
     * 
     */
    private final @Nullable List<String> destinationPorts;
    /**
     * Name of the NAT rule.
     * 
     */
    private final @Nullable String name;
    /**
     * Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     * 
     */
    private final @Nullable List<String> protocols;
    /**
     * List of source IP addresses for this rule.
     * 
     */
    private final @Nullable List<String> sourceAddresses;
    /**
     * List of source IpGroups for this rule.
     * 
     */
    private final @Nullable List<String> sourceIpGroups;
    /**
     * The translated address for this NAT rule.
     * 
     */
    private final @Nullable String translatedAddress;
    /**
     * The translated FQDN for this NAT rule.
     * 
     */
    private final @Nullable String translatedFqdn;
    /**
     * The translated port for this NAT rule.
     * 
     */
    private final @Nullable String translatedPort;

    @OutputCustomType.Constructor({"description","destinationAddresses","destinationPorts","name","protocols","sourceAddresses","sourceIpGroups","translatedAddress","translatedFqdn","translatedPort"})
    private AzureFirewallNatRuleResponse(
        @Nullable String description,
        @Nullable List<String> destinationAddresses,
        @Nullable List<String> destinationPorts,
        @Nullable String name,
        @Nullable List<String> protocols,
        @Nullable List<String> sourceAddresses,
        @Nullable List<String> sourceIpGroups,
        @Nullable String translatedAddress,
        @Nullable String translatedFqdn,
        @Nullable String translatedPort) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationPorts = destinationPorts;
        this.name = name;
        this.protocols = protocols;
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.translatedAddress = translatedAddress;
        this.translatedFqdn = translatedFqdn;
        this.translatedPort = translatedPort;
    }

    /**
     * Description of the rule.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * List of destination IP addresses for this rule. Supports IP ranges, prefixes, and service tags.
     * 
     */
    public List<String> getDestinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }
    /**
     * List of destination ports.
     * 
     */
    public List<String> getDestinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }
    /**
     * Name of the NAT rule.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Array of AzureFirewallNetworkRuleProtocols applicable to this NAT rule.
     * 
     */
    public List<String> getProtocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }
    /**
     * List of source IP addresses for this rule.
     * 
     */
    public List<String> getSourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }
    /**
     * List of source IpGroups for this rule.
     * 
     */
    public List<String> getSourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }
    /**
     * The translated address for this NAT rule.
     * 
     */
    public Optional<String> getTranslatedAddress() {
        return Optional.ofNullable(this.translatedAddress);
    }
    /**
     * The translated FQDN for this NAT rule.
     * 
     */
    public Optional<String> getTranslatedFqdn() {
        return Optional.ofNullable(this.translatedFqdn);
    }
    /**
     * The translated port for this NAT rule.
     * 
     */
    public Optional<String> getTranslatedPort() {
        return Optional.ofNullable(this.translatedPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFirewallNatRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> destinationPorts;
        private @Nullable String name;
        private @Nullable List<String> protocols;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;
        private @Nullable String translatedAddress;
        private @Nullable String translatedFqdn;
        private @Nullable String translatedPort;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFirewallNatRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.translatedAddress = defaults.translatedAddress;
    	      this.translatedFqdn = defaults.translatedFqdn;
    	      this.translatedPort = defaults.translatedPort;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDestinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }

        public Builder setDestinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setProtocols(@Nullable List<String> protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder setSourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }

        public Builder setSourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }

        public Builder setTranslatedAddress(@Nullable String translatedAddress) {
            this.translatedAddress = translatedAddress;
            return this;
        }

        public Builder setTranslatedFqdn(@Nullable String translatedFqdn) {
            this.translatedFqdn = translatedFqdn;
            return this;
        }

        public Builder setTranslatedPort(@Nullable String translatedPort) {
            this.translatedPort = translatedPort;
            return this;
        }

        public AzureFirewallNatRuleResponse build() {
            return new AzureFirewallNatRuleResponse(description, destinationAddresses, destinationPorts, name, protocols, sourceAddresses, sourceIpGroups, translatedAddress, translatedFqdn, translatedPort);
        }
    }
}
