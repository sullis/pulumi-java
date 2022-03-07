// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.batch_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.kubernetes.batch_v1.outputs.JobCondition;
import io.pulumi.kubernetes.batch_v1.outputs.UncountedTerminatedPods;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JobStatus {
    /**
     * The number of pending and running pods.
     * 
     */
    private final @Nullable Integer active;
    /**
     * CompletedIndexes holds the completed indexes when .spec.completionMode = "Indexed" in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as "1,3-5,7".
     * 
     */
    private final @Nullable String completedIndexes;
    /**
     * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. The completion time is only set when the job finishes successfully.
     * 
     */
    private final @Nullable String completionTime;
    /**
     * The latest available observations of an object's current state. When a Job fails, one of the conditions will have type "Failed" and status true. When a Job is suspended, one of the conditions will have type "Suspended" and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type "Complete" and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
     */
    private final @Nullable List<JobCondition> conditions;
    /**
     * The number of pods which reached phase Failed.
     * 
     */
    private final @Nullable Integer failed;
    /**
     * The number of pods which have a Ready condition.
     * 
     * This field is alpha-level. The job controller populates the field when the feature gate JobReadyPods is enabled (disabled by default).
     * 
     */
    private final @Nullable Integer ready;
    /**
     * Represents time when the job controller started processing a job. When a Job is created in the suspended state, this field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It is represented in RFC3339 form and is in UTC.
     * 
     */
    private final @Nullable String startTime;
    /**
     * The number of pods which reached phase Succeeded.
     * 
     */
    private final @Nullable Integer succeeded;
    /**
     * UncountedTerminatedPods holds the UIDs of Pods that have terminated but the job controller hasn't yet accounted for in the status counters.
     * 
     * The job controller creates pods with a finalizer. When a pod terminates (succeeded or failed), the controller does three steps to account for it in the job status: (1) Add the pod UID to the arrays in this field. (2) Remove the pod finalizer. (3) Remove the pod UID from the arrays while increasing the corresponding
     *     counter.
     * 
     * This field is beta-level. The job controller only makes use of this field when the feature gate JobTrackingWithFinalizers is enabled (enabled by default). Old jobs might not be tracked using this field, in which case the field remains null.
     * 
     */
    private final @Nullable UncountedTerminatedPods uncountedTerminatedPods;

    @OutputCustomType.Constructor({"active","completedIndexes","completionTime","conditions","failed","ready","startTime","succeeded","uncountedTerminatedPods"})
    private JobStatus(
        @Nullable Integer active,
        @Nullable String completedIndexes,
        @Nullable String completionTime,
        @Nullable List<JobCondition> conditions,
        @Nullable Integer failed,
        @Nullable Integer ready,
        @Nullable String startTime,
        @Nullable Integer succeeded,
        @Nullable UncountedTerminatedPods uncountedTerminatedPods) {
        this.active = active;
        this.completedIndexes = completedIndexes;
        this.completionTime = completionTime;
        this.conditions = conditions;
        this.failed = failed;
        this.ready = ready;
        this.startTime = startTime;
        this.succeeded = succeeded;
        this.uncountedTerminatedPods = uncountedTerminatedPods;
    }

    /**
     * The number of pending and running pods.
     * 
    */
    public Optional<Integer> getActive() {
        return Optional.ofNullable(this.active);
    }
    /**
     * CompletedIndexes holds the completed indexes when .spec.completionMode = "Indexed" in a text format. The indexes are represented as decimal integers separated by commas. The numbers are listed in increasing order. Three or more consecutive numbers are compressed and represented by the first and last element of the series, separated by a hyphen. For example, if the completed indexes are 1, 3, 4, 5 and 7, they are represented as "1,3-5,7".
     * 
    */
    public Optional<String> getCompletedIndexes() {
        return Optional.ofNullable(this.completedIndexes);
    }
    /**
     * Represents time when the job was completed. It is not guaranteed to be set in happens-before order across separate operations. It is represented in RFC3339 form and is in UTC. The completion time is only set when the job finishes successfully.
     * 
    */
    public Optional<String> getCompletionTime() {
        return Optional.ofNullable(this.completionTime);
    }
    /**
     * The latest available observations of an object's current state. When a Job fails, one of the conditions will have type "Failed" and status true. When a Job is suspended, one of the conditions will have type "Suspended" and status true; when the Job is resumed, the status of this condition will become false. When a Job is completed, one of the conditions will have type "Complete" and status true. More info: https://kubernetes.io/docs/concepts/workloads/controllers/jobs-run-to-completion/
     * 
    */
    public List<JobCondition> getConditions() {
        return this.conditions == null ? List.of() : this.conditions;
    }
    /**
     * The number of pods which reached phase Failed.
     * 
    */
    public Optional<Integer> getFailed() {
        return Optional.ofNullable(this.failed);
    }
    /**
     * The number of pods which have a Ready condition.
     * 
     * This field is alpha-level. The job controller populates the field when the feature gate JobReadyPods is enabled (disabled by default).
     * 
    */
    public Optional<Integer> getReady() {
        return Optional.ofNullable(this.ready);
    }
    /**
     * Represents time when the job controller started processing a job. When a Job is created in the suspended state, this field is not set until the first time it is resumed. This field is reset every time a Job is resumed from suspension. It is represented in RFC3339 form and is in UTC.
     * 
    */
    public Optional<String> getStartTime() {
        return Optional.ofNullable(this.startTime);
    }
    /**
     * The number of pods which reached phase Succeeded.
     * 
    */
    public Optional<Integer> getSucceeded() {
        return Optional.ofNullable(this.succeeded);
    }
    /**
     * UncountedTerminatedPods holds the UIDs of Pods that have terminated but the job controller hasn't yet accounted for in the status counters.
     * 
     * The job controller creates pods with a finalizer. When a pod terminates (succeeded or failed), the controller does three steps to account for it in the job status: (1) Add the pod UID to the arrays in this field. (2) Remove the pod finalizer. (3) Remove the pod UID from the arrays while increasing the corresponding
     *     counter.
     * 
     * This field is beta-level. The job controller only makes use of this field when the feature gate JobTrackingWithFinalizers is enabled (enabled by default). Old jobs might not be tracked using this field, in which case the field remains null.
     * 
    */
    public Optional<UncountedTerminatedPods> getUncountedTerminatedPods() {
        return Optional.ofNullable(this.uncountedTerminatedPods);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer active;
        private @Nullable String completedIndexes;
        private @Nullable String completionTime;
        private @Nullable List<JobCondition> conditions;
        private @Nullable Integer failed;
        private @Nullable Integer ready;
        private @Nullable String startTime;
        private @Nullable Integer succeeded;
        private @Nullable UncountedTerminatedPods uncountedTerminatedPods;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.active = defaults.active;
    	      this.completedIndexes = defaults.completedIndexes;
    	      this.completionTime = defaults.completionTime;
    	      this.conditions = defaults.conditions;
    	      this.failed = defaults.failed;
    	      this.ready = defaults.ready;
    	      this.startTime = defaults.startTime;
    	      this.succeeded = defaults.succeeded;
    	      this.uncountedTerminatedPods = defaults.uncountedTerminatedPods;
        }

        public Builder setActive(@Nullable Integer active) {
            this.active = active;
            return this;
        }

        public Builder setCompletedIndexes(@Nullable String completedIndexes) {
            this.completedIndexes = completedIndexes;
            return this;
        }

        public Builder setCompletionTime(@Nullable String completionTime) {
            this.completionTime = completionTime;
            return this;
        }

        public Builder setConditions(@Nullable List<JobCondition> conditions) {
            this.conditions = conditions;
            return this;
        }

        public Builder setFailed(@Nullable Integer failed) {
            this.failed = failed;
            return this;
        }

        public Builder setReady(@Nullable Integer ready) {
            this.ready = ready;
            return this;
        }

        public Builder setStartTime(@Nullable String startTime) {
            this.startTime = startTime;
            return this;
        }

        public Builder setSucceeded(@Nullable Integer succeeded) {
            this.succeeded = succeeded;
            return this;
        }

        public Builder setUncountedTerminatedPods(@Nullable UncountedTerminatedPods uncountedTerminatedPods) {
            this.uncountedTerminatedPods = uncountedTerminatedPods;
            return this;
        }
        public JobStatus build() {
            return new JobStatus(active, completedIndexes, completionTime, conditions, failed, ready, startTime, succeeded, uncountedTerminatedPods);
        }
    }
}