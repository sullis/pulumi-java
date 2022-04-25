// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockCustomResponseGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleActionBlockGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionBlockGetArgs Empty = new WebAclRuleActionBlockGetArgs();

    /**
     * Defines a custom response for the web request. See Custom Response below for details.
     * 
     */
    @Import(name="customResponse")
    private @Nullable Output<WebAclRuleActionBlockCustomResponseGetArgs> customResponse;

    /**
     * @return Defines a custom response for the web request. See Custom Response below for details.
     * 
     */
    public Optional<Output<WebAclRuleActionBlockCustomResponseGetArgs>> customResponse() {
        return Optional.ofNullable(this.customResponse);
    }

    private WebAclRuleActionBlockGetArgs() {}

    private WebAclRuleActionBlockGetArgs(WebAclRuleActionBlockGetArgs $) {
        this.customResponse = $.customResponse;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleActionBlockGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleActionBlockGetArgs $;

        public Builder() {
            $ = new WebAclRuleActionBlockGetArgs();
        }

        public Builder(WebAclRuleActionBlockGetArgs defaults) {
            $ = new WebAclRuleActionBlockGetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customResponse Defines a custom response for the web request. See Custom Response below for details.
         * 
         * @return builder
         * 
         */
        public Builder customResponse(@Nullable Output<WebAclRuleActionBlockCustomResponseGetArgs> customResponse) {
            $.customResponse = customResponse;
            return this;
        }

        /**
         * @param customResponse Defines a custom response for the web request. See Custom Response below for details.
         * 
         * @return builder
         * 
         */
        public Builder customResponse(WebAclRuleActionBlockCustomResponseGetArgs customResponse) {
            return customResponse(Output.of(customResponse));
        }

        public WebAclRuleActionBlockGetArgs build() {
            return $;
        }
    }

}
