// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Windows specific update configuration.
 * 
 */
public final class WindowsPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final WindowsPropertiesResponse Empty = new WindowsPropertiesResponse();

    /**
     * KB numbers excluded from the software update configuration.
     * 
     */
    @Import(name="excludedKbNumbers")
      private final @Nullable List<String> excludedKbNumbers;

    public List<String> getExcludedKbNumbers() {
        return this.excludedKbNumbers == null ? List.of() : this.excludedKbNumbers;
    }

    /**
     * KB numbers included from the software update configuration.
     * 
     */
    @Import(name="includedKbNumbers")
      private final @Nullable List<String> includedKbNumbers;

    public List<String> getIncludedKbNumbers() {
        return this.includedKbNumbers == null ? List.of() : this.includedKbNumbers;
    }

    /**
     * Update classification included in the software update configuration. A comma separated string with required values
     * 
     */
    @Import(name="includedUpdateClassifications")
      private final @Nullable String includedUpdateClassifications;

    public Optional<String> getIncludedUpdateClassifications() {
        return this.includedUpdateClassifications == null ? Optional.empty() : Optional.ofNullable(this.includedUpdateClassifications);
    }

    /**
     * Reboot setting for the software update configuration.
     * 
     */
    @Import(name="rebootSetting")
      private final @Nullable String rebootSetting;

    public Optional<String> getRebootSetting() {
        return this.rebootSetting == null ? Optional.empty() : Optional.ofNullable(this.rebootSetting);
    }

    public WindowsPropertiesResponse(
        @Nullable List<String> excludedKbNumbers,
        @Nullable List<String> includedKbNumbers,
        @Nullable String includedUpdateClassifications,
        @Nullable String rebootSetting) {
        this.excludedKbNumbers = excludedKbNumbers;
        this.includedKbNumbers = includedKbNumbers;
        this.includedUpdateClassifications = includedUpdateClassifications;
        this.rebootSetting = rebootSetting;
    }

    private WindowsPropertiesResponse() {
        this.excludedKbNumbers = List.of();
        this.includedKbNumbers = List.of();
        this.includedUpdateClassifications = null;
        this.rebootSetting = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> excludedKbNumbers;
        private @Nullable List<String> includedKbNumbers;
        private @Nullable String includedUpdateClassifications;
        private @Nullable String rebootSetting;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedKbNumbers = defaults.excludedKbNumbers;
    	      this.includedKbNumbers = defaults.includedKbNumbers;
    	      this.includedUpdateClassifications = defaults.includedUpdateClassifications;
    	      this.rebootSetting = defaults.rebootSetting;
        }

        public Builder excludedKbNumbers(@Nullable List<String> excludedKbNumbers) {
            this.excludedKbNumbers = excludedKbNumbers;
            return this;
        }
        public Builder excludedKbNumbers(String... excludedKbNumbers) {
            return excludedKbNumbers(List.of(excludedKbNumbers));
        }
        public Builder includedKbNumbers(@Nullable List<String> includedKbNumbers) {
            this.includedKbNumbers = includedKbNumbers;
            return this;
        }
        public Builder includedKbNumbers(String... includedKbNumbers) {
            return includedKbNumbers(List.of(includedKbNumbers));
        }
        public Builder includedUpdateClassifications(@Nullable String includedUpdateClassifications) {
            this.includedUpdateClassifications = includedUpdateClassifications;
            return this;
        }
        public Builder rebootSetting(@Nullable String rebootSetting) {
            this.rebootSetting = rebootSetting;
            return this;
        }        public WindowsPropertiesResponse build() {
            return new WindowsPropertiesResponse(excludedKbNumbers, includedKbNumbers, includedUpdateClassifications, rebootSetting);
        }
    }
}
