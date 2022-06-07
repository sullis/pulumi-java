// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmcontacts.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContactArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContactArgs Empty = new GetContactArgs();

    /**
     * The Amazon Resource Name (ARN) of the contact.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the contact.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    private GetContactArgs() {}

    private GetContactArgs(GetContactArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContactArgs $;

        public Builder() {
            $ = new GetContactArgs();
        }

        public Builder(GetContactArgs defaults) {
            $ = new GetContactArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the contact.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the contact.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetContactArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
