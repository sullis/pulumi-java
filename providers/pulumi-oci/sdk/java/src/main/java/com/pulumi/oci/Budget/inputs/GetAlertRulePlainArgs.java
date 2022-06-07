// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Budget.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAlertRulePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAlertRulePlainArgs Empty = new GetAlertRulePlainArgs();

    /**
     * The unique Alert Rule OCID
     * 
     */
    @Import(name="alertRuleId", required=true)
    private String alertRuleId;

    /**
     * @return The unique Alert Rule OCID
     * 
     */
    public String alertRuleId() {
        return this.alertRuleId;
    }

    /**
     * The unique Budget OCID
     * 
     */
    @Import(name="budgetId", required=true)
    private String budgetId;

    /**
     * @return The unique Budget OCID
     * 
     */
    public String budgetId() {
        return this.budgetId;
    }

    private GetAlertRulePlainArgs() {}

    private GetAlertRulePlainArgs(GetAlertRulePlainArgs $) {
        this.alertRuleId = $.alertRuleId;
        this.budgetId = $.budgetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAlertRulePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAlertRulePlainArgs $;

        public Builder() {
            $ = new GetAlertRulePlainArgs();
        }

        public Builder(GetAlertRulePlainArgs defaults) {
            $ = new GetAlertRulePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertRuleId The unique Alert Rule OCID
         * 
         * @return builder
         * 
         */
        public Builder alertRuleId(String alertRuleId) {
            $.alertRuleId = alertRuleId;
            return this;
        }

        /**
         * @param budgetId The unique Budget OCID
         * 
         * @return builder
         * 
         */
        public Builder budgetId(String budgetId) {
            $.budgetId = budgetId;
            return this;
        }

        public GetAlertRulePlainArgs build() {
            $.alertRuleId = Objects.requireNonNull($.alertRuleId, "expected parameter 'alertRuleId' to be non-null");
            $.budgetId = Objects.requireNonNull($.budgetId, "expected parameter 'budgetId' to be non-null");
            return $;
        }
    }

}
