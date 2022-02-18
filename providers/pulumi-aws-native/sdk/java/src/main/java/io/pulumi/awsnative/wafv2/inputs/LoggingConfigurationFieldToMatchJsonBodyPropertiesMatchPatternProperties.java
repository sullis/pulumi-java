// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The patterns to look for in the JSON body. AWS WAF inspects the results of these pattern matches against the rule inspection criteria.
 * 
 */
public final class LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties extends io.pulumi.resources.InvokeArgs {

    public static final LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties Empty = new LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties();

    /**
     * Match all of the elements. See also MatchScope in JsonBody. You must specify either this setting or the IncludedPaths setting, but not both.
     * 
     */
    @InputImport(name="all")
    private final @Nullable Object all;

    public Optional<Object> getAll() {
        return this.all == null ? Optional.empty() : Optional.ofNullable(this.all);
    }

    /**
     * Match only the specified include paths. See also MatchScope in JsonBody.
     * 
     */
    @InputImport(name="includedPaths")
    private final @Nullable List<String> includedPaths;

    public List<String> getIncludedPaths() {
        return this.includedPaths == null ? List.of() : this.includedPaths;
    }

    public LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties(
        @Nullable Object all,
        @Nullable List<String> includedPaths) {
        this.all = all;
        this.includedPaths = includedPaths;
    }

    private LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties() {
        this.all = null;
        this.includedPaths = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object all;
        private @Nullable List<String> includedPaths;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.includedPaths = defaults.includedPaths;
        }

        public Builder setAll(@Nullable Object all) {
            this.all = all;
            return this;
        }

        public Builder setIncludedPaths(@Nullable List<String> includedPaths) {
            this.includedPaths = includedPaths;
            return this;
        }

        public LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties build() {
            return new LoggingConfigurationFieldToMatchJsonBodyPropertiesMatchPatternProperties(all, includedPaths);
        }
    }
}
