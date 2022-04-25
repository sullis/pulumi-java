// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.databox.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobStagesResponse {
    /**
     * @return Display name of the job stage.
     * 
     */
    private final String displayName;
    /**
     * @return Job Stage Details
     * 
     */
    private final Object jobStageDetails;
    /**
     * @return Name of the job stage.
     * 
     */
    private final String stageName;
    /**
     * @return Status of the job stage.
     * 
     */
    private final String stageStatus;
    /**
     * @return Time for the job stage in UTC ISO 8601 format.
     * 
     */
    private final String stageTime;

    @CustomType.Constructor
    private JobStagesResponse(
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("jobStageDetails") Object jobStageDetails,
        @CustomType.Parameter("stageName") String stageName,
        @CustomType.Parameter("stageStatus") String stageStatus,
        @CustomType.Parameter("stageTime") String stageTime) {
        this.displayName = displayName;
        this.jobStageDetails = jobStageDetails;
        this.stageName = stageName;
        this.stageStatus = stageStatus;
        this.stageTime = stageTime;
    }

    /**
     * @return Display name of the job stage.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return Job Stage Details
     * 
     */
    public Object jobStageDetails() {
        return this.jobStageDetails;
    }
    /**
     * @return Name of the job stage.
     * 
     */
    public String stageName() {
        return this.stageName;
    }
    /**
     * @return Status of the job stage.
     * 
     */
    public String stageStatus() {
        return this.stageStatus;
    }
    /**
     * @return Time for the job stage in UTC ISO 8601 format.
     * 
     */
    public String stageTime() {
        return this.stageTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStagesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String displayName;
        private Object jobStageDetails;
        private String stageName;
        private String stageStatus;
        private String stageTime;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStagesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.jobStageDetails = defaults.jobStageDetails;
    	      this.stageName = defaults.stageName;
    	      this.stageStatus = defaults.stageStatus;
    	      this.stageTime = defaults.stageTime;
        }

        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder jobStageDetails(Object jobStageDetails) {
            this.jobStageDetails = Objects.requireNonNull(jobStageDetails);
            return this;
        }
        public Builder stageName(String stageName) {
            this.stageName = Objects.requireNonNull(stageName);
            return this;
        }
        public Builder stageStatus(String stageStatus) {
            this.stageStatus = Objects.requireNonNull(stageStatus);
            return this;
        }
        public Builder stageTime(String stageTime) {
            this.stageTime = Objects.requireNonNull(stageTime);
            return this;
        }        public JobStagesResponse build() {
            return new JobStagesResponse(displayName, jobStageDetails, stageName, stageStatus, stageTime);
        }
    }
}
