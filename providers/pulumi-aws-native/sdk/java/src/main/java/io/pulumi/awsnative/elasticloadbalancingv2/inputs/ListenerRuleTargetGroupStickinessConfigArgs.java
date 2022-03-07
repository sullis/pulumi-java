// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerRuleTargetGroupStickinessConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerRuleTargetGroupStickinessConfigArgs Empty = new ListenerRuleTargetGroupStickinessConfigArgs();

    @InputImport(name="durationSeconds")
      private final @Nullable Input<Integer> durationSeconds;

    public Input<Integer> getDurationSeconds() {
        return this.durationSeconds == null ? Input.empty() : this.durationSeconds;
    }

    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    public ListenerRuleTargetGroupStickinessConfigArgs(
        @Nullable Input<Integer> durationSeconds,
        @Nullable Input<Boolean> enabled) {
        this.durationSeconds = durationSeconds;
        this.enabled = enabled;
    }

    private ListenerRuleTargetGroupStickinessConfigArgs() {
        this.durationSeconds = Input.empty();
        this.enabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleTargetGroupStickinessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> durationSeconds;
        private @Nullable Input<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleTargetGroupStickinessConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.enabled = defaults.enabled;
        }

        public Builder setDurationSeconds(@Nullable Input<Integer> durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }

        public Builder setDurationSeconds(@Nullable Integer durationSeconds) {
            this.durationSeconds = Input.ofNullable(durationSeconds);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }
        public ListenerRuleTargetGroupStickinessConfigArgs build() {
            return new ListenerRuleTargetGroupStickinessConfigArgs(durationSeconds, enabled);
        }
    }
}