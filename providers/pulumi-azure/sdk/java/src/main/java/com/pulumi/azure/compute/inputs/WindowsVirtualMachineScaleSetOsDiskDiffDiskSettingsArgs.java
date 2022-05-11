// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs Empty = new WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs();

    @Import(name="option", required=true)
    private Output<String> option;

    public Output<String> option() {
        return this.option;
    }

    private WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs() {}

    private WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs(WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs $) {
        this.option = $.option;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs $;

        public Builder() {
            $ = new WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs();
        }

        public Builder(WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs defaults) {
            $ = new WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder option(Output<String> option) {
            $.option = option;
            return this;
        }

        public Builder option(String option) {
            return option(Output.of(option));
        }

        public WindowsVirtualMachineScaleSetOsDiskDiffDiskSettingsArgs build() {
            $.option = Objects.requireNonNull($.option, "expected parameter 'option' to be non-null");
            return $;
        }
    }

}
