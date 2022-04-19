// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningcompute.inputs;

import com.pulumi.azurenative.machinelearningcompute.enums.AgentVMSizeTypes;
import com.pulumi.azurenative.machinelearningcompute.enums.OrchestratorType;
import com.pulumi.azurenative.machinelearningcompute.inputs.KubernetesClusterPropertiesArgs;
import com.pulumi.azurenative.machinelearningcompute.inputs.SystemServiceArgs;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the container service backing the cluster
 * 
 */
public final class AcsClusterPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final AcsClusterPropertiesArgs Empty = new AcsClusterPropertiesArgs();

    /**
     * The number of agent nodes in the Container Service. This can be changed to scale the cluster.
     * 
     */
    @Import(name="agentCount")
      private final @Nullable Output<Integer> agentCount;

    public Output<Integer> agentCount() {
        return this.agentCount == null ? Codegen.empty() : this.agentCount;
    }

    /**
     * The Azure VM size of the agent VM nodes. This cannot be changed once the cluster is created. This list is non exhaustive; refer to https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes for the possible VM sizes.
     * 
     */
    @Import(name="agentVmSize")
      private final @Nullable Output<Either<String,AgentVMSizeTypes>> agentVmSize;

    public Output<Either<String,AgentVMSizeTypes>> agentVmSize() {
        return this.agentVmSize == null ? Codegen.empty() : this.agentVmSize;
    }

    /**
     * The number of master nodes in the container service.
     * 
     */
    @Import(name="masterCount")
      private final @Nullable Output<Integer> masterCount;

    public Output<Integer> masterCount() {
        return this.masterCount == null ? Codegen.empty() : this.masterCount;
    }

    /**
     * Orchestrator specific properties
     * 
     */
    @Import(name="orchestratorProperties")
      private final @Nullable Output<KubernetesClusterPropertiesArgs> orchestratorProperties;

    public Output<KubernetesClusterPropertiesArgs> orchestratorProperties() {
        return this.orchestratorProperties == null ? Codegen.empty() : this.orchestratorProperties;
    }

    /**
     * Type of orchestrator. It cannot be changed once the cluster is created.
     * 
     */
    @Import(name="orchestratorType", required=true)
      private final Output<Either<String,OrchestratorType>> orchestratorType;

    public Output<Either<String,OrchestratorType>> orchestratorType() {
        return this.orchestratorType;
    }

    /**
     * The system services deployed to the cluster
     * 
     */
    @Import(name="systemServices")
      private final @Nullable Output<List<SystemServiceArgs>> systemServices;

    public Output<List<SystemServiceArgs>> systemServices() {
        return this.systemServices == null ? Codegen.empty() : this.systemServices;
    }

    public AcsClusterPropertiesArgs(
        @Nullable Output<Integer> agentCount,
        @Nullable Output<Either<String,AgentVMSizeTypes>> agentVmSize,
        @Nullable Output<Integer> masterCount,
        @Nullable Output<KubernetesClusterPropertiesArgs> orchestratorProperties,
        Output<Either<String,OrchestratorType>> orchestratorType,
        @Nullable Output<List<SystemServiceArgs>> systemServices) {
        this.agentCount = Codegen.integerProp("agentCount").output().arg(agentCount).def(2).getNullable();
        this.agentVmSize = Codegen.stringProp("agentVmSize").left(AgentVMSizeTypes.class).output().arg(agentVmSize).def("Standard_D3_v2").getNullable();
        this.masterCount = Codegen.integerProp("masterCount").output().arg(masterCount).def(1).getNullable();
        this.orchestratorProperties = orchestratorProperties;
        this.orchestratorType = Objects.requireNonNull(orchestratorType, "expected parameter 'orchestratorType' to be non-null");
        this.systemServices = systemServices;
    }

    private AcsClusterPropertiesArgs() {
        this.agentCount = Codegen.empty();
        this.agentVmSize = Codegen.empty();
        this.masterCount = Codegen.empty();
        this.orchestratorProperties = Codegen.empty();
        this.orchestratorType = Codegen.empty();
        this.systemServices = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcsClusterPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> agentCount;
        private @Nullable Output<Either<String,AgentVMSizeTypes>> agentVmSize;
        private @Nullable Output<Integer> masterCount;
        private @Nullable Output<KubernetesClusterPropertiesArgs> orchestratorProperties;
        private Output<Either<String,OrchestratorType>> orchestratorType;
        private @Nullable Output<List<SystemServiceArgs>> systemServices;

        public Builder() {
    	      // Empty
        }

        public Builder(AcsClusterPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentCount = defaults.agentCount;
    	      this.agentVmSize = defaults.agentVmSize;
    	      this.masterCount = defaults.masterCount;
    	      this.orchestratorProperties = defaults.orchestratorProperties;
    	      this.orchestratorType = defaults.orchestratorType;
    	      this.systemServices = defaults.systemServices;
        }

        public Builder agentCount(@Nullable Output<Integer> agentCount) {
            this.agentCount = agentCount;
            return this;
        }
        public Builder agentCount(@Nullable Integer agentCount) {
            this.agentCount = Codegen.ofNullable(agentCount);
            return this;
        }
        public Builder agentVmSize(@Nullable Output<Either<String,AgentVMSizeTypes>> agentVmSize) {
            this.agentVmSize = agentVmSize;
            return this;
        }
        public Builder agentVmSize(@Nullable Either<String,AgentVMSizeTypes> agentVmSize) {
            this.agentVmSize = Codegen.ofNullable(agentVmSize);
            return this;
        }
        public Builder masterCount(@Nullable Output<Integer> masterCount) {
            this.masterCount = masterCount;
            return this;
        }
        public Builder masterCount(@Nullable Integer masterCount) {
            this.masterCount = Codegen.ofNullable(masterCount);
            return this;
        }
        public Builder orchestratorProperties(@Nullable Output<KubernetesClusterPropertiesArgs> orchestratorProperties) {
            this.orchestratorProperties = orchestratorProperties;
            return this;
        }
        public Builder orchestratorProperties(@Nullable KubernetesClusterPropertiesArgs orchestratorProperties) {
            this.orchestratorProperties = Codegen.ofNullable(orchestratorProperties);
            return this;
        }
        public Builder orchestratorType(Output<Either<String,OrchestratorType>> orchestratorType) {
            this.orchestratorType = Objects.requireNonNull(orchestratorType);
            return this;
        }
        public Builder orchestratorType(Either<String,OrchestratorType> orchestratorType) {
            this.orchestratorType = Output.of(Objects.requireNonNull(orchestratorType));
            return this;
        }
        public Builder systemServices(@Nullable Output<List<SystemServiceArgs>> systemServices) {
            this.systemServices = systemServices;
            return this;
        }
        public Builder systemServices(@Nullable List<SystemServiceArgs> systemServices) {
            this.systemServices = Codegen.ofNullable(systemServices);
            return this;
        }
        public Builder systemServices(SystemServiceArgs... systemServices) {
            return systemServices(List.of(systemServices));
        }        public AcsClusterPropertiesArgs build() {
            return new AcsClusterPropertiesArgs(agentCount, agentVmSize, masterCount, orchestratorProperties, orchestratorType, systemServices);
        }
    }
}
