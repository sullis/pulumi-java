// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ApplicationHealthPolicyResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a health policy used to evaluate the health of the cluster or of a cluster node.
 * 
 */
public final class ClusterHealthPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ClusterHealthPolicyResponse Empty = new ClusterHealthPolicyResponse();

    /**
     * Defines the application health policy map used to evaluate the health of an application or one of its children entities.
     * 
     */
    @InputImport(name="applicationHealthPolicies")
      private final @Nullable Map<String,ApplicationHealthPolicyResponse> applicationHealthPolicies;

    public Map<String,ApplicationHealthPolicyResponse> getApplicationHealthPolicies() {
        return this.applicationHealthPolicies == null ? Map.of() : this.applicationHealthPolicies;
    }

    /**
     * The maximum allowed percentage of unhealthy applications before reporting an error. For example, to allow 10% of applications to be unhealthy, this value would be 10.
     * 
     * The percentage represents the maximum tolerated percentage of applications that can be unhealthy before the cluster is considered in error.
     * If the percentage is respected but there is at least one unhealthy application, the health is evaluated as Warning.
     * This is calculated by dividing the number of unhealthy applications over the total number of application instances in the cluster, excluding applications of application types that are included in the ApplicationTypeHealthPolicyMap.
     * The computation rounds up to tolerate one failure on small numbers of applications. Default percentage is zero.
     * 
     */
    @InputImport(name="maxPercentUnhealthyApplications")
      private final @Nullable Integer maxPercentUnhealthyApplications;

    public Optional<Integer> getMaxPercentUnhealthyApplications() {
        return this.maxPercentUnhealthyApplications == null ? Optional.empty() : Optional.ofNullable(this.maxPercentUnhealthyApplications);
    }

    /**
     * The maximum allowed percentage of unhealthy nodes before reporting an error. For example, to allow 10% of nodes to be unhealthy, this value would be 10.
     * 
     * The percentage represents the maximum tolerated percentage of nodes that can be unhealthy before the cluster is considered in error.
     * If the percentage is respected but there is at least one unhealthy node, the health is evaluated as Warning.
     * The percentage is calculated by dividing the number of unhealthy nodes over the total number of nodes in the cluster.
     * The computation rounds up to tolerate one failure on small numbers of nodes. Default percentage is zero.
     * 
     * In large clusters, some nodes will always be down or out for repairs, so this percentage should be configured to tolerate that.
     * 
     */
    @InputImport(name="maxPercentUnhealthyNodes")
      private final @Nullable Integer maxPercentUnhealthyNodes;

    public Optional<Integer> getMaxPercentUnhealthyNodes() {
        return this.maxPercentUnhealthyNodes == null ? Optional.empty() : Optional.ofNullable(this.maxPercentUnhealthyNodes);
    }

    public ClusterHealthPolicyResponse(
        @Nullable Map<String,ApplicationHealthPolicyResponse> applicationHealthPolicies,
        @Nullable Integer maxPercentUnhealthyApplications,
        @Nullable Integer maxPercentUnhealthyNodes) {
        this.applicationHealthPolicies = applicationHealthPolicies;
        this.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications == null ? 0 : maxPercentUnhealthyApplications;
        this.maxPercentUnhealthyNodes = maxPercentUnhealthyNodes == null ? 0 : maxPercentUnhealthyNodes;
    }

    private ClusterHealthPolicyResponse() {
        this.applicationHealthPolicies = Map.of();
        this.maxPercentUnhealthyApplications = null;
        this.maxPercentUnhealthyNodes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,ApplicationHealthPolicyResponse> applicationHealthPolicies;
        private @Nullable Integer maxPercentUnhealthyApplications;
        private @Nullable Integer maxPercentUnhealthyNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationHealthPolicies = defaults.applicationHealthPolicies;
    	      this.maxPercentUnhealthyApplications = defaults.maxPercentUnhealthyApplications;
    	      this.maxPercentUnhealthyNodes = defaults.maxPercentUnhealthyNodes;
        }

        public Builder setApplicationHealthPolicies(@Nullable Map<String,ApplicationHealthPolicyResponse> applicationHealthPolicies) {
            this.applicationHealthPolicies = applicationHealthPolicies;
            return this;
        }

        public Builder setMaxPercentUnhealthyApplications(@Nullable Integer maxPercentUnhealthyApplications) {
            this.maxPercentUnhealthyApplications = maxPercentUnhealthyApplications;
            return this;
        }

        public Builder setMaxPercentUnhealthyNodes(@Nullable Integer maxPercentUnhealthyNodes) {
            this.maxPercentUnhealthyNodes = maxPercentUnhealthyNodes;
            return this;
        }
        public ClusterHealthPolicyResponse build() {
            return new ClusterHealthPolicyResponse(applicationHealthPolicies, maxPercentUnhealthyApplications, maxPercentUnhealthyNodes);
        }
    }
}