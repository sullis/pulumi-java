// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.FirewallPolicyRuleApplicationProtocolArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Rule of type application.
 * 
 */
public final class ApplicationRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationRuleArgs Empty = new ApplicationRuleArgs();

    /**
     * Description of the rule.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * List of destination IP addresses or Service Tags.
     * 
     */
    @InputImport(name="destinationAddresses")
    private final @Nullable Input<List<String>> destinationAddresses;

    public Input<List<String>> getDestinationAddresses() {
        return this.destinationAddresses == null ? Input.empty() : this.destinationAddresses;
    }

    /**
     * List of FQDN Tags for this rule.
     * 
     */
    @InputImport(name="fqdnTags")
    private final @Nullable Input<List<String>> fqdnTags;

    public Input<List<String>> getFqdnTags() {
        return this.fqdnTags == null ? Input.empty() : this.fqdnTags;
    }

    /**
     * Name of the rule.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Array of Application Protocols.
     * 
     */
    @InputImport(name="protocols")
    private final @Nullable Input<List<FirewallPolicyRuleApplicationProtocolArgs>> protocols;

    public Input<List<FirewallPolicyRuleApplicationProtocolArgs>> getProtocols() {
        return this.protocols == null ? Input.empty() : this.protocols;
    }

    /**
     * Rule Type.
     * Expected value is 'ApplicationRule'.
     * 
     */
    @InputImport(name="ruleType", required=true)
    private final Input<String> ruleType;

    public Input<String> getRuleType() {
        return this.ruleType;
    }

    /**
     * List of source IP addresses for this rule.
     * 
     */
    @InputImport(name="sourceAddresses")
    private final @Nullable Input<List<String>> sourceAddresses;

    public Input<List<String>> getSourceAddresses() {
        return this.sourceAddresses == null ? Input.empty() : this.sourceAddresses;
    }

    /**
     * List of source IpGroups for this rule.
     * 
     */
    @InputImport(name="sourceIpGroups")
    private final @Nullable Input<List<String>> sourceIpGroups;

    public Input<List<String>> getSourceIpGroups() {
        return this.sourceIpGroups == null ? Input.empty() : this.sourceIpGroups;
    }

    /**
     * List of FQDNs for this rule.
     * 
     */
    @InputImport(name="targetFqdns")
    private final @Nullable Input<List<String>> targetFqdns;

    public Input<List<String>> getTargetFqdns() {
        return this.targetFqdns == null ? Input.empty() : this.targetFqdns;
    }

    /**
     * List of Urls for this rule condition.
     * 
     */
    @InputImport(name="targetUrls")
    private final @Nullable Input<List<String>> targetUrls;

    public Input<List<String>> getTargetUrls() {
        return this.targetUrls == null ? Input.empty() : this.targetUrls;
    }

    /**
     * Terminate TLS connections for this rule.
     * 
     */
    @InputImport(name="terminateTLS")
    private final @Nullable Input<Boolean> terminateTLS;

    public Input<Boolean> getTerminateTLS() {
        return this.terminateTLS == null ? Input.empty() : this.terminateTLS;
    }

    /**
     * List of destination azure web categories.
     * 
     */
    @InputImport(name="webCategories")
    private final @Nullable Input<List<String>> webCategories;

    public Input<List<String>> getWebCategories() {
        return this.webCategories == null ? Input.empty() : this.webCategories;
    }

    public ApplicationRuleArgs(
        @Nullable Input<String> description,
        @Nullable Input<List<String>> destinationAddresses,
        @Nullable Input<List<String>> fqdnTags,
        @Nullable Input<String> name,
        @Nullable Input<List<FirewallPolicyRuleApplicationProtocolArgs>> protocols,
        Input<String> ruleType,
        @Nullable Input<List<String>> sourceAddresses,
        @Nullable Input<List<String>> sourceIpGroups,
        @Nullable Input<List<String>> targetFqdns,
        @Nullable Input<List<String>> targetUrls,
        @Nullable Input<Boolean> terminateTLS,
        @Nullable Input<List<String>> webCategories) {
        this.description = description;
        this.destinationAddresses = destinationAddresses;
        this.fqdnTags = fqdnTags;
        this.name = name;
        this.protocols = protocols;
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
        this.sourceAddresses = sourceAddresses;
        this.sourceIpGroups = sourceIpGroups;
        this.targetFqdns = targetFqdns;
        this.targetUrls = targetUrls;
        this.terminateTLS = terminateTLS;
        this.webCategories = webCategories;
    }

    private ApplicationRuleArgs() {
        this.description = Input.empty();
        this.destinationAddresses = Input.empty();
        this.fqdnTags = Input.empty();
        this.name = Input.empty();
        this.protocols = Input.empty();
        this.ruleType = Input.empty();
        this.sourceAddresses = Input.empty();
        this.sourceIpGroups = Input.empty();
        this.targetFqdns = Input.empty();
        this.targetUrls = Input.empty();
        this.terminateTLS = Input.empty();
        this.webCategories = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<List<String>> destinationAddresses;
        private @Nullable Input<List<String>> fqdnTags;
        private @Nullable Input<String> name;
        private @Nullable Input<List<FirewallPolicyRuleApplicationProtocolArgs>> protocols;
        private Input<String> ruleType;
        private @Nullable Input<List<String>> sourceAddresses;
        private @Nullable Input<List<String>> sourceIpGroups;
        private @Nullable Input<List<String>> targetFqdns;
        private @Nullable Input<List<String>> targetUrls;
        private @Nullable Input<Boolean> terminateTLS;
        private @Nullable Input<List<String>> webCategories;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.destinationAddresses = defaults.destinationAddresses;
    	      this.fqdnTags = defaults.fqdnTags;
    	      this.name = defaults.name;
    	      this.protocols = defaults.protocols;
    	      this.ruleType = defaults.ruleType;
    	      this.sourceAddresses = defaults.sourceAddresses;
    	      this.sourceIpGroups = defaults.sourceIpGroups;
    	      this.targetFqdns = defaults.targetFqdns;
    	      this.targetUrls = defaults.targetUrls;
    	      this.terminateTLS = defaults.terminateTLS;
    	      this.webCategories = defaults.webCategories;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDestinationAddresses(@Nullable Input<List<String>> destinationAddresses) {
            this.destinationAddresses = destinationAddresses;
            return this;
        }

        public Builder setDestinationAddresses(@Nullable List<String> destinationAddresses) {
            this.destinationAddresses = Input.ofNullable(destinationAddresses);
            return this;
        }

        public Builder setFqdnTags(@Nullable Input<List<String>> fqdnTags) {
            this.fqdnTags = fqdnTags;
            return this;
        }

        public Builder setFqdnTags(@Nullable List<String> fqdnTags) {
            this.fqdnTags = Input.ofNullable(fqdnTags);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProtocols(@Nullable Input<List<FirewallPolicyRuleApplicationProtocolArgs>> protocols) {
            this.protocols = protocols;
            return this;
        }

        public Builder setProtocols(@Nullable List<FirewallPolicyRuleApplicationProtocolArgs> protocols) {
            this.protocols = Input.ofNullable(protocols);
            return this;
        }

        public Builder setRuleType(Input<String> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }

        public Builder setRuleType(String ruleType) {
            this.ruleType = Input.of(Objects.requireNonNull(ruleType));
            return this;
        }

        public Builder setSourceAddresses(@Nullable Input<List<String>> sourceAddresses) {
            this.sourceAddresses = sourceAddresses;
            return this;
        }

        public Builder setSourceAddresses(@Nullable List<String> sourceAddresses) {
            this.sourceAddresses = Input.ofNullable(sourceAddresses);
            return this;
        }

        public Builder setSourceIpGroups(@Nullable Input<List<String>> sourceIpGroups) {
            this.sourceIpGroups = sourceIpGroups;
            return this;
        }

        public Builder setSourceIpGroups(@Nullable List<String> sourceIpGroups) {
            this.sourceIpGroups = Input.ofNullable(sourceIpGroups);
            return this;
        }

        public Builder setTargetFqdns(@Nullable Input<List<String>> targetFqdns) {
            this.targetFqdns = targetFqdns;
            return this;
        }

        public Builder setTargetFqdns(@Nullable List<String> targetFqdns) {
            this.targetFqdns = Input.ofNullable(targetFqdns);
            return this;
        }

        public Builder setTargetUrls(@Nullable Input<List<String>> targetUrls) {
            this.targetUrls = targetUrls;
            return this;
        }

        public Builder setTargetUrls(@Nullable List<String> targetUrls) {
            this.targetUrls = Input.ofNullable(targetUrls);
            return this;
        }

        public Builder setTerminateTLS(@Nullable Input<Boolean> terminateTLS) {
            this.terminateTLS = terminateTLS;
            return this;
        }

        public Builder setTerminateTLS(@Nullable Boolean terminateTLS) {
            this.terminateTLS = Input.ofNullable(terminateTLS);
            return this;
        }

        public Builder setWebCategories(@Nullable Input<List<String>> webCategories) {
            this.webCategories = webCategories;
            return this;
        }

        public Builder setWebCategories(@Nullable List<String> webCategories) {
            this.webCategories = Input.ofNullable(webCategories);
            return this;
        }

        public ApplicationRuleArgs build() {
            return new ApplicationRuleArgs(description, destinationAddresses, fqdnTags, name, protocols, ruleType, sourceAddresses, sourceIpGroups, targetFqdns, targetUrls, terminateTLS, webCategories);
        }
    }
}
