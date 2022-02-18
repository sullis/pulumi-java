// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.AgentDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.DraDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.ProcessServerDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.PushInstallerDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.RcmProxyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.ReplicationAgentDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.ReprotectAgentDetailsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class InMageRcmFabricSpecificDetailsResponse {
    /**
     * The list of agent details.
     * 
     */
    private final List<AgentDetailsResponse> agentDetails;
    /**
     * The control plane Uri.
     * 
     */
    private final String controlPlaneUri;
    /**
     * The data plane Uri.
     * 
     */
    private final String dataPlaneUri;
    /**
     * The list of DRAs.
     * 
     */
    private final List<DraDetailsResponse> dras;
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'InMageRcm'.
     * 
     */
    private final String instanceType;
    /**
     * The ARM Id of the physical site.
     * 
     */
    private final String physicalSiteId;
    /**
     * The list of process servers.
     * 
     */
    private final List<ProcessServerDetailsResponse> processServers;
    /**
     * The list of push installers.
     * 
     */
    private final List<PushInstallerDetailsResponse> pushInstallers;
    /**
     * The list of RCM proxies.
     * 
     */
    private final List<RcmProxyDetailsResponse> rcmProxies;
    /**
     * The list of replication agents.
     * 
     */
    private final List<ReplicationAgentDetailsResponse> replicationAgents;
    /**
     * The list of reprotect agents.
     * 
     */
    private final List<ReprotectAgentDetailsResponse> reprotectAgents;
    /**
     * The service container Id.
     * 
     */
    private final String serviceContainerId;
    /**
     * The service endpoint.
     * 
     */
    private final String serviceEndpoint;
    /**
     * The service resource Id.
     * 
     */
    private final String serviceResourceId;
    /**
     * The ARM Id of the VMware site.
     * 
     */
    private final String vmwareSiteId;

    @OutputCustomType.Constructor({"agentDetails","controlPlaneUri","dataPlaneUri","dras","instanceType","physicalSiteId","processServers","pushInstallers","rcmProxies","replicationAgents","reprotectAgents","serviceContainerId","serviceEndpoint","serviceResourceId","vmwareSiteId"})
    private InMageRcmFabricSpecificDetailsResponse(
        List<AgentDetailsResponse> agentDetails,
        String controlPlaneUri,
        String dataPlaneUri,
        List<DraDetailsResponse> dras,
        String instanceType,
        String physicalSiteId,
        List<ProcessServerDetailsResponse> processServers,
        List<PushInstallerDetailsResponse> pushInstallers,
        List<RcmProxyDetailsResponse> rcmProxies,
        List<ReplicationAgentDetailsResponse> replicationAgents,
        List<ReprotectAgentDetailsResponse> reprotectAgents,
        String serviceContainerId,
        String serviceEndpoint,
        String serviceResourceId,
        String vmwareSiteId) {
        this.agentDetails = Objects.requireNonNull(agentDetails);
        this.controlPlaneUri = Objects.requireNonNull(controlPlaneUri);
        this.dataPlaneUri = Objects.requireNonNull(dataPlaneUri);
        this.dras = Objects.requireNonNull(dras);
        this.instanceType = Objects.requireNonNull(instanceType);
        this.physicalSiteId = Objects.requireNonNull(physicalSiteId);
        this.processServers = Objects.requireNonNull(processServers);
        this.pushInstallers = Objects.requireNonNull(pushInstallers);
        this.rcmProxies = Objects.requireNonNull(rcmProxies);
        this.replicationAgents = Objects.requireNonNull(replicationAgents);
        this.reprotectAgents = Objects.requireNonNull(reprotectAgents);
        this.serviceContainerId = Objects.requireNonNull(serviceContainerId);
        this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint);
        this.serviceResourceId = Objects.requireNonNull(serviceResourceId);
        this.vmwareSiteId = Objects.requireNonNull(vmwareSiteId);
    }

    /**
     * The list of agent details.
     * 
     */
    public List<AgentDetailsResponse> getAgentDetails() {
        return this.agentDetails;
    }
    /**
     * The control plane Uri.
     * 
     */
    public String getControlPlaneUri() {
        return this.controlPlaneUri;
    }
    /**
     * The data plane Uri.
     * 
     */
    public String getDataPlaneUri() {
        return this.dataPlaneUri;
    }
    /**
     * The list of DRAs.
     * 
     */
    public List<DraDetailsResponse> getDras() {
        return this.dras;
    }
    /**
     * Gets the class type. Overridden in derived classes.
     * Expected value is 'InMageRcm'.
     * 
     */
    public String getInstanceType() {
        return this.instanceType;
    }
    /**
     * The ARM Id of the physical site.
     * 
     */
    public String getPhysicalSiteId() {
        return this.physicalSiteId;
    }
    /**
     * The list of process servers.
     * 
     */
    public List<ProcessServerDetailsResponse> getProcessServers() {
        return this.processServers;
    }
    /**
     * The list of push installers.
     * 
     */
    public List<PushInstallerDetailsResponse> getPushInstallers() {
        return this.pushInstallers;
    }
    /**
     * The list of RCM proxies.
     * 
     */
    public List<RcmProxyDetailsResponse> getRcmProxies() {
        return this.rcmProxies;
    }
    /**
     * The list of replication agents.
     * 
     */
    public List<ReplicationAgentDetailsResponse> getReplicationAgents() {
        return this.replicationAgents;
    }
    /**
     * The list of reprotect agents.
     * 
     */
    public List<ReprotectAgentDetailsResponse> getReprotectAgents() {
        return this.reprotectAgents;
    }
    /**
     * The service container Id.
     * 
     */
    public String getServiceContainerId() {
        return this.serviceContainerId;
    }
    /**
     * The service endpoint.
     * 
     */
    public String getServiceEndpoint() {
        return this.serviceEndpoint;
    }
    /**
     * The service resource Id.
     * 
     */
    public String getServiceResourceId() {
        return this.serviceResourceId;
    }
    /**
     * The ARM Id of the VMware site.
     * 
     */
    public String getVmwareSiteId() {
        return this.vmwareSiteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmFabricSpecificDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AgentDetailsResponse> agentDetails;
        private String controlPlaneUri;
        private String dataPlaneUri;
        private List<DraDetailsResponse> dras;
        private String instanceType;
        private String physicalSiteId;
        private List<ProcessServerDetailsResponse> processServers;
        private List<PushInstallerDetailsResponse> pushInstallers;
        private List<RcmProxyDetailsResponse> rcmProxies;
        private List<ReplicationAgentDetailsResponse> replicationAgents;
        private List<ReprotectAgentDetailsResponse> reprotectAgents;
        private String serviceContainerId;
        private String serviceEndpoint;
        private String serviceResourceId;
        private String vmwareSiteId;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmFabricSpecificDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentDetails = defaults.agentDetails;
    	      this.controlPlaneUri = defaults.controlPlaneUri;
    	      this.dataPlaneUri = defaults.dataPlaneUri;
    	      this.dras = defaults.dras;
    	      this.instanceType = defaults.instanceType;
    	      this.physicalSiteId = defaults.physicalSiteId;
    	      this.processServers = defaults.processServers;
    	      this.pushInstallers = defaults.pushInstallers;
    	      this.rcmProxies = defaults.rcmProxies;
    	      this.replicationAgents = defaults.replicationAgents;
    	      this.reprotectAgents = defaults.reprotectAgents;
    	      this.serviceContainerId = defaults.serviceContainerId;
    	      this.serviceEndpoint = defaults.serviceEndpoint;
    	      this.serviceResourceId = defaults.serviceResourceId;
    	      this.vmwareSiteId = defaults.vmwareSiteId;
        }

        public Builder setAgentDetails(List<AgentDetailsResponse> agentDetails) {
            this.agentDetails = Objects.requireNonNull(agentDetails);
            return this;
        }

        public Builder setControlPlaneUri(String controlPlaneUri) {
            this.controlPlaneUri = Objects.requireNonNull(controlPlaneUri);
            return this;
        }

        public Builder setDataPlaneUri(String dataPlaneUri) {
            this.dataPlaneUri = Objects.requireNonNull(dataPlaneUri);
            return this;
        }

        public Builder setDras(List<DraDetailsResponse> dras) {
            this.dras = Objects.requireNonNull(dras);
            return this;
        }

        public Builder setInstanceType(String instanceType) {
            this.instanceType = Objects.requireNonNull(instanceType);
            return this;
        }

        public Builder setPhysicalSiteId(String physicalSiteId) {
            this.physicalSiteId = Objects.requireNonNull(physicalSiteId);
            return this;
        }

        public Builder setProcessServers(List<ProcessServerDetailsResponse> processServers) {
            this.processServers = Objects.requireNonNull(processServers);
            return this;
        }

        public Builder setPushInstallers(List<PushInstallerDetailsResponse> pushInstallers) {
            this.pushInstallers = Objects.requireNonNull(pushInstallers);
            return this;
        }

        public Builder setRcmProxies(List<RcmProxyDetailsResponse> rcmProxies) {
            this.rcmProxies = Objects.requireNonNull(rcmProxies);
            return this;
        }

        public Builder setReplicationAgents(List<ReplicationAgentDetailsResponse> replicationAgents) {
            this.replicationAgents = Objects.requireNonNull(replicationAgents);
            return this;
        }

        public Builder setReprotectAgents(List<ReprotectAgentDetailsResponse> reprotectAgents) {
            this.reprotectAgents = Objects.requireNonNull(reprotectAgents);
            return this;
        }

        public Builder setServiceContainerId(String serviceContainerId) {
            this.serviceContainerId = Objects.requireNonNull(serviceContainerId);
            return this;
        }

        public Builder setServiceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = Objects.requireNonNull(serviceEndpoint);
            return this;
        }

        public Builder setServiceResourceId(String serviceResourceId) {
            this.serviceResourceId = Objects.requireNonNull(serviceResourceId);
            return this;
        }

        public Builder setVmwareSiteId(String vmwareSiteId) {
            this.vmwareSiteId = Objects.requireNonNull(vmwareSiteId);
            return this;
        }

        public InMageRcmFabricSpecificDetailsResponse build() {
            return new InMageRcmFabricSpecificDetailsResponse(agentDetails, controlPlaneUri, dataPlaneUri, dras, instanceType, physicalSiteId, processServers, pushInstallers, rcmProxies, replicationAgents, reprotectAgents, serviceContainerId, serviceEndpoint, serviceResourceId, vmwareSiteId);
        }
    }
}
