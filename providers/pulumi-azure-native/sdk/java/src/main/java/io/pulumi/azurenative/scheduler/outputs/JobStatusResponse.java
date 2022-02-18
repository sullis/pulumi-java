// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class JobStatusResponse {
    /**
     * Gets the number of times this job has executed.
     * 
     */
    private final Integer executionCount;
    /**
     * Gets the number of times this job has failed.
     * 
     */
    private final Integer failureCount;
    /**
     * Gets the number of faulted occurrences (occurrences that were retried and failed as many times as the retry policy states).
     * 
     */
    private final Integer faultedCount;
    /**
     * Gets the time the last occurrence executed in ISO-8601 format.  Could be empty if job has not run yet.
     * 
     */
    private final String lastExecutionTime;
    /**
     * Gets the time of the next occurrence in ISO-8601 format. Could be empty if the job is completed.
     * 
     */
    private final String nextExecutionTime;

    @OutputCustomType.Constructor({"executionCount","failureCount","faultedCount","lastExecutionTime","nextExecutionTime"})
    private JobStatusResponse(
        Integer executionCount,
        Integer failureCount,
        Integer faultedCount,
        String lastExecutionTime,
        String nextExecutionTime) {
        this.executionCount = Objects.requireNonNull(executionCount);
        this.failureCount = Objects.requireNonNull(failureCount);
        this.faultedCount = Objects.requireNonNull(faultedCount);
        this.lastExecutionTime = Objects.requireNonNull(lastExecutionTime);
        this.nextExecutionTime = Objects.requireNonNull(nextExecutionTime);
    }

    /**
     * Gets the number of times this job has executed.
     * 
     */
    public Integer getExecutionCount() {
        return this.executionCount;
    }
    /**
     * Gets the number of times this job has failed.
     * 
     */
    public Integer getFailureCount() {
        return this.failureCount;
    }
    /**
     * Gets the number of faulted occurrences (occurrences that were retried and failed as many times as the retry policy states).
     * 
     */
    public Integer getFaultedCount() {
        return this.faultedCount;
    }
    /**
     * Gets the time the last occurrence executed in ISO-8601 format.  Could be empty if job has not run yet.
     * 
     */
    public String getLastExecutionTime() {
        return this.lastExecutionTime;
    }
    /**
     * Gets the time of the next occurrence in ISO-8601 format. Could be empty if the job is completed.
     * 
     */
    public String getNextExecutionTime() {
        return this.nextExecutionTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatusResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer executionCount;
        private Integer failureCount;
        private Integer faultedCount;
        private String lastExecutionTime;
        private String nextExecutionTime;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatusResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.executionCount = defaults.executionCount;
    	      this.failureCount = defaults.failureCount;
    	      this.faultedCount = defaults.faultedCount;
    	      this.lastExecutionTime = defaults.lastExecutionTime;
    	      this.nextExecutionTime = defaults.nextExecutionTime;
        }

        public Builder setExecutionCount(Integer executionCount) {
            this.executionCount = Objects.requireNonNull(executionCount);
            return this;
        }

        public Builder setFailureCount(Integer failureCount) {
            this.failureCount = Objects.requireNonNull(failureCount);
            return this;
        }

        public Builder setFaultedCount(Integer faultedCount) {
            this.faultedCount = Objects.requireNonNull(faultedCount);
            return this;
        }

        public Builder setLastExecutionTime(String lastExecutionTime) {
            this.lastExecutionTime = Objects.requireNonNull(lastExecutionTime);
            return this;
        }

        public Builder setNextExecutionTime(String nextExecutionTime) {
            this.nextExecutionTime = Objects.requireNonNull(nextExecutionTime);
            return this;
        }

        public JobStatusResponse build() {
            return new JobStatusResponse(executionCount, failureCount, faultedCount, lastExecutionTime, nextExecutionTime);
        }
    }
}
