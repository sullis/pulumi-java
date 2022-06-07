// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetSubnetFilter;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSubnetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSubnetPlainArgs Empty = new GetSubnetPlainArgs();

    /**
     * Availability zone where the subnet must reside.
     * 
     */
    @Import(name="availabilityZone")
    private @Nullable String availabilityZone;

    /**
     * @return Availability zone where the subnet must reside.
     * 
     */
    public Optional<String> availabilityZone() {
        return Optional.ofNullable(this.availabilityZone);
    }

    /**
     * ID of the Availability Zone for the subnet. This argument is not supported in all regions or partitions. If necessary, use `availability_zone` instead.
     * 
     */
    @Import(name="availabilityZoneId")
    private @Nullable String availabilityZoneId;

    /**
     * @return ID of the Availability Zone for the subnet. This argument is not supported in all regions or partitions. If necessary, use `availability_zone` instead.
     * 
     */
    public Optional<String> availabilityZoneId() {
        return Optional.ofNullable(this.availabilityZoneId);
    }

    /**
     * CIDR block of the desired subnet.
     * 
     */
    @Import(name="cidrBlock")
    private @Nullable String cidrBlock;

    /**
     * @return CIDR block of the desired subnet.
     * 
     */
    public Optional<String> cidrBlock() {
        return Optional.ofNullable(this.cidrBlock);
    }

    /**
     * Whether the desired subnet must be the default subnet for its associated availability zone.
     * 
     */
    @Import(name="defaultForAz")
    private @Nullable Boolean defaultForAz;

    /**
     * @return Whether the desired subnet must be the default subnet for its associated availability zone.
     * 
     */
    public Optional<Boolean> defaultForAz() {
        return Optional.ofNullable(this.defaultForAz);
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetSubnetFilter> filters;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<List<GetSubnetFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * ID of the specific subnet to retrieve.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return ID of the specific subnet to retrieve.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * IPv6 CIDR block of the desired subnet.
     * 
     */
    @Import(name="ipv6CidrBlock")
    private @Nullable String ipv6CidrBlock;

    /**
     * @return IPv6 CIDR block of the desired subnet.
     * 
     */
    public Optional<String> ipv6CidrBlock() {
        return Optional.ofNullable(this.ipv6CidrBlock);
    }

    /**
     * State that the desired subnet must have.
     * 
     */
    @Import(name="state")
    private @Nullable String state;

    /**
     * @return State that the desired subnet must have.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    /**
     * Map of tags, each pair of which must exactly match a pair on the desired subnet.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return Map of tags, each pair of which must exactly match a pair on the desired subnet.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * ID of the VPC that the desired subnet belongs to.
     * 
     */
    @Import(name="vpcId")
    private @Nullable String vpcId;

    /**
     * @return ID of the VPC that the desired subnet belongs to.
     * 
     */
    public Optional<String> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private GetSubnetPlainArgs() {}

    private GetSubnetPlainArgs(GetSubnetPlainArgs $) {
        this.availabilityZone = $.availabilityZone;
        this.availabilityZoneId = $.availabilityZoneId;
        this.cidrBlock = $.cidrBlock;
        this.defaultForAz = $.defaultForAz;
        this.filters = $.filters;
        this.id = $.id;
        this.ipv6CidrBlock = $.ipv6CidrBlock;
        this.state = $.state;
        this.tags = $.tags;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSubnetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSubnetPlainArgs $;

        public Builder() {
            $ = new GetSubnetPlainArgs();
        }

        public Builder(GetSubnetPlainArgs defaults) {
            $ = new GetSubnetPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availabilityZone Availability zone where the subnet must reside.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZone(@Nullable String availabilityZone) {
            $.availabilityZone = availabilityZone;
            return this;
        }

        /**
         * @param availabilityZoneId ID of the Availability Zone for the subnet. This argument is not supported in all regions or partitions. If necessary, use `availability_zone` instead.
         * 
         * @return builder
         * 
         */
        public Builder availabilityZoneId(@Nullable String availabilityZoneId) {
            $.availabilityZoneId = availabilityZoneId;
            return this;
        }

        /**
         * @param cidrBlock CIDR block of the desired subnet.
         * 
         * @return builder
         * 
         */
        public Builder cidrBlock(@Nullable String cidrBlock) {
            $.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * @param defaultForAz Whether the desired subnet must be the default subnet for its associated availability zone.
         * 
         * @return builder
         * 
         */
        public Builder defaultForAz(@Nullable Boolean defaultForAz) {
            $.defaultForAz = defaultForAz;
            return this;
        }

        /**
         * @param filters Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetSubnetFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetSubnetFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id ID of the specific subnet to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param ipv6CidrBlock IPv6 CIDR block of the desired subnet.
         * 
         * @return builder
         * 
         */
        public Builder ipv6CidrBlock(@Nullable String ipv6CidrBlock) {
            $.ipv6CidrBlock = ipv6CidrBlock;
            return this;
        }

        /**
         * @param state State that the desired subnet must have.
         * 
         * @return builder
         * 
         */
        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        /**
         * @param tags Map of tags, each pair of which must exactly match a pair on the desired subnet.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param vpcId ID of the VPC that the desired subnet belongs to.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable String vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        public GetSubnetPlainArgs build() {
            return $;
        }
    }

}
