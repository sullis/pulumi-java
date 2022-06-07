// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionPlainArgs Empty = new GetFunctionPlainArgs();

    @Import(name="functionARN", required=true)
    private String functionARN;

    public String functionARN() {
        return this.functionARN;
    }

    private GetFunctionPlainArgs() {}

    private GetFunctionPlainArgs(GetFunctionPlainArgs $) {
        this.functionARN = $.functionARN;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionPlainArgs $;

        public Builder() {
            $ = new GetFunctionPlainArgs();
        }

        public Builder(GetFunctionPlainArgs defaults) {
            $ = new GetFunctionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder functionARN(String functionARN) {
            $.functionARN = functionARN;
            return this;
        }

        public GetFunctionPlainArgs build() {
            $.functionARN = Objects.requireNonNull($.functionARN, "expected parameter 'functionARN' to be non-null");
            return $;
        }
    }

}
