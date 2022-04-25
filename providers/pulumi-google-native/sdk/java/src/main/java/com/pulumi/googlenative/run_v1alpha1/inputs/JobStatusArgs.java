// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.run_v1alpha1.inputs.InstanceStatusArgs;
import com.pulumi.googlenative.run_v1alpha1.inputs.JobConditionArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * JobStatus represents the current state of a Job.
 * 
 */
public final class JobStatusArgs extends com.pulumi.resources.ResourceArgs {

    public static final JobStatusArgs Empty = new JobStatusArgs();

    /**
     * Optional. The number of actively running instances. +optional
     * 
     */
    @Import(name="active")
    private @Nullable Output<Integer> active;

    /**
     * @return Optional. The number of actively running instances. +optional
     * 
     */
    public Optional<Output<Integer>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * Optional. Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @Import(name="completionTime")
    private @Nullable Output<String> completionTime;

    /**
     * @return Optional. Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    public Optional<Output<String>> completionTime() {
        return Optional.ofNullable(this.completionTime);
    }

    /**
     * Optional. The latest available observations of a job&#39;s current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    @Import(name="conditions")
    private @Nullable Output<List<JobConditionArgs>> conditions;

    /**
     * @return Optional. The latest available observations of a job&#39;s current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
     * 
     */
    public Optional<Output<List<JobConditionArgs>>> conditions() {
        return Optional.ofNullable(this.conditions);
    }

    /**
     * Optional. The number of instances which reached phase Failed. +optional
     * 
     */
    @Import(name="failed")
    private @Nullable Output<Integer> failed;

    /**
     * @return Optional. The number of instances which reached phase Failed. +optional
     * 
     */
    public Optional<Output<Integer>> failed() {
        return Optional.ofNullable(this.failed);
    }

    /**
     * Optional. ImageDigest holds the resolved digest for the image specified within .Spec.Template.Spec.Container.Image. The digest is resolved during the creation of the Job. This field holds the digest value regardless of whether a tag or digest was originally specified in the Container object.
     * 
     */
    @Import(name="imageDigest")
    private @Nullable Output<String> imageDigest;

    /**
     * @return Optional. ImageDigest holds the resolved digest for the image specified within .Spec.Template.Spec.Container.Image. The digest is resolved during the creation of the Job. This field holds the digest value regardless of whether a tag or digest was originally specified in the Container object.
     * 
     */
    public Optional<Output<String>> imageDigest() {
        return Optional.ofNullable(this.imageDigest);
    }

    /**
     * Optional. Status of completed, failed, and running instances. +optional
     * 
     */
    @Import(name="instances")
    private @Nullable Output<List<InstanceStatusArgs>> instances;

    /**
     * @return Optional. Status of completed, failed, and running instances. +optional
     * 
     */
    public Optional<Output<List<InstanceStatusArgs>>> instances() {
        return Optional.ofNullable(this.instances);
    }

    /**
     * Optional. The &#39;generation&#39; of the job that was last processed by the controller.
     * 
     */
    @Import(name="observedGeneration")
    private @Nullable Output<Integer> observedGeneration;

    /**
     * @return Optional. The &#39;generation&#39; of the job that was last processed by the controller.
     * 
     */
    public Optional<Output<Integer>> observedGeneration() {
        return Optional.ofNullable(this.observedGeneration);
    }

    /**
     * Optional. Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return Optional. Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * Optional. The number of instances which reached phase Succeeded. +optional
     * 
     */
    @Import(name="succeeded")
    private @Nullable Output<Integer> succeeded;

    /**
     * @return Optional. The number of instances which reached phase Succeeded. +optional
     * 
     */
    public Optional<Output<Integer>> succeeded() {
        return Optional.ofNullable(this.succeeded);
    }

    private JobStatusArgs() {}

