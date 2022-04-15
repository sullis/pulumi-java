// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.outputs;

import io.pulumi.aws.wafv2.outputs.WebAclRuleActionAllow;
import io.pulumi.aws.wafv2.outputs.WebAclRuleActionBlock;
import io.pulumi.aws.wafv2.outputs.WebAclRuleActionCount;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WebAclRuleAction {
    /**
     * Instructs AWS WAF to allow the web request. See Allow below for details.
     * 
     */
    private final @Nullable WebAclRuleActionAllow allow;
    /**
     * Instructs AWS WAF to block the web request. See Block below for details.
     * 
     */
    private final @Nullable WebAclRuleActionBlock block;
    /**
     * Instructs AWS WAF to count the web request and allow it. See Count below for details.
     * 
     */
    private final @Nullable WebAclRuleActionCount count;

    @CustomType.Constructor
    private WebAclRuleAction(
        @CustomType.Parameter("allow") @Nullable WebAclRuleActionAllow allow,
        @CustomType.Parameter("block") @Nullable WebAclRuleActionBlock block,
        @CustomType.Parameter("count") @Nullable WebAclRuleActionCount count) {
        this.allow = allow;
        this.block = block;
        this.count = count;
    }

    /**
     * Instructs AWS WAF to allow the web request. See Allow below for details.
     * 
    */
    public Optional<WebAclRuleActionAllow> allow() {
        return Optional.ofNullable(this.allow);
    }
    /**
     * Instructs AWS WAF to block the web request. See Block below for details.
     * 
    */
    public Optional<WebAclRuleActionBlock> block() {
        return Optional.ofNullable(this.block);
    }
    /**
     * Instructs AWS WAF to count the web request and allow it. See Count below for details.
     * 
    */
    public Optional<WebAclRuleActionCount> count() {
        return Optional.ofNullable(this.count);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebAclRuleActionAllow allow;
        private @Nullable WebAclRuleActionBlock block;
        private @Nullable WebAclRuleActionCount count;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
    	      this.count = defaults.count;
        }

        public Builder allow(@Nullable WebAclRuleActionAllow allow) {
            this.allow = allow;
            return this;
        }
        public Builder block(@Nullable WebAclRuleActionBlock block) {
            this.block = block;
            return this;
        }
        public Builder count(@Nullable WebAclRuleActionCount count) {
            this.count = count;
            return this;
        }        public WebAclRuleAction build() {
            return new WebAclRuleAction(allow, block, count);
        }
    }
}
