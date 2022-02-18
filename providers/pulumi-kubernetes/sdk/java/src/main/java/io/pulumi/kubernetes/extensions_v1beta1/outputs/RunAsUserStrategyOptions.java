// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.extensions_v1beta1.outputs.IDRange;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class RunAsUserStrategyOptions {
    /**
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    private final @Nullable List<IDRange> ranges;
    /**
     * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
     * 
     */
    private final String rule;

    @OutputCustomType.Constructor({"ranges","rule"})
    private RunAsUserStrategyOptions(
        @Nullable List<IDRange> ranges,
        String rule) {
        this.ranges = ranges;
        this.rule = Objects.requireNonNull(rule);
    }

    /**
     * ranges are the allowed ranges of uids that may be used. If you would like to force a single uid then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    public List<IDRange> getRanges() {
        return this.ranges == null ? List.of() : this.ranges;
    }
    /**
     * rule is the strategy that will dictate the allowable RunAsUser values that may be set.
     * 
     */
    public String getRule() {
        return this.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunAsUserStrategyOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<IDRange> ranges;
        private String rule;

        public Builder() {
    	      // Empty
        }

        public Builder(RunAsUserStrategyOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        public Builder setRanges(@Nullable List<IDRange> ranges) {
            this.ranges = ranges;
            return this;
        }

        public Builder setRule(String rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }

        public RunAsUserStrategyOptions build() {
            return new RunAsUserStrategyOptions(ranges, rule);
        }
    }
}
