// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.notebooks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineVirtualMachineConfigArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RuntimeVirtualMachineArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuntimeVirtualMachineArgs Empty = new RuntimeVirtualMachineArgs();

    /**
     * - 
     * The unique identifier of the Managed Compute Engine instance.
     * 
     */
    @Import(name="instanceId")
    private @Nullable Output<String> instanceId;

    /**
     * @return -
     * The unique identifier of the Managed Compute Engine instance.
     * 
     */
    public Optional<Output<String>> instanceId() {
        return Optional.ofNullable(this.instanceId);
    }

    /**
     * - 
     * The user-friendly name of the Managed Compute Engine instance.
     * 
     */
    @Import(name="instanceName")
    private @Nullable Output<String> instanceName;

    /**
     * @return -
     * The user-friendly name of the Managed Compute Engine instance.
     * 
     */
    public Optional<Output<String>> instanceName() {
        return Optional.ofNullable(this.instanceName);
    }

    /**
     * Virtual Machine configuration settings.
     * Structure is documented below.
     * 
     */
    @Import(name="virtualMachineConfig")
    private @Nullable Output<RuntimeVirtualMachineVirtualMachineConfigArgs> virtualMachineConfig;

    /**
     * @return Virtual Machine configuration settings.
     * Structure is documented below.
     * 
     */
    public Optional<Output<RuntimeVirtualMachineVirtualMachineConfigArgs>> virtualMachineConfig() {
        return Optional.ofNullable(this.virtualMachineConfig);
    }

    private RuntimeVirtualMachineArgs() {}

    private RuntimeVirtualMachineArgs(RuntimeVirtualMachineArgs $) {
        this.instanceId = $.instanceId;
        this.instanceName = $.instanceName;
        this.virtualMachineConfig = $.virtualMachineConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuntimeVirtualMachineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuntimeVirtualMachineArgs $;

        public Builder() {
            $ = new RuntimeVirtualMachineArgs();
        }

        public Builder(RuntimeVirtualMachineArgs defaults) {
            $ = new RuntimeVirtualMachineArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param instanceId -
         * The unique identifier of the Managed Compute Engine instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(@Nullable Output<String> instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        /**
         * @param instanceId -
         * The unique identifier of the Managed Compute Engine instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceId(String instanceId) {
            return instanceId(Output.of(instanceId));
        }

        /**
         * @param instanceName -
         * The user-friendly name of the Managed Compute Engine instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(@Nullable Output<String> instanceName) {
            $.instanceName = instanceName;
            return this;
        }

        /**
         * @param instanceName -
         * The user-friendly name of the Managed Compute Engine instance.
         * 
         * @return builder
         * 
         */
        public Builder instanceName(String instanceName) {
            return instanceName(Output.of(instanceName));
        }

        /**
         * @param virtualMachineConfig Virtual Machine configuration settings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineConfig(@Nullable Output<RuntimeVirtualMachineVirtualMachineConfigArgs> virtualMachineConfig) {
            $.virtualMachineConfig = virtualMachineConfig;
            return this;
        }

        /**
         * @param virtualMachineConfig Virtual Machine configuration settings.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder virtualMachineConfig(RuntimeVirtualMachineVirtualMachineConfigArgs virtualMachineConfig) {
            return virtualMachineConfig(Output.of(virtualMachineConfig));
        }

        public RuntimeVirtualMachineArgs build() {
            return $;
        }
    }

}
