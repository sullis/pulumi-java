// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Linux specific update configuration.
 * 
 */
public final class LinuxPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinuxPropertiesResponse Empty = new LinuxPropertiesResponse();

    /**
     * packages excluded from the software update configuration.
     * 
     */
    @InputImport(name="excludedPackageNameMasks")
    private final @Nullable List<String> excludedPackageNameMasks;

    public List<String> getExcludedPackageNameMasks() {
        return this.excludedPackageNameMasks == null ? List.of() : this.excludedPackageNameMasks;
    }

    /**
     * Update classifications included in the software update configuration.
     * 
     */
    @InputImport(name="includedPackageClassifications")
    private final @Nullable String includedPackageClassifications;

    public Optional<String> getIncludedPackageClassifications() {
        return this.includedPackageClassifications == null ? Optional.empty() : Optional.ofNullable(this.includedPackageClassifications);
    }

    /**
     * packages included from the software update configuration.
     * 
     */
    @InputImport(name="includedPackageNameMasks")
    private final @Nullable List<String> includedPackageNameMasks;

    public List<String> getIncludedPackageNameMasks() {
        return this.includedPackageNameMasks == null ? List.of() : this.includedPackageNameMasks;
    }

    /**
     * Reboot setting for the software update configuration.
     * 
     */
    @InputImport(name="rebootSetting")
    private final @Nullable String rebootSetting;

    public Optional<String> getRebootSetting() {
        return this.rebootSetting == null ? Optional.empty() : Optional.ofNullable(this.rebootSetting);
    }

    public LinuxPropertiesResponse(
        @Nullable List<String> excludedPackageNameMasks,
        @Nullable String includedPackageClassifications,
        @Nullable List<String> includedPackageNameMasks,
        @Nullable String rebootSetting) {
        this.excludedPackageNameMasks = excludedPackageNameMasks;
        this.includedPackageClassifications = includedPackageClassifications;
        this.includedPackageNameMasks = includedPackageNameMasks;
        this.rebootSetting = rebootSetting;
    }

    private LinuxPropertiesResponse() {
        this.excludedPackageNameMasks = List.of();
        this.includedPackageClassifications = null;
        this.includedPackageNameMasks = List.of();
        this.rebootSetting = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludedPackageNameMasks;
        private @Nullable String includedPackageClassifications;
        private @Nullable List<String> includedPackageNameMasks;
        private @Nullable String rebootSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedPackageNameMasks = defaults.excludedPackageNameMasks;
    	      this.includedPackageClassifications = defaults.includedPackageClassifications;
    	      this.includedPackageNameMasks = defaults.includedPackageNameMasks;
    	      this.rebootSetting = defaults.rebootSetting;
        }

        public Builder setExcludedPackageNameMasks(@Nullable List<String> excludedPackageNameMasks) {
            this.excludedPackageNameMasks = excludedPackageNameMasks;
            return this;
        }

        public Builder setIncludedPackageClassifications(@Nullable String includedPackageClassifications) {
            this.includedPackageClassifications = includedPackageClassifications;
            return this;
        }

        public Builder setIncludedPackageNameMasks(@Nullable List<String> includedPackageNameMasks) {
            this.includedPackageNameMasks = includedPackageNameMasks;
            return this;
        }

        public Builder setRebootSetting(@Nullable String rebootSetting) {
            this.rebootSetting = rebootSetting;
            return this;
        }

        public LinuxPropertiesResponse build() {
            return new LinuxPropertiesResponse(excludedPackageNameMasks, includedPackageClassifications, includedPackageNameMasks, rebootSetting);
        }
    }
}
