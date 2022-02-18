// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class JobStatusResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobStatusResponse Empty = new JobStatusResponse();

    /**
     * Gets the number of times this job has executed.
     * 
     */
    @InputImport(name="executionCount", required=true)
    private final Integer executionCount;

    public Integer getExecutionCount() {
        return this.executionCount;
    }

    /**
     * Gets the number of times this job has failed.
     * 
     */
    @InputImport(name="failureCount", required=true)
    private final Integer failureCount;

    public Integer getFailureCount() {
        return this.failureCount;
    }

    /**
     * Gets the number of faulted occurrences (occurrences that were retried and failed as many times as the retry policy states).
     * 
     */
    @InputImport(name="faultedCount", required=true)
    private final Integer faultedCount;

    public Integer getFaultedCount() {
        return this.faultedCount;
    }

    /**
     * Gets the time the last occurrence executed in ISO-8601 format.  Could be empty if job has not run yet.
     * 
     */
    @InputImport(name="lastExecutionTime", required=true)
    private final String lastExecutionTime;

    public String getLastExecutionTime() {
        return this.lastExecutionTime;
    }

    /**
     * Gets the time of the next occurrence in ISO-8601 format. Could be empty if the job is completed.
     * 
     */
    @InputImport(name="nextExecutionTime", required=true)
    private final String nextExecutionTime;

    public String getNextExecutionTime() {
        return this.nextExecutionTime;
    }

    public JobStatusResponse(
        Integer executionCount,
        Integer failureCount,
        Integer faultedCount,
        String lastExecutionTime,
        String nextExecutionTime) {
        this.executionCount = Objects.requireNonNull(executionCount, "expected parameter 'executionCount' to be non-null");
        this.failureCount = Objects.requireNonNull(failureCount, "expected parameter 'failureCount' to be non-null");
        this.faultedCount = Objects.requireNonNull(faultedCount, "expected parameter 'faultedCount' to be non-null");
        this.lastExecutionTime = Objects.requireNonNull(lastExecutionTime, "expected parameter 'lastExecutionTime' to be non-null");
        this.nextExecutionTime = Objects.requireNonNull(nextExecutionTime, "expected parameter 'nextExecutionTime' to be non-null");
    }

    private JobStatusResponse() {
        this.executionCount = null;
        this.failureCount = null;
        this.faultedCount = null;
        this.lastExecutionTime = null;
        this.nextExecutionTime = null;
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
