// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.inputs;

import com.pulumi.azurenative.databox.inputs.AzureFileFilterDetailsResponse;
import com.pulumi.azurenative.databox.inputs.BlobFilterDetailsResponse;
import com.pulumi.azurenative.databox.inputs.FilterFileDetailsResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the filtering the transfer of data.
 * 
 */
public final class TransferFilterDetailsResponse extends com.pulumi.resources.InvokeArgs {

    public static final TransferFilterDetailsResponse Empty = new TransferFilterDetailsResponse();

    /**
     * Filter details to transfer Azure files.
     * 
     */
    @Import(name="azureFileFilterDetails")
    private @Nullable AzureFileFilterDetailsResponse azureFileFilterDetails;

    /**
     * @return Filter details to transfer Azure files.
     * 
     */
    public Optional<AzureFileFilterDetailsResponse> azureFileFilterDetails() {
        return Optional.ofNullable(this.azureFileFilterDetails);
    }

    /**
     * Filter details to transfer blobs.
     * 
     */
    @Import(name="blobFilterDetails")
    private @Nullable BlobFilterDetailsResponse blobFilterDetails;

    /**
     * @return Filter details to transfer blobs.
     * 
     */
    public Optional<BlobFilterDetailsResponse> blobFilterDetails() {
        return Optional.ofNullable(this.blobFilterDetails);
    }

    /**
     * Type of the account of data.
     * 
     */
    @Import(name="dataAccountType", required=true)
    private String dataAccountType;

    /**
     * @return Type of the account of data.
     * 
     */
    public String dataAccountType() {
        return this.dataAccountType;
    }

    /**
     * Details of the filter files to be used for data transfer.
     * 
     */
    @Import(name="filterFileDetails")
    private @Nullable List<FilterFileDetailsResponse> filterFileDetails;

    /**
     * @return Details of the filter files to be used for data transfer.
     * 
     */
    public Optional<List<FilterFileDetailsResponse>> filterFileDetails() {
        return Optional.ofNullable(this.filterFileDetails);
    }

    private TransferFilterDetailsResponse() {}

    private TransferFilterDetailsResponse(TransferFilterDetailsResponse $) {
        this.azureFileFilterDetails = $.azureFileFilterDetails;
        this.blobFilterDetails = $.blobFilterDetails;
        this.dataAccountType = $.dataAccountType;
        this.filterFileDetails = $.filterFileDetails;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TransferFilterDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TransferFilterDetailsResponse $;

        public Builder() {
            $ = new TransferFilterDetailsResponse();
        }

        public Builder(TransferFilterDetailsResponse defaults) {
            $ = new TransferFilterDetailsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param azureFileFilterDetails Filter details to transfer Azure files.
         * 
         * @return builder
         * 
         */
        public Builder azureFileFilterDetails(@Nullable AzureFileFilterDetailsResponse azureFileFilterDetails) {
            $.azureFileFilterDetails = azureFileFilterDetails;
            return this;
        }

        /**
         * @param blobFilterDetails Filter details to transfer blobs.
         * 
         * @return builder
         * 
         */
        public Builder blobFilterDetails(@Nullable BlobFilterDetailsResponse blobFilterDetails) {
            $.blobFilterDetails = blobFilterDetails;
            return this;
        }

        /**
         * @param dataAccountType Type of the account of data.
         * 
         * @return builder
         * 
         */
        public Builder dataAccountType(String dataAccountType) {
            $.dataAccountType = dataAccountType;
            return this;
        }

        /**
         * @param filterFileDetails Details of the filter files to be used for data transfer.
         * 
         * @return builder
         * 
         */
        public Builder filterFileDetails(@Nullable List<FilterFileDetailsResponse> filterFileDetails) {
            $.filterFileDetails = filterFileDetails;
            return this;
        }

        /**
         * @param filterFileDetails Details of the filter files to be used for data transfer.
         * 
         * @return builder
         * 
         */
        public Builder filterFileDetails(FilterFileDetailsResponse... filterFileDetails) {
            return filterFileDetails(List.of(filterFileDetails));
        }

        public TransferFilterDetailsResponse build() {
            $.dataAccountType = Codegen.stringProp("dataAccountType").arg($.dataAccountType).def("StorageAccount").require();
            return $;
        }
    }

}
