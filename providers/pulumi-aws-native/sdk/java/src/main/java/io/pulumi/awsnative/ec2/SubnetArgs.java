// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.SubnetTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SubnetArgs extends io.pulumi.resources.ResourceArgs {

    public static final SubnetArgs Empty = new SubnetArgs();

    @InputImport(name="assignIpv6AddressOnCreation")
    private final @Nullable Input<Boolean> assignIpv6AddressOnCreation;

    public Input<Boolean> getAssignIpv6AddressOnCreation() {
        return this.assignIpv6AddressOnCreation == null ? Input.empty() : this.assignIpv6AddressOnCreation;
    }

    @InputImport(name="availabilityZone")
    private final @Nullable Input<String> availabilityZone;

    public Input<String> getAvailabilityZone() {
        return this.availabilityZone == null ? Input.empty() : this.availabilityZone;
    }

    @InputImport(name="cidrBlock", required=true)
    private final Input<String> cidrBlock;

    public Input<String> getCidrBlock() {
        return this.cidrBlock;
    }

    @InputImport(name="ipv6CidrBlock")
    private final @Nullable Input<String> ipv6CidrBlock;

    public Input<String> getIpv6CidrBlock() {
        return this.ipv6CidrBlock == null ? Input.empty() : this.ipv6CidrBlock;
    }

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

    @InputImport(name="tags")
    private final @Nullable Input<List<SubnetTagArgs>> tags;

    public Input<List<SubnetTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="vpcId", required=true)
    private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public SubnetArgs(
        @Nullable Input<Boolean> assignIpv6AddressOnCreation,
        @Nullable Input<String> availabilityZone,
        Input<String> cidrBlock,
        @Nullable Input<String> ipv6CidrBlock,
        @Nullable Input<Boolean> mapPublicIpOnLaunch,
        @Nullable Input<String> outpostArn,
        @Nullable Input<List<SubnetTagArgs>> tags,
        Input<String> vpcId) {
        this.assignIpv6AddressOnCreation = assignIpv6AddressOnCreation;
        this.availabilityZone = availabilityZone;
        this.cidrBlock = Objects.requireNonNull(cidrBlock, "expected parameter 'cidrBlock' to be non-null");
        this.ipv6CidrBlock = ipv6CidrBlock;
        this.mapPublicIpOnLaunch = mapPublicIpOnLaunch;
        this.outpostArn = outpostArn;
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private SubnetArgs() {
        this.assignIpv6AddressOnCreation = Input.empty();
        this.availabilityZone = Input.empty();
        this.cidrBlock = Input.empty();
        this.ipv6CidrBlock = Input.empty();
        this.mapPublicIpOnLaunch = Input.empty();
        this.outpostArn = Input.empty();
        this.tags = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubnetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> assignIpv6AddressOnCreation;
        private @Nullable Input<String> availabilityZone;
        private Input<String> cidrBlock;
        private @Nullable Input<String> ipv6CidrBlock;
        private @Nullable Input<Boolean> mapPublicIpOnLaunch;
        private @Nullable Input<String> outpostArn;
        private @Nullable Input<List<SubnetTagArgs>> tags;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(SubnetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignIpv6AddressOnCreation = defaults.assignIpv6AddressOnCreation;
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.cidrBlock = defaults.cidrBlock;
    	      this.ipv6CidrBlock = defaults.ipv6CidrBlock;
    	      this.mapPublicIpOnLaunch = defaults.mapPublicIpOnLaunch;
    	      this.outpostArn = defaults.outpostArn;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
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

        public Builder setCidrBlock(Input<String> cidrBlock) {
            this.cidrBlock = Objects.requireNonNull(cidrBlock);
            return this;
        }

        public Builder setCidrBlock(String cidrBlock) {
            this.cidrBlock = Input.of(Objects.requireNonNull(cidrBlock));
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

        public Builder setTags(@Nullable Input<List<SubnetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<SubnetTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVpcId(Input<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Input.of(Objects.requireNonNull(vpcId));
            return this;
        }

        public SubnetArgs build() {
            return new SubnetArgs(assignIpv6AddressOnCreation, availabilityZone, cidrBlock, ipv6CidrBlock, mapPublicIpOnLaunch, outpostArn, tags, vpcId);
        }
    }
}
