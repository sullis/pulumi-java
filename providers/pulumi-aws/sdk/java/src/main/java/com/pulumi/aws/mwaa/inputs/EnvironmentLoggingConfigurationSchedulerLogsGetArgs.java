// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mwaa.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EnvironmentLoggingConfigurationSchedulerLogsGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentLoggingConfigurationSchedulerLogsGetArgs Empty = new EnvironmentLoggingConfigurationSchedulerLogsGetArgs();

    @Import(name="cloudWatchLogGroupArn")
    private @Nullable Output<String> cloudWatchLogGroupArn;

    public Optional<Output<String>> cloudWatchLogGroupArn() {
        return Optional.ofNullable(this.cloudWatchLogGroupArn);
    }

    /**
     * Enabling or disabling the collection of logs
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Enabling or disabling the collection of logs
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * Logging level. Valid values: `CRITICAL`, `ERROR`, `WARNING`, `INFO`, `DEBUG`. Will be `INFO` by default.
     * 
     */
    @Import(name="logLevel")
    private @Nullable Output<String> logLevel;

    /**
     * @return Logging level. Valid values: `CRITICAL`, `ERROR`, `WARNING`, `INFO`, `DEBUG`. Will be `INFO` by default.
     * 
     */
    public Optional<Output<String>> logLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    private EnvironmentLoggingConfigurationSchedulerLogsGetArgs() {}

    private EnvironmentLoggingConfigurationSchedulerLogsGetArgs(EnvironmentLoggingConfigurationSchedulerLogsGetArgs $) {
        this.cloudWatchLogGroupArn = $.cloudWatchLogGroupArn;
        this.enabled = $.enabled;
        this.logLevel = $.logLevel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentLoggingConfigurationSchedulerLogsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentLoggingConfigurationSchedulerLogsGetArgs $;

        public Builder() {
            $ = new EnvironmentLoggingConfigurationSchedulerLogsGetArgs();
        }

        public Builder(EnvironmentLoggingConfigurationSchedulerLogsGetArgs defaults) {
            $ = new EnvironmentLoggingConfigurationSchedulerLogsGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder cloudWatchLogGroupArn(@Nullable Output<String> cloudWatchLogGroupArn) {
            $.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
            return this;
        }

        public Builder cloudWatchLogGroupArn(String cloudWatchLogGroupArn) {
            return cloudWatchLogGroupArn(Output.of(cloudWatchLogGroupArn));
        }

        /**
         * @param enabled Enabling or disabling the collection of logs
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Enabling or disabling the collection of logs
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param logLevel Logging level. Valid values: `CRITICAL`, `ERROR`, `WARNING`, `INFO`, `DEBUG`. Will be `INFO` by default.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(@Nullable Output<String> logLevel) {
            $.logLevel = logLevel;
            return this;
        }

        /**
         * @param logLevel Logging level. Valid values: `CRITICAL`, `ERROR`, `WARNING`, `INFO`, `DEBUG`. Will be `INFO` by default.
         * 
         * @return builder
         * 
         */
        public Builder logLevel(String logLevel) {
            return logLevel(Output.of(logLevel));
        }

        public EnvironmentLoggingConfigurationSchedulerLogsGetArgs build() {
            return $;
        }
    }

}
