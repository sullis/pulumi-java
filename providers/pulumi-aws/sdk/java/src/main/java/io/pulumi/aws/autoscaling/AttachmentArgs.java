// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttachmentArgs Empty = new AttachmentArgs();

    /**
     * The ARN of an ALB Target Group.
     * 
     */
    @InputImport(name="albTargetGroupArn")
      private final @Nullable Input<String> albTargetGroupArn;

    public Input<String> getAlbTargetGroupArn() {
        return this.albTargetGroupArn == null ? Input.empty() : this.albTargetGroupArn;
    }

    /**
     * Name of ASG to associate with the ELB.
     * 
     */
    @InputImport(name="autoscalingGroupName", required=true)
      private final Input<String> autoscalingGroupName;

    public Input<String> getAutoscalingGroupName() {
        return this.autoscalingGroupName;
    }

    /**
     * The name of the ELB.
     * 
     */
    @InputImport(name="elb")
      private final @Nullable Input<String> elb;

    public Input<String> getElb() {
        return this.elb == null ? Input.empty() : this.elb;
    }

    public AttachmentArgs(
        @Nullable Input<String> albTargetGroupArn,
        Input<String> autoscalingGroupName,
        @Nullable Input<String> elb) {
        this.albTargetGroupArn = albTargetGroupArn;
        this.autoscalingGroupName = Objects.requireNonNull(autoscalingGroupName, "expected parameter 'autoscalingGroupName' to be non-null");
        this.elb = elb;
    }

    private AttachmentArgs() {
        this.albTargetGroupArn = Input.empty();
        this.autoscalingGroupName = Input.empty();
        this.elb = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> albTargetGroupArn;
        private Input<String> autoscalingGroupName;
        private @Nullable Input<String> elb;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.albTargetGroupArn = defaults.albTargetGroupArn;
    	      this.autoscalingGroupName = defaults.autoscalingGroupName;
    	      this.elb = defaults.elb;
        }

        public Builder setAlbTargetGroupArn(@Nullable Input<String> albTargetGroupArn) {
            this.albTargetGroupArn = albTargetGroupArn;
            return this;
        }

        public Builder setAlbTargetGroupArn(@Nullable String albTargetGroupArn) {
            this.albTargetGroupArn = Input.ofNullable(albTargetGroupArn);
            return this;
        }

        public Builder setAutoscalingGroupName(Input<String> autoscalingGroupName) {
            this.autoscalingGroupName = Objects.requireNonNull(autoscalingGroupName);
            return this;
        }

        public Builder setAutoscalingGroupName(String autoscalingGroupName) {
            this.autoscalingGroupName = Input.of(Objects.requireNonNull(autoscalingGroupName));
            return this;
        }

        public Builder setElb(@Nullable Input<String> elb) {
            this.elb = elb;
            return this;
        }

        public Builder setElb(@Nullable String elb) {
            this.elb = Input.ofNullable(elb);
            return this;
        }
        public AttachmentArgs build() {
            return new AttachmentArgs(albTargetGroupArn, autoscalingGroupName, elb);
        }
    }
}