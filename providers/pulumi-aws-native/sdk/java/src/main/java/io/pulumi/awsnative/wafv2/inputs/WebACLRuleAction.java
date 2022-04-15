// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLAllowAction;
import io.pulumi.awsnative.wafv2.inputs.WebACLBlockAction;
import io.pulumi.awsnative.wafv2.inputs.WebACLCaptchaAction;
import io.pulumi.awsnative.wafv2.inputs.WebACLCountAction;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Action taken when Rule matches its condition.
 * 
 */
public final class WebACLRuleAction extends io.pulumi.resources.InvokeArgs {

    public static final WebACLRuleAction Empty = new WebACLRuleAction();

    @Import(name="allow")
      private final @Nullable WebACLAllowAction allow;

    public Optional<WebACLAllowAction> allow() {
        return this.allow == null ? Optional.empty() : Optional.ofNullable(this.allow);
    }

    @Import(name="block")
      private final @Nullable WebACLBlockAction block;

    public Optional<WebACLBlockAction> block() {
        return this.block == null ? Optional.empty() : Optional.ofNullable(this.block);
    }

    @Import(name="captcha")
      private final @Nullable WebACLCaptchaAction captcha;

    public Optional<WebACLCaptchaAction> captcha() {
        return this.captcha == null ? Optional.empty() : Optional.ofNullable(this.captcha);
    }

    @Import(name="count")
      private final @Nullable WebACLCountAction count;

    public Optional<WebACLCountAction> count() {
        return this.count == null ? Optional.empty() : Optional.ofNullable(this.count);
    }

    public WebACLRuleAction(
        @Nullable WebACLAllowAction allow,
        @Nullable WebACLBlockAction block,
        @Nullable WebACLCaptchaAction captcha,
        @Nullable WebACLCountAction count) {
        this.allow = allow;
        this.block = block;
        this.captcha = captcha;
        this.count = count;
    }

    private WebACLRuleAction() {
        this.allow = null;
        this.block = null;
        this.captcha = null;
        this.count = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLRuleAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WebACLAllowAction allow;
        private @Nullable WebACLBlockAction block;
        private @Nullable WebACLCaptchaAction captcha;
        private @Nullable WebACLCountAction count;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLRuleAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allow = defaults.allow;
    	      this.block = defaults.block;
    	      this.captcha = defaults.captcha;
    	      this.count = defaults.count;
        }

        public Builder allow(@Nullable WebACLAllowAction allow) {
            this.allow = allow;
            return this;
        }
        public Builder block(@Nullable WebACLBlockAction block) {
            this.block = block;
            return this;
        }
        public Builder captcha(@Nullable WebACLCaptchaAction captcha) {
            this.captcha = captcha;
            return this;
        }
        public Builder count(@Nullable WebACLCountAction count) {
            this.count = count;
            return this;
        }        public WebACLRuleAction build() {
            return new WebACLRuleAction(allow, block, captcha, count);
        }
    }
}
