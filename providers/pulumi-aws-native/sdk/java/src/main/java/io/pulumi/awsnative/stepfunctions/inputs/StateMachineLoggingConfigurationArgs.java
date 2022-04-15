// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.stepfunctions.inputs;

import io.pulumi.awsnative.stepfunctions.enums.StateMachineLoggingConfigurationLevel;
import io.pulumi.awsnative.stepfunctions.inputs.StateMachineLogDestinationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StateMachineLoggingConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final StateMachineLoggingConfigurationArgs Empty = new StateMachineLoggingConfigurationArgs();

    @Import(name="destinations")
      private final @Nullable Output<List<StateMachineLogDestinationArgs>> destinations;

    public Output<List<StateMachineLogDestinationArgs>> destinations() {
        return this.destinations == null ? Codegen.empty() : this.destinations;
    }

    @Import(name="includeExecutionData")
      private final @Nullable Output<Boolean> includeExecutionData;

    public Output<Boolean> includeExecutionData() {
        return this.includeExecutionData == null ? Codegen.empty() : this.includeExecutionData;
    }

    @Import(name="level")
      private final @Nullable Output<StateMachineLoggingConfigurationLevel> level;

    public Output<StateMachineLoggingConfigurationLevel> level() {
        return this.level == null ? Codegen.empty() : this.level;
    }

    public StateMachineLoggingConfigurationArgs(
        @Nullable Output<List<StateMachineLogDestinationArgs>> destinations,
        @Nullable Output<Boolean> includeExecutionData,
        @Nullable Output<StateMachineLoggingConfigurationLevel> level) {
        this.destinations = destinations;
        this.includeExecutionData = includeExecutionData;
        this.level = level;
    }

    private StateMachineLoggingConfigurationArgs() {
        this.destinations = Codegen.empty();
        this.includeExecutionData = Codegen.empty();
        this.level = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StateMachineLoggingConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<StateMachineLogDestinationArgs>> destinations;
        private @Nullable Output<Boolean> includeExecutionData;
        private @Nullable Output<StateMachineLoggingConfigurationLevel> level;

        public Builder() {
    	      // Empty
        }

        public Builder(StateMachineLoggingConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destinations = defaults.destinations;
    	      this.includeExecutionData = defaults.includeExecutionData;
    	      this.level = defaults.level;
        }

        public Builder destinations(@Nullable Output<List<StateMachineLogDestinationArgs>> destinations) {
            this.destinations = destinations;
            return this;
        }
        public Builder destinations(@Nullable List<StateMachineLogDestinationArgs> destinations) {
            this.destinations = Codegen.ofNullable(destinations);
            return this;
        }
        public Builder destinations(StateMachineLogDestinationArgs... destinations) {
            return destinations(List.of(destinations));
        }
        public Builder includeExecutionData(@Nullable Output<Boolean> includeExecutionData) {
            this.includeExecutionData = includeExecutionData;
            return this;
        }
        public Builder includeExecutionData(@Nullable Boolean includeExecutionData) {
            this.includeExecutionData = Codegen.ofNullable(includeExecutionData);
            return this;
        }
        public Builder level(@Nullable Output<StateMachineLoggingConfigurationLevel> level) {
            this.level = level;
            return this;
        }
        public Builder level(@Nullable StateMachineLoggingConfigurationLevel level) {
            this.level = Codegen.ofNullable(level);
            return this;
        }        public StateMachineLoggingConfigurationArgs build() {
            return new StateMachineLoggingConfigurationArgs(destinations, includeExecutionData, level);
        }
    }
}
