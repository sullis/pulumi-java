// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerVersionTargetSizeGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerVersionTargetSizeGetArgs Empty = new InstanceGroupManagerVersionTargetSizeGetArgs();

    /**
     * , The number of instances which are managed for this version. Conflicts with `percent`.
     * 
     */
    @Import(name="fixed")
      private final @Nullable Output<Integer> fixed;

    public Output<Integer> getFixed() {
        return this.fixed == null ? Output.empty() : this.fixed;
    }

    /**
     * , The number of instances (calculated as percentage) which are managed for this version. Conflicts with `fixed`.
     * Note that when using `percent`, rounding will be in favor of explicitly set `target_size` values; a managed instance group with 2 instances and 2 `version`s,
     * one of which has a `target_size.percent` of `60` will create 2 instances of that `version`.
     * 
     */
    @Import(name="percent")
      private final @Nullable Output<Integer> percent;

    public Output<Integer> getPercent() {
        return this.percent == null ? Output.empty() : this.percent;
    }

    public InstanceGroupManagerVersionTargetSizeGetArgs(
        @Nullable Output<Integer> fixed,
        @Nullable Output<Integer> percent) {
        this.fixed = fixed;
        this.percent = percent;
    }

    private InstanceGroupManagerVersionTargetSizeGetArgs() {
        this.fixed = Output.empty();
        this.percent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerVersionTargetSizeGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> fixed;
        private @Nullable Output<Integer> percent;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerVersionTargetSizeGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fixed = defaults.fixed;
    	      this.percent = defaults.percent;
        }

        public Builder fixed(@Nullable Output<Integer> fixed) {
            this.fixed = fixed;
            return this;
        }
        public Builder fixed(@Nullable Integer fixed) {
            this.fixed = Output.ofNullable(fixed);
            return this;
        }
        public Builder percent(@Nullable Output<Integer> percent) {
            this.percent = percent;
            return this;
        }
        public Builder percent(@Nullable Integer percent) {
            this.percent = Output.ofNullable(percent);
            return this;
        }        public InstanceGroupManagerVersionTargetSizeGetArgs build() {
            return new InstanceGroupManagerVersionTargetSizeGetArgs(fixed, percent);
        }
    }
}
