// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iot.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TopicRuleStepFunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final TopicRuleStepFunctionArgs Empty = new TopicRuleStepFunctionArgs();

    /**
     * The prefix used to generate, along with a UUID, the unique state machine execution name.
     * 
     */
    @Import(name="executionNamePrefix")
    private @Nullable Output<String> executionNamePrefix;

    /**
     * @return The prefix used to generate, along with a UUID, the unique state machine execution name.
     * 
     */
    public Optional<Output<String>> executionNamePrefix() {
        return Optional.ofNullable(this.executionNamePrefix);
    }

    /**
     * The ARN of the IAM role that grants access to start execution of the state machine.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The ARN of the IAM role that grants access to start execution of the state machine.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     * The name of the Step Functions state machine whose execution will be started.
     * 
     */
    @Import(name="stateMachineName", required=true)
    private Output<String> stateMachineName;

    /**
     * @return The name of the Step Functions state machine whose execution will be started.
     * 
     */
    public Output<String> stateMachineName() {
        return this.stateMachineName;
    }

    private TopicRuleStepFunctionArgs() {}

    private TopicRuleStepFunctionArgs(TopicRuleStepFunctionArgs $) {
        this.executionNamePrefix = $.executionNamePrefix;
        this.roleArn = $.roleArn;
        this.stateMachineName = $.stateMachineName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TopicRuleStepFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TopicRuleStepFunctionArgs $;

        public Builder() {
            $ = new TopicRuleStepFunctionArgs();
        }

        public Builder(TopicRuleStepFunctionArgs defaults) {
            $ = new TopicRuleStepFunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param executionNamePrefix The prefix used to generate, along with a UUID, the unique state machine execution name.
         * 
         * @return builder
         * 
         */
        public Builder executionNamePrefix(@Nullable Output<String> executionNamePrefix) {
            $.executionNamePrefix = executionNamePrefix;
            return this;
        }

        /**
         * @param executionNamePrefix The prefix used to generate, along with a UUID, the unique state machine execution name.
         * 
         * @return builder
         * 
         */
        public Builder executionNamePrefix(String executionNamePrefix) {
            return executionNamePrefix(Output.of(executionNamePrefix));
        }

        /**
         * @param roleArn The ARN of the IAM role that grants access to start execution of the state machine.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the IAM role that grants access to start execution of the state machine.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        /**
         * @param stateMachineName The name of the Step Functions state machine whose execution will be started.
         * 
         * @return builder
         * 
         */
        public Builder stateMachineName(Output<String> stateMachineName) {
            $.stateMachineName = stateMachineName;
            return this;
        }

        /**
         * @param stateMachineName The name of the Step Functions state machine whose execution will be started.
         * 
         * @return builder
         * 
         */
        public Builder stateMachineName(String stateMachineName) {
            return stateMachineName(Output.of(stateMachineName));
        }

        public TopicRuleStepFunctionArgs build() {
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            $.stateMachineName = Objects.requireNonNull($.stateMachineName, "expected parameter 'stateMachineName' to be non-null");
            return $;
        }
    }

}
