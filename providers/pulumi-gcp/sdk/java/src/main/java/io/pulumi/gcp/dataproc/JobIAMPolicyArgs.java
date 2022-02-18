// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobIAMPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobIAMPolicyArgs Empty = new JobIAMPolicyArgs();

    @InputImport(name="jobId", required=true)
    private final Input<String> jobId;

    public Input<String> getJobId() {
        return this.jobId;
    }

    /**
     * The policy data generated by a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
    private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    /**
     * The project in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region in which the job belongs. If it
     * is not provided, the provider will use a default.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public JobIAMPolicyArgs(
        Input<String> jobId,
        Input<String> policyData,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
        this.jobId = Objects.requireNonNull(jobId, "expected parameter 'jobId' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.region = region;
    }

    private JobIAMPolicyArgs() {
        this.jobId = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobIAMPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> jobId;
        private Input<String> policyData;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(JobIAMPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.jobId = defaults.jobId;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setJobId(Input<String> jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }

        public Builder setJobId(String jobId) {
            this.jobId = Input.of(Objects.requireNonNull(jobId));
            return this;
        }

        public Builder setPolicyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public JobIAMPolicyArgs build() {
            return new JobIAMPolicyArgs(jobId, policyData, project, region);
        }
    }
}
