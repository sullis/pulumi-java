// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.OsubSubscription.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.oci.OsubSubscription.inputs.GetSubscriptionsFilterArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubscriptionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionsArgs Empty = new GetSubscriptionsArgs();

    /**
     * Buyer Email Id
     * 
     */
    @Import(name="buyerEmail")
    private @Nullable Output<String> buyerEmail;

    /**
     * @return Buyer Email Id
     * 
     */
    public Optional<Output<String>> buyerEmail() {
        return Optional.ofNullable(this.buyerEmail);
    }

    /**
     * The OCID of the compartment.
     * 
     */
    @Import(name="compartmentId", required=true)
    private Output<String> compartmentId;

    /**
     * @return The OCID of the compartment.
     * 
     */
    public Output<String> compartmentId() {
        return this.compartmentId;
    }

    @Import(name="filters")
    private @Nullable Output<List<GetSubscriptionsFilterArgs>> filters;

    public Optional<Output<List<GetSubscriptionsFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * Boolean value to decide whether commitment services will be shown
     * 
     */
    @Import(name="isCommitInfoRequired")
    private @Nullable Output<Boolean> isCommitInfoRequired;

    /**
     * @return Boolean value to decide whether commitment services will be shown
     * 
     */
    public Optional<Output<Boolean>> isCommitInfoRequired() {
        return Optional.ofNullable(this.isCommitInfoRequired);
    }

    /**
     * The Plan Number
     * 
     */
    @Import(name="planNumber")
    private @Nullable Output<String> planNumber;

    /**
     * @return The Plan Number
     * 
     */
    public Optional<Output<String>> planNumber() {
        return Optional.ofNullable(this.planNumber);
    }

    /**
     * Line level Subscription Id
     * 
     */
    @Import(name="subscriptionId")
    private @Nullable Output<String> subscriptionId;

    /**
     * @return Line level Subscription Id
     * 
     */
    public Optional<Output<String>> subscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }

    /**
     * This header is meant to be used only for internal purposes and will be ignored on any public request. The purpose of this header is  to help on Gateway to API calls identification.
     * 
     */
    @Import(name="xOneGatewaySubscriptionId")
    private @Nullable Output<String> xOneGatewaySubscriptionId;

    /**
     * @return This header is meant to be used only for internal purposes and will be ignored on any public request. The purpose of this header is  to help on Gateway to API calls identification.
     * 
     */
    public Optional<Output<String>> xOneGatewaySubscriptionId() {
        return Optional.ofNullable(this.xOneGatewaySubscriptionId);
    }

    /**
     * The Oracle Cloud Infrastructure home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1, us-phoenix-1 etc.
     * 
     */
    @Import(name="xOneOriginRegion")
    private @Nullable Output<String> xOneOriginRegion;

    /**
     * @return The Oracle Cloud Infrastructure home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1, us-phoenix-1 etc.
     * 
     */
    public Optional<Output<String>> xOneOriginRegion() {
        return Optional.ofNullable(this.xOneOriginRegion);
    }

    private GetSubscriptionsArgs() {}

    private GetSubscriptionsArgs(GetSubscriptionsArgs $) {
        this.buyerEmail = $.buyerEmail;
        this.compartmentId = $.compartmentId;
        this.filters = $.filters;
        this.isCommitInfoRequired = $.isCommitInfoRequired;
        this.planNumber = $.planNumber;
        this.subscriptionId = $.subscriptionId;
        this.xOneGatewaySubscriptionId = $.xOneGatewaySubscriptionId;
        this.xOneOriginRegion = $.xOneOriginRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubscriptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubscriptionsArgs $;

        public Builder() {
            $ = new GetSubscriptionsArgs();
        }

        public Builder(GetSubscriptionsArgs defaults) {
            $ = new GetSubscriptionsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param buyerEmail Buyer Email Id
         * 
         * @return builder
         * 
         */
        public Builder buyerEmail(@Nullable Output<String> buyerEmail) {
            $.buyerEmail = buyerEmail;
            return this;
        }

        /**
         * @param buyerEmail Buyer Email Id
         * 
         * @return builder
         * 
         */
        public Builder buyerEmail(String buyerEmail) {
            return buyerEmail(Output.of(buyerEmail));
        }

        /**
         * @param compartmentId The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(Output<String> compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        /**
         * @param compartmentId The OCID of the compartment.
         * 
         * @return builder
         * 
         */
        public Builder compartmentId(String compartmentId) {
            return compartmentId(Output.of(compartmentId));
        }

        public Builder filters(@Nullable Output<List<GetSubscriptionsFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(List<GetSubscriptionsFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        public Builder filters(GetSubscriptionsFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param isCommitInfoRequired Boolean value to decide whether commitment services will be shown
         * 
         * @return builder
         * 
         */
        public Builder isCommitInfoRequired(@Nullable Output<Boolean> isCommitInfoRequired) {
            $.isCommitInfoRequired = isCommitInfoRequired;
            return this;
        }

        /**
         * @param isCommitInfoRequired Boolean value to decide whether commitment services will be shown
         * 
         * @return builder
         * 
         */
        public Builder isCommitInfoRequired(Boolean isCommitInfoRequired) {
            return isCommitInfoRequired(Output.of(isCommitInfoRequired));
        }

        /**
         * @param planNumber The Plan Number
         * 
         * @return builder
         * 
         */
        public Builder planNumber(@Nullable Output<String> planNumber) {
            $.planNumber = planNumber;
            return this;
        }

        /**
         * @param planNumber The Plan Number
         * 
         * @return builder
         * 
         */
        public Builder planNumber(String planNumber) {
            return planNumber(Output.of(planNumber));
        }

        /**
         * @param subscriptionId Line level Subscription Id
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(@Nullable Output<String> subscriptionId) {
            $.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * @param subscriptionId Line level Subscription Id
         * 
         * @return builder
         * 
         */
        public Builder subscriptionId(String subscriptionId) {
            return subscriptionId(Output.of(subscriptionId));
        }

        /**
         * @param xOneGatewaySubscriptionId This header is meant to be used only for internal purposes and will be ignored on any public request. The purpose of this header is  to help on Gateway to API calls identification.
         * 
         * @return builder
         * 
         */
        public Builder xOneGatewaySubscriptionId(@Nullable Output<String> xOneGatewaySubscriptionId) {
            $.xOneGatewaySubscriptionId = xOneGatewaySubscriptionId;
            return this;
        }

        /**
         * @param xOneGatewaySubscriptionId This header is meant to be used only for internal purposes and will be ignored on any public request. The purpose of this header is  to help on Gateway to API calls identification.
         * 
         * @return builder
         * 
         */
        public Builder xOneGatewaySubscriptionId(String xOneGatewaySubscriptionId) {
            return xOneGatewaySubscriptionId(Output.of(xOneGatewaySubscriptionId));
        }

        /**
         * @param xOneOriginRegion The Oracle Cloud Infrastructure home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1, us-phoenix-1 etc.
         * 
         * @return builder
         * 
         */
        public Builder xOneOriginRegion(@Nullable Output<String> xOneOriginRegion) {
            $.xOneOriginRegion = xOneOriginRegion;
            return this;
        }

        /**
         * @param xOneOriginRegion The Oracle Cloud Infrastructure home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1, us-phoenix-1 etc.
         * 
         * @return builder
         * 
         */
        public Builder xOneOriginRegion(String xOneOriginRegion) {
            return xOneOriginRegion(Output.of(xOneOriginRegion));
        }

        public GetSubscriptionsArgs build() {
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
