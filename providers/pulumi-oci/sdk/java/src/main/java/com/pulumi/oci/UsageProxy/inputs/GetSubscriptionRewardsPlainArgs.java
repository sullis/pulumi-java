// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.UsageProxy.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.UsageProxy.inputs.GetSubscriptionRewardsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubscriptionRewardsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionRewardsPlainArgs Empty = new GetSubscriptionRewardsPlainArgs();

    @Import(name="filters")
    private @Nullable List<GetSubscriptionRewardsFilter> filters;

    public Optional<List<GetSubscriptionRewardsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The subscription ID for which rewards information is requested for.
     * 
     */
    @Import(name="subscriptionId", required=true)
    private String subscriptionId;

    /**
     * @return The subscription ID for which rewards information is requested for.
     * 
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * The OCID of the tenancy.
     * 
     */
    @Import(name="tenancyId", required=true)
    private String tenancyId;

    /**
     * @return The OCID of the tenancy.
     * 
     */
    public String tenancyId() {
        return this.tenancyId;
    }

    private GetSubscriptionRewardsPlainArgs() {}

    private GetSubscriptionRewardsPlainArgs(GetSubscriptionRewardsPlainArgs $) {
        this.filters = $.filters;
        this.subscriptionId = $.subscriptionId;
        this.tenancyId = $.tenancyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionRewardsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionRewardsPlainArgs $;

        public Builder() {
            $ = new GetSubscriptionRewardsPlainArgs();
        }

        public Builder(GetSubscriptionRewardsPlainArgs defaults) {
            $ = new GetSubscriptionRewardsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder filters(@Nullable List<GetSubscriptionRewardsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetSubscriptionRewardsFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param subscriptionId The subscription ID for which rewards information is requested for.
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param tenancyId The OCID of the tenancy.
         * 
         * @return builder
         * 
         */
        public Builder tenancyId(String tenancyId) {
            $.tenancyId = tenancyId;
            return this;
        }

        public GetSubscriptionRewardsPlainArgs build() {
            $.subscriptionId = Objects.requireNonNull($.subscriptionId, "expected parameter 'subscriptionId' to be non-null");
            $.tenancyId = Objects.requireNonNull($.tenancyId, "expected parameter 'tenancyId' to be non-null");
            return $;
        }
    }

}
