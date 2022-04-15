// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.aws.wafv2.inputs.RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuleGroupRuleActionBlockCustomResponseGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupRuleActionBlockCustomResponseGetArgs Empty = new RuleGroupRuleActionBlockCustomResponseGetArgs();

    /**
     * References the response body that you want AWS WAF to return to the web request client. This must reference a `key` defined in a `custom_response_body` block of this resource.
     * 
     */
    @Import(name="customResponseBodyKey")
      private final @Nullable Output<String> customResponseBodyKey;

    public Output<String> customResponseBodyKey() {
        return this.customResponseBodyKey == null ? Codegen.empty() : this.customResponseBodyKey;
    }

    /**
     * The HTTP status code to return to the client.
     * 
     */
    @Import(name="responseCode", required=true)
      private final Output<Integer> responseCode;

    public Output<Integer> responseCode() {
        return this.responseCode;
    }

    /**
     * The `response_header` blocks used to define the HTTP response headers added to the response. See Custom HTTP Header below for details.
     * 
     */
    @Import(name="responseHeaders")
      private final @Nullable Output<List<RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders;

    public Output<List<RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders() {
        return this.responseHeaders == null ? Codegen.empty() : this.responseHeaders;
    }

    public RuleGroupRuleActionBlockCustomResponseGetArgs(
        @Nullable Output<String> customResponseBodyKey,
        Output<Integer> responseCode,
        @Nullable Output<List<RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders) {
        this.customResponseBodyKey = customResponseBodyKey;
        this.responseCode = Objects.requireNonNull(responseCode, "expected parameter 'responseCode' to be non-null");
        this.responseHeaders = responseHeaders;
    }

    private RuleGroupRuleActionBlockCustomResponseGetArgs() {
        this.customResponseBodyKey = Codegen.empty();
        this.responseCode = Codegen.empty();
        this.responseHeaders = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupRuleActionBlockCustomResponseGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customResponseBodyKey;
        private Output<Integer> responseCode;
        private @Nullable Output<List<RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupRuleActionBlockCustomResponseGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customResponseBodyKey = defaults.customResponseBodyKey;
    	      this.responseCode = defaults.responseCode;
    	      this.responseHeaders = defaults.responseHeaders;
        }

        public Builder customResponseBodyKey(@Nullable Output<String> customResponseBodyKey) {
            this.customResponseBodyKey = customResponseBodyKey;
            return this;
        }
        public Builder customResponseBodyKey(@Nullable String customResponseBodyKey) {
            this.customResponseBodyKey = Codegen.ofNullable(customResponseBodyKey);
            return this;
        }
        public Builder responseCode(Output<Integer> responseCode) {
            this.responseCode = Objects.requireNonNull(responseCode);
            return this;
        }
        public Builder responseCode(Integer responseCode) {
            this.responseCode = Output.of(Objects.requireNonNull(responseCode));
            return this;
        }
        public Builder responseHeaders(@Nullable Output<List<RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs>> responseHeaders) {
            this.responseHeaders = responseHeaders;
            return this;
        }
        public Builder responseHeaders(@Nullable List<RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs> responseHeaders) {
            this.responseHeaders = Codegen.ofNullable(responseHeaders);
            return this;
        }
        public Builder responseHeaders(RuleGroupRuleActionBlockCustomResponseResponseHeaderGetArgs... responseHeaders) {
            return responseHeaders(List.of(responseHeaders));
        }        public RuleGroupRuleActionBlockCustomResponseGetArgs build() {
            return new RuleGroupRuleActionBlockCustomResponseGetArgs(customResponseBodyKey, responseCode, responseHeaders);
        }
    }
}
