// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafregional.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RuleGroupActivatedRuleActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final RuleGroupActivatedRuleActionArgs Empty = new RuleGroupActivatedRuleActionArgs();

    /**
     * The rule type, either `REGULAR`, `RATE_BASED`, or `GROUP`. Defaults to `REGULAR`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The rule type, either `REGULAR`, `RATE_BASED`, or `GROUP`. Defaults to `REGULAR`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private RuleGroupActivatedRuleActionArgs() {}

    private RuleGroupActivatedRuleActionArgs(RuleGroupActivatedRuleActionArgs $) {
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RuleGroupActivatedRuleActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RuleGroupActivatedRuleActionArgs $;

        public Builder() {
            $ = new RuleGroupActivatedRuleActionArgs();
        }

        public Builder(RuleGroupActivatedRuleActionArgs defaults) {
            $ = new RuleGroupActivatedRuleActionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param type The rule type, either `REGULAR`, `RATE_BASED`, or `GROUP`. Defaults to `REGULAR`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The rule type, either `REGULAR`, `RATE_BASED`, or `GROUP`. Defaults to `REGULAR`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public RuleGroupActivatedRuleActionArgs build() {
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
