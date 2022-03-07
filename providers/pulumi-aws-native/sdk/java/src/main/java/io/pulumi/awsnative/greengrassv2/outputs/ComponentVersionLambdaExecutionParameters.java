// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.greengrassv2.outputs;

import io.pulumi.awsnative.greengrassv2.enums.ComponentVersionLambdaExecutionParametersInputPayloadEncodingType;
import io.pulumi.awsnative.greengrassv2.outputs.ComponentVersionLambdaEventSource;
import io.pulumi.awsnative.greengrassv2.outputs.ComponentVersionLambdaLinuxProcessParams;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComponentVersionLambdaExecutionParameters {
    private final @Nullable Object environmentVariables;
    private final @Nullable List<ComponentVersionLambdaEventSource> eventSources;
    private final @Nullable List<String> execArgs;
    private final @Nullable ComponentVersionLambdaExecutionParametersInputPayloadEncodingType inputPayloadEncodingType;
    private final @Nullable ComponentVersionLambdaLinuxProcessParams linuxProcessParams;
    private final @Nullable Integer maxIdleTimeInSeconds;
    private final @Nullable Integer maxInstancesCount;
    private final @Nullable Integer maxQueueSize;
    private final @Nullable Boolean pinned;
    private final @Nullable Integer statusTimeoutInSeconds;
    private final @Nullable Integer timeoutInSeconds;

    @OutputCustomType.Constructor({"environmentVariables","eventSources","execArgs","inputPayloadEncodingType","linuxProcessParams","maxIdleTimeInSeconds","maxInstancesCount","maxQueueSize","pinned","statusTimeoutInSeconds","timeoutInSeconds"})
    private ComponentVersionLambdaExecutionParameters(
        @Nullable Object environmentVariables,
        @Nullable List<ComponentVersionLambdaEventSource> eventSources,
        @Nullable List<String> execArgs,
        @Nullable ComponentVersionLambdaExecutionParametersInputPayloadEncodingType inputPayloadEncodingType,
        @Nullable ComponentVersionLambdaLinuxProcessParams linuxProcessParams,
        @Nullable Integer maxIdleTimeInSeconds,
        @Nullable Integer maxInstancesCount,
        @Nullable Integer maxQueueSize,
        @Nullable Boolean pinned,
        @Nullable Integer statusTimeoutInSeconds,
        @Nullable Integer timeoutInSeconds) {
        this.environmentVariables = environmentVariables;
        this.eventSources = eventSources;
        this.execArgs = execArgs;
        this.inputPayloadEncodingType = inputPayloadEncodingType;
        this.linuxProcessParams = linuxProcessParams;
        this.maxIdleTimeInSeconds = maxIdleTimeInSeconds;
        this.maxInstancesCount = maxInstancesCount;
        this.maxQueueSize = maxQueueSize;
        this.pinned = pinned;
        this.statusTimeoutInSeconds = statusTimeoutInSeconds;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    public Optional<Object> getEnvironmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }
    public List<ComponentVersionLambdaEventSource> getEventSources() {
        return this.eventSources == null ? List.of() : this.eventSources;
    }
    public List<String> getExecArgs() {
        return this.execArgs == null ? List.of() : this.execArgs;
    }
    public Optional<ComponentVersionLambdaExecutionParametersInputPayloadEncodingType> getInputPayloadEncodingType() {
        return Optional.ofNullable(this.inputPayloadEncodingType);
    }
    public Optional<ComponentVersionLambdaLinuxProcessParams> getLinuxProcessParams() {
        return Optional.ofNullable(this.linuxProcessParams);
    }
    public Optional<Integer> getMaxIdleTimeInSeconds() {
        return Optional.ofNullable(this.maxIdleTimeInSeconds);
    }
    public Optional<Integer> getMaxInstancesCount() {
        return Optional.ofNullable(this.maxInstancesCount);
    }
    public Optional<Integer> getMaxQueueSize() {
        return Optional.ofNullable(this.maxQueueSize);
    }
    public Optional<Boolean> getPinned() {
        return Optional.ofNullable(this.pinned);
    }
    public Optional<Integer> getStatusTimeoutInSeconds() {
        return Optional.ofNullable(this.statusTimeoutInSeconds);
    }
    public Optional<Integer> getTimeoutInSeconds() {
        return Optional.ofNullable(this.timeoutInSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentVersionLambdaExecutionParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object environmentVariables;
        private @Nullable List<ComponentVersionLambdaEventSource> eventSources;
        private @Nullable List<String> execArgs;
        private @Nullable ComponentVersionLambdaExecutionParametersInputPayloadEncodingType inputPayloadEncodingType;
        private @Nullable ComponentVersionLambdaLinuxProcessParams linuxProcessParams;
        private @Nullable Integer maxIdleTimeInSeconds;
        private @Nullable Integer maxInstancesCount;
        private @Nullable Integer maxQueueSize;
        private @Nullable Boolean pinned;
        private @Nullable Integer statusTimeoutInSeconds;
        private @Nullable Integer timeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(ComponentVersionLambdaExecutionParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.eventSources = defaults.eventSources;
    	      this.execArgs = defaults.execArgs;
    	      this.inputPayloadEncodingType = defaults.inputPayloadEncodingType;
    	      this.linuxProcessParams = defaults.linuxProcessParams;
    	      this.maxIdleTimeInSeconds = defaults.maxIdleTimeInSeconds;
    	      this.maxInstancesCount = defaults.maxInstancesCount;
    	      this.maxQueueSize = defaults.maxQueueSize;
    	      this.pinned = defaults.pinned;
    	      this.statusTimeoutInSeconds = defaults.statusTimeoutInSeconds;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
        }

        public Builder setEnvironmentVariables(@Nullable Object environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEventSources(@Nullable List<ComponentVersionLambdaEventSource> eventSources) {
            this.eventSources = eventSources;
            return this;
        }

        public Builder setExecArgs(@Nullable List<String> execArgs) {
            this.execArgs = execArgs;
            return this;
        }

        public Builder setInputPayloadEncodingType(@Nullable ComponentVersionLambdaExecutionParametersInputPayloadEncodingType inputPayloadEncodingType) {
            this.inputPayloadEncodingType = inputPayloadEncodingType;
            return this;
        }

        public Builder setLinuxProcessParams(@Nullable ComponentVersionLambdaLinuxProcessParams linuxProcessParams) {
            this.linuxProcessParams = linuxProcessParams;
            return this;
        }

        public Builder setMaxIdleTimeInSeconds(@Nullable Integer maxIdleTimeInSeconds) {
            this.maxIdleTimeInSeconds = maxIdleTimeInSeconds;
            return this;
        }

        public Builder setMaxInstancesCount(@Nullable Integer maxInstancesCount) {
            this.maxInstancesCount = maxInstancesCount;
            return this;
        }

        public Builder setMaxQueueSize(@Nullable Integer maxQueueSize) {
            this.maxQueueSize = maxQueueSize;
            return this;
        }

        public Builder setPinned(@Nullable Boolean pinned) {
            this.pinned = pinned;
            return this;
        }

        public Builder setStatusTimeoutInSeconds(@Nullable Integer statusTimeoutInSeconds) {
            this.statusTimeoutInSeconds = statusTimeoutInSeconds;
            return this;
        }

        public Builder setTimeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }
        public ComponentVersionLambdaExecutionParameters build() {
            return new ComponentVersionLambdaExecutionParameters(environmentVariables, eventSources, execArgs, inputPayloadEncodingType, linuxProcessParams, maxIdleTimeInSeconds, maxInstancesCount, maxQueueSize, pinned, statusTimeoutInSeconds, timeoutInSeconds);
        }
    }
}