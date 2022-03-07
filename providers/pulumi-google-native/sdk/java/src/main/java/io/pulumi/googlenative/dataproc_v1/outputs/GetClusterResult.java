// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.dataproc_v1.outputs.ClusterConfigResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.ClusterMetricsResponse;
import io.pulumi.googlenative.dataproc_v1.outputs.ClusterStatusResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetClusterResult {
    /**
     * The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused.
     * 
     */
    private final String clusterName;
    /**
     * A cluster UUID (Unique Universal Identifier). Dataproc generates this value when it creates the cluster.
     * 
     */
    private final String clusterUuid;
    /**
     * Optional. The cluster config for a cluster of Compute Engine Instances. Note that Dataproc may set default values, and values may change when clusters are updated.
     * 
     */
    private final ClusterConfigResponse config;
    /**
     * Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Contains cluster daemon metrics such as HDFS and YARN stats.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
     */
    private final ClusterMetricsResponse metrics;
    /**
     * The Google Cloud Platform project ID that the cluster belongs to.
     * 
     */
    private final String project;
    /**
     * Cluster status.
     * 
     */
    private final ClusterStatusResponse status;
    /**
     * The previous cluster status.
     * 
     */
    private final List<ClusterStatusResponse> statusHistory;

    @OutputCustomType.Constructor({"clusterName","clusterUuid","config","labels","metrics","project","status","statusHistory"})
    private GetClusterResult(
        String clusterName,
        String clusterUuid,
        ClusterConfigResponse config,
        Map<String,String> labels,
        ClusterMetricsResponse metrics,
        String project,
        ClusterStatusResponse status,
        List<ClusterStatusResponse> statusHistory) {
        this.clusterName = Objects.requireNonNull(clusterName);
        this.clusterUuid = Objects.requireNonNull(clusterUuid);
        this.config = Objects.requireNonNull(config);
        this.labels = Objects.requireNonNull(labels);
        this.metrics = Objects.requireNonNull(metrics);
        this.project = Objects.requireNonNull(project);
        this.status = Objects.requireNonNull(status);
        this.statusHistory = Objects.requireNonNull(statusHistory);
    }

    /**
     * The cluster name. Cluster names within a project must be unique. Names of deleted clusters can be reused.
     * 
    */
    public String getClusterName() {
        return this.clusterName;
    }
    /**
     * A cluster UUID (Unique Universal Identifier). Dataproc generates this value when it creates the cluster.
     * 
    */
    public String getClusterUuid() {
        return this.clusterUuid;
    }
    /**
     * Optional. The cluster config for a cluster of Compute Engine Instances. Note that Dataproc may set default values, and values may change when clusters are updated.
     * 
    */
    public ClusterConfigResponse getConfig() {
        return this.config;
    }
    /**
     * Optional. The labels to associate with this cluster. Label keys must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). Label values may be empty, but, if present, must contain 1 to 63 characters, and must conform to RFC 1035 (https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be associated with a cluster.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Contains cluster daemon metrics such as HDFS and YARN stats.Beta Feature: This report is available for testing purposes only. It may be changed before final release.
     * 
    */
    public ClusterMetricsResponse getMetrics() {
        return this.metrics;
    }
    /**
     * The Google Cloud Platform project ID that the cluster belongs to.
     * 
    */
    public String getProject() {
        return this.project;
    }
    /**
     * Cluster status.
     * 
    */
    public ClusterStatusResponse getStatus() {
        return this.status;
    }
    /**
     * The previous cluster status.
     * 
    */
    public List<ClusterStatusResponse> getStatusHistory() {
        return this.statusHistory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String clusterName;
        private String clusterUuid;
        private ClusterConfigResponse config;
        private Map<String,String> labels;
        private ClusterMetricsResponse metrics;
        private String project;
        private ClusterStatusResponse status;
        private List<ClusterStatusResponse> statusHistory;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.clusterUuid = defaults.clusterUuid;
    	      this.config = defaults.config;
    	      this.labels = defaults.labels;
    	      this.metrics = defaults.metrics;
    	      this.project = defaults.project;
    	      this.status = defaults.status;
    	      this.statusHistory = defaults.statusHistory;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterUuid(String clusterUuid) {
            this.clusterUuid = Objects.requireNonNull(clusterUuid);
            return this;
        }

        public Builder setConfig(ClusterConfigResponse config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setMetrics(ClusterMetricsResponse metrics) {
            this.metrics = Objects.requireNonNull(metrics);
            return this;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setStatus(ClusterStatusResponse status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusHistory(List<ClusterStatusResponse> statusHistory) {
            this.statusHistory = Objects.requireNonNull(statusHistory);
            return this;
        }
        public GetClusterResult build() {
            return new GetClusterResult(clusterName, clusterUuid, config, labels, metrics, project, status, statusHistory);
        }
    }
}