// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetResolverRuleAssociationResult {
    /**
     * Primary Identifier for Resolver Rule Association
     * 
     */
    private final @Nullable String resolverRuleAssociationId;

    @OutputCustomType.Constructor({"resolverRuleAssociationId"})
    private GetResolverRuleAssociationResult(@Nullable String resolverRuleAssociationId) {
        this.resolverRuleAssociationId = resolverRuleAssociationId;
    }

    /**
     * Primary Identifier for Resolver Rule Association
     * 
     */
    public Optional<String> getResolverRuleAssociationId() {
        return Optional.ofNullable(this.resolverRuleAssociationId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverRuleAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resolverRuleAssociationId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResolverRuleAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolverRuleAssociationId = defaults.resolverRuleAssociationId;
        }

        public Builder setResolverRuleAssociationId(@Nullable String resolverRuleAssociationId) {
            this.resolverRuleAssociationId = resolverRuleAssociationId;
            return this;
        }

        public GetResolverRuleAssociationResult build() {
            return new GetResolverRuleAssociationResult(resolverRuleAssociationId);
        }
    }
}
