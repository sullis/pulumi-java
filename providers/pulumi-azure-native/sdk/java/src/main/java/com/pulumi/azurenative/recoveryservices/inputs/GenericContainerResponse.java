// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.recoveryservices.inputs;

import com.pulumi.azurenative.recoveryservices.inputs.GenericContainerExtendedInfoResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Base class for generic container of backup items
 * 
 */
public final class GenericContainerResponse extends com.pulumi.resources.InvokeArgs {

    public static final GenericContainerResponse Empty = new GenericContainerResponse();

    /**
     * Type of backup management for the container.
     * 
     */
    @Import(name="backupManagementType")
    private @Nullable String backupManagementType;

    /**
     * @return Type of backup management for the container.
     * 
     */
    public Optional<String> backupManagementType() {
        return Optional.ofNullable(this.backupManagementType);
    }

    /**
     * Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
     * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
     * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
     * Backup is VMAppContainer
     * Expected value is &#39;GenericContainer&#39;.
     * 
     */
    @Import(name="containerType", required=true)
    private String containerType;

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
     * Extended information (not returned in List container API calls)
     * 
     */
    @Import(name="extendedInformation")
    private @Nullable GenericContainerExtendedInfoResponse extendedInformation;

    /**
     * @return Extended information (not returned in List container API calls)
     * 
     */
    public Optional<GenericContainerExtendedInfoResponse> extendedInformation() {
        return Optional.ofNullable(this.extendedInformation);
    }

    /**
     * Name of the container&#39;s fabric
     * 
     */
    @Import(name="fabricName")
    private @Nullable String fabricName;

    /**
     * @return Name of the container&#39;s fabric
     * 
     */
    public Optional<String> fabricName() {
        return Optional.ofNullable(this.fabricName);
    }

    /**
     * Friendly name of the container.
     * 
     */
    @Import(name="friendlyName")
    private @Nullable String friendlyName;

    /**
     * @return Friendly name of the container.
     * 
     */
    public Optional<String> friendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }

    /**
     * Status of health of the container.
     * 
     */
    @Import(name="healthStatus")
    private @Nullable String healthStatus;

    /**
     * @return Status of health of the container.
     * 
     */
    public Optional<String> healthStatus() {
        return Optional.ofNullable(this.healthStatus);
    }

    /**
     * Status of registration of the container with the Recovery Services Vault.
     * 
     */
    @Import(name="registrationStatus")
    private @Nullable String registrationStatus;

    /**
     * @return Status of registration of the container with the Recovery Services Vault.
     * 
     */
    public Optional<String> registrationStatus() {
        return Optional.ofNullable(this.registrationStatus);
    }

    private GenericContainerResponse() {}

    private GenericContainerResponse(GenericContainerResponse $) {
        this.backupManagementType = $.backupManagementType;
        this.containerType = $.containerType;
        this.extendedInformation = $.extendedInformation;
        this.fabricName = $.fabricName;
        this.friendlyName = $.friendlyName;
        this.healthStatus = $.healthStatus;
        this.registrationStatus = $.registrationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GenericContainerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GenericContainerResponse $;

        public Builder() {
            $ = new GenericContainerResponse();
        }

        public Builder(GenericContainerResponse defaults) {
            $ = new GenericContainerResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param backupManagementType Type of backup management for the container.
         * 
         * @return builder
         * 
         */
        public Builder backupManagementType(@Nullable String backupManagementType) {
            $.backupManagementType = backupManagementType;
            return this;
        }

        /**
         * @param containerType Type of the container. The value of this property for: 1. Compute Azure VM is Microsoft.Compute/virtualMachines 2.
         * Classic Compute Azure VM is Microsoft.ClassicCompute/virtualMachines 3. Windows machines (like MAB, DPM etc) is
         * Windows 4. Azure SQL instance is AzureSqlContainer. 5. Storage containers is StorageContainer. 6. Azure workload
         * Backup is VMAppContainer
         * Expected value is &#39;GenericContainer&#39;.
         * 
         * @return builder
         * 
         */
        public Builder containerType(String containerType) {
            $.containerType = containerType;
            return this;
        }

        /**
         * @param extendedInformation Extended information (not returned in List container API calls)
         * 
         * @return builder
         * 
         */
        public Builder extendedInformation(@Nullable GenericContainerExtendedInfoResponse extendedInformation) {
            $.extendedInformation = extendedInformation;
            return this;
        }

        /**
         * @param fabricName Name of the container&#39;s fabric
         * 
         * @return builder
         * 
         */
        public Builder fabricName(@Nullable String fabricName) {
            $.fabricName = fabricName;
            return this;
        }

        /**
         * @param friendlyName Friendly name of the container.
         * 
         * @return builder
         * 
         */
        public Builder friendlyName(@Nullable String friendlyName) {
            $.friendlyName = friendlyName;
            return this;
        }

        /**
         * @param healthStatus Status of health of the container.
         * 
         * @return builder
         * 
         */
        public Builder healthStatus(@Nullable String healthStatus) {
            $.healthStatus = healthStatus;
            return this;
        }

        /**
         * @param registrationStatus Status of registration of the container with the Recovery Services Vault.
         * 
         * @return builder
         * 
         */
        public Builder registrationStatus(@Nullable String registrationStatus) {
            $.registrationStatus = registrationStatus;
            return this;
        }

        public GenericContainerResponse build() {
            $.containerType = Codegen.stringProp("containerType").arg($.containerType).require();
            return $;
        }
    }

}
