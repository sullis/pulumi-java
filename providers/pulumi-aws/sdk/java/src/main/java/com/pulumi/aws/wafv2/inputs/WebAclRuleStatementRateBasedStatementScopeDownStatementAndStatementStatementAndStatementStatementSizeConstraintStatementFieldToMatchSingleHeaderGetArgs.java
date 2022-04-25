// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs Empty = new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs();

    /**
     * The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs() {}

    private WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs $) {
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs();
        }

        public Builder(WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs defaults) {
            $ = new WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the query header to inspect. This setting must be provided as lower case characters.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the query header to inspect. This setting must be provided as lower case characters.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public WebAclRuleStatementRateBasedStatementScopeDownStatementAndStatementStatementAndStatementStatementSizeConstraintStatementFieldToMatchSingleHeaderGetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
