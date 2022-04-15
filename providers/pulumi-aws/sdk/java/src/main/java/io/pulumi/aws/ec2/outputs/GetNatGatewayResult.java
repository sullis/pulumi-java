// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetNatGatewayFilter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetNatGatewayResult {
    /**
     * The Id of the EIP allocated to the selected Nat Gateway.
     * 
     */
    private final String allocationId;
    /**
     * The connectivity type of the NAT Gateway.
     * 
     */
    private final String connectivityType;
    private final @Nullable List<GetNatGatewayFilter> filters;
    private final String id;
    /**
     * The Id of the ENI allocated to the selected Nat Gateway.
     * 
     */
    private final String networkInterfaceId;
    /**
     * The private Ip address of the selected Nat Gateway.
     * 
     */
    private final String privateIp;
    /**
     * The public Ip (EIP) address of the selected Nat Gateway.
     * 
     */
    private final String publicIp;
    private final String state;
    private final String subnetId;
    private final Map<String,String> tags;
    private final String vpcId;

    @CustomType.Constructor
    private GetNatGatewayResult(
        @CustomType.Parameter("allocationId") String allocationId,
        @CustomType.Parameter("connectivityType") String connectivityType,
        @CustomType.Parameter("filters") @Nullable List<GetNatGatewayFilter> filters,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("networkInterfaceId") String networkInterfaceId,
        @CustomType.Parameter("privateIp") String privateIp,
        @CustomType.Parameter("publicIp") String publicIp,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("vpcId") String vpcId) {
        this.allocationId = allocationId;
        this.connectivityType = connectivityType;
        this.filters = filters;
        this.id = id;
        this.networkInterfaceId = networkInterfaceId;
        this.privateIp = privateIp;
        this.publicIp = publicIp;
        this.state = state;
        this.subnetId = subnetId;
        this.tags = tags;
        this.vpcId = vpcId;
    }

    /**
     * The Id of the EIP allocated to the selected Nat Gateway.
     * 
    */
    public String allocationId() {
        return this.allocationId;
    }
    /**
     * The connectivity type of the NAT Gateway.
     * 
    */
    public String connectivityType() {
        return this.connectivityType;
    }
    public List<GetNatGatewayFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String id() {
        return this.id;
    }
    /**
     * The Id of the ENI allocated to the selected Nat Gateway.
     * 
    */
    public String networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The private Ip address of the selected Nat Gateway.
     * 
    */
    public String privateIp() {
        return this.privateIp;
    }
    /**
     * The public Ip (EIP) address of the selected Nat Gateway.
     * 
    */
    public String publicIp() {
        return this.publicIp;
    }
    public String state() {
        return this.state;
    }
    public String subnetId() {
        return this.subnetId;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNatGatewayResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationId;
        private String connectivityType;
        private @Nullable List<GetNatGatewayFilter> filters;
        private String id;
        private String networkInterfaceId;
        private String privateIp;
        private String publicIp;
        private String state;
        private String subnetId;
        private Map<String,String> tags;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNatGatewayResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.connectivityType = defaults.connectivityType;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.networkInterfaceId = defaults.networkInterfaceId;
    	      this.privateIp = defaults.privateIp;
    	      this.publicIp = defaults.publicIp;
    	      this.state = defaults.state;
    	      this.subnetId = defaults.subnetId;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder allocationId(String allocationId) {
            this.allocationId = Objects.requireNonNull(allocationId);
            return this;
        }
        public Builder connectivityType(String connectivityType) {
            this.connectivityType = Objects.requireNonNull(connectivityType);
            return this;
        }
        public Builder filters(@Nullable List<GetNatGatewayFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetNatGatewayFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.networkInterfaceId = Objects.requireNonNull(networkInterfaceId);
            return this;
        }
        public Builder privateIp(String privateIp) {
            this.privateIp = Objects.requireNonNull(privateIp);
            return this;
        }
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }        public GetNatGatewayResult build() {
            return new GetNatGatewayResult(allocationId, connectivityType, filters, id, networkInterfaceId, privateIp, publicIp, state, subnetId, tags, vpcId);
        }
    }
}
