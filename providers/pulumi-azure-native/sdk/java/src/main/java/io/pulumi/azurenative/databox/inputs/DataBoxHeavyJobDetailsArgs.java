// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.ContactDetailsArgs;
import io.pulumi.azurenative.databox.inputs.DataExportDetailsArgs;
import io.pulumi.azurenative.databox.inputs.DataImportDetailsArgs;
import io.pulumi.azurenative.databox.inputs.KeyEncryptionKeyArgs;
import io.pulumi.azurenative.databox.inputs.PreferencesArgs;
import io.pulumi.azurenative.databox.inputs.ShippingAddressArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Databox Heavy Device Job Details
 * 
 */
public final class DataBoxHeavyJobDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataBoxHeavyJobDetailsArgs Empty = new DataBoxHeavyJobDetailsArgs();

    /**
     * Contact details for notification and shipping.
     * 
     */
    @InputImport(name="contactDetails", required=true)
    private final Input<ContactDetailsArgs> contactDetails;

    public Input<ContactDetailsArgs> getContactDetails() {
        return this.contactDetails;
    }

    /**
     * Details of the data to be exported from azure.
     * 
     */
    @InputImport(name="dataExportDetails")
    private final @Nullable Input<List<DataExportDetailsArgs>> dataExportDetails;

    public Input<List<DataExportDetailsArgs>> getDataExportDetails() {
        return this.dataExportDetails == null ? Input.empty() : this.dataExportDetails;
    }

    /**
     * Details of the data to be imported into azure.
     * 
     */
    @InputImport(name="dataImportDetails")
    private final @Nullable Input<List<DataImportDetailsArgs>> dataImportDetails;

    public Input<List<DataImportDetailsArgs>> getDataImportDetails() {
        return this.dataImportDetails == null ? Input.empty() : this.dataImportDetails;
    }

    /**
     * Set Device password for unlocking Databox Heavy. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    @InputImport(name="devicePassword")
    private final @Nullable Input<String> devicePassword;

    public Input<String> getDevicePassword() {
        return this.devicePassword == null ? Input.empty() : this.devicePassword;
    }

    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
     */
    @InputImport(name="expectedDataSizeInTeraBytes")
    private final @Nullable Input<Integer> expectedDataSizeInTeraBytes;

    public Input<Integer> getExpectedDataSizeInTeraBytes() {
        return this.expectedDataSizeInTeraBytes == null ? Input.empty() : this.expectedDataSizeInTeraBytes;
    }

    /**
     * Indicates the type of job details.
     * Expected value is 'DataBoxHeavy'.
     * 
     */
    @InputImport(name="jobDetailsType", required=true)
    private final Input<String> jobDetailsType;

    public Input<String> getJobDetailsType() {
        return this.jobDetailsType;
    }

    /**
     * Details about which key encryption type is being used.
     * 
     */
    @InputImport(name="keyEncryptionKey")
    private final @Nullable Input<KeyEncryptionKeyArgs> keyEncryptionKey;

    public Input<KeyEncryptionKeyArgs> getKeyEncryptionKey() {
        return this.keyEncryptionKey == null ? Input.empty() : this.keyEncryptionKey;
    }

    /**
     * Preferences for the order.
     * 
     */
    @InputImport(name="preferences")
    private final @Nullable Input<PreferencesArgs> preferences;

    public Input<PreferencesArgs> getPreferences() {
        return this.preferences == null ? Input.empty() : this.preferences;
    }

    /**
     * Shipping address of the customer.
     * 
     */
    @InputImport(name="shippingAddress")
    private final @Nullable Input<ShippingAddressArgs> shippingAddress;

    public Input<ShippingAddressArgs> getShippingAddress() {
        return this.shippingAddress == null ? Input.empty() : this.shippingAddress;
    }

    public DataBoxHeavyJobDetailsArgs(
        Input<ContactDetailsArgs> contactDetails,
        @Nullable Input<List<DataExportDetailsArgs>> dataExportDetails,
        @Nullable Input<List<DataImportDetailsArgs>> dataImportDetails,
        @Nullable Input<String> devicePassword,
        @Nullable Input<Integer> expectedDataSizeInTeraBytes,
        Input<String> jobDetailsType,
        @Nullable Input<KeyEncryptionKeyArgs> keyEncryptionKey,
        @Nullable Input<PreferencesArgs> preferences,
        @Nullable Input<ShippingAddressArgs> shippingAddress) {
        this.contactDetails = Objects.requireNonNull(contactDetails, "expected parameter 'contactDetails' to be non-null");
        this.dataExportDetails = dataExportDetails;
        this.dataImportDetails = dataImportDetails;
        this.devicePassword = devicePassword;
        this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
        this.jobDetailsType = Objects.requireNonNull(jobDetailsType, "expected parameter 'jobDetailsType' to be non-null");
        this.keyEncryptionKey = keyEncryptionKey;
        this.preferences = preferences;
        this.shippingAddress = shippingAddress;
    }

    private DataBoxHeavyJobDetailsArgs() {
        this.contactDetails = Input.empty();
        this.dataExportDetails = Input.empty();
        this.dataImportDetails = Input.empty();
        this.devicePassword = Input.empty();
        this.expectedDataSizeInTeraBytes = Input.empty();
        this.jobDetailsType = Input.empty();
        this.keyEncryptionKey = Input.empty();
        this.preferences = Input.empty();
        this.shippingAddress = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxHeavyJobDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ContactDetailsArgs> contactDetails;
        private @Nullable Input<List<DataExportDetailsArgs>> dataExportDetails;
        private @Nullable Input<List<DataImportDetailsArgs>> dataImportDetails;
        private @Nullable Input<String> devicePassword;
        private @Nullable Input<Integer> expectedDataSizeInTeraBytes;
        private Input<String> jobDetailsType;
        private @Nullable Input<KeyEncryptionKeyArgs> keyEncryptionKey;
        private @Nullable Input<PreferencesArgs> preferences;
        private @Nullable Input<ShippingAddressArgs> shippingAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxHeavyJobDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactDetails = defaults.contactDetails;
    	      this.dataExportDetails = defaults.dataExportDetails;
    	      this.dataImportDetails = defaults.dataImportDetails;
    	      this.devicePassword = defaults.devicePassword;
    	      this.expectedDataSizeInTeraBytes = defaults.expectedDataSizeInTeraBytes;
    	      this.jobDetailsType = defaults.jobDetailsType;
    	      this.keyEncryptionKey = defaults.keyEncryptionKey;
    	      this.preferences = defaults.preferences;
    	      this.shippingAddress = defaults.shippingAddress;
        }

        public Builder setContactDetails(Input<ContactDetailsArgs> contactDetails) {
            this.contactDetails = Objects.requireNonNull(contactDetails);
            return this;
        }

        public Builder setContactDetails(ContactDetailsArgs contactDetails) {
            this.contactDetails = Input.of(Objects.requireNonNull(contactDetails));
            return this;
        }

        public Builder setDataExportDetails(@Nullable Input<List<DataExportDetailsArgs>> dataExportDetails) {
            this.dataExportDetails = dataExportDetails;
            return this;
        }

        public Builder setDataExportDetails(@Nullable List<DataExportDetailsArgs> dataExportDetails) {
            this.dataExportDetails = Input.ofNullable(dataExportDetails);
            return this;
        }

        public Builder setDataImportDetails(@Nullable Input<List<DataImportDetailsArgs>> dataImportDetails) {
            this.dataImportDetails = dataImportDetails;
            return this;
        }

        public Builder setDataImportDetails(@Nullable List<DataImportDetailsArgs> dataImportDetails) {
            this.dataImportDetails = Input.ofNullable(dataImportDetails);
            return this;
        }

        public Builder setDevicePassword(@Nullable Input<String> devicePassword) {
            this.devicePassword = devicePassword;
            return this;
        }

        public Builder setDevicePassword(@Nullable String devicePassword) {
            this.devicePassword = Input.ofNullable(devicePassword);
            return this;
        }

        public Builder setExpectedDataSizeInTeraBytes(@Nullable Input<Integer> expectedDataSizeInTeraBytes) {
            this.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
            return this;
        }

        public Builder setExpectedDataSizeInTeraBytes(@Nullable Integer expectedDataSizeInTeraBytes) {
            this.expectedDataSizeInTeraBytes = Input.ofNullable(expectedDataSizeInTeraBytes);
            return this;
        }

        public Builder setJobDetailsType(Input<String> jobDetailsType) {
            this.jobDetailsType = Objects.requireNonNull(jobDetailsType);
            return this;
        }

        public Builder setJobDetailsType(String jobDetailsType) {
            this.jobDetailsType = Input.of(Objects.requireNonNull(jobDetailsType));
            return this;
        }

        public Builder setKeyEncryptionKey(@Nullable Input<KeyEncryptionKeyArgs> keyEncryptionKey) {
            this.keyEncryptionKey = keyEncryptionKey;
            return this;
        }

        public Builder setKeyEncryptionKey(@Nullable KeyEncryptionKeyArgs keyEncryptionKey) {
            this.keyEncryptionKey = Input.ofNullable(keyEncryptionKey);
            return this;
        }

        public Builder setPreferences(@Nullable Input<PreferencesArgs> preferences) {
            this.preferences = preferences;
            return this;
        }

        public Builder setPreferences(@Nullable PreferencesArgs preferences) {
            this.preferences = Input.ofNullable(preferences);
            return this;
        }

        public Builder setShippingAddress(@Nullable Input<ShippingAddressArgs> shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Builder setShippingAddress(@Nullable ShippingAddressArgs shippingAddress) {
            this.shippingAddress = Input.ofNullable(shippingAddress);
            return this;
        }

        public DataBoxHeavyJobDetailsArgs build() {
            return new DataBoxHeavyJobDetailsArgs(contactDetails, dataExportDetails, dataImportDetails, devicePassword, expectedDataSizeInTeraBytes, jobDetailsType, keyEncryptionKey, preferences, shippingAddress);
        }
    }
}
