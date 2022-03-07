// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.ManagedDiskDetailsResponse;
import io.pulumi.azurenative.databox.inputs.StorageAccountDetailsResponse;
import io.pulumi.azurenative.databox.inputs.TransferConfigurationResponse;
import io.pulumi.core.Either;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the data to be used for exporting data from azure.
 * 
 */
public final class DataExportDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataExportDetailsResponse Empty = new DataExportDetailsResponse();

    /**
     * Account details of the data to be transferred
     * 
     */
    @InputImport(name="accountDetails", required=true)
      private final Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails;

    public Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> getAccountDetails() {
        return this.accountDetails;
    }

    /**
     * Level of the logs to be collected.
     * 
     */
    @InputImport(name="logCollectionLevel")
      private final @Nullable String logCollectionLevel;

    public Optional<String> getLogCollectionLevel() {
        return this.logCollectionLevel == null ? Optional.empty() : Optional.ofNullable(this.logCollectionLevel);
    }

    /**
     * Configuration for the data transfer.
     * 
     */
    @InputImport(name="transferConfiguration", required=true)
      private final TransferConfigurationResponse transferConfiguration;

    public TransferConfigurationResponse getTransferConfiguration() {
        return this.transferConfiguration;
    }

    public DataExportDetailsResponse(
        Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails,
        @Nullable String logCollectionLevel,
        TransferConfigurationResponse transferConfiguration) {
        this.accountDetails = Objects.requireNonNull(accountDetails, "expected parameter 'accountDetails' to be non-null");
        this.logCollectionLevel = logCollectionLevel == null ? "Error" : logCollectionLevel;
        this.transferConfiguration = Objects.requireNonNull(transferConfiguration, "expected parameter 'transferConfiguration' to be non-null");
    }

    private DataExportDetailsResponse() {
        this.accountDetails = null;
        this.logCollectionLevel = null;
        this.transferConfiguration = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataExportDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails;
        private @Nullable String logCollectionLevel;
        private TransferConfigurationResponse transferConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(DataExportDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountDetails = defaults.accountDetails;
    	      this.logCollectionLevel = defaults.logCollectionLevel;
    	      this.transferConfiguration = defaults.transferConfiguration;
        }

        public Builder setAccountDetails(Either<ManagedDiskDetailsResponse,StorageAccountDetailsResponse> accountDetails) {
            this.accountDetails = Objects.requireNonNull(accountDetails);
            return this;
        }

        public Builder setLogCollectionLevel(@Nullable String logCollectionLevel) {
            this.logCollectionLevel = logCollectionLevel;
            return this;
        }

        public Builder setTransferConfiguration(TransferConfigurationResponse transferConfiguration) {
            this.transferConfiguration = Objects.requireNonNull(transferConfiguration);
            return this;
        }
        public DataExportDetailsResponse build() {
            return new DataExportDetailsResponse(accountDetails, logCollectionLevel, transferConfiguration);
        }
    }
}