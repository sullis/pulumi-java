// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Dataproc job config.
 * 
 */
public final class JobPlacementResponse extends io.pulumi.resources.InvokeArgs {

    public static final JobPlacementResponse Empty = new JobPlacementResponse();

    /**
     * Optional. Cluster labels to identify a cluster where the job will be submitted.
     * 
     */
    @InputImport(name="clusterLabels", required=true)
      private final Map<String,String> clusterLabels;

    public Map<String,String> getClusterLabels() {
        return this.clusterLabels;
    }

    /**
     * The name of the cluster where the job will be submitted.
     * 
     */
    @InputImport(name="clusterName", required=true)
      private final String clusterName;

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * A cluster UUID generated by the Dataproc service when the job is submitted.
     * 
     */
    @InputImport(name="clusterUuid", required=true)
      private final String clusterUuid;

    public String getClusterUuid() {
        return this.clusterUuid;
    }

    public JobPlacementResponse(
        Map<String,String> clusterLabels,
        String clusterName,
        String clusterUuid) {
        this.clusterLabels = Objects.requireNonNull(clusterLabels, "expected parameter 'clusterLabels' to be non-null");
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.clusterUuid = Objects.requireNonNull(clusterUuid, "expected parameter 'clusterUuid' to be non-null");
    }

    private JobPlacementResponse() {
        this.clusterLabels = Map.of();
        this.clusterName = null;
        this.clusterUuid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobPlacementResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> clusterLabels;
        private String clusterName;
        private String clusterUuid;

        public Builder() {
    	      // Empty
        }

        public Builder(JobPlacementResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterLabels = defaults.clusterLabels;
    	      this.clusterName = defaults.clusterName;
    	      this.clusterUuid = defaults.clusterUuid;
        }

        public Builder setClusterLabels(Map<String,String> clusterLabels) {
            this.clusterLabels = Objects.requireNonNull(clusterLabels);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterUuid(String clusterUuid) {
            this.clusterUuid = Objects.requireNonNull(clusterUuid);
            return this;
        }
        public JobPlacementResponse build() {
            return new JobPlacementResponse(clusterLabels, clusterName, clusterUuid);
        }
    }
}