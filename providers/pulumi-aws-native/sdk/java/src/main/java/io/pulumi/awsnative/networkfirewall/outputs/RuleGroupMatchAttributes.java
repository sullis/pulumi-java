// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupAddress;
import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupPortRange;
import io.pulumi.awsnative.networkfirewall.outputs.RuleGroupTCPFlagField;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupMatchAttributes {
    private final @Nullable List<RuleGroupPortRange> destinationPorts;
    private final @Nullable List<RuleGroupAddress> destinations;
    private final @Nullable List<Integer> protocols;
    private final @Nullable List<RuleGroupPortRange> sourcePorts;
    private final @Nullable List<RuleGroupAddress> sources;
    private final @Nullable List<RuleGroupTCPFlagField> tCPFlags;

    @OutputCustomType.Constructor({"destinationPorts","destinations","protocols","sourcePorts","sources","tCPFlags"})
    private RuleGroupMatchAttributes(
        @Nullable List<RuleGroupPortRange> destinationPorts,
        @Nullable List<RuleGroupAddress> destinations,
        @Nullable List<Integer> protocols,
        @Nullable List<RuleGroupPortRange> sourcePorts,
        @Nullable List<RuleGroupAddress> sources,
        @Nullable List<RuleGroupTCPFlagField> tCPFlags) {
        this.destinationPorts = destinationPorts;
        this.destinations = destinations;
        this.protocols = protocols;
        this.sourcePorts = sourcePorts;
        this.sources = sources;
        this.tCPFlags = tCPFlags;
    }

    public List<RuleGroupPortRange> getDestinationPorts() {
        return this.destinationPorts == null ? List.of() : this.destinationPorts;
    }
    public List<RuleGroupAddress> getDestinations() {
        return this.destinations == null ? List.of() : this.destinations;
    }
    public List<Integer> getProtocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }
    public List<RuleGroupPortRange> getSourcePorts() {
        return this.sourcePorts == null ? List.of() : this.sourcePorts;
    }
    public List<RuleGroupAddress> getSources() {
        return this.sources == null ? List.of() : this.sources;
    }
    public List<RuleGroupTCPFlagField> getTCPFlags() {
        return this.tCPFlags == null ? List.of() : this.tCPFlags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupMatchAttributes defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<RuleGroupPortRange> destinationPorts;
        private @Nullable List<RuleGroupAddress> destinations;
        private @Nullable List<Integer> protocols;
        private @Nullable List<RuleGroupPortRange> sourcePorts;
        private @Nullable List<RuleGroupAddress> sources;
        private @Nullable List<RuleGroupTCPFlagField> tCPFlags;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupMatchAttributes defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.destinations = defaults.destinations;
    	      this.protocols = defaults.protocols;
    	      this.sourcePorts = defaults.sourcePorts;
    	      this.sources = defaults.sources;
    	      this.tCPFlags = defaults.tCPFlags;
        }

        public Builder setDestinationPorts(@Nullable List<RuleGroupPortRange> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }

        public Builder setDestinations(@Nullable List<RuleGroupAddress> destinations) {
            this.destinations = destinations;
            return this;
        }

        public Builder setProtocols(@Nullable List<Integer> protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder setSourcePorts(@Nullable List<RuleGroupPortRange> sourcePorts) {
            this.sourcePorts = sourcePorts;
            return this;
        }

        public Builder setSources(@Nullable List<RuleGroupAddress> sources) {
            this.sources = sources;
            return this;
        }

        public Builder setTCPFlags(@Nullable List<RuleGroupTCPFlagField> tCPFlags) {
            this.tCPFlags = tCPFlags;
            return this;
        }

        public RuleGroupMatchAttributes build() {
            return new RuleGroupMatchAttributes(destinationPorts, destinations, protocols, sourcePorts, sources, tCPFlags);
        }
    }
}
