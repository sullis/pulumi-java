// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.autoscaling;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LifecycleHookArgs extends com.pulumi.resources.ResourceArgs {

    public static final LifecycleHookArgs Empty = new LifecycleHookArgs();

    /**
     * The name of the Auto Scaling group to which you want to assign the lifecycle hook
     * 
     */
    @Import(name="autoscalingGroupName", required=true)
    private Output<String> autoscalingGroupName;

    /**
     * @return The name of the Auto Scaling group to which you want to assign the lifecycle hook
     * 
     */
    public Output<String> autoscalingGroupName() {
        return this.autoscalingGroupName;
    }

    /**
     * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
     * 
     */
    @Import(name="defaultResult")
    private @Nullable Output<String> defaultResult;

    /**
     * @return Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
     * 
     */
    public Optional<Output<String>> defaultResult() {
        return Optional.ofNullable(this.defaultResult);
    }

    /**
     * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
     * 
     */
    @Import(name="heartbeatTimeout")
    private @Nullable Output<Integer> heartbeatTimeout;

    /**
     * @return Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
     * 
     */
    public Optional<Output<Integer>> heartbeatTimeout() {
        return Optional.ofNullable(this.heartbeatTimeout);
    }

    /**
     * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
     * 
     */
    @Import(name="lifecycleTransition", required=true)
    private Output<String> lifecycleTransition;

    /**
     * @return The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
     * 
     */
    public Output<String> lifecycleTransition() {
        return this.lifecycleTransition;
    }

    /**
     * The name of the lifecycle hook.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the lifecycle hook.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
     * 
     */
    @Import(name="notificationMetadata")
    private @Nullable Output<String> notificationMetadata;

    /**
     * @return Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
     * 
     */
    public Optional<Output<String>> notificationMetadata() {
        return Optional.ofNullable(this.notificationMetadata);
    }

    /**
     * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
     * 
     */
    @Import(name="notificationTargetArn")
    private @Nullable Output<String> notificationTargetArn;

    /**
     * @return The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
     * 
     */
    public Optional<Output<String>> notificationTargetArn() {
        return Optional.ofNullable(this.notificationTargetArn);
    }

    /**
     * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * 
     */
    @Import(name="roleArn")
    private @Nullable Output<String> roleArn;

    /**
     * @return The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
     * 
     */
    public Optional<Output<String>> roleArn() {
        return Optional.ofNullable(this.roleArn);
    }

    private LifecycleHookArgs() {}

    private LifecycleHookArgs(LifecycleHookArgs $) {
        this.autoscalingGroupName = $.autoscalingGroupName;
        this.defaultResult = $.defaultResult;
        this.heartbeatTimeout = $.heartbeatTimeout;
        this.lifecycleTransition = $.lifecycleTransition;
        this.name = $.name;
        this.notificationMetadata = $.notificationMetadata;
        this.notificationTargetArn = $.notificationTargetArn;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LifecycleHookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LifecycleHookArgs $;

        public Builder() {
            $ = new LifecycleHookArgs();
        }

        public Builder(LifecycleHookArgs defaults) {
            $ = new LifecycleHookArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscalingGroupName The name of the Auto Scaling group to which you want to assign the lifecycle hook
         * 
         * @return builder
         * 
         */
        public Builder autoscalingGroupName(Output<String> autoscalingGroupName) {
            $.autoscalingGroupName = autoscalingGroupName;
            return this;
        }

        /**
         * @param autoscalingGroupName The name of the Auto Scaling group to which you want to assign the lifecycle hook
         * 
         * @return builder
         * 
         */
        public Builder autoscalingGroupName(String autoscalingGroupName) {
            return autoscalingGroupName(Output.of(autoscalingGroupName));
        }

        /**
         * @param defaultResult Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
         * 
         * @return builder
         * 
         */
        public Builder defaultResult(@Nullable Output<String> defaultResult) {
            $.defaultResult = defaultResult;
            return this;
        }

        /**
         * @param defaultResult Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
         * 
         * @return builder
         * 
         */
        public Builder defaultResult(String defaultResult) {
            return defaultResult(Output.of(defaultResult));
        }

        /**
         * @param heartbeatTimeout Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
         * 
         * @return builder
         * 
         */
        public Builder heartbeatTimeout(@Nullable Output<Integer> heartbeatTimeout) {
            $.heartbeatTimeout = heartbeatTimeout;
            return this;
        }

        /**
         * @param heartbeatTimeout Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
         * 
         * @return builder
         * 
         */
        public Builder heartbeatTimeout(Integer heartbeatTimeout) {
            return heartbeatTimeout(Output.of(heartbeatTimeout));
        }

        /**
         * @param lifecycleTransition The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
         * 
         * @return builder
         * 
         */
        public Builder lifecycleTransition(Output<String> lifecycleTransition) {
            $.lifecycleTransition = lifecycleTransition;
            return this;
        }

        /**
         * @param lifecycleTransition The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
         * 
         * @return builder
         * 
         */
        public Builder lifecycleTransition(String lifecycleTransition) {
            return lifecycleTransition(Output.of(lifecycleTransition));
        }

        /**
         * @param name The name of the lifecycle hook.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the lifecycle hook.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param notificationMetadata Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
         * 
         * @return builder
         * 
         */
        public Builder notificationMetadata(@Nullable Output<String> notificationMetadata) {
            $.notificationMetadata = notificationMetadata;
            return this;
        }

        /**
         * @param notificationMetadata Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
         * 
         * @return builder
         * 
         */
        public Builder notificationMetadata(String notificationMetadata) {
            return notificationMetadata(Output.of(notificationMetadata));
        }

        /**
         * @param notificationTargetArn The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
         * 
         * @return builder
         * 
         */
        public Builder notificationTargetArn(@Nullable Output<String> notificationTargetArn) {
            $.notificationTargetArn = notificationTargetArn;
            return this;
        }

        /**
         * @param notificationTargetArn The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
         * 
         * @return builder
         * 
         */
        public Builder notificationTargetArn(String notificationTargetArn) {
            return notificationTargetArn(Output.of(notificationTargetArn));
        }

        /**
         * @param roleArn The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(@Nullable Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public LifecycleHookArgs build() {
            $.autoscalingGroupName = Objects.requireNonNull($.autoscalingGroupName, "expected parameter 'autoscalingGroupName' to be non-null");
            $.lifecycleTransition = Objects.requireNonNull($.lifecycleTransition, "expected parameter 'lifecycleTransition' to be non-null");
            return $;
        }
    }

}
