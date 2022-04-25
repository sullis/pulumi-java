// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.inputs.ExecutionConfigArgs;
import com.pulumi.googlenative.dataproc_v1.inputs.PeripheralsConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Environment configuration for a workload.
 * 
 */
public final class EnvironmentConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final EnvironmentConfigArgs Empty = new EnvironmentConfigArgs();

    /**
     * Optional. Execution configuration for a workload.
     * 
     */
    @Import(name="executionConfig")
    private @Nullable Output<ExecutionConfigArgs> executionConfig;

    /**
     * @return Optional. Execution configuration for a workload.
     * 
     */
    public Optional<Output<ExecutionConfigArgs>> executionConfig() {
        return Optional.ofNullable(this.executionConfig);
    }

    /**
     * Optional. Peripherals configuration that workload has access to.
     * 
     */
    @Import(name="peripheralsConfig")
    private @Nullable Output<PeripheralsConfigArgs> peripheralsConfig;

    /**
     * @return Optional. Peripherals configuration that workload has access to.
     * 
     */
    public Optional<Output<PeripheralsConfigArgs>> peripheralsConfig() {
        return Optional.ofNullable(this.peripheralsConfig);
    }

    private EnvironmentConfigArgs() {}

    private EnvironmentConfigArgs(EnvironmentConfigArgs $) {
        this.executionConfig = $.executionConfig;
        this.peripheralsConfig = $.peripheralsConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EnvironmentConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EnvironmentConfigArgs $;

        public Builder() {
            $ = new EnvironmentConfigArgs();
        }

        public Builder(EnvironmentConfigArgs defaults) {
            $ = new EnvironmentConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param executionConfig Optional. Execution configuration for a workload.
         * 
         * @return builder
         * 
         */
        public Builder executionConfig(@Nullable Output<ExecutionConfigArgs> executionConfig) {
            $.executionConfig = executionConfig;
            return this;
        }

        /**
         * @param executionConfig Optional. Execution configuration for a workload.
         * 
         * @return builder
         * 
         */
        public Builder executionConfig(ExecutionConfigArgs executionConfig) {
            return executionConfig(Output.of(executionConfig));
        }

        /**
         * @param peripheralsConfig Optional. Peripherals configuration that workload has access to.
         * 
         * @return builder
         * 
         */
        public Builder peripheralsConfig(@Nullable Output<PeripheralsConfigArgs> peripheralsConfig) {
            $.peripheralsConfig = peripheralsConfig;
            return this;
        }

        /**
         * @param peripheralsConfig Optional. Peripherals configuration that workload has access to.
         * 
         * @return builder
         * 
         */
        public Builder peripheralsConfig(PeripheralsConfigArgs peripheralsConfig) {
            return peripheralsConfig(Output.of(peripheralsConfig));
        }

        public EnvironmentConfigArgs build() {
            return $;
        }
    }

}
