// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.SecurityRuleAccess;
import io.pulumi.azurenative.network.enums.SecurityRuleDirection;
import io.pulumi.azurenative.network.enums.SecurityRuleProtocol;
import io.pulumi.azurenative.network.inputs.ApplicationSecurityGroupArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Network security rule.
 * 
 */
public final class SecurityRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityRuleArgs Empty = new SecurityRuleArgs();

    /**
     * The network traffic is allowed or denied.
     * 
     */
    @InputImport(name="access", required=true)
    private final Input<Either<String,SecurityRuleAccess>> access;

    public Input<Either<String,SecurityRuleAccess>> getAccess() {
        return this.access;
    }

    /**
     * A description for this rule. Restricted to 140 chars.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The destination address prefix. CIDR or destination IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used.
     * 
     */
    @InputImport(name="destinationAddressPrefix")
    private final @Nullable Input<String> destinationAddressPrefix;

    public Input<String> getDestinationAddressPrefix() {
        return this.destinationAddressPrefix == null ? Input.empty() : this.destinationAddressPrefix;
    }

    /**
     * The destination address prefixes. CIDR or destination IP ranges.
     * 
     */
    @InputImport(name="destinationAddressPrefixes")
    private final @Nullable Input<List<String>> destinationAddressPrefixes;

    public Input<List<String>> getDestinationAddressPrefixes() {
        return this.destinationAddressPrefixes == null ? Input.empty() : this.destinationAddressPrefixes;
    }

    /**
     * The application security group specified as destination.
     * 
     */
    @InputImport(name="destinationApplicationSecurityGroups")
    private final @Nullable Input<List<ApplicationSecurityGroupArgs>> destinationApplicationSecurityGroups;

    public Input<List<ApplicationSecurityGroupArgs>> getDestinationApplicationSecurityGroups() {
        return this.destinationApplicationSecurityGroups == null ? Input.empty() : this.destinationApplicationSecurityGroups;
    }

    /**
     * The destination port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
     */
    @InputImport(name="destinationPortRange")
    private final @Nullable Input<String> destinationPortRange;

    public Input<String> getDestinationPortRange() {
        return this.destinationPortRange == null ? Input.empty() : this.destinationPortRange;
    }

    /**
     * The destination port ranges.
     * 
     */
    @InputImport(name="destinationPortRanges")
    private final @Nullable Input<List<String>> destinationPortRanges;

    public Input<List<String>> getDestinationPortRanges() {
        return this.destinationPortRanges == null ? Input.empty() : this.destinationPortRanges;
    }

    /**
     * The direction of the rule. The direction specifies if rule will be evaluated on incoming or outgoing traffic.
     * 
     */
    @InputImport(name="direction", required=true)
    private final Input<Either<String,SecurityRuleDirection>> direction;

    public Input<Either<String,SecurityRuleDirection>> getDirection() {
        return this.direction;
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
     * The name of the resource that is unique within a resource group. This name can be used to access the resource.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The priority of the rule. The value can be between 100 and 4096. The priority number must be unique for each rule in the collection. The lower the priority number, the higher the priority of the rule.
     * 
     */
    @InputImport(name="priority")
    private final @Nullable Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority == null ? Input.empty() : this.priority;
    }

    /**
     * Network protocol this rule applies to.
     * 
     */
    @InputImport(name="protocol", required=true)
    private final Input<Either<String,SecurityRuleProtocol>> protocol;

    public Input<Either<String,SecurityRuleProtocol>> getProtocol() {
        return this.protocol;
    }

    /**
     * The CIDR or source IP range. Asterisk '*' can also be used to match all source IPs. Default tags such as 'VirtualNetwork', 'AzureLoadBalancer' and 'Internet' can also be used. If this is an ingress rule, specifies where network traffic originates from.
     * 
     */
    @InputImport(name="sourceAddressPrefix")
    private final @Nullable Input<String> sourceAddressPrefix;

    public Input<String> getSourceAddressPrefix() {
        return this.sourceAddressPrefix == null ? Input.empty() : this.sourceAddressPrefix;
    }

    /**
     * The CIDR or source IP ranges.
     * 
     */
    @InputImport(name="sourceAddressPrefixes")
    private final @Nullable Input<List<String>> sourceAddressPrefixes;

    public Input<List<String>> getSourceAddressPrefixes() {
        return this.sourceAddressPrefixes == null ? Input.empty() : this.sourceAddressPrefixes;
    }

    /**
     * The application security group specified as source.
     * 
     */
    @InputImport(name="sourceApplicationSecurityGroups")
    private final @Nullable Input<List<ApplicationSecurityGroupArgs>> sourceApplicationSecurityGroups;

    public Input<List<ApplicationSecurityGroupArgs>> getSourceApplicationSecurityGroups() {
        return this.sourceApplicationSecurityGroups == null ? Input.empty() : this.sourceApplicationSecurityGroups;
    }

    /**
     * The source port or range. Integer or range between 0 and 65535. Asterisk '*' can also be used to match all ports.
     * 
     */
    @InputImport(name="sourcePortRange")
    private final @Nullable Input<String> sourcePortRange;

    public Input<String> getSourcePortRange() {
        return this.sourcePortRange == null ? Input.empty() : this.sourcePortRange;
    }

    /**
     * The source port ranges.
     * 
     */
    @InputImport(name="sourcePortRanges")
    private final @Nullable Input<List<String>> sourcePortRanges;

    public Input<List<String>> getSourcePortRanges() {
        return this.sourcePortRanges == null ? Input.empty() : this.sourcePortRanges;
    }

    /**
     * The type of the resource.
     * 
     */
    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public SecurityRuleArgs(
        Input<Either<String,SecurityRuleAccess>> access,
        @Nullable Input<String> description,
        @Nullable Input<String> destinationAddressPrefix,
        @Nullable Input<List<String>> destinationAddressPrefixes,
        @Nullable Input<List<ApplicationSecurityGroupArgs>> destinationApplicationSecurityGroups,
        @Nullable Input<String> destinationPortRange,
        @Nullable Input<List<String>> destinationPortRanges,
        Input<Either<String,SecurityRuleDirection>> direction,
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<Integer> priority,
        Input<Either<String,SecurityRuleProtocol>> protocol,
        @Nullable Input<String> sourceAddressPrefix,
        @Nullable Input<List<String>> sourceAddressPrefixes,
        @Nullable Input<List<ApplicationSecurityGroupArgs>> sourceApplicationSecurityGroups,
        @Nullable Input<String> sourcePortRange,
        @Nullable Input<List<String>> sourcePortRanges,
        @Nullable Input<String> type) {
        this.access = Objects.requireNonNull(access, "expected parameter 'access' to be non-null");
        this.description = description;
        this.destinationAddressPrefix = destinationAddressPrefix;
        this.destinationAddressPrefixes = destinationAddressPrefixes;
        this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
        this.destinationPortRange = destinationPortRange;
        this.destinationPortRanges = destinationPortRanges;
        this.direction = Objects.requireNonNull(direction, "expected parameter 'direction' to be non-null");
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.protocol = Objects.requireNonNull(protocol, "expected parameter 'protocol' to be non-null");
        this.sourceAddressPrefix = sourceAddressPrefix;
        this.sourceAddressPrefixes = sourceAddressPrefixes;
        this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
        this.sourcePortRange = sourcePortRange;
        this.sourcePortRanges = sourcePortRanges;
        this.type = type;
    }

    private SecurityRuleArgs() {
        this.access = Input.empty();
        this.description = Input.empty();
        this.destinationAddressPrefix = Input.empty();
        this.destinationAddressPrefixes = Input.empty();
        this.destinationApplicationSecurityGroups = Input.empty();
        this.destinationPortRange = Input.empty();
        this.destinationPortRanges = Input.empty();
        this.direction = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
        this.priority = Input.empty();
        this.protocol = Input.empty();
        this.sourceAddressPrefix = Input.empty();
        this.sourceAddressPrefixes = Input.empty();
        this.sourceApplicationSecurityGroups = Input.empty();
        this.sourcePortRange = Input.empty();
        this.sourcePortRanges = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,SecurityRuleAccess>> access;
        private @Nullable Input<String> description;
        private @Nullable Input<String> destinationAddressPrefix;
        private @Nullable Input<List<String>> destinationAddressPrefixes;
        private @Nullable Input<List<ApplicationSecurityGroupArgs>> destinationApplicationSecurityGroups;
        private @Nullable Input<String> destinationPortRange;
        private @Nullable Input<List<String>> destinationPortRanges;
        private Input<Either<String,SecurityRuleDirection>> direction;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> priority;
        private Input<Either<String,SecurityRuleProtocol>> protocol;
        private @Nullable Input<String> sourceAddressPrefix;
        private @Nullable Input<List<String>> sourceAddressPrefixes;
        private @Nullable Input<List<ApplicationSecurityGroupArgs>> sourceApplicationSecurityGroups;
        private @Nullable Input<String> sourcePortRange;
        private @Nullable Input<List<String>> sourcePortRanges;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.access = defaults.access;
    	      this.description = defaults.description;
    	      this.destinationAddressPrefix = defaults.destinationAddressPrefix;
    	      this.destinationAddressPrefixes = defaults.destinationAddressPrefixes;
    	      this.destinationApplicationSecurityGroups = defaults.destinationApplicationSecurityGroups;
    	      this.destinationPortRange = defaults.destinationPortRange;
    	      this.destinationPortRanges = defaults.destinationPortRanges;
    	      this.direction = defaults.direction;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.priority = defaults.priority;
    	      this.protocol = defaults.protocol;
    	      this.sourceAddressPrefix = defaults.sourceAddressPrefix;
    	      this.sourceAddressPrefixes = defaults.sourceAddressPrefixes;
    	      this.sourceApplicationSecurityGroups = defaults.sourceApplicationSecurityGroups;
    	      this.sourcePortRange = defaults.sourcePortRange;
    	      this.sourcePortRanges = defaults.sourcePortRanges;
    	      this.type = defaults.type;
        }

        public Builder setAccess(Input<Either<String,SecurityRuleAccess>> access) {
            this.access = Objects.requireNonNull(access);
            return this;
        }

        public Builder setAccess(Either<String,SecurityRuleAccess> access) {
            this.access = Input.of(Objects.requireNonNull(access));
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDestinationAddressPrefix(@Nullable Input<String> destinationAddressPrefix) {
            this.destinationAddressPrefix = destinationAddressPrefix;
            return this;
        }

        public Builder setDestinationAddressPrefix(@Nullable String destinationAddressPrefix) {
            this.destinationAddressPrefix = Input.ofNullable(destinationAddressPrefix);
            return this;
        }

        public Builder setDestinationAddressPrefixes(@Nullable Input<List<String>> destinationAddressPrefixes) {
            this.destinationAddressPrefixes = destinationAddressPrefixes;
            return this;
        }

        public Builder setDestinationAddressPrefixes(@Nullable List<String> destinationAddressPrefixes) {
            this.destinationAddressPrefixes = Input.ofNullable(destinationAddressPrefixes);
            return this;
        }

        public Builder setDestinationApplicationSecurityGroups(@Nullable Input<List<ApplicationSecurityGroupArgs>> destinationApplicationSecurityGroups) {
            this.destinationApplicationSecurityGroups = destinationApplicationSecurityGroups;
            return this;
        }

        public Builder setDestinationApplicationSecurityGroups(@Nullable List<ApplicationSecurityGroupArgs> destinationApplicationSecurityGroups) {
            this.destinationApplicationSecurityGroups = Input.ofNullable(destinationApplicationSecurityGroups);
            return this;
        }

        public Builder setDestinationPortRange(@Nullable Input<String> destinationPortRange) {
            this.destinationPortRange = destinationPortRange;
            return this;
        }

        public Builder setDestinationPortRange(@Nullable String destinationPortRange) {
            this.destinationPortRange = Input.ofNullable(destinationPortRange);
            return this;
        }

        public Builder setDestinationPortRanges(@Nullable Input<List<String>> destinationPortRanges) {
            this.destinationPortRanges = destinationPortRanges;
            return this;
        }

        public Builder setDestinationPortRanges(@Nullable List<String> destinationPortRanges) {
            this.destinationPortRanges = Input.ofNullable(destinationPortRanges);
            return this;
        }

        public Builder setDirection(Input<Either<String,SecurityRuleDirection>> direction) {
            this.direction = Objects.requireNonNull(direction);
            return this;
        }

        public Builder setDirection(Either<String,SecurityRuleDirection> direction) {
            this.direction = Input.of(Objects.requireNonNull(direction));
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

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPriority(@Nullable Input<Integer> priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = Input.ofNullable(priority);
            return this;
        }

        public Builder setProtocol(Input<Either<String,SecurityRuleProtocol>> protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }

        public Builder setProtocol(Either<String,SecurityRuleProtocol> protocol) {
            this.protocol = Input.of(Objects.requireNonNull(protocol));
            return this;
        }

        public Builder setSourceAddressPrefix(@Nullable Input<String> sourceAddressPrefix) {
            this.sourceAddressPrefix = sourceAddressPrefix;
            return this;
        }

        public Builder setSourceAddressPrefix(@Nullable String sourceAddressPrefix) {
            this.sourceAddressPrefix = Input.ofNullable(sourceAddressPrefix);
            return this;
        }

        public Builder setSourceAddressPrefixes(@Nullable Input<List<String>> sourceAddressPrefixes) {
            this.sourceAddressPrefixes = sourceAddressPrefixes;
            return this;
        }

        public Builder setSourceAddressPrefixes(@Nullable List<String> sourceAddressPrefixes) {
            this.sourceAddressPrefixes = Input.ofNullable(sourceAddressPrefixes);
            return this;
        }

        public Builder setSourceApplicationSecurityGroups(@Nullable Input<List<ApplicationSecurityGroupArgs>> sourceApplicationSecurityGroups) {
            this.sourceApplicationSecurityGroups = sourceApplicationSecurityGroups;
            return this;
        }

        public Builder setSourceApplicationSecurityGroups(@Nullable List<ApplicationSecurityGroupArgs> sourceApplicationSecurityGroups) {
            this.sourceApplicationSecurityGroups = Input.ofNullable(sourceApplicationSecurityGroups);
            return this;
        }

        public Builder setSourcePortRange(@Nullable Input<String> sourcePortRange) {
            this.sourcePortRange = sourcePortRange;
            return this;
        }

        public Builder setSourcePortRange(@Nullable String sourcePortRange) {
            this.sourcePortRange = Input.ofNullable(sourcePortRange);
            return this;
        }

        public Builder setSourcePortRanges(@Nullable Input<List<String>> sourcePortRanges) {
            this.sourcePortRanges = sourcePortRanges;
            return this;
        }

        public Builder setSourcePortRanges(@Nullable List<String> sourcePortRanges) {
            this.sourcePortRanges = Input.ofNullable(sourcePortRanges);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public SecurityRuleArgs build() {
            return new SecurityRuleArgs(access, description, destinationAddressPrefix, destinationAddressPrefixes, destinationApplicationSecurityGroups, destinationPortRange, destinationPortRanges, direction, id, name, priority, protocol, sourceAddressPrefix, sourceAddressPrefixes, sourceApplicationSecurityGroups, sourcePortRange, sourcePortRanges, type);
        }
    }
}
