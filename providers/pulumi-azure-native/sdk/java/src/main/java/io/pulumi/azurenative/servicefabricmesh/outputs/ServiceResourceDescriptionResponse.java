// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.AutoScalingPolicyResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.ContainerCodePackagePropertiesResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.DiagnosticsRefResponse;
import io.pulumi.azurenative.servicefabricmesh.outputs.NetworkRefResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ServiceResourceDescriptionResponse {
    /**
     * Auto scaling policies
     * 
     */
    private final @Nullable List<AutoScalingPolicyResponse> autoScalingPolicies;
    /**
     * Describes the set of code packages that forms the service. A code package describes the container and the properties for running it. All the code packages are started together on the same host and share the same context (network, process etc.).
     * 
     */
    private final List<ContainerCodePackagePropertiesResponse> codePackages;
    /**
     * User readable description of the service.
     * 
     */
    private final @Nullable String description;
    /**
     * Reference to sinks in DiagnosticsDescription.
     * 
     */
    private final @Nullable DiagnosticsRefResponse diagnostics;
    /**
     * Describes the health state of an application resource.
     * 
     */
    private final String healthState;
    /**
     * Fully qualified identifier for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The name of the resource
     * 
     */
    private final @Nullable String name;
    /**
     * The names of the private networks that this service needs to be part of.
     * 
     */
    private final @Nullable List<NetworkRefResponse> networkRefs;
    /**
     * The operation system required by the code in service.
     * 
     */
    private final String osType;
    /**
     * State of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The number of replicas of the service to create. Defaults to 1 if not specified.
     * 
     */
    private final @Nullable Integer replicaCount;
    /**
     * Status of the service.
     * 
     */
    private final String status;
    /**
     * Gives additional information about the current status of the service.
     * 
     */
    private final String statusDetails;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;
    /**
     * When the service's health state is not 'Ok', this additional details from service fabric Health Manager for the user to know why the service is marked unhealthy.
     * 
     */
    private final String unhealthyEvaluation;

    @OutputCustomType.Constructor({"autoScalingPolicies","codePackages","description","diagnostics","healthState","id","name","networkRefs","osType","provisioningState","replicaCount","status","statusDetails","type","unhealthyEvaluation"})
    private ServiceResourceDescriptionResponse(
        @Nullable List<AutoScalingPolicyResponse> autoScalingPolicies,
        List<ContainerCodePackagePropertiesResponse> codePackages,
        @Nullable String description,
        @Nullable DiagnosticsRefResponse diagnostics,
        String healthState,
        String id,
        @Nullable String name,
        @Nullable List<NetworkRefResponse> networkRefs,
        String osType,
        String provisioningState,
        @Nullable Integer replicaCount,
        String status,
        String statusDetails,
        String type,
        String unhealthyEvaluation) {
        this.autoScalingPolicies = autoScalingPolicies;
        this.codePackages = Objects.requireNonNull(codePackages);
        this.description = description;
        this.diagnostics = diagnostics;
        this.healthState = Objects.requireNonNull(healthState);
        this.id = Objects.requireNonNull(id);
        this.name = name;
        this.networkRefs = networkRefs;
        this.osType = Objects.requireNonNull(osType);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.replicaCount = replicaCount;
        this.status = Objects.requireNonNull(status);
        this.statusDetails = Objects.requireNonNull(statusDetails);
        this.type = Objects.requireNonNull(type);
        this.unhealthyEvaluation = Objects.requireNonNull(unhealthyEvaluation);
    }

    /**
     * Auto scaling policies
     * 
     */
    public List<AutoScalingPolicyResponse> getAutoScalingPolicies() {
        return this.autoScalingPolicies == null ? List.of() : this.autoScalingPolicies;
    }
    /**
     * Describes the set of code packages that forms the service. A code package describes the container and the properties for running it. All the code packages are started together on the same host and share the same context (network, process etc.).
     * 
     */
    public List<ContainerCodePackagePropertiesResponse> getCodePackages() {
        return this.codePackages;
    }
    /**
     * User readable description of the service.
     * 
     */
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    /**
     * Reference to sinks in DiagnosticsDescription.
     * 
     */
    public Optional<DiagnosticsRefResponse> getDiagnostics() {
        return Optional.ofNullable(this.diagnostics);
    }
    /**
     * Describes the health state of an application resource.
     * 
     */
    public String getHealthState() {
        return this.healthState;
    }
    /**
     * Fully qualified identifier for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The name of the resource
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The names of the private networks that this service needs to be part of.
     * 
     */
    public List<NetworkRefResponse> getNetworkRefs() {
        return this.networkRefs == null ? List.of() : this.networkRefs;
    }
    /**
     * The operation system required by the code in service.
     * 
     */
    public String getOsType() {
        return this.osType;
    }
    /**
     * State of the resource.
     * 
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The number of replicas of the service to create. Defaults to 1 if not specified.
     * 
     */
    public Optional<Integer> getReplicaCount() {
        return Optional.ofNullable(this.replicaCount);
    }
    /**
     * Status of the service.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * Gives additional information about the current status of the service.
     * 
     */
    public String getStatusDetails() {
        return this.statusDetails;
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    public String getType() {
        return this.type;
    }
    /**
     * When the service's health state is not 'Ok', this additional details from service fabric Health Manager for the user to know why the service is marked unhealthy.
     * 
     */
    public String getUnhealthyEvaluation() {
        return this.unhealthyEvaluation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceResourceDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<AutoScalingPolicyResponse> autoScalingPolicies;
        private List<ContainerCodePackagePropertiesResponse> codePackages;
        private @Nullable String description;
        private @Nullable DiagnosticsRefResponse diagnostics;
        private String healthState;
        private String id;
        private @Nullable String name;
        private @Nullable List<NetworkRefResponse> networkRefs;
        private String osType;
        private String provisioningState;
        private @Nullable Integer replicaCount;
        private String status;
        private String statusDetails;
        private String type;
        private String unhealthyEvaluation;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceResourceDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoScalingPolicies = defaults.autoScalingPolicies;
    	      this.codePackages = defaults.codePackages;
    	      this.description = defaults.description;
    	      this.diagnostics = defaults.diagnostics;
    	      this.healthState = defaults.healthState;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.networkRefs = defaults.networkRefs;
    	      this.osType = defaults.osType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.replicaCount = defaults.replicaCount;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
    	      this.type = defaults.type;
    	      this.unhealthyEvaluation = defaults.unhealthyEvaluation;
        }

        public Builder setAutoScalingPolicies(@Nullable List<AutoScalingPolicyResponse> autoScalingPolicies) {
            this.autoScalingPolicies = autoScalingPolicies;
            return this;
        }

        public Builder setCodePackages(List<ContainerCodePackagePropertiesResponse> codePackages) {
            this.codePackages = Objects.requireNonNull(codePackages);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDiagnostics(@Nullable DiagnosticsRefResponse diagnostics) {
            this.diagnostics = diagnostics;
            return this;
        }

        public Builder setHealthState(String healthState) {
            this.healthState = Objects.requireNonNull(healthState);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setNetworkRefs(@Nullable List<NetworkRefResponse> networkRefs) {
            this.networkRefs = networkRefs;
            return this;
        }

        public Builder setOsType(String osType) {
            this.osType = Objects.requireNonNull(osType);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setReplicaCount(@Nullable Integer replicaCount) {
            this.replicaCount = replicaCount;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusDetails(String statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUnhealthyEvaluation(String unhealthyEvaluation) {
            this.unhealthyEvaluation = Objects.requireNonNull(unhealthyEvaluation);
            return this;
        }

        public ServiceResourceDescriptionResponse build() {
            return new ServiceResourceDescriptionResponse(autoScalingPolicies, codePackages, description, diagnostics, healthState, id, name, networkRefs, osType, provisioningState, replicaCount, status, statusDetails, type, unhealthyEvaluation);
        }
    }
}
