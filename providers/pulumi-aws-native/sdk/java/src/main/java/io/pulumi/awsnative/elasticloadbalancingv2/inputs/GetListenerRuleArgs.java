// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.elasticloadbalancingv2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetListenerRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetListenerRuleArgs Empty = new GetListenerRuleArgs();

    @InputImport(name="ruleArn", required=true)
      private final String ruleArn;

    public String getRuleArn() {
        return this.ruleArn;
    }

    public GetListenerRuleArgs(String ruleArn) {
        this.ruleArn = Objects.requireNonNull(ruleArn, "expected parameter 'ruleArn' to be non-null");
    }

    private GetListenerRuleArgs() {
        this.ruleArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleArn = defaults.ruleArn;
        }

        public Builder setRuleArn(String ruleArn) {
            this.ruleArn = Objects.requireNonNull(ruleArn);
            return this;
        }
        public GetListenerRuleArgs build() {
            return new GetListenerRuleArgs(ruleArn);
        }
    }
}