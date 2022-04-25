// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.billingbudgets_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.billingbudgets_v1.inputs.GoogleTypeDateResponse;
import java.util.Objects;


/**
 * All date times begin at 12 AM US and Canadian Pacific Time (UTC-8).
 * 
 */
public final class GoogleCloudBillingBudgetsV1CustomPeriodResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudBillingBudgetsV1CustomPeriodResponse Empty = new GoogleCloudBillingBudgetsV1CustomPeriodResponse();

    /**
     * Optional. The end date of the time period. Budgets with elapsed end date won&#39;t be processed. If unset, specifies to track all usage incurred since the start_date.
     * 
     */
    @Import(name="endDate", required=true)
    private GoogleTypeDateResponse endDate;

    /**
     * @return Optional. The end date of the time period. Budgets with elapsed end date won&#39;t be processed. If unset, specifies to track all usage incurred since the start_date.
     * 
     */
    public GoogleTypeDateResponse endDate() {
        return this.endDate;
    }

    /**
     * The start date must be after January 1, 2017.
     * 
     */
    @Import(name="startDate", required=true)
    private GoogleTypeDateResponse startDate;

    /**
     * @return The start date must be after January 1, 2017.
     * 
     */
    public GoogleTypeDateResponse startDate() {
        return this.startDate;
    }

    private GoogleCloudBillingBudgetsV1CustomPeriodResponse() {}

    private GoogleCloudBillingBudgetsV1CustomPeriodResponse(GoogleCloudBillingBudgetsV1CustomPeriodResponse $) {
        this.endDate = $.endDate;
        this.startDate = $.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudBillingBudgetsV1CustomPeriodResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudBillingBudgetsV1CustomPeriodResponse $;

        public Builder() {
            $ = new GoogleCloudBillingBudgetsV1CustomPeriodResponse();
        }

        public Builder(GoogleCloudBillingBudgetsV1CustomPeriodResponse defaults) {
            $ = new GoogleCloudBillingBudgetsV1CustomPeriodResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param endDate Optional. The end date of the time period. Budgets with elapsed end date won&#39;t be processed. If unset, specifies to track all usage incurred since the start_date.
         * 
         * @return builder
         * 
         */
        public Builder endDate(GoogleTypeDateResponse endDate) {
            $.endDate = endDate;
            return this;
        }

        /**
         * @param startDate The start date must be after January 1, 2017.
         * 
         * @return builder
         * 
         */
        public Builder startDate(GoogleTypeDateResponse startDate) {
            $.startDate = startDate;
            return this;
        }

        public GoogleCloudBillingBudgetsV1CustomPeriodResponse build() {
            $.endDate = Objects.requireNonNull($.endDate, "expected parameter 'endDate' to be non-null");
            $.startDate = Objects.requireNonNull($.startDate, "expected parameter 'startDate' to be non-null");
            return $;
        }
    }

}
