// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.awsnative.ecs.enums.ServiceAwsVpcConfigurationAssignPublicIp;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceAwsVpcConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final ServiceAwsVpcConfiguration Empty = new ServiceAwsVpcConfiguration();

    @InputImport(name="assignPublicIp")
    private final @Nullable ServiceAwsVpcConfigurationAssignPublicIp assignPublicIp;

    public Optional<ServiceAwsVpcConfigurationAssignPublicIp> getAssignPublicIp() {
        return this.assignPublicIp == null ? Optional.empty() : Optional.ofNullable(this.assignPublicIp);
    }

    @InputImport(name="securityGroups")
    private final @Nullable List<String> securityGroups;

    public List<String> getSecurityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }

    @InputImport(name="subnets")
    private final @Nullable List<String> subnets;

    public List<String> getSubnets() {
        return this.subnets == null ? List.of() : this.subnets;
    }

    public ServiceAwsVpcConfiguration(
        @Nullable ServiceAwsVpcConfigurationAssignPublicIp assignPublicIp,
        @Nullable List<String> securityGroups,
        @Nullable List<String> subnets) {
        this.assignPublicIp = assignPublicIp;
        this.securityGroups = securityGroups;
        this.subnets = subnets;
    }

    private ServiceAwsVpcConfiguration() {
        this.assignPublicIp = null;
        this.securityGroups = List.of();
        this.subnets = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAwsVpcConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ServiceAwsVpcConfigurationAssignPublicIp assignPublicIp;
        private @Nullable List<String> securityGroups;
        private @Nullable List<String> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAwsVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder setAssignPublicIp(@Nullable ServiceAwsVpcConfigurationAssignPublicIp assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }

        public Builder setSecurityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }

        public Builder setSubnets(@Nullable List<String> subnets) {
            this.subnets = subnets;
            return this;
        }

        public ServiceAwsVpcConfiguration build() {
            return new ServiceAwsVpcConfiguration(assignPublicIp, securityGroups, subnets);
        }
    }
}
