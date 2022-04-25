// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.outputs;

import com.pulumi.azurenative.recoveryservices.outputs.GenericContainerExtendedInfoResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GenericContainerResponse {
    /**
     * @return Type of backup management for the container.
     * 
     */
    private final @Nullable String backupManagementType;
    /**
     * @return Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;GenericContainer&#39;.
     * 
     */
    private final String containerType;
    /**
     * @return Extended information (not returned in List container API calls)
     * 
     */
    private final @Nullable GenericContainerExtendedInfoResponse extendedInformation;
    /**
     * @return Name of the container&#39;s fabric
     * 
     */
    private final @Nullable String fabricName;
    /**
     * @return Friendly name of the container.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * @return Status of health of the container.
     * 
     */
    private final @Nullable String healthStatus;
    /**
     * @return Status of registration of the container with the Recovery Services Vault.
     * 
     */
    private final @Nullable String registrationStatus;

    @CustomType.Constructor
    private GenericContainerResponse(
        @CustomType.Parameter("backupManagementType") @Nullable String backupManagementType,
        @CustomType.Parameter("containerType") String containerType,
        @CustomType.Parameter("extendedInformation") @Nullable GenericContainerExtendedInfoResponse extendedInformation,
        @CustomType.Parameter("fabricName") @Nullable String fabricName,
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("healthStatus") @Nullable String healthStatus,
        @CustomType.Parameter("registrationStatus") @Nullable String registrationStatus) {
        this.backupManagementType = backupManagementType;
        this.containerType = containerType;
        this.extendedInformation = extendedInformation;
        this.fabricName = fabricName;
        this.friendlyName = friendlyName;
        this.healthStatus = healthStatus;
        this.registrationStatus = registrationStatus;
    }

    /**
     * @return Type of backup management for the container.
     * 
     */
    public Optional<String> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }
    /**
     * @return Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;GenericContainer&#39;.
     * 
     */
    public String containerType() {
        return this.containerType;
    }
    /**
     * @return Extended information (not returned in List container API calls)
     * 
     */
    public Optional<GenericContainerExtendedInfoResponse> extendedInformation() {
        return Optional.ofNullable(this.extendedInformation);
    }
    /**
     * @return Name of the container&#39;s fabric
     * 
     */
    public Optional<String> fabricName() {
        return Optional.ofNullable(this.fabricName);
    }
    /**
     * @return Friendly name of the container.
     * 
     */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * @return Status of health of the container.
     * 
     */
    public Optional<String> healthStatus() {
        return Optional.ofNullable(this.healthStatus);
    }
    /**
     * @return Status of registration of the container with the Recovery Services Vault.
     * 
     */
    public Optional<String> registrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
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

        public Builder backupManagementType(@Nullable String backupManagementType) {
            this.backupManagementType = backupManagementType;
            return this;
        }
        public Builder containerType(String containerType) {
            this.containerType = Objects.requireNonNull(containerType);
            return this;
        }
        public Builder extendedInformation(@Nullable GenericContainerExtendedInfoResponse extendedInformation) {
            this.extendedInformation = extendedInformation;
            return this;
        }
        public Builder fabricName(@Nullable String fabricName) {
            this.fabricName = fabricName;
            return this;
        }
        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder healthStatus(@Nullable String healthStatus) {
            this.healthStatus = healthStatus;
            return this;
        }
        public Builder registrationStatus(@Nullable String registrationStatus) {
            this.registrationStatus = registrationStatus;
            return this;
        }        public GenericContainerResponse build() {
            return new GenericContainerResponse(backupManagementType, containerType, extendedInformation, fabricName, friendlyName, healthStatus, registrationStatus);
        }
    }
}
