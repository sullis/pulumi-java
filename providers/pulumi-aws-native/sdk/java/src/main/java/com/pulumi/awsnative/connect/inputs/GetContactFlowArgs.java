// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.connect.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContactFlowArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContactFlowArgs Empty = new GetContactFlowArgs();

    /**
     * The identifier of the contact flow (ARN).
     * 
     */
    @Import(name="contactFlowArn", required=true)
    private Output<String> contactFlowArn;

    /**
     * @return The identifier of the contact flow (ARN).
     * 
     */
    public Output<String> contactFlowArn() {
        return this.contactFlowArn;
    }

    private GetContactFlowArgs() {}

    private GetContactFlowArgs(GetContactFlowArgs $) {
        this.contactFlowArn = $.contactFlowArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContactFlowArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContactFlowArgs $;

        public Builder() {
            $ = new GetContactFlowArgs();
        }

        public Builder(GetContactFlowArgs defaults) {
            $ = new GetContactFlowArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param contactFlowArn The identifier of the contact flow (ARN).
         * 
         * @return builder
         * 
         */
        public Builder contactFlowArn(Output<String> contactFlowArn) {
            $.contactFlowArn = contactFlowArn;
            return this;
        }

        /**
         * @param contactFlowArn The identifier of the contact flow (ARN).
         * 
         * @return builder
         * 
         */
        public Builder contactFlowArn(String contactFlowArn) {
            return contactFlowArn(Output.of(contactFlowArn));
        }

        public GetContactFlowArgs build() {
            $.contactFlowArn = Objects.requireNonNull($.contactFlowArn, "expected parameter 'contactFlowArn' to be non-null");
            return $;
        }
    }

}
