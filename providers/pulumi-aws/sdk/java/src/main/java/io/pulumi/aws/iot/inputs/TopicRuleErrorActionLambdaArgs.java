// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iot.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class TopicRuleErrorActionLambdaArgs extends io.pulumi.resources.ResourceArgs {

    public static final TopicRuleErrorActionLambdaArgs Empty = new TopicRuleErrorActionLambdaArgs();

    /**
     * The ARN of the Lambda function.
     * 
     */
    @Import(name="functionArn", required=true)
      private final Output<String> functionArn;

    public Output<String> functionArn() {
        return this.functionArn;
    }

    public TopicRuleErrorActionLambdaArgs(Output<String> functionArn) {
        this.functionArn = Objects.requireNonNull(functionArn, "expected parameter 'functionArn' to be non-null");
    }

    private TopicRuleErrorActionLambdaArgs() {
        this.functionArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TopicRuleErrorActionLambdaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> functionArn;

        public Builder() {
    	      // Empty
        }

        public Builder(TopicRuleErrorActionLambdaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionArn = defaults.functionArn;
        }

        public Builder functionArn(Output<String> functionArn) {
            this.functionArn = Objects.requireNonNull(functionArn);
            return this;
        }
        public Builder functionArn(String functionArn) {
            this.functionArn = Output.of(Objects.requireNonNull(functionArn));
            return this;
        }        public TopicRuleErrorActionLambdaArgs build() {
            return new TopicRuleErrorActionLambdaArgs(functionArn);
        }
    }
}
