// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskDefinitionRuntimePlatform {
    private final @Nullable String cpuArchitecture;
    private final @Nullable String operatingSystemFamily;

    @CustomType.Constructor
    private TaskDefinitionRuntimePlatform(
        @CustomType.Parameter("cpuArchitecture") @Nullable String cpuArchitecture,
        @CustomType.Parameter("operatingSystemFamily") @Nullable String operatingSystemFamily) {
        this.cpuArchitecture = cpuArchitecture;
        this.operatingSystemFamily = operatingSystemFamily;
    }

    public Optional<String> cpuArchitecture() {
        return Optional.ofNullable(this.cpuArchitecture);
    }
    public Optional<String> operatingSystemFamily() {
        return Optional.ofNullable(this.operatingSystemFamily);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionRuntimePlatform defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cpuArchitecture;
        private @Nullable String operatingSystemFamily;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionRuntimePlatform defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpuArchitecture = defaults.cpuArchitecture;
    	      this.operatingSystemFamily = defaults.operatingSystemFamily;
        }

        public Builder cpuArchitecture(@Nullable String cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            return this;
        }
        public Builder operatingSystemFamily(@Nullable String operatingSystemFamily) {
            this.operatingSystemFamily = operatingSystemFamily;
            return this;
        }        public TaskDefinitionRuntimePlatform build() {
            return new TaskDefinitionRuntimePlatform(cpuArchitecture, operatingSystemFamily);
        }
    }
}
