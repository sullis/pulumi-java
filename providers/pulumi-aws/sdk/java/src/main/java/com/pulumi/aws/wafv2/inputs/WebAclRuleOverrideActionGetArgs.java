// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionCountGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleOverrideActionNoneGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleOverrideActionGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleOverrideActionGetArgs Empty = new WebAclRuleOverrideActionGetArgs();

    /**
     * Override the rule action setting to count (i.e., only count matches). Configured as an empty block `{}`.
     * 
     */
    @Import(name="count")
    private @Nullable Output<WebAclRuleOverrideActionCountGetArgs> count;

    /**
     * @return Override the rule action setting to count (i.e., only count matches). Configured as an empty block `{}`.
     * 
     */
    public Optional<Output<WebAclRuleOverrideActionCountGetArgs>> count() {
        return Optional.ofNullable(this.count);
    }

    /**
     * Don&#39;t override the rule action setting. Configured as an empty block `{}`.
     * 
     */
    @Import(name="none")
    private @Nullable Output<WebAclRuleOverrideActionNoneGetArgs> none;

    /**
     * @return Don&#39;t override the rule action setting. Configured as an empty block `{}`.
     * 
     */
    public Optional<Output<WebAclRuleOverrideActionNoneGetArgs>> none() {
        return Optional.ofNullable(this.none);
    }

    private WebAclRuleOverrideActionGetArgs() {}

    private WebAclRuleOverrideActionGetArgs(WebAclRuleOverrideActionGetArgs $) {
        this.count = $.count;
        this.none = $.none;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleOverrideActionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleOverrideActionGetArgs $;

        public Builder() {
            $ = new WebAclRuleOverrideActionGetArgs();
        }

        public Builder(WebAclRuleOverrideActionGetArgs defaults) {
            $ = new WebAclRuleOverrideActionGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param count Override the rule action setting to count (i.e., only count matches). Configured as an empty block `{}`.
         * 
         * @return builder
         * 
         */
        public Builder count(@Nullable Output<WebAclRuleOverrideActionCountGetArgs> count) {
            $.count = count;
            return this;
        }

        /**
         * @param count Override the rule action setting to count (i.e., only count matches). Configured as an empty block `{}`.
         * 
         * @return builder
         * 
         */
        public Builder count(WebAclRuleOverrideActionCountGetArgs count) {
            return count(Output.of(count));
        }

        /**
         * @param none Don&#39;t override the rule action setting. Configured as an empty block `{}`.
         * 
         * @return builder
         * 
         */
        public Builder none(@Nullable Output<WebAclRuleOverrideActionNoneGetArgs> none) {
            $.none = none;
            return this;
        }

        /**
         * @param none Don&#39;t override the rule action setting. Configured as an empty block `{}`.
         * 
         * @return builder
         * 
         */
        public Builder none(WebAclRuleOverrideActionNoneGetArgs none) {
            return none(Output.of(none));
        }

        public WebAclRuleOverrideActionGetArgs build() {
            return $;
        }
    }

}
