// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.enums.ServiceAwsVpcConfigurationAssignPublicIp;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAwsVpcConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceAwsVpcConfigurationArgs Empty = new ServiceAwsVpcConfigurationArgs();

    @InputImport(name="assignPublicIp")
    private final @Nullable Input<ServiceAwsVpcConfigurationAssignPublicIp> assignPublicIp;

    public Input<ServiceAwsVpcConfigurationAssignPublicIp> getAssignPublicIp() {
        return this.assignPublicIp == null ? Input.empty() : this.assignPublicIp;
    }

    @InputImport(name="securityGroups")
    private final @Nullable Input<List<String>> securityGroups;

    public Input<List<String>> getSecurityGroups() {
        return this.securityGroups == null ? Input.empty() : this.securityGroups;
    }

    @InputImport(name="subnets")
    private final @Nullable Input<List<String>> subnets;

    public Input<List<String>> getSubnets() {
        return this.subnets == null ? Input.empty() : this.subnets;
    }

    public ServiceAwsVpcConfigurationArgs(
        @Nullable Input<ServiceAwsVpcConfigurationAssignPublicIp> assignPublicIp,
        @Nullable Input<List<String>> securityGroups,
        @Nullable Input<List<String>> subnets) {
        this.assignPublicIp = assignPublicIp;
        this.securityGroups = securityGroups;
        this.subnets = subnets;
    }

    private ServiceAwsVpcConfigurationArgs() {
        this.assignPublicIp = Input.empty();
        this.securityGroups = Input.empty();
        this.subnets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAwsVpcConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServiceAwsVpcConfigurationAssignPublicIp> assignPublicIp;
        private @Nullable Input<List<String>> securityGroups;
        private @Nullable Input<List<String>> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAwsVpcConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder setAssignPublicIp(@Nullable Input<ServiceAwsVpcConfigurationAssignPublicIp> assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }

        public Builder setAssignPublicIp(@Nullable ServiceAwsVpcConfigurationAssignPublicIp assignPublicIp) {
            this.assignPublicIp = Input.ofNullable(assignPublicIp);
            return this;
        }

        public Builder setSecurityGroups(@Nullable Input<List<String>> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = Input.ofNullable(securityGroups);
            return this;
        }

        public Builder setSubnets(@Nullable Input<List<String>> subnets) {
            this.subnets = subnets;
            return this;
        }

        public Builder setSubnets(@Nullable List<String> subnets) {
            this.subnets = Input.ofNullable(subnets);
            return this;
        }

        public ServiceAwsVpcConfigurationArgs build() {
            return new ServiceAwsVpcConfigurationArgs(assignPublicIp, securityGroups, subnets);
        }
    }
}
