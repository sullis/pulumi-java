// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.aws.wafv2.outputs.RuleGroupRuleActionAllowCustomRequestHandlingInsertHeader;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class RuleGroupRuleActionAllowCustomRequestHandling {
    /**
     * @return The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    private final List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeader> insertHeaders;

    @CustomType.Constructor
    private RuleGroupRuleActionAllowCustomRequestHandling(@CustomType.Parameter("insertHeaders") List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeader> insertHeaders) {
        this.insertHeaders = insertHeaders;
    }

    /**
     * @return The `insert_header` blocks used to define HTTP headers added to the request. See Custom HTTP Header below for details.
     * 
     */
    public List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeader> insertHeaders() {
        return this.insertHeaders;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionAllowCustomRequestHandling defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeader> insertHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionAllowCustomRequestHandling defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.insertHeaders = defaults.insertHeaders;
        }

        public Builder insertHeaders(List<RuleGroupRuleActionAllowCustomRequestHandlingInsertHeader> insertHeaders) {
            this.insertHeaders = Objects.requireNonNull(insertHeaders);
            return this;
        }
        public Builder insertHeaders(RuleGroupRuleActionAllowCustomRequestHandlingInsertHeader... insertHeaders) {
            return insertHeaders(List.of(insertHeaders));
        }        public RuleGroupRuleActionAllowCustomRequestHandling build() {
            return new RuleGroupRuleActionAllowCustomRequestHandling(insertHeaders);
        }
    }
}
