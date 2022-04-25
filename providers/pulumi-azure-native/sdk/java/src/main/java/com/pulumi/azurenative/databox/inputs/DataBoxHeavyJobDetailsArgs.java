// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.inputs.ContactDetailsArgs;
import com.pulumi.azurenative.databox.inputs.DataExportDetailsArgs;
import com.pulumi.azurenative.databox.inputs.DataImportDetailsArgs;
import com.pulumi.azurenative.databox.inputs.KeyEncryptionKeyArgs;
import com.pulumi.azurenative.databox.inputs.PreferencesArgs;
import com.pulumi.azurenative.databox.inputs.ShippingAddressArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Databox Heavy Device Job Details
 * 
 */
public final class DataBoxHeavyJobDetailsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DataBoxHeavyJobDetailsArgs Empty = new DataBoxHeavyJobDetailsArgs();

    /**
     * Contact details for notification and shipping.
     * 
     */
    @Import(name="contactDetails", required=true)
    private Output<ContactDetailsArgs> contactDetails;

    /**
     * @return Contact details for notification and shipping.
     * 
     */
    public Output<ContactDetailsArgs> contactDetails() {
        return this.contactDetails;
    }

    /**
     * Details of the data to be exported from azure.
     * 
     */
    @Import(name="dataExportDetails")
    private @Nullable Output<List<DataExportDetailsArgs>> dataExportDetails;

    /**
     * @return Details of the data to be exported from azure.
     * 
     */
    public Optional<Output<List<DataExportDetailsArgs>>> dataExportDetails() {
        return Optional.ofNullable(this.dataExportDetails);
    }

    /**
     * Details of the data to be imported into azure.
     * 
     */
    @Import(name="dataImportDetails")
    private @Nullable Output<List<DataImportDetailsArgs>> dataImportDetails;

    /**
     * @return Details of the data to be imported into azure.
     * 
     */
    public Optional<Output<List<DataImportDetailsArgs>>> dataImportDetails() {
        return Optional.ofNullable(this.dataImportDetails);
    }

    /**
     * Set Device password for unlocking Databox Heavy. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    @Import(name="devicePassword")
    private @Nullable Output<String> devicePassword;

    /**
     * @return Set Device password for unlocking Databox Heavy. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
     * 
     */
    public Optional<Output<String>> devicePassword() {
        return Optional.ofNullable(this.devicePassword);
    }

    /**
     * The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
     */
    @Import(name="expectedDataSizeInTeraBytes")
    private @Nullable Output<Integer> expectedDataSizeInTeraBytes;

    /**
     * @return The expected size of the data, which needs to be transferred in this job, in terabytes.
     * 
     */
    public Optional<Output<Integer>> expectedDataSizeInTeraBytes() {
        return Optional.ofNullable(this.expectedDataSizeInTeraBytes);
    }

    /**
     * Indicates the type of job details.
     * Expected value is &#39;DataBoxHeavy&#39;.
     * 
     */
    @Import(name="jobDetailsType", required=true)
    private Output<String> jobDetailsType;

    /**
     * @return Indicates the type of job details.
     * Expected value is &#39;DataBoxHeavy&#39;.
     * 
     */
    public Output<String> jobDetailsType() {
        return this.jobDetailsType;
    }

    /**
     * Details about which key encryption type is being used.
     * 
     */
    @Import(name="keyEncryptionKey")
    private @Nullable Output<KeyEncryptionKeyArgs> keyEncryptionKey;

    /**
     * @return Details about which key encryption type is being used.
     * 
     */
    public Optional<Output<KeyEncryptionKeyArgs>> keyEncryptionKey() {
        return Optional.ofNullable(this.keyEncryptionKey);
    }

    /**
     * Preferences for the order.
     * 
     */
    @Import(name="preferences")
    private @Nullable Output<PreferencesArgs> preferences;

    /**
     * @return Preferences for the order.
     * 
     */
    public Optional<Output<PreferencesArgs>> preferences() {
        return Optional.ofNullable(this.preferences);
    }

    /**
     * Shipping address of the customer.
     * 
     */
    @Import(name="shippingAddress")
    private @Nullable Output<ShippingAddressArgs> shippingAddress;

    /**
     * @return Shipping address of the customer.
     * 
     */
    public Optional<Output<ShippingAddressArgs>> shippingAddress() {
        return Optional.ofNullable(this.shippingAddress);
    }

    private DataBoxHeavyJobDetailsArgs() {}

    private DataBoxHeavyJobDetailsArgs(DataBoxHeavyJobDetailsArgs $) {
        this.contactDetails = $.contactDetails;
        this.dataExportDetails = $.dataExportDetails;
        this.dataImportDetails = $.dataImportDetails;
        this.devicePassword = $.devicePassword;
        this.expectedDataSizeInTeraBytes = $.expectedDataSizeInTeraBytes;
        this.jobDetailsType = $.jobDetailsType;
        this.keyEncryptionKey = $.keyEncryptionKey;
        this.preferences = $.preferences;
        this.shippingAddress = $.shippingAddress;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DataBoxHeavyJobDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataBoxHeavyJobDetailsArgs $;

        public Builder() {
            $ = new DataBoxHeavyJobDetailsArgs();
        }

        public Builder(DataBoxHeavyJobDetailsArgs defaults) {
            $ = new DataBoxHeavyJobDetailsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contactDetails Contact details for notification and shipping.
         * 
         * @return builder
         * 
         */
        public Builder contactDetails(Output<ContactDetailsArgs> contactDetails) {
            $.contactDetails = contactDetails;
            return this;
        }

        /**
         * @param contactDetails Contact details for notification and shipping.
         * 
         * @return builder
         * 
         */
        public Builder contactDetails(ContactDetailsArgs contactDetails) {
            return contactDetails(Output.of(contactDetails));
        }

        /**
         * @param dataExportDetails Details of the data to be exported from azure.
         * 
         * @return builder
         * 
         */
        public Builder dataExportDetails(@Nullable Output<List<DataExportDetailsArgs>> dataExportDetails) {
            $.dataExportDetails = dataExportDetails;
            return this;
        }

        /**
         * @param dataExportDetails Details of the data to be exported from azure.
         * 
         * @return builder
         * 
         */
        public Builder dataExportDetails(List<DataExportDetailsArgs> dataExportDetails) {
            return dataExportDetails(Output.of(dataExportDetails));
        }

        /**
         * @param dataExportDetails Details of the data to be exported from azure.
         * 
         * @return builder
         * 
         */
        public Builder dataExportDetails(DataExportDetailsArgs... dataExportDetails) {
            return dataExportDetails(List.of(dataExportDetails));
        }

        /**
         * @param dataImportDetails Details of the data to be imported into azure.
         * 
         * @return builder
         * 
         */
        public Builder dataImportDetails(@Nullable Output<List<DataImportDetailsArgs>> dataImportDetails) {
            $.dataImportDetails = dataImportDetails;
            return this;
        }

        /**
         * @param dataImportDetails Details of the data to be imported into azure.
         * 
         * @return builder
         * 
         */
        public Builder dataImportDetails(List<DataImportDetailsArgs> dataImportDetails) {
            return dataImportDetails(Output.of(dataImportDetails));
        }

        /**
         * @param dataImportDetails Details of the data to be imported into azure.
         * 
         * @return builder
         * 
         */
        public Builder dataImportDetails(DataImportDetailsArgs... dataImportDetails) {
            return dataImportDetails(List.of(dataImportDetails));
        }

        /**
         * @param devicePassword Set Device password for unlocking Databox Heavy. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
         * 
         * @return builder
         * 
         */
        public Builder devicePassword(@Nullable Output<String> devicePassword) {
            $.devicePassword = devicePassword;
            return this;
        }

        /**
         * @param devicePassword Set Device password for unlocking Databox Heavy. Should not be passed for TransferType:ExportFromAzure jobs. If this is not passed, the service will generate password itself. This will not be returned in Get Call. Password Requirements :  Password must be minimum of 12 and maximum of 64 characters. Password must have at least one uppercase alphabet, one number and one special character. Password cannot have the following characters : IilLoO0 Password can have only alphabets, numbers and these characters : @#\-$%^!+=;:_()]+
         * 
         * @return builder
         * 
         */
        public Builder devicePassword(String devicePassword) {
            return devicePassword(Output.of(devicePassword));
        }

        /**
         * @param expectedDataSizeInTeraBytes The expected size of the data, which needs to be transferred in this job, in terabytes.
         * 
         * @return builder
         * 
         */
        public Builder expectedDataSizeInTeraBytes(@Nullable Output<Integer> expectedDataSizeInTeraBytes) {
            $.expectedDataSizeInTeraBytes = expectedDataSizeInTeraBytes;
            return this;
        }

        /**
         * @param expectedDataSizeInTeraBytes The expected size of the data, which needs to be transferred in this job, in terabytes.
         * 
         * @return builder
         * 
         */
        public Builder expectedDataSizeInTeraBytes(Integer expectedDataSizeInTeraBytes) {
            return expectedDataSizeInTeraBytes(Output.of(expectedDataSizeInTeraBytes));
        }

        /**
         * @param jobDetailsType Indicates the type of job details.
         * Expected value is &#39;DataBoxHeavy&#39;.
         * 
         * @return builder
         * 
         */
        public Builder jobDetailsType(Output<String> jobDetailsType) {
            $.jobDetailsType = jobDetailsType;
            return this;
        }

        /**
         * @param jobDetailsType Indicates the type of job details.
         * Expected value is &#39;DataBoxHeavy&#39;.
         * 
         * @return builder
         * 
         */
        public Builder jobDetailsType(String jobDetailsType) {
            return jobDetailsType(Output.of(jobDetailsType));
        }

        /**
         * @param keyEncryptionKey Details about which key encryption type is being used.
         * 
         * @return builder
         * 
         */
        public Builder keyEncryptionKey(@Nullable Output<KeyEncryptionKeyArgs> keyEncryptionKey) {
            $.keyEncryptionKey = keyEncryptionKey;
            return this;
        }

        /**
         * @param keyEncryptionKey Details about which key encryption type is being used.
         * 
         * @return builder
         * 
         */
        public Builder keyEncryptionKey(KeyEncryptionKeyArgs keyEncryptionKey) {
            return keyEncryptionKey(Output.of(keyEncryptionKey));
        }

        /**
         * @param preferences Preferences for the order.
         * 
         * @return builder
         * 
         */
        public Builder preferences(@Nullable Output<PreferencesArgs> preferences) {
            $.preferences = preferences;
            return this;
        }

        /**
         * @param preferences Preferences for the order.
         * 
         * @return builder
         * 
         */
        public Builder preferences(PreferencesArgs preferences) {
            return preferences(Output.of(preferences));
        }

        /**
         * @param shippingAddress Shipping address of the customer.
         * 
         * @return builder
         * 
         */
        public Builder shippingAddress(@Nullable Output<ShippingAddressArgs> shippingAddress) {
            $.shippingAddress = shippingAddress;
            return this;
        }

        /**
         * @param shippingAddress Shipping address of the customer.
         * 
         * @return builder
         * 
         */
        public Builder shippingAddress(ShippingAddressArgs shippingAddress) {
            return shippingAddress(Output.of(shippingAddress));
        }

        public DataBoxHeavyJobDetailsArgs build() {
            $.contactDetails = Objects.requireNonNull($.contactDetails, "expected parameter 'contactDetails' to be non-null");
            $.jobDetailsType = Codegen.stringProp("jobDetailsType").output().arg($.jobDetailsType).require();
            return $;
        }
    }

}
