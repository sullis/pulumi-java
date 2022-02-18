// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DeploymentSettingsResponse {
    /**
     * Required CPU, basic tier should be 1, standard tier should be in range (1, 4)
     * 
     */
    private final @Nullable Integer cpu;
    /**
     * Collection of environment variables
     * 
     */
    private final @Nullable Map<String,String> environmentVariables;
    /**
     * JVM parameter
     * 
     */
    private final @Nullable String jvmOptions;
    /**
     * Required Memory size in GB, basic tier should be in range (1, 2), standard tier should be in range (1, 8)
     * 
     */
    private final @Nullable Integer memoryInGB;
    /**
     * The path to the .NET executable relative to zip root
     * 
     */
    private final @Nullable String netCoreMainEntryPath;
    /**
     * Runtime version
     * 
     */
    private final @Nullable String runtimeVersion;

    @OutputCustomType.Constructor({"cpu","environmentVariables","jvmOptions","memoryInGB","netCoreMainEntryPath","runtimeVersion"})
    private DeploymentSettingsResponse(
        @Nullable Integer cpu,
        @Nullable Map<String,String> environmentVariables,
        @Nullable String jvmOptions,
        @Nullable Integer memoryInGB,
        @Nullable String netCoreMainEntryPath,
        @Nullable String runtimeVersion) {
        this.cpu = cpu;
        this.environmentVariables = environmentVariables;
        this.jvmOptions = jvmOptions;
        this.memoryInGB = memoryInGB;
        this.netCoreMainEntryPath = netCoreMainEntryPath;
        this.runtimeVersion = runtimeVersion;
    }

    /**
     * Required CPU, basic tier should be 1, standard tier should be in range (1, 4)
     * 
     */
    public Optional<Integer> getCpu() {
        return Optional.ofNullable(this.cpu);
    }
    /**
     * Collection of environment variables
     * 
     */
    public Map<String,String> getEnvironmentVariables() {
        return this.environmentVariables == null ? Map.of() : this.environmentVariables;
    }
    /**
     * JVM parameter
     * 
     */
    public Optional<String> getJvmOptions() {
        return Optional.ofNullable(this.jvmOptions);
    }
    /**
     * Required Memory size in GB, basic tier should be in range (1, 2), standard tier should be in range (1, 8)
     * 
     */
    public Optional<Integer> getMemoryInGB() {
        return Optional.ofNullable(this.memoryInGB);
    }
    /**
     * The path to the .NET executable relative to zip root
     * 
     */
    public Optional<String> getNetCoreMainEntryPath() {
        return Optional.ofNullable(this.netCoreMainEntryPath);
    }
    /**
     * Runtime version
     * 
     */
    public Optional<String> getRuntimeVersion() {
        return Optional.ofNullable(this.runtimeVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer cpu;
        private @Nullable Map<String,String> environmentVariables;
        private @Nullable String jvmOptions;
        private @Nullable Integer memoryInGB;
        private @Nullable String netCoreMainEntryPath;
        private @Nullable String runtimeVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(DeploymentSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.jvmOptions = defaults.jvmOptions;
    	      this.memoryInGB = defaults.memoryInGB;
    	      this.netCoreMainEntryPath = defaults.netCoreMainEntryPath;
    	      this.runtimeVersion = defaults.runtimeVersion;
        }

        public Builder setCpu(@Nullable Integer cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setJvmOptions(@Nullable String jvmOptions) {
            this.jvmOptions = jvmOptions;
            return this;
        }

        public Builder setMemoryInGB(@Nullable Integer memoryInGB) {
            this.memoryInGB = memoryInGB;
            return this;
        }

        public Builder setNetCoreMainEntryPath(@Nullable String netCoreMainEntryPath) {
            this.netCoreMainEntryPath = netCoreMainEntryPath;
            return this;
        }

        public Builder setRuntimeVersion(@Nullable String runtimeVersion) {
            this.runtimeVersion = runtimeVersion;
            return this;
        }

        public DeploymentSettingsResponse build() {
            return new DeploymentSettingsResponse(cpu, environmentVariables, jvmOptions, memoryInGB, netCoreMainEntryPath, runtimeVersion);
        }
    }
}
