// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apprunner.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceInstanceConfiguration {
    /**
     * CPU
     * 
     */
    private final @Nullable String cpu;
    /**
     * Instance Role Arn
     * 
     */
    private final @Nullable String instanceRoleArn;
    /**
     * Memory
     * 
     */
    private final @Nullable String memory;

    @CustomType.Constructor
    private ServiceInstanceConfiguration(
        @CustomType.Parameter("cpu") @Nullable String cpu,
        @CustomType.Parameter("instanceRoleArn") @Nullable String instanceRoleArn,
        @CustomType.Parameter("memory") @Nullable String memory) {
        this.cpu = cpu;
        this.instanceRoleArn = instanceRoleArn;
        this.memory = memory;
    }

    /**
     * CPU
     * 
    */
    public Optional<String> cpu() {
        return Optional.ofNullable(this.cpu);
    }
    /**
     * Instance Role Arn
     * 
    */
    public Optional<String> instanceRoleArn() {
        return Optional.ofNullable(this.instanceRoleArn);
    }
    /**
     * Memory
     * 
    */
    public Optional<String> memory() {
        return Optional.ofNullable(this.memory);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceInstanceConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cpu;
        private @Nullable String instanceRoleArn;
        private @Nullable String memory;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceInstanceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.instanceRoleArn = defaults.instanceRoleArn;
    	      this.memory = defaults.memory;
        }

        public Builder cpu(@Nullable String cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder instanceRoleArn(@Nullable String instanceRoleArn) {
            this.instanceRoleArn = instanceRoleArn;
            return this;
        }
        public Builder memory(@Nullable String memory) {
            this.memory = memory;
            return this;
        }        public ServiceInstanceConfiguration build() {
            return new ServiceInstanceConfiguration(cpu, instanceRoleArn, memory);
        }
    }
}
