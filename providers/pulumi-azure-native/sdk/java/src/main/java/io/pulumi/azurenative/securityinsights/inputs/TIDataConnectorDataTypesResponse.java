// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.azurenative.securityinsights.inputs.TIDataConnectorDataTypesResponseIndicators;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The available data types for TI (Threat Intelligence) data connector.
 * 
 */
public final class TIDataConnectorDataTypesResponse extends io.pulumi.resources.InvokeArgs {

    public static final TIDataConnectorDataTypesResponse Empty = new TIDataConnectorDataTypesResponse();

    /**
     * Data type for indicators connection.
     * 
     */
    @InputImport(name="indicators")
    private final @Nullable TIDataConnectorDataTypesResponseIndicators indicators;

    public Optional<TIDataConnectorDataTypesResponseIndicators> getIndicators() {
        return this.indicators == null ? Optional.empty() : Optional.ofNullable(this.indicators);
    }

    public TIDataConnectorDataTypesResponse(@Nullable TIDataConnectorDataTypesResponseIndicators indicators) {
        this.indicators = indicators;
    }

    private TIDataConnectorDataTypesResponse() {
        this.indicators = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TIDataConnectorDataTypesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TIDataConnectorDataTypesResponseIndicators indicators;

        public Builder() {
    	      // Empty
        }

        public Builder(TIDataConnectorDataTypesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.indicators = defaults.indicators;
        }

        public Builder setIndicators(@Nullable TIDataConnectorDataTypesResponseIndicators indicators) {
            this.indicators = indicators;
            return this;
        }

        public TIDataConnectorDataTypesResponse build() {
            return new TIDataConnectorDataTypesResponse(indicators);
        }
    }
}
