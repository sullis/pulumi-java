// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.JobHadoopConfigArgs;
import io.pulumi.gcp.dataproc.inputs.JobHiveConfigArgs;
import io.pulumi.gcp.dataproc.inputs.JobPigConfigArgs;
import io.pulumi.gcp.dataproc.inputs.JobPlacementArgs;
import io.pulumi.gcp.dataproc.inputs.JobPysparkConfigArgs;
import io.pulumi.gcp.dataproc.inputs.JobReferenceArgs;
import io.pulumi.gcp.dataproc.inputs.JobSchedulingArgs;
import io.pulumi.gcp.dataproc.inputs.JobSparkConfigArgs;
import io.pulumi.gcp.dataproc.inputs.JobSparksqlConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class JobArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobArgs Empty = new JobArgs();

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
    private final @Nullable Input<JobHadoopConfigArgs> hadoopConfig;

    public Input<JobHadoopConfigArgs> getHadoopConfig() {
        return this.hadoopConfig == null ? Input.empty() : this.hadoopConfig;
    }

    /**
     * The config of hive job
     * 
     */
    @InputImport(name="hiveConfig")
    private final @Nullable Input<JobHiveConfigArgs> hiveConfig;

    public Input<JobHiveConfigArgs> getHiveConfig() {
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
    private final @Nullable Input<JobPigConfigArgs> pigConfig;

    public Input<JobPigConfigArgs> getPigConfig() {
        return this.pigConfig == null ? Input.empty() : this.pigConfig;
    }

    /**
     * The config of job placement.
     * 
     */
    @InputImport(name="placement", required=true)
    private final Input<JobPlacementArgs> placement;

    public Input<JobPlacementArgs> getPlacement() {
        return this.placement;
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
    private final @Nullable Input<JobPysparkConfigArgs> pysparkConfig;

    public Input<JobPysparkConfigArgs> getPysparkConfig() {
        return this.pysparkConfig == null ? Input.empty() : this.pysparkConfig;
    }

    /**
     * The reference of the job
     * 
     */
    @InputImport(name="reference")
    private final @Nullable Input<JobReferenceArgs> reference;

    public Input<JobReferenceArgs> getReference() {
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
    private final @Nullable Input<JobSchedulingArgs> scheduling;

    public Input<JobSchedulingArgs> getScheduling() {
        return this.scheduling == null ? Input.empty() : this.scheduling;
    }

    /**
     * The config of the Spark job.
     * 
     */
    @InputImport(name="sparkConfig")
    private final @Nullable Input<JobSparkConfigArgs> sparkConfig;

    public Input<JobSparkConfigArgs> getSparkConfig() {
        return this.sparkConfig == null ? Input.empty() : this.sparkConfig;
    }

    /**
     * The config of SparkSql job
     * 
     */
    @InputImport(name="sparksqlConfig")
    private final @Nullable Input<JobSparksqlConfigArgs> sparksqlConfig;

    public Input<JobSparksqlConfigArgs> getSparksqlConfig() {
        return this.sparksqlConfig == null ? Input.empty() : this.sparksqlConfig;
    }

    public JobArgs(
        @Nullable Input<Boolean> forceDelete,
        @Nullable Input<JobHadoopConfigArgs> hadoopConfig,
        @Nullable Input<JobHiveConfigArgs> hiveConfig,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<JobPigConfigArgs> pigConfig,
        Input<JobPlacementArgs> placement,
        @Nullable Input<String> project,
        @Nullable Input<JobPysparkConfigArgs> pysparkConfig,
        @Nullable Input<JobReferenceArgs> reference,
        @Nullable Input<String> region,
        @Nullable Input<JobSchedulingArgs> scheduling,
        @Nullable Input<JobSparkConfigArgs> sparkConfig,
        @Nullable Input<JobSparksqlConfigArgs> sparksqlConfig) {
        this.forceDelete = forceDelete;
        this.hadoopConfig = hadoopConfig;
        this.hiveConfig = hiveConfig;
        this.labels = labels;
        this.pigConfig = pigConfig;
        this.placement = Objects.requireNonNull(placement, "expected parameter 'placement' to be non-null");
        this.project = project;
        this.pysparkConfig = pysparkConfig;
        this.reference = reference;
        this.region = region;
        this.scheduling = scheduling;
        this.sparkConfig = sparkConfig;
        this.sparksqlConfig = sparksqlConfig;
    }

    private JobArgs() {
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
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> forceDelete;
        private @Nullable Input<JobHadoopConfigArgs> hadoopConfig;
        private @Nullable Input<JobHiveConfigArgs> hiveConfig;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<JobPigConfigArgs> pigConfig;
        private Input<JobPlacementArgs> placement;
        private @Nullable Input<String> project;
        private @Nullable Input<JobPysparkConfigArgs> pysparkConfig;
        private @Nullable Input<JobReferenceArgs> reference;
        private @Nullable Input<String> region;
        private @Nullable Input<JobSchedulingArgs> scheduling;
        private @Nullable Input<JobSparkConfigArgs> sparkConfig;
        private @Nullable Input<JobSparksqlConfigArgs> sparksqlConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(JobArgs defaults) {
    	      Objects.requireNonNull(defaults);
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
        }

        public Builder setForceDelete(@Nullable Input<Boolean> forceDelete) {
            this.forceDelete = forceDelete;
            return this;
        }

        public Builder setForceDelete(@Nullable Boolean forceDelete) {
            this.forceDelete = Input.ofNullable(forceDelete);
            return this;
        }

        public Builder setHadoopConfig(@Nullable Input<JobHadoopConfigArgs> hadoopConfig) {
            this.hadoopConfig = hadoopConfig;
            return this;
        }

        public Builder setHadoopConfig(@Nullable JobHadoopConfigArgs hadoopConfig) {
            this.hadoopConfig = Input.ofNullable(hadoopConfig);
            return this;
        }

        public Builder setHiveConfig(@Nullable Input<JobHiveConfigArgs> hiveConfig) {
            this.hiveConfig = hiveConfig;
            return this;
        }

        public Builder setHiveConfig(@Nullable JobHiveConfigArgs hiveConfig) {
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

        public Builder setPigConfig(@Nullable Input<JobPigConfigArgs> pigConfig) {
            this.pigConfig = pigConfig;
            return this;
        }

        public Builder setPigConfig(@Nullable JobPigConfigArgs pigConfig) {
            this.pigConfig = Input.ofNullable(pigConfig);
            return this;
        }

        public Builder setPlacement(Input<JobPlacementArgs> placement) {
            this.placement = Objects.requireNonNull(placement);
            return this;
        }

        public Builder setPlacement(JobPlacementArgs placement) {
            this.placement = Input.of(Objects.requireNonNull(placement));
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

        public Builder setPysparkConfig(@Nullable Input<JobPysparkConfigArgs> pysparkConfig) {
            this.pysparkConfig = pysparkConfig;
            return this;
        }

        public Builder setPysparkConfig(@Nullable JobPysparkConfigArgs pysparkConfig) {
            this.pysparkConfig = Input.ofNullable(pysparkConfig);
            return this;
        }

        public Builder setReference(@Nullable Input<JobReferenceArgs> reference) {
            this.reference = reference;
            return this;
        }

        public Builder setReference(@Nullable JobReferenceArgs reference) {
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

        public Builder setScheduling(@Nullable Input<JobSchedulingArgs> scheduling) {
            this.scheduling = scheduling;
            return this;
        }

        public Builder setScheduling(@Nullable JobSchedulingArgs scheduling) {
            this.scheduling = Input.ofNullable(scheduling);
            return this;
        }

        public Builder setSparkConfig(@Nullable Input<JobSparkConfigArgs> sparkConfig) {
            this.sparkConfig = sparkConfig;
            return this;
        }

        public Builder setSparkConfig(@Nullable JobSparkConfigArgs sparkConfig) {
            this.sparkConfig = Input.ofNullable(sparkConfig);
            return this;
        }

        public Builder setSparksqlConfig(@Nullable Input<JobSparksqlConfigArgs> sparksqlConfig) {
            this.sparksqlConfig = sparksqlConfig;
            return this;
        }

        public Builder setSparksqlConfig(@Nullable JobSparksqlConfigArgs sparksqlConfig) {
            this.sparksqlConfig = Input.ofNullable(sparksqlConfig);
            return this;
        }

        public JobArgs build() {
            return new JobArgs(forceDelete, hadoopConfig, hiveConfig, labels, pigConfig, placement, project, pysparkConfig, reference, region, scheduling, sparkConfig, sparksqlConfig);
        }
    }
}
