// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudformation.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetHookTypeConfigPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetHookTypeConfigPlainArgs Empty = new GetHookTypeConfigPlainArgs();

    /**
     * The Amazon Resource Name (ARN) of the type version.
     * 
     */
    @Import(name="typeArn", required=true)
    private String typeArn;

    /**
     * @return The Amazon Resource Name (ARN) of the type version.
     * 
     */
    public String typeArn() {
        return this.typeArn;
    }

    private GetHookTypeConfigPlainArgs() {}

    private GetHookTypeConfigPlainArgs(GetHookTypeConfigPlainArgs $) {
        this.typeArn = $.typeArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetHookTypeConfigPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetHookTypeConfigPlainArgs $;

        public Builder() {
            $ = new GetHookTypeConfigPlainArgs();
        }

        public Builder(GetHookTypeConfigPlainArgs defaults) {
            $ = new GetHookTypeConfigPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param typeArn The Amazon Resource Name (ARN) of the type version.
         * 
         * @return builder
         * 
         */
        public Builder typeArn(String typeArn) {
            $.typeArn = typeArn;
            return this;
        }

        public GetHookTypeConfigPlainArgs build() {
            $.typeArn = Objects.requireNonNull($.typeArn, "expected parameter 'typeArn' to be non-null");
            return $;
        }
    }

}
