// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.dataproc.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobHadoopJob;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobHiveJob;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobPigJob;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobPrestoJob;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobPysparkJob;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobScheduling;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobSparkJob;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobSparkRJob;
import com.pulumi.gcp.dataproc.outputs.WorkflowTemplateJobSparkSqlJob;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowTemplateJob {
    /**
     * @return Optional. Job is a Hadoop job.
     * 
     */
    private final @Nullable WorkflowTemplateJobHadoopJob hadoopJob;
    /**
     * @return Optional. Job is a Hive job.
     * 
     */
    private final @Nullable WorkflowTemplateJobHiveJob hiveJob;
    /**
     * @return Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    private final @Nullable Map<String,String> labels;
    /**
     * @return Optional. Job is a Pig job.
     * 
     */
    private final @Nullable WorkflowTemplateJobPigJob pigJob;
    /**
     * @return Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
     * 
     */
    private final @Nullable List<String> prerequisiteStepIds;
    /**
     * @return Optional. Job is a Presto job.
     * 
     */
    private final @Nullable WorkflowTemplateJobPrestoJob prestoJob;
    /**
     * @return Optional. Job is a PySpark job.
     * 
     */
    private final @Nullable WorkflowTemplateJobPysparkJob pysparkJob;
    /**
     * @return Optional. Job scheduling configuration.
     * 
     */
    private final @Nullable WorkflowTemplateJobScheduling scheduling;
    /**
     * @return Optional. Job is a Spark job.
     * 
     */
    private final @Nullable WorkflowTemplateJobSparkJob sparkJob;
    /**
     * @return Optional. Job is a SparkR job.
     * 
     */
    private final @Nullable WorkflowTemplateJobSparkRJob sparkRJob;
    /**
     * @return Optional. Job is a SparkSql job.
     * 
     */
    private final @Nullable WorkflowTemplateJobSparkSqlJob sparkSqlJob;
    /**
     * @return Required. The step id. The id must be unique among all jobs within the template. The step id is used as prefix for job id, as job `goog-dataproc-workflow-step-id` label, and in field from other steps. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
     * 
     */
    private final String stepId;

    @CustomType.Constructor
    private WorkflowTemplateJob(
        @CustomType.Parameter("hadoopJob") @Nullable WorkflowTemplateJobHadoopJob hadoopJob,
        @CustomType.Parameter("hiveJob") @Nullable WorkflowTemplateJobHiveJob hiveJob,
        @CustomType.Parameter("labels") @Nullable Map<String,String> labels,
        @CustomType.Parameter("pigJob") @Nullable WorkflowTemplateJobPigJob pigJob,
        @CustomType.Parameter("prerequisiteStepIds") @Nullable List<String> prerequisiteStepIds,
        @CustomType.Parameter("prestoJob") @Nullable WorkflowTemplateJobPrestoJob prestoJob,
        @CustomType.Parameter("pysparkJob") @Nullable WorkflowTemplateJobPysparkJob pysparkJob,
        @CustomType.Parameter("scheduling") @Nullable WorkflowTemplateJobScheduling scheduling,
        @CustomType.Parameter("sparkJob") @Nullable WorkflowTemplateJobSparkJob sparkJob,
        @CustomType.Parameter("sparkRJob") @Nullable WorkflowTemplateJobSparkRJob sparkRJob,
        @CustomType.Parameter("sparkSqlJob") @Nullable WorkflowTemplateJobSparkSqlJob sparkSqlJob,
        @CustomType.Parameter("stepId") String stepId) {
        this.hadoopJob = hadoopJob;
        this.hiveJob = hiveJob;
        this.labels = labels;
        this.pigJob = pigJob;
        this.prerequisiteStepIds = prerequisiteStepIds;
        this.prestoJob = prestoJob;
        this.pysparkJob = pysparkJob;
        this.scheduling = scheduling;
        this.sparkJob = sparkJob;
        this.sparkRJob = sparkRJob;
        this.sparkSqlJob = sparkSqlJob;
        this.stepId = stepId;
    }

    /**
     * @return Optional. Job is a Hadoop job.
     * 
     */
    public Optional<WorkflowTemplateJobHadoopJob> hadoopJob() {
        return Optional.ofNullable(this.hadoopJob);
    }
    /**
     * @return Optional. Job is a Hive job.
     * 
     */
    public Optional<WorkflowTemplateJobHiveJob> hiveJob() {
        return Optional.ofNullable(this.hiveJob);
    }
    /**
     * @return Optional. The labels to associate with this cluster. Label keys must be between 1 and 63 characters long, and must conform to the following PCRE regular expression: {0,63} No more than 32 labels can be associated with a given cluster.
     * 
     */
    public Map<String,String> labels() {
        return this.labels == null ? Map.of() : this.labels;
    }
    /**
     * @return Optional. Job is a Pig job.
     * 
     */
    public Optional<WorkflowTemplateJobPigJob> pigJob() {
        return Optional.ofNullable(this.pigJob);
    }
    /**
     * @return Optional. The optional list of prerequisite job step_ids. If not specified, the job will start at the beginning of workflow.
     * 
     */
    public List<String> prerequisiteStepIds() {
        return this.prerequisiteStepIds == null ? List.of() : this.prerequisiteStepIds;
    }
    /**
     * @return Optional. Job is a Presto job.
     * 
     */
    public Optional<WorkflowTemplateJobPrestoJob> prestoJob() {
        return Optional.ofNullable(this.prestoJob);
    }
    /**
     * @return Optional. Job is a PySpark job.
     * 
     */
    public Optional<WorkflowTemplateJobPysparkJob> pysparkJob() {
        return Optional.ofNullable(this.pysparkJob);
    }
    /**
     * @return Optional. Job scheduling configuration.
     * 
     */
    public Optional<WorkflowTemplateJobScheduling> scheduling() {
        return Optional.ofNullable(this.scheduling);
    }
    /**
     * @return Optional. Job is a Spark job.
     * 
     */
    public Optional<WorkflowTemplateJobSparkJob> sparkJob() {
        return Optional.ofNullable(this.sparkJob);
    }
    /**
     * @return Optional. Job is a SparkR job.
     * 
     */
    public Optional<WorkflowTemplateJobSparkRJob> sparkRJob() {
        return Optional.ofNullable(this.sparkRJob);
    }
    /**
     * @return Optional. Job is a SparkSql job.
     * 
     */
    public Optional<WorkflowTemplateJobSparkSqlJob> sparkSqlJob() {
        return Optional.ofNullable(this.sparkSqlJob);
    }
    /**
     * @return Required. The step id. The id must be unique among all jobs within the template. The step id is used as prefix for job id, as job `goog-dataproc-workflow-step-id` label, and in field from other steps. The id must contain only letters (a-z, A-Z), numbers (0-9), underscores (_), and hyphens (-). Cannot begin or end with underscore or hyphen. Must consist of between 3 and 50 characters.
     * 
     */
    public String stepId() {
        return this.stepId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJob defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkflowTemplateJobHadoopJob hadoopJob;
        private @Nullable WorkflowTemplateJobHiveJob hiveJob;
        private @Nullable Map<String,String> labels;
        private @Nullable WorkflowTemplateJobPigJob pigJob;
        private @Nullable List<String> prerequisiteStepIds;
        private @Nullable WorkflowTemplateJobPrestoJob prestoJob;
        private @Nullable WorkflowTemplateJobPysparkJob pysparkJob;
        private @Nullable WorkflowTemplateJobScheduling scheduling;
        private @Nullable WorkflowTemplateJobSparkJob sparkJob;
        private @Nullable WorkflowTemplateJobSparkRJob sparkRJob;
        private @Nullable WorkflowTemplateJobSparkSqlJob sparkSqlJob;
        private String stepId;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJob defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hadoopJob = defaults.hadoopJob;
    	      this.hiveJob = defaults.hiveJob;
    	      this.labels = defaults.labels;
    	      this.pigJob = defaults.pigJob;
    	      this.prerequisiteStepIds = defaults.prerequisiteStepIds;
    	      this.prestoJob = defaults.prestoJob;
    	      this.pysparkJob = defaults.pysparkJob;
    	      this.scheduling = defaults.scheduling;
    	      this.sparkJob = defaults.sparkJob;
    	      this.sparkRJob = defaults.sparkRJob;
    	      this.sparkSqlJob = defaults.sparkSqlJob;
    	      this.stepId = defaults.stepId;
        }

        public Builder hadoopJob(@Nullable WorkflowTemplateJobHadoopJob hadoopJob) {
            this.hadoopJob = hadoopJob;
            return this;
        }
        public Builder hiveJob(@Nullable WorkflowTemplateJobHiveJob hiveJob) {
            this.hiveJob = hiveJob;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = labels;
            return this;
        }
        public Builder pigJob(@Nullable WorkflowTemplateJobPigJob pigJob) {
            this.pigJob = pigJob;
            return this;
        }
        public Builder prerequisiteStepIds(@Nullable List<String> prerequisiteStepIds) {
            this.prerequisiteStepIds = prerequisiteStepIds;
            return this;
        }
        public Builder prerequisiteStepIds(String... prerequisiteStepIds) {
            return prerequisiteStepIds(List.of(prerequisiteStepIds));
        }
        public Builder prestoJob(@Nullable WorkflowTemplateJobPrestoJob prestoJob) {
            this.prestoJob = prestoJob;
            return this;
        }
        public Builder pysparkJob(@Nullable WorkflowTemplateJobPysparkJob pysparkJob) {
            this.pysparkJob = pysparkJob;
            return this;
        }
        public Builder scheduling(@Nullable WorkflowTemplateJobScheduling scheduling) {
            this.scheduling = scheduling;
            return this;
        }
        public Builder sparkJob(@Nullable WorkflowTemplateJobSparkJob sparkJob) {
            this.sparkJob = sparkJob;
            return this;
        }
        public Builder sparkRJob(@Nullable WorkflowTemplateJobSparkRJob sparkRJob) {
            this.sparkRJob = sparkRJob;
            return this;
        }
        public Builder sparkSqlJob(@Nullable WorkflowTemplateJobSparkSqlJob sparkSqlJob) {
            this.sparkSqlJob = sparkSqlJob;
            return this;
        }
        public Builder stepId(String stepId) {
            this.stepId = Objects.requireNonNull(stepId);
            return this;
        }        public WorkflowTemplateJob build() {
            return new WorkflowTemplateJob(hadoopJob, hiveJob, labels, pigJob, prerequisiteStepIds, prestoJob, pysparkJob, scheduling, sparkJob, sparkRJob, sparkSqlJob, stepId);
        }
    }
}