    private JobStatusArgs(JobStatusArgs $) {
        this.active = $.active;
        this.completionTime = $.completionTime;
        this.conditions = $.conditions;
        this.failed = $.failed;
        this.imageDigest = $.imageDigest;
        this.instances = $.instances;
        this.observedGeneration = $.observedGeneration;
        this.startTime = $.startTime;
        this.succeeded = $.succeeded;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JobStatusArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobStatusArgs $;

        public Builder() {
            $ = new JobStatusArgs();
        }

        public Builder(JobStatusArgs defaults) {
            $ = new JobStatusArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param active Optional. The number of actively running instances. +optional
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Integer> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Optional. The number of actively running instances. +optional
         * 
         * @return builder
         * 
         */
        public Builder active(Integer active) {
            return active(Output.of(active));
        }

        /**
         * @param completionTime Optional. Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
         * 
         * @return builder
         * 
         */
        public Builder completionTime(@Nullable Output<String> completionTime) {
            $.completionTime = completionTime;
            return this;
        }

        /**
         * @param completionTime Optional. Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
         * 
         * @return builder
         * 
         */
        public Builder completionTime(String completionTime) {
            return completionTime(Output.of(completionTime));
        }

        /**
         * @param conditions Optional. The latest available observations of a job&#39;s current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
         * 
         * @return builder
         * 
         */
        public Builder conditions(@Nullable Output<List<JobConditionArgs>> conditions) {
            $.conditions = conditions;
            return this;
        }

        /**
         * @param conditions Optional. The latest available observations of a job&#39;s current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
         * 
         * @return builder
         * 
         */
        public Builder conditions(List<JobConditionArgs> conditions) {
            return conditions(Output.of(conditions));
        }

        /**
         * @param conditions Optional. The latest available observations of a job&#39;s current state. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/ +optional
         * 
         * @return builder
         * 
         */
        public Builder conditions(JobConditionArgs... conditions) {
            return conditions(List.of(conditions));
        }

        /**
         * @param failed Optional. The number of instances which reached phase Failed. +optional
         * 
         * @return builder
         * 
         */
        public Builder failed(@Nullable Output<Integer> failed) {
            $.failed = failed;
            return this;
        }

        /**
         * @param failed Optional. The number of instances which reached phase Failed. +optional
         * 
         * @return builder
         * 
         */
        public Builder failed(Integer failed) {
            return failed(Output.of(failed));
        }

        /**
         * @param imageDigest Optional. ImageDigest holds the resolved digest for the image specified within .Spec.Template.Spec.Container.Image. The digest is resolved during the creation of the Job. This field holds the digest value regardless of whether a tag or digest was originally specified in the Container object.
         * 
         * @return builder
         * 
         */
        public Builder imageDigest(@Nullable Output<String> imageDigest) {
            $.imageDigest = imageDigest;
            return this;
        }

        /**
         * @param imageDigest Optional. ImageDigest holds the resolved digest for the image specified within .Spec.Template.Spec.Container.Image. The digest is resolved during the creation of the Job. This field holds the digest value regardless of whether a tag or digest was originally specified in the Container object.
         * 
         * @return builder
         * 
         */
        public Builder imageDigest(String imageDigest) {
            return imageDigest(Output.of(imageDigest));
        }

        /**
         * @param instances Optional. Status of completed, failed, and running instances. +optional
         * 
         * @return builder
         * 
         */
        public Builder instances(@Nullable Output<List<InstanceStatusArgs>> instances) {
            $.instances = instances;
            return this;
        }

        /**
         * @param instances Optional. Status of completed, failed, and running instances. +optional
         * 
         * @return builder
         * 
         */
        public Builder instances(List<InstanceStatusArgs> instances) {
            return instances(Output.of(instances));
        }

        /**
         * @param instances Optional. Status of completed, failed, and running instances. +optional
         * 
         * @return builder
         * 
         */
        public Builder instances(InstanceStatusArgs... instances) {
            return instances(List.of(instances));
        }

        /**
         * @param observedGeneration Optional. The &#39;generation&#39; of the job that was last processed by the controller.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(@Nullable Output<Integer> observedGeneration) {
            $.observedGeneration = observedGeneration;
            return this;
        }

        /**
         * @param observedGeneration Optional. The &#39;generation&#39; of the job that was last processed by the controller.
         * 
         * @return builder
         * 
         */
        public Builder observedGeneration(Integer observedGeneration) {
            return observedGeneration(Output.of(observedGeneration));
        }

        /**
         * @param startTime Optional. Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime Optional. Represents time when the job was acknowledged by the job controller. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. +optional
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param succeeded Optional. The number of instances which reached phase Succeeded. +optional
         * 
         * @return builder
         * 
         */
        public Builder succeeded(@Nullable Output<Integer> succeeded) {
            $.succeeded = succeeded;
            return this;
        }

        /**
         * @param succeeded Optional. The number of instances which reached phase Succeeded. +optional
         * 
         * @return builder
         * 
         */
        public Builder succeeded(Integer succeeded) {
            return succeeded(Output.of(succeeded));
        }

        public JobStatusArgs build() {
            return $;
        }
    }

}
