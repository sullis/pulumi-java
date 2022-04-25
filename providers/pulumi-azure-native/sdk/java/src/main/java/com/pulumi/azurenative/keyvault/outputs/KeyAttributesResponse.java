// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.keyvault.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class KeyAttributesResponse {
    /**
     * @return Creation time in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    private final Double created;
    /**
     * @return Determines whether or not the object is enabled.
     * 
     */
    private final @Nullable Boolean enabled;
    /**
     * @return Expiry date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    private final @Nullable Double expires;
    /**
     * @return Not before date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    private final @Nullable Double notBefore;
    /**
     * @return The deletion recovery level currently in effect for the object. If it contains &#39;Purgeable&#39;, then the object can be permanently deleted by a privileged user; otherwise, only the system can purge the object at the end of the retention interval.
     * 
     */
    private final String recoveryLevel;
    /**
     * @return Last updated time in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    private final Double updated;

    @CustomType.Constructor
    private KeyAttributesResponse(
        @CustomType.Parameter("created") Double created,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("expires") @Nullable Double expires,
        @CustomType.Parameter("notBefore") @Nullable Double notBefore,
        @CustomType.Parameter("recoveryLevel") String recoveryLevel,
        @CustomType.Parameter("updated") Double updated) {
        this.created = created;
        this.enabled = enabled;
        this.expires = expires;
        this.notBefore = notBefore;
        this.recoveryLevel = recoveryLevel;
        this.updated = updated;
    }

    /**
     * @return Creation time in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    public Double created() {
        return this.created;
    }
    /**
     * @return Determines whether or not the object is enabled.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }
    /**
     * @return Expiry date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    public Optional<Double> expires() {
        return Optional.ofNullable(this.expires);
    }
    /**
     * @return Not before date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    public Optional<Double> notBefore() {
        return Optional.ofNullable(this.notBefore);
    }
    /**
     * @return The deletion recovery level currently in effect for the object. If it contains &#39;Purgeable&#39;, then the object can be permanently deleted by a privileged user; otherwise, only the system can purge the object at the end of the retention interval.
     * 
     */
    public String recoveryLevel() {
        return this.recoveryLevel;
    }
    /**
     * @return Last updated time in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    public Double updated() {
        return this.updated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyAttributesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Double created;
        private @Nullable Boolean enabled;
        private @Nullable Double expires;
        private @Nullable Double notBefore;
        private String recoveryLevel;
        private Double updated;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyAttributesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.created = defaults.created;
    	      this.enabled = defaults.enabled;
    	      this.expires = defaults.expires;
    	      this.notBefore = defaults.notBefore;
    	      this.recoveryLevel = defaults.recoveryLevel;
    	      this.updated = defaults.updated;
        }

        public Builder created(Double created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder expires(@Nullable Double expires) {
            this.expires = expires;
            return this;
        }
        public Builder notBefore(@Nullable Double notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Builder recoveryLevel(String recoveryLevel) {
            this.recoveryLevel = Objects.requireNonNull(recoveryLevel);
            return this;
        }
        public Builder updated(Double updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }        public KeyAttributesResponse build() {
            return new KeyAttributesResponse(created, enabled, expires, notBefore, recoveryLevel, updated);
        }
    }
}
