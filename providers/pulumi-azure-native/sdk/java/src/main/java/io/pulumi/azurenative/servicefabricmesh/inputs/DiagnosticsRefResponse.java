// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Reference to sinks in DiagnosticsDescription.
 * 
 */
public final class DiagnosticsRefResponse extends io.pulumi.resources.InvokeArgs {

    public static final DiagnosticsRefResponse Empty = new DiagnosticsRefResponse();

    /**
     * Status of whether or not sinks are enabled.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * List of sinks to be used if enabled. References the list of sinks in DiagnosticsDescription.
     * 
     */
    @InputImport(name="sinkRefs")
    private final @Nullable List<String> sinkRefs;

    public List<String> getSinkRefs() {
        return this.sinkRefs == null ? List.of() : this.sinkRefs;
    }

    public DiagnosticsRefResponse(
        @Nullable Boolean enabled,
        @Nullable List<String> sinkRefs) {
        this.enabled = enabled;
        this.sinkRefs = sinkRefs;
    }

    private DiagnosticsRefResponse() {
        this.enabled = null;
        this.sinkRefs = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticsRefResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable List<String> sinkRefs;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticsRefResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.sinkRefs = defaults.sinkRefs;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setSinkRefs(@Nullable List<String> sinkRefs) {
            this.sinkRefs = sinkRefs;
            return this;
        }

        public DiagnosticsRefResponse build() {
            return new DiagnosticsRefResponse(enabled, sinkRefs);
        }
    }
}
