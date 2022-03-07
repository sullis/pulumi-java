// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.OfficeDataConnectorDataTypesResponseExchange;
import io.pulumi.azurenative.securityinsights.outputs.OfficeDataConnectorDataTypesResponseSharePoint;
import io.pulumi.azurenative.securityinsights.outputs.OfficeDataConnectorDataTypesResponseTeams;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class OfficeDataConnectorDataTypesResponse {
    /**
     * Exchange data type connection.
     * 
     */
    private final @Nullable OfficeDataConnectorDataTypesResponseExchange exchange;
    /**
     * SharePoint data type connection.
     * 
     */
    private final @Nullable OfficeDataConnectorDataTypesResponseSharePoint sharePoint;
    /**
     * Teams data type connection.
     * 
     */
    private final @Nullable OfficeDataConnectorDataTypesResponseTeams teams;

    @OutputCustomType.Constructor({"exchange","sharePoint","teams"})
    private OfficeDataConnectorDataTypesResponse(
        @Nullable OfficeDataConnectorDataTypesResponseExchange exchange,
        @Nullable OfficeDataConnectorDataTypesResponseSharePoint sharePoint,
        @Nullable OfficeDataConnectorDataTypesResponseTeams teams) {
        this.exchange = exchange;
        this.sharePoint = sharePoint;
        this.teams = teams;
    }

    /**
     * Exchange data type connection.
     * 
    */
    public Optional<OfficeDataConnectorDataTypesResponseExchange> getExchange() {
        return Optional.ofNullable(this.exchange);
    }
    /**
     * SharePoint data type connection.
     * 
    */
    public Optional<OfficeDataConnectorDataTypesResponseSharePoint> getSharePoint() {
        return Optional.ofNullable(this.sharePoint);
    }
    /**
     * Teams data type connection.
     * 
    */
    public Optional<OfficeDataConnectorDataTypesResponseTeams> getTeams() {
        return Optional.ofNullable(this.teams);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OfficeDataConnectorDataTypesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OfficeDataConnectorDataTypesResponseExchange exchange;
        private @Nullable OfficeDataConnectorDataTypesResponseSharePoint sharePoint;
        private @Nullable OfficeDataConnectorDataTypesResponseTeams teams;

        public Builder() {
    	      // Empty
        }

        public Builder(OfficeDataConnectorDataTypesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exchange = defaults.exchange;
    	      this.sharePoint = defaults.sharePoint;
    	      this.teams = defaults.teams;
        }

        public Builder setExchange(@Nullable OfficeDataConnectorDataTypesResponseExchange exchange) {
            this.exchange = exchange;
            return this;
        }

        public Builder setSharePoint(@Nullable OfficeDataConnectorDataTypesResponseSharePoint sharePoint) {
            this.sharePoint = sharePoint;
            return this;
        }

        public Builder setTeams(@Nullable OfficeDataConnectorDataTypesResponseTeams teams) {
            this.teams = teams;
            return this;
        }
        public OfficeDataConnectorDataTypesResponse build() {
            return new OfficeDataConnectorDataTypesResponse(exchange, sharePoint, teams);
        }
    }
}