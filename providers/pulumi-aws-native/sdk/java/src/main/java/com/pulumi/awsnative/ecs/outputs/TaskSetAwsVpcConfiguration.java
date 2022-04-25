// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ecs.outputs;

import com.pulumi.awsnative.ecs.enums.TaskSetAwsVpcConfigurationAssignPublicIp;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskSetAwsVpcConfiguration {
    /**
     * @return Whether the task&#39;s elastic network interface receives a public IP address. The default value is DISABLED.
     * 
     */
    private final @Nullable TaskSetAwsVpcConfigurationAssignPublicIp assignPublicIp;
    /**
     * @return The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. There is a limit of 5 security groups that can be specified per AwsVpcConfiguration.
     * 
     */
    private final @Nullable List<String> securityGroups;
    /**
     * @return The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per AwsVpcConfiguration.
     * 
     */
    private final List<String> subnets;

    @CustomType.Constructor
    private TaskSetAwsVpcConfiguration(
        @CustomType.Parameter("assignPublicIp") @Nullable TaskSetAwsVpcConfigurationAssignPublicIp assignPublicIp,
        @CustomType.Parameter("securityGroups") @Nullable List<String> securityGroups,
        @CustomType.Parameter("subnets") List<String> subnets) {
        this.assignPublicIp = assignPublicIp;
        this.securityGroups = securityGroups;
        this.subnets = subnets;
    }

    /**
     * @return Whether the task&#39;s elastic network interface receives a public IP address. The default value is DISABLED.
     * 
     */
    public Optional<TaskSetAwsVpcConfigurationAssignPublicIp> assignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }
    /**
     * @return The security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used. There is a limit of 5 security groups that can be specified per AwsVpcConfiguration.
     * 
     */
    public List<String> securityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    /**
     * @return The subnets associated with the task or service. There is a limit of 16 subnets that can be specified per AwsVpcConfiguration.
     * 
     */
    public List<String> subnets() {
        return this.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetAwsVpcConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TaskSetAwsVpcConfigurationAssignPublicIp assignPublicIp;
        private @Nullable List<String> securityGroups;
        private List<String> subnets;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSetAwsVpcConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assignPublicIp = defaults.assignPublicIp;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnets = defaults.subnets;
        }

        public Builder assignPublicIp(@Nullable TaskSetAwsVpcConfigurationAssignPublicIp assignPublicIp) {
            this.assignPublicIp = assignPublicIp;
            return this;
        }
        public Builder securityGroups(@Nullable List<String> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder subnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }        public TaskSetAwsVpcConfiguration build() {
            return new TaskSetAwsVpcConfiguration(assignPublicIp, securityGroups, subnets);
        }
    }
}
