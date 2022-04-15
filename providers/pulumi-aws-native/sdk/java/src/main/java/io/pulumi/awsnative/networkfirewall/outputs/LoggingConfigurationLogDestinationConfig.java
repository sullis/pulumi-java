// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.enums.LoggingConfigurationLogDestinationConfigLogDestinationType;
import io.pulumi.awsnative.networkfirewall.enums.LoggingConfigurationLogDestinationConfigLogType;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.util.Objects;

@CustomType
public final class LoggingConfigurationLogDestinationConfig {
    /**
     * A key-value pair to configure the logDestinations.
     * 
     */
    private final Object logDestination;
    private final LoggingConfigurationLogDestinationConfigLogDestinationType logDestinationType;
    private final LoggingConfigurationLogDestinationConfigLogType logType;

    @CustomType.Constructor
    private LoggingConfigurationLogDestinationConfig(
        @CustomType.Parameter("logDestination") Object logDestination,
        @CustomType.Parameter("logDestinationType") LoggingConfigurationLogDestinationConfigLogDestinationType logDestinationType,
        @CustomType.Parameter("logType") LoggingConfigurationLogDestinationConfigLogType logType) {
        this.logDestination = logDestination;
        this.logDestinationType = logDestinationType;
        this.logType = logType;
    }

    /**
     * A key-value pair to configure the logDestinations.
     * 
    */
    public Object logDestination() {
        return this.logDestination;
    }
    public LoggingConfigurationLogDestinationConfigLogDestinationType logDestinationType() {
        return this.logDestinationType;
    }
    public LoggingConfigurationLogDestinationConfigLogType logType() {
        return this.logType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationLogDestinationConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object logDestination;
        private LoggingConfigurationLogDestinationConfigLogDestinationType logDestinationType;
        private LoggingConfigurationLogDestinationConfigLogType logType;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationLogDestinationConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDestination = defaults.logDestination;
    	      this.logDestinationType = defaults.logDestinationType;
    	      this.logType = defaults.logType;
        }

        public Builder logDestination(Object logDestination) {
            this.logDestination = Objects.requireNonNull(logDestination);
            return this;
        }
        public Builder logDestinationType(LoggingConfigurationLogDestinationConfigLogDestinationType logDestinationType) {
            this.logDestinationType = Objects.requireNonNull(logDestinationType);
            return this;
        }
        public Builder logType(LoggingConfigurationLogDestinationConfigLogType logType) {
            this.logType = Objects.requireNonNull(logType);
            return this;
        }        public LoggingConfigurationLogDestinationConfig build() {
            return new LoggingConfigurationLogDestinationConfig(logDestination, logDestinationType, logType);
        }
    }
}
