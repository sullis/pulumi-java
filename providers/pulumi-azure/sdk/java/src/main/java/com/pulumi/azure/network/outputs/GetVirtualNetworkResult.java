// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.network.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetVirtualNetworkResult {
    /**
     * @return The list of address spaces used by the virtual network.
     * 
     */
    private final List<String> addressSpaces;
    /**
     * @return The list of DNS servers used by the virtual network.
     * 
     */
    private final List<String> dnsServers;
    /**
     * @return The GUID of the virtual network.
     * 
     */
    private final String guid;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Location of the virtual network.
     * 
     */
    private final String location;
    private final String name;
    private final String resourceGroupName;
    /**
     * @return The list of name of the subnets that are attached to this virtual network.
     * 
     */
    private final List<String> subnets;
    /**
     * @return A mapping of tags to assigned to the resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * @return A mapping of name - virtual network id of the virtual network peerings.
     * 
     */
    private final Map<String,String> vnetPeerings;
    /**
     * @return A list of virtual network peerings IP addresses.
     * 
     */
    private final List<String> vnetPeeringsAddresses;

    @CustomType.Constructor
    private GetVirtualNetworkResult(
        @CustomType.Parameter("addressSpaces") List<String> addressSpaces,
        @CustomType.Parameter("dnsServers") List<String> dnsServers,
        @CustomType.Parameter("guid") String guid,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("resourceGroupName") String resourceGroupName,
        @CustomType.Parameter("subnets") List<String> subnets,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("vnetPeerings") Map<String,String> vnetPeerings,
        @CustomType.Parameter("vnetPeeringsAddresses") List<String> vnetPeeringsAddresses) {
        this.addressSpaces = addressSpaces;
        this.dnsServers = dnsServers;
        this.guid = guid;
        this.id = id;
        this.location = location;
        this.name = name;
        this.resourceGroupName = resourceGroupName;
        this.subnets = subnets;
        this.tags = tags;
        this.vnetPeerings = vnetPeerings;
        this.vnetPeeringsAddresses = vnetPeeringsAddresses;
    }

    /**
     * @return The list of address spaces used by the virtual network.
     * 
     */
    public List<String> addressSpaces() {
        return this.addressSpaces;
    }
    /**
     * @return The list of DNS servers used by the virtual network.
     * 
     */
    public List<String> dnsServers() {
        return this.dnsServers;
    }
    /**
     * @return The GUID of the virtual network.
     * 
     */
    public String guid() {
        return this.guid;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Location of the virtual network.
     * 
     */
    public String location() {
        return this.location;
    }
    public String name() {
        return this.name;
    }
    public String resourceGroupName() {
        return this.resourceGroupName;
    }
    /**
     * @return The list of name of the subnets that are attached to this virtual network.
     * 
     */
    public List<String> subnets() {
        return this.subnets;
    }
    /**
     * @return A mapping of tags to assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }
    /**
     * @return A mapping of name - virtual network id of the virtual network peerings.
     * 
     */
    public Map<String,String> vnetPeerings() {
        return this.vnetPeerings;
    }
    /**
     * @return A list of virtual network peerings IP addresses.
     * 
     */
    public List<String> vnetPeeringsAddresses() {
        return this.vnetPeeringsAddresses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualNetworkResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> addressSpaces;
        private List<String> dnsServers;
        private String guid;
        private String id;
        private String location;
        private String name;
        private String resourceGroupName;
        private List<String> subnets;
        private Map<String,String> tags;
        private Map<String,String> vnetPeerings;
        private List<String> vnetPeeringsAddresses;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualNetworkResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressSpaces = defaults.addressSpaces;
    	      this.dnsServers = defaults.dnsServers;
    	      this.guid = defaults.guid;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.vnetPeerings = defaults.vnetPeerings;
    	      this.vnetPeeringsAddresses = defaults.vnetPeeringsAddresses;
        }

        public Builder addressSpaces(List<String> addressSpaces) {
            this.addressSpaces = Objects.requireNonNull(addressSpaces);
            return this;
        }
        public Builder addressSpaces(String... addressSpaces) {
            return addressSpaces(List.of(addressSpaces));
        }
        public Builder dnsServers(List<String> dnsServers) {
            this.dnsServers = Objects.requireNonNull(dnsServers);
            return this;
        }
        public Builder dnsServers(String... dnsServers) {
            return dnsServers(List.of(dnsServers));
        }
        public Builder guid(String guid) {
            this.guid = Objects.requireNonNull(guid);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder subnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder vnetPeerings(Map<String,String> vnetPeerings) {
            this.vnetPeerings = Objects.requireNonNull(vnetPeerings);
            return this;
        }
        public Builder vnetPeeringsAddresses(List<String> vnetPeeringsAddresses) {
            this.vnetPeeringsAddresses = Objects.requireNonNull(vnetPeeringsAddresses);
            return this;
        }
        public Builder vnetPeeringsAddresses(String... vnetPeeringsAddresses) {
            return vnetPeeringsAddresses(List.of(vnetPeeringsAddresses));
        }        public GetVirtualNetworkResult build() {
            return new GetVirtualNetworkResult(addressSpaces, dnsServers, guid, id, location, name, resourceGroupName, subnets, tags, vnetPeerings, vnetPeeringsAddresses);
        }
    }
}
