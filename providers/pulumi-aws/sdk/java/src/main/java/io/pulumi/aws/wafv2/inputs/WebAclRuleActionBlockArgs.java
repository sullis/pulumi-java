// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.WebAclRuleActionBlockCustomResponseArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleActionBlockArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleActionBlockArgs Empty = new WebAclRuleActionBlockArgs();

    /**
     * Defines a custom response for the web request. See Custom Response below for details.
     * 
     */
    @Import(name="customResponse")
      private final @Nullable Output<WebAclRuleActionBlockCustomResponseArgs> customResponse;

    public Output<WebAclRuleActionBlockCustomResponseArgs> customResponse() {
        return this.customResponse == null ? Codegen.empty() : this.customResponse;
    }

    public WebAclRuleActionBlockArgs(@Nullable Output<WebAclRuleActionBlockCustomResponseArgs> customResponse) {
        this.customResponse = customResponse;
    }

    private WebAclRuleActionBlockArgs() {
        this.customResponse = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleActionBlockArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleActionBlockCustomResponseArgs> customResponse;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleActionBlockArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponse = defaults.customResponse;
        }

        public Builder customResponse(@Nullable Output<WebAclRuleActionBlockCustomResponseArgs> customResponse) {
            this.customResponse = customResponse;
            return this;
        }
        public Builder customResponse(@Nullable WebAclRuleActionBlockCustomResponseArgs customResponse) {
            this.customResponse = Codegen.ofNullable(customResponse);
            return this;
        }        public WebAclRuleActionBlockArgs build() {
            return new WebAclRuleActionBlockArgs(customResponse);
        }
    }
}
