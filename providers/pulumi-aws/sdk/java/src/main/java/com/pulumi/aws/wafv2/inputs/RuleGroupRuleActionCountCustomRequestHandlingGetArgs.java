// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


public final class RuleGroupRuleActionCountCustomRequestHandlingGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionCountCustomRequestHandlingGetArgs Empty = new RuleGroupRuleActionCountCustomRequestHandlingGetArgs();

    /**
     * The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    @Import(name="insertHeaders", required=true)
    private Output<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders;

    /**
     * @return The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    public Output<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders() {
        return this.insertHeaders;
    }

    private RuleGroupRuleActionCountCustomRequestHandlingGetArgs() {}

    private RuleGroupRuleActionCountCustomRequestHandlingGetArgs(RuleGroupRuleActionCountCustomRequestHandlingGetArgs $) {
        this.insertHeaders = $.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupRuleActionCountCustomRequestHandlingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupRuleActionCountCustomRequestHandlingGetArgs $;

        public Builder() {
            $ = new RuleGroupRuleActionCountCustomRequestHandlingGetArgs();
        }

        public Builder(RuleGroupRuleActionCountCustomRequestHandlingGetArgs defaults) {
            $ = new RuleGroupRuleActionCountCustomRequestHandlingGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param insertHeaders The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder insertHeaders(Output<List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs>> insertHeaders) {
            $.insertHeaders = insertHeaders;
            return this;
        }

        /**
         * @param insertHeaders The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder insertHeaders(List<RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs> insertHeaders) {
            return insertHeaders(Output.of(insertHeaders));
        }

        /**
         * @param insertHeaders The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
         * 
         * @return builder
         * 
         */
        public Builder insertHeaders(RuleGroupRuleActionCountCustomRequestHandlingInsertHeaderGetArgs... insertHeaders) {
            return insertHeaders(List.of(insertHeaders));
        }

        public RuleGroupRuleActionCountCustomRequestHandlingGetArgs build() {
            $.insertHeaders = Objects.requireNonNull($.insertHeaders, "expected parameter 'insertHeaders' to be non-null");
            return $;
        }
    }

}
