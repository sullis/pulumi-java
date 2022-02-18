// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.inputs.DiagnosticsProfileResponse;
import io.pulumi.azurenative.compute.inputs.HardwareProfileResponse;
import io.pulumi.azurenative.compute.inputs.OSProfileResponse;
import io.pulumi.azurenative.compute.inputs.RestorePointSourceVMStorageProfileResponse;
import io.pulumi.azurenative.compute.inputs.SecurityProfileResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the properties of the Virtual Machine for which the restore point was created. The properties provided are a subset and the snapshot of the overall Virtual Machine properties captured at the time of the restore point creation.
 * 
 */
public final class RestorePointSourceMetadataResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestorePointSourceMetadataResponse Empty = new RestorePointSourceMetadataResponse();

    /**
     * Gets the diagnostics profile.
     * 
     */
    @InputImport(name="diagnosticsProfile")
    private final @Nullable DiagnosticsProfileResponse diagnosticsProfile;

    public Optional<DiagnosticsProfileResponse> getDiagnosticsProfile() {
        return this.diagnosticsProfile == null ? Optional.empty() : Optional.ofNullable(this.diagnosticsProfile);
    }

    /**
     * Gets the hardware profile.
     * 
     */
    @InputImport(name="hardwareProfile")
    private final @Nullable HardwareProfileResponse hardwareProfile;

    public Optional<HardwareProfileResponse> getHardwareProfile() {
        return this.hardwareProfile == null ? Optional.empty() : Optional.ofNullable(this.hardwareProfile);
    }

    /**
     * Gets the license type, which is for bring your own license scenario.
     * 
     */
    @InputImport(name="licenseType")
    private final @Nullable String licenseType;

    public Optional<String> getLicenseType() {
        return this.licenseType == null ? Optional.empty() : Optional.ofNullable(this.licenseType);
    }

    /**
     * Location of the VM from which the restore point was created.
     * 
     */
    @InputImport(name="location")
    private final @Nullable String location;

    public Optional<String> getLocation() {
        return this.location == null ? Optional.empty() : Optional.ofNullable(this.location);
    }

    /**
     * Gets the OS profile.
     * 
     */
    @InputImport(name="osProfile")
    private final @Nullable OSProfileResponse osProfile;

    public Optional<OSProfileResponse> getOsProfile() {
        return this.osProfile == null ? Optional.empty() : Optional.ofNullable(this.osProfile);
    }

    /**
     * Gets the security profile.
     * 
     */
    @InputImport(name="securityProfile")
    private final @Nullable SecurityProfileResponse securityProfile;

    public Optional<SecurityProfileResponse> getSecurityProfile() {
        return this.securityProfile == null ? Optional.empty() : Optional.ofNullable(this.securityProfile);
    }

    /**
     * Gets the storage profile.
     * 
     */
    @InputImport(name="storageProfile")
    private final @Nullable RestorePointSourceVMStorageProfileResponse storageProfile;

    public Optional<RestorePointSourceVMStorageProfileResponse> getStorageProfile() {
        return this.storageProfile == null ? Optional.empty() : Optional.ofNullable(this.storageProfile);
    }

    /**
     * Gets the virtual machine unique id.
     * 
     */
    @InputImport(name="vmId")
    private final @Nullable String vmId;

    public Optional<String> getVmId() {
        return this.vmId == null ? Optional.empty() : Optional.ofNullable(this.vmId);
    }

    public RestorePointSourceMetadataResponse(
        @Nullable DiagnosticsProfileResponse diagnosticsProfile,
        @Nullable HardwareProfileResponse hardwareProfile,
        @Nullable String licenseType,
        @Nullable String location,
        @Nullable OSProfileResponse osProfile,
        @Nullable SecurityProfileResponse securityProfile,
        @Nullable RestorePointSourceVMStorageProfileResponse storageProfile,
        @Nullable String vmId) {
        this.diagnosticsProfile = diagnosticsProfile;
        this.hardwareProfile = hardwareProfile;
        this.licenseType = licenseType;
        this.location = location;
        this.osProfile = osProfile;
        this.securityProfile = securityProfile;
        this.storageProfile = storageProfile;
        this.vmId = vmId;
    }

    private RestorePointSourceMetadataResponse() {
        this.diagnosticsProfile = null;
        this.hardwareProfile = null;
        this.licenseType = null;
        this.location = null;
        this.osProfile = null;
        this.securityProfile = null;
        this.storageProfile = null;
        this.vmId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePointSourceMetadataResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DiagnosticsProfileResponse diagnosticsProfile;
        private @Nullable HardwareProfileResponse hardwareProfile;
        private @Nullable String licenseType;
        private @Nullable String location;
        private @Nullable OSProfileResponse osProfile;
        private @Nullable SecurityProfileResponse securityProfile;
        private @Nullable RestorePointSourceVMStorageProfileResponse storageProfile;
        private @Nullable String vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePointSourceMetadataResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.diagnosticsProfile = defaults.diagnosticsProfile;
    	      this.hardwareProfile = defaults.hardwareProfile;
    	      this.licenseType = defaults.licenseType;
    	      this.location = defaults.location;
    	      this.osProfile = defaults.osProfile;
    	      this.securityProfile = defaults.securityProfile;
    	      this.storageProfile = defaults.storageProfile;
    	      this.vmId = defaults.vmId;
        }

        public Builder setDiagnosticsProfile(@Nullable DiagnosticsProfileResponse diagnosticsProfile) {
            this.diagnosticsProfile = diagnosticsProfile;
            return this;
        }

        public Builder setHardwareProfile(@Nullable HardwareProfileResponse hardwareProfile) {
            this.hardwareProfile = hardwareProfile;
            return this;
        }

        public Builder setLicenseType(@Nullable String licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setOsProfile(@Nullable OSProfileResponse osProfile) {
            this.osProfile = osProfile;
            return this;
        }

        public Builder setSecurityProfile(@Nullable SecurityProfileResponse securityProfile) {
            this.securityProfile = securityProfile;
            return this;
        }

        public Builder setStorageProfile(@Nullable RestorePointSourceVMStorageProfileResponse storageProfile) {
            this.storageProfile = storageProfile;
            return this;
        }

        public Builder setVmId(@Nullable String vmId) {
            this.vmId = vmId;
            return this;
        }

        public RestorePointSourceMetadataResponse build() {
            return new RestorePointSourceMetadataResponse(diagnosticsProfile, hardwareProfile, licenseType, location, osProfile, securityProfile, storageProfile, vmId);
        }
    }
}
