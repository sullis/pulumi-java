// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.azurenative.cdn.outputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityPolicyWebApplicationFirewallAssociationResponse {
    /**
     * List of domains.
     * 
     */
    private final @Nullable List<ResourceReferenceResponse> domains;
    /**
     * List of paths
     * 
     */
    private final @Nullable List<String> patternsToMatch;

    @OutputCustomType.Constructor({"domains","patternsToMatch"})
    private SecurityPolicyWebApplicationFirewallAssociationResponse(
        @Nullable List<ResourceReferenceResponse> domains,
        @Nullable List<String> patternsToMatch) {
        this.domains = domains;
        this.patternsToMatch = patternsToMatch;
    }

    /**
     * List of domains.
     * 
    */
    public List<ResourceReferenceResponse> getDomains() {
        return this.domains == null ? List.of() : this.domains;
    }
    /**
     * List of paths
     * 
    */
    public List<String> getPatternsToMatch() {
        return this.patternsToMatch == null ? List.of() : this.patternsToMatch;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyWebApplicationFirewallAssociationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResourceReferenceResponse> domains;
        private @Nullable List<String> patternsToMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyWebApplicationFirewallAssociationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.patternsToMatch = defaults.patternsToMatch;
        }

        public Builder setDomains(@Nullable List<ResourceReferenceResponse> domains) {
            this.domains = domains;
            return this;
        }

        public Builder setPatternsToMatch(@Nullable List<String> patternsToMatch) {
            this.patternsToMatch = patternsToMatch;
            return this;
        }
        public SecurityPolicyWebApplicationFirewallAssociationResponse build() {
            return new SecurityPolicyWebApplicationFirewallAssociationResponse(domains, patternsToMatch);
        }
    }
}