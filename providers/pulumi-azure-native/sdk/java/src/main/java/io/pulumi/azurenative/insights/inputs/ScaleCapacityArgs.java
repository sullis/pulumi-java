// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The number of instances that can be used during this profile.
 * 
 */
public final class ScaleCapacityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ScaleCapacityArgs Empty = new ScaleCapacityArgs();

    /**
     * the number of instances that will be set if metrics are not available for evaluation. The default is only used if the current instance count is lower than the default.
     * 
     */
    @Import(name="default", required=true)
      private final Output<String> default_;

    public Output<String> getDefault_() {
        return this.default_;
    }

    /**
     * the maximum number of instances for the resource. The actual maximum number of instances is limited by the cores that are available in the subscription.
     * 
     */
    @Import(name="maximum", required=true)
      private final Output<String> maximum;

    public Output<String> getMaximum() {
        return this.maximum;
    }

    /**
     * the minimum number of instances for the resource.
     * 
     */
    @Import(name="minimum", required=true)
      private final Output<String> minimum;

    public Output<String> getMinimum() {
        return this.minimum;
    }

    public ScaleCapacityArgs(
        Output<String> default_,
        Output<String> maximum,
        Output<String> minimum) {
        this.default_ = Objects.requireNonNull(default_, "expected parameter 'default_' to be non-null");
        this.maximum = Objects.requireNonNull(maximum, "expected parameter 'maximum' to be non-null");
        this.minimum = Objects.requireNonNull(minimum, "expected parameter 'minimum' to be non-null");
    }

    private ScaleCapacityArgs() {
        this.default_ = Output.empty();
        this.maximum = Output.empty();
        this.minimum = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScaleCapacityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> default_;
        private Output<String> maximum;
        private Output<String> minimum;

        public Builder() {
    	      // Empty
        }

        public Builder(ScaleCapacityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.default_ = defaults.default_;
    	      this.maximum = defaults.maximum;
    	      this.minimum = defaults.minimum;
        }

        public Builder default_(Output<String> default_) {
            this.default_ = Objects.requireNonNull(default_);
            return this;
        }
        public Builder default_(String default_) {
            this.default_ = Output.of(Objects.requireNonNull(default_));
            return this;
        }
        public Builder maximum(Output<String> maximum) {
            this.maximum = Objects.requireNonNull(maximum);
            return this;
        }
        public Builder maximum(String maximum) {
            this.maximum = Output.of(Objects.requireNonNull(maximum));
            return this;
        }
        public Builder minimum(Output<String> minimum) {
            this.minimum = Objects.requireNonNull(minimum);
            return this;
        }
        public Builder minimum(String minimum) {
            this.minimum = Output.of(Objects.requireNonNull(minimum));
            return this;
        }        public ScaleCapacityArgs build() {
            return new ScaleCapacityArgs(default_, maximum, minimum);
        }
    }
}
