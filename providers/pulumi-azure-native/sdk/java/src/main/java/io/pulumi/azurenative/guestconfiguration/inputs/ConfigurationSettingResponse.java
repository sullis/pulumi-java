// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.guestconfiguration.inputs;

import io.pulumi.core.internal.annotations.InputImport;
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
public final class ConfigurationSettingResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigurationSettingResponse Empty = new ConfigurationSettingResponse();

    /**
     * Specifies what happens after a reboot during the application of a configuration. The possible values are ContinueConfiguration and StopConfiguration
     * 
     */
    @InputImport(name="actionAfterReboot")
    private final @Nullable String actionAfterReboot;

    public Optional<String> getActionAfterReboot() {
        return this.actionAfterReboot == null ? Optional.empty() : Optional.ofNullable(this.actionAfterReboot);
    }

    /**
     * If true - new configurations downloaded from the pull service are allowed to overwrite the old ones on the target node. Otherwise, false
     * 
     */
    @InputImport(name="allowModuleOverwrite")
    private final @Nullable Boolean allowModuleOverwrite;

    public Optional<Boolean> getAllowModuleOverwrite() {
        return this.allowModuleOverwrite == null ? Optional.empty() : Optional.ofNullable(this.allowModuleOverwrite);
    }

    /**
     * Specifies how the LCM(Local Configuration Manager) actually applies the configuration to the target nodes. Possible values are ApplyOnly, ApplyAndMonitor, and ApplyAndAutoCorrect.
     * 
     */
    @InputImport(name="configurationMode")
    private final @Nullable String configurationMode;

    public Optional<String> getConfigurationMode() {
        return this.configurationMode == null ? Optional.empty() : Optional.ofNullable(this.configurationMode);
    }

    /**
     * How often, in minutes, the current configuration is checked and applied. This property is ignored if the ConfigurationMode property is set to ApplyOnly. The default value is 15.
     * 
     */
    @InputImport(name="configurationModeFrequencyMins")
    private final @Nullable Double configurationModeFrequencyMins;

    public Optional<Double> getConfigurationModeFrequencyMins() {
        return this.configurationModeFrequencyMins == null ? Optional.empty() : Optional.ofNullable(this.configurationModeFrequencyMins);
    }

    /**
     * Set this to true to automatically reboot the node after a configuration that requires reboot is applied. Otherwise, you will have to manually reboot the node for any configuration that requires it. The default value is false. To use this setting when a reboot condition is enacted by something other than DSC (such as Windows Installer), combine this setting with the xPendingReboot module.
     * 
     */
    @InputImport(name="rebootIfNeeded")
    private final @Nullable Boolean rebootIfNeeded;

    public Optional<Boolean> getRebootIfNeeded() {
        return this.rebootIfNeeded == null ? Optional.empty() : Optional.ofNullable(this.rebootIfNeeded);
    }

    /**
     * The time interval, in minutes, at which the LCM checks a pull service to get updated configurations. This value is ignored if the LCM is not configured in pull mode. The default value is 30.
     * 
     */
    @InputImport(name="refreshFrequencyMins")
    private final @Nullable Double refreshFrequencyMins;

    public Optional<Double> getRefreshFrequencyMins() {
        return this.refreshFrequencyMins == null ? Optional.empty() : Optional.ofNullable(this.refreshFrequencyMins);
    }

    public ConfigurationSettingResponse(
        @Nullable String actionAfterReboot,
        @Nullable Boolean allowModuleOverwrite,
        @Nullable String configurationMode,
        @Nullable Double configurationModeFrequencyMins,
        @Nullable Boolean rebootIfNeeded,
        @Nullable Double refreshFrequencyMins) {
        this.actionAfterReboot = actionAfterReboot;
        this.allowModuleOverwrite = allowModuleOverwrite;
        this.configurationMode = configurationMode;
        this.configurationModeFrequencyMins = configurationModeFrequencyMins == null ? 1.5e+01 : configurationModeFrequencyMins;
        this.rebootIfNeeded = rebootIfNeeded;
        this.refreshFrequencyMins = refreshFrequencyMins == null ? 3e+01 : refreshFrequencyMins;
    }

    private ConfigurationSettingResponse() {
        this.actionAfterReboot = null;
        this.allowModuleOverwrite = null;
        this.configurationMode = null;
        this.configurationModeFrequencyMins = null;
        this.rebootIfNeeded = null;
        this.refreshFrequencyMins = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationSettingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String actionAfterReboot;
        private @Nullable Boolean allowModuleOverwrite;
        private @Nullable String configurationMode;
        private @Nullable Double configurationModeFrequencyMins;
        private @Nullable Boolean rebootIfNeeded;
        private @Nullable Double refreshFrequencyMins;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationSettingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actionAfterReboot = defaults.actionAfterReboot;
    	      this.allowModuleOverwrite = defaults.allowModuleOverwrite;
    	      this.configurationMode = defaults.configurationMode;
    	      this.configurationModeFrequencyMins = defaults.configurationModeFrequencyMins;
    	      this.rebootIfNeeded = defaults.rebootIfNeeded;
    	      this.refreshFrequencyMins = defaults.refreshFrequencyMins;
        }

        public Builder setActionAfterReboot(@Nullable String actionAfterReboot) {
            this.actionAfterReboot = actionAfterReboot;
            return this;
        }

        public Builder setAllowModuleOverwrite(@Nullable Boolean allowModuleOverwrite) {
            this.allowModuleOverwrite = allowModuleOverwrite;
            return this;
        }

        public Builder setConfigurationMode(@Nullable String configurationMode) {
            this.configurationMode = configurationMode;
            return this;
        }

        public Builder setConfigurationModeFrequencyMins(@Nullable Double configurationModeFrequencyMins) {
            this.configurationModeFrequencyMins = configurationModeFrequencyMins;
            return this;
        }

        public Builder setRebootIfNeeded(@Nullable Boolean rebootIfNeeded) {
            this.rebootIfNeeded = rebootIfNeeded;
            return this;
        }

        public Builder setRefreshFrequencyMins(@Nullable Double refreshFrequencyMins) {
            this.refreshFrequencyMins = refreshFrequencyMins;
            return this;
        }

        public ConfigurationSettingResponse build() {
            return new ConfigurationSettingResponse(actionAfterReboot, allowModuleOverwrite, configurationMode, configurationModeFrequencyMins, rebootIfNeeded, refreshFrequencyMins);
        }
    }
}
