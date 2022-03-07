// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetIamPolicyArgs Empty = new DatasetIamPolicyArgs();

    /**
     * The dataset ID.
     * 
     */
    @InputImport(name="datasetId", required=true)
      private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
      private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public DatasetIamPolicyArgs(
        Input<String> datasetId,
        Input<String> policyData,
        @Nullable Input<String> project) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
    }

    private DatasetIamPolicyArgs() {
        this.datasetId = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetId;
        private Input<String> policyData;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
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
        public DatasetIamPolicyArgs build() {
            return new DatasetIamPolicyArgs(datasetId, policyData, project);
        }
    }
}