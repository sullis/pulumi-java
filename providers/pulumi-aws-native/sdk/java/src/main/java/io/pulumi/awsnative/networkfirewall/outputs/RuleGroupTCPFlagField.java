// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.enums.RuleGroupTCPFlag;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RuleGroupTCPFlagField {
    private final List<RuleGroupTCPFlag> flags;
    private final @Nullable List<RuleGroupTCPFlag> masks;

    @OutputCustomType.Constructor({"flags","masks"})
    private RuleGroupTCPFlagField(
        List<RuleGroupTCPFlag> flags,
        @Nullable List<RuleGroupTCPFlag> masks) {
        this.flags = Objects.requireNonNull(flags);
        this.masks = masks;
    }

    public List<RuleGroupTCPFlag> getFlags() {
        return this.flags;
    }
    public List<RuleGroupTCPFlag> getMasks() {
        return this.masks == null ? List.of() : this.masks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupTCPFlagField defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupTCPFlag> flags;
        private @Nullable List<RuleGroupTCPFlag> masks;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupTCPFlagField defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.flags = defaults.flags;
    	      this.masks = defaults.masks;
        }

        public Builder setFlags(List<RuleGroupTCPFlag> flags) {
            this.flags = Objects.requireNonNull(flags);
            return this;
        }

        public Builder setMasks(@Nullable List<RuleGroupTCPFlag> masks) {
            this.masks = masks;
            return this;
        }

        public RuleGroupTCPFlagField build() {
            return new RuleGroupTCPFlagField(flags, masks);
        }
    }
}
