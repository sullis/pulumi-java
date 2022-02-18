// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final IamPolicyArgs Empty = new IamPolicyArgs();

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
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="tableId", required=true)
    private final Input<String> tableId;

    public Input<String> getTableId() {
        return this.tableId;
    }

    public IamPolicyArgs(
        Input<String> datasetId,
        Input<String> policyData,
        @Nullable Input<String> project,
        Input<String> tableId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
        this.tableId = Objects.requireNonNull(tableId, "expected parameter 'tableId' to be non-null");
    }

    private IamPolicyArgs() {
        this.datasetId = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
        this.tableId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetId;
        private Input<String> policyData;
        private @Nullable Input<String> project;
        private Input<String> tableId;

        public Builder() {
    	      // Empty
        }

        public Builder(IamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
    	      this.tableId = defaults.tableId;
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

        public Builder setTableId(Input<String> tableId) {
            this.tableId = Objects.requireNonNull(tableId);
            return this;
        }

        public Builder setTableId(String tableId) {
            this.tableId = Input.of(Objects.requireNonNull(tableId));
            return this;
        }

        public IamPolicyArgs build() {
            return new IamPolicyArgs(datasetId, policyData, project, tableId);
        }
    }
}
