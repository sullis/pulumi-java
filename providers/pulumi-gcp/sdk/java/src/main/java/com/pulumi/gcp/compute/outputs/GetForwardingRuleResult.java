// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.compute.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetForwardingRuleResult {
    private final Boolean allPorts;
    private final Boolean allowGlobalAccess;
    private final String backendService;
    private final String creationTimestamp;
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String ipAddress;
    private final String ipProtocol;
    private final Boolean isMirroringCollector;
    private final String labelFingerprint;
    private final Map<String,String> labels;
    private final String loadBalancingScheme;
    private final String name;
    private final String network;
    private final String networkTier;
    private final String portRange;
    private final List<String> ports;
    private final @Nullable String project;
    private final @Nullable String region;
    private final String selfLink;
    private final String serviceLabel;
    private final String serviceName;
    private final String subnetwork;
    private final String target;

    @CustomType.Constructor
    private GetForwardingRuleResult(
        @CustomType.Parameter("allPorts") Boolean allPorts,
        @CustomType.Parameter("allowGlobalAccess") Boolean allowGlobalAccess,
        @CustomType.Parameter("backendService") String backendService,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("ipProtocol") String ipProtocol,
        @CustomType.Parameter("isMirroringCollector") Boolean isMirroringCollector,
        @CustomType.Parameter("labelFingerprint") String labelFingerprint,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("loadBalancingScheme") String loadBalancingScheme,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("networkTier") String networkTier,
        @CustomType.Parameter("portRange") String portRange,
        @CustomType.Parameter("ports") List<String> ports,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("region") @Nullable String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("serviceLabel") String serviceLabel,
        @CustomType.Parameter("serviceName") String serviceName,
        @CustomType.Parameter("subnetwork") String subnetwork,
        @CustomType.Parameter("target") String target) {
        this.allPorts = allPorts;
        this.allowGlobalAccess = allowGlobalAccess;
        this.backendService = backendService;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.id = id;
        this.ipAddress = ipAddress;
        this.ipProtocol = ipProtocol;
        this.isMirroringCollector = isMirroringCollector;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.loadBalancingScheme = loadBalancingScheme;
        this.name = name;
        this.network = network;
        this.networkTier = networkTier;
        this.portRange = portRange;
        this.ports = ports;
        this.project = project;
        this.region = region;
        this.selfLink = selfLink;
        this.serviceLabel = serviceLabel;
        this.serviceName = serviceName;
        this.subnetwork = subnetwork;
        this.target = target;
    }

    public Boolean allPorts() {
        return this.allPorts;
    }
    public Boolean allowGlobalAccess() {
        return this.allowGlobalAccess;
    }
    public String backendService() {
        return this.backendService;
    }
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String ipAddress() {
        return this.ipAddress;
    }
    public String ipProtocol() {
        return this.ipProtocol;
    }
    public Boolean isMirroringCollector() {
        return this.isMirroringCollector;
    }
    public String labelFingerprint() {
        return this.labelFingerprint;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public String loadBalancingScheme() {
        return this.loadBalancingScheme;
    }
    public String name() {
        return this.name;
    }
    public String network() {
        return this.network;
    }
    public String networkTier() {
        return this.networkTier;
    }
    public String portRange() {
        return this.portRange;
    }
    public List<String> ports() {
        return this.ports;
    }
    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    public String selfLink() {
        return this.selfLink;
    }
    public String serviceLabel() {
        return this.serviceLabel;
    }
    public String serviceName() {
        return this.serviceName;
    }
    public String subnetwork() {
        return this.subnetwork;
    }
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetForwardingRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allPorts;
        private Boolean allowGlobalAccess;
        private String backendService;
        private String creationTimestamp;
        private String description;
        private String id;
        private String ipAddress;
        private String ipProtocol;
        private Boolean isMirroringCollector;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String loadBalancingScheme;
        private String name;
        private String network;
        private String networkTier;
        private String portRange;
        private List<String> ports;
        private @Nullable String project;
        private @Nullable String region;
        private String selfLink;
        private String serviceLabel;
        private String serviceName;
        private String subnetwork;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(GetForwardingRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allPorts = defaults.allPorts;
    	      this.allowGlobalAccess = defaults.allowGlobalAccess;
    	      this.backendService = defaults.backendService;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.isMirroringCollector = defaults.isMirroringCollector;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkTier = defaults.networkTier;
    	      this.portRange = defaults.portRange;
    	      this.ports = defaults.ports;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.serviceLabel = defaults.serviceLabel;
    	      this.serviceName = defaults.serviceName;
    	      this.subnetwork = defaults.subnetwork;
    	      this.target = defaults.target;
        }

        public Builder allPorts(Boolean allPorts) {
            this.allPorts = Objects.requireNonNull(allPorts);
            return this;
        }
        public Builder allowGlobalAccess(Boolean allowGlobalAccess) {
            this.allowGlobalAccess = Objects.requireNonNull(allowGlobalAccess);
            return this;
        }
        public Builder backendService(String backendService) {
            this.backendService = Objects.requireNonNull(backendService);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = Objects.requireNonNull(ipAddress);
            return this;
        }
        public Builder ipProtocol(String ipProtocol) {
            this.ipProtocol = Objects.requireNonNull(ipProtocol);
            return this;
        }
        public Builder isMirroringCollector(Boolean isMirroringCollector) {
            this.isMirroringCollector = Objects.requireNonNull(isMirroringCollector);
            return this;
        }
        public Builder labelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder loadBalancingScheme(String loadBalancingScheme) {
            this.loadBalancingScheme = Objects.requireNonNull(loadBalancingScheme);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder network(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }
        public Builder networkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }
        public Builder portRange(String portRange) {
            this.portRange = Objects.requireNonNull(portRange);
            return this;
        }
        public Builder ports(List<String> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(String... ports) {
            return ports(List.of(ports));
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder serviceLabel(String serviceLabel) {
            this.serviceLabel = Objects.requireNonNull(serviceLabel);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public GetForwardingRuleResult build() {
            return new GetForwardingRuleResult(allPorts, allowGlobalAccess, backendService, creationTimestamp, description, id, ipAddress, ipProtocol, isMirroringCollector, labelFingerprint, labels, loadBalancingScheme, name, network, networkTier, portRange, ports, project, region, selfLink, serviceLabel, serviceName, subnetwork, target);
        }
    }
}
