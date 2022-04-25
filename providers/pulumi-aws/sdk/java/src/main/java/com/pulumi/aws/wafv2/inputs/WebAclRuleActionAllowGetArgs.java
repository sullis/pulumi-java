// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleActionAllowCustomRequestHandlingGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleActionAllowGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionAllowGetArgs Empty = new WebAclRuleActionAllowGetArgs();

    /**
     * Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    @Import(name="customRequestHandling")
    private @Nullable Output<WebAclRuleActionAllowCustomRequestHandlingGetArgs> customRequestHandling;

    /**
     * @return Defines custom handling for the web request. See Custom Request Handling below for details.
     * 
     */
    public Optional<Output<WebAclRuleActionAllowCustomRequestHandlingGetArgs>> customRequestHandling() {
        return Optional.ofNullable(this.customRequestHandling);
    }

    private WebAclRuleActionAllowGetArgs() {}

    private WebAclRuleActionAllowGetArgs(WebAclRuleActionAllowGetArgs $) {
        this.customRequestHandling = $.customRequestHandling;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleActionAllowGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleActionAllowGetArgs $;

        public Builder() {
            $ = new WebAclRuleActionAllowGetArgs();
        }

        public Builder(WebAclRuleActionAllowGetArgs defaults) {
            $ = new WebAclRuleActionAllowGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customRequestHandling Defines custom handling for the web request. See Custom Request Handling below for details.
         * 
         * @return builder
         * 
         */
        public Builder customRequestHandling(@Nullable Output<WebAclRuleActionAllowCustomRequestHandlingGetArgs> customRequestHandling) {
            $.customRequestHandling = customRequestHandling;
            return this;
        }

        /**
         * @param customRequestHandling Defines custom handling for the web request. See Custom Request Handling below for details.
         * 
         * @return builder
         * 
         */
        public Builder customRequestHandling(WebAclRuleActionAllowCustomRequestHandlingGetArgs customRequestHandling) {
            return customRequestHandling(Output.of(customRequestHandling));
        }

        public WebAclRuleActionAllowGetArgs build() {
            return $;
        }
    }

}
