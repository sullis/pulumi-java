// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.outputs;

import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRuleTargetGroupStickinessConfig;
import io.pulumi.awsnative.elasticloadbalancingv2.outputs.ListenerRuleTargetGroupTuple;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListenerRuleForwardConfig {
    private final @Nullable ListenerRuleTargetGroupStickinessConfig targetGroupStickinessConfig;
    private final @Nullable List<ListenerRuleTargetGroupTuple> targetGroups;

    @OutputCustomType.Constructor
    private ListenerRuleForwardConfig(
        @OutputCustomType.Parameter("targetGroupStickinessConfig") @Nullable ListenerRuleTargetGroupStickinessConfig targetGroupStickinessConfig,
        @OutputCustomType.Parameter("targetGroups") @Nullable List<ListenerRuleTargetGroupTuple> targetGroups) {
        this.targetGroupStickinessConfig = targetGroupStickinessConfig;
        this.targetGroups = targetGroups;
    }

    public Optional<ListenerRuleTargetGroupStickinessConfig> getTargetGroupStickinessConfig() {
        return Optional.ofNullable(this.targetGroupStickinessConfig);
    }
    public List<ListenerRuleTargetGroupTuple> getTargetGroups() {
        return this.targetGroups == null ? List.of() : this.targetGroups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleForwardConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ListenerRuleTargetGroupStickinessConfig targetGroupStickinessConfig;
        private @Nullable List<ListenerRuleTargetGroupTuple> targetGroups;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleForwardConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetGroupStickinessConfig = defaults.targetGroupStickinessConfig;
    	      this.targetGroups = defaults.targetGroups;
        }

        public Builder setTargetGroupStickinessConfig(@Nullable ListenerRuleTargetGroupStickinessConfig targetGroupStickinessConfig) {
            this.targetGroupStickinessConfig = targetGroupStickinessConfig;
            return this;
        }

        public Builder setTargetGroups(@Nullable List<ListenerRuleTargetGroupTuple> targetGroups) {
            this.targetGroups = targetGroups;
            return this;
        }
        public ListenerRuleForwardConfig build() {
            return new ListenerRuleForwardConfig(targetGroupStickinessConfig, targetGroups);
        }
    }
}
