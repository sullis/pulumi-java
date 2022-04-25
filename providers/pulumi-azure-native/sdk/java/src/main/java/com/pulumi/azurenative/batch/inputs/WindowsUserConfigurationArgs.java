// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.batch.inputs;

import com.pulumi.azurenative.batch.enums.LoginMode;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsUserConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsUserConfigurationArgs Empty = new WindowsUserConfigurationArgs();

    /**
     * Specifies login mode for the user. The default value for VirtualMachineConfiguration pools is interactive mode and for CloudServiceConfiguration pools is batch mode.
     * 
     */
    @Import(name="loginMode")
    private @Nullable Output<LoginMode> loginMode;

    /**
     * @return Specifies login mode for the user. The default value for VirtualMachineConfiguration pools is interactive mode and for CloudServiceConfiguration pools is batch mode.
     * 
     */
    public Optional<Output<LoginMode>> loginMode() {
        return Optional.ofNullable(this.loginMode);
    }

    private WindowsUserConfigurationArgs() {}

    private WindowsUserConfigurationArgs(WindowsUserConfigurationArgs $) {
        this.loginMode = $.loginMode;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsUserConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsUserConfigurationArgs $;

        public Builder() {
            $ = new WindowsUserConfigurationArgs();
        }

        public Builder(WindowsUserConfigurationArgs defaults) {
            $ = new WindowsUserConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param loginMode Specifies login mode for the user. The default value for VirtualMachineConfiguration pools is interactive mode and for CloudServiceConfiguration pools is batch mode.
         * 
         * @return builder
         * 
         */
        public Builder loginMode(@Nullable Output<LoginMode> loginMode) {
            $.loginMode = loginMode;
            return this;
        }

        /**
         * @param loginMode Specifies login mode for the user. The default value for VirtualMachineConfiguration pools is interactive mode and for CloudServiceConfiguration pools is batch mode.
         * 
         * @return builder
         * 
         */
        public Builder loginMode(LoginMode loginMode) {
            return loginMode(Output.of(loginMode));
        }

        public WindowsUserConfigurationArgs build() {
            return $;
        }
    }

}
