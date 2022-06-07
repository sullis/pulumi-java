// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediaconnect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFlowEntitlementArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFlowEntitlementArgs Empty = new GetFlowEntitlementArgs();

    /**
     * The ARN of the entitlement.
     * 
     */
    @Import(name="entitlementArn", required=true)
    private Output<String> entitlementArn;

    /**
     * @return The ARN of the entitlement.
     * 
     */
    public Output<String> entitlementArn() {
        return this.entitlementArn;
    }

    private GetFlowEntitlementArgs() {}

    private GetFlowEntitlementArgs(GetFlowEntitlementArgs $) {
        this.entitlementArn = $.entitlementArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFlowEntitlementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFlowEntitlementArgs $;

        public Builder() {
            $ = new GetFlowEntitlementArgs();
        }

        public Builder(GetFlowEntitlementArgs defaults) {
            $ = new GetFlowEntitlementArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param entitlementArn The ARN of the entitlement.
         * 
         * @return builder
         * 
         */
        public Builder entitlementArn(Output<String> entitlementArn) {
            $.entitlementArn = entitlementArn;
            return this;
        }

        /**
         * @param entitlementArn The ARN of the entitlement.
         * 
         * @return builder
         * 
         */
        public Builder entitlementArn(String entitlementArn) {
            return entitlementArn(Output.of(entitlementArn));
        }

        public GetFlowEntitlementArgs build() {
            $.entitlementArn = Objects.requireNonNull($.entitlementArn, "expected parameter 'entitlementArn' to be non-null");
            return $;
        }
    }

}
