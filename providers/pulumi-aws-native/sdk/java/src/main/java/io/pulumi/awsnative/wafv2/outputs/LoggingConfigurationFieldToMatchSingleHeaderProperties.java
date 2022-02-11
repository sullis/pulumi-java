// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class LoggingConfigurationFieldToMatchSingleHeaderProperties {
    private final String name;

    @OutputCustomType.Constructor({"name"})
    private LoggingConfigurationFieldToMatchSingleHeaderProperties(String name) {
        this.name = Objects.requireNonNull(name);
    }

    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoggingConfigurationFieldToMatchSingleHeaderProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(LoggingConfigurationFieldToMatchSingleHeaderProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public LoggingConfigurationFieldToMatchSingleHeaderProperties build() {
            return new LoggingConfigurationFieldToMatchSingleHeaderProperties(name);
        }
    }
}
