// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.networkfirewall.inputs;

import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationGetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceGetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortGetArgs;
import io.pulumi.aws.networkfirewall.inputs.RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesGetArgs Empty = new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesGetArgs();

    /**
     * Set of configuration blocks describing the destination ports to inspect for. If not specified, this matches with any destination port. See Destination Port below for details.
     * 
     */
    @InputImport(name="destinationPorts")
      private final @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs>> destinationPorts;

    public Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs>> getDestinationPorts() {
        return this.destinationPorts == null ? Input.empty() : this.destinationPorts;
    }

    /**
     * Set of configuration blocks describing the destination IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any destination address. See Destination below for details.
     * 
     */
    @InputImport(name="destinations")
      private final @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationGetArgs>> destinations;

    public Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationGetArgs>> getDestinations() {
        return this.destinations == null ? Input.empty() : this.destinations;
    }

    /**
     * Set of protocols to inspect for, specified using the protocol's assigned internet protocol number (IANA). If not specified, this matches with any protocol.
     * 
     */
    @InputImport(name="protocols")
      private final @Nullable Input<List<Integer>> protocols;

    public Input<List<Integer>> getProtocols() {
        return this.protocols == null ? Input.empty() : this.protocols;
    }

    /**
     * Set of configuration blocks describing the source ports to inspect for. If not specified, this matches with any source port. See Source Port below for details.
     * 
     */
    @InputImport(name="sourcePorts")
      private final @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortGetArgs>> sourcePorts;

    public Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortGetArgs>> getSourcePorts() {
        return this.sourcePorts == null ? Input.empty() : this.sourcePorts;
    }

    /**
     * Set of configuration blocks describing the source IP address and address ranges to inspect for, in CIDR notation. If not specified, this matches with any source address. See Source below for details.
     * 
     */
    @InputImport(name="sources")
      private final @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceGetArgs>> sources;

    public Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceGetArgs>> getSources() {
        return this.sources == null ? Input.empty() : this.sources;
    }

    /**
     * Set of configuration blocks containing the TCP flags and masks to inspect for. If not specified, this matches with any settings.
     * 
     */
    @InputImport(name="tcpFlags")
      private final @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs>> tcpFlags;

    public Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs>> getTcpFlags() {
        return this.tcpFlags == null ? Input.empty() : this.tcpFlags;
    }

    public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesGetArgs(
        @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs>> destinationPorts,
        @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationGetArgs>> destinations,
        @Nullable Input<List<Integer>> protocols,
        @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortGetArgs>> sourcePorts,
        @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceGetArgs>> sources,
        @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs>> tcpFlags) {
        this.destinationPorts = destinationPorts;
        this.destinations = destinations;
        this.protocols = protocols;
        this.sourcePorts = sourcePorts;
        this.sources = sources;
        this.tcpFlags = tcpFlags;
    }

    private RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesGetArgs() {
        this.destinationPorts = Input.empty();
        this.destinations = Input.empty();
        this.protocols = Input.empty();
        this.sourcePorts = Input.empty();
        this.sources = Input.empty();
        this.tcpFlags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs>> destinationPorts;
        private @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationGetArgs>> destinations;
        private @Nullable Input<List<Integer>> protocols;
        private @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortGetArgs>> sourcePorts;
        private @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceGetArgs>> sources;
        private @Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs>> tcpFlags;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.destinations = defaults.destinations;
    	      this.protocols = defaults.protocols;
    	      this.sourcePorts = defaults.sourcePorts;
    	      this.sources = defaults.sources;
    	      this.tcpFlags = defaults.tcpFlags;
        }

        public Builder setDestinationPorts(@Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs>> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }

        public Builder setDestinationPorts(@Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationPortGetArgs> destinationPorts) {
            this.destinationPorts = Input.ofNullable(destinationPorts);
            return this;
        }

        public Builder setDestinations(@Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationGetArgs>> destinations) {
            this.destinations = destinations;
            return this;
        }

        public Builder setDestinations(@Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesDestinationGetArgs> destinations) {
            this.destinations = Input.ofNullable(destinations);
            return this;
        }

        public Builder setProtocols(@Nullable Input<List<Integer>> protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder setProtocols(@Nullable List<Integer> protocols) {
            this.protocols = Input.ofNullable(protocols);
            return this;
        }

        public Builder setSourcePorts(@Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortGetArgs>> sourcePorts) {
            this.sourcePorts = sourcePorts;
            return this;
        }

        public Builder setSourcePorts(@Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourcePortGetArgs> sourcePorts) {
            this.sourcePorts = Input.ofNullable(sourcePorts);
            return this;
        }

        public Builder setSources(@Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceGetArgs>> sources) {
            this.sources = sources;
            return this;
        }

        public Builder setSources(@Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesSourceGetArgs> sources) {
            this.sources = Input.ofNullable(sources);
            return this;
        }

        public Builder setTcpFlags(@Nullable Input<List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs>> tcpFlags) {
            this.tcpFlags = tcpFlags;
            return this;
        }

        public Builder setTcpFlags(@Nullable List<RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesTcpFlagGetArgs> tcpFlags) {
            this.tcpFlags = Input.ofNullable(tcpFlags);
            return this;
        }
        public RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesGetArgs build() {
            return new RuleGroupRuleGroupRulesSourceStatelessRulesAndCustomActionsStatelessRuleRuleDefinitionMatchAttributesGetArgs(destinationPorts, destinations, protocols, sourcePorts, sources, tcpFlags);
        }
    }
}