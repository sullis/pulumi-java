// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.extensions_v1beta1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.kubernetes.extensions_v1beta1.inputs.IDRangeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * RunAsGroupStrategyOptions defines the strategy type and any options used to create the strategy. Deprecated: use RunAsGroupStrategyOptions from policy API Group instead.
 * 
 */
public final class RunAsGroupStrategyOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final RunAsGroupStrategyOptionsArgs Empty = new RunAsGroupStrategyOptionsArgs();

    /**
     * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single range with the same start and end. Required for MustRunAs.
     * 
     */
    @InputImport(name="ranges")
    private final @Nullable Input<List<IDRangeArgs>> ranges;

    public Input<List<IDRangeArgs>> getRanges() {
        return this.ranges == null ? Input.empty() : this.ranges;
    }

    /**
     * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
     * 
     */
    @InputImport(name="rule", required=true)
    private final Input<String> rule;

    public Input<String> getRule() {
        return this.rule;
    }

    public RunAsGroupStrategyOptionsArgs(
        @Nullable Input<List<IDRangeArgs>> ranges,
        Input<String> rule) {
        this.ranges = ranges;
        this.rule = Objects.requireNonNull(rule, "expected parameter 'rule' to be non-null");
    }

    private RunAsGroupStrategyOptionsArgs() {
        this.ranges = Input.empty();
        this.rule = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RunAsGroupStrategyOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<IDRangeArgs>> ranges;
        private Input<String> rule;

        public Builder() {
    	      // Empty
        }

        public Builder(RunAsGroupStrategyOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ranges = defaults.ranges;
    	      this.rule = defaults.rule;
        }

        public Builder setRanges(@Nullable Input<List<IDRangeArgs>> ranges) {
            this.ranges = ranges;
            return this;
        }

        public Builder setRanges(@Nullable List<IDRangeArgs> ranges) {
            this.ranges = Input.ofNullable(ranges);
            return this;
        }

        public Builder setRule(Input<String> rule) {
            this.rule = Objects.requireNonNull(rule);
            return this;
        }

        public Builder setRule(String rule) {
            this.rule = Input.of(Objects.requireNonNull(rule));
            return this;
        }

        public RunAsGroupStrategyOptionsArgs build() {
            return new RunAsGroupStrategyOptionsArgs(ranges, rule);
        }
    }
}
