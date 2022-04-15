// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupAddressArgs;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupPortRangeArgs;
import io.pulumi.awsnative.networkfirewall.inputs.RuleGroupTCPFlagFieldArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupMatchAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupMatchAttributesArgs Empty = new RuleGroupMatchAttributesArgs();

    @Import(name="destinationPorts")
      private final @Nullable Output<List<RuleGroupPortRangeArgs>> destinationPorts;

    public Output<List<RuleGroupPortRangeArgs>> destinationPorts() {
        return this.destinationPorts == null ? Codegen.empty() : this.destinationPorts;
    }

    @Import(name="destinations")
      private final @Nullable Output<List<RuleGroupAddressArgs>> destinations;

    public Output<List<RuleGroupAddressArgs>> destinations() {
        return this.destinations == null ? Codegen.empty() : this.destinations;
    }

    @Import(name="protocols")
      private final @Nullable Output<List<Integer>> protocols;

    public Output<List<Integer>> protocols() {
        return this.protocols == null ? Codegen.empty() : this.protocols;
    }

    @Import(name="sourcePorts")
      private final @Nullable Output<List<RuleGroupPortRangeArgs>> sourcePorts;

    public Output<List<RuleGroupPortRangeArgs>> sourcePorts() {
        return this.sourcePorts == null ? Codegen.empty() : this.sourcePorts;
    }

    @Import(name="sources")
      private final @Nullable Output<List<RuleGroupAddressArgs>> sources;

    public Output<List<RuleGroupAddressArgs>> sources() {
        return this.sources == null ? Codegen.empty() : this.sources;
    }

    @Import(name="tCPFlags")
      private final @Nullable Output<List<RuleGroupTCPFlagFieldArgs>> tCPFlags;

    public Output<List<RuleGroupTCPFlagFieldArgs>> tCPFlags() {
        return this.tCPFlags == null ? Codegen.empty() : this.tCPFlags;
    }

    public RuleGroupMatchAttributesArgs(
        @Nullable Output<List<RuleGroupPortRangeArgs>> destinationPorts,
        @Nullable Output<List<RuleGroupAddressArgs>> destinations,
        @Nullable Output<List<Integer>> protocols,
        @Nullable Output<List<RuleGroupPortRangeArgs>> sourcePorts,
        @Nullable Output<List<RuleGroupAddressArgs>> sources,
        @Nullable Output<List<RuleGroupTCPFlagFieldArgs>> tCPFlags) {
        this.destinationPorts = destinationPorts;
        this.destinations = destinations;
        this.protocols = protocols;
        this.sourcePorts = sourcePorts;
        this.sources = sources;
        this.tCPFlags = tCPFlags;
    }

    private RuleGroupMatchAttributesArgs() {
        this.destinationPorts = Codegen.empty();
        this.destinations = Codegen.empty();
        this.protocols = Codegen.empty();
        this.sourcePorts = Codegen.empty();
        this.sources = Codegen.empty();
        this.tCPFlags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupMatchAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<RuleGroupPortRangeArgs>> destinationPorts;
        private @Nullable Output<List<RuleGroupAddressArgs>> destinations;
        private @Nullable Output<List<Integer>> protocols;
        private @Nullable Output<List<RuleGroupPortRangeArgs>> sourcePorts;
        private @Nullable Output<List<RuleGroupAddressArgs>> sources;
        private @Nullable Output<List<RuleGroupTCPFlagFieldArgs>> tCPFlags;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupMatchAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinationPorts = defaults.destinationPorts;
    	      this.destinations = defaults.destinations;
    	      this.protocols = defaults.protocols;
    	      this.sourcePorts = defaults.sourcePorts;
    	      this.sources = defaults.sources;
    	      this.tCPFlags = defaults.tCPFlags;
        }

        public Builder destinationPorts(@Nullable Output<List<RuleGroupPortRangeArgs>> destinationPorts) {
            this.destinationPorts = destinationPorts;
            return this;
        }
        public Builder destinationPorts(@Nullable List<RuleGroupPortRangeArgs> destinationPorts) {
            this.destinationPorts = Codegen.ofNullable(destinationPorts);
            return this;
        }
        public Builder destinationPorts(RuleGroupPortRangeArgs... destinationPorts) {
            return destinationPorts(List.of(destinationPorts));
        }
        public Builder destinations(@Nullable Output<List<RuleGroupAddressArgs>> destinations) {
            this.destinations = destinations;
            return this;
        }
        public Builder destinations(@Nullable List<RuleGroupAddressArgs> destinations) {
            this.destinations = Codegen.ofNullable(destinations);
            return this;
        }
        public Builder destinations(RuleGroupAddressArgs... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder protocols(@Nullable Output<List<Integer>> protocols) {
            this.protocols = protocols;
            return this;
        }
        public Builder protocols(@Nullable List<Integer> protocols) {
            this.protocols = Codegen.ofNullable(protocols);
            return this;
        }
        public Builder protocols(Integer... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder sourcePorts(@Nullable Output<List<RuleGroupPortRangeArgs>> sourcePorts) {
            this.sourcePorts = sourcePorts;
            return this;
        }
        public Builder sourcePorts(@Nullable List<RuleGroupPortRangeArgs> sourcePorts) {
            this.sourcePorts = Codegen.ofNullable(sourcePorts);
            return this;
        }
        public Builder sourcePorts(RuleGroupPortRangeArgs... sourcePorts) {
            return sourcePorts(List.of(sourcePorts));
        }
        public Builder sources(@Nullable Output<List<RuleGroupAddressArgs>> sources) {
            this.sources = sources;
            return this;
        }
        public Builder sources(@Nullable List<RuleGroupAddressArgs> sources) {
            this.sources = Codegen.ofNullable(sources);
            return this;
        }
        public Builder sources(RuleGroupAddressArgs... sources) {
            return sources(List.of(sources));
        }
        public Builder tCPFlags(@Nullable Output<List<RuleGroupTCPFlagFieldArgs>> tCPFlags) {
            this.tCPFlags = tCPFlags;
            return this;
        }
        public Builder tCPFlags(@Nullable List<RuleGroupTCPFlagFieldArgs> tCPFlags) {
            this.tCPFlags = Codegen.ofNullable(tCPFlags);
            return this;
        }
        public Builder tCPFlags(RuleGroupTCPFlagFieldArgs... tCPFlags) {
            return tCPFlags(List.of(tCPFlags));
        }        public RuleGroupMatchAttributesArgs build() {
            return new RuleGroupMatchAttributesArgs(destinationPorts, destinations, protocols, sourcePorts, sources, tCPFlags);
        }
    }
}
