// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmcontacts.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContactChannelArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContactChannelArgs Empty = new GetContactChannelArgs();

    /**
     * The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * 
     */
    @Import(name="arn", required=true)
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the engagement to a contact channel.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }

    private GetContactChannelArgs() {}

    private GetContactChannelArgs(GetContactChannelArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContactChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContactChannelArgs $;

        public Builder() {
            $ = new GetContactChannelArgs();
        }

        public Builder(GetContactChannelArgs defaults) {
            $ = new GetContactChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the engagement to a contact channel.
         * 
         * @return builder
         * 
         */
        public Builder arn(Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the engagement to a contact channel.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public GetContactChannelArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
