// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetLocalGatewayVirtualInterfaceFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetLocalGatewayVirtualInterfaceResult {
    private final @Nullable List<GetLocalGatewayVirtualInterfaceFilter> filters;
    private final String id;
    /**
     * Local address.
     * 
     */
    private final String localAddress;
    /**
     * Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the EC2 Local Gateway.
     * 
     */
    private final Integer localBgpAsn;
    /**
     * Identifier of the EC2 Local Gateway.
     * 
     */
    private final String localGatewayId;
    private final List<String> localGatewayVirtualInterfaceIds;
    /**
     * Peer address.
     * 
     */
    private final String peerAddress;
    /**
     * Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the peer.
     * 
     */
    private final Integer peerBgpAsn;
    private final Map<String,String> tags;
    /**
     * Virtual Local Area Network.
     * 
     */
    private final Integer vlan;

    @OutputCustomType.Constructor({"filters","id","localAddress","localBgpAsn","localGatewayId","localGatewayVirtualInterfaceIds","peerAddress","peerBgpAsn","tags","vlan"})
    private GetLocalGatewayVirtualInterfaceResult(
        @Nullable List<GetLocalGatewayVirtualInterfaceFilter> filters,
        String id,
        String localAddress,
        Integer localBgpAsn,
        String localGatewayId,
        List<String> localGatewayVirtualInterfaceIds,
        String peerAddress,
        Integer peerBgpAsn,
        Map<String,String> tags,
        Integer vlan) {
        this.filters = filters;
        this.id = Objects.requireNonNull(id);
        this.localAddress = Objects.requireNonNull(localAddress);
        this.localBgpAsn = Objects.requireNonNull(localBgpAsn);
        this.localGatewayId = Objects.requireNonNull(localGatewayId);
        this.localGatewayVirtualInterfaceIds = Objects.requireNonNull(localGatewayVirtualInterfaceIds);
        this.peerAddress = Objects.requireNonNull(peerAddress);
        this.peerBgpAsn = Objects.requireNonNull(peerBgpAsn);
        this.tags = Objects.requireNonNull(tags);
        this.vlan = Objects.requireNonNull(vlan);
    }

    public List<GetLocalGatewayVirtualInterfaceFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String getId() {
        return this.id;
    }
    /**
     * Local address.
     * 
    */
    public String getLocalAddress() {
        return this.localAddress;
    }
    /**
     * Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the EC2 Local Gateway.
     * 
    */
    public Integer getLocalBgpAsn() {
        return this.localBgpAsn;
    }
    /**
     * Identifier of the EC2 Local Gateway.
     * 
    */
    public String getLocalGatewayId() {
        return this.localGatewayId;
    }
    public List<String> getLocalGatewayVirtualInterfaceIds() {
        return this.localGatewayVirtualInterfaceIds;
    }
    /**
     * Peer address.
     * 
    */
    public String getPeerAddress() {
        return this.peerAddress;
    }
    /**
     * Border Gateway Protocol (BGP) Autonomous System Number (ASN) of the peer.
     * 
    */
    public Integer getPeerBgpAsn() {
        return this.peerBgpAsn;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Virtual Local Area Network.
     * 
    */
    public Integer getVlan() {
        return this.vlan;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLocalGatewayVirtualInterfaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<GetLocalGatewayVirtualInterfaceFilter> filters;
        private String id;
        private String localAddress;
        private Integer localBgpAsn;
        private String localGatewayId;
        private List<String> localGatewayVirtualInterfaceIds;
        private String peerAddress;
        private Integer peerBgpAsn;
        private Map<String,String> tags;
        private Integer vlan;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLocalGatewayVirtualInterfaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.localAddress = defaults.localAddress;
    	      this.localBgpAsn = defaults.localBgpAsn;
    	      this.localGatewayId = defaults.localGatewayId;
    	      this.localGatewayVirtualInterfaceIds = defaults.localGatewayVirtualInterfaceIds;
    	      this.peerAddress = defaults.peerAddress;
    	      this.peerBgpAsn = defaults.peerBgpAsn;
    	      this.tags = defaults.tags;
    	      this.vlan = defaults.vlan;
        }

        public Builder setFilters(@Nullable List<GetLocalGatewayVirtualInterfaceFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLocalAddress(String localAddress) {
            this.localAddress = Objects.requireNonNull(localAddress);
            return this;
        }

        public Builder setLocalBgpAsn(Integer localBgpAsn) {
            this.localBgpAsn = Objects.requireNonNull(localBgpAsn);
            return this;
        }

        public Builder setLocalGatewayId(String localGatewayId) {
            this.localGatewayId = Objects.requireNonNull(localGatewayId);
            return this;
        }

        public Builder setLocalGatewayVirtualInterfaceIds(List<String> localGatewayVirtualInterfaceIds) {
            this.localGatewayVirtualInterfaceIds = Objects.requireNonNull(localGatewayVirtualInterfaceIds);
            return this;
        }

        public Builder setPeerAddress(String peerAddress) {
            this.peerAddress = Objects.requireNonNull(peerAddress);
            return this;
        }

        public Builder setPeerBgpAsn(Integer peerBgpAsn) {
            this.peerBgpAsn = Objects.requireNonNull(peerBgpAsn);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVlan(Integer vlan) {
            this.vlan = Objects.requireNonNull(vlan);
            return this;
        }
        public GetLocalGatewayVirtualInterfaceResult build() {
            return new GetLocalGatewayVirtualInterfaceResult(filters, id, localAddress, localBgpAsn, localGatewayId, localGatewayVirtualInterfaceIds, peerAddress, peerBgpAsn, tags, vlan);
        }
    }
}