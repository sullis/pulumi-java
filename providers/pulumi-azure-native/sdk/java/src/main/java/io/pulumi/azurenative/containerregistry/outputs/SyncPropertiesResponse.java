// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerregistry.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SyncPropertiesResponse {
    /**
     * The gateway endpoint used by the connected registry to communicate with its parent.
     * 
     */
    private final String gatewayEndpoint;
    /**
     * The last time a sync occurred between the connected registry and its parent.
     * 
     */
    private final String lastSyncTime;
    /**
     * The period of time for which a message is available to sync before it is expired. Specify the duration using the format P[n]Y[n]M[n]DT[n]H[n]M[n]S as per ISO8601.
     * 
     */
    private final String messageTtl;
    /**
     * The cron expression indicating the schedule that the connected registry will sync with its parent.
     * 
     */
    private final @Nullable String schedule;
    /**
     * The time window during which sync is enabled for each schedule occurrence. Specify the duration using the format P[n]Y[n]M[n]DT[n]H[n]M[n]S as per ISO8601.
     * 
     */
    private final @Nullable String syncWindow;
    /**
     * The resource ID of the ACR token used to authenticate the connected registry to its parent during sync.
     * 
     */
    private final String tokenId;

    @OutputCustomType.Constructor({"gatewayEndpoint","lastSyncTime","messageTtl","schedule","syncWindow","tokenId"})
    private SyncPropertiesResponse(
        String gatewayEndpoint,
        String lastSyncTime,
        String messageTtl,
        @Nullable String schedule,
        @Nullable String syncWindow,
        String tokenId) {
        this.gatewayEndpoint = Objects.requireNonNull(gatewayEndpoint);
        this.lastSyncTime = Objects.requireNonNull(lastSyncTime);
        this.messageTtl = Objects.requireNonNull(messageTtl);
        this.schedule = schedule;
        this.syncWindow = syncWindow;
        this.tokenId = Objects.requireNonNull(tokenId);
    }

    /**
     * The gateway endpoint used by the connected registry to communicate with its parent.
     * 
     */
    public String getGatewayEndpoint() {
        return this.gatewayEndpoint;
    }
    /**
     * The last time a sync occurred between the connected registry and its parent.
     * 
     */
    public String getLastSyncTime() {
        return this.lastSyncTime;
    }
    /**
     * The period of time for which a message is available to sync before it is expired. Specify the duration using the format P[n]Y[n]M[n]DT[n]H[n]M[n]S as per ISO8601.
     * 
     */
    public String getMessageTtl() {
        return this.messageTtl;
    }
    /**
     * The cron expression indicating the schedule that the connected registry will sync with its parent.
     * 
     */
    public Optional<String> getSchedule() {
        return Optional.ofNullable(this.schedule);
    }
    /**
     * The time window during which sync is enabled for each schedule occurrence. Specify the duration using the format P[n]Y[n]M[n]DT[n]H[n]M[n]S as per ISO8601.
     * 
     */
    public Optional<String> getSyncWindow() {
        return Optional.ofNullable(this.syncWindow);
    }
    /**
     * The resource ID of the ACR token used to authenticate the connected registry to its parent during sync.
     * 
     */
    public String getTokenId() {
        return this.tokenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyncPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gatewayEndpoint;
        private String lastSyncTime;
        private String messageTtl;
        private @Nullable String schedule;
        private @Nullable String syncWindow;
        private String tokenId;

        public Builder() {
    	      // Empty
        }

        public Builder(SyncPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gatewayEndpoint = defaults.gatewayEndpoint;
    	      this.lastSyncTime = defaults.lastSyncTime;
    	      this.messageTtl = defaults.messageTtl;
    	      this.schedule = defaults.schedule;
    	      this.syncWindow = defaults.syncWindow;
    	      this.tokenId = defaults.tokenId;
        }

        public Builder setGatewayEndpoint(String gatewayEndpoint) {
            this.gatewayEndpoint = Objects.requireNonNull(gatewayEndpoint);
            return this;
        }

        public Builder setLastSyncTime(String lastSyncTime) {
            this.lastSyncTime = Objects.requireNonNull(lastSyncTime);
            return this;
        }

        public Builder setMessageTtl(String messageTtl) {
            this.messageTtl = Objects.requireNonNull(messageTtl);
            return this;
        }

        public Builder setSchedule(@Nullable String schedule) {
            this.schedule = schedule;
            return this;
        }

        public Builder setSyncWindow(@Nullable String syncWindow) {
            this.syncWindow = syncWindow;
            return this;
        }

        public Builder setTokenId(String tokenId) {
            this.tokenId = Objects.requireNonNull(tokenId);
            return this;
        }

        public SyncPropertiesResponse build() {
            return new SyncPropertiesResponse(gatewayEndpoint, lastSyncTime, messageTtl, schedule, syncWindow, tokenId);
        }
    }
}
