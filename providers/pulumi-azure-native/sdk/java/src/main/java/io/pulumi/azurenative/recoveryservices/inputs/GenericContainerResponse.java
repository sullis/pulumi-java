// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.GenericContainerExtendedInfoResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Base class for generic container of backup items
 * 
 */
public final class GenericContainerResponse extends io.pulumi.resources.InvokeArgs {

    public static final GenericContainerResponse Empty = new GenericContainerResponse();

    /**
     * Type of backup management for the container.
     * 
     */
    @InputImport(name="backupManagementType")
    private final @Nullable String backupManagementType;

    public Optional<String> getBackupManagementType() {
        return this.backupManagementType == null ? Optional.empty() : Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is 'GenericContainer'.
     * 
     */
    @InputImport(name="containerType", required=true)
    private final String containerType;

    public String getContainerType() {
        return this.containerType;
    }

    /**
     * Extended information (not returned in List container API calls)
     * 
     */
    @InputImport(name="extendedInformation")
    private final @Nullable GenericContainerExtendedInfoResponse extendedInformation;

    public Optional<GenericContainerExtendedInfoResponse> getExtendedInformation() {
        return this.extendedInformation == null ? Optional.empty() : Optional.ofNullable(this.extendedInformation);
    }

    /**
     * Name of the container's fabric
     * 
     */
    @InputImport(name="fabricName")
    private final @Nullable String fabricName;

    public Optional<String> getFabricName() {
        return this.fabricName == null ? Optional.empty() : Optional.ofNullable(this.fabricName);
    }

    /**
     * Friendly name of the container.
     * 
     */
    @InputImport(name="friendlyName")
    private final @Nullable String friendlyName;

    public Optional<String> getFriendlyName() {
        return this.friendlyName == null ? Optional.empty() : Optional.ofNullable(this.friendlyName);
    }

    /**
     * Status of health of the container.
     * 
     */
    @InputImport(name="healthStatus")
    private final @Nullable String healthStatus;

    public Optional<String> getHealthStatus() {
        return this.healthStatus == null ? Optional.empty() : Optional.ofNullable(this.healthStatus);
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @InputImport(name="registrationStatus")
    private final @Nullable String registrationStatus;

    public Optional<String> getRegistrationStatus() {
        return this.registrationStatus == null ? Optional.empty() : Optional.ofNullable(this.registrationStatus);
    }

    public GenericContainerResponse(
        @Nullable String backupManagementType,
        String containerType,
        @Nullable GenericContainerExtendedInfoResponse extendedInformation,
        @Nullable String fabricName,
        @Nullable String friendlyName,
        @Nullable String healthStatus,
        @Nullable String registrationStatus) {
        this.backupManagementType = backupManagementType;
        this.containerType = Objects.requireNonNull(containerType, "expected parameter 'containerType' to be non-null");
        this.extendedInformation = extendedInformation;
        this.fabricName = fabricName;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.registrationStatus = registrationStatus;
    }

    private GenericContainerResponse() {
        this.backupManagementType = null;
        this.containerType = null;
        this.extendedInformation = null;
        this.fabricName = null;
        this.friendlyName = null;
        this.healthStatus = null;
        this.registrationStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GenericContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String backupManagementType;
        private String containerType;
        private @Nullable GenericContainerExtendedInfoResponse extendedInformation;
        private @Nullable String fabricName;
        private @Nullable String friendlyName;
        private @Nullable String healthStatus;
        private @Nullable String registrationStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(GenericContainerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupManagementType = defaults.backupManagementType;
    	      this.containerType = defaults.containerType;
    	      this.extendedInformation = defaults.extendedInformation;
    	      this.fabricName = defaults.fabricName;
    	      this.friendlyName = defaults.friendlyName;
    	      this.healthStatus = defaults.healthStatus;
    	      this.registrationStatus = defaults.registrationStatus;
        }

        public Builder setBackupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }

        public Builder setContainerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }

        public Builder setExtendedInformation(@Nullable GenericContainerExtendedInfoResponse extendedInformation) {
            this.extendedInformation = extendedInformation;
            return this;
        }

        public Builder setFabricName(@Nullable String fabricName) {
            this.fabricName = fabricName;
            return this;
        }

        public Builder setFriendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }

        public Builder setHealthStatus(@Nullable String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }

        public Builder setRegistrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }

        public GenericContainerResponse build() {
            return new GenericContainerResponse(backupManagementType, containerType, extendedInformation, fabricName, friendlyName, healthStatus, registrationStatus);
        }
    }
}
