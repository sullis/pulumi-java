// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.azurenative.machinelearningservices.outputs.LabelCategoryResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.LabelingDatasetConfigurationResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.LabelingJobImagePropertiesResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.LabelingJobInstructionsResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.MLAssistConfigurationResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.ProgressMetricsResponse;
import io.pulumi.azurenative.machinelearningservices.outputs.StatusMessageResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LabelingJobPropertiesResponse {
    /**
     * Created time of the job in UTC timezone.
     * 
     */
    private final String createdTimeUtc;
    /**
     * Dataset configuration for the job.
     * 
     */
    private final LabelingDatasetConfigurationResponse datasetConfiguration;
    /**
     * Instructions for the job.
     * 
     */
    private final LabelingJobInstructionsResponse jobInstructions;
    /**
     * Label categories of the job.
     * 
     */
    private final Map<String,LabelCategoryResponse> labelCategories;
    /**
     * Media specific properties in a labeling job.
     * 
     */
    private final LabelingJobImagePropertiesResponse labelingJobMediaProperties;
    /**
     * Machine learning assisted configuration for the job.
     * 
     */
    private final @Nullable MLAssistConfigurationResponse mlAssistConfiguration;
    /**
     * Progress metrics of the job.
     * 
     */
    private final ProgressMetricsResponse progressMetrics;
    /**
     * Internal id of the job(Previously called project).
     * 
     */
    private final String projectId;
    /**
     * The job property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    private final @Nullable Map<String,String> properties;
    /**
     * Status of the job.
     * 
     */
    private final String status;
    /**
     * Status messages of the job.
     * 
     */
    private final List<StatusMessageResponse> statusMessages;
    /**
     * The job tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    private final @Nullable Map<String,String> tags;

    @OutputCustomType.Constructor({"createdTimeUtc","datasetConfiguration","jobInstructions","labelCategories","labelingJobMediaProperties","mlAssistConfiguration","progressMetrics","projectId","properties","status","statusMessages","tags"})
    private LabelingJobPropertiesResponse(
        String createdTimeUtc,
        LabelingDatasetConfigurationResponse datasetConfiguration,
        LabelingJobInstructionsResponse jobInstructions,
        Map<String,LabelCategoryResponse> labelCategories,
        LabelingJobImagePropertiesResponse labelingJobMediaProperties,
        @Nullable MLAssistConfigurationResponse mlAssistConfiguration,
        ProgressMetricsResponse progressMetrics,
        String projectId,
        @Nullable Map<String,String> properties,
        String status,
        List<StatusMessageResponse> statusMessages,
        @Nullable Map<String,String> tags) {
        this.createdTimeUtc = Objects.requireNonNull(createdTimeUtc);
        this.datasetConfiguration = Objects.requireNonNull(datasetConfiguration);
        this.jobInstructions = Objects.requireNonNull(jobInstructions);
        this.labelCategories = Objects.requireNonNull(labelCategories);
        this.labelingJobMediaProperties = Objects.requireNonNull(labelingJobMediaProperties);
        this.mlAssistConfiguration = mlAssistConfiguration;
        this.progressMetrics = Objects.requireNonNull(progressMetrics);
        this.projectId = Objects.requireNonNull(projectId);
        this.properties = properties;
        this.status = Objects.requireNonNull(status);
        this.statusMessages = Objects.requireNonNull(statusMessages);
        this.tags = tags;
    }

    /**
     * Created time of the job in UTC timezone.
     * 
     */
    public String getCreatedTimeUtc() {
        return this.createdTimeUtc;
    }
    /**
     * Dataset configuration for the job.
     * 
     */
    public LabelingDatasetConfigurationResponse getDatasetConfiguration() {
        return this.datasetConfiguration;
    }
    /**
     * Instructions for the job.
     * 
     */
    public LabelingJobInstructionsResponse getJobInstructions() {
        return this.jobInstructions;
    }
    /**
     * Label categories of the job.
     * 
     */
    public Map<String,LabelCategoryResponse> getLabelCategories() {
        return this.labelCategories;
    }
    /**
     * Media specific properties in a labeling job.
     * 
     */
    public LabelingJobImagePropertiesResponse getLabelingJobMediaProperties() {
        return this.labelingJobMediaProperties;
    }
    /**
     * Machine learning assisted configuration for the job.
     * 
     */
    public Optional<MLAssistConfigurationResponse> getMlAssistConfiguration() {
        return Optional.ofNullable(this.mlAssistConfiguration);
    }
    /**
     * Progress metrics of the job.
     * 
     */
    public ProgressMetricsResponse getProgressMetrics() {
        return this.progressMetrics;
    }
    /**
     * Internal id of the job(Previously called project).
     * 
     */
    public String getProjectId() {
        return this.projectId;
    }
    /**
     * The job property dictionary. Properties can be added, but not removed or altered.
     * 
     */
    public Map<String,String> getProperties() {
        return this.properties == null ? Map.of() : this.properties;
    }
    /**
     * Status of the job.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Status messages of the job.
     * 
     */
    public List<StatusMessageResponse> getStatusMessages() {
        return this.statusMessages;
    }
    /**
     * The job tag dictionary. Tags can be added, removed, and updated.
     * 
     */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LabelingJobPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdTimeUtc;
        private LabelingDatasetConfigurationResponse datasetConfiguration;
        private LabelingJobInstructionsResponse jobInstructions;
        private Map<String,LabelCategoryResponse> labelCategories;
        private LabelingJobImagePropertiesResponse labelingJobMediaProperties;
        private @Nullable MLAssistConfigurationResponse mlAssistConfiguration;
        private ProgressMetricsResponse progressMetrics;
        private String projectId;
        private @Nullable Map<String,String> properties;
        private String status;
        private List<StatusMessageResponse> statusMessages;
        private @Nullable Map<String,String> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(LabelingJobPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTimeUtc = defaults.createdTimeUtc;
    	      this.datasetConfiguration = defaults.datasetConfiguration;
    	      this.jobInstructions = defaults.jobInstructions;
    	      this.labelCategories = defaults.labelCategories;
    	      this.labelingJobMediaProperties = defaults.labelingJobMediaProperties;
    	      this.mlAssistConfiguration = defaults.mlAssistConfiguration;
    	      this.progressMetrics = defaults.progressMetrics;
    	      this.projectId = defaults.projectId;
    	      this.properties = defaults.properties;
    	      this.status = defaults.status;
    	      this.statusMessages = defaults.statusMessages;
    	      this.tags = defaults.tags;
        }

        public Builder setCreatedTimeUtc(String createdTimeUtc) {
            this.createdTimeUtc = Objects.requireNonNull(createdTimeUtc);
            return this;
        }

        public Builder setDatasetConfiguration(LabelingDatasetConfigurationResponse datasetConfiguration) {
            this.datasetConfiguration = Objects.requireNonNull(datasetConfiguration);
            return this;
        }

        public Builder setJobInstructions(LabelingJobInstructionsResponse jobInstructions) {
            this.jobInstructions = Objects.requireNonNull(jobInstructions);
            return this;
        }

        public Builder setLabelCategories(Map<String,LabelCategoryResponse> labelCategories) {
            this.labelCategories = Objects.requireNonNull(labelCategories);
            return this;
        }

        public Builder setLabelingJobMediaProperties(LabelingJobImagePropertiesResponse labelingJobMediaProperties) {
            this.labelingJobMediaProperties = Objects.requireNonNull(labelingJobMediaProperties);
            return this;
        }

        public Builder setMlAssistConfiguration(@Nullable MLAssistConfigurationResponse mlAssistConfiguration) {
            this.mlAssistConfiguration = mlAssistConfiguration;
            return this;
        }

        public Builder setProgressMetrics(ProgressMetricsResponse progressMetrics) {
            this.progressMetrics = Objects.requireNonNull(progressMetrics);
            return this;
        }

        public Builder setProjectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusMessages(List<StatusMessageResponse> statusMessages) {
            this.statusMessages = Objects.requireNonNull(statusMessages);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public LabelingJobPropertiesResponse build() {
            return new LabelingJobPropertiesResponse(createdTimeUtc, datasetConfiguration, jobInstructions, labelCategories, labelingJobMediaProperties, mlAssistConfiguration, progressMetrics, projectId, properties, status, statusMessages, tags);
        }
    }
}
