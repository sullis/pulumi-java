// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInvocationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInvocationPlainArgs Empty = new GetInvocationPlainArgs();

    /**
     * The name of the lambda function.
     * 
     */
    @Import(name="functionName", required=true)
    private String functionName;

    /**
     * @return The name of the lambda function.
     * 
     */
    public String functionName() {
        return this.functionName;
    }

    /**
     * A string in JSON format that is passed as payload to the lambda function.
     * 
     */
    @Import(name="input", required=true)
    private String input;

    /**
     * @return A string in JSON format that is passed as payload to the lambda function.
     * 
     */
    public String input() {
        return this.input;
    }

    /**
     * The qualifier (a.k.a version) of the lambda function. Defaults
     * to `$LATEST`.
     * 
     */
    @Import(name="qualifier")
    private @Nullable String qualifier;

    /**
     * @return The qualifier (a.k.a version) of the lambda function. Defaults
     * to `$LATEST`.
     * 
     */
    public Optional<String> qualifier() {
        return Optional.ofNullable(this.qualifier);
    }

    private GetInvocationPlainArgs() {}

    private GetInvocationPlainArgs(GetInvocationPlainArgs $) {
        this.functionName = $.functionName;
        this.input = $.input;
        this.qualifier = $.qualifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInvocationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInvocationPlainArgs $;

        public Builder() {
            $ = new GetInvocationPlainArgs();
        }

        public Builder(GetInvocationPlainArgs defaults) {
            $ = new GetInvocationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param functionName The name of the lambda function.
         * 
         * @return builder
         * 
         */
        public Builder functionName(String functionName) {
            $.functionName = functionName;
            return this;
        }

        /**
         * @param input A string in JSON format that is passed as payload to the lambda function.
         * 
         * @return builder
         * 
         */
        public Builder input(String input) {
            $.input = input;
            return this;
        }

        /**
         * @param qualifier The qualifier (a.k.a version) of the lambda function. Defaults
         * to `$LATEST`.
         * 
         * @return builder
         * 
         */
        public Builder qualifier(@Nullable String qualifier) {
            $.qualifier = qualifier;
            return this;
        }

        public GetInvocationPlainArgs build() {
            $.functionName = Objects.requireNonNull($.functionName, "expected parameter 'functionName' to be non-null");
            $.input = Objects.requireNonNull($.input, "expected parameter 'input' to be non-null");
            return $;
        }
    }

}
