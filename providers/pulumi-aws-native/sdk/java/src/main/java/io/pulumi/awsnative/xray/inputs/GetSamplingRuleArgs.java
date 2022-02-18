// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.xray.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSamplingRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSamplingRuleArgs Empty = new GetSamplingRuleArgs();

    @InputImport(name="ruleARN", required=true)
    private final String ruleARN;

    public String getRuleARN() {
        return this.ruleARN;
    }

    public GetSamplingRuleArgs(String ruleARN) {
        this.ruleARN = Objects.requireNonNull(ruleARN, "expected parameter 'ruleARN' to be non-null");
    }

    private GetSamplingRuleArgs() {
        this.ruleARN = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSamplingRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleARN;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSamplingRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleARN = defaults.ruleARN;
        }

        public Builder setRuleARN(String ruleARN) {
            this.ruleARN = Objects.requireNonNull(ruleARN);
            return this;
        }

        public GetSamplingRuleArgs build() {
            return new GetSamplingRuleArgs(ruleARN);
        }
    }
}
