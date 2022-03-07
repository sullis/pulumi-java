// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetSubnetFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSubnetResult {
    /**
     * ARN of the subnet.
     * 
     */
    private final String arn;
    /**
     * Whether an IPv6 address is assigned on creation.
     * 
     */
    private final Boolean assignIpv6AddressOnCreation;
    private final String availabilityZone;
    private final String availabilityZoneId;
    /**
     * Available IP addresses of the subnet.
     * 
     */
    private final Integer availableIpAddressCount;
    private final String cidrBlock;
    /**
     * Identifier of customer owned IPv4 address pool.
     * 
     */
    private final String customerOwnedIpv4Pool;
    private final Boolean defaultForAz;
    /**
     * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet return synthetic IPv6 addresses for IPv4-only destinations.
     * 
     */
    private final Boolean enableDns64;
    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * 
     */
    private final Boolean enableResourceNameDnsARecordOnLaunch;
    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * 
     */
    private final Boolean enableResourceNameDnsAaaaRecordOnLaunch;
    private final @Nullable List<GetSubnetFilter> filters;
    private final String id;
    private final String ipv6CidrBlock;
    /**
     * Association ID of the IPv6 CIDR block.
     * 
     */
    private final String ipv6CidrBlockAssociationId;
    /**
     * Indicates whether this is an IPv6-only subnet.
     * 
     */
    private final Boolean ipv6Native;
    /**
     * Whether customer owned IP addresses are assigned on network interface creation.
     * 
     */
    private final Boolean mapCustomerOwnedIpOnLaunch;
    /**
     * Whether public IP addresses are assigned on instance launch.
     * 
     */
    private final Boolean mapPublicIpOnLaunch;
    /**
     * ARN of the Outpost.
     * 
     */
    private final String outpostArn;
    /**
     * ID of the AWS account that owns the subnet.
     * 
     */
    private final String ownerId;
    /**
     * The type of hostnames assigned to instances in the subnet at launch.
     * 
     */
    private final String privateDnsHostnameTypeOnLaunch;
    private final String state;
    private final Map<String,String> tags;
    private final String vpcId;

    @OutputCustomType.Constructor({"arn","assignIpv6AddressOnCreation","availabilityZone","availabilityZoneId","availableIpAddressCount","cidrBlock","customerOwnedIpv4Pool","defaultForAz","enableDns64","enableResourceNameDnsARecordOnLaunch","enableResourceNameDnsAaaaRecordOnLaunch","filters","id","ipv6CidrBlock","ipv6CidrBlockAssociationId","ipv6Native","mapCustomerOwnedIpOnLaunch","mapPublicIpOnLaunch","outpostArn","ownerId","privateDnsHostnameTypeOnLaunch","state","tags","vpcId"})
    private GetSubnetResult(
        String arn,
        Boolean assignIpv6AddressOnCreation,
        String availabilityZone,
        String availabilityZoneId,
        Integer availableIpAddressCount,
        String cidrBlock,
        String customerOwnedIpv4Pool,
        Boolean defaultForAz,
        Boolean enableDns64,
        Boolean enableResourceNameDnsARecordOnLaunch,
        Boolean enableResourceNameDnsAaaaRecordOnLaunch,
        @Nullable List<GetSubnetFilter> filters,
        String id,
        String ipv6CidrBlock,
        String ipv6CidrBlockAssociationId,
        Boolean ipv6Native,
        Boolean mapCustomerOwnedIpOnLaunch,
        Boolean mapPublicIpOnLaunch,
        String outpostArn,
        String ownerId,
        String privateDnsHostnameTypeOnLaunch,
        String state,
        Map<String,String> tags,
        String vpcId) {
        this.arn = Objects.requireNonNull(arn);
        this.assignIpv6AddressOnCreation = Objects.requireNonNull(assignIpv6AddressOnCreation);
        this.availabilityZone = Objects.requireNonNull(availabilityZone);
        this.availabilityZoneId = Objects.requireNonNull(availabilityZoneId);
        this.availableIpAddressCount = Objects.requireNonNull(availableIpAddressCount);
        this.cidrBlock = Objects.requireNonNull(cidrBlock);
        this.customerOwnedIpv4Pool = Objects.requireNonNull(customerOwnedIpv4Pool);
        this.defaultForAz = Objects.requireNonNull(defaultForAz);
        this.enableDns64 = Objects.requireNonNull(enableDns64);
        this.enableResourceNameDnsARecordOnLaunch = Objects.requireNonNull(enableResourceNameDnsARecordOnLaunch);
        this.enableResourceNameDnsAaaaRecordOnLaunch = Objects.requireNonNull(enableResourceNameDnsAaaaRecordOnLaunch);
        this.filters = filters;
        this.id = Objects.requireNonNull(id);
        this.ipv6CidrBlock = Objects.requireNonNull(ipv6CidrBlock);
        this.ipv6CidrBlockAssociationId = Objects.requireNonNull(ipv6CidrBlockAssociationId);
        this.ipv6Native = Objects.requireNonNull(ipv6Native);
        this.mapCustomerOwnedIpOnLaunch = Objects.requireNonNull(mapCustomerOwnedIpOnLaunch);
        this.mapPublicIpOnLaunch = Objects.requireNonNull(mapPublicIpOnLaunch);
        this.outpostArn = Objects.requireNonNull(outpostArn);
        this.ownerId = Objects.requireNonNull(ownerId);
        this.privateDnsHostnameTypeOnLaunch = Objects.requireNonNull(privateDnsHostnameTypeOnLaunch);
        this.state = Objects.requireNonNull(state);
        this.tags = Objects.requireNonNull(tags);
        this.vpcId = Objects.requireNonNull(vpcId);
    }

    /**
     * ARN of the subnet.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * Whether an IPv6 address is assigned on creation.
     * 
    */
    public Boolean getAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation;
    }
    public String getAvailabilityZone() {
        return this.availabilityZone;
    }
    public String getAvailabilityZoneId() {
        return this.availabilityZoneId;
    }
    /**
     * Available IP addresses of the subnet.
     * 
    */
    public Integer getAvailableIpAddressCount() {
        return this.availableIpAddressCount;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }
    /**
     * Identifier of customer owned IPv4 address pool.
     * 
    */
    public String getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }
    public Boolean getDefaultForAz() {
        return this.defaultForAz;
    }
    /**
     * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet return synthetic IPv6 addresses for IPv4-only destinations.
     * 
    */
    public Boolean getEnableDns64() {
        return this.enableDns64;
    }
    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
     * 
    */
    public Boolean getEnableResourceNameDnsARecordOnLaunch() {
        return this.enableResourceNameDnsARecordOnLaunch;
    }
    /**
     * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
     * 
    */
    public Boolean getEnableResourceNameDnsAaaaRecordOnLaunch() {
        return this.enableResourceNameDnsAaaaRecordOnLaunch;
    }
    public List<GetSubnetFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String getId() {
        return this.id;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }
    /**
     * Association ID of the IPv6 CIDR block.
     * 
    */
    public String getIpv6CidrBlockAssociationId() {
        return this.ipv6CidrBlockAssociationId;
    }
    /**
     * Indicates whether this is an IPv6-only subnet.
     * 
    */
    public Boolean getIpv6Native() {
        return this.ipv6Native;
    }
    /**
     * Whether customer owned IP addresses are assigned on network interface creation.
     * 
    */
    public Boolean getMapCustomerOwnedIpOnLaunch() {
        return this.mapCustomerOwnedIpOnLaunch;
    }
    /**
     * Whether public IP addresses are assigned on instance launch.
     * 
    */
    public Boolean getMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch;
    }
    /**
     * ARN of the Outpost.
     * 
    */
    public String getOutpostArn() {
        return this.outpostArn;
    }
    /**
     * ID of the AWS account that owns the subnet.
     * 
    */
    public String getOwnerId() {
        return this.ownerId;
    }
    /**
     * The type of hostnames assigned to instances in the subnet at launch.
     * 
    */
    public String getPrivateDnsHostnameTypeOnLaunch() {
        return this.privateDnsHostnameTypeOnLaunch;
    }
    public String getState() {
        return this.state;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubnetResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private Boolean assignIpv6AddressOnCreation;
        private String availabilityZone;
        private String availabilityZoneId;
        private Integer availableIpAddressCount;
        private String cidrBlock;
        private String customerOwnedIpv4Pool;
        private Boolean defaultForAz;
        private Boolean enableDns64;
        private Boolean enableResourceNameDnsARecordOnLaunch;
        private Boolean enableResourceNameDnsAaaaRecordOnLaunch;
        private @Nullable List<GetSubnetFilter> filters;
        private String id;
        private String ipv6CidrBlock;
        private String ipv6CidrBlockAssociationId;
        private Boolean ipv6Native;
        private Boolean mapCustomerOwnedIpOnLaunch;
        private Boolean mapPublicIpOnLaunch;
        private String outpostArn;
        private String ownerId;
        private String privateDnsHostnameTypeOnLaunch;
        private String state;
        private Map<String,String> tags;
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubnetResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assignIpv6AddressOnCreation = defaults.assignIpv6AddressOnCreation;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.availableIpAddressCount = defaults.availableIpAddressCount;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.customerOwnedIpv4Pool = defaults.customerOwnedIpv4Pool;
    	      this.defaultForAz = defaults.defaultForAz;
    	      this.enableDns64 = defaults.enableDns64;
    	      this.enableResourceNameDnsARecordOnLaunch = defaults.enableResourceNameDnsARecordOnLaunch;
    	      this.enableResourceNameDnsAaaaRecordOnLaunch = defaults.enableResourceNameDnsAaaaRecordOnLaunch;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.ipv6CidrBlockAssociationId = defaults.ipv6CidrBlockAssociationId;
    	      this.ipv6Native = defaults.ipv6Native;
    	      this.mapCustomerOwnedIpOnLaunch = defaults.mapCustomerOwnedIpOnLaunch;
    	      this.mapPublicIpOnLaunch = defaults.mapPublicIpOnLaunch;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerId = defaults.ownerId;
    	      this.privateDnsHostnameTypeOnLaunch = defaults.privateDnsHostnameTypeOnLaunch;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAssignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
            this.assignIpv6AddressOnCreation = Objects.requireNonNull(assignIpv6AddressOnCreation);
            return this;
        }

        public Builder setAvailabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }

        public Builder setAvailabilityZoneId(String availabilityZoneId) {
            this.availabilityZoneId = Objects.requireNonNull(availabilityZoneId);
            return this;
        }

        public Builder setAvailableIpAddressCount(Integer availableIpAddressCount) {
            this.availableIpAddressCount = Objects.requireNonNull(availableIpAddressCount);
            return this;
        }

        public Builder setCidrBlock(String cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder setCustomerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = Objects.requireNonNull(customerOwnedIpv4Pool);
            return this;
        }

        public Builder setDefaultForAz(Boolean defaultForAz) {
            this.defaultForAz = Objects.requireNonNull(defaultForAz);
            return this;
        }

        public Builder setEnableDns64(Boolean enableDns64) {
            this.enableDns64 = Objects.requireNonNull(enableDns64);
            return this;
        }

        public Builder setEnableResourceNameDnsARecordOnLaunch(Boolean enableResourceNameDnsARecordOnLaunch) {
            this.enableResourceNameDnsARecordOnLaunch = Objects.requireNonNull(enableResourceNameDnsARecordOnLaunch);
            return this;
        }

        public Builder setEnableResourceNameDnsAaaaRecordOnLaunch(Boolean enableResourceNameDnsAaaaRecordOnLaunch) {
            this.enableResourceNameDnsAaaaRecordOnLaunch = Objects.requireNonNull(enableResourceNameDnsAaaaRecordOnLaunch);
            return this;
        }

        public Builder setFilters(@Nullable List<GetSubnetFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIpv6CidrBlock(String ipv6CidrBlock) {
            this.ipv6CidrBlock = Objects.requireNonNull(ipv6CidrBlock);
            return this;
        }

        public Builder setIpv6CidrBlockAssociationId(String ipv6CidrBlockAssociationId) {
            this.ipv6CidrBlockAssociationId = Objects.requireNonNull(ipv6CidrBlockAssociationId);
            return this;
        }

        public Builder setIpv6Native(Boolean ipv6Native) {
            this.ipv6Native = Objects.requireNonNull(ipv6Native);
            return this;
        }

        public Builder setMapCustomerOwnedIpOnLaunch(Boolean mapCustomerOwnedIpOnLaunch) {
            this.mapCustomerOwnedIpOnLaunch = Objects.requireNonNull(mapCustomerOwnedIpOnLaunch);
            return this;
        }

        public Builder setMapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
            this.mapPublicIpOnLaunch = Objects.requireNonNull(mapPublicIpOnLaunch);
            return this;
        }

        public Builder setOutpostArn(String outpostArn) {
            this.outpostArn = Objects.requireNonNull(outpostArn);
            return this;
        }

        public Builder setOwnerId(String ownerId) {
            this.ownerId = Objects.requireNonNull(ownerId);
            return this;
        }

        public Builder setPrivateDnsHostnameTypeOnLaunch(String privateDnsHostnameTypeOnLaunch) {
            this.privateDnsHostnameTypeOnLaunch = Objects.requireNonNull(privateDnsHostnameTypeOnLaunch);
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetSubnetResult build() {
            return new GetSubnetResult(arn, assignIpv6AddressOnCreation, availabilityZone, availabilityZoneId, availableIpAddressCount, cidrBlock, customerOwnedIpv4Pool, defaultForAz, enableDns64, enableResourceNameDnsARecordOnLaunch, enableResourceNameDnsAaaaRecordOnLaunch, filters, id, ipv6CidrBlock, ipv6CidrBlockAssociationId, ipv6Native, mapCustomerOwnedIpOnLaunch, mapPublicIpOnLaunch, outpostArn, ownerId, privateDnsHostnameTypeOnLaunch, state, tags, vpcId);
        }
    }
}