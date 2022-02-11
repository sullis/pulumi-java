// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.inputs;

import io.pulumi.awsnative.stepfunctions.enums.StateMachineLoggingConfigurationLevel;
import io.pulumi.awsnative.stepfunctions.inputs.StateMachineLogDestinationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StateMachineLoggingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StateMachineLoggingConfigurationArgs Empty = new StateMachineLoggingConfigurationArgs();

    @InputImport(name="destinations")
    private final @Nullable Input<List<StateMachineLogDestinationArgs>> destinations;

    public Input<List<StateMachineLogDestinationArgs>> getDestinations() {
        return this.destinations == null ? Input.empty() : this.destinations;
    }

    @InputImport(name="includeExecutionData")
    private final @Nullable Input<Boolean> includeExecutionData;

    public Input<Boolean> getIncludeExecutionData() {
        return this.includeExecutionData == null ? Input.empty() : this.includeExecutionData;
    }

    @InputImport(name="level")
    private final @Nullable Input<StateMachineLoggingConfigurationLevel> level;

    public Input<StateMachineLoggingConfigurationLevel> getLevel() {
        return this.level == null ? Input.empty() : this.level;
    }

    public StateMachineLoggingConfigurationArgs(
        @Nullable Input<List<StateMachineLogDestinationArgs>> destinations,
        @Nullable Input<Boolean> includeExecutionData,
        @Nullable Input<StateMachineLoggingConfigurationLevel> level) {
        this.destinations = destinations;
        this.includeExecutionData = includeExecutionData;
        this.level = level;
    }

    private StateMachineLoggingConfigurationArgs() {
        this.destinations = Input.empty();
        this.includeExecutionData = Input.empty();
        this.level = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineLoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<StateMachineLogDestinationArgs>> destinations;
        private @Nullable Input<Boolean> includeExecutionData;
        private @Nullable Input<StateMachineLoggingConfigurationLevel> level;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineLoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.includeExecutionData = defaults.includeExecutionData;
    	      this.level = defaults.level;
        }

        public Builder setDestinations(@Nullable Input<List<StateMachineLogDestinationArgs>> destinations) {
            this.destinations = destinations;
            return this;
        }

        public Builder setDestinations(@Nullable List<StateMachineLogDestinationArgs> destinations) {
            this.destinations = Input.ofNullable(destinations);
            return this;
        }

        public Builder setIncludeExecutionData(@Nullable Input<Boolean> includeExecutionData) {
            this.includeExecutionData = includeExecutionData;
            return this;
        }

        public Builder setIncludeExecutionData(@Nullable Boolean includeExecutionData) {
            this.includeExecutionData = Input.ofNullable(includeExecutionData);
            return this;
        }

        public Builder setLevel(@Nullable Input<StateMachineLoggingConfigurationLevel> level) {
            this.level = level;
            return this;
        }

        public Builder setLevel(@Nullable StateMachineLoggingConfigurationLevel level) {
            this.level = Input.ofNullable(level);
            return this;
        }

        public StateMachineLoggingConfigurationArgs build() {
            return new StateMachineLoggingConfigurationArgs(destinations, includeExecutionData, level);
        }
    }
}
