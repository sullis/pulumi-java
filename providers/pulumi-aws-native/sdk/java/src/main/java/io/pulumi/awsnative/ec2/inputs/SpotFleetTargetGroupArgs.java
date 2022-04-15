// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class SpotFleetTargetGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final SpotFleetTargetGroupArgs Empty = new SpotFleetTargetGroupArgs();

    @Import(name="arn", required=true)
      private final Output<String> arn;

    public Output<String> arn() {
        return this.arn;
    }

    public SpotFleetTargetGroupArgs(Output<String> arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private SpotFleetTargetGroupArgs() {
        this.arn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetTargetGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> arn;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetTargetGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(Output<String> arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Output.of(Objects.requireNonNull(arn));
            return this;
        }        public SpotFleetTargetGroupArgs build() {
            return new SpotFleetTargetGroupArgs(arn);
        }
    }
}
