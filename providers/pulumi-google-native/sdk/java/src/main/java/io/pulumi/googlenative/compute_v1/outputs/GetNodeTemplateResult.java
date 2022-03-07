// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.compute_v1.outputs.AcceleratorConfigResponse;
import io.pulumi.googlenative.compute_v1.outputs.LocalDiskResponse;
import io.pulumi.googlenative.compute_v1.outputs.NodeTemplateNodeTypeFlexibilityResponse;
import io.pulumi.googlenative.compute_v1.outputs.ServerBindingResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetNodeTemplateResult {
    private final List<AcceleratorConfigResponse> accelerators;
    /**
     * CPU overcommit.
     * 
     */
    private final String cpuOvercommitType;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    private final List<LocalDiskResponse> disks;
    /**
     * The type of the resource. Always compute#nodeTemplate for node templates.
     * 
     */
    private final String kind;
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * Labels to use for node affinity, which will be used in instance scheduling.
     * 
     */
    private final Map<String,String> nodeAffinityLabels;
    /**
     * The node type to use for nodes group that are created from this template.
     * 
     */
    private final String nodeType;
    /**
     * The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
     * 
     */
    private final NodeTemplateNodeTypeFlexibilityResponse nodeTypeFlexibility;
    /**
     * The name of the region where the node template resides, such as us-central1.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
     * 
     */
    private final ServerBindingResponse serverBinding;
    /**
     * The status of the node template. One of the following values: CREATING, READY, and DELETING.
     * 
     */
    private final String status;
    /**
     * An optional, human-readable explanation of the status.
     * 
     */
    private final String statusMessage;

    @OutputCustomType.Constructor({"accelerators","cpuOvercommitType","creationTimestamp","description","disks","kind","name","nodeAffinityLabels","nodeType","nodeTypeFlexibility","region","selfLink","serverBinding","status","statusMessage"})
    private GetNodeTemplateResult(
        List<AcceleratorConfigResponse> accelerators,
        String cpuOvercommitType,
        String creationTimestamp,
        String description,
        List<LocalDiskResponse> disks,
        String kind,
        String name,
        Map<String,String> nodeAffinityLabels,
        String nodeType,
        NodeTemplateNodeTypeFlexibilityResponse nodeTypeFlexibility,
        String region,
        String selfLink,
        ServerBindingResponse serverBinding,
        String status,
        String statusMessage) {
        this.accelerators = Objects.requireNonNull(accelerators);
        this.cpuOvercommitType = Objects.requireNonNull(cpuOvercommitType);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.disks = Objects.requireNonNull(disks);
        this.kind = Objects.requireNonNull(kind);
        this.name = Objects.requireNonNull(name);
        this.nodeAffinityLabels = Objects.requireNonNull(nodeAffinityLabels);
        this.nodeType = Objects.requireNonNull(nodeType);
        this.nodeTypeFlexibility = Objects.requireNonNull(nodeTypeFlexibility);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.serverBinding = Objects.requireNonNull(serverBinding);
        this.status = Objects.requireNonNull(status);
        this.statusMessage = Objects.requireNonNull(statusMessage);
    }

    public List<AcceleratorConfigResponse> getAccelerators() {
        return this.accelerators;
    }
    /**
     * CPU overcommit.
     * 
    */
    public String getCpuOvercommitType() {
        return this.cpuOvercommitType;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    public List<LocalDiskResponse> getDisks() {
        return this.disks;
    }
    /**
     * The type of the resource. Always compute#nodeTemplate for node templates.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * The name of the resource, provided by the client when initially creating the resource. The resource name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Labels to use for node affinity, which will be used in instance scheduling.
     * 
    */
    public Map<String,String> getNodeAffinityLabels() {
        return this.nodeAffinityLabels;
    }
    /**
     * The node type to use for nodes group that are created from this template.
     * 
    */
    public String getNodeType() {
        return this.nodeType;
    }
    /**
     * The flexible properties of the desired node type. Node groups that use this node template will create nodes of a type that matches these properties. This field is mutually exclusive with the node_type property; you can only define one or the other, but not both.
     * 
    */
    public NodeTemplateNodeTypeFlexibilityResponse getNodeTypeFlexibility() {
        return this.nodeTypeFlexibility;
    }
    /**
     * The name of the region where the node template resides, such as us-central1.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Sets the binding properties for the physical server. Valid values include: - *[Default]* RESTART_NODE_ON_ANY_SERVER: Restarts VMs on any available physical server - RESTART_NODE_ON_MINIMAL_SERVER: Restarts VMs on the same physical server whenever possible See Sole-tenant node options for more information.
     * 
    */
    public ServerBindingResponse getServerBinding() {
        return this.serverBinding;
    }
    /**
     * The status of the node template. One of the following values: CREATING, READY, and DELETING.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * An optional, human-readable explanation of the status.
     * 
    */
    public String getStatusMessage() {
        return this.statusMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNodeTemplateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<AcceleratorConfigResponse> accelerators;
        private String cpuOvercommitType;
        private String creationTimestamp;
        private String description;
        private List<LocalDiskResponse> disks;
        private String kind;
        private String name;
        private Map<String,String> nodeAffinityLabels;
        private String nodeType;
        private NodeTemplateNodeTypeFlexibilityResponse nodeTypeFlexibility;
        private String region;
        private String selfLink;
        private ServerBindingResponse serverBinding;
        private String status;
        private String statusMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNodeTemplateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accelerators = defaults.accelerators;
    	      this.cpuOvercommitType = defaults.cpuOvercommitType;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.disks = defaults.disks;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.nodeAffinityLabels = defaults.nodeAffinityLabels;
    	      this.nodeType = defaults.nodeType;
    	      this.nodeTypeFlexibility = defaults.nodeTypeFlexibility;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.serverBinding = defaults.serverBinding;
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
        }

        public Builder setAccelerators(List<AcceleratorConfigResponse> accelerators) {
            this.accelerators = Objects.requireNonNull(accelerators);
            return this;
        }

        public Builder setCpuOvercommitType(String cpuOvercommitType) {
            this.cpuOvercommitType = Objects.requireNonNull(cpuOvercommitType);
            return this;
        }

        public Builder setCreationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }

        public Builder setDescription(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisks(List<LocalDiskResponse> disks) {
            this.disks = Objects.requireNonNull(disks);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNodeAffinityLabels(Map<String,String> nodeAffinityLabels) {
            this.nodeAffinityLabels = Objects.requireNonNull(nodeAffinityLabels);
            return this;
        }

        public Builder setNodeType(String nodeType) {
            this.nodeType = Objects.requireNonNull(nodeType);
            return this;
        }

        public Builder setNodeTypeFlexibility(NodeTemplateNodeTypeFlexibilityResponse nodeTypeFlexibility) {
            this.nodeTypeFlexibility = Objects.requireNonNull(nodeTypeFlexibility);
            return this;
        }

        public Builder setRegion(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }

        public Builder setSelfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }

        public Builder setServerBinding(ServerBindingResponse serverBinding) {
            this.serverBinding = Objects.requireNonNull(serverBinding);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setStatusMessage(String statusMessage) {
            this.statusMessage = Objects.requireNonNull(statusMessage);
            return this;
        }
        public GetNodeTemplateResult build() {
            return new GetNodeTemplateResult(accelerators, cpuOvercommitType, creationTimestamp, description, disks, kind, name, nodeAffinityLabels, nodeType, nodeTypeFlexibility, region, selfLink, serverBinding, status, statusMessage);
        }
    }
}