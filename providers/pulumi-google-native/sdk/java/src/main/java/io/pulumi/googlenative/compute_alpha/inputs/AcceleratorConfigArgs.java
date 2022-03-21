// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A specification of the type and number of accelerator cards attached to the instance.
 * 
 */
public final class AcceleratorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AcceleratorConfigArgs Empty = new AcceleratorConfigArgs();

    /**
     * The number of the guest accelerator cards exposed to this instance.
     * 
     */
    @Import(name="acceleratorCount")
      private final @Nullable Output<Integer> acceleratorCount;

    public Output<Integer> getAcceleratorCount() {
        return this.acceleratorCount == null ? Output.empty() : this.acceleratorCount;
    }

    /**
     * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
     * 
     */
    @Import(name="acceleratorType")
      private final @Nullable Output<String> acceleratorType;

    public Output<String> getAcceleratorType() {
        return this.acceleratorType == null ? Output.empty() : this.acceleratorType;
    }

    public AcceleratorConfigArgs(
        @Nullable Output<Integer> acceleratorCount,
        @Nullable Output<String> acceleratorType) {
        this.acceleratorCount = acceleratorCount;
        this.acceleratorType = acceleratorType;
    }

    private AcceleratorConfigArgs() {
        this.acceleratorCount = Output.empty();
        this.acceleratorType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> acceleratorCount;
        private @Nullable Output<String> acceleratorType;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceleratorCount = defaults.acceleratorCount;
    	      this.acceleratorType = defaults.acceleratorType;
        }

        public Builder acceleratorCount(@Nullable Output<Integer> acceleratorCount) {
            this.acceleratorCount = acceleratorCount;
            return this;
        }
        public Builder acceleratorCount(@Nullable Integer acceleratorCount) {
            this.acceleratorCount = Output.ofNullable(acceleratorCount);
            return this;
        }
        public Builder acceleratorType(@Nullable Output<String> acceleratorType) {
            this.acceleratorType = acceleratorType;
            return this;
        }
        public Builder acceleratorType(@Nullable String acceleratorType) {
            this.acceleratorType = Output.ofNullable(acceleratorType);
            return this;
        }        public AcceleratorConfigArgs build() {
            return new AcceleratorConfigArgs(acceleratorCount, acceleratorType);
        }
    }
}
