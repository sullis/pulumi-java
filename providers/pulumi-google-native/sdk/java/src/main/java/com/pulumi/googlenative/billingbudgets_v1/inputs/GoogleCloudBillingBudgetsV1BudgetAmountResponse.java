// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.billingbudgets_v1.inputs.GoogleCloudBillingBudgetsV1LastPeriodAmountResponse;
import com.pulumi.googlenative.billingbudgets_v1.inputs.GoogleTypeMoneyResponse;
import java.util.Objects;


/**
 * The budgeted amount for each usage period.
 * 
 */
public final class GoogleCloudBillingBudgetsV1BudgetAmountResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudBillingBudgetsV1BudgetAmountResponse Empty = new GoogleCloudBillingBudgetsV1BudgetAmountResponse();

    /**
     * Use the last period&#39;s actual spend as the budget for the present period. LastPeriodAmount can only be set when the budget&#39;s time period is a Filter.calendar_period. It cannot be set in combination with Filter.custom_period.
     * 
     */
    @Import(name="lastPeriodAmount", required=true)
    private GoogleCloudBillingBudgetsV1LastPeriodAmountResponse lastPeriodAmount;

    /**
     * @return Use the last period&#39;s actual spend as the budget for the present period. LastPeriodAmount can only be set when the budget&#39;s time period is a Filter.calendar_period. It cannot be set in combination with Filter.custom_period.
     * 
     */
    public GoogleCloudBillingBudgetsV1LastPeriodAmountResponse lastPeriodAmount() {
        return this.lastPeriodAmount;
    }

    /**
     * A specified amount to use as the budget. `currency_code` is optional. If specified when creating a budget, it must match the currency of the billing account. If specified when updating a budget, it must match the currency_code of the existing budget. The `currency_code` is provided on output.
     * 
     */
    @Import(name="specifiedAmount", required=true)
    private GoogleTypeMoneyResponse specifiedAmount;

    /**
     * @return A specified amount to use as the budget. `currency_code` is optional. If specified when creating a budget, it must match the currency of the billing account. If specified when updating a budget, it must match the currency_code of the existing budget. The `currency_code` is provided on output.
     * 
     */
    public GoogleTypeMoneyResponse specifiedAmount() {
        return this.specifiedAmount;
    }

    private GoogleCloudBillingBudgetsV1BudgetAmountResponse() {}

    private GoogleCloudBillingBudgetsV1BudgetAmountResponse(GoogleCloudBillingBudgetsV1BudgetAmountResponse $) {
        this.lastPeriodAmount = $.lastPeriodAmount;
        this.specifiedAmount = $.specifiedAmount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudBillingBudgetsV1BudgetAmountResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudBillingBudgetsV1BudgetAmountResponse $;

        public Builder() {
            $ = new GoogleCloudBillingBudgetsV1BudgetAmountResponse();
        }

        public Builder(GoogleCloudBillingBudgetsV1BudgetAmountResponse defaults) {
            $ = new GoogleCloudBillingBudgetsV1BudgetAmountResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param lastPeriodAmount Use the last period&#39;s actual spend as the budget for the present period. LastPeriodAmount can only be set when the budget&#39;s time period is a Filter.calendar_period. It cannot be set in combination with Filter.custom_period.
         * 
         * @return builder
         * 
         */
        public Builder lastPeriodAmount(GoogleCloudBillingBudgetsV1LastPeriodAmountResponse lastPeriodAmount) {
            $.lastPeriodAmount = lastPeriodAmount;
            return this;
        }

        /**
         * @param specifiedAmount A specified amount to use as the budget. `currency_code` is optional. If specified when creating a budget, it must match the currency of the billing account. If specified when updating a budget, it must match the currency_code of the existing budget. The `currency_code` is provided on output.
         * 
         * @return builder
         * 
         */
        public Builder specifiedAmount(GoogleTypeMoneyResponse specifiedAmount) {
            $.specifiedAmount = specifiedAmount;
            return this;
        }

        public GoogleCloudBillingBudgetsV1BudgetAmountResponse build() {
            $.lastPeriodAmount = Objects.requireNonNull($.lastPeriodAmount, "expected parameter 'lastPeriodAmount' to be non-null");
            $.specifiedAmount = Objects.requireNonNull($.specifiedAmount, "expected parameter 'specifiedAmount' to be non-null");
            return $;
        }
    }

}
