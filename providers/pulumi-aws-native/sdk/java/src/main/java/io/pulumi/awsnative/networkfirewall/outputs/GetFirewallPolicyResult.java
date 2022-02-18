// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.networkfirewall.outputs;

import io.pulumi.awsnative.networkfirewall.outputs.FirewallPolicy;
import io.pulumi.awsnative.networkfirewall.outputs.FirewallPolicyTag;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFirewallPolicyResult {
    private final @Nullable String description;
    private final @Nullable FirewallPolicy firewallPolicy;
    private final @Nullable String firewallPolicyArn;
    private final @Nullable String firewallPolicyId;
    private final @Nullable List<FirewallPolicyTag> tags;

    @OutputCustomType.Constructor({"description","firewallPolicy","firewallPolicyArn","firewallPolicyId","tags"})
    private GetFirewallPolicyResult(
        @Nullable String description,
        @Nullable FirewallPolicy firewallPolicy,
        @Nullable String firewallPolicyArn,
        @Nullable String firewallPolicyId,
        @Nullable List<FirewallPolicyTag> tags) {
        this.description = description;
        this.firewallPolicy = firewallPolicy;
        this.firewallPolicyArn = firewallPolicyArn;
        this.firewallPolicyId = firewallPolicyId;
        this.tags = tags;
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<FirewallPolicy> getFirewallPolicy() {
        return Optional.ofNullable(this.firewallPolicy);
    }
    public Optional<String> getFirewallPolicyArn() {
        return Optional.ofNullable(this.firewallPolicyArn);
    }
    public Optional<String> getFirewallPolicyId() {
        return Optional.ofNullable(this.firewallPolicyId);
    }
    public List<FirewallPolicyTag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFirewallPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable FirewallPolicy firewallPolicy;
        private @Nullable String firewallPolicyArn;
        private @Nullable String firewallPolicyId;
        private @Nullable List<FirewallPolicyTag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFirewallPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.firewallPolicy = defaults.firewallPolicy;
    	      this.firewallPolicyArn = defaults.firewallPolicyArn;
    	      this.firewallPolicyId = defaults.firewallPolicyId;
    	      this.tags = defaults.tags;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setFirewallPolicy(@Nullable FirewallPolicy firewallPolicy) {
            this.firewallPolicy = firewallPolicy;
            return this;
        }

        public Builder setFirewallPolicyArn(@Nullable String firewallPolicyArn) {
            this.firewallPolicyArn = firewallPolicyArn;
            return this;
        }

        public Builder setFirewallPolicyId(@Nullable String firewallPolicyId) {
            this.firewallPolicyId = firewallPolicyId;
            return this;
        }

        public Builder setTags(@Nullable List<FirewallPolicyTag> tags) {
            this.tags = tags;
            return this;
        }

        public GetFirewallPolicyResult build() {
            return new GetFirewallPolicyResult(description, firewallPolicy, firewallPolicyArn, firewallPolicyId, tags);
        }
    }
}
