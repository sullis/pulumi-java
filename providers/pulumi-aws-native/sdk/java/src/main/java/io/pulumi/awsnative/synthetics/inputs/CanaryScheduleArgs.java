// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CanaryScheduleArgs extends io.pulumi.resources.ResourceArgs {

    public static final CanaryScheduleArgs Empty = new CanaryScheduleArgs();

    @InputImport(name="durationInSeconds")
    private final @Nullable Input<String> durationInSeconds;

    public Input<String> getDurationInSeconds() {
        return this.durationInSeconds == null ? Input.empty() : this.durationInSeconds;
    }

    @InputImport(name="expression", required=true)
    private final Input<String> expression;

    public Input<String> getExpression() {
        return this.expression;
    }

    public CanaryScheduleArgs(
        @Nullable Input<String> durationInSeconds,
        Input<String> expression) {
        this.durationInSeconds = durationInSeconds;
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
    }

    private CanaryScheduleArgs() {
        this.durationInSeconds = Input.empty();
        this.expression = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryScheduleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> durationInSeconds;
        private Input<String> expression;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryScheduleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.durationInSeconds = defaults.durationInSeconds;
    	      this.expression = defaults.expression;
        }

        public Builder setDurationInSeconds(@Nullable Input<String> durationInSeconds) {
            this.durationInSeconds = durationInSeconds;
            return this;
        }

        public Builder setDurationInSeconds(@Nullable String durationInSeconds) {
            this.durationInSeconds = Input.ofNullable(durationInSeconds);
            return this;
        }

        public Builder setExpression(Input<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }

        public CanaryScheduleArgs build() {
            return new CanaryScheduleArgs(durationInSeconds, expression);
        }
    }
}
