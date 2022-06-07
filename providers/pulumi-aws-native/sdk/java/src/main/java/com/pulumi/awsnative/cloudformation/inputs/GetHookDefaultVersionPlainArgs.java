// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHookDefaultVersionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHookDefaultVersionPlainArgs Empty = new GetHookDefaultVersionPlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the type. This is used to uniquely identify a HookDefaultVersion
     * 
     */
    @Import(name="arn", required=true)
    private String arn;

    /**
     * @return The Amazon Resource Name (ARN) of the type. This is used to uniquely identify a HookDefaultVersion
     * 
     */
    public String arn() {
        return this.arn;
    }

    private GetHookDefaultVersionPlainArgs() {}

    private GetHookDefaultVersionPlainArgs(GetHookDefaultVersionPlainArgs $) {
        this.arn = $.arn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHookDefaultVersionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHookDefaultVersionPlainArgs $;

        public Builder() {
            $ = new GetHookDefaultVersionPlainArgs();
        }

        public Builder(GetHookDefaultVersionPlainArgs defaults) {
            $ = new GetHookDefaultVersionPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn The Amazon Resource Name (ARN) of the type. This is used to uniquely identify a HookDefaultVersion
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            $.arn = arn;
            return this;
        }

        public GetHookDefaultVersionPlainArgs build() {
            $.arn = Objects.requireNonNull($.arn, "expected parameter 'arn' to be non-null");
            return $;
        }
    }

}
