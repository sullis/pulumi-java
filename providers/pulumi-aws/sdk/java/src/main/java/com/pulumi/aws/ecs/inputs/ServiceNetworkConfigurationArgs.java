// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceNetworkConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceNetworkConfigurationArgs Empty = new ServiceNetworkConfigurationArgs();

    /**
     * Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
     * 
     */
    @Import(name="assignPublicIp")
    private @Nullable Output<Boolean> assignPublicIp;

    /**
     * @return Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
     * 
     */
    public Optional<Output<Boolean>> assignPublicIp() {
        return Optional.ofNullable(this.assignPublicIp);
    }

    /**
     * Security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
     * 
     */
    @Import(name="securityGroups")
    private @Nullable Output<List<String>> securityGroups;

    /**
     * @return Security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
     * 
     */
    public Optional<Output<List<String>>> securityGroups() {
        return Optional.ofNullable(this.securityGroups);
    }

    /**
     * Subnets associated with the task or service.
     * 
     */
    @Import(name="subnets", required=true)
    private Output<List<String>> subnets;

    /**
     * @return Subnets associated with the task or service.
     * 
     */
    public Output<List<String>> subnets() {
        return this.subnets;
    }

    private ServiceNetworkConfigurationArgs() {}

    private ServiceNetworkConfigurationArgs(ServiceNetworkConfigurationArgs $) {
        this.assignPublicIp = $.assignPublicIp;
        this.securityGroups = $.securityGroups;
        this.subnets = $.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceNetworkConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceNetworkConfigurationArgs $;

        public Builder() {
            $ = new ServiceNetworkConfigurationArgs();
        }

        public Builder(ServiceNetworkConfigurationArgs defaults) {
            $ = new ServiceNetworkConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param assignPublicIp Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
         * 
         * @return builder
         * 
         */
        public Builder assignPublicIp(@Nullable Output<Boolean> assignPublicIp) {
            $.assignPublicIp = assignPublicIp;
            return this;
        }

        /**
         * @param assignPublicIp Assign a public IP address to the ENI (Fargate launch type only). Valid values are `true` or `false`. Default `false`.
         * 
         * @return builder
         * 
         */
        public Builder assignPublicIp(Boolean assignPublicIp) {
            return assignPublicIp(Output.of(assignPublicIp));
        }

        /**
         * @param securityGroups Security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(@Nullable Output<List<String>> securityGroups) {
            $.securityGroups = securityGroups;
            return this;
        }

        /**
         * @param securityGroups Security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(List<String> securityGroups) {
            return securityGroups(Output.of(securityGroups));
        }

        /**
         * @param securityGroups Security groups associated with the task or service. If you do not specify a security group, the default security group for the VPC is used.
         * 
         * @return builder
         * 
         */
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }

        /**
         * @param subnets Subnets associated with the task or service.
         * 
         * @return builder
         * 
         */
        public Builder subnets(Output<List<String>> subnets) {
            $.subnets = subnets;
            return this;
        }

        /**
         * @param subnets Subnets associated with the task or service.
         * 
         * @return builder
         * 
         */
        public Builder subnets(List<String> subnets) {
            return subnets(Output.of(subnets));
        }

        /**
         * @param subnets Subnets associated with the task or service.
         * 
         * @return builder
         * 
         */
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        public ServiceNetworkConfigurationArgs build() {
            $.subnets = Objects.requireNonNull($.subnets, "expected parameter 'subnets' to be non-null");
            return $;
        }
    }

}
