// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader {
    /**
     * @return The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader(@CustomType.Parameter("name") String name) {
        this.name = name;
    }

    /**
     * @return The name of the query header to inspect. This setting must be provided as lower case characters.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader build() {
            return new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSizeConstraintStatementFieldToMatchSingleHeader(name);
        }
    }
}
