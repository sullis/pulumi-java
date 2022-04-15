// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListenerRuleTargetGroupStickinessConfig extends io.pulumi.resources.InvokeArgs {

    public static final ListenerRuleTargetGroupStickinessConfig Empty = new ListenerRuleTargetGroupStickinessConfig();

    @Import(name="durationSeconds")
      private final @Nullable Integer durationSeconds;

    public Optional<Integer> durationSeconds() {
        return this.durationSeconds == null ? Optional.empty() : Optional.ofNullable(this.durationSeconds);
    }

    @Import(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> enabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    public ListenerRuleTargetGroupStickinessConfig(
        @Nullable Integer durationSeconds,
        @Nullable Boolean enabled) {
        this.durationSeconds = durationSeconds;
        this.enabled = enabled;
    }

    private ListenerRuleTargetGroupStickinessConfig() {
        this.durationSeconds = null;
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerRuleTargetGroupStickinessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer durationSeconds;
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerRuleTargetGroupStickinessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.enabled = defaults.enabled;
        }

        public Builder durationSeconds(@Nullable Integer durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }        public ListenerRuleTargetGroupStickinessConfig build() {
            return new ListenerRuleTargetGroupStickinessConfig(durationSeconds, enabled);
        }
    }
}
