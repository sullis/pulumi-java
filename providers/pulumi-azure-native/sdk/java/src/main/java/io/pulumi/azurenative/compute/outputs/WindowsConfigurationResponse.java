// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.AdditionalUnattendContentResponse;
import io.pulumi.azurenative.compute.outputs.PatchSettingsResponse;
import io.pulumi.azurenative.compute.outputs.WinRMConfigurationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WindowsConfigurationResponse {
    /**
     * Specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
     * 
     */
    private final @Nullable List<AdditionalUnattendContentResponse> additionalUnattendContent;
    /**
     * Indicates whether Automatic Updates is enabled for the Windows virtual machine. Default value is true. <br><br> For virtual machine scale sets, this property can be updated and updates will take effect on OS reprovisioning.
     * 
     */
    private final @Nullable Boolean enableAutomaticUpdates;
    /**
     * [Preview Feature] Specifies settings related to VM Guest Patching on Windows.
     * 
     */
    private final @Nullable PatchSettingsResponse patchSettings;
    /**
     * Indicates whether virtual machine agent should be provisioned on the virtual machine. <br><br> When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
     */
    private final @Nullable Boolean provisionVMAgent;
    /**
     * Specifies the time zone of the virtual machine. e.g. "Pacific Standard Time". <br><br> Possible values can be [TimeZoneInfo.Id](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id) value from time zones returned by [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.getsystemtimezones).
     * 
     */
    private final @Nullable String timeZone;
    /**
     * Specifies the Windows Remote Management listeners. This enables remote Windows PowerShell.
     * 
     */
    private final @Nullable WinRMConfigurationResponse winRM;

    @OutputCustomType.Constructor({"additionalUnattendContent","enableAutomaticUpdates","patchSettings","provisionVMAgent","timeZone","winRM"})
    private WindowsConfigurationResponse(
        @Nullable List<AdditionalUnattendContentResponse> additionalUnattendContent,
        @Nullable Boolean enableAutomaticUpdates,
        @Nullable PatchSettingsResponse patchSettings,
        @Nullable Boolean provisionVMAgent,
        @Nullable String timeZone,
        @Nullable WinRMConfigurationResponse winRM) {
        this.additionalUnattendContent = additionalUnattendContent;
        this.enableAutomaticUpdates = enableAutomaticUpdates;
        this.patchSettings = patchSettings;
        this.provisionVMAgent = provisionVMAgent;
        this.timeZone = timeZone;
        this.winRM = winRM;
    }

    /**
     * Specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
     * 
    */
    public List<AdditionalUnattendContentResponse> getAdditionalUnattendContent() {
        return this.additionalUnattendContent == null ? List.of() : this.additionalUnattendContent;
    }
    /**
     * Indicates whether Automatic Updates is enabled for the Windows virtual machine. Default value is true. <br><br> For virtual machine scale sets, this property can be updated and updates will take effect on OS reprovisioning.
     * 
    */
    public Optional<Boolean> getEnableAutomaticUpdates() {
        return Optional.ofNullable(this.enableAutomaticUpdates);
    }
    /**
     * [Preview Feature] Specifies settings related to VM Guest Patching on Windows.
     * 
    */
    public Optional<PatchSettingsResponse> getPatchSettings() {
        return Optional.ofNullable(this.patchSettings);
    }
    /**
     * Indicates whether virtual machine agent should be provisioned on the virtual machine. <br><br> When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
    */
    public Optional<Boolean> getProvisionVMAgent() {
        return Optional.ofNullable(this.provisionVMAgent);
    }
    /**
     * Specifies the time zone of the virtual machine. e.g. "Pacific Standard Time". <br><br> Possible values can be [TimeZoneInfo.Id](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id) value from time zones returned by [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.getsystemtimezones).
     * 
    */
    public Optional<String> getTimeZone() {
        return Optional.ofNullable(this.timeZone);
    }
    /**
     * Specifies the Windows Remote Management listeners. This enables remote Windows PowerShell.
     * 
    */
    public Optional<WinRMConfigurationResponse> getWinRM() {
        return Optional.ofNullable(this.winRM);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AdditionalUnattendContentResponse> additionalUnattendContent;
        private @Nullable Boolean enableAutomaticUpdates;
        private @Nullable PatchSettingsResponse patchSettings;
        private @Nullable Boolean provisionVMAgent;
        private @Nullable String timeZone;
        private @Nullable WinRMConfigurationResponse winRM;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalUnattendContent = defaults.additionalUnattendContent;
    	      this.enableAutomaticUpdates = defaults.enableAutomaticUpdates;
    	      this.patchSettings = defaults.patchSettings;
    	      this.provisionVMAgent = defaults.provisionVMAgent;
    	      this.timeZone = defaults.timeZone;
    	      this.winRM = defaults.winRM;
        }

        public Builder setAdditionalUnattendContent(@Nullable List<AdditionalUnattendContentResponse> additionalUnattendContent) {
            this.additionalUnattendContent = additionalUnattendContent;
            return this;
        }

        public Builder setEnableAutomaticUpdates(@Nullable Boolean enableAutomaticUpdates) {
            this.enableAutomaticUpdates = enableAutomaticUpdates;
            return this;
        }

        public Builder setPatchSettings(@Nullable PatchSettingsResponse patchSettings) {
            this.patchSettings = patchSettings;
            return this;
        }

        public Builder setProvisionVMAgent(@Nullable Boolean provisionVMAgent) {
            this.provisionVMAgent = provisionVMAgent;
            return this;
        }

        public Builder setTimeZone(@Nullable String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public Builder setWinRM(@Nullable WinRMConfigurationResponse winRM) {
            this.winRM = winRM;
            return this;
        }
        public WindowsConfigurationResponse build() {
            return new WindowsConfigurationResponse(additionalUnattendContent, enableAutomaticUpdates, patchSettings, provisionVMAgent, timeZone, winRM);
        }
    }
}