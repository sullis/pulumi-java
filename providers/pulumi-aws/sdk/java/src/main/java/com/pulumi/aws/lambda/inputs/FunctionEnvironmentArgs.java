// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionEnvironmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionEnvironmentArgs Empty = new FunctionEnvironmentArgs();

    /**
     * Map of environment variables that are accessible from the function code during execution.
     * 
     */
    @Import(name="variables")
    private @Nullable Output<Map<String,String>> variables;

    /**
     * @return Map of environment variables that are accessible from the function code during execution.
     * 
     */
    public Optional<Output<Map<String,String>>> variables() {
        return Optional.ofNullable(this.variables);
    }

    private FunctionEnvironmentArgs() {}

    private FunctionEnvironmentArgs(FunctionEnvironmentArgs $) {
        this.variables = $.variables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionEnvironmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionEnvironmentArgs $;

        public Builder() {
            $ = new FunctionEnvironmentArgs();
        }

        public Builder(FunctionEnvironmentArgs defaults) {
            $ = new FunctionEnvironmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param variables Map of environment variables that are accessible from the function code during execution.
         * 
         * @return builder
         * 
         */
        public Builder variables(@Nullable Output<Map<String,String>> variables) {
            $.variables = variables;
            return this;
        }

        /**
         * @param variables Map of environment variables that are accessible from the function code during execution.
         * 
         * @return builder
         * 
         */
        public Builder variables(Map<String,String> variables) {
            return variables(Output.of(variables));
        }

        public FunctionEnvironmentArgs build() {
            return $;
        }
    }

}
