// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.SpotFleetRequestConfigDataArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


public final class SpotFleetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetArgs Empty = new SpotFleetArgs();

    @Import(name="spotFleetRequestConfigData", required=true)
      private final Output<SpotFleetRequestConfigDataArgs> spotFleetRequestConfigData;

    public Output<SpotFleetRequestConfigDataArgs> spotFleetRequestConfigData() {
        return this.spotFleetRequestConfigData;
    }

    public SpotFleetArgs(Output<SpotFleetRequestConfigDataArgs> spotFleetRequestConfigData) {
        this.spotFleetRequestConfigData = Objects.requireNonNull(spotFleetRequestConfigData, "expected parameter 'spotFleetRequestConfigData' to be non-null");
    }

    private SpotFleetArgs() {
        this.spotFleetRequestConfigData = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<SpotFleetRequestConfigDataArgs> spotFleetRequestConfigData;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.spotFleetRequestConfigData = defaults.spotFleetRequestConfigData;
        }

        public Builder spotFleetRequestConfigData(Output<SpotFleetRequestConfigDataArgs> spotFleetRequestConfigData) {
            this.spotFleetRequestConfigData = Objects.requireNonNull(spotFleetRequestConfigData);
            return this;
        }
        public Builder spotFleetRequestConfigData(SpotFleetRequestConfigDataArgs spotFleetRequestConfigData) {
            this.spotFleetRequestConfigData = Output.of(Objects.requireNonNull(spotFleetRequestConfigData));
            return this;
        }        public SpotFleetArgs build() {
            return new SpotFleetArgs(spotFleetRequestConfigData);
        }
    }
}
