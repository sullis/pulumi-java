// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DefaultSubnetState extends com.pulumi.resources.ResourceArgs {

    public static final DefaultSubnetState Empty = new DefaultSubnetState();

    /**
     * ARN for the subnet.
     * 
     */
    @Import(name="arn")
    private @Nullable Output<String> arn;

    /**
     * @return ARN for the subnet.
     * 
     */
    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * Whether IPv6 addresses are assigned on creation.
     * * `availability_zone_id`- AZ ID of the subnet.
     * 
     */
    @Import(name="assignIpv6AddressOnCreation")
    private @Nullable Output<Boolean> assignIpv6AddressOnCreation;

    /**
     * @return Whether IPv6 addresses are assigned on creation.
     * * `availability_zone_id`- AZ ID of the subnet.
     * 
     */
    public Optional<Output<Boolean>> assignIpv6AddressOnCreation() {
        return Optional.ofNullable(this.assignIpv6AddressOnCreation);
    }

    /**
     * AZ for the subnet.
     * 
     */
    @Import(name="availabilityZone")
    private @Nullable Output<String> availabilityZone;

    /**
     * @return AZ for the subnet.
     * 
     */
    public Optional<Output<String>> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    @Import(name="availabilityZoneId")
    private @Nullable Output<String> availabilityZoneId;

    public Optional<Output<String>> availabilityZoneId() {
        return Optional.ofNullable(this.availabilityZoneId);
    }

    /**
     * CIDR block for the subnet.
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable Output<String> cidrBlock;

    /**
     * @return CIDR block for the subnet.
     * 
     */
    public Optional<Output<String>> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    @Import(name="customerOwnedIpv4Pool")
    private @Nullable Output<String> customerOwnedIpv4Pool;

    public Optional<Output<String>> customerOwnedIpv4Pool() {
        return Optional.ofNullable(this.customerOwnedIpv4Pool);
    }

    @Import(name="enableDns64")
    private @Nullable Output<Boolean> enableDns64;

    public Optional<Output<Boolean>> enableDns64() {
        return Optional.ofNullable(this.enableDns64);
    }

    @Import(name="enableResourceNameDnsARecordOnLaunch")
    private @Nullable Output<Boolean> enableResourceNameDnsARecordOnLaunch;

    public Optional<Output<Boolean>> enableResourceNameDnsARecordOnLaunch() {
        return Optional.ofNullable(this.enableResourceNameDnsARecordOnLaunch);
    }

    @Import(name="enableResourceNameDnsAaaaRecordOnLaunch")
    private @Nullable Output<Boolean> enableResourceNameDnsAaaaRecordOnLaunch;

    public Optional<Output<Boolean>> enableResourceNameDnsAaaaRecordOnLaunch() {
        return Optional.ofNullable(this.enableResourceNameDnsAaaaRecordOnLaunch);
    }

    /**
     * IPv6 CIDR block.
     * 
     */
    @Import(name="ipv6CidrBlock")
    private @Nullable Output<String> ipv6CidrBlock;

    /**
     * @return IPv6 CIDR block.
     * 
     */
    public Optional<Output<String>> ipv6CidrBlock() {
        return Optional.ofNullable(this.ipv6CidrBlock);
    }

    @Import(name="ipv6CidrBlockAssociationId")
    private @Nullable Output<String> ipv6CidrBlockAssociationId;

    public Optional<Output<String>> ipv6CidrBlockAssociationId() {
        return Optional.ofNullable(this.ipv6CidrBlockAssociationId);
    }

    @Import(name="ipv6Native")
    private @Nullable Output<Boolean> ipv6Native;

    public Optional<Output<Boolean>> ipv6Native() {
        return Optional.ofNullable(this.ipv6Native);
    }

    @Import(name="mapCustomerOwnedIpOnLaunch")
    private @Nullable Output<Boolean> mapCustomerOwnedIpOnLaunch;

    public Optional<Output<Boolean>> mapCustomerOwnedIpOnLaunch() {
        return Optional.ofNullable(this.mapCustomerOwnedIpOnLaunch);
    }

    /**
     * Whether instances launched into the subnet should be assigned a public IP address.
     * 
     */
    @Import(name="mapPublicIpOnLaunch")
    private @Nullable Output<Boolean> mapPublicIpOnLaunch;

    /**
     * @return Whether instances launched into the subnet should be assigned a public IP address.
     * 
     */
    public Optional<Output<Boolean>> mapPublicIpOnLaunch() {
        return Optional.ofNullable(this.mapPublicIpOnLaunch);
    }

    @Import(name="outpostArn")
    private @Nullable Output<String> outpostArn;

    public Optional<Output<String>> outpostArn() {
        return Optional.ofNullable(this.outpostArn);
    }

    /**
     * ID of the AWS account that owns the subnet.
     * 
     */
    @Import(name="ownerId")
    private @Nullable Output<String> ownerId;

    /**
     * @return ID of the AWS account that owns the subnet.
     * 
     */
    public Optional<Output<String>> ownerId() {
        return Optional.ofNullable(this.ownerId);
    }

    @Import(name="privateDnsHostnameTypeOnLaunch")
    private @Nullable Output<String> privateDnsHostnameTypeOnLaunch;

    public Optional<Output<String>> privateDnsHostnameTypeOnLaunch() {
        return Optional.ofNullable(this.privateDnsHostnameTypeOnLaunch);
    }

    /**
     * Map of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    @Import(name="tagsAll")
    private @Nullable Output<Map<String,String>> tagsAll;

    public Optional<Output<Map<String,String>>> tagsAll() {
        return Optional.ofNullable(this.tagsAll);
    }

    /**
     * VPC ID.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return VPC ID.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private DefaultSubnetState() {}

    private DefaultSubnetState(DefaultSubnetState $) {
        this.arn = $.arn;
        this.assignIpv6AddressOnCreation = $.assignIpv6AddressOnCreation;
        this.availabilityZone = $.availabilityZone;
        this.availabilityZoneId = $.availabilityZoneId;
        this.cidrBlock = $.cidrBlock;
        this.customerOwnedIpv4Pool = $.customerOwnedIpv4Pool;
        this.enableDns64 = $.enableDns64;
        this.enableResourceNameDnsARecordOnLaunch = $.enableResourceNameDnsARecordOnLaunch;
        this.enableResourceNameDnsAaaaRecordOnLaunch = $.enableResourceNameDnsAaaaRecordOnLaunch;
        this.ipv6CidrBlock = $.ipv6CidrBlock;
        this.ipv6CidrBlockAssociationId = $.ipv6CidrBlockAssociationId;
        this.ipv6Native = $.ipv6Native;
        this.mapCustomerOwnedIpOnLaunch = $.mapCustomerOwnedIpOnLaunch;
        this.mapPublicIpOnLaunch = $.mapPublicIpOnLaunch;
        this.outpostArn = $.outpostArn;
        this.ownerId = $.ownerId;
        this.privateDnsHostnameTypeOnLaunch = $.privateDnsHostnameTypeOnLaunch;
        this.tags = $.tags;
        this.tagsAll = $.tagsAll;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DefaultSubnetState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DefaultSubnetState $;

        public Builder() {
            $ = new DefaultSubnetState();
        }

        public Builder(DefaultSubnetState defaults) {
            $ = new DefaultSubnetState(Objects.requireNonNull(defaults));
        }

        /**
         * @param arn ARN for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        /**
         * @param arn ARN for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        /**
         * @param assignIpv6AddressOnCreation Whether IPv6 addresses are assigned on creation.
         * * `availability_zone_id`- AZ ID of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder assignIpv6AddressOnCreation(@Nullable Output<Boolean> assignIpv6AddressOnCreation) {
            $.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
            return this;
        }

        /**
         * @param assignIpv6AddressOnCreation Whether IPv6 addresses are assigned on creation.
         * * `availability_zone_id`- AZ ID of the subnet.
         * 
         * @return builder
         * 
         */
        public Builder assignIpv6AddressOnCreation(Boolean assignIpv6AddressOnCreation) {
            return assignIpv6AddressOnCreation(Output.of(assignIpv6AddressOnCreation));
        }

        /**
         * @param availabilityZone AZ for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(@Nullable Output<String> availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param availabilityZone AZ for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(String availabilityZone) {
            return availabilityZone(Output.of(availabilityZone));
        }

        public Builder availabilityZoneId(@Nullable Output<String> availabilityZoneId) {
            $.availabilityZoneId = availabilityZoneId;
            return this;
        }

        public Builder availabilityZoneId(String availabilityZoneId) {
            return availabilityZoneId(Output.of(availabilityZoneId));
        }

        /**
         * @param cidrBlock CIDR block for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(@Nullable Output<String> cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param cidrBlock CIDR block for the subnet.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(String cidrBlock) {
            return cidrBlock(Output.of(cidrBlock));
        }

        public Builder customerOwnedIpv4Pool(@Nullable Output<String> customerOwnedIpv4Pool) {
            $.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
            return this;
        }

        public Builder customerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
            return customerOwnedIpv4Pool(Output.of(customerOwnedIpv4Pool));
        }

        public Builder enableDns64(@Nullable Output<Boolean> enableDns64) {
            $.enableDns64 = enableDns64;
            return this;
        }

        public Builder enableDns64(Boolean enableDns64) {
            return enableDns64(Output.of(enableDns64));
        }

        public Builder enableResourceNameDnsARecordOnLaunch(@Nullable Output<Boolean> enableResourceNameDnsARecordOnLaunch) {
            $.enableResourceNameDnsARecordOnLaunch = enableResourceNameDnsARecordOnLaunch;
            return this;
        }

        public Builder enableResourceNameDnsARecordOnLaunch(Boolean enableResourceNameDnsARecordOnLaunch) {
            return enableResourceNameDnsARecordOnLaunch(Output.of(enableResourceNameDnsARecordOnLaunch));
        }

        public Builder enableResourceNameDnsAaaaRecordOnLaunch(@Nullable Output<Boolean> enableResourceNameDnsAaaaRecordOnLaunch) {
            $.enableResourceNameDnsAaaaRecordOnLaunch = enableResourceNameDnsAaaaRecordOnLaunch;
            return this;
        }

        public Builder enableResourceNameDnsAaaaRecordOnLaunch(Boolean enableResourceNameDnsAaaaRecordOnLaunch) {
            return enableResourceNameDnsAaaaRecordOnLaunch(Output.of(enableResourceNameDnsAaaaRecordOnLaunch));
        }

        /**
         * @param ipv6CidrBlock IPv6 CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlock(@Nullable Output<String> ipv6CidrBlock) {
            $.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * @param ipv6CidrBlock IPv6 CIDR block.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlock(String ipv6CidrBlock) {
            return ipv6CidrBlock(Output.of(ipv6CidrBlock));
        }

        public Builder ipv6CidrBlockAssociationId(@Nullable Output<String> ipv6CidrBlockAssociationId) {
            $.ipv6CidrBlockAssociationId = ipv6CidrBlockAssociationId;
            return this;
        }

        public Builder ipv6CidrBlockAssociationId(String ipv6CidrBlockAssociationId) {
            return ipv6CidrBlockAssociationId(Output.of(ipv6CidrBlockAssociationId));
        }

        public Builder ipv6Native(@Nullable Output<Boolean> ipv6Native) {
            $.ipv6Native = ipv6Native;
            return this;
        }

        public Builder ipv6Native(Boolean ipv6Native) {
            return ipv6Native(Output.of(ipv6Native));
        }

        public Builder mapCustomerOwnedIpOnLaunch(@Nullable Output<Boolean> mapCustomerOwnedIpOnLaunch) {
            $.mapCustomerOwnedIpOnLaunch = mapCustomerOwnedIpOnLaunch;
            return this;
        }

        public Builder mapCustomerOwnedIpOnLaunch(Boolean mapCustomerOwnedIpOnLaunch) {
            return mapCustomerOwnedIpOnLaunch(Output.of(mapCustomerOwnedIpOnLaunch));
        }

        /**
         * @param mapPublicIpOnLaunch Whether instances launched into the subnet should be assigned a public IP address.
         * 
         * @return builder
         * 
         */
        public Builder mapPublicIpOnLaunch(@Nullable Output<Boolean> mapPublicIpOnLaunch) {
            $.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
            return this;
        }

        /**
         * @param mapPublicIpOnLaunch Whether instances launched into the subnet should be assigned a public IP address.
         * 
         * @return builder
         * 
         */
        public Builder mapPublicIpOnLaunch(Boolean mapPublicIpOnLaunch) {
            return mapPublicIpOnLaunch(Output.of(mapPublicIpOnLaunch));
        }

        public Builder outpostArn(@Nullable Output<String> outpostArn) {
            $.outpostArn = outpostArn;
            return this;
        }

        public Builder outpostArn(String outpostArn) {
            return outpostArn(Output.of(outpostArn));
        }

        /**
         * @param ownerId ID of the AWS account that owns the subnet.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(@Nullable Output<String> ownerId) {
            $.ownerId = ownerId;
            return this;
        }

        /**
         * @param ownerId ID of the AWS account that owns the subnet.
         * 
         * @return builder
         * 
         */
        public Builder ownerId(String ownerId) {
            return ownerId(Output.of(ownerId));
        }

        public Builder privateDnsHostnameTypeOnLaunch(@Nullable Output<String> privateDnsHostnameTypeOnLaunch) {
            $.privateDnsHostnameTypeOnLaunch = privateDnsHostnameTypeOnLaunch;
            return this;
        }

        public Builder privateDnsHostnameTypeOnLaunch(String privateDnsHostnameTypeOnLaunch) {
            return privateDnsHostnameTypeOnLaunch(Output.of(privateDnsHostnameTypeOnLaunch));
        }

        /**
         * @param tags Map of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Map of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            $.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(Map<String,String> tagsAll) {
            return tagsAll(Output.of(tagsAll));
        }

        /**
         * @param vpcId VPC ID.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId VPC ID.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public DefaultSubnetState build() {
            return $;
        }
    }

}
