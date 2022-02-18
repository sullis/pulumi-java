// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class NsgSecurityRuleResponse {
    /**
     * Gets or sets whether network traffic is allowed or denied.
     * Possible values are “Allow” and “Deny”.
     * 
     */
    private final @Nullable String access;
    /**
     * Gets or sets a description for this rule. Restricted to 140 chars.
     * 
     */
    private final @Nullable String description;
    /**
     * Gets or sets destination address prefix. CIDR or source IP range.
     *  A “*” can also be used to match all source IPs. Default tags such
     * as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and ‘Internet’ can also be used.
     * 
     */
    private final @Nullable String destinationAddressPrefix;
    /**
     * Gets or sets Destination Port or Range. Integer or range between
     * 0 and 65535. A “*” can also be used to match all ports.
     * 
     */
    private final @Nullable String destinationPortRange;
    /**
     * Gets or sets the direction of the rule.InBound or Outbound. The
     * direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    private final @Nullable String direction;
    /**
     * Gets or sets the Security rule name.
     * 
     */
    private final @Nullable String name;
    /**
     * Gets or sets the priority of the rule. The value can be between
     * 100 and 4096. The priority number must be unique for each rule in the collection.
     * The lower the priority number, the higher the priority of the rule.
     * 
     */
    private final @Nullable Integer priority;
    /**
     * Gets or sets Network protocol this rule applies to. Can be Tcp, Udp or All(*).
     * 
     */
    private final @Nullable String protocol;
    /**
     * Gets or sets source address prefix. CIDR or source IP range. A
     * “*” can also be used to match all source IPs.  Default tags such as ‘VirtualNetwork’,
     * ‘AzureLoadBalancer’ and ‘Internet’ can also be used. If this is an ingress
     * rule, specifies where network traffic originates from.
     * 
     */
    private final @Nullable String sourceAddressPrefix;
    /**
     * Gets or sets Source Port or Range. Integer or range between 0 and
     * 65535. A “*” can also be used to match all ports.
     * 
     */
    private final @Nullable String sourcePortRange;

    @OutputCustomType.Constructor({"access","description","destinationAddressPrefix","destinationPortRange","direction","name","priority","protocol","sourceAddressPrefix","sourcePortRange"})
    private NsgSecurityRuleResponse(
        @Nullable String access,
        @Nullable String description,
        @Nullable String destinationAddressPrefix,
        @Nullable String destinationPortRange,
        @Nullable String direction,
        @Nullable String name,
        @Nullable Integer priority,
        @Nullable String protocol,
        @Nullable String sourceAddressPrefix,
        @Nullable String sourcePortRange) {
        this.access = access;
        this.description = description;
        this.destinationAddressPrefix = destinationAddressPrefix;
        this.destinationPortRange = destinationPortRange;
        this.direction = direction;
        this.name = name;
        this.priority = priority;
        this.protocol = protocol;
        this.sourceAddressPrefix = sourceAddressPrefix;
        this.sourcePortRange = sourcePortRange;
    }

    /**
     * Gets or sets whether network traffic is allowed or denied.
     * Possible values are “Allow” and “Deny”.
     * 
     */
    public Optional<String> getAccess() {
        return Optional.ofNullable(this.access);
    }
    /**
     * Gets or sets a description for this rule. Restricted to 140 chars.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Gets or sets destination address prefix. CIDR or source IP range.
     *  A “*” can also be used to match all source IPs. Default tags such
     * as ‘VirtualNetwork’, ‘AzureLoadBalancer’ and ‘Internet’ can also be used.
     * 
     */
    public Optional<String> getDestinationAddressPrefix() {
        return Optional.ofNullable(this.destinationAddressPrefix);
    }
    /**
     * Gets or sets Destination Port or Range. Integer or range between
     * 0 and 65535. A “*” can also be used to match all ports.
     * 
     */
    public Optional<String> getDestinationPortRange() {
        return Optional.ofNullable(this.destinationPortRange);
    }
    /**
     * Gets or sets the direction of the rule.InBound or Outbound. The
     * direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    public Optional<String> getDirection() {
        return Optional.ofNullable(this.direction);
    }
    /**
     * Gets or sets the Security rule name.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Gets or sets the priority of the rule. The value can be between
     * 100 and 4096. The priority number must be unique for each rule in the collection.
     * The lower the priority number, the higher the priority of the rule.
     * 
     */
    public Optional<Integer> getPriority() {
        return Optional.ofNullable(this.priority);
    }
    /**
     * Gets or sets Network protocol this rule applies to. Can be Tcp, Udp or All(*).
     * 
     */
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    /**
     * Gets or sets source address prefix. CIDR or source IP range. A
     * “*” can also be used to match all source IPs.  Default tags such as ‘VirtualNetwork’,
     * ‘AzureLoadBalancer’ and ‘Internet’ can also be used. If this is an ingress
     * rule, specifies where network traffic originates from.
     * 
     */
    public Optional<String> getSourceAddressPrefix() {
        return Optional.ofNullable(this.sourceAddressPrefix);
    }
    /**
     * Gets or sets Source Port or Range. Integer or range between 0 and
     * 65535. A “*” can also be used to match all ports.
     * 
     */
    public Optional<String> getSourcePortRange() {
        return Optional.ofNullable(this.sourcePortRange);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NsgSecurityRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String access;
        private @Nullable String description;
        private @Nullable String destinationAddressPrefix;
        private @Nullable String destinationPortRange;
        private @Nullable String direction;
        private @Nullable String name;
        private @Nullable Integer priority;
        private @Nullable String protocol;
        private @Nullable String sourceAddressPrefix;
        private @Nullable String sourcePortRange;

        public Builder() {
    	      // Empty
        }

        public Builder(NsgSecurityRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.description = defaults.description;
    	      this.destinationAddressPrefix = defaults.destinationAddressPrefix;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.direction = defaults.direction;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
    	      this.sourcePortRange = defaults.sourcePortRange;
        }

        public Builder setAccess(@Nullable String access) {
            this.access = access;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDestinationAddressPrefix(@Nullable String destinationAddressPrefix) {
            this.destinationAddressPrefix = destinationAddressPrefix;
            return this;
        }

        public Builder setDestinationPortRange(@Nullable String destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }

        public Builder setDirection(@Nullable String direction) {
            this.direction = direction;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setSourceAddressPrefix(@Nullable String sourceAddressPrefix) {
            this.sourceAddressPrefix = sourceAddressPrefix;
            return this;
        }

        public Builder setSourcePortRange(@Nullable String sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        public NsgSecurityRuleResponse build() {
            return new NsgSecurityRuleResponse(access, description, destinationAddressPrefix, destinationPortRange, direction, name, priority, protocol, sourceAddressPrefix, sourcePortRange);
        }
    }
}
