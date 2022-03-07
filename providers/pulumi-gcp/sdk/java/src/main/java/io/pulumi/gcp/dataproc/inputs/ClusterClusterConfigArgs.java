// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigAutoscalingConfigArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigEncryptionConfigArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigEndpointConfigArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigGceClusterConfigArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigInitializationActionArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigLifecycleConfigArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMasterConfigArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigMetastoreConfigArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigPreemptibleWorkerConfigArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSecurityConfigArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigSoftwareConfigArgs;
import io.pulumi.gcp.dataproc.inputs.ClusterClusterConfigWorkerConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigArgs Empty = new ClusterClusterConfigArgs();

    /**
     * The autoscaling policy config associated with the cluster.
     * Note that once set, if `autoscaling_config` is the only field set in `cluster_config`, it can
     * only be removed by setting `policy_uri = ""`, rather than removing the whole block.
     * Structure defined below.
     * 
     */
    @InputImport(name="autoscalingConfig")
      private final @Nullable Input<ClusterClusterConfigAutoscalingConfigArgs> autoscalingConfig;

    public Input<ClusterClusterConfigAutoscalingConfigArgs> getAutoscalingConfig() {
        return this.autoscalingConfig == null ? Input.empty() : this.autoscalingConfig;
    }

    @InputImport(name="bucket")
      private final @Nullable Input<String> bucket;

    public Input<String> getBucket() {
        return this.bucket == null ? Input.empty() : this.bucket;
    }

    /**
     * The Customer managed encryption keys settings for the cluster.
     * Structure defined below.
     * 
     */
    @InputImport(name="encryptionConfig")
      private final @Nullable Input<ClusterClusterConfigEncryptionConfigArgs> encryptionConfig;

    public Input<ClusterClusterConfigEncryptionConfigArgs> getEncryptionConfig() {
        return this.encryptionConfig == null ? Input.empty() : this.encryptionConfig;
    }

    /**
     * The config settings for port access on the cluster.
     * Structure defined below.
     * 
     */
    @InputImport(name="endpointConfig")
      private final @Nullable Input<ClusterClusterConfigEndpointConfigArgs> endpointConfig;

    public Input<ClusterClusterConfigEndpointConfigArgs> getEndpointConfig() {
        return this.endpointConfig == null ? Input.empty() : this.endpointConfig;
    }

    /**
     * Common config settings for resources of Google Compute Engine cluster
     * instances, applicable to all instances in the cluster. Structure defined below.
     * 
     */
    @InputImport(name="gceClusterConfig")
      private final @Nullable Input<ClusterClusterConfigGceClusterConfigArgs> gceClusterConfig;

    public Input<ClusterClusterConfigGceClusterConfigArgs> getGceClusterConfig() {
        return this.gceClusterConfig == null ? Input.empty() : this.gceClusterConfig;
    }

    /**
     * Commands to execute on each node after config is completed.
     * You can specify multiple versions of these. Structure defined below.
     * 
     */
    @InputImport(name="initializationActions")
      private final @Nullable Input<List<ClusterClusterConfigInitializationActionArgs>> initializationActions;

    public Input<List<ClusterClusterConfigInitializationActionArgs>> getInitializationActions() {
        return this.initializationActions == null ? Input.empty() : this.initializationActions;
    }

    /**
     * The settings for auto deletion cluster schedule.
     * Structure defined below.
     * 
     */
    @InputImport(name="lifecycleConfig")
      private final @Nullable Input<ClusterClusterConfigLifecycleConfigArgs> lifecycleConfig;

    public Input<ClusterClusterConfigLifecycleConfigArgs> getLifecycleConfig() {
        return this.lifecycleConfig == null ? Input.empty() : this.lifecycleConfig;
    }

    /**
     * The Google Compute Engine config settings for the master instances
     * in a cluster. Structure defined below.
     * 
     */
    @InputImport(name="masterConfig")
      private final @Nullable Input<ClusterClusterConfigMasterConfigArgs> masterConfig;

    public Input<ClusterClusterConfigMasterConfigArgs> getMasterConfig() {
        return this.masterConfig == null ? Input.empty() : this.masterConfig;
    }

    /**
     * The config setting for metastore service with the cluster.
     * Structure defined below.
     * ***
     * 
     */
    @InputImport(name="metastoreConfig")
      private final @Nullable Input<ClusterClusterConfigMetastoreConfigArgs> metastoreConfig;

    public Input<ClusterClusterConfigMetastoreConfigArgs> getMetastoreConfig() {
        return this.metastoreConfig == null ? Input.empty() : this.metastoreConfig;
    }

    /**
     * The Google Compute Engine config settings for the additional
     * instances in a cluster. Structure defined below.
     * * **NOTE** : `preemptible_worker_config` is
     *   an alias for the api's [secondaryWorkerConfig](https://cloud.google.com/dataproc/docs/reference/rest/v1/ClusterConfig#InstanceGroupConfig). The name doesn't necessarily mean it is preemptible and is named as
     *   such for legacy/compatibility reasons.
     * 
     */
    @InputImport(name="preemptibleWorkerConfig")
      private final @Nullable Input<ClusterClusterConfigPreemptibleWorkerConfigArgs> preemptibleWorkerConfig;

    public Input<ClusterClusterConfigPreemptibleWorkerConfigArgs> getPreemptibleWorkerConfig() {
        return this.preemptibleWorkerConfig == null ? Input.empty() : this.preemptibleWorkerConfig;
    }

    /**
     * Security related configuration. Structure defined below.
     * 
     */
    @InputImport(name="securityConfig")
      private final @Nullable Input<ClusterClusterConfigSecurityConfigArgs> securityConfig;

    public Input<ClusterClusterConfigSecurityConfigArgs> getSecurityConfig() {
        return this.securityConfig == null ? Input.empty() : this.securityConfig;
    }

    /**
     * The config settings for software inside the cluster.
     * Structure defined below.
     * 
     */
    @InputImport(name="softwareConfig")
      private final @Nullable Input<ClusterClusterConfigSoftwareConfigArgs> softwareConfig;

    public Input<ClusterClusterConfigSoftwareConfigArgs> getSoftwareConfig() {
        return this.softwareConfig == null ? Input.empty() : this.softwareConfig;
    }

    /**
     * The Cloud Storage staging bucket used to stage files,
     * such as Hadoop jars, between client machines and the cluster.
     * Note: If you don't explicitly specify a `staging_bucket`
     * then GCP will auto create / assign one for you. However, you are not guaranteed
     * an auto generated bucket which is solely dedicated to your cluster; it may be shared
     * with other clusters in the same region/zone also choosing to use the auto generation
     * option.
     * 
     */
    @InputImport(name="stagingBucket")
      private final @Nullable Input<String> stagingBucket;

    public Input<String> getStagingBucket() {
        return this.stagingBucket == null ? Input.empty() : this.stagingBucket;
    }

    /**
     * The Cloud Storage temp bucket used to store ephemeral cluster
     * and jobs data, such as Spark and MapReduce history files.
     * Note: If you don't explicitly specify a `temp_bucket` then GCP will auto create / assign one for you.
     * 
     */
    @InputImport(name="tempBucket")
      private final @Nullable Input<String> tempBucket;

    public Input<String> getTempBucket() {
        return this.tempBucket == null ? Input.empty() : this.tempBucket;
    }

    /**
     * The Google Compute Engine config settings for the worker instances
     * in a cluster. Structure defined below.
     * 
     */
    @InputImport(name="workerConfig")
      private final @Nullable Input<ClusterClusterConfigWorkerConfigArgs> workerConfig;

    public Input<ClusterClusterConfigWorkerConfigArgs> getWorkerConfig() {
        return this.workerConfig == null ? Input.empty() : this.workerConfig;
    }

    public ClusterClusterConfigArgs(
        @Nullable Input<ClusterClusterConfigAutoscalingConfigArgs> autoscalingConfig,
        @Nullable Input<String> bucket,
        @Nullable Input<ClusterClusterConfigEncryptionConfigArgs> encryptionConfig,
        @Nullable Input<ClusterClusterConfigEndpointConfigArgs> endpointConfig,
        @Nullable Input<ClusterClusterConfigGceClusterConfigArgs> gceClusterConfig,
        @Nullable Input<List<ClusterClusterConfigInitializationActionArgs>> initializationActions,
        @Nullable Input<ClusterClusterConfigLifecycleConfigArgs> lifecycleConfig,
        @Nullable Input<ClusterClusterConfigMasterConfigArgs> masterConfig,
        @Nullable Input<ClusterClusterConfigMetastoreConfigArgs> metastoreConfig,
        @Nullable Input<ClusterClusterConfigPreemptibleWorkerConfigArgs> preemptibleWorkerConfig,
        @Nullable Input<ClusterClusterConfigSecurityConfigArgs> securityConfig,
        @Nullable Input<ClusterClusterConfigSoftwareConfigArgs> softwareConfig,
        @Nullable Input<String> stagingBucket,
        @Nullable Input<String> tempBucket,
        @Nullable Input<ClusterClusterConfigWorkerConfigArgs> workerConfig) {
        this.autoscalingConfig = autoscalingConfig;
        this.bucket = bucket;
        this.encryptionConfig = encryptionConfig;
        this.endpointConfig = endpointConfig;
        this.gceClusterConfig = gceClusterConfig;
        this.initializationActions = initializationActions;
        this.lifecycleConfig = lifecycleConfig;
        this.masterConfig = masterConfig;
        this.metastoreConfig = metastoreConfig;
        this.preemptibleWorkerConfig = preemptibleWorkerConfig;
        this.securityConfig = securityConfig;
        this.softwareConfig = softwareConfig;
        this.stagingBucket = stagingBucket;
        this.tempBucket = tempBucket;
        this.workerConfig = workerConfig;
    }

    private ClusterClusterConfigArgs() {
        this.autoscalingConfig = Input.empty();
        this.bucket = Input.empty();
        this.encryptionConfig = Input.empty();
        this.endpointConfig = Input.empty();
        this.gceClusterConfig = Input.empty();
        this.initializationActions = Input.empty();
        this.lifecycleConfig = Input.empty();
        this.masterConfig = Input.empty();
        this.metastoreConfig = Input.empty();
        this.preemptibleWorkerConfig = Input.empty();
        this.securityConfig = Input.empty();
        this.softwareConfig = Input.empty();
        this.stagingBucket = Input.empty();
        this.tempBucket = Input.empty();
        this.workerConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ClusterClusterConfigAutoscalingConfigArgs> autoscalingConfig;
        private @Nullable Input<String> bucket;
        private @Nullable Input<ClusterClusterConfigEncryptionConfigArgs> encryptionConfig;
        private @Nullable Input<ClusterClusterConfigEndpointConfigArgs> endpointConfig;
        private @Nullable Input<ClusterClusterConfigGceClusterConfigArgs> gceClusterConfig;
        private @Nullable Input<List<ClusterClusterConfigInitializationActionArgs>> initializationActions;
        private @Nullable Input<ClusterClusterConfigLifecycleConfigArgs> lifecycleConfig;
        private @Nullable Input<ClusterClusterConfigMasterConfigArgs> masterConfig;
        private @Nullable Input<ClusterClusterConfigMetastoreConfigArgs> metastoreConfig;
        private @Nullable Input<ClusterClusterConfigPreemptibleWorkerConfigArgs> preemptibleWorkerConfig;
        private @Nullable Input<ClusterClusterConfigSecurityConfigArgs> securityConfig;
        private @Nullable Input<ClusterClusterConfigSoftwareConfigArgs> softwareConfig;
        private @Nullable Input<String> stagingBucket;
        private @Nullable Input<String> tempBucket;
        private @Nullable Input<ClusterClusterConfigWorkerConfigArgs> workerConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingConfig = defaults.autoscalingConfig;
    	      this.bucket = defaults.bucket;
    	      this.encryptionConfig = defaults.encryptionConfig;
    	      this.endpointConfig = defaults.endpointConfig;
    	      this.gceClusterConfig = defaults.gceClusterConfig;
    	      this.initializationActions = defaults.initializationActions;
    	      this.lifecycleConfig = defaults.lifecycleConfig;
    	      this.masterConfig = defaults.masterConfig;
    	      this.metastoreConfig = defaults.metastoreConfig;
    	      this.preemptibleWorkerConfig = defaults.preemptibleWorkerConfig;
    	      this.securityConfig = defaults.securityConfig;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.stagingBucket = defaults.stagingBucket;
    	      this.tempBucket = defaults.tempBucket;
    	      this.workerConfig = defaults.workerConfig;
        }

        public Builder setAutoscalingConfig(@Nullable Input<ClusterClusterConfigAutoscalingConfigArgs> autoscalingConfig) {
            this.autoscalingConfig = autoscalingConfig;
            return this;
        }

        public Builder setAutoscalingConfig(@Nullable ClusterClusterConfigAutoscalingConfigArgs autoscalingConfig) {
            this.autoscalingConfig = Input.ofNullable(autoscalingConfig);
            return this;
        }

        public Builder setBucket(@Nullable Input<String> bucket) {
            this.bucket = bucket;
            return this;
        }

        public Builder setBucket(@Nullable String bucket) {
            this.bucket = Input.ofNullable(bucket);
            return this;
        }

        public Builder setEncryptionConfig(@Nullable Input<ClusterClusterConfigEncryptionConfigArgs> encryptionConfig) {
            this.encryptionConfig = encryptionConfig;
            return this;
        }

        public Builder setEncryptionConfig(@Nullable ClusterClusterConfigEncryptionConfigArgs encryptionConfig) {
            this.encryptionConfig = Input.ofNullable(encryptionConfig);
            return this;
        }

        public Builder setEndpointConfig(@Nullable Input<ClusterClusterConfigEndpointConfigArgs> endpointConfig) {
            this.endpointConfig = endpointConfig;
            return this;
        }

        public Builder setEndpointConfig(@Nullable ClusterClusterConfigEndpointConfigArgs endpointConfig) {
            this.endpointConfig = Input.ofNullable(endpointConfig);
            return this;
        }

        public Builder setGceClusterConfig(@Nullable Input<ClusterClusterConfigGceClusterConfigArgs> gceClusterConfig) {
            this.gceClusterConfig = gceClusterConfig;
            return this;
        }

        public Builder setGceClusterConfig(@Nullable ClusterClusterConfigGceClusterConfigArgs gceClusterConfig) {
            this.gceClusterConfig = Input.ofNullable(gceClusterConfig);
            return this;
        }

        public Builder setInitializationActions(@Nullable Input<List<ClusterClusterConfigInitializationActionArgs>> initializationActions) {
            this.initializationActions = initializationActions;
            return this;
        }

        public Builder setInitializationActions(@Nullable List<ClusterClusterConfigInitializationActionArgs> initializationActions) {
            this.initializationActions = Input.ofNullable(initializationActions);
            return this;
        }

        public Builder setLifecycleConfig(@Nullable Input<ClusterClusterConfigLifecycleConfigArgs> lifecycleConfig) {
            this.lifecycleConfig = lifecycleConfig;
            return this;
        }

        public Builder setLifecycleConfig(@Nullable ClusterClusterConfigLifecycleConfigArgs lifecycleConfig) {
            this.lifecycleConfig = Input.ofNullable(lifecycleConfig);
            return this;
        }

        public Builder setMasterConfig(@Nullable Input<ClusterClusterConfigMasterConfigArgs> masterConfig) {
            this.masterConfig = masterConfig;
            return this;
        }

        public Builder setMasterConfig(@Nullable ClusterClusterConfigMasterConfigArgs masterConfig) {
            this.masterConfig = Input.ofNullable(masterConfig);
            return this;
        }

        public Builder setMetastoreConfig(@Nullable Input<ClusterClusterConfigMetastoreConfigArgs> metastoreConfig) {
            this.metastoreConfig = metastoreConfig;
            return this;
        }

        public Builder setMetastoreConfig(@Nullable ClusterClusterConfigMetastoreConfigArgs metastoreConfig) {
            this.metastoreConfig = Input.ofNullable(metastoreConfig);
            return this;
        }

        public Builder setPreemptibleWorkerConfig(@Nullable Input<ClusterClusterConfigPreemptibleWorkerConfigArgs> preemptibleWorkerConfig) {
            this.preemptibleWorkerConfig = preemptibleWorkerConfig;
            return this;
        }

        public Builder setPreemptibleWorkerConfig(@Nullable ClusterClusterConfigPreemptibleWorkerConfigArgs preemptibleWorkerConfig) {
            this.preemptibleWorkerConfig = Input.ofNullable(preemptibleWorkerConfig);
            return this;
        }

        public Builder setSecurityConfig(@Nullable Input<ClusterClusterConfigSecurityConfigArgs> securityConfig) {
            this.securityConfig = securityConfig;
            return this;
        }

        public Builder setSecurityConfig(@Nullable ClusterClusterConfigSecurityConfigArgs securityConfig) {
            this.securityConfig = Input.ofNullable(securityConfig);
            return this;
        }

        public Builder setSoftwareConfig(@Nullable Input<ClusterClusterConfigSoftwareConfigArgs> softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }

        public Builder setSoftwareConfig(@Nullable ClusterClusterConfigSoftwareConfigArgs softwareConfig) {
            this.softwareConfig = Input.ofNullable(softwareConfig);
            return this;
        }

        public Builder setStagingBucket(@Nullable Input<String> stagingBucket) {
            this.stagingBucket = stagingBucket;
            return this;
        }

        public Builder setStagingBucket(@Nullable String stagingBucket) {
            this.stagingBucket = Input.ofNullable(stagingBucket);
            return this;
        }

        public Builder setTempBucket(@Nullable Input<String> tempBucket) {
            this.tempBucket = tempBucket;
            return this;
        }

        public Builder setTempBucket(@Nullable String tempBucket) {
            this.tempBucket = Input.ofNullable(tempBucket);
            return this;
        }

        public Builder setWorkerConfig(@Nullable Input<ClusterClusterConfigWorkerConfigArgs> workerConfig) {
            this.workerConfig = workerConfig;
            return this;
        }

        public Builder setWorkerConfig(@Nullable ClusterClusterConfigWorkerConfigArgs workerConfig) {
            this.workerConfig = Input.ofNullable(workerConfig);
            return this;
        }
        public ClusterClusterConfigArgs build() {
            return new ClusterClusterConfigArgs(autoscalingConfig, bucket, encryptionConfig, endpointConfig, gceClusterConfig, initializationActions, lifecycleConfig, masterConfig, metastoreConfig, preemptibleWorkerConfig, securityConfig, softwareConfig, stagingBucket, tempBucket, workerConfig);
        }
    }
}