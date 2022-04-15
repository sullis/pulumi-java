// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class StateMachineCloudWatchLogsLogGroup {
    private final @Nullable String logGroupArn;

    @CustomType.Constructor
    private StateMachineCloudWatchLogsLogGroup(@CustomType.Parameter("logGroupArn") @Nullable String logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    public Optional<String> logGroupArn() {
        return Optional.ofNullable(this.logGroupArn);
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

        public Builder logGroupArn(@Nullable String logGroupArn) {
            this.logGroupArn = logGroupArn;
            return this;
        }        public StateMachineCloudWatchLogsLogGroup build() {
            return new StateMachineCloudWatchLogsLogGroup(logGroupArn);
        }
    }
}
