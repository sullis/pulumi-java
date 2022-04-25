// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.dataprotection.inputs;

import com.pulumi.azurenative.dataprotection.inputs.AzureOperationalStoreParametersResponse;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters in Policy
 * 
 */
public final class PolicyParametersResponse extends com.pulumi.resources.InvokeArgs {

    public static final PolicyParametersResponse Empty = new PolicyParametersResponse();

    /**
     * Gets or sets the DataStore Parameters
     * 
     */
    @Import(name="dataStoreParametersList")
    private @Nullable List<AzureOperationalStoreParametersResponse> dataStoreParametersList;

    /**
     * @return Gets or sets the DataStore Parameters
     * 
     */
    public Optional<List<AzureOperationalStoreParametersResponse>> dataStoreParametersList() {
        return Optional.ofNullable(this.dataStoreParametersList);
    }

    private PolicyParametersResponse() {}

    private PolicyParametersResponse(PolicyParametersResponse $) {
        this.dataStoreParametersList = $.dataStoreParametersList;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PolicyParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PolicyParametersResponse $;

        public Builder() {
            $ = new PolicyParametersResponse();
        }

        public Builder(PolicyParametersResponse defaults) {
            $ = new PolicyParametersResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param dataStoreParametersList Gets or sets the DataStore Parameters
         * 
         * @return builder
         * 
         */
        public Builder dataStoreParametersList(@Nullable List<AzureOperationalStoreParametersResponse> dataStoreParametersList) {
            $.dataStoreParametersList = dataStoreParametersList;
            return this;
        }

        /**
         * @param dataStoreParametersList Gets or sets the DataStore Parameters
         * 
         * @return builder
         * 
         */
        public Builder dataStoreParametersList(AzureOperationalStoreParametersResponse... dataStoreParametersList) {
            return dataStoreParametersList(List.of(dataStoreParametersList));
        }

        public PolicyParametersResponse build() {
            return $;
        }
    }

}
