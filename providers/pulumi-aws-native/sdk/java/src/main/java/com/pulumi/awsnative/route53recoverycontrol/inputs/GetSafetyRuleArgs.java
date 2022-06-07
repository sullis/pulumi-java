// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53recoverycontrol.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSafetyRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSafetyRuleArgs Empty = new GetSafetyRuleArgs();

    /**
     * The Amazon Resource Name (ARN) of the safety rule.
     * 
     */
    @Import(name="safetyRuleArn", required=true)
    private Output<String> safetyRuleArn;

    /**
     * @return The Amazon Resource Name (ARN) of the safety rule.
     * 
     */
    public Output<String> safetyRuleArn() {
        return this.safetyRuleArn;
    }

    private GetSafetyRuleArgs() {}

    private GetSafetyRuleArgs(GetSafetyRuleArgs $) {
        this.safetyRuleArn = $.safetyRuleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSafetyRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSafetyRuleArgs $;

        public Builder() {
            $ = new GetSafetyRuleArgs();
        }

        public Builder(GetSafetyRuleArgs defaults) {
            $ = new GetSafetyRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param safetyRuleArn The Amazon Resource Name (ARN) of the safety rule.
         * 
         * @return builder
         * 
         */
        public Builder safetyRuleArn(Output<String> safetyRuleArn) {
            $.safetyRuleArn = safetyRuleArn;
            return this;
        }

        /**
         * @param safetyRuleArn The Amazon Resource Name (ARN) of the safety rule.
         * 
         * @return builder
         * 
         */
        public Builder safetyRuleArn(String safetyRuleArn) {
            return safetyRuleArn(Output.of(safetyRuleArn));
        }

        public GetSafetyRuleArgs build() {
            $.safetyRuleArn = Objects.requireNonNull($.safetyRuleArn, "expected parameter 'safetyRuleArn' to be non-null");
            return $;
        }
    }

}
