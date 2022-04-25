// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.AutoscalingConfigResponse;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.EncryptionConfigResponse;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.EndpointConfigResponse;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.GceClusterConfigResponse;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.GkeClusterConfigResponse;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.InstanceGroupConfigResponse;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.LifecycleConfigResponse;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.MetastoreConfigResponse;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.NodeInitializationActionResponse;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.SecurityConfigResponse;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.SoftwareConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * The cluster config.
 * 
 */
public final class ClusterConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ClusterConfigResponse Empty = new ClusterConfigResponse();

    /**
     * Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
     * 
     */
    @Import(name="autoscalingConfig", required=true)
    private AutoscalingConfigResponse autoscalingConfig;

    /**
     * @return Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
     * 
     */
    public AutoscalingConfigResponse autoscalingConfig() {
        return this.autoscalingConfig;
    }

    /**
     * Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging bucket (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a URI to a Cloud Storage bucket.
     * 
     */
    @Import(name="configBucket", required=true)
    private String configBucket;

    /**
     * @return Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging bucket (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a URI to a Cloud Storage bucket.
     * 
     */
    public String configBucket() {
        return this.configBucket;
    }

    /**
     * Optional. Encryption settings for the cluster.
     * 
     */
    @Import(name="encryptionConfig", required=true)
    private EncryptionConfigResponse encryptionConfig;

    /**
     * @return Optional. Encryption settings for the cluster.
     * 
     */
    public EncryptionConfigResponse encryptionConfig() {
        return this.encryptionConfig;
    }

    /**
     * Optional. Port/endpoint configuration for this cluster
     * 
     */
    @Import(name="endpointConfig", required=true)
    private EndpointConfigResponse endpointConfig;

    /**
     * @return Optional. Port/endpoint configuration for this cluster
     * 
     */
    public EndpointConfigResponse endpointConfig() {
        return this.endpointConfig;
    }

    /**
     * Optional. The shared Compute Engine config settings for all instances in a cluster.
     * 
     */
    @Import(name="gceClusterConfig", required=true)
    private GceClusterConfigResponse gceClusterConfig;

    /**
     * @return Optional. The shared Compute Engine config settings for all instances in a cluster.
     * 
     */
    public GceClusterConfigResponse gceClusterConfig() {
        return this.gceClusterConfig;
    }

    /**
     * Optional. The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. Setting this is considered mutually exclusive with Compute Engine-based options such as gce_cluster_config, master_config, worker_config, secondary_worker_config, and autoscaling_config.
     * 
     */
    @Import(name="gkeClusterConfig", required=true)
    private GkeClusterConfigResponse gkeClusterConfig;

    /**
     * @return Optional. The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. Setting this is considered mutually exclusive with Compute Engine-based options such as gce_cluster_config, master_config, worker_config, secondary_worker_config, and autoscaling_config.
     * 
     */
    public GkeClusterConfigResponse gkeClusterConfig() {
        return this.gkeClusterConfig;
    }

    /**
     * Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node&#39;s role metadata to run an executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role) if [[ &#34;${ROLE}&#34; == &#39;Master&#39; ]]; then ... master specific actions ... else ... worker specific actions ... fi
     * 
     */
    @Import(name="initializationActions", required=true)
    private List<NodeInitializationActionResponse> initializationActions;

    /**
     * @return Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node&#39;s role metadata to run an executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role) if [[ &#34;${ROLE}&#34; == &#39;Master&#39; ]]; then ... master specific actions ... else ... worker specific actions ... fi
     * 
     */
    public List<NodeInitializationActionResponse> initializationActions() {
        return this.initializationActions;
    }

    /**
     * Optional. The config setting for auto delete cluster schedule.
     * 
     */
    @Import(name="lifecycleConfig", required=true)
    private LifecycleConfigResponse lifecycleConfig;

    /**
     * @return Optional. The config setting for auto delete cluster schedule.
     * 
     */
    public LifecycleConfigResponse lifecycleConfig() {
        return this.lifecycleConfig;
    }

    /**
     * Optional. The Compute Engine config settings for the master instance in a cluster.
     * 
     */
    @Import(name="masterConfig", required=true)
    private InstanceGroupConfigResponse masterConfig;

    /**
     * @return Optional. The Compute Engine config settings for the master instance in a cluster.
     * 
     */
    public InstanceGroupConfigResponse masterConfig() {
        return this.masterConfig;
    }

    /**
     * Optional. Metastore configuration.
     * 
     */
    @Import(name="metastoreConfig", required=true)
    private MetastoreConfigResponse metastoreConfig;

    /**
     * @return Optional. Metastore configuration.
     * 
     */
    public MetastoreConfigResponse metastoreConfig() {
        return this.metastoreConfig;
    }

    /**
     * Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
     */
    @Import(name="secondaryWorkerConfig", required=true)
    private InstanceGroupConfigResponse secondaryWorkerConfig;

    /**
     * @return Optional. The Compute Engine config settings for additional worker instances in a cluster.
     * 
     */
    public InstanceGroupConfigResponse secondaryWorkerConfig() {
        return this.secondaryWorkerConfig;
    }

    /**
     * Optional. Security related configuration.
     * 
     */
    @Import(name="securityConfig", required=true)
    private SecurityConfigResponse securityConfig;

    /**
     * @return Optional. Security related configuration.
     * 
     */
    public SecurityConfigResponse securityConfig() {
        return this.securityConfig;
    }

    /**
     * Optional. The config settings for software inside the cluster.
     * 
     */
    @Import(name="softwareConfig", required=true)
    private SoftwareConfigResponse softwareConfig;

    /**
     * @return Optional. The config settings for software inside the cluster.
     * 
     */
    public SoftwareConfigResponse softwareConfig() {
        return this.softwareConfig;
    }

    /**
     * Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster&#39;s temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket. This field requires a Cloud Storage bucket name, not a URI to a Cloud Storage bucket.
     * 
     */
    @Import(name="tempBucket", required=true)
    private String tempBucket;

    /**
     * @return Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster&#39;s temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket. This field requires a Cloud Storage bucket name, not a URI to a Cloud Storage bucket.
     * 
     */
    public String tempBucket() {
        return this.tempBucket;
    }

    /**
     * Optional. The Compute Engine config settings for worker instances in a cluster.
     * 
     */
    @Import(name="workerConfig", required=true)
    private InstanceGroupConfigResponse workerConfig;

    /**
     * @return Optional. The Compute Engine config settings for worker instances in a cluster.
     * 
     */
    public InstanceGroupConfigResponse workerConfig() {
        return this.workerConfig;
    }

    private ClusterConfigResponse() {}

    private ClusterConfigResponse(ClusterConfigResponse $) {
        this.autoscalingConfig = $.autoscalingConfig;
        this.configBucket = $.configBucket;
        this.encryptionConfig = $.encryptionConfig;
        this.endpointConfig = $.endpointConfig;
        this.gceClusterConfig = $.gceClusterConfig;
        this.gkeClusterConfig = $.gkeClusterConfig;
        this.initializationActions = $.initializationActions;
        this.lifecycleConfig = $.lifecycleConfig;
        this.masterConfig = $.masterConfig;
        this.metastoreConfig = $.metastoreConfig;
        this.secondaryWorkerConfig = $.secondaryWorkerConfig;
        this.securityConfig = $.securityConfig;
        this.softwareConfig = $.softwareConfig;
        this.tempBucket = $.tempBucket;
        this.workerConfig = $.workerConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ClusterConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ClusterConfigResponse $;

        public Builder() {
            $ = new ClusterConfigResponse();
        }

        public Builder(ClusterConfigResponse defaults) {
            $ = new ClusterConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param autoscalingConfig Optional. Autoscaling config for the policy associated with the cluster. Cluster does not autoscale if this field is unset.
         * 
         * @return builder
         * 
         */
        public Builder autoscalingConfig(AutoscalingConfigResponse autoscalingConfig) {
            $.autoscalingConfig = autoscalingConfig;
            return this;
        }

        /**
         * @param configBucket Optional. A Cloud Storage bucket used to stage job dependencies, config files, and job driver console output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster&#39;s staging bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket (see Dataproc staging bucket (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This field requires a Cloud Storage bucket name, not a URI to a Cloud Storage bucket.
         * 
         * @return builder
         * 
         */
        public Builder configBucket(String configBucket) {
            $.configBucket = configBucket;
            return this;
        }

        /**
         * @param encryptionConfig Optional. Encryption settings for the cluster.
         * 
         * @return builder
         * 
         */
        public Builder encryptionConfig(EncryptionConfigResponse encryptionConfig) {
            $.encryptionConfig = encryptionConfig;
            return this;
        }

        /**
         * @param endpointConfig Optional. Port/endpoint configuration for this cluster
         * 
         * @return builder
         * 
         */
        public Builder endpointConfig(EndpointConfigResponse endpointConfig) {
            $.endpointConfig = endpointConfig;
            return this;
        }

        /**
         * @param gceClusterConfig Optional. The shared Compute Engine config settings for all instances in a cluster.
         * 
         * @return builder
         * 
         */
        public Builder gceClusterConfig(GceClusterConfigResponse gceClusterConfig) {
            $.gceClusterConfig = gceClusterConfig;
            return this;
        }

        /**
         * @param gkeClusterConfig Optional. The Kubernetes Engine config for Dataproc clusters deployed to Kubernetes. Setting this is considered mutually exclusive with Compute Engine-based options such as gce_cluster_config, master_config, worker_config, secondary_worker_config, and autoscaling_config.
         * 
         * @return builder
         * 
         */
        public Builder gkeClusterConfig(GkeClusterConfigResponse gkeClusterConfig) {
            $.gkeClusterConfig = gkeClusterConfig;
            return this;
        }

        /**
         * @param initializationActions Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node&#39;s role metadata to run an executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role) if [[ &#34;${ROLE}&#34; == &#39;Master&#39; ]]; then ... master specific actions ... else ... worker specific actions ... fi
         * 
         * @return builder
         * 
         */
        public Builder initializationActions(List<NodeInitializationActionResponse> initializationActions) {
            $.initializationActions = initializationActions;
            return this;
        }

        /**
         * @param initializationActions Optional. Commands to execute on each node after config is completed. By default, executables are run on master and all worker nodes. You can test a node&#39;s role metadata to run an executable on a master or worker node, as shown below using curl (you can also use wget): ROLE=$(curl -H Metadata-Flavor:Google http://metadata/computeMetadata/v1beta2/instance/attributes/dataproc-role) if [[ &#34;${ROLE}&#34; == &#39;Master&#39; ]]; then ... master specific actions ... else ... worker specific actions ... fi
         * 
         * @return builder
         * 
         */
        public Builder initializationActions(NodeInitializationActionResponse... initializationActions) {
            return initializationActions(List.of(initializationActions));
        }

        /**
         * @param lifecycleConfig Optional. The config setting for auto delete cluster schedule.
         * 
         * @return builder
         * 
         */
        public Builder lifecycleConfig(LifecycleConfigResponse lifecycleConfig) {
            $.lifecycleConfig = lifecycleConfig;
            return this;
        }

        /**
         * @param masterConfig Optional. The Compute Engine config settings for the master instance in a cluster.
         * 
         * @return builder
         * 
         */
        public Builder masterConfig(InstanceGroupConfigResponse masterConfig) {
            $.masterConfig = masterConfig;
            return this;
        }

        /**
         * @param metastoreConfig Optional. Metastore configuration.
         * 
         * @return builder
         * 
         */
        public Builder metastoreConfig(MetastoreConfigResponse metastoreConfig) {
            $.metastoreConfig = metastoreConfig;
            return this;
        }

        /**
         * @param secondaryWorkerConfig Optional. The Compute Engine config settings for additional worker instances in a cluster.
         * 
         * @return builder
         * 
         */
        public Builder secondaryWorkerConfig(InstanceGroupConfigResponse secondaryWorkerConfig) {
            $.secondaryWorkerConfig = secondaryWorkerConfig;
            return this;
        }

        /**
         * @param securityConfig Optional. Security related configuration.
         * 
         * @return builder
         * 
         */
        public Builder securityConfig(SecurityConfigResponse securityConfig) {
            $.securityConfig = securityConfig;
            return this;
        }

        /**
         * @param softwareConfig Optional. The config settings for software inside the cluster.
         * 
         * @return builder
         * 
         */
        public Builder softwareConfig(SoftwareConfigResponse softwareConfig) {
            $.softwareConfig = softwareConfig;
            return this;
        }

        /**
         * @param tempBucket Optional. A Cloud Storage bucket used to store ephemeral cluster and jobs data, such as Spark and MapReduce history files. If you do not specify a temp bucket, Dataproc will determine a Cloud Storage location (US, ASIA, or EU) for your cluster&#39;s temp bucket according to the Compute Engine zone where your cluster is deployed, and then create and manage this project-level, per-location bucket. The default bucket has a TTL of 90 days, but you can use any TTL (or none) if you specify a bucket. This field requires a Cloud Storage bucket name, not a URI to a Cloud Storage bucket.
         * 
         * @return builder
         * 
         */
        public Builder tempBucket(String tempBucket) {
            $.tempBucket = tempBucket;
            return this;
        }

        /**
         * @param workerConfig Optional. The Compute Engine config settings for worker instances in a cluster.
         * 
         * @return builder
         * 
         */
        public Builder workerConfig(InstanceGroupConfigResponse workerConfig) {
            $.workerConfig = workerConfig;
            return this;
        }

        public ClusterConfigResponse build() {
            $.autoscalingConfig = Objects.requireNonNull($.autoscalingConfig, "expected parameter 'autoscalingConfig' to be non-null");
            $.configBucket = Objects.requireNonNull($.configBucket, "expected parameter 'configBucket' to be non-null");
            $.encryptionConfig = Objects.requireNonNull($.encryptionConfig, "expected parameter 'encryptionConfig' to be non-null");
            $.endpointConfig = Objects.requireNonNull($.endpointConfig, "expected parameter 'endpointConfig' to be non-null");
            $.gceClusterConfig = Objects.requireNonNull($.gceClusterConfig, "expected parameter 'gceClusterConfig' to be non-null");
            $.gkeClusterConfig = Objects.requireNonNull($.gkeClusterConfig, "expected parameter 'gkeClusterConfig' to be non-null");
            $.initializationActions = Objects.requireNonNull($.initializationActions, "expected parameter 'initializationActions' to be non-null");
            $.lifecycleConfig = Objects.requireNonNull($.lifecycleConfig, "expected parameter 'lifecycleConfig' to be non-null");
            $.masterConfig = Objects.requireNonNull($.masterConfig, "expected parameter 'masterConfig' to be non-null");
            $.metastoreConfig = Objects.requireNonNull($.metastoreConfig, "expected parameter 'metastoreConfig' to be non-null");
            $.secondaryWorkerConfig = Objects.requireNonNull($.secondaryWorkerConfig, "expected parameter 'secondaryWorkerConfig' to be non-null");
            $.securityConfig = Objects.requireNonNull($.securityConfig, "expected parameter 'securityConfig' to be non-null");
            $.softwareConfig = Objects.requireNonNull($.softwareConfig, "expected parameter 'softwareConfig' to be non-null");
            $.tempBucket = Objects.requireNonNull($.tempBucket, "expected parameter 'tempBucket' to be non-null");
            $.workerConfig = Objects.requireNonNull($.workerConfig, "expected parameter 'workerConfig' to be non-null");
            return $;
        }
    }

}
