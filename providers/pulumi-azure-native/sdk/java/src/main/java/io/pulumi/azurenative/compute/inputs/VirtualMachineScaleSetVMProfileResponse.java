// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.BillingProfileResponse;
import io.pulumi.azurenative.compute.inputs.DiagnosticsProfileResponse;
import io.pulumi.azurenative.compute.inputs.ScheduledEventsProfileResponse;
import io.pulumi.azurenative.compute.inputs.SecurityProfileResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetExtensionProfileResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetNetworkProfileResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetOSProfileResponse;
import io.pulumi.azurenative.compute.inputs.VirtualMachineScaleSetStorageProfileResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a virtual machine scale set virtual machine profile.
 * 
 */
public final class VirtualMachineScaleSetVMProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachineScaleSetVMProfileResponse Empty = new VirtualMachineScaleSetVMProfileResponse();

    /**
     * Specifies the billing related details of a Azure Spot VMSS. <br><br>Minimum api-version: 2019-03-01.
     * 
     */
    @InputImport(name="billingProfile")
      private final @Nullable BillingProfileResponse billingProfile;

    public Optional<BillingProfileResponse> getBillingProfile() {
        return this.billingProfile == null ? Optional.empty() : Optional.ofNullable(this.billingProfile);
    }

    /**
     * Specifies the boot diagnostic settings state. <br><br>Minimum api-version: 2015-06-15.
     * 
     */
    @InputImport(name="diagnosticsProfile")
      private final @Nullable DiagnosticsProfileResponse diagnosticsProfile;

    public Optional<DiagnosticsProfileResponse> getDiagnosticsProfile() {
        return this.diagnosticsProfile == null ? Optional.empty() : Optional.ofNullable(this.diagnosticsProfile);
    }

    /**
     * Specifies the eviction policy for the Azure Spot virtual machine and Azure Spot scale set. <br><br>For Azure Spot virtual machines, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2019-03-01. <br><br>For Azure Spot scale sets, both 'Deallocate' and 'Delete' are supported and the minimum api-version is 2017-10-30-preview.
     * 
     */
    @InputImport(name="evictionPolicy")
      private final @Nullable String evictionPolicy;

    public Optional<String> getEvictionPolicy() {
        return this.evictionPolicy == null ? Optional.empty() : Optional.ofNullable(this.evictionPolicy);
    }

    /**
     * Specifies a collection of settings for extensions installed on virtual machines in the scale set.
     * 
     */
    @InputImport(name="extensionProfile")
      private final @Nullable VirtualMachineScaleSetExtensionProfileResponse extensionProfile;

    public Optional<VirtualMachineScaleSetExtensionProfileResponse> getExtensionProfile() {
        return this.extensionProfile == null ? Optional.empty() : Optional.ofNullable(this.extensionProfile);
    }

    /**
     * Specifies that the image or disk that is being used was licensed on-premises. <br><br> Possible values for Windows Server operating system are: <br><br> Windows_Client <br><br> Windows_Server <br><br> Possible values for Linux Server operating system are: <br><br> RHEL_BYOS (for RHEL) <br><br> SLES_BYOS (for SUSE) <br><br> For more information, see [Azure Hybrid Use Benefit for Windows Server](https://docs.microsoft.com/azure/virtual-machines/windows/hybrid-use-benefit-licensing) <br><br> [Azure Hybrid Use Benefit for Linux Server](https://docs.microsoft.com/azure/virtual-machines/linux/azure-hybrid-benefit-linux) <br><br> Minimum api-version: 2015-06-15
     * 
     */
    @InputImport(name="licenseType")
      private final @Nullable String licenseType;

    public Optional<String> getLicenseType() {
        return this.licenseType == null ? Optional.empty() : Optional.ofNullable(this.licenseType);
    }

    /**
     * Specifies properties of the network interfaces of the virtual machines in the scale set.
     * 
     */
    @InputImport(name="networkProfile")
      private final @Nullable VirtualMachineScaleSetNetworkProfileResponse networkProfile;

    public Optional<VirtualMachineScaleSetNetworkProfileResponse> getNetworkProfile() {
        return this.networkProfile == null ? Optional.empty() : Optional.ofNullable(this.networkProfile);
    }

    /**
     * Specifies the operating system settings for the virtual machines in the scale set.
     * 
     */
    @InputImport(name="osProfile")
      private final @Nullable VirtualMachineScaleSetOSProfileResponse osProfile;

    public Optional<VirtualMachineScaleSetOSProfileResponse> getOsProfile() {
        return this.osProfile == null ? Optional.empty() : Optional.ofNullable(this.osProfile);
    }

    /**
     * Specifies the priority for the virtual machines in the scale set. <br><br>Minimum api-version: 2017-10-30-preview
     * 
     */
    @InputImport(name="priority")
      private final @Nullable String priority;

    public Optional<String> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    /**
     * Specifies Scheduled Event related configurations.
     * 
     */
    @InputImport(name="scheduledEventsProfile")
      private final @Nullable ScheduledEventsProfileResponse scheduledEventsProfile;

    public Optional<ScheduledEventsProfileResponse> getScheduledEventsProfile() {
        return this.scheduledEventsProfile == null ? Optional.empty() : Optional.ofNullable(this.scheduledEventsProfile);
    }

    /**
     * Specifies the Security related profile settings for the virtual machines in the scale set.
     * 
     */
    @InputImport(name="securityProfile")
      private final @Nullable SecurityProfileResponse securityProfile;

    public Optional<SecurityProfileResponse> getSecurityProfile() {
        return this.securityProfile == null ? Optional.empty() : Optional.ofNullable(this.securityProfile);
    }

    /**
     * Specifies the storage settings for the virtual machine disks.
     * 
     */
    @InputImport(name="storageProfile")
      private final @Nullable VirtualMachineScaleSetStorageProfileResponse storageProfile;

    public Optional<VirtualMachineScaleSetStorageProfileResponse> getStorageProfile() {
        return this.storageProfile == null ? Optional.empty() : Optional.ofNullable(this.storageProfile);
    }

    /**
     * UserData for the virtual machines in the scale set, which must be base-64 encoded. Customer should not pass any secrets in here. <br><br>Minimum api-version: 2021-03-01
     * 
     */
    @InputImport(name="userData")
      private final @Nullable String userData;

    public Optional<String> getUserData() {
        return this.userData == null ? Optional.empty() : Optional.ofNullable(this.userData);
    }

    public VirtualMachineScaleSetVMProfileResponse(
        @Nullable BillingProfileResponse billingProfile,
        @Nullable DiagnosticsProfileResponse diagnosticsProfile,
        @Nullable String evictionPolicy,
        @Nullable VirtualMachineScaleSetExtensionProfileResponse extensionProfile,
        @Nullable String licenseType,
        @Nullable VirtualMachineScaleSetNetworkProfileResponse networkProfile,
        @Nullable VirtualMachineScaleSetOSProfileResponse osProfile,
        @Nullable String priority,
        @Nullable ScheduledEventsProfileResponse scheduledEventsProfile,
        @Nullable SecurityProfileResponse securityProfile,
        @Nullable VirtualMachineScaleSetStorageProfileResponse storageProfile,
        @Nullable String userData) {
        this.billingProfile = billingProfile;
        this.diagnosticsProfile = diagnosticsProfile;
        this.evictionPolicy = evictionPolicy;
        this.extensionProfile = extensionProfile;
        this.licenseType = licenseType;
        this.networkProfile = networkProfile;
        this.osProfile = osProfile;
        this.priority = priority;
        this.scheduledEventsProfile = scheduledEventsProfile;
        this.securityProfile = securityProfile;
        this.storageProfile = storageProfile;
        this.userData = userData;
    }

    private VirtualMachineScaleSetVMProfileResponse() {
        this.billingProfile = null;
        this.diagnosticsProfile = null;
        this.evictionPolicy = null;
        this.extensionProfile = null;
        this.licenseType = null;
        this.networkProfile = null;
        this.osProfile = null;
        this.priority = null;
        this.scheduledEventsProfile = null;
        this.securityProfile = null;
        this.storageProfile = null;
        this.userData = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetVMProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BillingProfileResponse billingProfile;
        private @Nullable DiagnosticsProfileResponse diagnosticsProfile;
        private @Nullable String evictionPolicy;
        private @Nullable VirtualMachineScaleSetExtensionProfileResponse extensionProfile;
        private @Nullable String licenseType;
        private @Nullable VirtualMachineScaleSetNetworkProfileResponse networkProfile;
        private @Nullable VirtualMachineScaleSetOSProfileResponse osProfile;
        private @Nullable String priority;
        private @Nullable ScheduledEventsProfileResponse scheduledEventsProfile;
        private @Nullable SecurityProfileResponse securityProfile;
        private @Nullable VirtualMachineScaleSetStorageProfileResponse storageProfile;
        private @Nullable String userData;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetVMProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.billingProfile = defaults.billingProfile;
    	      this.diagnosticsProfile = defaults.diagnosticsProfile;
    	      this.evictionPolicy = defaults.evictionPolicy;
    	      this.extensionProfile = defaults.extensionProfile;
    	      this.licenseType = defaults.licenseType;
    	      this.networkProfile = defaults.networkProfile;
    	      this.osProfile = defaults.osProfile;
    	      this.priority = defaults.priority;
    	      this.scheduledEventsProfile = defaults.scheduledEventsProfile;
    	      this.securityProfile = defaults.securityProfile;
    	      this.storageProfile = defaults.storageProfile;
    	      this.userData = defaults.userData;
        }

        public Builder setBillingProfile(@Nullable BillingProfileResponse billingProfile) {
            this.billingProfile = billingProfile;
            return this;
        }

        public Builder setDiagnosticsProfile(@Nullable DiagnosticsProfileResponse diagnosticsProfile) {
            this.diagnosticsProfile = diagnosticsProfile;
            return this;
        }

        public Builder setEvictionPolicy(@Nullable String evictionPolicy) {
            this.evictionPolicy = evictionPolicy;
            return this;
        }

        public Builder setExtensionProfile(@Nullable VirtualMachineScaleSetExtensionProfileResponse extensionProfile) {
            this.extensionProfile = extensionProfile;
            return this;
        }

        public Builder setLicenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setNetworkProfile(@Nullable VirtualMachineScaleSetNetworkProfileResponse networkProfile) {
            this.networkProfile = networkProfile;
            return this;
        }

        public Builder setOsProfile(@Nullable VirtualMachineScaleSetOSProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder setPriority(@Nullable String priority) {
            this.priority = priority;
            return this;
        }

        public Builder setScheduledEventsProfile(@Nullable ScheduledEventsProfileResponse scheduledEventsProfile) {
            this.scheduledEventsProfile = scheduledEventsProfile;
            return this;
        }

        public Builder setSecurityProfile(@Nullable SecurityProfileResponse securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }

        public Builder setStorageProfile(@Nullable VirtualMachineScaleSetStorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setUserData(@Nullable String userData) {
            this.userData = userData;
            return this;
        }
        public VirtualMachineScaleSetVMProfileResponse build() {
            return new VirtualMachineScaleSetVMProfileResponse(billingProfile, diagnosticsProfile, evictionPolicy, extensionProfile, licenseType, networkProfile, osProfile, priority, scheduledEventsProfile, securityProfile, storageProfile, userData);
        }
    }
}