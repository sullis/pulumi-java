// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.inputs;

import io.pulumi.awsnative.stepfunctions.inputs.StateMachineCloudWatchLogsLogGroupArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StateMachineLogDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StateMachineLogDestinationArgs Empty = new StateMachineLogDestinationArgs();

    @InputImport(name="cloudWatchLogsLogGroup")
    private final @Nullable Input<StateMachineCloudWatchLogsLogGroupArgs> cloudWatchLogsLogGroup;

    public Input<StateMachineCloudWatchLogsLogGroupArgs> getCloudWatchLogsLogGroup() {
        return this.cloudWatchLogsLogGroup == null ? Input.empty() : this.cloudWatchLogsLogGroup;
    }

    public StateMachineLogDestinationArgs(@Nullable Input<StateMachineCloudWatchLogsLogGroupArgs> cloudWatchLogsLogGroup) {
        this.cloudWatchLogsLogGroup = cloudWatchLogsLogGroup;
    }

    private StateMachineLogDestinationArgs() {
        this.cloudWatchLogsLogGroup = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<StateMachineCloudWatchLogsLogGroupArgs> cloudWatchLogsLogGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineLogDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogsLogGroup = defaults.cloudWatchLogsLogGroup;
        }

        public Builder setCloudWatchLogsLogGroup(@Nullable Input<StateMachineCloudWatchLogsLogGroupArgs> cloudWatchLogsLogGroup) {
            this.cloudWatchLogsLogGroup = cloudWatchLogsLogGroup;
            return this;
        }

        public Builder setCloudWatchLogsLogGroup(@Nullable StateMachineCloudWatchLogsLogGroupArgs cloudWatchLogsLogGroup) {
            this.cloudWatchLogsLogGroup = Input.ofNullable(cloudWatchLogsLogGroup);
            return this;
        }

        public StateMachineLogDestinationArgs build() {
            return new StateMachineLogDestinationArgs(cloudWatchLogsLogGroup);
        }
    }
}
