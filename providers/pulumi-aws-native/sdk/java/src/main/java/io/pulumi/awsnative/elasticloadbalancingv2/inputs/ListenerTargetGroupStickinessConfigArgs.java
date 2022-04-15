// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ListenerTargetGroupStickinessConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ListenerTargetGroupStickinessConfigArgs Empty = new ListenerTargetGroupStickinessConfigArgs();

    @Import(name="durationSeconds")
      private final @Nullable Output<Integer> durationSeconds;

    public Output<Integer> durationSeconds() {
        return this.durationSeconds == null ? Codegen.empty() : this.durationSeconds;
    }

    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> enabled() {
        return this.enabled == null ? Codegen.empty() : this.enabled;
    }

    public ListenerTargetGroupStickinessConfigArgs(
        @Nullable Output<Integer> durationSeconds,
        @Nullable Output<Boolean> enabled) {
        this.durationSeconds = durationSeconds;
        this.enabled = enabled;
    }

    private ListenerTargetGroupStickinessConfigArgs() {
        this.durationSeconds = Codegen.empty();
        this.enabled = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListenerTargetGroupStickinessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> durationSeconds;
        private @Nullable Output<Boolean> enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ListenerTargetGroupStickinessConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationSeconds = defaults.durationSeconds;
    	      this.enabled = defaults.enabled;
        }

        public Builder durationSeconds(@Nullable Output<Integer> durationSeconds) {
            this.durationSeconds = durationSeconds;
            return this;
        }
        public Builder durationSeconds(@Nullable Integer durationSeconds) {
            this.durationSeconds = Codegen.ofNullable(durationSeconds);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Codegen.ofNullable(enabled);
            return this;
        }        public ListenerTargetGroupStickinessConfigArgs build() {
            return new ListenerTargetGroupStickinessConfigArgs(durationSeconds, enabled);
        }
    }
}
