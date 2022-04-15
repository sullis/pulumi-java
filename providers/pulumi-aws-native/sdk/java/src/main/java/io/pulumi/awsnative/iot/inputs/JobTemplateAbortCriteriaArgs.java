// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.awsnative.iot.enums.JobTemplateAction;
import io.pulumi.awsnative.iot.enums.JobTemplateFailureType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.util.Objects;


/**
 * The criteria that determine when and how a job abort takes place.
 * 
 */
public final class JobTemplateAbortCriteriaArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobTemplateAbortCriteriaArgs Empty = new JobTemplateAbortCriteriaArgs();

    /**
     * The type of job action to take to initiate the job abort.
     * 
     */
    @Import(name="action", required=true)
      private final Output<JobTemplateAction> action;

    public Output<JobTemplateAction> action() {
        return this.action;
    }

    /**
     * The type of job execution failures that can initiate a job abort.
     * 
     */
    @Import(name="failureType", required=true)
      private final Output<JobTemplateFailureType> failureType;

    public Output<JobTemplateFailureType> failureType() {
        return this.failureType;
    }

    /**
     * The minimum number of things which must receive job execution notifications before the job can be aborted.
     * 
     */
    @Import(name="minNumberOfExecutedThings", required=true)
      private final Output<Integer> minNumberOfExecutedThings;

    public Output<Integer> minNumberOfExecutedThings() {
        return this.minNumberOfExecutedThings;
    }

    /**
     * The minimum percentage of job execution failures that must occur to initiate the job abort.
     * 
     */
    @Import(name="thresholdPercentage", required=true)
      private final Output<Double> thresholdPercentage;

    public Output<Double> thresholdPercentage() {
        return this.thresholdPercentage;
    }

    public JobTemplateAbortCriteriaArgs(
        Output<JobTemplateAction> action,
        Output<JobTemplateFailureType> failureType,
        Output<Integer> minNumberOfExecutedThings,
        Output<Double> thresholdPercentage) {
        this.action = Objects.requireNonNull(action, "expected parameter 'action' to be non-null");
        this.failureType = Objects.requireNonNull(failureType, "expected parameter 'failureType' to be non-null");
        this.minNumberOfExecutedThings = Objects.requireNonNull(minNumberOfExecutedThings, "expected parameter 'minNumberOfExecutedThings' to be non-null");
        this.thresholdPercentage = Objects.requireNonNull(thresholdPercentage, "expected parameter 'thresholdPercentage' to be non-null");
    }

    private JobTemplateAbortCriteriaArgs() {
        this.action = Codegen.empty();
        this.failureType = Codegen.empty();
        this.minNumberOfExecutedThings = Codegen.empty();
        this.thresholdPercentage = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateAbortCriteriaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<JobTemplateAction> action;
        private Output<JobTemplateFailureType> failureType;
        private Output<Integer> minNumberOfExecutedThings;
        private Output<Double> thresholdPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateAbortCriteriaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.failureType = defaults.failureType;
    	      this.minNumberOfExecutedThings = defaults.minNumberOfExecutedThings;
    	      this.thresholdPercentage = defaults.thresholdPercentage;
        }

        public Builder action(Output<JobTemplateAction> action) {
            this.action = Objects.requireNonNull(action);
            return this;
        }
        public Builder action(JobTemplateAction action) {
            this.action = Output.of(Objects.requireNonNull(action));
            return this;
        }
        public Builder failureType(Output<JobTemplateFailureType> failureType) {
            this.failureType = Objects.requireNonNull(failureType);
            return this;
        }
        public Builder failureType(JobTemplateFailureType failureType) {
            this.failureType = Output.of(Objects.requireNonNull(failureType));
            return this;
        }
        public Builder minNumberOfExecutedThings(Output<Integer> minNumberOfExecutedThings) {
            this.minNumberOfExecutedThings = Objects.requireNonNull(minNumberOfExecutedThings);
            return this;
        }
        public Builder minNumberOfExecutedThings(Integer minNumberOfExecutedThings) {
            this.minNumberOfExecutedThings = Output.of(Objects.requireNonNull(minNumberOfExecutedThings));
            return this;
        }
        public Builder thresholdPercentage(Output<Double> thresholdPercentage) {
            this.thresholdPercentage = Objects.requireNonNull(thresholdPercentage);
            return this;
        }
        public Builder thresholdPercentage(Double thresholdPercentage) {
            this.thresholdPercentage = Output.of(Objects.requireNonNull(thresholdPercentage));
            return this;
        }        public JobTemplateAbortCriteriaArgs build() {
            return new JobTemplateAbortCriteriaArgs(action, failureType, minNumberOfExecutedThings, thresholdPercentage);
        }
    }
}
