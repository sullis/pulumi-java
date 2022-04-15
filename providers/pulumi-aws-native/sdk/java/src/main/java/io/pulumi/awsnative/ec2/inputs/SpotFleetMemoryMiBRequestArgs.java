// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SpotFleetMemoryMiBRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetMemoryMiBRequestArgs Empty = new SpotFleetMemoryMiBRequestArgs();

    @Import(name="max")
      private final @Nullable Output<Integer> max;

    public Output<Integer> max() {
        return this.max == null ? Codegen.empty() : this.max;
    }

    @Import(name="min")
      private final @Nullable Output<Integer> min;

    public Output<Integer> min() {
        return this.min == null ? Codegen.empty() : this.min;
    }

    public SpotFleetMemoryMiBRequestArgs(
        @Nullable Output<Integer> max,
        @Nullable Output<Integer> min) {
        this.max = max;
        this.min = min;
    }

    private SpotFleetMemoryMiBRequestArgs() {
        this.max = Codegen.empty();
        this.min = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetMemoryMiBRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> max;
        private @Nullable Output<Integer> min;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetMemoryMiBRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.max = defaults.max;
    	      this.min = defaults.min;
        }

        public Builder max(@Nullable Output<Integer> max) {
            this.max = max;
            return this;
        }
        public Builder max(@Nullable Integer max) {
            this.max = Codegen.ofNullable(max);
            return this;
        }
        public Builder min(@Nullable Output<Integer> min) {
            this.min = min;
            return this;
        }
        public Builder min(@Nullable Integer min) {
            this.min = Codegen.ofNullable(min);
            return this;
        }        public SpotFleetMemoryMiBRequestArgs build() {
            return new SpotFleetMemoryMiBRequestArgs(max, min);
        }
    }
}
