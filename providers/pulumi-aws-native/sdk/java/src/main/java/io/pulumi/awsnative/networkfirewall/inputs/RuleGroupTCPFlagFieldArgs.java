// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.inputs;

import io.pulumi.awsnative.networkfirewall.enums.RuleGroupTCPFlag;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupTCPFlagFieldArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupTCPFlagFieldArgs Empty = new RuleGroupTCPFlagFieldArgs();

    @Import(name="flags", required=true)
      private final Output<List<RuleGroupTCPFlag>> flags;

    public Output<List<RuleGroupTCPFlag>> getFlags() {
        return this.flags;
    }

    @Import(name="masks")
      private final @Nullable Output<List<RuleGroupTCPFlag>> masks;

    public Output<List<RuleGroupTCPFlag>> getMasks() {
        return this.masks == null ? Output.empty() : this.masks;
    }

    public RuleGroupTCPFlagFieldArgs(
        Output<List<RuleGroupTCPFlag>> flags,
        @Nullable Output<List<RuleGroupTCPFlag>> masks) {
        this.flags = Objects.requireNonNull(flags, "expected parameter 'flags' to be non-null");
        this.masks = masks;
    }

    private RuleGroupTCPFlagFieldArgs() {
        this.flags = Output.empty();
        this.masks = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupTCPFlagFieldArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<RuleGroupTCPFlag>> flags;
        private @Nullable Output<List<RuleGroupTCPFlag>> masks;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupTCPFlagFieldArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flags = defaults.flags;
    	      this.masks = defaults.masks;
        }

        public Builder flags(Output<List<RuleGroupTCPFlag>> flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }
        public Builder flags(List<RuleGroupTCPFlag> flags) {
            this.flags = Output.of(Objects.requireNonNull(flags));
            return this;
        }
        public Builder flags(RuleGroupTCPFlag... flags) {
            return flags(List.of(flags));
        }
        public Builder masks(@Nullable Output<List<RuleGroupTCPFlag>> masks) {
            this.masks = masks;
            return this;
        }
        public Builder masks(@Nullable List<RuleGroupTCPFlag> masks) {
            this.masks = Output.ofNullable(masks);
            return this;
        }
        public Builder masks(RuleGroupTCPFlag... masks) {
            return masks(List.of(masks));
        }        public RuleGroupTCPFlagFieldArgs build() {
            return new RuleGroupTCPFlagFieldArgs(flags, masks);
        }
    }
}
