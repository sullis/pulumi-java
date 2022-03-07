// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.azurenative.servicefabric.outputs.ApplicationDeltaHealthPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ClusterUpgradeDeltaHealthPolicyResponse {
    /**
     * Defines the application delta health policy map used to evaluate the health of an application or one of its child entities when upgrading the cluster.
     * 
     */
    private final @Nullable Map<String,ApplicationDeltaHealthPolicyResponse> applicationDeltaHealthPolicies;
    /**
     * The maximum allowed percentage of applications health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the applications at the beginning of upgrade and the state of the applications at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits. System services are not included in this.
     * 
     */
    private final Integer maxPercentDeltaUnhealthyApplications;
    /**
     * The maximum allowed percentage of nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the nodes at the beginning of upgrade and the state of the nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits.
     * 
     */
    private final Integer maxPercentDeltaUnhealthyNodes;
    /**
     * The maximum allowed percentage of upgrade domain nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the upgrade domain nodes at the beginning of upgrade and the state of the upgrade domain nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion for all completed upgrade domains to make sure the state of the upgrade domains is within tolerated limits.
     * 
     */
    private final Integer maxPercentUpgradeDomainDeltaUnhealthyNodes;

    @OutputCustomType.Constructor({"applicationDeltaHealthPolicies","maxPercentDeltaUnhealthyApplications","maxPercentDeltaUnhealthyNodes","maxPercentUpgradeDomainDeltaUnhealthyNodes"})
    private ClusterUpgradeDeltaHealthPolicyResponse(
        @Nullable Map<String,ApplicationDeltaHealthPolicyResponse> applicationDeltaHealthPolicies,
        Integer maxPercentDeltaUnhealthyApplications,
        Integer maxPercentDeltaUnhealthyNodes,
        Integer maxPercentUpgradeDomainDeltaUnhealthyNodes) {
        this.applicationDeltaHealthPolicies = applicationDeltaHealthPolicies;
        this.maxPercentDeltaUnhealthyApplications = Objects.requireNonNull(maxPercentDeltaUnhealthyApplications);
        this.maxPercentDeltaUnhealthyNodes = Objects.requireNonNull(maxPercentDeltaUnhealthyNodes);
        this.maxPercentUpgradeDomainDeltaUnhealthyNodes = Objects.requireNonNull(maxPercentUpgradeDomainDeltaUnhealthyNodes);
    }

    /**
     * Defines the application delta health policy map used to evaluate the health of an application or one of its child entities when upgrading the cluster.
     * 
    */
    public Map<String,ApplicationDeltaHealthPolicyResponse> getApplicationDeltaHealthPolicies() {
        return this.applicationDeltaHealthPolicies == null ? Map.of() : this.applicationDeltaHealthPolicies;
    }
    /**
     * The maximum allowed percentage of applications health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the applications at the beginning of upgrade and the state of the applications at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits. System services are not included in this.
     * 
    */
    public Integer getMaxPercentDeltaUnhealthyApplications() {
        return this.maxPercentDeltaUnhealthyApplications;
    }
    /**
     * The maximum allowed percentage of nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the nodes at the beginning of upgrade and the state of the nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion to make sure the global state of the cluster is within tolerated limits.
     * 
    */
    public Integer getMaxPercentDeltaUnhealthyNodes() {
        return this.maxPercentDeltaUnhealthyNodes;
    }
    /**
     * The maximum allowed percentage of upgrade domain nodes health degradation allowed during cluster upgrades.
     * The delta is measured between the state of the upgrade domain nodes at the beginning of upgrade and the state of the upgrade domain nodes at the time of the health evaluation.
     * The check is performed after every upgrade domain upgrade completion for all completed upgrade domains to make sure the state of the upgrade domains is within tolerated limits.
     * 
    */
    public Integer getMaxPercentUpgradeDomainDeltaUnhealthyNodes() {
        return this.maxPercentUpgradeDomainDeltaUnhealthyNodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterUpgradeDeltaHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,ApplicationDeltaHealthPolicyResponse> applicationDeltaHealthPolicies;
        private Integer maxPercentDeltaUnhealthyApplications;
        private Integer maxPercentDeltaUnhealthyNodes;
        private Integer maxPercentUpgradeDomainDeltaUnhealthyNodes;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterUpgradeDeltaHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationDeltaHealthPolicies = defaults.applicationDeltaHealthPolicies;
    	      this.maxPercentDeltaUnhealthyApplications = defaults.maxPercentDeltaUnhealthyApplications;
    	      this.maxPercentDeltaUnhealthyNodes = defaults.maxPercentDeltaUnhealthyNodes;
    	      this.maxPercentUpgradeDomainDeltaUnhealthyNodes = defaults.maxPercentUpgradeDomainDeltaUnhealthyNodes;
        }

        public Builder setApplicationDeltaHealthPolicies(@Nullable Map<String,ApplicationDeltaHealthPolicyResponse> applicationDeltaHealthPolicies) {
            this.applicationDeltaHealthPolicies = applicationDeltaHealthPolicies;
            return this;
        }

        public Builder setMaxPercentDeltaUnhealthyApplications(Integer maxPercentDeltaUnhealthyApplications) {
            this.maxPercentDeltaUnhealthyApplications = Objects.requireNonNull(maxPercentDeltaUnhealthyApplications);
            return this;
        }

        public Builder setMaxPercentDeltaUnhealthyNodes(Integer maxPercentDeltaUnhealthyNodes) {
            this.maxPercentDeltaUnhealthyNodes = Objects.requireNonNull(maxPercentDeltaUnhealthyNodes);
            return this;
        }

        public Builder setMaxPercentUpgradeDomainDeltaUnhealthyNodes(Integer maxPercentUpgradeDomainDeltaUnhealthyNodes) {
            this.maxPercentUpgradeDomainDeltaUnhealthyNodes = Objects.requireNonNull(maxPercentUpgradeDomainDeltaUnhealthyNodes);
            return this;
        }
        public ClusterUpgradeDeltaHealthPolicyResponse build() {
            return new ClusterUpgradeDeltaHealthPolicyResponse(applicationDeltaHealthPolicies, maxPercentDeltaUnhealthyApplications, maxPercentDeltaUnhealthyNodes, maxPercentUpgradeDomainDeltaUnhealthyNodes);
        }
    }
}