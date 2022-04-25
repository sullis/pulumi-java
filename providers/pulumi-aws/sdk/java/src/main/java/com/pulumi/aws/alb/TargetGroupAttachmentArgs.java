// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.alb;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class TargetGroupAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final TargetGroupAttachmentArgs Empty = new TargetGroupAttachmentArgs();

    /**
     * The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to &#39;all&#39;.
     * 
     */
    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    /**
     * @return The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to &#39;all&#39;.
     * 
     */
    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * The port on which targets receive traffic.
     * 
     */
    @Import(name="port")
    private @Nullable Output<Integer> port;

    /**
     * @return The port on which targets receive traffic.
     * 
     */
    public Optional<Output<Integer>> port() {
        return Optional.ofNullable(this.port);
    }

    /**
     * The ARN of the target group with which to register targets
     * 
     */
    @Import(name="targetGroupArn", required=true)
    private Output<String> targetGroupArn;

    /**
     * @return The ARN of the target group with which to register targets
     * 
     */
    public Output<String> targetGroupArn() {
        return this.targetGroupArn;
    }

    /**
     * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda. If the target type is alb, specify the arn of alb.
     * 
     */
    @Import(name="targetId", required=true)
    private Output<String> targetId;

    /**
     * @return The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda. If the target type is alb, specify the arn of alb.
     * 
     */
    public Output<String> targetId() {
        return this.targetId;
    }

    private TargetGroupAttachmentArgs() {}

    private TargetGroupAttachmentArgs(TargetGroupAttachmentArgs $) {
        this.availabilityZone = $.availabilityZone;
        this.port = $.port;
        this.targetGroupArn = $.targetGroupArn;
        this.targetId = $.targetId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(TargetGroupAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private TargetGroupAttachmentArgs $;

        public Builder() {
            $ = new TargetGroupAttachmentArgs();
        }

        public Builder(TargetGroupAttachmentArgs defaults) {
            $ = new TargetGroupAttachmentArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityZone The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to &#39;all&#39;.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param availabilityZone The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to &#39;all&#39;.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        /**
         * @param port The port on which targets receive traffic.
         * 
         * @return builder
         * 
         */
        public Builder port(@Nullable Output<Integer> port) {
            $.port = port;
            return this;
        }

        /**
         * @param port The port on which targets receive traffic.
         * 
         * @return builder
         * 
         */
        public Builder port(Integer port) {
            return port(Output.of(port));
        }

        /**
         * @param targetGroupArn The ARN of the target group with which to register targets
         * 
         * @return builder
         * 
         */
        public Builder targetGroupArn(Output<String> targetGroupArn) {
            $.targetGroupArn = targetGroupArn;
            return this;
        }

        /**
         * @param targetGroupArn The ARN of the target group with which to register targets
         * 
         * @return builder
         * 
         */
        public Builder targetGroupArn(String targetGroupArn) {
            return targetGroupArn(Output.of(targetGroupArn));
        }

        /**
         * @param targetId The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda. If the target type is alb, specify the arn of alb.
         * 
         * @return builder
         * 
         */
        public Builder targetId(Output<String> targetId) {
            $.targetId = targetId;
            return this;
        }

        /**
         * @param targetId The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda. If the target type is alb, specify the arn of alb.
         * 
         * @return builder
         * 
         */
        public Builder targetId(String targetId) {
            return targetId(Output.of(targetId));
        }

        public TargetGroupAttachmentArgs build() {
            $.targetGroupArn = Objects.requireNonNull($.targetGroupArn, "expected parameter 'targetGroupArn' to be non-null");
            $.targetId = Objects.requireNonNull($.targetId, "expected parameter 'targetId' to be non-null");
            return $;
        }
    }

}
