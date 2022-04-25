// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.guestconfiguration.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration setting of LCM (Local Configuration Manager).
 * 
 */
public final class ConfigurationSettingResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConfigurationSettingResponse Empty = new ConfigurationSettingResponse();

    /**
     * Specifies what happens after a reboot during the application of a configuration. The possible values are ContinueConfiguration and StopConfiguration
     * 
     */
    @Import(name="actionAfterReboot")
    private @Nullable String actionAfterReboot;

    /**
     * @return Specifies what happens after a reboot during the application of a configuration. The possible values are ContinueConfiguration and StopConfiguration
     * 
     */
    public Optional<String> actionAfterReboot() {
        return Optional.ofNullable(this.actionAfterReboot);
    }

    /**
     * If true - new configurations downloaded from the pull service are allowed to overwrite the old ones on the target node. Otherwise, false
     * 
     */
    @Import(name="allowModuleOverwrite")
    private @Nullable Boolean allowModuleOverwrite;

    /**
     * @return If true - new configurations downloaded from the pull service are allowed to overwrite the old ones on the target node. Otherwise, false
     * 
     */
    public Optional<Boolean> allowModuleOverwrite() {
        return Optional.ofNullable(this.allowModuleOverwrite);
    }

    /**
     * Specifies how the LCM(Local Configuration Manager) actually applies the configuration to the target nodes. Possible values are ApplyOnly, ApplyAndMonitor, and ApplyAndAutoCorrect.
     * 
     */
    @Import(name="configurationMode")
    private @Nullable String configurationMode;

    /**
     * @return Specifies how the LCM(Local Configuration Manager) actually applies the configuration to the target nodes. Possible values are ApplyOnly, ApplyAndMonitor, and ApplyAndAutoCorrect.
     * 
     */
    public Optional<String> configurationMode() {
        return Optional.ofNullable(this.configurationMode);
    }

    /**
     * How often, in minutes, the current configuration is checked and applied. This property is ignored if the ConfigurationMode property is set to ApplyOnly. The default value is 15.
     * 
     */
    @Import(name="configurationModeFrequencyMins")
    private @Nullable Double configurationModeFrequencyMins;

    /**
     * @return How often, in minutes, the current configuration is checked and applied. This property is ignored if the ConfigurationMode property is set to ApplyOnly. The default value is 15.
     * 
     */
    public Optional<Double> configurationModeFrequencyMins() {
        return Optional.ofNullable(this.configurationModeFrequencyMins);
    }

    /**
     * Set this to true to automatically reboot the node after a configuration that requires reboot is applied. Otherwise, you will have to manually reboot the node for any configuration that requires it. The default value is false. To use this setting when a reboot condition is enacted by something other than DSC (such as Windows Installer), combine this setting with the xPendingReboot module.
     * 
     */
    @Import(name="rebootIfNeeded")
    private @Nullable Boolean rebootIfNeeded;

    /**
     * @return Set this to true to automatically reboot the node after a configuration that requires reboot is applied. Otherwise, you will have to manually reboot the node for any configuration that requires it. The default value is false. To use this setting when a reboot condition is enacted by something other than DSC (such as Windows Installer), combine this setting with the xPendingReboot module.
     * 
     */
    public Optional<Boolean> rebootIfNeeded() {
        return Optional.ofNullable(this.rebootIfNeeded);
    }

    /**
     * The time interval, in minutes, at which the LCM checks a pull service to get updated configurations. This value is ignored if the LCM is not configured in pull mode. The default value is 30.
     * 
     */
    @Import(name="refreshFrequencyMins")
    private @Nullable Double refreshFrequencyMins;

    /**
     * @return The time interval, in minutes, at which the LCM checks a pull service to get updated configurations. This value is ignored if the LCM is not configured in pull mode. The default value is 30.
     * 
     */
    public Optional<Double> refreshFrequencyMins() {
        return Optional.ofNullable(this.refreshFrequencyMins);
    }

    private ConfigurationSettingResponse() {}

    private ConfigurationSettingResponse(ConfigurationSettingResponse $) {
        this.actionAfterReboot = $.actionAfterReboot;
        this.allowModuleOverwrite = $.allowModuleOverwrite;
        this.configurationMode = $.configurationMode;
        this.configurationModeFrequencyMins = $.configurationModeFrequencyMins;
        this.rebootIfNeeded = $.rebootIfNeeded;
        this.refreshFrequencyMins = $.refreshFrequencyMins;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationSettingResponse $;

        public Builder() {
            $ = new ConfigurationSettingResponse();
        }

        public Builder(ConfigurationSettingResponse defaults) {
            $ = new ConfigurationSettingResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param actionAfterReboot Specifies what happens after a reboot during the application of a configuration. The possible values are ContinueConfiguration and StopConfiguration
         * 
         * @return builder
         * 
         */
        public Builder actionAfterReboot(@Nullable String actionAfterReboot) {
            $.actionAfterReboot = actionAfterReboot;
            return this;
        }

        /**
         * @param allowModuleOverwrite If true - new configurations downloaded from the pull service are allowed to overwrite the old ones on the target node. Otherwise, false
         * 
         * @return builder
         * 
         */
        public Builder allowModuleOverwrite(@Nullable Boolean allowModuleOverwrite) {
            $.allowModuleOverwrite = allowModuleOverwrite;
            return this;
        }

        /**
         * @param configurationMode Specifies how the LCM(Local Configuration Manager) actually applies the configuration to the target nodes. Possible values are ApplyOnly, ApplyAndMonitor, and ApplyAndAutoCorrect.
         * 
         * @return builder
         * 
         */
        public Builder configurationMode(@Nullable String configurationMode) {
            $.configurationMode = configurationMode;
            return this;
        }

        /**
         * @param configurationModeFrequencyMins How often, in minutes, the current configuration is checked and applied. This property is ignored if the ConfigurationMode property is set to ApplyOnly. The default value is 15.
         * 
         * @return builder
         * 
         */
        public Builder configurationModeFrequencyMins(@Nullable Double configurationModeFrequencyMins) {
            $.configurationModeFrequencyMins = configurationModeFrequencyMins;
            return this;
        }

        /**
         * @param rebootIfNeeded Set this to true to automatically reboot the node after a configuration that requires reboot is applied. Otherwise, you will have to manually reboot the node for any configuration that requires it. The default value is false. To use this setting when a reboot condition is enacted by something other than DSC (such as Windows Installer), combine this setting with the xPendingReboot module.
         * 
         * @return builder
         * 
         */
        public Builder rebootIfNeeded(@Nullable Boolean rebootIfNeeded) {
            $.rebootIfNeeded = rebootIfNeeded;
            return this;
        }

        /**
         * @param refreshFrequencyMins The time interval, in minutes, at which the LCM checks a pull service to get updated configurations. This value is ignored if the LCM is not configured in pull mode. The default value is 30.
         * 
         * @return builder
         * 
         */
        public Builder refreshFrequencyMins(@Nullable Double refreshFrequencyMins) {
            $.refreshFrequencyMins = refreshFrequencyMins;
            return this;
        }

        public ConfigurationSettingResponse build() {
            $.configurationModeFrequencyMins = Codegen.doubleProp("configurationModeFrequencyMins").arg($.configurationModeFrequencyMins).def(1.5e+01).getNullable();
            $.refreshFrequencyMins = Codegen.doubleProp("refreshFrequencyMins").arg($.refreshFrequencyMins).def(3e+01).getNullable();
            return $;
        }
    }

}
