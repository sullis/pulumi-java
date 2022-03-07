// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.LabelCategoryArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.LabelingDatasetConfigurationArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.LabelingJobImagePropertiesArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.LabelingJobInstructionsArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.MLAssistConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of a labeling job.
 * 
 */
public final class LabelingJobPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final LabelingJobPropertiesArgs Empty = new LabelingJobPropertiesArgs();

    /**
     * Dataset configuration for the job.
     * 
     */
    @InputImport(name="datasetConfiguration", required=true)
      private final Input<LabelingDatasetConfigurationArgs> datasetConfiguration;

    public Input<LabelingDatasetConfigurationArgs> getDatasetConfiguration() {
        return this.datasetConfiguration;
    }

    /**
     * Instructions for the job.
     * 
     */
    @InputImport(name="jobInstructions", required=true)
      private final Input<LabelingJobInstructionsArgs> jobInstructions;

    public Input<LabelingJobInstructionsArgs> getJobInstructions() {
        return this.jobInstructions;
    }

    /**
     * Label categories of the job.
     * 
     */
    @InputImport(name="labelCategories", required=true)
      private final Input<Map<String,LabelCategoryArgs>> labelCategories;

    public Input<Map<String,LabelCategoryArgs>> getLabelCategories() {
        return this.labelCategories;
    }

    /**
     * Media specific properties in a labeling job.
     * 
     */
    @InputImport(name="labelingJobMediaProperties", required=true)
      private final Input<LabelingJobImagePropertiesArgs> labelingJobMediaProperties;

    public Input<LabelingJobImagePropertiesArgs> getLabelingJobMediaProperties() {
        return this.labelingJobMediaProperties;
    }

    /**
     * Machine learning assisted configuration for the job.
     * 
     */
    @InputImport(name="mlAssistConfiguration")
      private final @Nullable Input<MLAssistConfigurationArgs> mlAssistConfiguration;

    public Input<MLAssistConfigurationArgs> getMlAssistConfiguration() {
        return this.mlAssistConfiguration == null ? Input.empty() : this.mlAssistConfiguration;
    }

    /**
     * The job property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The job tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public LabelingJobPropertiesArgs(
        Input<LabelingDatasetConfigurationArgs> datasetConfiguration,
        Input<LabelingJobInstructionsArgs> jobInstructions,
        Input<Map<String,LabelCategoryArgs>> labelCategories,
        Input<LabelingJobImagePropertiesArgs> labelingJobMediaProperties,
        @Nullable Input<MLAssistConfigurationArgs> mlAssistConfiguration,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<Map<String,String>> tags) {
        this.datasetConfiguration = Objects.requireNonNull(datasetConfiguration, "expected parameter 'datasetConfiguration' to be non-null");
        this.jobInstructions = Objects.requireNonNull(jobInstructions, "expected parameter 'jobInstructions' to be non-null");
        this.labelCategories = Objects.requireNonNull(labelCategories, "expected parameter 'labelCategories' to be non-null");
        this.labelingJobMediaProperties = Objects.requireNonNull(labelingJobMediaProperties, "expected parameter 'labelingJobMediaProperties' to be non-null");
        this.mlAssistConfiguration = mlAssistConfiguration;
        this.properties = properties;
        this.tags = tags;
    }

    private LabelingJobPropertiesArgs() {
        this.datasetConfiguration = Input.empty();
        this.jobInstructions = Input.empty();
        this.labelCategories = Input.empty();
        this.labelingJobMediaProperties = Input.empty();
        this.mlAssistConfiguration = Input.empty();
        this.properties = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingJobPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<LabelingDatasetConfigurationArgs> datasetConfiguration;
        private Input<LabelingJobInstructionsArgs> jobInstructions;
        private Input<Map<String,LabelCategoryArgs>> labelCategories;
        private Input<LabelingJobImagePropertiesArgs> labelingJobMediaProperties;
        private @Nullable Input<MLAssistConfigurationArgs> mlAssistConfiguration;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingJobPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetConfiguration = defaults.datasetConfiguration;
    	      this.jobInstructions = defaults.jobInstructions;
    	      this.labelCategories = defaults.labelCategories;
    	      this.labelingJobMediaProperties = defaults.labelingJobMediaProperties;
    	      this.mlAssistConfiguration = defaults.mlAssistConfiguration;
    	      this.properties = defaults.properties;
    	      this.tags = defaults.tags;
        }

        public Builder setDatasetConfiguration(Input<LabelingDatasetConfigurationArgs> datasetConfiguration) {
            this.datasetConfiguration = Objects.requireNonNull(datasetConfiguration);
            return this;
        }

        public Builder setDatasetConfiguration(LabelingDatasetConfigurationArgs datasetConfiguration) {
            this.datasetConfiguration = Input.of(Objects.requireNonNull(datasetConfiguration));
            return this;
        }

        public Builder setJobInstructions(Input<LabelingJobInstructionsArgs> jobInstructions) {
            this.jobInstructions = Objects.requireNonNull(jobInstructions);
            return this;
        }

        public Builder setJobInstructions(LabelingJobInstructionsArgs jobInstructions) {
            this.jobInstructions = Input.of(Objects.requireNonNull(jobInstructions));
            return this;
        }

        public Builder setLabelCategories(Input<Map<String,LabelCategoryArgs>> labelCategories) {
            this.labelCategories = Objects.requireNonNull(labelCategories);
            return this;
        }

        public Builder setLabelCategories(Map<String,LabelCategoryArgs> labelCategories) {
            this.labelCategories = Input.of(Objects.requireNonNull(labelCategories));
            return this;
        }

        public Builder setLabelingJobMediaProperties(Input<LabelingJobImagePropertiesArgs> labelingJobMediaProperties) {
            this.labelingJobMediaProperties = Objects.requireNonNull(labelingJobMediaProperties);
            return this;
        }

        public Builder setLabelingJobMediaProperties(LabelingJobImagePropertiesArgs labelingJobMediaProperties) {
            this.labelingJobMediaProperties = Input.of(Objects.requireNonNull(labelingJobMediaProperties));
            return this;
        }

        public Builder setMlAssistConfiguration(@Nullable Input<MLAssistConfigurationArgs> mlAssistConfiguration) {
            this.mlAssistConfiguration = mlAssistConfiguration;
            return this;
        }

        public Builder setMlAssistConfiguration(@Nullable MLAssistConfigurationArgs mlAssistConfiguration) {
            this.mlAssistConfiguration = Input.ofNullable(mlAssistConfiguration);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public LabelingJobPropertiesArgs build() {
            return new LabelingJobPropertiesArgs(datasetConfiguration, jobInstructions, labelCategories, labelingJobMediaProperties, mlAssistConfiguration, properties, tags);
        }
    }
}