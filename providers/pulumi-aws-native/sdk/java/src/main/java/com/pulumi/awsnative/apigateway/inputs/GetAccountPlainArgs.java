// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.apigateway.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAccountPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAccountPlainArgs Empty = new GetAccountPlainArgs();

    /**
     * Primary identifier which is manually generated.
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Primary identifier which is manually generated.
     * 
     */
    public String id() {
        return this.id;
    }

    private GetAccountPlainArgs() {}

    private GetAccountPlainArgs(GetAccountPlainArgs $) {
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAccountPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAccountPlainArgs $;

        public Builder() {
            $ = new GetAccountPlainArgs();
        }

        public Builder(GetAccountPlainArgs defaults) {
            $ = new GetAccountPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id Primary identifier which is manually generated.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        public GetAccountPlainArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
