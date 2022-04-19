// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Rule condition of type network.
 * 
 */
public final class NetworkRuleConditionResponse extends com.pulumi.resources.InvokeArgs {

    public static final NetworkRuleConditionResponse Empty = new NetworkRuleConditionResponse();

    /**
     * Description of the rule condition.
     * 
     */
    @Import(name="description")
      private final @Nullable String description;

    public Optional<String> description() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    @Import(name="destinationAddresses")
      private final @Nullable List<String> destinationAddresses;

    public List<String> destinationAddresses() {
        return this.destinationAddresses == null ? List.of() : this.destinationAddresses;
    }

    /**
     * List of destination IpGroups for this rule.
     * 
     */
    @Import(name="destinationIpGroups")
      private final @Nullable List<String> destinationIpGroups;

    public List<String> destinationIpGroups() {
        return this.destinationIpGroups == null ? List.of() : this.destinationIpGroups;
    }

    /**
     * List of destination ports.
     * 
     */
    @Import(name="destinationPorts")
      private final @Nullable List<String> destinationPorts;

    public List<String> destinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }

    /**
     * Array of FirewallPolicyRuleConditionNetworkProtocols.
     * 
     */
    @Import(name="ipProtocols")
      private final @Nullable List<String> ipProtocols;

    public List<String> ipProtocols() {
        return this.ipProtocols == null ? List.of() : this.ipProtocols;
    }

    /**
     * Name of the rule condition.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> name() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * Rule Condition Type.
     * Expected value is 'NetworkRuleCondition'.
     * 
     */
    @Import(name="ruleConditionType", required=true)
      private final String ruleConditionType;

    public String ruleConditionType() {
        return this.ruleConditionType;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @Import(name="sourceAddresses")
      private final @Nullable List<String> sourceAddresses;

    public List<String> sourceAddresses() {
        return this.sourceAddresses == null ? List.of() : this.sourceAddresses;
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @Import(name="sourceIpGroups")
      private final @Nullable List<String> sourceIpGroups;

    public List<String> sourceIpGroups() {
        return this.sourceIpGroups == null ? List.of() : this.sourceIpGroups;
    }

    public NetworkRuleConditionResponse(
        @Nullable String description,
        @Nullable List<String> destinationAddresses,
        @Nullable List<String> destinationIpGroups,
        @Nullable List<String> destinationPorts,
        @Nullable List<String> ipProtocols,
        @Nullable String name,
        String ruleConditionType,
        @Nullable List<String> sourceAddresses,
        @Nullable List<String> sourceIpGroups) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.destinationIpGroups = destinationIpGroups;
        this.destinationPorts = destinationPorts;
        this.ipProtocols = ipProtocols;
        this.name = name;
        this.ruleConditionType = Codegen.stringProp("ruleConditionType").arg(ruleConditionType).require();
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
    }

    private NetworkRuleConditionResponse() {
        this.description = null;
        this.destinationAddresses = List.of();
        this.destinationIpGroups = List.of();
        this.destinationPorts = List.of();
        this.ipProtocols = List.of();
        this.name = null;
        this.ruleConditionType = null;
        this.sourceAddresses = List.of();
        this.sourceIpGroups = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkRuleConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable List<String> destinationAddresses;
        private @Nullable List<String> destinationIpGroups;
        private @Nullable List<String> destinationPorts;
        private @Nullable List<String> ipProtocols;
        private @Nullable String name;
        private String ruleConditionType;
        private @Nullable List<String> sourceAddresses;
        private @Nullable List<String> sourceIpGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkRuleConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.destinationIpGroups = defaults.destinationIpGroups;
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.ipProtocols = defaults.ipProtocols;
    	      this.name = defaults.name;
    	      this.ruleConditionType = defaults.ruleConditionType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
        }

        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder destinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }
        public Builder destinationAddresses(String... destinationAddresses) {
            return destinationAddresses(List.of(destinationAddresses));
        }
        public Builder destinationIpGroups(@Nullable List<String> destinationIpGroups) {
            this.destinationIpGroups = destinationIpGroups;
            return this;
        }
        public Builder destinationIpGroups(String... destinationIpGroups) {
            return destinationIpGroups(List.of(destinationIpGroups));
        }
        public Builder destinationPorts(@Nullable List<String> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }
        public Builder destinationPorts(String... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        public Builder ipProtocols(@Nullable List<String> ipProtocols) {
            this.ipProtocols = ipProtocols;
            return this;
        }
        public Builder ipProtocols(String... ipProtocols) {
            return ipProtocols(List.of(ipProtocols));
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder ruleConditionType(String ruleConditionType) {
            this.ruleConditionType = Objects.requireNonNull(ruleConditionType);
            return this;
        }
        public Builder sourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }
        public Builder sourceAddresses(String... sourceAddresses) {
            return sourceAddresses(List.of(sourceAddresses));
        }
        public Builder sourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }
        public Builder sourceIpGroups(String... sourceIpGroups) {
            return sourceIpGroups(List.of(sourceIpGroups));
        }        public NetworkRuleConditionResponse build() {
            return new NetworkRuleConditionResponse(description, destinationAddresses, destinationIpGroups, destinationPorts, ipProtocols, name, ruleConditionType, sourceAddresses, sourceIpGroups);
        }
    }
}
