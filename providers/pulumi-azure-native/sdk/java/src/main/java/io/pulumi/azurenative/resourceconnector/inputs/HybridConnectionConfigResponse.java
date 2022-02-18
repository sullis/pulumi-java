// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resourceconnector.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;


/**
 * Contains the REP (rendezvous endpoint) and “Listener” access token from notification service (NS).
 * 
 */
public final class HybridConnectionConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final HybridConnectionConfigResponse Empty = new HybridConnectionConfigResponse();

    /**
     * Timestamp when this token will be expired.
     * 
     */
    @InputImport(name="expirationTime", required=true)
    private final Double expirationTime;

    public Double getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * Name of the connection
     * 
     */
    @InputImport(name="hybridConnectionName", required=true)
    private final String hybridConnectionName;

    public String getHybridConnectionName() {
        return this.hybridConnectionName;
    }

    /**
     * Name of the notification service.
     * 
     */
    @InputImport(name="relay", required=true)
    private final String relay;

    public String getRelay() {
        return this.relay;
    }

    /**
     * Listener access token
     * 
     */
    @InputImport(name="token", required=true)
    private final String token;

    public String getToken() {
        return this.token;
    }

    public HybridConnectionConfigResponse(
        Double expirationTime,
        String hybridConnectionName,
        String relay,
        String token) {
        this.expirationTime = Objects.requireNonNull(expirationTime, "expected parameter 'expirationTime' to be non-null");
        this.hybridConnectionName = Objects.requireNonNull(hybridConnectionName, "expected parameter 'hybridConnectionName' to be non-null");
        this.relay = Objects.requireNonNull(relay, "expected parameter 'relay' to be non-null");
        this.token = Objects.requireNonNull(token, "expected parameter 'token' to be non-null");
    }

    private HybridConnectionConfigResponse() {
        this.expirationTime = null;
        this.hybridConnectionName = null;
        this.relay = null;
        this.token = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridConnectionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double expirationTime;
        private String hybridConnectionName;
        private String relay;
        private String token;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridConnectionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.hybridConnectionName = defaults.hybridConnectionName;
    	      this.relay = defaults.relay;
    	      this.token = defaults.token;
        }

        public Builder setExpirationTime(Double expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public Builder setHybridConnectionName(String hybridConnectionName) {
            this.hybridConnectionName = Objects.requireNonNull(hybridConnectionName);
            return this;
        }

        public Builder setRelay(String relay) {
            this.relay = Objects.requireNonNull(relay);
            return this;
        }

        public Builder setToken(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }

        public HybridConnectionConfigResponse build() {
            return new HybridConnectionConfigResponse(expirationTime, hybridConnectionName, relay, token);
        }
    }
}
