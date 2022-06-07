// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetTypeActivationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTypeActivationPlainArgs Empty = new GetTypeActivationPlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the extension.
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The Amazon Resource Name (ARN) of the extension.
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetTypeActivationPlainArgs() {}

    private GetTypeActivationPlainArgs(GetTypeActivationPlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTypeActivationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTypeActivationPlainArgs $;

        public Builder() {
            $ = new GetTypeActivationPlainArgs();
        }

        public Builder(GetTypeActivationPlainArgs defaults) {
            $ = new GetTypeActivationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the extension.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetTypeActivationPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
