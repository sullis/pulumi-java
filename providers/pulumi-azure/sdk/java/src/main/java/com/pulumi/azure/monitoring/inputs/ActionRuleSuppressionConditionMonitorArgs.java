// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ActionRuleSuppressionConditionMonitorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ActionRuleSuppressionConditionMonitorArgs Empty = new ActionRuleSuppressionConditionMonitorArgs();

    /**
     * The operator for a given condition. Possible values are `Equals` and `NotEquals`.
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return The operator for a given condition. Possible values are `Equals` and `NotEquals`.
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * A list of values to match for a given condition. Possible values are `Fired` and `Resolved`.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return A list of values to match for a given condition. Possible values are `Fired` and `Resolved`.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private ActionRuleSuppressionConditionMonitorArgs() {}

    private ActionRuleSuppressionConditionMonitorArgs(ActionRuleSuppressionConditionMonitorArgs $) {
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ActionRuleSuppressionConditionMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ActionRuleSuppressionConditionMonitorArgs $;

        public Builder() {
            $ = new ActionRuleSuppressionConditionMonitorArgs();
        }

        public Builder(ActionRuleSuppressionConditionMonitorArgs defaults) {
            $ = new ActionRuleSuppressionConditionMonitorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operator The operator for a given condition. Possible values are `Equals` and `NotEquals`.
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator for a given condition. Possible values are `Equals` and `NotEquals`.
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param values A list of values to match for a given condition. Possible values are `Fired` and `Resolved`.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values A list of values to match for a given condition. Possible values are `Fired` and `Resolved`.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values A list of values to match for a given condition. Possible values are `Fired` and `Resolved`.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public ActionRuleSuppressionConditionMonitorArgs build() {
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
