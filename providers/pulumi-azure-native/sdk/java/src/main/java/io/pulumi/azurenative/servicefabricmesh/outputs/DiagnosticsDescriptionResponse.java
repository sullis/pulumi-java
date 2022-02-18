// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.outputs;

import io.pulumi.azurenative.servicefabricmesh.outputs.AzureInternalMonitoringPipelineSinkDescriptionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DiagnosticsDescriptionResponse {
    /**
     * The sinks to be used if diagnostics is enabled. Sink choices can be overridden at the service and code package level.
     * 
     */
    private final @Nullable List<String> defaultSinkRefs;
    /**
     * Status of whether or not sinks are enabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * List of supported sinks that can be referenced.
     * 
     */
    private final @Nullable List<AzureInternalMonitoringPipelineSinkDescriptionResponse> sinks;

    @OutputCustomType.Constructor({"defaultSinkRefs","enabled","sinks"})
    private DiagnosticsDescriptionResponse(
        @Nullable List<String> defaultSinkRefs,
        @Nullable Boolean enabled,
        @Nullable List<AzureInternalMonitoringPipelineSinkDescriptionResponse> sinks) {
        this.defaultSinkRefs = defaultSinkRefs;
        this.enabled = enabled;
        this.sinks = sinks;
    }

    /**
     * The sinks to be used if diagnostics is enabled. Sink choices can be overridden at the service and code package level.
     * 
     */
    public List<String> getDefaultSinkRefs() {
        return this.defaultSinkRefs == null ? List.of() : this.defaultSinkRefs;
    }
    /**
     * Status of whether or not sinks are enabled.
     * 
     */
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * List of supported sinks that can be referenced.
     * 
     */
    public List<AzureInternalMonitoringPipelineSinkDescriptionResponse> getSinks() {
        return this.sinks == null ? List.of() : this.sinks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiagnosticsDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> defaultSinkRefs;
        private @Nullable Boolean enabled;
        private @Nullable List<AzureInternalMonitoringPipelineSinkDescriptionResponse> sinks;

        public Builder() {
    	      // Empty
        }

        public Builder(DiagnosticsDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultSinkRefs = defaults.defaultSinkRefs;
    	      this.enabled = defaults.enabled;
    	      this.sinks = defaults.sinks;
        }

        public Builder setDefaultSinkRefs(@Nullable List<String> defaultSinkRefs) {
            this.defaultSinkRefs = defaultSinkRefs;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setSinks(@Nullable List<AzureInternalMonitoringPipelineSinkDescriptionResponse> sinks) {
            this.sinks = sinks;
            return this;
        }

        public DiagnosticsDescriptionResponse build() {
            return new DiagnosticsDescriptionResponse(defaultSinkRefs, enabled, sinks);
        }
    }
}
