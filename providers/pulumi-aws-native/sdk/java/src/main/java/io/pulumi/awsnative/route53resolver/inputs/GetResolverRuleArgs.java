// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53resolver.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResolverRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResolverRuleArgs Empty = new GetResolverRuleArgs();

    /**
     * The ID of the endpoint that the rule is associated with.
     * 
     */
    @Import(name="resolverRuleId", required=true)
      private final String resolverRuleId;

    public String resolverRuleId() {
        return this.resolverRuleId;
    }

    public GetResolverRuleArgs(String resolverRuleId) {
        this.resolverRuleId = Objects.requireNonNull(resolverRuleId, "expected parameter 'resolverRuleId' to be non-null");
    }

    private GetResolverRuleArgs() {
        this.resolverRuleId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResolverRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resolverRuleId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResolverRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resolverRuleId = defaults.resolverRuleId;
        }

        public Builder resolverRuleId(String resolverRuleId) {
            this.resolverRuleId = Objects.requireNonNull(resolverRuleId);
            return this;
        }        public GetResolverRuleArgs build() {
            return new GetResolverRuleArgs(resolverRuleId);
        }
    }
}
