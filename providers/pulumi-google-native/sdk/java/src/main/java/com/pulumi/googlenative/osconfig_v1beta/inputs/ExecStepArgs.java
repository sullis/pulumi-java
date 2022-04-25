// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1beta.inputs.ExecStepConfigArgs;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A step that runs an executable for a PatchJob.
 * 
 */
public final class ExecStepArgs extends com.pulumi.resources.ResourceArgs {

    public static final ExecStepArgs Empty = new ExecStepArgs();

    /**
     * The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * 
     */
    @Import(name="linuxExecStepConfig")
    private @Nullable Output<ExecStepConfigArgs> linuxExecStepConfig;

    /**
     * @return The ExecStepConfig for all Linux VMs targeted by the PatchJob.
     * 
     */
    public Optional<Output<ExecStepConfigArgs>> linuxExecStepConfig() {
        return Optional.ofNullable(this.linuxExecStepConfig);
    }

    /**
     * The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * 
     */
    @Import(name="windowsExecStepConfig")
    private @Nullable Output<ExecStepConfigArgs> windowsExecStepConfig;

    /**
     * @return The ExecStepConfig for all Windows VMs targeted by the PatchJob.
     * 
     */
    public Optional<Output<ExecStepConfigArgs>> windowsExecStepConfig() {
        return Optional.ofNullable(this.windowsExecStepConfig);
    }

    private ExecStepArgs() {}

    private ExecStepArgs(ExecStepArgs $) {
        this.linuxExecStepConfig = $.linuxExecStepConfig;
        this.windowsExecStepConfig = $.windowsExecStepConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ExecStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ExecStepArgs $;

        public Builder() {
            $ = new ExecStepArgs();
        }

        public Builder(ExecStepArgs defaults) {
            $ = new ExecStepArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param linuxExecStepConfig The ExecStepConfig for all Linux VMs targeted by the PatchJob.
         * 
         * @return builder
         * 
         */
        public Builder linuxExecStepConfig(@Nullable Output<ExecStepConfigArgs> linuxExecStepConfig) {
            $.linuxExecStepConfig = linuxExecStepConfig;
            return this;
        }

        /**
         * @param linuxExecStepConfig The ExecStepConfig for all Linux VMs targeted by the PatchJob.
         * 
         * @return builder
         * 
         */
        public Builder linuxExecStepConfig(ExecStepConfigArgs linuxExecStepConfig) {
            return linuxExecStepConfig(Output.of(linuxExecStepConfig));
        }

        /**
         * @param windowsExecStepConfig The ExecStepConfig for all Windows VMs targeted by the PatchJob.
         * 
         * @return builder
         * 
         */
        public Builder windowsExecStepConfig(@Nullable Output<ExecStepConfigArgs> windowsExecStepConfig) {
            $.windowsExecStepConfig = windowsExecStepConfig;
            return this;
        }

        /**
         * @param windowsExecStepConfig The ExecStepConfig for all Windows VMs targeted by the PatchJob.
         * 
         * @return builder
         * 
         */
        public Builder windowsExecStepConfig(ExecStepConfigArgs windowsExecStepConfig) {
            return windowsExecStepConfig(Output.of(windowsExecStepConfig));
        }

        public ExecStepArgs build() {
            return $;
        }
    }

}
