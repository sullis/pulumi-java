// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StateMachineCloudWatchLogsLogGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final StateMachineCloudWatchLogsLogGroupArgs Empty = new StateMachineCloudWatchLogsLogGroupArgs();

    @InputImport(name="logGroupArn")
    private final @Nullable Input<String> logGroupArn;

    public Input<String> getLogGroupArn() {
        return this.logGroupArn == null ? Input.empty() : this.logGroupArn;
    }

    public StateMachineCloudWatchLogsLogGroupArgs(@Nullable Input<String> logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    private StateMachineCloudWatchLogsLogGroupArgs() {
        this.logGroupArn = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineCloudWatchLogsLogGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> logGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineCloudWatchLogsLogGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupArn = defaults.logGroupArn;
        }

        public Builder setLogGroupArn(@Nullable Input<String> logGroupArn) {
            this.logGroupArn = logGroupArn;
            return this;
        }

        public Builder setLogGroupArn(@Nullable String logGroupArn) {
            this.logGroupArn = Input.ofNullable(logGroupArn);
            return this;
        }

        public StateMachineCloudWatchLogsLogGroupArgs build() {
            return new StateMachineCloudWatchLogsLogGroupArgs(logGroupArn);
        }
    }
}
