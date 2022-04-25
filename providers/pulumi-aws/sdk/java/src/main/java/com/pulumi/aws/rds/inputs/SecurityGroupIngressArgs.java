// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecurityGroupIngressArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecurityGroupIngressArgs Empty = new SecurityGroupIngressArgs();

    /**
     * The CIDR block to accept
     * 
     */
    @Import(name="cidr")
    private @Nullable Output<String> cidr;

    /**
     * @return The CIDR block to accept
     * 
     */
    public Optional<Output<String>> cidr() {
        return Optional.ofNullable(this.cidr);
    }

    /**
     * The ID of the security group to authorize
     * 
     */
    @Import(name="securityGroupId")
    private @Nullable Output<String> securityGroupId;

    /**
     * @return The ID of the security group to authorize
     * 
     */
    public Optional<Output<String>> securityGroupId() {
        return Optional.ofNullable(this.securityGroupId);
    }

    /**
     * The name of the security group to authorize
     * 
     */
    @Import(name="securityGroupName")
    private @Nullable Output<String> securityGroupName;

    /**
     * @return The name of the security group to authorize
     * 
     */
    public Optional<Output<String>> securityGroupName() {
        return Optional.ofNullable(this.securityGroupName);
    }

    /**
     * The owner Id of the security group provided
     * by `security_group_name`.
     * 
     */
    @Import(name="securityGroupOwnerId")
    private @Nullable Output<String> securityGroupOwnerId;

    /**
     * @return The owner Id of the security group provided
     * by `security_group_name`.
     * 
     */
    public Optional<Output<String>> securityGroupOwnerId() {
        return Optional.ofNullable(this.securityGroupOwnerId);
    }

    private SecurityGroupIngressArgs() {}

    private SecurityGroupIngressArgs(SecurityGroupIngressArgs $) {
        this.cidr = $.cidr;
        this.securityGroupId = $.securityGroupId;
        this.securityGroupName = $.securityGroupName;
        this.securityGroupOwnerId = $.securityGroupOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecurityGroupIngressArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecurityGroupIngressArgs $;

        public Builder() {
            $ = new SecurityGroupIngressArgs();
        }

        public Builder(SecurityGroupIngressArgs defaults) {
            $ = new SecurityGroupIngressArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param cidr The CIDR block to accept
         * 
         * @return builder
         * 
         */
        public Builder cidr(@Nullable Output<String> cidr) {
            $.cidr = cidr;
            return this;
        }

        /**
         * @param cidr The CIDR block to accept
         * 
         * @return builder
         * 
         */
        public Builder cidr(String cidr) {
            return cidr(Output.of(cidr));
        }

        /**
         * @param securityGroupId The ID of the security group to authorize
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(@Nullable Output<String> securityGroupId) {
            $.securityGroupId = securityGroupId;
            return this;
        }

        /**
         * @param securityGroupId The ID of the security group to authorize
         * 
         * @return builder
         * 
         */
        public Builder securityGroupId(String securityGroupId) {
            return securityGroupId(Output.of(securityGroupId));
        }

        /**
         * @param securityGroupName The name of the security group to authorize
         * 
         * @return builder
         * 
         */
        public Builder securityGroupName(@Nullable Output<String> securityGroupName) {
            $.securityGroupName = securityGroupName;
            return this;
        }

        /**
         * @param securityGroupName The name of the security group to authorize
         * 
         * @return builder
         * 
         */
        public Builder securityGroupName(String securityGroupName) {
            return securityGroupName(Output.of(securityGroupName));
        }

        /**
         * @param securityGroupOwnerId The owner Id of the security group provided
         * by `security_group_name`.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupOwnerId(@Nullable Output<String> securityGroupOwnerId) {
            $.securityGroupOwnerId = securityGroupOwnerId;
            return this;
        }

        /**
         * @param securityGroupOwnerId The owner Id of the security group provided
         * by `security_group_name`.
         * 
         * @return builder
         * 
         */
        public Builder securityGroupOwnerId(String securityGroupOwnerId) {
            return securityGroupOwnerId(Output.of(securityGroupOwnerId));
        }

        public SecurityGroupIngressArgs build() {
            return $;
        }
    }

}
