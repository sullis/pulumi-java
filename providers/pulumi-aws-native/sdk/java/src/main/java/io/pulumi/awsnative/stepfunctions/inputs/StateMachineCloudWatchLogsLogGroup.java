// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StateMachineCloudWatchLogsLogGroup extends io.pulumi.resources.InvokeArgs {

    public static final StateMachineCloudWatchLogsLogGroup Empty = new StateMachineCloudWatchLogsLogGroup();

    @InputImport(name="logGroupArn")
    private final @Nullable String logGroupArn;

    public Optional<String> getLogGroupArn() {
        return this.logGroupArn == null ? Optional.empty() : Optional.ofNullable(this.logGroupArn);
    }

    public StateMachineCloudWatchLogsLogGroup(@Nullable String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    private StateMachineCloudWatchLogsLogGroup() {
        this.logGroupArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineCloudWatchLogsLogGroup defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String logGroupArn;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineCloudWatchLogsLogGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logGroupArn = defaults.logGroupArn;
        }

        public Builder setLogGroupArn(@Nullable String logGroupArn) {
            this.logGroupArn = logGroupArn;
            return this;
        }

        public StateMachineCloudWatchLogsLogGroup build() {
            return new StateMachineCloudWatchLogsLogGroup(logGroupArn);
        }
    }
}
