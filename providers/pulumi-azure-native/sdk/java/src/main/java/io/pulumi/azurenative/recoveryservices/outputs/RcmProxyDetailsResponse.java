// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.HealthErrorResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class RcmProxyDetailsResponse {
    /**
     * The health of the RCM proxy.
     * 
     */
    private final String health;
    /**
     * The health errors.
     * 
     */
    private final List<HealthErrorResponse> healthErrors;
    /**
     * The RCM proxy Id.
     * 
     */
    private final String id;
    /**
     * The last heartbeat received from the RCM proxy.
     * 
     */
    private final String lastHeartbeatUtc;
    /**
     * The RCM proxy name.
     * 
     */
    private final String name;
    /**
     * The RCM proxy version.
     * 
     */
    private final String version;

    @OutputCustomType.Constructor({"health","healthErrors","id","lastHeartbeatUtc","name","version"})
    private RcmProxyDetailsResponse(
        String health,
        List<HealthErrorResponse> healthErrors,
        String id,
        String lastHeartbeatUtc,
        String name,
        String version) {
        this.health = Objects.requireNonNull(health);
        this.healthErrors = Objects.requireNonNull(healthErrors);
        this.id = Objects.requireNonNull(id);
        this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
        this.name = Objects.requireNonNull(name);
        this.version = Objects.requireNonNull(version);
    }

    /**
     * The health of the RCM proxy.
     * 
     */
    public String getHealth() {
        return this.health;
    }
    /**
     * The health errors.
     * 
     */
    public List<HealthErrorResponse> getHealthErrors() {
        return this.healthErrors;
    }
    /**
     * The RCM proxy Id.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * The last heartbeat received from the RCM proxy.
     * 
     */
    public String getLastHeartbeatUtc() {
        return this.lastHeartbeatUtc;
    }
    /**
     * The RCM proxy name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * The RCM proxy version.
     * 
     */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RcmProxyDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String health;
        private List<HealthErrorResponse> healthErrors;
        private String id;
        private String lastHeartbeatUtc;
        private String name;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(RcmProxyDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.health = defaults.health;
    	      this.healthErrors = defaults.healthErrors;
    	      this.id = defaults.id;
    	      this.lastHeartbeatUtc = defaults.lastHeartbeatUtc;
    	      this.name = defaults.name;
    	      this.version = defaults.version;
        }

        public Builder setHealth(String health) {
            this.health = Objects.requireNonNull(health);
            return this;
        }

        public Builder setHealthErrors(List<HealthErrorResponse> healthErrors) {
            this.healthErrors = Objects.requireNonNull(healthErrors);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastHeartbeatUtc(String lastHeartbeatUtc) {
            this.lastHeartbeatUtc = Objects.requireNonNull(lastHeartbeatUtc);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setVersion(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }

        public RcmProxyDetailsResponse build() {
            return new RcmProxyDetailsResponse(health, healthErrors, id, lastHeartbeatUtc, name, version);
        }
    }
}
