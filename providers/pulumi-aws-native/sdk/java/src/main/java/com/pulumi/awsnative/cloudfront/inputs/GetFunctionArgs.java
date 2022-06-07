// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.cloudfront.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFunctionArgs Empty = new GetFunctionArgs();

    @Import(name="functionARN", required=true)
    private Output<String> functionARN;

    public Output<String> functionARN() {
        return this.functionARN;
    }

    private GetFunctionArgs() {}

    private GetFunctionArgs(GetFunctionArgs $) {
        this.functionARN = $.functionARN;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFunctionArgs $;

        public Builder() {
            $ = new GetFunctionArgs();
        }

        public Builder(GetFunctionArgs defaults) {
            $ = new GetFunctionArgs(Objects.requireNonNull(defaults));
        }

        public Builder functionARN(Output<String> functionARN) {
            $.functionARN = functionARN;
            return this;
        }

        public Builder functionARN(String functionARN) {
            return functionARN(Output.of(functionARN));
        }

        public GetFunctionArgs build() {
            $.functionARN = Objects.requireNonNull($.functionARN, "expected parameter 'functionARN' to be non-null");
            return $;
        }
    }

}
