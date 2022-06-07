// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.myedgeorder.inputs.ConfigurationFilters;
import com.pulumi.myedgeorder.inputs.CustomerSubscriptionDetails;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListConfigurationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListConfigurationsPlainArgs Empty = new ListConfigurationsPlainArgs();

    /**
     * Holds details about product hierarchy information and filterable property.
     * 
     */
    @Import(name="configurationFilters", required=true)
    private List<ConfigurationFilters> configurationFilters;

    /**
     * @return Holds details about product hierarchy information and filterable property.
     * 
     */
    public List<ConfigurationFilters> configurationFilters() {
        return this.configurationFilters;
    }

    /**
     * Customer subscription properties. Clients can display available products to unregistered customers by explicitly passing subscription details
     * 
     */
    @Import(name="customerSubscriptionDetails")
    private @Nullable CustomerSubscriptionDetails customerSubscriptionDetails;

    /**
     * @return Customer subscription properties. Clients can display available products to unregistered customers by explicitly passing subscription details
     * 
     */
    public Optional<CustomerSubscriptionDetails> customerSubscriptionDetails() {
        return Optional.ofNullable(this.customerSubscriptionDetails);
    }

    /**
     * $skipToken is supported on list of configurations, which provides the next page in the list of configurations.
     * 
     */
    @Import(name="skipToken")
    private @Nullable String skipToken;

    /**
     * @return $skipToken is supported on list of configurations, which provides the next page in the list of configurations.
     * 
     */
    public Optional<String> skipToken() {
        return Optional.ofNullable(this.skipToken);
    }

    private ListConfigurationsPlainArgs() {}

    private ListConfigurationsPlainArgs(ListConfigurationsPlainArgs $) {
        this.configurationFilters = $.configurationFilters;
        this.customerSubscriptionDetails = $.customerSubscriptionDetails;
        this.skipToken = $.skipToken;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListConfigurationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListConfigurationsPlainArgs $;

        public Builder() {
            $ = new ListConfigurationsPlainArgs();
        }

        public Builder(ListConfigurationsPlainArgs defaults) {
            $ = new ListConfigurationsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationFilters Holds details about product hierarchy information and filterable property.
         * 
         * @return builder
         * 
         */
        public Builder configurationFilters(List<ConfigurationFilters> configurationFilters) {
            $.configurationFilters = configurationFilters;
            return this;
        }

        /**
         * @param configurationFilters Holds details about product hierarchy information and filterable property.
         * 
         * @return builder
         * 
         */
        public Builder configurationFilters(ConfigurationFilters... configurationFilters) {
            return configurationFilters(List.of(configurationFilters));
        }

        /**
         * @param customerSubscriptionDetails Customer subscription properties. Clients can display available products to unregistered customers by explicitly passing subscription details
         * 
         * @return builder
         * 
         */
        public Builder customerSubscriptionDetails(@Nullable CustomerSubscriptionDetails customerSubscriptionDetails) {
            $.customerSubscriptionDetails = customerSubscriptionDetails;
            return this;
        }

        /**
         * @param skipToken $skipToken is supported on list of configurations, which provides the next page in the list of configurations.
         * 
         * @return builder
         * 
         */
        public Builder skipToken(@Nullable String skipToken) {
            $.skipToken = skipToken;
            return this;
        }

        public ListConfigurationsPlainArgs build() {
            $.configurationFilters = Objects.requireNonNull($.configurationFilters, "expected parameter 'configurationFilters' to be non-null");
            return $;
        }
    }

}
