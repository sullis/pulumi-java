// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.outputs;

import io.pulumi.azurenative.servicefabric.outputs.ArmServiceTypeHealthPolicyResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ArmApplicationHealthPolicyResponse {
    /**
     * Indicates whether warnings are treated with the same severity as errors.
     * 
     */
    private final @Nullable Boolean considerWarningAsError;
    /**
     * The health policy used by default to evaluate the health of a service type.
     * 
     */
    private final @Nullable ArmServiceTypeHealthPolicyResponse defaultServiceTypeHealthPolicy;
    /**
     * The maximum allowed percentage of unhealthy deployed applications. Allowed values are Byte values from zero to 100.
     * The percentage represents the maximum tolerated percentage of deployed applications that can be unhealthy before the application is considered in error.
     * This is calculated by dividing the number of unhealthy deployed applications over the number of nodes where the application is currently deployed on in the cluster.
     * The computation rounds up to tolerate one failure on small numbers of nodes. Default percentage is zero.
     * 
     */
    private final @Nullable Integer maxPercentUnhealthyDeployedApplications;
    /**
     * The map with service type health policy per service type name. The map is empty by default.
     * 
     */
    private final @Nullable Map<String,ArmServiceTypeHealthPolicyResponse> serviceTypeHealthPolicyMap;

    @OutputCustomType.Constructor({"considerWarningAsError","defaultServiceTypeHealthPolicy","maxPercentUnhealthyDeployedApplications","serviceTypeHealthPolicyMap"})
    private ArmApplicationHealthPolicyResponse(
        @Nullable Boolean considerWarningAsError,
        @Nullable ArmServiceTypeHealthPolicyResponse defaultServiceTypeHealthPolicy,
        @Nullable Integer maxPercentUnhealthyDeployedApplications,
        @Nullable Map<String,ArmServiceTypeHealthPolicyResponse> serviceTypeHealthPolicyMap) {
        this.considerWarningAsError = considerWarningAsError;
        this.defaultServiceTypeHealthPolicy = defaultServiceTypeHealthPolicy;
        this.maxPercentUnhealthyDeployedApplications = maxPercentUnhealthyDeployedApplications;
        this.serviceTypeHealthPolicyMap = serviceTypeHealthPolicyMap;
    }

    /**
     * Indicates whether warnings are treated with the same severity as errors.
     * 
     */
    public Optional<Boolean> getConsiderWarningAsError() {
        return Optional.ofNullable(this.considerWarningAsError);
    }
    /**
     * The health policy used by default to evaluate the health of a service type.
     * 
     */
    public Optional<ArmServiceTypeHealthPolicyResponse> getDefaultServiceTypeHealthPolicy() {
        return Optional.ofNullable(this.defaultServiceTypeHealthPolicy);
    }
    /**
     * The maximum allowed percentage of unhealthy deployed applications. Allowed values are Byte values from zero to 100.
     * The percentage represents the maximum tolerated percentage of deployed applications that can be unhealthy before the application is considered in error.
     * This is calculated by dividing the number of unhealthy deployed applications over the number of nodes where the application is currently deployed on in the cluster.
     * The computation rounds up to tolerate one failure on small numbers of nodes. Default percentage is zero.
     * 
     */
    public Optional<Integer> getMaxPercentUnhealthyDeployedApplications() {
        return Optional.ofNullable(this.maxPercentUnhealthyDeployedApplications);
    }
    /**
     * The map with service type health policy per service type name. The map is empty by default.
     * 
     */
    public Map<String,ArmServiceTypeHealthPolicyResponse> getServiceTypeHealthPolicyMap() {
        return this.serviceTypeHealthPolicyMap == null ? Map.of() : this.serviceTypeHealthPolicyMap;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArmApplicationHealthPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean considerWarningAsError;
        private @Nullable ArmServiceTypeHealthPolicyResponse defaultServiceTypeHealthPolicy;
        private @Nullable Integer maxPercentUnhealthyDeployedApplications;
        private @Nullable Map<String,ArmServiceTypeHealthPolicyResponse> serviceTypeHealthPolicyMap;

        public Builder() {
    	      // Empty
        }

        public Builder(ArmApplicationHealthPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.considerWarningAsError = defaults.considerWarningAsError;
    	      this.defaultServiceTypeHealthPolicy = defaults.defaultServiceTypeHealthPolicy;
    	      this.maxPercentUnhealthyDeployedApplications = defaults.maxPercentUnhealthyDeployedApplications;
    	      this.serviceTypeHealthPolicyMap = defaults.serviceTypeHealthPolicyMap;
        }

        public Builder setConsiderWarningAsError(@Nullable Boolean considerWarningAsError) {
            this.considerWarningAsError = considerWarningAsError;
            return this;
        }

        public Builder setDefaultServiceTypeHealthPolicy(@Nullable ArmServiceTypeHealthPolicyResponse defaultServiceTypeHealthPolicy) {
            this.defaultServiceTypeHealthPolicy = defaultServiceTypeHealthPolicy;
            return this;
        }

        public Builder setMaxPercentUnhealthyDeployedApplications(@Nullable Integer maxPercentUnhealthyDeployedApplications) {
            this.maxPercentUnhealthyDeployedApplications = maxPercentUnhealthyDeployedApplications;
            return this;
        }

        public Builder setServiceTypeHealthPolicyMap(@Nullable Map<String,ArmServiceTypeHealthPolicyResponse> serviceTypeHealthPolicyMap) {
            this.serviceTypeHealthPolicyMap = serviceTypeHealthPolicyMap;
            return this;
        }

        public ArmApplicationHealthPolicyResponse build() {
            return new ArmApplicationHealthPolicyResponse(considerWarningAsError, defaultServiceTypeHealthPolicy, maxPercentUnhealthyDeployedApplications, serviceTypeHealthPolicyMap);
        }
    }
}
