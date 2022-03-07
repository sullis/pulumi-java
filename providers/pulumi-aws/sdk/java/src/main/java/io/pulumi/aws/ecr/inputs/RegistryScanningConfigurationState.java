// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecr.inputs;

import io.pulumi.aws.ecr.inputs.RegistryScanningConfigurationRuleGetArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegistryScanningConfigurationState extends io.pulumi.resources.ResourceArgs {

    public static final RegistryScanningConfigurationState Empty = new RegistryScanningConfigurationState();

    /**
     * The registry ID the scanning configuration applies to.
     * 
     */
    @InputImport(name="registryId")
      private final @Nullable Input<String> registryId;

    public Input<String> getRegistryId() {
        return this.registryId == null ? Input.empty() : this.registryId;
    }

    /**
     * One or multiple blocks specifying scanning rules to determine which repository filters are used and at what frequency scanning will occur. See below for schema.
     * 
     */
    @InputImport(name="rules")
      private final @Nullable Input<List<RegistryScanningConfigurationRuleGetArgs>> rules;

    public Input<List<RegistryScanningConfigurationRuleGetArgs>> getRules() {
        return this.rules == null ? Input.empty() : this.rules;
    }

    /**
     * the scanning type to set for the registry. Can be either `ENHANCED` or `BASIC`.
     * 
     */
    @InputImport(name="scanType")
      private final @Nullable Input<String> scanType;

    public Input<String> getScanType() {
        return this.scanType == null ? Input.empty() : this.scanType;
    }

    public RegistryScanningConfigurationState(
        @Nullable Input<String> registryId,
        @Nullable Input<List<RegistryScanningConfigurationRuleGetArgs>> rules,
        @Nullable Input<String> scanType) {
        this.registryId = registryId;
        this.rules = rules;
        this.scanType = scanType;
    }

    private RegistryScanningConfigurationState() {
        this.registryId = Input.empty();
        this.rules = Input.empty();
        this.scanType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegistryScanningConfigurationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> registryId;
        private @Nullable Input<List<RegistryScanningConfigurationRuleGetArgs>> rules;
        private @Nullable Input<String> scanType;

        public Builder() {
    	      // Empty
        }

        public Builder(RegistryScanningConfigurationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.registryId = defaults.registryId;
    	      this.rules = defaults.rules;
    	      this.scanType = defaults.scanType;
        }

        public Builder setRegistryId(@Nullable Input<String> registryId) {
            this.registryId = registryId;
            return this;
        }

        public Builder setRegistryId(@Nullable String registryId) {
            this.registryId = Input.ofNullable(registryId);
            return this;
        }

        public Builder setRules(@Nullable Input<List<RegistryScanningConfigurationRuleGetArgs>> rules) {
            this.rules = rules;
            return this;
        }

        public Builder setRules(@Nullable List<RegistryScanningConfigurationRuleGetArgs> rules) {
            this.rules = Input.ofNullable(rules);
            return this;
        }

        public Builder setScanType(@Nullable Input<String> scanType) {
            this.scanType = scanType;
            return this;
        }

        public Builder setScanType(@Nullable String scanType) {
            this.scanType = Input.ofNullable(scanType);
            return this;
        }
        public RegistryScanningConfigurationState build() {
            return new RegistryScanningConfigurationState(registryId, rules, scanType);
        }
    }
}