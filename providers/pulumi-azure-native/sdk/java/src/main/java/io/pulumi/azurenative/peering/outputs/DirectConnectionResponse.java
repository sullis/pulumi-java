// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.outputs;

import io.pulumi.azurenative.peering.outputs.BgpSessionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DirectConnectionResponse {
    /**
     * The bandwidth of the connection.
     * 
     */
    private final @Nullable Integer bandwidthInMbps;
    /**
     * The BGP session associated with the connection.
     * 
     */
    private final @Nullable BgpSessionResponse bgpSession;
    /**
     * The unique identifier (GUID) for the connection.
     * 
     */
    private final @Nullable String connectionIdentifier;
    /**
     * The state of the connection.
     * 
     */
    private final String connectionState;
    /**
     * The error message related to the connection state, if any.
     * 
     */
    private final String errorMessage;
    /**
     * The ID used within Microsoft's peering provisioning system to track the connection
     * 
     */
    private final String microsoftTrackingId;
    /**
     * The PeeringDB.com ID of the facility at which the connection has to be set up.
     * 
     */
    private final @Nullable Integer peeringDBFacilityId;
    /**
     * The bandwidth that is actually provisioned.
     * 
     */
    private final Integer provisionedBandwidthInMbps;
    /**
     * The field indicating if Microsoft provides session ip addresses.
     * 
     */
    private final @Nullable String sessionAddressProvider;
    /**
     * The flag that indicates whether or not the connection is used for peering service.
     * 
     */
    private final @Nullable Boolean useForPeeringService;

    @OutputCustomType.Constructor({"bandwidthInMbps","bgpSession","connectionIdentifier","connectionState","errorMessage","microsoftTrackingId","peeringDBFacilityId","provisionedBandwidthInMbps","sessionAddressProvider","useForPeeringService"})
    private DirectConnectionResponse(
        @Nullable Integer bandwidthInMbps,
        @Nullable BgpSessionResponse bgpSession,
        @Nullable String connectionIdentifier,
        String connectionState,
        String errorMessage,
        String microsoftTrackingId,
        @Nullable Integer peeringDBFacilityId,
        Integer provisionedBandwidthInMbps,
        @Nullable String sessionAddressProvider,
        @Nullable Boolean useForPeeringService) {
        this.bandwidthInMbps = bandwidthInMbps;
        this.bgpSession = bgpSession;
        this.connectionIdentifier = connectionIdentifier;
        this.connectionState = Objects.requireNonNull(connectionState);
        this.errorMessage = Objects.requireNonNull(errorMessage);
        this.microsoftTrackingId = Objects.requireNonNull(microsoftTrackingId);
        this.peeringDBFacilityId = peeringDBFacilityId;
        this.provisionedBandwidthInMbps = Objects.requireNonNull(provisionedBandwidthInMbps);
        this.sessionAddressProvider = sessionAddressProvider;
        this.useForPeeringService = useForPeeringService;
    }

    /**
     * The bandwidth of the connection.
     * 
     */
    public Optional<Integer> getBandwidthInMbps() {
        return Optional.ofNullable(this.bandwidthInMbps);
    }
    /**
     * The BGP session associated with the connection.
     * 
     */
    public Optional<BgpSessionResponse> getBgpSession() {
        return Optional.ofNullable(this.bgpSession);
    }
    /**
     * The unique identifier (GUID) for the connection.
     * 
     */
    public Optional<String> getConnectionIdentifier() {
        return Optional.ofNullable(this.connectionIdentifier);
    }
    /**
     * The state of the connection.
     * 
     */
    public String getConnectionState() {
        return this.connectionState;
    }
    /**
     * The error message related to the connection state, if any.
     * 
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }
    /**
     * The ID used within Microsoft's peering provisioning system to track the connection
     * 
     */
    public String getMicrosoftTrackingId() {
        return this.microsoftTrackingId;
    }
    /**
     * The PeeringDB.com ID of the facility at which the connection has to be set up.
     * 
     */
    public Optional<Integer> getPeeringDBFacilityId() {
        return Optional.ofNullable(this.peeringDBFacilityId);
    }
    /**
     * The bandwidth that is actually provisioned.
     * 
     */
    public Integer getProvisionedBandwidthInMbps() {
        return this.provisionedBandwidthInMbps;
    }
    /**
     * The field indicating if Microsoft provides session ip addresses.
     * 
     */
    public Optional<String> getSessionAddressProvider() {
        return Optional.ofNullable(this.sessionAddressProvider);
    }
    /**
     * The flag that indicates whether or not the connection is used for peering service.
     * 
     */
    public Optional<Boolean> getUseForPeeringService() {
        return Optional.ofNullable(this.useForPeeringService);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bandwidthInMbps;
        private @Nullable BgpSessionResponse bgpSession;
        private @Nullable String connectionIdentifier;
        private String connectionState;
        private String errorMessage;
        private String microsoftTrackingId;
        private @Nullable Integer peeringDBFacilityId;
        private Integer provisionedBandwidthInMbps;
        private @Nullable String sessionAddressProvider;
        private @Nullable Boolean useForPeeringService;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthInMbps = defaults.bandwidthInMbps;
    	      this.bgpSession = defaults.bgpSession;
    	      this.connectionIdentifier = defaults.connectionIdentifier;
    	      this.connectionState = defaults.connectionState;
    	      this.errorMessage = defaults.errorMessage;
    	      this.microsoftTrackingId = defaults.microsoftTrackingId;
    	      this.peeringDBFacilityId = defaults.peeringDBFacilityId;
    	      this.provisionedBandwidthInMbps = defaults.provisionedBandwidthInMbps;
    	      this.sessionAddressProvider = defaults.sessionAddressProvider;
    	      this.useForPeeringService = defaults.useForPeeringService;
        }

        public Builder setBandwidthInMbps(@Nullable Integer bandwidthInMbps) {
            this.bandwidthInMbps = bandwidthInMbps;
            return this;
        }

        public Builder setBgpSession(@Nullable BgpSessionResponse bgpSession) {
            this.bgpSession = bgpSession;
            return this;
        }

        public Builder setConnectionIdentifier(@Nullable String connectionIdentifier) {
            this.connectionIdentifier = connectionIdentifier;
            return this;
        }

        public Builder setConnectionState(String connectionState) {
            this.connectionState = Objects.requireNonNull(connectionState);
            return this;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setMicrosoftTrackingId(String microsoftTrackingId) {
            this.microsoftTrackingId = Objects.requireNonNull(microsoftTrackingId);
            return this;
        }

        public Builder setPeeringDBFacilityId(@Nullable Integer peeringDBFacilityId) {
            this.peeringDBFacilityId = peeringDBFacilityId;
            return this;
        }

        public Builder setProvisionedBandwidthInMbps(Integer provisionedBandwidthInMbps) {
            this.provisionedBandwidthInMbps = Objects.requireNonNull(provisionedBandwidthInMbps);
            return this;
        }

        public Builder setSessionAddressProvider(@Nullable String sessionAddressProvider) {
            this.sessionAddressProvider = sessionAddressProvider;
            return this;
        }

        public Builder setUseForPeeringService(@Nullable Boolean useForPeeringService) {
            this.useForPeeringService = useForPeeringService;
            return this;
        }

        public DirectConnectionResponse build() {
            return new DirectConnectionResponse(bandwidthInMbps, bgpSession, connectionIdentifier, connectionState, errorMessage, microsoftTrackingId, peeringDBFacilityId, provisionedBandwidthInMbps, sessionAddressProvider, useForPeeringService);
        }
    }
}
