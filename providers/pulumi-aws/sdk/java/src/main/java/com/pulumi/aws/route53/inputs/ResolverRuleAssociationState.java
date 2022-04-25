// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ResolverRuleAssociationState extends com.pulumi.resources.ResourceArgs {

    public static final ResolverRuleAssociationState Empty = new ResolverRuleAssociationState();

    /**
     * A name for the association that you&#39;re creating between a resolver rule and a VPC.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A name for the association that you&#39;re creating between a resolver rule and a VPC.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the resolver rule that you want to associate with the VPC.
     * 
     */
    @Import(name="resolverRuleId")
    private @Nullable Output<String> resolverRuleId;

    /**
     * @return The ID of the resolver rule that you want to associate with the VPC.
     * 
     */
    public Optional<Output<String>> resolverRuleId() {
        return Optional.ofNullable(this.resolverRuleId);
    }

    /**
     * The ID of the VPC that you want to associate the resolver rule with.
     * 
     */
    @Import(name="vpcId")
    private @Nullable Output<String> vpcId;

    /**
     * @return The ID of the VPC that you want to associate the resolver rule with.
     * 
     */
    public Optional<Output<String>> vpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    private ResolverRuleAssociationState() {}

    private ResolverRuleAssociationState(ResolverRuleAssociationState $) {
        this.name = $.name;
        this.resolverRuleId = $.resolverRuleId;
        this.vpcId = $.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ResolverRuleAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ResolverRuleAssociationState $;

        public Builder() {
            $ = new ResolverRuleAssociationState();
        }

        public Builder(ResolverRuleAssociationState defaults) {
            $ = new ResolverRuleAssociationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name A name for the association that you&#39;re creating between a resolver rule and a VPC.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A name for the association that you&#39;re creating between a resolver rule and a VPC.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param resolverRuleId The ID of the resolver rule that you want to associate with the VPC.
         * 
         * @return builder
         * 
         */
        public Builder resolverRuleId(@Nullable Output<String> resolverRuleId) {
            $.resolverRuleId = resolverRuleId;
            return this;
        }

        /**
         * @param resolverRuleId The ID of the resolver rule that you want to associate with the VPC.
         * 
         * @return builder
         * 
         */
        public Builder resolverRuleId(String resolverRuleId) {
            return resolverRuleId(Output.of(resolverRuleId));
        }

        /**
         * @param vpcId The ID of the VPC that you want to associate the resolver rule with.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(@Nullable Output<String> vpcId) {
            $.vpcId = vpcId;
            return this;
        }

        /**
         * @param vpcId The ID of the VPC that you want to associate the resolver rule with.
         * 
         * @return builder
         * 
         */
        public Builder vpcId(String vpcId) {
            return vpcId(Output.of(vpcId));
        }

        public ResolverRuleAssociationState build() {
            return $;
        }
    }

}
