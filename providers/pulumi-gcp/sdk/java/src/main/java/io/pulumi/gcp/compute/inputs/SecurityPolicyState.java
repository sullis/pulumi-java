// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.SecurityPolicyAdaptiveProtectionConfigGetArgs;
import io.pulumi.gcp.compute.inputs.SecurityPolicyRuleGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyState Empty = new SecurityPolicyState();

    /**
     * Configuration for [Google Cloud Armor Adaptive Protection](https://cloud.google.com/armor/docs/adaptive-protection-overview?hl=en). Structure is documented below.
     * 
     */
    @InputImport(name="adaptiveProtectionConfig")
    private final @Nullable Input<SecurityPolicyAdaptiveProtectionConfigGetArgs> adaptiveProtectionConfig;

    public Input<SecurityPolicyAdaptiveProtectionConfigGetArgs> getAdaptiveProtectionConfig() {
        return this.adaptiveProtectionConfig == null ? Input.empty() : this.adaptiveProtectionConfig;
    }

    /**
     * An optional description of this rule. Max size is 64.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Fingerprint of this resource.
     * 
     */
    @InputImport(name="fingerprint")
    private final @Nullable Input<String> fingerprint;

    public Input<String> getFingerprint() {
        return this.fingerprint == null ? Input.empty() : this.fingerprint;
    }

    /**
     * The name of the security policy.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The set of rules that belong to this policy. There must always be a default
     * rule (rule with priority 2147483647 and match "\*"). If no rules are provided when creating a
     * security policy, a default rule with action "allow" will be added. Structure is documented below.
     * 
     */
    @InputImport(name="rules")
    private final @Nullable Input<List<SecurityPolicyRuleGetArgs>> rules;

    public Input<List<SecurityPolicyRuleGetArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    /**
     * The URI of the created resourc
     * 
     */
    @InputImport(name="selfLink")
    private final @Nullable Input<String> selfLink;

    public Input<String> getSelfLink() {
        return this.selfLink == null ? Input.empty() : this.selfLink;
    }

    public SecurityPolicyState(
        @Nullable Input<SecurityPolicyAdaptiveProtectionConfigGetArgs> adaptiveProtectionConfig,
        @Nullable Input<String> description,
        @Nullable Input<String> fingerprint,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<List<SecurityPolicyRuleGetArgs>> rules,
        @Nullable Input<String> selfLink) {
        this.adaptiveProtectionConfig = adaptiveProtectionConfig;
        this.description = description;
        this.fingerprint = fingerprint;
        this.name = name;
        this.project = project;
        this.rules = rules;
        this.selfLink = selfLink;
    }

    private SecurityPolicyState() {
        this.adaptiveProtectionConfig = Input.empty();
        this.description = Input.empty();
        this.fingerprint = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.rules = Input.empty();
        this.selfLink = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SecurityPolicyAdaptiveProtectionConfigGetArgs> adaptiveProtectionConfig;
        private @Nullable Input<String> description;
        private @Nullable Input<String> fingerprint;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<List<SecurityPolicyRuleGetArgs>> rules;
        private @Nullable Input<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adaptiveProtectionConfig = defaults.adaptiveProtectionConfig;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rules = defaults.rules;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder setAdaptiveProtectionConfig(@Nullable Input<SecurityPolicyAdaptiveProtectionConfigGetArgs> adaptiveProtectionConfig) {
            this.adaptiveProtectionConfig = adaptiveProtectionConfig;
            return this;
        }

        public Builder setAdaptiveProtectionConfig(@Nullable SecurityPolicyAdaptiveProtectionConfigGetArgs adaptiveProtectionConfig) {
            this.adaptiveProtectionConfig = Input.ofNullable(adaptiveProtectionConfig);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setFingerprint(@Nullable Input<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        public Builder setFingerprint(@Nullable String fingerprint) {
            this.fingerprint = Input.ofNullable(fingerprint);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRules(@Nullable Input<List<SecurityPolicyRuleGetArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<SecurityPolicyRuleGetArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder setSelfLink(@Nullable Input<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder setSelfLink(@Nullable String selfLink) {
            this.selfLink = Input.ofNullable(selfLink);
            return this;
        }

        public SecurityPolicyState build() {
            return new SecurityPolicyState(adaptiveProtectionConfig, description, fingerprint, name, project, rules, selfLink);
        }
    }
}
