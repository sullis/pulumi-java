// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ssmcontacts.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetContactPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetContactPlainArgs Empty = new GetContactPlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the contact.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The Amazon Resource Name (ARN) of the contact.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetContactPlainArgs() {}

    private GetContactPlainArgs(GetContactPlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetContactPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetContactPlainArgs $;

        public Builder() {
            $ = new GetContactPlainArgs();
        }

        public Builder(GetContactPlainArgs defaults) {
            $ = new GetContactPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the contact.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetContactPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
