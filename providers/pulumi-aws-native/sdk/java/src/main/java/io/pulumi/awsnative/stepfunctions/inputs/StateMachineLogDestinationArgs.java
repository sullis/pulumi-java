// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.inputs;

import io.pulumi.awsnative.stepfunctions.inputs.StateMachineCloudWatchLogsLogGroupArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StateMachineLogDestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StateMachineLogDestinationArgs Empty = new StateMachineLogDestinationArgs();

    @Import(name="cloudWatchLogsLogGroup")
      private final @Nullable Output<StateMachineCloudWatchLogsLogGroupArgs> cloudWatchLogsLogGroup;

    public Output<StateMachineCloudWatchLogsLogGroupArgs> cloudWatchLogsLogGroup() {
        return this.cloudWatchLogsLogGroup == null ? Codegen.empty() : this.cloudWatchLogsLogGroup;
    }

    public StateMachineLogDestinationArgs(@Nullable Output<StateMachineCloudWatchLogsLogGroupArgs> cloudWatchLogsLogGroup) {
        this.cloudWatchLogsLogGroup = cloudWatchLogsLogGroup;
    }

    private StateMachineLogDestinationArgs() {
        this.cloudWatchLogsLogGroup = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineLogDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<StateMachineCloudWatchLogsLogGroupArgs> cloudWatchLogsLogGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineLogDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogsLogGroup = defaults.cloudWatchLogsLogGroup;
        }

        public Builder cloudWatchLogsLogGroup(@Nullable Output<StateMachineCloudWatchLogsLogGroupArgs> cloudWatchLogsLogGroup) {
            this.cloudWatchLogsLogGroup = cloudWatchLogsLogGroup;
            return this;
        }
        public Builder cloudWatchLogsLogGroup(@Nullable StateMachineCloudWatchLogsLogGroupArgs cloudWatchLogsLogGroup) {
            this.cloudWatchLogsLogGroup = Codegen.ofNullable(cloudWatchLogsLogGroup);
            return this;
        }        public StateMachineLogDestinationArgs build() {
            return new StateMachineLogDestinationArgs(cloudWatchLogsLogGroup);
        }
    }
}
