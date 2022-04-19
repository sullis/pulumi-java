// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.importexport.inputs;

import com.pulumi.azurenative.importexport.inputs.DeliveryPackageInformationResponse;
import com.pulumi.azurenative.importexport.inputs.DriveStatusResponse;
import com.pulumi.azurenative.importexport.inputs.EncryptionKeyDetailsResponse;
import com.pulumi.azurenative.importexport.inputs.ExportResponse;
import com.pulumi.azurenative.importexport.inputs.PackageInformationResponse;
import com.pulumi.azurenative.importexport.inputs.ReturnAddressResponse;
import com.pulumi.azurenative.importexport.inputs.ReturnShippingResponse;
import com.pulumi.azurenative.importexport.inputs.ShippingInformationResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies the job properties
 * 
 */
public final class JobDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final JobDetailsResponse Empty = new JobDetailsResponse();

    /**
     * Default value is false. Indicates whether the manifest files on the drives should be copied to block blobs.
     * 
     */
    @Import(name="backupDriveManifest")
      private final @Nullable Boolean backupDriveManifest;

    public Optional<Boolean> backupDriveManifest() {
        return this.backupDriveManifest == null ? Optional.empty() : Optional.ofNullable(this.backupDriveManifest);
    }

    /**
     * Indicates whether a request has been submitted to cancel the job.
     * 
     */
    @Import(name="cancelRequested")
      private final @Nullable Boolean cancelRequested;

    public Optional<Boolean> cancelRequested() {
        return this.cancelRequested == null ? Optional.empty() : Optional.ofNullable(this.cancelRequested);
    }

    /**
     * Contains information about the package being shipped by the customer to the Microsoft data center.
     * 
     */
    @Import(name="deliveryPackage")
      private final @Nullable DeliveryPackageInformationResponse deliveryPackage;

    public Optional<DeliveryPackageInformationResponse> deliveryPackage() {
        return this.deliveryPackage == null ? Optional.empty() : Optional.ofNullable(this.deliveryPackage);
    }

    /**
     * The virtual blob directory to which the copy logs and backups of drive manifest files (if enabled) will be stored.
     * 
     */
    @Import(name="diagnosticsPath")
      private final @Nullable String diagnosticsPath;

    public Optional<String> diagnosticsPath() {
        return this.diagnosticsPath == null ? Optional.empty() : Optional.ofNullable(this.diagnosticsPath);
    }

    /**
     * List of up to ten drives that comprise the job. The drive list is a required element for an import job; it is not specified for export jobs.
     * 
     */
    @Import(name="driveList")
      private final @Nullable List<DriveStatusResponse> driveList;

    public List<DriveStatusResponse> driveList() {
        return this.driveList == null ? List.of() : this.driveList;
    }

    /**
     * Contains information about the encryption key.
     * 
     */
    @Import(name="encryptionKey")
      private final @Nullable EncryptionKeyDetailsResponse encryptionKey;

    public Optional<EncryptionKeyDetailsResponse> encryptionKey() {
        return this.encryptionKey == null ? Optional.empty() : Optional.ofNullable(this.encryptionKey);
    }

    /**
     * A property containing information about the blobs to be exported for an export job. This property is included for export jobs only.
     * 
     */
    @Import(name="export")
      private final @Nullable ExportResponse export;

    public Optional<ExportResponse> export() {
        return this.export == null ? Optional.empty() : Optional.ofNullable(this.export);
    }

    /**
     * A blob path that points to a block blob containing a list of blob names that were not exported due to insufficient drive space. If all blobs were exported successfully, then this element is not included in the response.
     * 
     */
    @Import(name="incompleteBlobListUri")
      private final @Nullable String incompleteBlobListUri;

    public Optional<String> incompleteBlobListUri() {
        return this.incompleteBlobListUri == null ? Optional.empty() : Optional.ofNullable(this.incompleteBlobListUri);
    }

    /**
     * The type of job
     * 
     */
    @Import(name="jobType")
      private final @Nullable String jobType;

    public Optional<String> jobType() {
        return this.jobType == null ? Optional.empty() : Optional.ofNullable(this.jobType);
    }

    /**
     * Default value is Error. Indicates whether error logging or verbose logging will be enabled.
     * 
     */
    @Import(name="logLevel")
      private final @Nullable String logLevel;

    public Optional<String> logLevel() {
        return this.logLevel == null ? Optional.empty() : Optional.ofNullable(this.logLevel);
    }

    /**
     * Overall percentage completed for the job.
     * 
     */
    @Import(name="percentComplete")
      private final @Nullable Integer percentComplete;

    public Optional<Integer> percentComplete() {
        return this.percentComplete == null ? Optional.empty() : Optional.ofNullable(this.percentComplete);
    }

    /**
     * Specifies the provisioning state of the job.
     * 
     */
    @Import(name="provisioningState")
      private final @Nullable String provisioningState;

    public Optional<String> provisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    /**
     * Specifies the return address information for the job.
     * 
     */
    @Import(name="returnAddress")
      private final @Nullable ReturnAddressResponse returnAddress;

    public Optional<ReturnAddressResponse> returnAddress() {
        return this.returnAddress == null ? Optional.empty() : Optional.ofNullable(this.returnAddress);
    }

    /**
     * Contains information about the package being shipped from the Microsoft data center to the customer to return the drives. The format is the same as the deliveryPackage property above. This property is not included if the drives have not yet been returned.
     * 
     */
    @Import(name="returnPackage")
      private final @Nullable PackageInformationResponse returnPackage;

    public Optional<PackageInformationResponse> returnPackage() {
        return this.returnPackage == null ? Optional.empty() : Optional.ofNullable(this.returnPackage);
    }

    /**
     * Specifies the return carrier and customer's account with the carrier.
     * 
     */
    @Import(name="returnShipping")
      private final @Nullable ReturnShippingResponse returnShipping;

    public Optional<ReturnShippingResponse> returnShipping() {
        return this.returnShipping == null ? Optional.empty() : Optional.ofNullable(this.returnShipping);
    }

    /**
     * Contains information about the Microsoft datacenter to which the drives should be shipped.
     * 
     */
    @Import(name="shippingInformation")
      private final @Nullable ShippingInformationResponse shippingInformation;

    public Optional<ShippingInformationResponse> shippingInformation() {
        return this.shippingInformation == null ? Optional.empty() : Optional.ofNullable(this.shippingInformation);
    }

    /**
     * Current state of the job.
     * 
     */
    @Import(name="state")
      private final @Nullable String state;

    public Optional<String> state() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    /**
     * The resource identifier of the storage account where data will be imported to or exported from.
     * 
     */
    @Import(name="storageAccountId")
      private final @Nullable String storageAccountId;

    public Optional<String> storageAccountId() {
        return this.storageAccountId == null ? Optional.empty() : Optional.ofNullable(this.storageAccountId);
    }

    public JobDetailsResponse(
        @Nullable Boolean backupDriveManifest,
        @Nullable Boolean cancelRequested,
        @Nullable DeliveryPackageInformationResponse deliveryPackage,
        @Nullable String diagnosticsPath,
        @Nullable List<DriveStatusResponse> driveList,
        @Nullable EncryptionKeyDetailsResponse encryptionKey,
        @Nullable ExportResponse export,
        @Nullable String incompleteBlobListUri,
        @Nullable String jobType,
        @Nullable String logLevel,
        @Nullable Integer percentComplete,
        @Nullable String provisioningState,
        @Nullable ReturnAddressResponse returnAddress,
        @Nullable PackageInformationResponse returnPackage,
        @Nullable ReturnShippingResponse returnShipping,
        @Nullable ShippingInformationResponse shippingInformation,
        @Nullable String state,
        @Nullable String storageAccountId) {
        this.backupDriveManifest = Codegen.booleanProp("backupDriveManifest").arg(backupDriveManifest).def(false).getNullable();
        this.cancelRequested = Codegen.booleanProp("cancelRequested").arg(cancelRequested).def(false).getNullable();
        this.deliveryPackage = deliveryPackage;
        this.diagnosticsPath = diagnosticsPath;
        this.driveList = driveList;
        this.encryptionKey = encryptionKey;
        this.export = export;
        this.incompleteBlobListUri = incompleteBlobListUri;
        this.jobType = jobType;
        this.logLevel = logLevel;
        this.percentComplete = percentComplete;
        this.provisioningState = provisioningState;
        this.returnAddress = returnAddress;
        this.returnPackage = returnPackage;
        this.returnShipping = returnShipping;
        this.shippingInformation = shippingInformation;
        this.state = Codegen.stringProp("state").arg(state).def("Creating").getNullable();
        this.storageAccountId = storageAccountId;
    }

    private JobDetailsResponse() {
        this.backupDriveManifest = null;
        this.cancelRequested = null;
        this.deliveryPackage = null;
        this.diagnosticsPath = null;
        this.driveList = List.of();
        this.encryptionKey = null;
        this.export = null;
        this.incompleteBlobListUri = null;
        this.jobType = null;
        this.logLevel = null;
        this.percentComplete = null;
        this.provisioningState = null;
        this.returnAddress = null;
        this.returnPackage = null;
        this.returnShipping = null;
        this.shippingInformation = null;
        this.state = null;
        this.storageAccountId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean backupDriveManifest;
        private @Nullable Boolean cancelRequested;
        private @Nullable DeliveryPackageInformationResponse deliveryPackage;
        private @Nullable String diagnosticsPath;
        private @Nullable List<DriveStatusResponse> driveList;
        private @Nullable EncryptionKeyDetailsResponse encryptionKey;
        private @Nullable ExportResponse export;
        private @Nullable String incompleteBlobListUri;
        private @Nullable String jobType;
        private @Nullable String logLevel;
        private @Nullable Integer percentComplete;
        private @Nullable String provisioningState;
        private @Nullable ReturnAddressResponse returnAddress;
        private @Nullable PackageInformationResponse returnPackage;
        private @Nullable ReturnShippingResponse returnShipping;
        private @Nullable ShippingInformationResponse shippingInformation;
        private @Nullable String state;
        private @Nullable String storageAccountId;

        public Builder() {
    	      // Empty
        }

        public Builder(JobDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupDriveManifest = defaults.backupDriveManifest;
    	      this.cancelRequested = defaults.cancelRequested;
    	      this.deliveryPackage = defaults.deliveryPackage;
    	      this.diagnosticsPath = defaults.diagnosticsPath;
    	      this.driveList = defaults.driveList;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.export = defaults.export;
    	      this.incompleteBlobListUri = defaults.incompleteBlobListUri;
    	      this.jobType = defaults.jobType;
    	      this.logLevel = defaults.logLevel;
    	      this.percentComplete = defaults.percentComplete;
    	      this.provisioningState = defaults.provisioningState;
    	      this.returnAddress = defaults.returnAddress;
    	      this.returnPackage = defaults.returnPackage;
    	      this.returnShipping = defaults.returnShipping;
    	      this.shippingInformation = defaults.shippingInformation;
    	      this.state = defaults.state;
    	      this.storageAccountId = defaults.storageAccountId;
        }

        public Builder backupDriveManifest(@Nullable Boolean backupDriveManifest) {
            this.backupDriveManifest = backupDriveManifest;
            return this;
        }
        public Builder cancelRequested(@Nullable Boolean cancelRequested) {
            this.cancelRequested = cancelRequested;
            return this;
        }
        public Builder deliveryPackage(@Nullable DeliveryPackageInformationResponse deliveryPackage) {
            this.deliveryPackage = deliveryPackage;
            return this;
        }
        public Builder diagnosticsPath(@Nullable String diagnosticsPath) {
            this.diagnosticsPath = diagnosticsPath;
            return this;
        }
        public Builder driveList(@Nullable List<DriveStatusResponse> driveList) {
            this.driveList = driveList;
            return this;
        }
        public Builder driveList(DriveStatusResponse... driveList) {
            return driveList(List.of(driveList));
        }
        public Builder encryptionKey(@Nullable EncryptionKeyDetailsResponse encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public Builder export(@Nullable ExportResponse export) {
            this.export = export;
            return this;
        }
        public Builder incompleteBlobListUri(@Nullable String incompleteBlobListUri) {
            this.incompleteBlobListUri = incompleteBlobListUri;
            return this;
        }
        public Builder jobType(@Nullable String jobType) {
            this.jobType = jobType;
            return this;
        }
        public Builder logLevel(@Nullable String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public Builder percentComplete(@Nullable Integer percentComplete) {
            this.percentComplete = percentComplete;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder returnAddress(@Nullable ReturnAddressResponse returnAddress) {
            this.returnAddress = returnAddress;
            return this;
        }
        public Builder returnPackage(@Nullable PackageInformationResponse returnPackage) {
            this.returnPackage = returnPackage;
            return this;
        }
        public Builder returnShipping(@Nullable ReturnShippingResponse returnShipping) {
            this.returnShipping = returnShipping;
            return this;
        }
        public Builder shippingInformation(@Nullable ShippingInformationResponse shippingInformation) {
            this.shippingInformation = shippingInformation;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder storageAccountId(@Nullable String storageAccountId) {
            this.storageAccountId = storageAccountId;
            return this;
        }        public JobDetailsResponse build() {
            return new JobDetailsResponse(backupDriveManifest, cancelRequested, deliveryPackage, diagnosticsPath, driveList, encryptionKey, export, incompleteBlobListUri, jobType, logLevel, percentComplete, provisioningState, returnAddress, returnPackage, returnShipping, shippingInformation, state, storageAccountId);
        }
    }
}
