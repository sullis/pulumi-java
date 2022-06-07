// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourceDefaultVersionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourceDefaultVersionPlainArgs Empty = new GetResourceDefaultVersionPlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the type. This is used to uniquely identify a ResourceDefaultVersion
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The Amazon Resource Name (ARN) of the type. This is used to uniquely identify a ResourceDefaultVersion
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetResourceDefaultVersionPlainArgs() {}

    private GetResourceDefaultVersionPlainArgs(GetResourceDefaultVersionPlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourceDefaultVersionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourceDefaultVersionPlainArgs $;

        public Builder() {
            $ = new GetResourceDefaultVersionPlainArgs();
        }

        public Builder(GetResourceDefaultVersionPlainArgs defaults) {
            $ = new GetResourceDefaultVersionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the type. This is used to uniquely identify a ResourceDefaultVersion
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetResourceDefaultVersionPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
