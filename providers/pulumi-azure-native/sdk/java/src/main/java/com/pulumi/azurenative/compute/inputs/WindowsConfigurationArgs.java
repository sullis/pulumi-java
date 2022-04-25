// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.azurenative.compute.inputs.AdditionalUnattendContentArgs;
import com.pulumi.azurenative.compute.inputs.PatchSettingsArgs;
import com.pulumi.azurenative.compute.inputs.WinRMConfigurationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies Windows operating system settings on the virtual machine.
 * 
 */
public final class WindowsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsConfigurationArgs Empty = new WindowsConfigurationArgs();

    /**
     * Specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
     * 
     */
    @Import(name="additionalUnattendContent")
    private @Nullable Output<List<AdditionalUnattendContentArgs>> additionalUnattendContent;

    /**
     * @return Specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
     * 
     */
    public Optional<Output<List<AdditionalUnattendContentArgs>>> additionalUnattendContent() {
        return Optional.ofNullable(this.additionalUnattendContent);
    }

    /**
     * Indicates whether Automatic Updates is enabled for the Windows virtual machine. Default value is true. &lt;br&gt;&lt;br&gt; For virtual machine scale sets, this property can be updated and updates will take effect on OS reprovisioning.
     * 
     */
    @Import(name="enableAutomaticUpdates")
    private @Nullable Output<Boolean> enableAutomaticUpdates;

    /**
     * @return Indicates whether Automatic Updates is enabled for the Windows virtual machine. Default value is true. &lt;br&gt;&lt;br&gt; For virtual machine scale sets, this property can be updated and updates will take effect on OS reprovisioning.
     * 
     */
    public Optional<Output<Boolean>> enableAutomaticUpdates() {
        return Optional.ofNullable(this.enableAutomaticUpdates);
    }

    /**
     * [Preview Feature] Specifies settings related to VM Guest Patching on Windows.
     * 
     */
    @Import(name="patchSettings")
    private @Nullable Output<PatchSettingsArgs> patchSettings;

    /**
     * @return [Preview Feature] Specifies settings related to VM Guest Patching on Windows.
     * 
     */
    public Optional<Output<PatchSettingsArgs>> patchSettings() {
        return Optional.ofNullable(this.patchSettings);
    }

    /**
     * Indicates whether virtual machine agent should be provisioned on the virtual machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
     */
    @Import(name="provisionVMAgent")
    private @Nullable Output<Boolean> provisionVMAgent;

    /**
     * @return Indicates whether virtual machine agent should be provisioned on the virtual machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
     * 
     */
    public Optional<Output<Boolean>> provisionVMAgent() {
        return Optional.ofNullable(this.provisionVMAgent);
    }

    /**
     * Specifies the time zone of the virtual machine. e.g. &#34;Pacific Standard Time&#34;. &lt;br&gt;&lt;br&gt; Possible values can be [TimeZoneInfo.Id](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id) value from time zones returned by [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.getsystemtimezones).
     * 
     */
    @Import(name="timeZone")
    private @Nullable Output<String> timeZone;

    /**
     * @return Specifies the time zone of the virtual machine. e.g. &#34;Pacific Standard Time&#34;. &lt;br&gt;&lt;br&gt; Possible values can be [TimeZoneInfo.Id](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id) value from time zones returned by [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.getsystemtimezones).
     * 
     */
    public Optional<Output<String>> timeZone() {
        return Optional.ofNullable(this.timeZone);
    }

    /**
     * Specifies the Windows Remote Management listeners. This enables remote Windows PowerShell.
     * 
     */
    @Import(name="winRM")
    private @Nullable Output<WinRMConfigurationArgs> winRM;

    /**
     * @return Specifies the Windows Remote Management listeners. This enables remote Windows PowerShell.
     * 
     */
    public Optional<Output<WinRMConfigurationArgs>> winRM() {
        return Optional.ofNullable(this.winRM);
    }

    private WindowsConfigurationArgs() {}

    private WindowsConfigurationArgs(WindowsConfigurationArgs $) {
        this.additionalUnattendContent = $.additionalUnattendContent;
        this.enableAutomaticUpdates = $.enableAutomaticUpdates;
        this.patchSettings = $.patchSettings;
        this.provisionVMAgent = $.provisionVMAgent;
        this.timeZone = $.timeZone;
        this.winRM = $.winRM;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsConfigurationArgs $;

        public Builder() {
            $ = new WindowsConfigurationArgs();
        }

        public Builder(WindowsConfigurationArgs defaults) {
            $ = new WindowsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param additionalUnattendContent Specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
         * 
         * @return builder
         * 
         */
        public Builder additionalUnattendContent(@Nullable Output<List<AdditionalUnattendContentArgs>> additionalUnattendContent) {
            $.additionalUnattendContent = additionalUnattendContent;
            return this;
        }

        /**
         * @param additionalUnattendContent Specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
         * 
         * @return builder
         * 
         */
        public Builder additionalUnattendContent(List<AdditionalUnattendContentArgs> additionalUnattendContent) {
            return additionalUnattendContent(Output.of(additionalUnattendContent));
        }

        /**
         * @param additionalUnattendContent Specifies additional base-64 encoded XML formatted information that can be included in the Unattend.xml file, which is used by Windows Setup.
         * 
         * @return builder
         * 
         */
        public Builder additionalUnattendContent(AdditionalUnattendContentArgs... additionalUnattendContent) {
            return additionalUnattendContent(List.of(additionalUnattendContent));
        }

        /**
         * @param enableAutomaticUpdates Indicates whether Automatic Updates is enabled for the Windows virtual machine. Default value is true. &lt;br&gt;&lt;br&gt; For virtual machine scale sets, this property can be updated and updates will take effect on OS reprovisioning.
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticUpdates(@Nullable Output<Boolean> enableAutomaticUpdates) {
            $.enableAutomaticUpdates = enableAutomaticUpdates;
            return this;
        }

        /**
         * @param enableAutomaticUpdates Indicates whether Automatic Updates is enabled for the Windows virtual machine. Default value is true. &lt;br&gt;&lt;br&gt; For virtual machine scale sets, this property can be updated and updates will take effect on OS reprovisioning.
         * 
         * @return builder
         * 
         */
        public Builder enableAutomaticUpdates(Boolean enableAutomaticUpdates) {
            return enableAutomaticUpdates(Output.of(enableAutomaticUpdates));
        }

        /**
         * @param patchSettings [Preview Feature] Specifies settings related to VM Guest Patching on Windows.
         * 
         * @return builder
         * 
         */
        public Builder patchSettings(@Nullable Output<PatchSettingsArgs> patchSettings) {
            $.patchSettings = patchSettings;
            return this;
        }

        /**
         * @param patchSettings [Preview Feature] Specifies settings related to VM Guest Patching on Windows.
         * 
         * @return builder
         * 
         */
        public Builder patchSettings(PatchSettingsArgs patchSettings) {
            return patchSettings(Output.of(patchSettings));
        }

        /**
         * @param provisionVMAgent Indicates whether virtual machine agent should be provisioned on the virtual machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
         * 
         * @return builder
         * 
         */
        public Builder provisionVMAgent(@Nullable Output<Boolean> provisionVMAgent) {
            $.provisionVMAgent = provisionVMAgent;
            return this;
        }

        /**
         * @param provisionVMAgent Indicates whether virtual machine agent should be provisioned on the virtual machine. &lt;br&gt;&lt;br&gt; When this property is not specified in the request body, default behavior is to set it to true.  This will ensure that VM Agent is installed on the VM so that extensions can be added to the VM later.
         * 
         * @return builder
         * 
         */
        public Builder provisionVMAgent(Boolean provisionVMAgent) {
            return provisionVMAgent(Output.of(provisionVMAgent));
        }

        /**
         * @param timeZone Specifies the time zone of the virtual machine. e.g. &#34;Pacific Standard Time&#34;. &lt;br&gt;&lt;br&gt; Possible values can be [TimeZoneInfo.Id](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id) value from time zones returned by [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.getsystemtimezones).
         * 
         * @return builder
         * 
         */
        public Builder timeZone(@Nullable Output<String> timeZone) {
            $.timeZone = timeZone;
            return this;
        }

        /**
         * @param timeZone Specifies the time zone of the virtual machine. e.g. &#34;Pacific Standard Time&#34;. &lt;br&gt;&lt;br&gt; Possible values can be [TimeZoneInfo.Id](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.id?#System_TimeZoneInfo_Id) value from time zones returned by [TimeZoneInfo.GetSystemTimeZones](https://docs.microsoft.com/dotnet/api/system.timezoneinfo.getsystemtimezones).
         * 
         * @return builder
         * 
         */
        public Builder timeZone(String timeZone) {
            return timeZone(Output.of(timeZone));
        }

        /**
         * @param winRM Specifies the Windows Remote Management listeners. This enables remote Windows PowerShell.
         * 
         * @return builder
         * 
         */
        public Builder winRM(@Nullable Output<WinRMConfigurationArgs> winRM) {
            $.winRM = winRM;
            return this;
        }

        /**
         * @param winRM Specifies the Windows Remote Management listeners. This enables remote Windows PowerShell.
         * 
         * @return builder
         * 
         */
        public Builder winRM(WinRMConfigurationArgs winRM) {
            return winRM(Output.of(winRM));
        }

        public WindowsConfigurationArgs build() {
            return $;
        }
    }

}
