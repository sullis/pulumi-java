// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.JobHadoopConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobHiveConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobPigConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobPlacementGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobPysparkConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobReferenceGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobSchedulingGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobSparkConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobSparksqlConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.JobStatusGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobState extends io.pulumi.resources.ResourceArgs {

    public static final JobState Empty = new JobState();

    /**
     * If present, the location of miscellaneous control files which may be used as part of job setup and handling. If not present, control files may be placed in the same location as driver_output_uri.
     * 
     */
    @InputImport(name="driverControlsFilesUri")
    private final @Nullable Input<String> driverControlsFilesUri;

    public Input<String> getDriverControlsFilesUri() {
        return this.driverControlsFilesUri == null ? Input.empty() : this.driverControlsFilesUri;
    }

    /**
     * A URI pointing to the location of the stdout of the job's driver program.
     * 
     */
    @InputImport(name="driverOutputResourceUri")
    private final @Nullable Input<String> driverOutputResourceUri;

    public Input<String> getDriverOutputResourceUri() {
        return this.driverOutputResourceUri == null ? Input.empty() : this.driverOutputResourceUri;
    }

    /**
     * By default, you can only delete inactive jobs within
     * Dataproc. Setting this to true, and calling destroy, will ensure that the
     * job is first cancelled before issuing the delete.
     * 
     */
    @InputImport(name="forceDelete")
    private final @Nullable Input<Boolean> forceDelete;

    public Input<Boolean> getForceDelete() {
        return this.forceDelete == null ? Input.empty() : this.forceDelete;
    }

    /**
     * The config of Hadoop job
     * 
     */
    @InputImport(name="hadoopConfig")
    private final @Nullable Input<JobHadoopConfigGetArgs> hadoopConfig;

    public Input<JobHadoopConfigGetArgs> getHadoopConfig() {
        return this.hadoopConfig == null ? Input.empty() : this.hadoopConfig;
    }

    /**
     * The config of hive job
     * 
     */
    @InputImport(name="hiveConfig")
    private final @Nullable Input<JobHiveConfigGetArgs> hiveConfig;

    public Input<JobHiveConfigGetArgs> getHiveConfig() {
        return this.hiveConfig == null ? Input.empty() : this.hiveConfig;
    }

    /**
     * The list of labels (key/value pairs) to add to the job.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The config of pag job.
     * 
     */
    @InputImport(name="pigConfig")
    private final @Nullable Input<JobPigConfigGetArgs> pigConfig;

    public Input<JobPigConfigGetArgs> getPigConfig() {
        return this.pigConfig == null ? Input.empty() : this.pigConfig;
    }

    /**
     * The config of job placement.
     * 
     */
    @InputImport(name="placement")
    private final @Nullable Input<JobPlacementGetArgs> placement;

    public Input<JobPlacementGetArgs> getPlacement() {
        return this.placement == null ? Input.empty() : this.placement;
    }

    /**
     * The project in which the `cluster` can be found and jobs
     * subsequently run against. If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The config of pySpark job.
     * 
     */
    @InputImport(name="pysparkConfig")
    private final @Nullable Input<JobPysparkConfigGetArgs> pysparkConfig;

    public Input<JobPysparkConfigGetArgs> getPysparkConfig() {
        return this.pysparkConfig == null ? Input.empty() : this.pysparkConfig;
    }

    /**
     * The reference of the job
     * 
     */
    @InputImport(name="reference")
    private final @Nullable Input<JobReferenceGetArgs> reference;

    public Input<JobReferenceGetArgs> getReference() {
        return this.reference == null ? Input.empty() : this.reference;
    }

    /**
     * The Cloud Dataproc region. This essentially determines which clusters are available
     * for this job to be submitted to. If not specified, defaults to `global`.
     * 
     */
    @InputImport(name="region")
    private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * Optional. Job scheduling configuration.
     * 
     */
    @InputImport(name="scheduling")
    private final @Nullable Input<JobSchedulingGetArgs> scheduling;

    public Input<JobSchedulingGetArgs> getScheduling() {
        return this.scheduling == null ? Input.empty() : this.scheduling;
    }

    /**
     * The config of the Spark job.
     * 
     */
    @InputImport(name="sparkConfig")
    private final @Nullable Input<JobSparkConfigGetArgs> sparkConfig;

    public Input<JobSparkConfigGetArgs> getSparkConfig() {
        return this.sparkConfig == null ? Input.empty() : this.sparkConfig;
    }

    /**
     * The config of SparkSql job
     * 
     */
    @InputImport(name="sparksqlConfig")
    private final @Nullable Input<JobSparksqlConfigGetArgs> sparksqlConfig;

    public Input<JobSparksqlConfigGetArgs> getSparksqlConfig() {
        return this.sparksqlConfig == null ? Input.empty() : this.sparksqlConfig;
    }

    /**
     * The status of the job.
     * 
     */
    @InputImport(name="statuses")
    private final @Nullable Input<List<JobStatusGetArgs>> statuses;

    public Input<List<JobStatusGetArgs>> getStatuses() {
        return this.statuses == null ? Input.empty() : this.statuses;
    }

    public JobState(
        @Nullable Input<String> driverControlsFilesUri,
        @Nullable Input<String> driverOutputResourceUri,
        @Nullable Input<Boolean> forceDelete,
        @Nullable Input<JobHadoopConfigGetArgs> hadoopConfig,
        @Nullable Input<JobHiveConfigGetArgs> hiveConfig,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<JobPigConfigGetArgs> pigConfig,
        @Nullable Input<JobPlacementGetArgs> placement,
        @Nullable Input<String> project,
        @Nullable Input<JobPysparkConfigGetArgs> pysparkConfig,
        @Nullable Input<JobReferenceGetArgs> reference,
        @Nullable Input<String> region,
        @Nullable Input<JobSchedulingGetArgs> scheduling,
        @Nullable Input<JobSparkConfigGetArgs> sparkConfig,
        @Nullable Input<JobSparksqlConfigGetArgs> sparksqlConfig,
        @Nullable Input<List<JobStatusGetArgs>> statuses) {
        this.driverControlsFilesUri = driverControlsFilesUri;
        this.driverOutputResourceUri = driverOutputResourceUri;
        this.forceDelete = forceDelete;
        this.hadoopConfig = hadoopConfig;
        this.hiveConfig = hiveConfig;
        this.labels = labels;
        this.pigConfig = pigConfig;
        this.placement = placement;
        this.project = project;
        this.pysparkConfig = pysparkConfig;
        this.reference = reference;
        this.region = region;
        this.scheduling = scheduling;
        this.sparkConfig = sparkConfig;
        this.sparksqlConfig = sparksqlConfig;
        this.statuses = statuses;
    }

    private JobState() {
        this.driverControlsFilesUri = Input.empty();
        this.driverOutputResourceUri = Input.empty();
        this.forceDelete = Input.empty();
        this.hadoopConfig = Input.empty();
        this.hiveConfig = Input.empty();
        this.labels = Input.empty();
        this.pigConfig = Input.empty();
        this.placement = Input.empty();
        this.project = Input.empty();
        this.pysparkConfig = Input.empty();
        this.reference = Input.empty();
        this.region = Input.empty();
        this.scheduling = Input.empty();
        this.sparkConfig = Input.empty();
        this.sparksqlConfig = Input.empty();
        this.statuses = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> driverControlsFilesUri;
        private @Nullable Input<String> driverOutputResourceUri;
        private @Nullable Input<Boolean> forceDelete;
        private @Nullable Input<JobHadoopConfigGetArgs> hadoopConfig;
        private @Nullable Input<JobHiveConfigGetArgs> hiveConfig;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<JobPigConfigGetArgs> pigConfig;
        private @Nullable Input<JobPlacementGetArgs> placement;
        private @Nullable Input<String> project;
        private @Nullable Input<JobPysparkConfigGetArgs> pysparkConfig;
        private @Nullable Input<JobReferenceGetArgs> reference;
        private @Nullable Input<String> region;
        private @Nullable Input<JobSchedulingGetArgs> scheduling;
        private @Nullable Input<JobSparkConfigGetArgs> sparkConfig;
        private @Nullable Input<JobSparksqlConfigGetArgs> sparksqlConfig;
        private @Nullable Input<List<JobStatusGetArgs>> statuses;

        public Builder() {
    	      // Empty
        }

        public Builder(JobState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driverControlsFilesUri = defaults.driverControlsFilesUri;
    	      this.driverOutputResourceUri = defaults.driverOutputResourceUri;
    	      this.forceDelete = defaults.forceDelete;
    	      this.hadoopConfig = defaults.hadoopConfig;
    	      this.hiveConfig = defaults.hiveConfig;
    	      this.labels = defaults.labels;
    	      this.pigConfig = defaults.pigConfig;
    	      this.placement = defaults.placement;
    	      this.project = defaults.project;
    	      this.pysparkConfig = defaults.pysparkConfig;
    	      this.reference = defaults.reference;
    	      this.region = defaults.region;
    	      this.scheduling = defaults.scheduling;
    	      this.sparkConfig = defaults.sparkConfig;
    	      this.sparksqlConfig = defaults.sparksqlConfig;
    	      this.statuses = defaults.statuses;
        }

        public Builder setDriverControlsFilesUri(@Nullable Input<String> driverControlsFilesUri) {
            this.driverControlsFilesUri = driverControlsFilesUri;
            return this;
        }

        public Builder setDriverControlsFilesUri(@Nullable String driverControlsFilesUri) {
            this.driverControlsFilesUri = Input.ofNullable(driverControlsFilesUri);
            return this;
        }

        public Builder setDriverOutputResourceUri(@Nullable Input<String> driverOutputResourceUri) {
            this.driverOutputResourceUri = driverOutputResourceUri;
            return this;
        }

        public Builder setDriverOutputResourceUri(@Nullable String driverOutputResourceUri) {
            this.driverOutputResourceUri = Input.ofNullable(driverOutputResourceUri);
            return this;
        }

        public Builder setForceDelete(@Nullable Input<Boolean> forceDelete) {
            this.forceDelete = forceDelete;
            return this;
        }

        public Builder setForceDelete(@Nullable Boolean forceDelete) {
            this.forceDelete = Input.ofNullable(forceDelete);
            return this;
        }

        public Builder setHadoopConfig(@Nullable Input<JobHadoopConfigGetArgs> hadoopConfig) {
            this.hadoopConfig = hadoopConfig;
            return this;
        }

        public Builder setHadoopConfig(@Nullable JobHadoopConfigGetArgs hadoopConfig) {
            this.hadoopConfig = Input.ofNullable(hadoopConfig);
            return this;
        }

        public Builder setHiveConfig(@Nullable Input<JobHiveConfigGetArgs> hiveConfig) {
            this.hiveConfig = hiveConfig;
            return this;
        }

        public Builder setHiveConfig(@Nullable JobHiveConfigGetArgs hiveConfig) {
            this.hiveConfig = Input.ofNullable(hiveConfig);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setPigConfig(@Nullable Input<JobPigConfigGetArgs> pigConfig) {
            this.pigConfig = pigConfig;
            return this;
        }

        public Builder setPigConfig(@Nullable JobPigConfigGetArgs pigConfig) {
            this.pigConfig = Input.ofNullable(pigConfig);
            return this;
        }

        public Builder setPlacement(@Nullable Input<JobPlacementGetArgs> placement) {
            this.placement = placement;
            return this;
        }

        public Builder setPlacement(@Nullable JobPlacementGetArgs placement) {
            this.placement = Input.ofNullable(placement);
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

        public Builder setPysparkConfig(@Nullable Input<JobPysparkConfigGetArgs> pysparkConfig) {
            this.pysparkConfig = pysparkConfig;
            return this;
        }

        public Builder setPysparkConfig(@Nullable JobPysparkConfigGetArgs pysparkConfig) {
            this.pysparkConfig = Input.ofNullable(pysparkConfig);
            return this;
        }

        public Builder setReference(@Nullable Input<JobReferenceGetArgs> reference) {
            this.reference = reference;
            return this;
        }

        public Builder setReference(@Nullable JobReferenceGetArgs reference) {
            this.reference = Input.ofNullable(reference);
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

        public Builder setScheduling(@Nullable Input<JobSchedulingGetArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        public Builder setScheduling(@Nullable JobSchedulingGetArgs scheduling) {
            this.scheduling = Input.ofNullable(scheduling);
            return this;
        }

        public Builder setSparkConfig(@Nullable Input<JobSparkConfigGetArgs> sparkConfig) {
            this.sparkConfig = sparkConfig;
            return this;
        }

        public Builder setSparkConfig(@Nullable JobSparkConfigGetArgs sparkConfig) {
            this.sparkConfig = Input.ofNullable(sparkConfig);
            return this;
        }

        public Builder setSparksqlConfig(@Nullable Input<JobSparksqlConfigGetArgs> sparksqlConfig) {
            this.sparksqlConfig = sparksqlConfig;
            return this;
        }

        public Builder setSparksqlConfig(@Nullable JobSparksqlConfigGetArgs sparksqlConfig) {
            this.sparksqlConfig = Input.ofNullable(sparksqlConfig);
            return this;
        }

        public Builder setStatuses(@Nullable Input<List<JobStatusGetArgs>> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder setStatuses(@Nullable List<JobStatusGetArgs> statuses) {
            this.statuses = Input.ofNullable(statuses);
            return this;
        }

        public JobState build() {
            return new JobState(driverControlsFilesUri, driverOutputResourceUri, forceDelete, hadoopConfig, hiveConfig, labels, pigConfig, placement, project, pysparkConfig, reference, region, scheduling, sparkConfig, sparksqlConfig, statuses);
        }
    }
}
