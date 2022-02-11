// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.inputs.TaskSetAwsVpcConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskSetNetworkConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskSetNetworkConfigurationArgs Empty = new TaskSetNetworkConfigurationArgs();

    @InputImport(name="awsVpcConfiguration")
    private final @Nullable Input<TaskSetAwsVpcConfigurationArgs> awsVpcConfiguration;

    public Input<TaskSetAwsVpcConfigurationArgs> getAwsVpcConfiguration() {
        return this.awsVpcConfiguration == null ? Input.empty() : this.awsVpcConfiguration;
    }

    public TaskSetNetworkConfigurationArgs(@Nullable Input<TaskSetAwsVpcConfigurationArgs> awsVpcConfiguration) {
        this.awsVpcConfiguration = awsVpcConfiguration;
    }

    private TaskSetNetworkConfigurationArgs() {
        this.awsVpcConfiguration = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<TaskSetAwsVpcConfigurationArgs> awsVpcConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetNetworkConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsVpcConfiguration = defaults.awsVpcConfiguration;
        }

        public Builder setAwsVpcConfiguration(@Nullable Input<TaskSetAwsVpcConfigurationArgs> awsVpcConfiguration) {
            this.awsVpcConfiguration = awsVpcConfiguration;
            return this;
        }

        public Builder setAwsVpcConfiguration(@Nullable TaskSetAwsVpcConfigurationArgs awsVpcConfiguration) {
            this.awsVpcConfiguration = Input.ofNullable(awsVpcConfiguration);
            return this;
        }

        public TaskSetNetworkConfigurationArgs build() {
            return new TaskSetNetworkConfigurationArgs(awsVpcConfiguration);
        }
    }
}
