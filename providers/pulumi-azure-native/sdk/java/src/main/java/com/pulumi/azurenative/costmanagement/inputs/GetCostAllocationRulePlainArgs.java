// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.costmanagement.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCostAllocationRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCostAllocationRulePlainArgs Empty = new GetCostAllocationRulePlainArgs();

    /**
     * BillingAccount ID
     * 
     */
    @Import(name="billingAccountId", required=true)
    private String billingAccountId;

    /**
     * @return BillingAccount ID
     * 
     */
    public String billingAccountId() {
        return this.billingAccountId;
    }

    /**
     * Cost allocation rule name. The name cannot include spaces or any non alphanumeric characters other than &#39;_&#39; and &#39;-&#39;. The max length is 260 characters.
     * 
     */
    @Import(name="ruleName", required=true)
    private String ruleName;

    /**
     * @return Cost allocation rule name. The name cannot include spaces or any non alphanumeric characters other than &#39;_&#39; and &#39;-&#39;. The max length is 260 characters.
     * 
     */
    public String ruleName() {
        return this.ruleName;
    }

    private GetCostAllocationRulePlainArgs() {}

    private GetCostAllocationRulePlainArgs(GetCostAllocationRulePlainArgs $) {
        this.billingAccountId = $.billingAccountId;
        this.ruleName = $.ruleName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCostAllocationRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCostAllocationRulePlainArgs $;

        public Builder() {
            $ = new GetCostAllocationRulePlainArgs();
        }

        public Builder(GetCostAllocationRulePlainArgs defaults) {
            $ = new GetCostAllocationRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param billingAccountId BillingAccount ID
         * 
         * @return builder
         * 
         */
        public Builder billingAccountId(String billingAccountId) {
            $.billingAccountId = billingAccountId;
            return this;
        }

        /**
         * @param ruleName Cost allocation rule name. The name cannot include spaces or any non alphanumeric characters other than &#39;_&#39; and &#39;-&#39;. The max length is 260 characters.
         * 
         * @return builder
         * 
         */
        public Builder ruleName(String ruleName) {
            $.ruleName = ruleName;
            return this;
        }

        public GetCostAllocationRulePlainArgs build() {
            $.billingAccountId = Objects.requireNonNull($.billingAccountId, "expected parameter 'billingAccountId' to be non-null");
            $.ruleName = Objects.requireNonNull($.ruleName, "expected parameter 'ruleName' to be non-null");
            return $;
        }
    }

}
