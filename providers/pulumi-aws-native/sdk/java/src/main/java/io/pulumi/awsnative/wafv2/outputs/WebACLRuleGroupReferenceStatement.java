// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.WebACLExcludedRule;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WebACLRuleGroupReferenceStatement {
    private final String arn;
    private final @Nullable List<WebACLExcludedRule> excludedRules;

    @CustomType.Constructor
    private WebACLRuleGroupReferenceStatement(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("excludedRules") @Nullable List<WebACLExcludedRule> excludedRules) {
        this.arn = arn;
        this.excludedRules = excludedRules;
    }

    public String arn() {
        return this.arn;
    }
    public List<WebACLExcludedRule> excludedRules() {
        return this.excludedRules == null ? List.of() : this.excludedRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRuleGroupReferenceStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private @Nullable List<WebACLExcludedRule> excludedRules;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRuleGroupReferenceStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.excludedRules = defaults.excludedRules;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder excludedRules(@Nullable List<WebACLExcludedRule> excludedRules) {
            this.excludedRules = excludedRules;
            return this;
        }
        public Builder excludedRules(WebACLExcludedRule... excludedRules) {
            return excludedRules(List.of(excludedRules));
        }        public WebACLRuleGroupReferenceStatement build() {
            return new WebACLRuleGroupReferenceStatement(arn, excludedRules);
        }
    }
}
