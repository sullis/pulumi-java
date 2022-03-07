// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ResourceReferenceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * settings for security policy patterns to match
 * 
 */
public final class SecurityPolicyWebApplicationFirewallAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyWebApplicationFirewallAssociationArgs Empty = new SecurityPolicyWebApplicationFirewallAssociationArgs();

    /**
     * List of domains.
     * 
     */
    @InputImport(name="domains")
      private final @Nullable Input<List<ResourceReferenceArgs>> domains;

    public Input<List<ResourceReferenceArgs>> getDomains() {
        return this.domains == null ? Input.empty() : this.domains;
    }

    /**
     * List of paths
     * 
     */
    @InputImport(name="patternsToMatch")
      private final @Nullable Input<List<String>> patternsToMatch;

    public Input<List<String>> getPatternsToMatch() {
        return this.patternsToMatch == null ? Input.empty() : this.patternsToMatch;
    }

    public SecurityPolicyWebApplicationFirewallAssociationArgs(
        @Nullable Input<List<ResourceReferenceArgs>> domains,
        @Nullable Input<List<String>> patternsToMatch) {
        this.domains = domains;
        this.patternsToMatch = patternsToMatch;
    }

    private SecurityPolicyWebApplicationFirewallAssociationArgs() {
        this.domains = Input.empty();
        this.patternsToMatch = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyWebApplicationFirewallAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ResourceReferenceArgs>> domains;
        private @Nullable Input<List<String>> patternsToMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyWebApplicationFirewallAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.patternsToMatch = defaults.patternsToMatch;
        }

        public Builder setDomains(@Nullable Input<List<ResourceReferenceArgs>> domains) {
            this.domains = domains;
            return this;
        }

        public Builder setDomains(@Nullable List<ResourceReferenceArgs> domains) {
            this.domains = Input.ofNullable(domains);
            return this;
        }

        public Builder setPatternsToMatch(@Nullable Input<List<String>> patternsToMatch) {
            this.patternsToMatch = patternsToMatch;
            return this;
        }

        public Builder setPatternsToMatch(@Nullable List<String> patternsToMatch) {
            this.patternsToMatch = Input.ofNullable(patternsToMatch);
            return this;
        }
        public SecurityPolicyWebApplicationFirewallAssociationArgs build() {
            return new SecurityPolicyWebApplicationFirewallAssociationArgs(domains, patternsToMatch);
        }
    }
}