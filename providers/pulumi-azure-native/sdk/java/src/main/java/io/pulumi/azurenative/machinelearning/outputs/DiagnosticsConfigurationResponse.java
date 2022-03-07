// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DiagnosticsConfigurationResponse {
    /**
     * Specifies the date and time when the logging will cease. If null, diagnostic collection is not time limited.
     * 
     */
    private final @Nullable String expiry;
    /**
     * Specifies the verbosity of the diagnostic output. Valid values are: None - disables tracing; Error - collects only error (stderr) traces; All - collects all traces (stdout and stderr).
     * 
     */
    private final String level;

    @OutputCustomType.Constructor({"expiry","level"})
    private DiagnosticsConfigurationResponse(
        @Nullable String expiry,
        String level) {
        this.expiry = expiry;
        this.level = Objects.requireNonNull(level);
    }

    /**
     * Specifies the date and time when the logging will cease. If null, diagnostic collection is not time limited.
     * 
    */
    public Optional<String> getExpiry() {
        return Optional.ofNullable(this.expiry);
    }
    /**
     * Specifies the verbosity of the diagnostic output. Valid values are: None - disables tracing; Error - collects only error (stderr) traces; All - collects all traces (stdout and stderr).
     * 
    */
    public String getLevel() {
        return this.level;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expiry;
        private String level;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expiry = defaults.expiry;
    	      this.level = defaults.level;
        }

        public Builder setExpiry(@Nullable String expiry) {
            this.expiry = expiry;
            return this;
        }

        public Builder setLevel(String level) {
            this.level = Objects.requireNonNull(level);
            return this;
        }
        public DiagnosticsConfigurationResponse build() {
            return new DiagnosticsConfigurationResponse(expiry, level);
        }
    }
}