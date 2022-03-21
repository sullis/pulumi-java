// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices;

import io.pulumi.azurenative.machinelearningservices.inputs.LabelingJobPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LabelingJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabelingJobArgs Empty = new LabelingJobArgs();

    /**
     * Name and identifier for LabelingJob.
     * 
     */
    @Import(name="labelingJobId")
      private final @Nullable Output<String> labelingJobId;

    public Output<String> getLabelingJobId() {
        return this.labelingJobId == null ? Output.empty() : this.labelingJobId;
    }

    /**
     * Definition of a labeling job.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<LabelingJobPropertiesArgs> properties;

    public Output<LabelingJobPropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * Name of the resource group in which workspace is located.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of Azure Machine Learning workspace.
     * 
     */
    @Import(name="workspaceName", required=true)
      private final Output<String> workspaceName;

    public Output<String> getWorkspaceName() {
        return this.workspaceName;
    }

    public LabelingJobArgs(
        @Nullable Output<String> labelingJobId,
        @Nullable Output<LabelingJobPropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> workspaceName) {
        this.labelingJobId = labelingJobId;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.workspaceName = Objects.requireNonNull(workspaceName, "expected parameter 'workspaceName' to be non-null");
    }

    private LabelingJobArgs() {
        this.labelingJobId = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.workspaceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> labelingJobId;
        private @Nullable Output<LabelingJobPropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> workspaceName;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labelingJobId = defaults.labelingJobId;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.workspaceName = defaults.workspaceName;
        }

        public Builder labelingJobId(@Nullable Output<String> labelingJobId) {
            this.labelingJobId = labelingJobId;
            return this;
        }
        public Builder labelingJobId(@Nullable String labelingJobId) {
            this.labelingJobId = Output.ofNullable(labelingJobId);
            return this;
        }
        public Builder properties(@Nullable Output<LabelingJobPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable LabelingJobPropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder workspaceName(Output<String> workspaceName) {
            this.workspaceName = Objects.requireNonNull(workspaceName);
            return this;
        }
        public Builder workspaceName(String workspaceName) {
            this.workspaceName = Output.of(Objects.requireNonNull(workspaceName));
            return this;
        }        public LabelingJobArgs build() {
            return new LabelingJobArgs(labelingJobId, properties, resourceGroupName, workspaceName);
        }
    }
}
