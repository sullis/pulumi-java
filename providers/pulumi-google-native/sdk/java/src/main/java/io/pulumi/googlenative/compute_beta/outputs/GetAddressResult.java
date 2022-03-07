// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class GetAddressResult {
    /**
     * The static IP address represented by this resource.
     * 
     */
    private final String address;
    /**
     * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
     * 
     */
    private final String addressType;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
     */
    private final String description;
    /**
     * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address.
     * 
     */
    private final String ipVersion;
    /**
     * Type of the resource. Always compute#address for addresses.
     * 
     */
    private final String kind;
    /**
     * A fingerprint for the labels being applied to this Address, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an Address.
     * 
     */
    private final String labelFingerprint;
    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    private final Map<String,String> labels;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
     */
    private final String name;
    /**
     * The URL of the network in which to reserve the address. This field can only be used with INTERNAL type with the VPC_PEERING purpose.
     * 
     */
    private final String network;
    /**
     * This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Internal IP addresses are always Premium Tier; global external IP addresses are always Premium Tier; regional external IP addresses can be either Standard or Premium Tier. If this field is not specified, it is assumed to be PREMIUM.
     * 
     */
    private final String networkTier;
    /**
     * The prefix length if the resource represents an IP range.
     * 
     */
    private final Integer prefixLength;
    /**
     * The purpose of this resource, which can be one of the following values: - GCE_ENDPOINT for addresses that are used by VM instances, alias IP ranges, load balancers, and similar resources. - DNS_RESOLVER for a DNS resolver address in a subnetwork for a Cloud DNS inbound forwarder IP addresses (regional internal IP address in a subnet of a VPC network) - VPC_PEERING for global internal IP addresses used for private services access allocated ranges. - NAT_AUTO for the regional external IP addresses used by Cloud NAT when allocating addresses using automatic NAT IP address allocation. - IPSEC_INTERCONNECT for addresses created from a private IP range that are reserved for a VLAN attachment in an *IPsec-encrypted Cloud Interconnect* configuration. These addresses are regional resources. Not currently available publicly. - `SHARED_LOADBALANCER_VIP` for an internal IP address that is assigned to multiple internal forwarding rules. - `PRIVATE_SERVICE_CONNECT` for a private network address that is used to configure Private Service Connect. Only global internal addresses can use this purpose.
     * 
     */
    private final String purpose;
    /**
     * The URL of the region where a regional address resides. For regional addresses, you must specify the region as a path parameter in the HTTP request URL. *This field is not applicable to global addresses.*
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An address that is RESERVING is currently in the process of being reserved. A RESERVED address is currently reserved and available to use. An IN_USE address is currently being used by another resource and is not available.
     * 
     */
    private final String status;
    /**
     * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork's IP range. This field can only be used with INTERNAL type with a GCE_ENDPOINT or DNS_RESOLVER purpose.
     * 
     */
    private final String subnetwork;
    /**
     * The URLs of the resources that are using this address.
     * 
     */
    private final List<String> users;

    @OutputCustomType.Constructor({"address","addressType","creationTimestamp","description","ipVersion","kind","labelFingerprint","labels","name","network","networkTier","prefixLength","purpose","region","selfLink","status","subnetwork","users"})
    private GetAddressResult(
        String address,
        String addressType,
        String creationTimestamp,
        String description,
        String ipVersion,
        String kind,
        String labelFingerprint,
        Map<String,String> labels,
        String name,
        String network,
        String networkTier,
        Integer prefixLength,
        String purpose,
        String region,
        String selfLink,
        String status,
        String subnetwork,
        List<String> users) {
        this.address = Objects.requireNonNull(address);
        this.addressType = Objects.requireNonNull(addressType);
        this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
        this.description = Objects.requireNonNull(description);
        this.ipVersion = Objects.requireNonNull(ipVersion);
        this.kind = Objects.requireNonNull(kind);
        this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
        this.labels = Objects.requireNonNull(labels);
        this.name = Objects.requireNonNull(name);
        this.network = Objects.requireNonNull(network);
        this.networkTier = Objects.requireNonNull(networkTier);
        this.prefixLength = Objects.requireNonNull(prefixLength);
        this.purpose = Objects.requireNonNull(purpose);
        this.region = Objects.requireNonNull(region);
        this.selfLink = Objects.requireNonNull(selfLink);
        this.status = Objects.requireNonNull(status);
        this.subnetwork = Objects.requireNonNull(subnetwork);
        this.users = Objects.requireNonNull(users);
    }

    /**
     * The static IP address represented by this resource.
     * 
    */
    public String getAddress() {
        return this.address;
    }
    /**
     * The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to EXTERNAL.
     * 
    */
    public String getAddressType() {
        return this.addressType;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this field when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The IP version that will be used by this address. Valid options are IPV4 or IPV6. This can only be specified for a global address.
     * 
    */
    public String getIpVersion() {
        return this.ipVersion;
    }
    /**
     * Type of the resource. Always compute#address for addresses.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * A fingerprint for the labels being applied to this Address, which is essentially a hash of the labels set used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update labels. You must always provide an up-to-date fingerprint hash in order to update or change labels, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve an Address.
     * 
    */
    public String getLabelFingerprint() {
        return this.labelFingerprint;
    }
    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`. The first character must be a lowercase letter, and all following characters (except for the last character) must be a dash, lowercase letter, or digit. The last character must be a lowercase letter or digit.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The URL of the network in which to reserve the address. This field can only be used with INTERNAL type with the VPC_PEERING purpose.
     * 
    */
    public String getNetwork() {
        return this.network;
    }
    /**
     * This signifies the networking tier used for configuring this address and can only take the following values: PREMIUM or STANDARD. Internal IP addresses are always Premium Tier; global external IP addresses are always Premium Tier; regional external IP addresses can be either Standard or Premium Tier. If this field is not specified, it is assumed to be PREMIUM.
     * 
    */
    public String getNetworkTier() {
        return this.networkTier;
    }
    /**
     * The prefix length if the resource represents an IP range.
     * 
    */
    public Integer getPrefixLength() {
        return this.prefixLength;
    }
    /**
     * The purpose of this resource, which can be one of the following values: - GCE_ENDPOINT for addresses that are used by VM instances, alias IP ranges, load balancers, and similar resources. - DNS_RESOLVER for a DNS resolver address in a subnetwork for a Cloud DNS inbound forwarder IP addresses (regional internal IP address in a subnet of a VPC network) - VPC_PEERING for global internal IP addresses used for private services access allocated ranges. - NAT_AUTO for the regional external IP addresses used by Cloud NAT when allocating addresses using automatic NAT IP address allocation. - IPSEC_INTERCONNECT for addresses created from a private IP range that are reserved for a VLAN attachment in an *IPsec-encrypted Cloud Interconnect* configuration. These addresses are regional resources. Not currently available publicly. - `SHARED_LOADBALANCER_VIP` for an internal IP address that is assigned to multiple internal forwarding rules. - `PRIVATE_SERVICE_CONNECT` for a private network address that is used to configure Private Service Connect. Only global internal addresses can use this purpose.
     * 
    */
    public String getPurpose() {
        return this.purpose;
    }
    /**
     * The URL of the region where a regional address resides. For regional addresses, you must specify the region as a path parameter in the HTTP request URL. *This field is not applicable to global addresses.*
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
     * The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An address that is RESERVING is currently in the process of being reserved. A RESERVED address is currently reserved and available to use. An IN_USE address is currently being used by another resource and is not available.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * The URL of the subnetwork in which to reserve the address. If an IP address is specified, it must be within the subnetwork's IP range. This field can only be used with INTERNAL type with a GCE_ENDPOINT or DNS_RESOLVER purpose.
     * 
    */
    public String getSubnetwork() {
        return this.subnetwork;
    }
    /**
     * The URLs of the resources that are using this address.
     * 
    */
    public List<String> getUsers() {
        return this.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAddressResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String address;
        private String addressType;
        private String creationTimestamp;
        private String description;
        private String ipVersion;
        private String kind;
        private String labelFingerprint;
        private Map<String,String> labels;
        private String name;
        private String network;
        private String networkTier;
        private Integer prefixLength;
        private String purpose;
        private String region;
        private String selfLink;
        private String status;
        private String subnetwork;
        private List<String> users;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAddressResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.addressType = defaults.addressType;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.ipVersion = defaults.ipVersion;
    	      this.kind = defaults.kind;
    	      this.labelFingerprint = defaults.labelFingerprint;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.network = defaults.network;
    	      this.networkTier = defaults.networkTier;
    	      this.prefixLength = defaults.prefixLength;
    	      this.purpose = defaults.purpose;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.status = defaults.status;
    	      this.subnetwork = defaults.subnetwork;
    	      this.users = defaults.users;
        }

        public Builder setAddress(String address) {
            this.address = Objects.requireNonNull(address);
            return this;
        }

        public Builder setAddressType(String addressType) {
            this.addressType = Objects.requireNonNull(addressType);
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

        public Builder setIpVersion(String ipVersion) {
            this.ipVersion = Objects.requireNonNull(ipVersion);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLabelFingerprint(String labelFingerprint) {
            this.labelFingerprint = Objects.requireNonNull(labelFingerprint);
            return this;
        }

        public Builder setLabels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNetwork(String network) {
            this.network = Objects.requireNonNull(network);
            return this;
        }

        public Builder setNetworkTier(String networkTier) {
            this.networkTier = Objects.requireNonNull(networkTier);
            return this;
        }

        public Builder setPrefixLength(Integer prefixLength) {
            this.prefixLength = Objects.requireNonNull(prefixLength);
            return this;
        }

        public Builder setPurpose(String purpose) {
            this.purpose = Objects.requireNonNull(purpose);
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

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setSubnetwork(String subnetwork) {
            this.subnetwork = Objects.requireNonNull(subnetwork);
            return this;
        }

        public Builder setUsers(List<String> users) {
            this.users = Objects.requireNonNull(users);
            return this;
        }
        public GetAddressResult build() {
            return new GetAddressResult(address, addressType, creationTimestamp, description, ipVersion, kind, labelFingerprint, labels, name, network, networkTier, prefixLength, purpose, region, selfLink, status, subnetwork, users);
        }
    }
}