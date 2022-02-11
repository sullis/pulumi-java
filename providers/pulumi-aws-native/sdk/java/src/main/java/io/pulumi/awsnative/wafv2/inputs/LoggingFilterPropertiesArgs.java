// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.LoggingConfigurationLoggingFilterPropertiesDefaultBehavior;
import io.pulumi.awsnative.wafv2.inputs.LoggingConfigurationFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class LoggingFilterPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LoggingFilterPropertiesArgs Empty = new LoggingFilterPropertiesArgs();

    @InputImport(name="defaultBehavior", required=true)
    private final Input<LoggingConfigurationLoggingFilterPropertiesDefaultBehavior> defaultBehavior;

    public Input<LoggingConfigurationLoggingFilterPropertiesDefaultBehavior> getDefaultBehavior() {
        return this.defaultBehavior;
    }

    @InputImport(name="filters", required=true)
    private final Input<List<LoggingConfigurationFilterArgs>> filters;

    public Input<List<LoggingConfigurationFilterArgs>> getFilters() {
        return this.filters;
    }

    public LoggingFilterPropertiesArgs(
        Input<LoggingConfigurationLoggingFilterPropertiesDefaultBehavior> defaultBehavior,
        Input<List<LoggingConfigurationFilterArgs>> filters) {
        this.defaultBehavior = Objects.requireNonNull(defaultBehavior, "expected parameter 'defaultBehavior' to be non-null");
        this.filters = Objects.requireNonNull(filters, "expected parameter 'filters' to be non-null");
    }

    private LoggingFilterPropertiesArgs() {
        this.defaultBehavior = Input.empty();
        this.filters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingFilterPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<LoggingConfigurationLoggingFilterPropertiesDefaultBehavior> defaultBehavior;
        private Input<List<LoggingConfigurationFilterArgs>> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingFilterPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultBehavior = defaults.defaultBehavior;
    	      this.filters = defaults.filters;
        }

        public Builder setDefaultBehavior(Input<LoggingConfigurationLoggingFilterPropertiesDefaultBehavior> defaultBehavior) {
            this.defaultBehavior = Objects.requireNonNull(defaultBehavior);
            return this;
        }

        public Builder setDefaultBehavior(LoggingConfigurationLoggingFilterPropertiesDefaultBehavior defaultBehavior) {
            this.defaultBehavior = Input.of(Objects.requireNonNull(defaultBehavior));
            return this;
        }

        public Builder setFilters(Input<List<LoggingConfigurationFilterArgs>> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }

        public Builder setFilters(List<LoggingConfigurationFilterArgs> filters) {
            this.filters = Input.of(Objects.requireNonNull(filters));
            return this;
        }

        public LoggingFilterPropertiesArgs build() {
            return new LoggingFilterPropertiesArgs(defaultBehavior, filters);
        }
    }
}
