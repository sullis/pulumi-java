// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediaconnect.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFlowVpcInterfaceResult {
    private final @Nullable List<String> networkInterfaceIds;
    private final @Nullable String roleArn;
    private final @Nullable List<String> securityGroupIds;
    private final @Nullable String subnetId;

    @OutputCustomType.Constructor({"networkInterfaceIds","roleArn","securityGroupIds","subnetId"})
    private GetFlowVpcInterfaceResult(
        @Nullable List<String> networkInterfaceIds,
        @Nullable String roleArn,
        @Nullable List<String> securityGroupIds,
        @Nullable String subnetId) {
        this.networkInterfaceIds = networkInterfaceIds;
        this.roleArn = roleArn;
        this.securityGroupIds = securityGroupIds;
        this.subnetId = subnetId;
    }

    public List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds == null ? List.of() : this.networkInterfaceIds;
    }
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public List<String> getSecurityGroupIds() {
        return this.securityGroupIds == null ? List.of() : this.securityGroupIds;
    }
    public Optional<String> getSubnetId() {
        return Optional.ofNullable(this.subnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFlowVpcInterfaceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> networkInterfaceIds;
        private @Nullable String roleArn;
        private @Nullable List<String> securityGroupIds;
        private @Nullable String subnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFlowVpcInterfaceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaceIds = defaults.networkInterfaceIds;
    	      this.roleArn = defaults.roleArn;
    	      this.securityGroupIds = defaults.securityGroupIds;
    	      this.subnetId = defaults.subnetId;
        }

        public Builder setNetworkInterfaceIds(@Nullable List<String> networkInterfaceIds) {
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setSecurityGroupIds(@Nullable List<String> securityGroupIds) {
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder setSubnetId(@Nullable String subnetId) {
            this.subnetId = subnetId;
            return this;
        }

        public GetFlowVpcInterfaceResult build() {
            return new GetFlowVpcInterfaceResult(networkInterfaceIds, roleArn, securityGroupIds, subnetId);
        }
    }
}
