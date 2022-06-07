// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.aps.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRuleGroupsNamespaceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRuleGroupsNamespaceArgs Empty = new GetRuleGroupsNamespaceArgs();

    /**
     * The RuleGroupsNamespace ARN.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The RuleGroupsNamespace ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    private GetRuleGroupsNamespaceArgs() {}

    private GetRuleGroupsNamespaceArgs(GetRuleGroupsNamespaceArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRuleGroupsNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRuleGroupsNamespaceArgs $;

        public Builder() {
            $ = new GetRuleGroupsNamespaceArgs();
        }

        public Builder(GetRuleGroupsNamespaceArgs defaults) {
            $ = new GetRuleGroupsNamespaceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The RuleGroupsNamespace ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The RuleGroupsNamespace ARN.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetRuleGroupsNamespaceArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
