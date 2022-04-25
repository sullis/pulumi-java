// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.compute_beta.outputs.ForwardingRuleServiceDirectoryRegistrationResponse;
import com.pulumi.googlenative.compute_beta.outputs.MetadataFilterResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetGlobalForwardingRuleResult {
    /**
     * @return This field is used along with the backend_service field for Internal TCP/UDP Load Balancing or Network Load Balancing, or with the target field for internal and external TargetInstance. You can only use one of ports and port_range, or allPorts. The three are mutually exclusive. For TCP, UDP and SCTP traffic, packets addressed to any ports will be forwarded to the target or backendService.
     * 
     */
    private final Boolean allPorts;
    /**
     * @return This field is used along with the backend_service field for internal load balancing or with the target field for internal TargetInstance. If the field is set to TRUE, clients can access ILB from all regions. Otherwise only allows access from clients in the same region as the internal load balancer.
     * 
     */
    private final Boolean allowGlobalAccess;
    /**
     * @return Identifies the backend service to which the forwarding rule sends traffic. Required for Internal TCP/UDP Load Balancing and Network Load Balancing; must be omitted for all other load balancer types.
     * 
     */
    private final String backendService;
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ForwardingRule. Include the fingerprint in patch request to ensure that you do not overwrite changes that were applied from another concurrent request. To see the latest fingerprint, make a get() request to retrieve a ForwardingRule.
     * 
     */
    private final String fingerprint;
    /**
     * @return IP address that this forwarding rule serves. When a client sends traffic to this IP address, the forwarding rule directs the traffic to the target that you specify in the forwarding rule. If you don&#39;t specify a reserved IP address, an ephemeral IP address is assigned. Methods for specifying an IP address: * IPv4 dotted decimal, as in `100.1.2.3` * Full URL, as in https://www.googleapis.com/compute/v1/projects/project_id/regions/region /addresses/address-name * Partial URL or by name, as in: - projects/project_id/regions/region/addresses/address-name - regions/region/addresses/address-name - global/addresses/address-name - address-name The loadBalancingScheme and the forwarding rule&#39;s target determine the type of IP address that you can use. For detailed information, see [IP address specifications](https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#ip_address_specifications). Must be set to `0.0.0.0` when the target is targetGrpcProxy that has validateForProxyless field set to true. For Private Service Connect forwarding rules that forward traffic to Google APIs, IP address must be provided.
     * 
     */
    private final String ipAddress;
    /**
     * @return The IP protocol to which this rule applies. For protocol forwarding, valid options are TCP, UDP, ESP, AH, SCTP, ICMP and L3_DEFAULT. The valid IP protocols are different for different load balancing products as described in [Load balancing features](https://cloud.google.com/load-balancing/docs/features#protocols_from_the_load_balancer_to_the_backends).
     * 
     */
    private final String ipProtocol;
    /**
     * @return The IP Version that will be used by this forwarding rule. Valid options are IPV4 or IPV6. This can only be specified for an external global forwarding rule.
     * 
     */
    private final String ipVersion;
    /**
     * @return Indicates whether or not this load balancer can be used as a collector for packet mirroring. To prevent mirroring loops, instances behind this load balancer will not have their traffic mirrored even if a PacketMirroring rule applies to them. This can only be set to true for load balancers that have their loadBalancingScheme set to INTERNAL.
     * 
     */
    private final Boolean isMirroringCollector;
    /**
     * @return Type of the resource. Always compute#forwardingRule for Forwarding Rule resources.
     * 
     */
    private final String kind;
    /**
     * @return A fingerprint for the labels being applied to this resource, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a ForwardingRule.
     * 
     */
    private final String labelFingerprint;
    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    private final Map<String,String> labels;
    /**
     * @return Specifies the forwarding rule type. For more information about forwarding rules, refer to Forwarding rule concepts.
     * 
     */
    private final String loadBalancingScheme;
    /**
     * @return Opaque filter criteria used by load balancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to load balancer, xDS clients present node metadata. When there is a match, the relevant configuration is made available to those proxies. Otherwise, all the resources (e.g. TargetHttpProxy, UrlMap) referenced by the ForwardingRule are not visible to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadataFilters are specified, all of them need to be satisfied in order to be considered a match. metadataFilters specified here will be applifed before those specified in the UrlMap that this ForwardingRule references. metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    private final List<MetadataFilterResponse> metadataFilters;
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. For Private Service Connect forwarding rules that forward traffic to Google APIs, the forwarding rule name must be a 1-20 characters string with lowercase letters and numbers and must start with a letter.
     * 
     */
    private final String name;
    /**
     * @return This field is not used for external load balancing. For Internal TCP/UDP Load Balancing, this field identifies the network that the load balanced IP should belong to for this Forwarding Rule. If this field is not specified, the default network will be used. For Private Service Connect forwarding rules that forward traffic to Google APIs, a network must be provided.
     * 
     */
    private final String network;
    /**
     * @return This signifies the networking tier used for configuring this load balancer and can only take the following values: PREMIUM, STANDARD. For regional ForwardingRule, the valid values are PREMIUM and STANDARD. For GlobalForwardingRule, the valid value is PREMIUM. If this field is not specified, it is assumed to be PREMIUM. If IPAddress is specified, this value must be equal to the networkTier of the Address.
     * 
     */
    private final String networkTier;
    /**
     * @return This field can be used only if: - Load balancing scheme is one of EXTERNAL, INTERNAL_SELF_MANAGED or INTERNAL_MANAGED - IPProtocol is one of TCP, UDP, or SCTP. Packets addressed to ports in the specified range will be forwarded to target or backend_service. You can only use one of ports, port_range, or allPorts. The three are mutually exclusive. Forwarding rules with the same [IPAddress, IPProtocol] pair must have disjoint ports. Some types of forwarding target have constraints on the acceptable ports. For more information, see [Port specifications](https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#port_specifications). @pattern: \\d+(?:-\\d+)?
     * 
     */
    private final String portRange;
    /**
     * @return The ports field is only supported when the forwarding rule references a backend_service directly. Only packets addressed to the [specified list of ports](&lt;(https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#port_specifications)&gt;) are forwarded to backends. You can only use one of ports and port_range, or allPorts. The three are mutually exclusive. You can specify a list of up to five ports, which can be non-contiguous. Forwarding rules with the same [IPAddress, IPProtocol] pair must have disjoint ports. @pattern: \\d+(?:-\\d+)?
     * 
     */
    private final List<String> ports;
    /**
     * @return The PSC connection id of the PSC Forwarding Rule.
     * 
     */
    private final String pscConnectionId;
    private final String pscConnectionStatus;
    /**
     * @return URL of the region where the regional forwarding rule resides. This field is not applicable to global forwarding rules. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    private final String region;
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * @return Service Directory resources to register this forwarding rule with. Currently, only supports a single Service Directory resource.
     * 
     */
    private final List<ForwardingRuleServiceDirectoryRegistrationResponse> serviceDirectoryRegistrations;
    /**
     * @return An optional prefix to the service name for this Forwarding Rule. If specified, the prefix is the first label of the fully qualified service name. The label must be 1-63 characters long, and comply with RFC1035. Specifically, the label must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. This field is only used for internal load balancing.
     * 
     */
    private final String serviceLabel;
    /**
     * @return The internal fully qualified service name for this Forwarding Rule. This field is only used for internal load balancing.
     * 
     */
    private final String serviceName;
    /**
     * @return If not empty, this Forwarding Rule will only forward the traffic when the source IP address matches one of the IP addresses or CIDR ranges set here. Note that a Forwarding Rule can only have up to 64 source IP ranges, and this field can only be used with a regional Forwarding Rule whose scheme is EXTERNAL. Each source_ip_range entry should be either an IP address (for example, 1.2.3.4) or a CIDR range (for example, 1.2.3.0/24).
     * 
     */
    private final List<String> sourceIpRanges;
    /**
     * @return This field identifies the subnetwork that the load balanced IP should belong to for this Forwarding Rule, used in internal load balancing and network load balancing with IPv6. If the network specified is in auto subnet mode, this field is optional. However, a subnetwork must be specified if the network is in custom subnet mode or when creating external forwarding rule with IPv6.
     * 
     */
    private final String subnetwork;
    private final String target;

    @CustomType.Constructor
    private GetGlobalForwardingRuleResult(
        @CustomType.Parameter("allPorts") Boolean allPorts,
        @CustomType.Parameter("allowGlobalAccess") Boolean allowGlobalAccess,
        @CustomType.Parameter("backendService") String backendService,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("ipAddress") String ipAddress,
        @CustomType.Parameter("ipProtocol") String ipProtocol,
        @CustomType.Parameter("ipVersion") String ipVersion,
        @CustomType.Parameter("isMirroringCollector") Boolean isMirroringCollector,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labelFingerprint") String labelFingerprint,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("loadBalancingScheme") String loadBalancingScheme,
        @CustomType.Parameter("metadataFilters") List<MetadataFilterResponse> metadataFilters,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("network") String network,
        @CustomType.Parameter("networkTier") String networkTier,
        @CustomType.Parameter("portRange") String portRange,
        @CustomType.Parameter("ports") List<String> ports,
        @CustomType.Parameter("pscConnectionId") String pscConnectionId,
        @CustomType.Parameter("pscConnectionStatus") String pscConnectionStatus,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("serviceDirectoryRegistrations") List<ForwardingRuleServiceDirectoryRegistrationResponse> serviceDirectoryRegistrations,
        @CustomType.Parameter("serviceLabel") String serviceLabel,
        @CustomType.Parameter("serviceName") String serviceName,
        @CustomType.Parameter("sourceIpRanges") List<String> sourceIpRanges,
        @CustomType.Parameter("subnetwork") String subnetwork,
        @CustomType.Parameter("target") String target) {
        this.allPorts = allPorts;
        this.allowGlobalAccess = allowGlobalAccess;
        this.backendService = backendService;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.fingerprint = fingerprint;
        this.ipAddress = ipAddress;
        this.ipProtocol = ipProtocol;
        this.ipVersion = ipVersion;
        this.isMirroringCollector = isMirroringCollector;
        this.kind = kind;
        this.labelFingerprint = labelFingerprint;
        this.labels = labels;
        this.loadBalancingScheme = loadBalancingScheme;
        this.metadataFilters = metadataFilters;
        this.name = name;
        this.network = network;
        this.networkTier = networkTier;
        this.portRange = portRange;
        this.ports = ports;
        this.pscConnectionId = pscConnectionId;
        this.pscConnectionStatus = pscConnectionStatus;
        this.region = region;
        this.selfLink = selfLink;
        this.serviceDirectoryRegistrations = serviceDirectoryRegistrations;
        this.serviceLabel = serviceLabel;
        this.serviceName = serviceName;
        this.sourceIpRanges = sourceIpRanges;
        this.subnetwork = subnetwork;
        this.target = target;
    }

    /**
     * @return This field is used along with the backend_service field for Internal TCP/UDP Load Balancing or Network Load Balancing, or with the target field for internal and external TargetInstance. You can only use one of ports and port_range, or allPorts. The three are mutually exclusive. For TCP, UDP and SCTP traffic, packets addressed to any ports will be forwarded to the target or backendService.
     * 
     */
    public Boolean allPorts() {
        return this.allPorts;
    }
    /**
     * @return This field is used along with the backend_service field for internal load balancing or with the target field for internal TargetInstance. If the field is set to TRUE, clients can access ILB from all regions. Otherwise only allows access from clients in the same region as the internal load balancer.
     * 
     */
    public Boolean allowGlobalAccess() {
        return this.allowGlobalAccess;
    }
    /**
     * @return Identifies the backend service to which the forwarding rule sends traffic. Required for Internal TCP/UDP Load Balancing and Network Load Balancing; must be omitted for all other load balancer types.
     * 
     */
    public String backendService() {
        return this.backendService;
    }
    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public String creationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a ForwardingRule. Include the fingerprint in patch request to ensure that you do not overwrite changes that were applied from another concurrent request. To see the latest fingerprint, make a get() request to retrieve a ForwardingRule.
     * 
     */
    public String fingerprint() {
        return this.fingerprint;
    }
    /**
     * @return IP address that this forwarding rule serves. When a client sends traffic to this IP address, the forwarding rule directs the traffic to the target that you specify in the forwarding rule. If you don&#39;t specify a reserved IP address, an ephemeral IP address is assigned. Methods for specifying an IP address: * IPv4 dotted decimal, as in `100.1.2.3` * Full URL, as in https://www.googleapis.com/compute/v1/projects/project_id/regions/region /addresses/address-name * Partial URL or by name, as in: - projects/project_id/regions/region/addresses/address-name - regions/region/addresses/address-name - global/addresses/address-name - address-name The loadBalancingScheme and the forwarding rule&#39;s target determine the type of IP address that you can use. For detailed information, see [IP address specifications](https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#ip_address_specifications). Must be set to `0.0.0.0` when the target is targetGrpcProxy that has validateForProxyless field set to true. For Private Service Connect forwarding rules that forward traffic to Google APIs, IP address must be provided.
     * 
     */
    public String ipAddress() {
        return this.ipAddress;
    }
    /**
     * @return The IP protocol to which this rule applies. For protocol forwarding, valid options are TCP, UDP, ESP, AH, SCTP, ICMP and L3_DEFAULT. The valid IP protocols are different for different load balancing products as described in [Load balancing features](https://cloud.google.com/load-balancing/docs/features#protocols_from_the_load_balancer_to_the_backends).
     * 
     */
    public String ipProtocol() {
        return this.ipProtocol;
    }
    /**
     * @return The IP Version that will be used by this forwarding rule. Valid options are IPV4 or IPV6. This can only be specified for an external global forwarding rule.
     * 
     */
    public String ipVersion() {
        return this.ipVersion;
    }
    /**
     * @return Indicates whether or not this load balancer can be used as a collector for packet mirroring. To prevent mirroring loops, instances behind this load balancer will not have their traffic mirrored even if a PacketMirroring rule applies to them. This can only be set to true for load balancers that have their loadBalancingScheme set to INTERNAL.
     * 
     */
    public Boolean isMirroringCollector() {
        return this.isMirroringCollector;
    }
    /**
     * @return Type of the resource. Always compute#forwardingRule for Forwarding Rule resources.
     * 
     */
    public String kind() {
        return this.kind;
    }
    /**
     * @return A fingerprint for the labels being applied to this resource, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a ForwardingRule.
     * 
     */
    public String labelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * @return Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * @return Specifies the forwarding rule type. For more information about forwarding rules, refer to Forwarding rule concepts.
     * 
     */
    public String loadBalancingScheme() {
        return this.loadBalancingScheme;
    }
    /**
     * @return Opaque filter criteria used by load balancer to restrict routing configuration to a limited set of xDS compliant clients. In their xDS requests to load balancer, xDS clients present node metadata. When there is a match, the relevant configuration is made available to those proxies. Otherwise, all the resources (e.g. TargetHttpProxy, UrlMap) referenced by the ForwardingRule are not visible to those proxies. For each metadataFilter in this list, if its filterMatchCriteria is set to MATCH_ANY, at least one of the filterLabels must match the corresponding label provided in the metadata. If its filterMatchCriteria is set to MATCH_ALL, then all of its filterLabels must match with corresponding labels provided in the metadata. If multiple metadataFilters are specified, all of them need to be satisfied in order to be considered a match. metadataFilters specified here will be applifed before those specified in the UrlMap that this ForwardingRule references. metadataFilters only applies to Loadbalancers that have their loadBalancingScheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    public List<MetadataFilterResponse> metadataFilters() {
        return this.metadataFilters;
    }
    /**
     * @return Name of the resource; provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. For Private Service Connect forwarding rules that forward traffic to Google APIs, the forwarding rule name must be a 1-20 characters string with lowercase letters and numbers and must start with a letter.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return This field is not used for external load balancing. For Internal TCP/UDP Load Balancing, this field identifies the network that the load balanced IP should belong to for this Forwarding Rule. If this field is not specified, the default network will be used. For Private Service Connect forwarding rules that forward traffic to Google APIs, a network must be provided.
     * 
     */
    public String network() {
        return this.network;
    }
    /**
     * @return This signifies the networking tier used for configuring this load balancer and can only take the following values: PREMIUM, STANDARD. For regional ForwardingRule, the valid values are PREMIUM and STANDARD. For GlobalForwardingRule, the valid value is PREMIUM. If this field is not specified, it is assumed to be PREMIUM. If IPAddress is specified, this value must be equal to the networkTier of the Address.
     * 
     */
    public String networkTier() {
        return this.networkTier;
    }
    /**
     * @return This field can be used only if: - Load balancing scheme is one of EXTERNAL, INTERNAL_SELF_MANAGED or INTERNAL_MANAGED - IPProtocol is one of TCP, UDP, or SCTP. Packets addressed to ports in the specified range will be forwarded to target or backend_service. You can only use one of ports, port_range, or allPorts. The three are mutually exclusive. Forwarding rules with the same [IPAddress, IPProtocol] pair must have disjoint ports. Some types of forwarding target have constraints on the acceptable ports. For more information, see [Port specifications](https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#port_specifications). @pattern: \\d+(?:-\\d+)?
     * 
     */
    public String portRange() {
        return this.portRange;
    }
    /**
     * @return The ports field is only supported when the forwarding rule references a backend_service directly. Only packets addressed to the [specified list of ports](&lt;(https://cloud.google.com/load-balancing/docs/forwarding-rule-concepts#port_specifications)&gt;) are forwarded to backends. You can only use one of ports and port_range, or allPorts. The three are mutually exclusive. You can specify a list of up to five ports, which can be non-contiguous. Forwarding rules with the same [IPAddress, IPProtocol] pair must have disjoint ports. @pattern: \\d+(?:-\\d+)?
     * 
     */
    public List<String> ports() {
        return this.ports;
    }
    /**
     * @return The PSC connection id of the PSC Forwarding Rule.
     * 
     */
    public String pscConnectionId() {
        return this.pscConnectionId;
    }
    public String pscConnectionStatus() {
        return this.pscConnectionStatus;
    }
    /**
     * @return URL of the region where the regional forwarding rule resides. This field is not applicable to global forwarding rules. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public String region() {
        return this.region;
    }
    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public String selfLink() {
        return this.selfLink;
    }
    /**
     * @return Service Directory resources to register this forwarding rule with. Currently, only supports a single Service Directory resource.
     * 
     */
    public List<ForwardingRuleServiceDirectoryRegistrationResponse> serviceDirectoryRegistrations() {
        return this.serviceDirectoryRegistrations;
    }
    /**
     * @return An optional prefix to the service name for this Forwarding Rule. If specified, the prefix is the first label of the fully qualified service name. The label must be 1-63 characters long, and comply with RFC1035. Specifically, the label must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash. This field is only used for internal load balancing.
     * 
     */
    public String serviceLabel() {
        return this.serviceLabel;
    }
    /**
     * @return The internal fully qualified service name for this Forwarding Rule. This field is only used for internal load balancing.
     * 
     */
    public String serviceName() {
        return this.serviceName;
    }
    /**
     * @return If not empty, this Forwarding Rule will only forward the traffic when the source IP address matches one of the IP addresses or CIDR ranges set here. Note that a Forwarding Rule can only have up to 64 source IP ranges, and this field can only be used with a regional Forwarding Rule whose scheme is EXTERNAL. Each source_ip_range entry should be either an IP address (for example, 1.2.3.4) or a CIDR range (for example, 1.2.3.0/24).
     * 
     */
    public List<String> sourceIpRanges() {
        return this.sourceIpRanges;
    }
    /**
     * @return This field identifies the subnetwork that the load balanced IP should belong to for this Forwarding Rule, used in internal load balancing and network load balancing with IPv6. If the network specified is in auto subnet mode, this field is optional. However, a subnetwork must be specified if the network is in custom subnet mode or when creating external forwarding rule with IPv6.
     * 
     */
    public String subnetwork() {
        return this.subnetwork;
    }
    public String target() {
        return this.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGlobalForwardingRuleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allPorts;
        private Boolean allowGlobalAccess;
        private String backendService;
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private String ipAddress;
        private String ipProtocol;
        private String ipVersion;
        private Boolean isMirroringCollector;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String loadBalancingScheme;
        private List<MetadataFilterResponse> metadataFilters;
        private String name;
        private String network;
        private String networkTier;
        private String portRange;
        private List<String> ports;
        private String pscConnectionId;
        private String pscConnectionStatus;
        private String region;
        private String selfLink;
        private List<ForwardingRuleServiceDirectoryRegistrationResponse> serviceDirectoryRegistrations;
        private String serviceLabel;
        private String serviceName;
        private List<String> sourceIpRanges;
        private String subnetwork;
        private String target;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGlobalForwardingRuleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allPorts = defaults.allPorts;
    	      this.allowGlobalAccess = defaults.allowGlobalAccess;
    	      this.backendService = defaults.backendService;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.ipAddress = defaults.ipAddress;
    	      this.ipProtocol = defaults.ipProtocol;
    	      this.ipVersion = defaults.ipVersion;
    	      this.isMirroringCollector = defaults.isMirroringCollector;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.metadataFilters = defaults.metadataFilters;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkTier = defaults.networkTier;
    	      this.portRange = defaults.portRange;
    	      this.ports = defaults.ports;
    	      this.pscConnectionId = defaults.pscConnectionId;
    	      this.pscConnectionStatus = defaults.pscConnectionStatus;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.serviceDirectoryRegistrations = defaults.serviceDirectoryRegistrations;
    	      this.serviceLabel = defaults.serviceLabel;
    	      this.serviceName = defaults.serviceName;
    	      this.sourceIpRanges = defaults.sourceIpRanges;
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
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
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
        public Builder ipVersion(String ipVersion) {
            this.ipVersion = Objects.requireNonNull(ipVersion);
            return this;
        }
        public Builder isMirroringCollector(Boolean isMirroringCollector) {
            this.isMirroringCollector = Objects.requireNonNull(isMirroringCollector);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
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
        public Builder metadataFilters(List<MetadataFilterResponse> metadataFilters) {
            this.metadataFilters = Objects.requireNonNull(metadataFilters);
            return this;
        }
        public Builder metadataFilters(MetadataFilterResponse... metadataFilters) {
            return metadataFilters(List.of(metadataFilters));
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
        public Builder pscConnectionId(String pscConnectionId) {
            this.pscConnectionId = Objects.requireNonNull(pscConnectionId);
            return this;
        }
        public Builder pscConnectionStatus(String pscConnectionStatus) {
            this.pscConnectionStatus = Objects.requireNonNull(pscConnectionStatus);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder serviceDirectoryRegistrations(List<ForwardingRuleServiceDirectoryRegistrationResponse> serviceDirectoryRegistrations) {
            this.serviceDirectoryRegistrations = Objects.requireNonNull(serviceDirectoryRegistrations);
            return this;
        }
        public Builder serviceDirectoryRegistrations(ForwardingRuleServiceDirectoryRegistrationResponse... serviceDirectoryRegistrations) {
            return serviceDirectoryRegistrations(List.of(serviceDirectoryRegistrations));
        }
        public Builder serviceLabel(String serviceLabel) {
            this.serviceLabel = Objects.requireNonNull(serviceLabel);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder sourceIpRanges(List<String> sourceIpRanges) {
            this.sourceIpRanges = Objects.requireNonNull(sourceIpRanges);
            return this;
        }
        public Builder sourceIpRanges(String... sourceIpRanges) {
            return sourceIpRanges(List.of(sourceIpRanges));
        }
        public Builder subnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }
        public Builder target(String target) {
            this.target = Objects.requireNonNull(target);
            return this;
        }        public GetGlobalForwardingRuleResult build() {
            return new GetGlobalForwardingRuleResult(allPorts, allowGlobalAccess, backendService, creationTimestamp, description, fingerprint, ipAddress, ipProtocol, ipVersion, isMirroringCollector, kind, labelFingerprint, labels, loadBalancingScheme, metadataFilters, name, network, networkTier, portRange, ports, pscConnectionId, pscConnectionStatus, region, selfLink, serviceDirectoryRegistrations, serviceLabel, serviceName, sourceIpRanges, subnetwork, target);
        }
    }
}
