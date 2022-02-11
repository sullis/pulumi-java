// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.awsnative.ecs.outputs.TaskDefinitionSecret;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TaskDefinitionLogConfiguration {
    private final String logDriver;
    private final @Nullable Object options;
    private final @Nullable List<TaskDefinitionSecret> secretOptions;

    @OutputCustomType.Constructor({"logDriver","options","secretOptions"})
    private TaskDefinitionLogConfiguration(
        String logDriver,
        @Nullable Object options,
        @Nullable List<TaskDefinitionSecret> secretOptions) {
        this.logDriver = Objects.requireNonNull(logDriver);
        this.options = options;
        this.secretOptions = secretOptions;
    }

    public String getLogDriver() {
        return this.logDriver;
    }
    public Optional<Object> getOptions() {
        return Optional.ofNullable(this.options);
    }
    public List<TaskDefinitionSecret> getSecretOptions() {
        return this.secretOptions == null ? List.of() : this.secretOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionLogConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String logDriver;
        private @Nullable Object options;
        private @Nullable List<TaskDefinitionSecret> secretOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionLogConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logDriver = defaults.logDriver;
    	      this.options = defaults.options;
    	      this.secretOptions = defaults.secretOptions;
        }

        public Builder setLogDriver(String logDriver) {
            this.logDriver = Objects.requireNonNull(logDriver);
            return this;
        }

        public Builder setOptions(@Nullable Object options) {
            this.options = options;
            return this;
        }

        public Builder setSecretOptions(@Nullable List<TaskDefinitionSecret> secretOptions) {
            this.secretOptions = secretOptions;
            return this;
        }

        public TaskDefinitionLogConfiguration build() {
            return new TaskDefinitionLogConfiguration(logDriver, options, secretOptions);
        }
    }
}
