// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codedeploy.inputs;

import io.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs;
import io.pulumi.aws.codedeploy.inputs.DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeploymentConfigTrafficRoutingConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeploymentConfigTrafficRoutingConfigArgs Empty = new DeploymentConfigTrafficRoutingConfigArgs();

    /**
     * The time based canary configuration information. If `type` is `TimeBasedLinear`, use `time_based_linear` instead.
     * 
     */
    @Import(name="timeBasedCanary")
      private final @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs> timeBasedCanary;

    public Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs> timeBasedCanary() {
        return this.timeBasedCanary == null ? Codegen.empty() : this.timeBasedCanary;
    }

    /**
     * The time based linear configuration information. If `type` is `TimeBasedCanary`, use `time_based_canary` instead.
     * 
     */
    @Import(name="timeBasedLinear")
      private final @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs> timeBasedLinear;

    public Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs> timeBasedLinear() {
        return this.timeBasedLinear == null ? Codegen.empty() : this.timeBasedLinear;
    }

    /**
     * Type of traffic routing config. One of `TimeBasedCanary`, `TimeBasedLinear`, `AllAtOnce`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public DeploymentConfigTrafficRoutingConfigArgs(
        @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs> timeBasedCanary,
        @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs> timeBasedLinear,
        @Nullable Output<String> type) {
        this.timeBasedCanary = timeBasedCanary;
        this.timeBasedLinear = timeBasedLinear;
        this.type = type;
    }

    private DeploymentConfigTrafficRoutingConfigArgs() {
        this.timeBasedCanary = Codegen.empty();
        this.timeBasedLinear = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentConfigTrafficRoutingConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs> timeBasedCanary;
        private @Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs> timeBasedLinear;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentConfigTrafficRoutingConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.timeBasedCanary = defaults.timeBasedCanary;
    	      this.timeBasedLinear = defaults.timeBasedLinear;
    	      this.type = defaults.type;
        }

        public Builder timeBasedCanary(@Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs> timeBasedCanary) {
            this.timeBasedCanary = timeBasedCanary;
            return this;
        }
        public Builder timeBasedCanary(@Nullable DeploymentConfigTrafficRoutingConfigTimeBasedCanaryArgs timeBasedCanary) {
            this.timeBasedCanary = Codegen.ofNullable(timeBasedCanary);
            return this;
        }
        public Builder timeBasedLinear(@Nullable Output<DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs> timeBasedLinear) {
            this.timeBasedLinear = timeBasedLinear;
            return this;
        }
        public Builder timeBasedLinear(@Nullable DeploymentConfigTrafficRoutingConfigTimeBasedLinearArgs timeBasedLinear) {
            this.timeBasedLinear = Codegen.ofNullable(timeBasedLinear);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public DeploymentConfigTrafficRoutingConfigArgs build() {
            return new DeploymentConfigTrafficRoutingConfigArgs(timeBasedCanary, timeBasedLinear, type);
        }
    }
}
