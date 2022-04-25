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
import java.util.Optional;
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
    private @Nullable Output<Integer> agentCount;

    /**
     * @return The number of agent nodes in the Container Service. This can be changed to scale the cluster.
     * 
     */
    public Optional<Output<Integer>> agentCount() {
        return Optional.ofNullable(this.agentCount);
    }

    /**
     * The Azure VM size of the agent VM nodes. This cannot be changed once the cluster is created. This list is non exhaustive; refer to https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes for the possible VM sizes.
     * 
     */
    @Import(name="agentVmSize")
    private @Nullable Output<Either<String,AgentVMSizeTypes>> agentVmSize;

    /**
     * @return The Azure VM size of the agent VM nodes. This cannot be changed once the cluster is created. This list is non exhaustive; refer to https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes for the possible VM sizes.
     * 
     */
    public Optional<Output<Either<String,AgentVMSizeTypes>>> agentVmSize() {
        return Optional.ofNullable(this.agentVmSize);
    }

    /**
     * The number of master nodes in the container service.
     * 
     */
    @Import(name="masterCount")
    private @Nullable Output<Integer> masterCount;

    /**
     * @return The number of master nodes in the container service.
     * 
     */
    public Optional<Output<Integer>> masterCount() {
        return Optional.ofNullable(this.masterCount);
    }

    /**
     * Orchestrator specific properties
     * 
     */
    @Import(name="orchestratorProperties")
    private @Nullable Output<KubernetesClusterPropertiesArgs> orchestratorProperties;

    /**
     * @return Orchestrator specific properties
     * 
     */
    public Optional<Output<KubernetesClusterPropertiesArgs>> orchestratorProperties() {
        return Optional.ofNullable(this.orchestratorProperties);
    }

    /**
     * Type of orchestrator. It cannot be changed once the cluster is created.
     * 
     */
    @Import(name="orchestratorType", required=true)
    private Output<Either<String,OrchestratorType>> orchestratorType;

    /**
     * @return Type of orchestrator. It cannot be changed once the cluster is created.
     * 
     */
    public Output<Either<String,OrchestratorType>> orchestratorType() {
        return this.orchestratorType;
    }

    /**
     * The system services deployed to the cluster
     * 
     */
    @Import(name="systemServices")
    private @Nullable Output<List<SystemServiceArgs>> systemServices;

    /**
     * @return The system services deployed to the cluster
     * 
     */
    public Optional<Output<List<SystemServiceArgs>>> systemServices() {
        return Optional.ofNullable(this.systemServices);
    }

    private AcsClusterPropertiesArgs() {}

    private AcsClusterPropertiesArgs(AcsClusterPropertiesArgs $) {
        this.agentCount = $.agentCount;
        this.agentVmSize = $.agentVmSize;
        this.masterCount = $.masterCount;
        this.orchestratorProperties = $.orchestratorProperties;
        this.orchestratorType = $.orchestratorType;
        this.systemServices = $.systemServices;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AcsClusterPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AcsClusterPropertiesArgs $;

        public Builder() {
            $ = new AcsClusterPropertiesArgs();
        }

        public Builder(AcsClusterPropertiesArgs defaults) {
            $ = new AcsClusterPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentCount The number of agent nodes in the Container Service. This can be changed to scale the cluster.
         * 
         * @return builder
         * 
         */
        public Builder agentCount(@Nullable Output<Integer> agentCount) {
            $.agentCount = agentCount;
            return this;
        }

        /**
         * @param agentCount The number of agent nodes in the Container Service. This can be changed to scale the cluster.
         * 
         * @return builder
         * 
         */
        public Builder agentCount(Integer agentCount) {
            return agentCount(Output.of(agentCount));
        }

        /**
         * @param agentVmSize The Azure VM size of the agent VM nodes. This cannot be changed once the cluster is created. This list is non exhaustive; refer to https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes for the possible VM sizes.
         * 
         * @return builder
         * 
         */
        public Builder agentVmSize(@Nullable Output<Either<String,AgentVMSizeTypes>> agentVmSize) {
            $.agentVmSize = agentVmSize;
            return this;
        }

        /**
         * @param agentVmSize The Azure VM size of the agent VM nodes. This cannot be changed once the cluster is created. This list is non exhaustive; refer to https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes for the possible VM sizes.
         * 
         * @return builder
         * 
         */
        public Builder agentVmSize(Either<String,AgentVMSizeTypes> agentVmSize) {
            return agentVmSize(Output.of(agentVmSize));
        }

        /**
         * @param agentVmSize The Azure VM size of the agent VM nodes. This cannot be changed once the cluster is created. This list is non exhaustive; refer to https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes for the possible VM sizes.
         * 
         * @return builder
         * 
         */
        public Builder agentVmSize(String agentVmSize) {
            return agentVmSize(Either.ofLeft(agentVmSize));
        }

        /**
         * @param agentVmSize The Azure VM size of the agent VM nodes. This cannot be changed once the cluster is created. This list is non exhaustive; refer to https://docs.microsoft.com/en-us/azure/virtual-machines/windows/sizes for the possible VM sizes.
         * 
         * @return builder
         * 
         */
        public Builder agentVmSize(AgentVMSizeTypes agentVmSize) {
            return agentVmSize(Either.ofRight(agentVmSize));
        }

        /**
         * @param masterCount The number of master nodes in the container service.
         * 
         * @return builder
         * 
         */
        public Builder masterCount(@Nullable Output<Integer> masterCount) {
            $.masterCount = masterCount;
            return this;
        }

        /**
         * @param masterCount The number of master nodes in the container service.
         * 
         * @return builder
         * 
         */
        public Builder masterCount(Integer masterCount) {
            return masterCount(Output.of(masterCount));
        }

        /**
         * @param orchestratorProperties Orchestrator specific properties
         * 
         * @return builder
         * 
         */
        public Builder orchestratorProperties(@Nullable Output<KubernetesClusterPropertiesArgs> orchestratorProperties) {
            $.orchestratorProperties = orchestratorProperties;
            return this;
        }

        /**
         * @param orchestratorProperties Orchestrator specific properties
         * 
         * @return builder
         * 
         */
        public Builder orchestratorProperties(KubernetesClusterPropertiesArgs orchestratorProperties) {
            return orchestratorProperties(Output.of(orchestratorProperties));
        }

        /**
         * @param orchestratorType Type of orchestrator. It cannot be changed once the cluster is created.
         * 
         * @return builder
         * 
         */
        public Builder orchestratorType(Output<Either<String,OrchestratorType>> orchestratorType) {
            $.orchestratorType = orchestratorType;
            return this;
        }

        /**
         * @param orchestratorType Type of orchestrator. It cannot be changed once the cluster is created.
         * 
         * @return builder
         * 
         */
        public Builder orchestratorType(Either<String,OrchestratorType> orchestratorType) {
            return orchestratorType(Output.of(orchestratorType));
        }

        /**
         * @param orchestratorType Type of orchestrator. It cannot be changed once the cluster is created.
         * 
         * @return builder
         * 
         */
        public Builder orchestratorType(String orchestratorType) {
            return orchestratorType(Either.ofLeft(orchestratorType));
        }

        /**
         * @param orchestratorType Type of orchestrator. It cannot be changed once the cluster is created.
         * 
         * @return builder
         * 
         */
        public Builder orchestratorType(OrchestratorType orchestratorType) {
            return orchestratorType(Either.ofRight(orchestratorType));
        }

        /**
         * @param systemServices The system services deployed to the cluster
         * 
         * @return builder
         * 
         */
        public Builder systemServices(@Nullable Output<List<SystemServiceArgs>> systemServices) {
            $.systemServices = systemServices;
            return this;
        }

        /**
         * @param systemServices The system services deployed to the cluster
         * 
         * @return builder
         * 
         */
        public Builder systemServices(List<SystemServiceArgs> systemServices) {
            return systemServices(Output.of(systemServices));
        }

        /**
         * @param systemServices The system services deployed to the cluster
         * 
         * @return builder
         * 
         */
        public Builder systemServices(SystemServiceArgs... systemServices) {
            return systemServices(List.of(systemServices));
        }

        public AcsClusterPropertiesArgs build() {
            $.agentCount = Codegen.integerProp("agentCount").output().arg($.agentCount).def(2).getNullable();
            $.agentVmSize = Codegen.stringProp("agentVmSize").left(AgentVMSizeTypes.class).output().arg($.agentVmSize).def("Standard_D3_v2").getNullable();
            $.masterCount = Codegen.integerProp("masterCount").output().arg($.masterCount).def(1).getNullable();
            $.orchestratorType = Objects.requireNonNull($.orchestratorType, "expected parameter 'orchestratorType' to be non-null");
            return $;
        }
    }

}
