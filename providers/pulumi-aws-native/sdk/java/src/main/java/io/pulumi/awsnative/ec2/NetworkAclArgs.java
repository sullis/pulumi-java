// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2;

import io.pulumi.awsnative.ec2.inputs.NetworkAclTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkAclArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkAclArgs Empty = new NetworkAclArgs();

    @InputImport(name="tags")
    private final @Nullable Input<List<NetworkAclTagArgs>> tags;

    public Input<List<NetworkAclTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="vpcId", required=true)
    private final Input<String> vpcId;

    public Input<String> getVpcId() {
        return this.vpcId;
    }

    public NetworkAclArgs(
        @Nullable Input<List<NetworkAclTagArgs>> tags,
        Input<String> vpcId) {
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private NetworkAclArgs() {
        this.tags = Input.empty();
        this.vpcId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkAclArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<NetworkAclTagArgs>> tags;
        private Input<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkAclArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setTags(@Nullable Input<List<NetworkAclTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<NetworkAclTagArgs> tags) {
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

        public NetworkAclArgs build() {
            return new NetworkAclArgs(tags, vpcId);
        }
    }
}
