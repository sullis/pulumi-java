// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.route53resolver.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResolverRuleAssociationPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResolverRuleAssociationPlainArgs Empty = new GetResolverRuleAssociationPlainArgs();

    /**
     * Primary Identifier for Resolver Rule Association
     * 
     */
    @Import(name="resolverRuleAssociationId", required=true)
    private String resolverRuleAssociationId;

    /**
     * @return Primary Identifier for Resolver Rule Association
     * 
     */
    public String resolverRuleAssociationId() {
        return this.resolverRuleAssociationId;
    }

    private GetResolverRuleAssociationPlainArgs() {}

    private GetResolverRuleAssociationPlainArgs(GetResolverRuleAssociationPlainArgs $) {
        this.resolverRuleAssociationId = $.resolverRuleAssociationId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResolverRuleAssociationPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResolverRuleAssociationPlainArgs $;

        public Builder() {
            $ = new GetResolverRuleAssociationPlainArgs();
        }

        public Builder(GetResolverRuleAssociationPlainArgs defaults) {
            $ = new GetResolverRuleAssociationPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param resolverRuleAssociationId Primary Identifier for Resolver Rule Association
         * 
         * @return builder
         * 
         */
        public Builder resolverRuleAssociationId(String resolverRuleAssociationId) {
            $.resolverRuleAssociationId = resolverRuleAssociationId;
            return this;
        }

        public GetResolverRuleAssociationPlainArgs build() {
            $.resolverRuleAssociationId = Objects.requireNonNull($.resolverRuleAssociationId, "expected parameter 'resolverRuleAssociationId' to be non-null");
            return $;
        }
    }

}
