// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DefaultSubnetState extends io.pulumi.resources.ResourceArgs {

    public static final DefaultSubnetState Empty = new DefaultSubnetState();

    /**
     * ARN for the subnet.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Input<String> arn;

    public Input<String> getArn() {
        return this.arn == null ? Input.empty() : this.arn;
    }

    /**
     * Whether IPv6 addresses are assigned on creation.
     * * `availability_zone_id`- AZ ID of the subnet.
     * 
     */
    @InputImport(name="assignIpv6AddressOnCreation")
      private final @Nullable Input<Boolean> assignIpv6AddressOnCreation;

    public Input<Boolean> getAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation == null ? Input.empty() : this.assignIpv6AddressOnCreation;
    }

    /**
     * AZ for the subnet.
     * 
     */
    @InputImport(name="availabilityZone")
      private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    @InputImport(name="availabilityZoneId")
      private final @Nullable Input<String> availabilityZoneId;

    public Input<String> getAvailabilityZoneId() {
        return this.availabilityZoneId == null ? Input.empty() : this.availabilityZoneId;
    }

    /**
     * CIDR block for the subnet.
     * 
     */
    @InputImport(name="cidrBlock")
      private final @Nullable Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock == null ? Input.empty() : this.cidrBlock;
    }

    @InputImport(name="customerOwnedIpv4Pool")
      private final @Nullable Input<String> customerOwnedIpv4Pool;

    public Input<String> getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool == null ? Input.empty() : this.customerOwnedIpv4Pool;
    }

    @InputImport(name="enableDns64")
      private final @Nullable Input<Boolean> enableDns64;

    public Input<Boolean> getEnableDns64() {
        return this.enableDns64 == null ? Input.empty() : this.enableDns64;
    }

    @InputImport(name="enableResourceNameDnsARecordOnLaunch")
      private final @Nullable Input<Boolean> enableResourceNameDnsARecordOnLaunch;

    public Input<Boolean> getEnableResourceNameDnsARecordOnLaunch() {
        return this.enableResourceNameDnsARecordOnLaunch == null ? Input.empty() : this.enableResourceNameDnsARecordOnLaunch;
    }

    @InputImport(name="enableResourceNameDnsAaaaRecordOnLaunch")
      private final @Nullable Input<Boolean> enableResourceNameDnsAaaaRecordOnLaunch;

    public Input<Boolean> getEnableResourceNameDnsAaaaRecordOnLaunch() {
        return this.enableResourceNameDnsAaaaRecordOnLaunch == null ? Input.empty() : this.enableResourceNameDnsAaaaRecordOnLaunch;
    }

    /**
     * IPv6 CIDR block.
     * 
     */
    @InputImport(name="ipv6CidrBlock")
      private final @Nullable Input<String> ipv6CidrBlock;

    public Input<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Input.empty() : this.ipv6CidrBlock;
    }

    @InputImport(name="ipv6CidrBlockAssociationId")
      private final @Nullable Input<String> ipv6CidrBlockAssociationId;

    public Input<String> getIpv6CidrBlockAssociationId() {
        return this.ipv6CidrBlockAssociationId == null ? Input.empty() : this.ipv6CidrBlockAssociationId;
    }

    @InputImport(name="ipv6Native")
      private final @Nullable Input<Boolean> ipv6Native;

    public Input<Boolean> getIpv6Native() {
        return this.ipv6Native == null ? Input.empty() : this.ipv6Native;
    }

    @InputImport(name="mapCustomerOwnedIpOnLaunch")
      private final @Nullable Input<Boolean> mapCustomerOwnedIpOnLaunch;

    public Input<Boolean> getMapCustomerOwnedIpOnLaunch() {
        return this.mapCustomerOwnedIpOnLaunch == null ? Input.empty() : this.mapCustomerOwnedIpOnLaunch;
    }

    /**
     * Whether instances launched into the subnet should be assigned a public IP address.
     * 
     */
    @InputImport(name="mapPublicIpOnLaunch")
      private final @Nullable Input<Boolean> mapPublicIpOnLaunch;

    public Input<Boolean> getMapPublicIpOnLaunch() {
        return this.mapPublicIpOnLaunch == null ? Input.empty() : this.mapPublicIpOnLaunch;
    }

    @InputImport(name="outpostArn")
      private final @Nullable Input<String> outpostArn;

    public Input<String> getOutpostArn() {
        return this.outpostArn == null ? Input.empty() : this.outpostArn;
    }

    /**
     * ID of the AWS account that owns the subnet.
     * 
     */
    @InputImport(name="ownerId")
      private final @Nullable Input<String> ownerId;

    public Input<String> getOwnerId() {
        return this.ownerId == null ? Input.empty() : this.ownerId;
    }

    @InputImport(name="privateDnsHostnameTypeOnLaunch")
      private final @Nullable Input<String> privateDnsHostnameTypeOnLaunch;

    public Input<String> getPrivateDnsHostnameTypeOnLaunch() {
        return this.privateDnsHostnameTypeOnLaunch == null ? Input.empty() : this.privateDnsHostnameTypeOnLaunch;
    }

    /**
     * Map of tags to assign to the resource.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="tagsAll")
      private final @Nullable Input<Map<String,String>> tagsAll;

    public Input<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Input.empty() : this.tagsAll;
    }

    /**
     * VPC ID.
     * 
     */
    @InputImport(name="vpcId")
      private final @Nullable Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId == null ? Input.empty() : this.vpcId;
    }

    public DefaultSubnetState(
        @Nullable Input<String> arn,
        @Nullable Input<Boolean> assignIpv6AddressOnCreation,
        @Nullable Input<String> availabilityZone,
        @Nullable Input<String> availabilityZoneId,
        @Nullable Input<String> cidrBlock,
        @Nullable Input<String> customerOwnedIpv4Pool,
        @Nullable Input<Boolean> enableDns64,
        @Nullable Input<Boolean> enableResourceNameDnsARecordOnLaunch,
        @Nullable Input<Boolean> enableResourceNameDnsAaaaRecordOnLaunch,
        @Nullable Input<String> ipv6CidrBlock,
        @Nullable Input<String> ipv6CidrBlockAssociationId,
        @Nullable Input<Boolean> ipv6Native,
        @Nullable Input<Boolean> mapCustomerOwnedIpOnLaunch,
        @Nullable Input<Boolean> mapPublicIpOnLaunch,
        @Nullable Input<String> outpostArn,
        @Nullable Input<String> ownerId,
        @Nullable Input<String> privateDnsHostnameTypeOnLaunch,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<Map<String,String>> tagsAll,
        @Nullable Input<String> vpcId) {
        this.arn = arn;
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
        this.availabilityZone = availabilityZone;
        this.availabilityZoneId = availabilityZoneId;
        this.cidrBlock = cidrBlock;
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
        this.enableDns64 = enableDns64;
        this.enableResourceNameDnsARecordOnLaunch = enableResourceNameDnsARecordOnLaunch;
        this.enableResourceNameDnsAaaaRecordOnLaunch = enableResourceNameDnsAaaaRecordOnLaunch;
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.ipv6CidrBlockAssociationId = ipv6CidrBlockAssociationId;
        this.ipv6Native = ipv6Native;
        this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
        this.outpostArn = outpostArn;
        this.ownerId = ownerId;
        this.privateDnsHostnameTypeOnLaunch = privateDnsHostnameTypeOnLaunch;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcId = vpcId;
    }

    private DefaultSubnetState() {
        this.arn = Input.empty();
        this.assignIpv6AddressOnCreation = Input.empty();
        this.availabilityZone = Input.empty();
        this.availabilityZoneId = Input.empty();
        this.cidrBlock = Input.empty();
        this.customerOwnedIpv4Pool = Input.empty();
        this.enableDns64 = Input.empty();
        this.enableResourceNameDnsARecordOnLaunch = Input.empty();
        this.enableResourceNameDnsAaaaRecordOnLaunch = Input.empty();
        this.ipv6CidrBlock = Input.empty();
        this.ipv6CidrBlockAssociationId = Input.empty();
        this.ipv6Native = Input.empty();
        this.mapCustomerOwnedIpOnLaunch = Input.empty();
        this.mapPublicIpOnLaunch = Input.empty();
        this.outpostArn = Input.empty();
        this.ownerId = Input.empty();
        this.privateDnsHostnameTypeOnLaunch = Input.empty();
        this.tags = Input.empty();
        this.tagsAll = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefaultSubnetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> arn;
        private @Nullable Input<Boolean> assignIpv6AddressOnCreation;
        private @Nullable Input<String> availabilityZone;
        private @Nullable Input<String> availabilityZoneId;
        private @Nullable Input<String> cidrBlock;
        private @Nullable Input<String> customerOwnedIpv4Pool;
        private @Nullable Input<Boolean> enableDns64;
        private @Nullable Input<Boolean> enableResourceNameDnsARecordOnLaunch;
        private @Nullable Input<Boolean> enableResourceNameDnsAaaaRecordOnLaunch;
        private @Nullable Input<String> ipv6CidrBlock;
        private @Nullable Input<String> ipv6CidrBlockAssociationId;
        private @Nullable Input<Boolean> ipv6Native;
        private @Nullable Input<Boolean> mapCustomerOwnedIpOnLaunch;
        private @Nullable Input<Boolean> mapPublicIpOnLaunch;
        private @Nullable Input<String> outpostArn;
        private @Nullable Input<String> ownerId;
        private @Nullable Input<String> privateDnsHostnameTypeOnLaunch;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<Map<String,String>> tagsAll;
        private @Nullable Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(DefaultSubnetState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.assignIpv6AddressOnCreation = defaults.assignIpv6AddressOnCreation;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.availabilityZoneId = defaults.availabilityZoneId;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.customerOwnedIpv4Pool = defaults.customerOwnedIpv4Pool;
    	      this.enableDns64 = defaults.enableDns64;
    	      this.enableResourceNameDnsARecordOnLaunch = defaults.enableResourceNameDnsARecordOnLaunch;
    	      this.enableResourceNameDnsAaaaRecordOnLaunch = defaults.enableResourceNameDnsAaaaRecordOnLaunch;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.ipv6CidrBlockAssociationId = defaults.ipv6CidrBlockAssociationId;
    	      this.ipv6Native = defaults.ipv6Native;
    	      this.mapCustomerOwnedIpOnLaunch = defaults.mapCustomerOwnedIpOnLaunch;
    	      this.mapPublicIpOnLaunch = defaults.mapPublicIpOnLaunch;
    	      this.outpostArn = defaults.outpostArn;
    	      this.ownerId = defaults.ownerId;
    	      this.privateDnsHostnameTypeOnLaunch = defaults.privateDnsHostnameTypeOnLaunch;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setArn(@Nullable Input<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = Input.ofNullable(arn);
            return this;
        }

        public Builder setAssignIpv6AddressOnCreation(@Nullable Input<Boolean> assignIpv6AddressOnCreation) {
            this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
            return this;
        }

        public Builder setAssignIpv6AddressOnCreation(@Nullable Boolean assignIpv6AddressOnCreation) {
            this.assignIpv6AddressOnCreation = Input.ofNullable(assignIpv6AddressOnCreation);
            return this;
        }

        public Builder setAvailabilityZone(@Nullable Input<String> availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }

        public Builder setAvailabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = Input.ofNullable(availabilityZone);
            return this;
        }

        public Builder setAvailabilityZoneId(@Nullable Input<String> availabilityZoneId) {
            this.availabilityZoneId = availabilityZoneId;
            return this;
        }

        public Builder setAvailabilityZoneId(@Nullable String availabilityZoneId) {
            this.availabilityZoneId = Input.ofNullable(availabilityZoneId);
            return this;
        }

        public Builder setCidrBlock(@Nullable Input<String> cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        public Builder setCidrBlock(@Nullable String cidrBlock) {
            this.cidrBlock = Input.ofNullable(cidrBlock);
            return this;
        }

        public Builder setCustomerOwnedIpv4Pool(@Nullable Input<String> customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            return this;
        }

        public Builder setCustomerOwnedIpv4Pool(@Nullable String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = Input.ofNullable(customerOwnedIpv4Pool);
            return this;
        }

        public Builder setEnableDns64(@Nullable Input<Boolean> enableDns64) {
            this.enableDns64 = enableDns64;
            return this;
        }

        public Builder setEnableDns64(@Nullable Boolean enableDns64) {
            this.enableDns64 = Input.ofNullable(enableDns64);
            return this;
        }

        public Builder setEnableResourceNameDnsARecordOnLaunch(@Nullable Input<Boolean> enableResourceNameDnsARecordOnLaunch) {
            this.enableResourceNameDnsARecordOnLaunch = enableResourceNameDnsARecordOnLaunch;
            return this;
        }

        public Builder setEnableResourceNameDnsARecordOnLaunch(@Nullable Boolean enableResourceNameDnsARecordOnLaunch) {
            this.enableResourceNameDnsARecordOnLaunch = Input.ofNullable(enableResourceNameDnsARecordOnLaunch);
            return this;
        }

        public Builder setEnableResourceNameDnsAaaaRecordOnLaunch(@Nullable Input<Boolean> enableResourceNameDnsAaaaRecordOnLaunch) {
            this.enableResourceNameDnsAaaaRecordOnLaunch = enableResourceNameDnsAaaaRecordOnLaunch;
            return this;
        }

        public Builder setEnableResourceNameDnsAaaaRecordOnLaunch(@Nullable Boolean enableResourceNameDnsAaaaRecordOnLaunch) {
            this.enableResourceNameDnsAaaaRecordOnLaunch = Input.ofNullable(enableResourceNameDnsAaaaRecordOnLaunch);
            return this;
        }

        public Builder setIpv6CidrBlock(@Nullable Input<String> ipv6CidrBlock) {
            this.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        public Builder setIpv6CidrBlock(@Nullable String ipv6CidrBlock) {
            this.ipv6CidrBlock = Input.ofNullable(ipv6CidrBlock);
            return this;
        }

        public Builder setIpv6CidrBlockAssociationId(@Nullable Input<String> ipv6CidrBlockAssociationId) {
            this.ipv6CidrBlockAssociationId = ipv6CidrBlockAssociationId;
            return this;
        }

        public Builder setIpv6CidrBlockAssociationId(@Nullable String ipv6CidrBlockAssociationId) {
            this.ipv6CidrBlockAssociationId = Input.ofNullable(ipv6CidrBlockAssociationId);
            return this;
        }

        public Builder setIpv6Native(@Nullable Input<Boolean> ipv6Native) {
            this.ipv6Native = ipv6Native;
            return this;
        }

        public Builder setIpv6Native(@Nullable Boolean ipv6Native) {
            this.ipv6Native = Input.ofNullable(ipv6Native);
            return this;
        }

        public Builder setMapCustomerOwnedIpOnLaunch(@Nullable Input<Boolean> mapCustomerOwnedIpOnLaunch) {
            this.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
            return this;
        }

        public Builder setMapCustomerOwnedIpOnLaunch(@Nullable Boolean mapCustomerOwnedIpOnLaunch) {
            this.mapCustomerOwnedIpOnLaunch = Input.ofNullable(mapCustomerOwnedIpOnLaunch);
            return this;
        }

        public Builder setMapPublicIpOnLaunch(@Nullable Input<Boolean> mapPublicIpOnLaunch) {
            this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
            return this;
        }

        public Builder setMapPublicIpOnLaunch(@Nullable Boolean mapPublicIpOnLaunch) {
            this.mapPublicIpOnLaunch = Input.ofNullable(mapPublicIpOnLaunch);
            return this;
        }

        public Builder setOutpostArn(@Nullable Input<String> outpostArn) {
            this.outpostArn = outpostArn;
            return this;
        }

        public Builder setOutpostArn(@Nullable String outpostArn) {
            this.outpostArn = Input.ofNullable(outpostArn);
            return this;
        }

        public Builder setOwnerId(@Nullable Input<String> ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        public Builder setOwnerId(@Nullable String ownerId) {
            this.ownerId = Input.ofNullable(ownerId);
            return this;
        }

        public Builder setPrivateDnsHostnameTypeOnLaunch(@Nullable Input<String> privateDnsHostnameTypeOnLaunch) {
            this.privateDnsHostnameTypeOnLaunch = privateDnsHostnameTypeOnLaunch;
            return this;
        }

        public Builder setPrivateDnsHostnameTypeOnLaunch(@Nullable String privateDnsHostnameTypeOnLaunch) {
            this.privateDnsHostnameTypeOnLaunch = Input.ofNullable(privateDnsHostnameTypeOnLaunch);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setTagsAll(@Nullable Input<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder setTagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Input.ofNullable(tagsAll);
            return this;
        }

        public Builder setVpcId(@Nullable Input<String> vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public Builder setVpcId(@Nullable String vpcId) {
            this.vpcId = Input.ofNullable(vpcId);
            return this;
        }
        public DefaultSubnetState build() {
            return new DefaultSubnetState(arn, assignIpv6AddressOnCreation, availabilityZone, availabilityZoneId, cidrBlock, customerOwnedIpv4Pool, enableDns64, enableResourceNameDnsARecordOnLaunch, enableResourceNameDnsAaaaRecordOnLaunch, ipv6CidrBlock, ipv6CidrBlockAssociationId, ipv6Native, mapCustomerOwnedIpOnLaunch, mapPublicIpOnLaunch, outpostArn, ownerId, privateDnsHostnameTypeOnLaunch, tags, tagsAll, vpcId);
        }
    }
}