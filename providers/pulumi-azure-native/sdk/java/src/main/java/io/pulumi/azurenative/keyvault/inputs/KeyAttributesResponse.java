// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The attributes of the key.
 * 
 */
public final class KeyAttributesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyAttributesResponse Empty = new KeyAttributesResponse();

    /**
     * Creation time in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @InputImport(name="created", required=true)
    private final Double created;

    public Double getCreated() {
        return this.created;
    }

    /**
     * Determines whether or not the object is enabled.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    /**
     * Expiry date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @InputImport(name="expires")
    private final @Nullable Double expires;

    public Optional<Double> getExpires() {
        return this.expires == null ? Optional.empty() : Optional.ofNullable(this.expires);
    }

    /**
     * Not before date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @InputImport(name="notBefore")
    private final @Nullable Double notBefore;

    public Optional<Double> getNotBefore() {
        return this.notBefore == null ? Optional.empty() : Optional.ofNullable(this.notBefore);
    }

    /**
     * The deletion recovery level currently in effect for the object. If it contains 'Purgeable', then the object can be permanently deleted by a privileged user; otherwise, only the system can purge the object at the end of the retention interval.
     * 
     */
    @InputImport(name="recoveryLevel", required=true)
    private final String recoveryLevel;

    public String getRecoveryLevel() {
        return this.recoveryLevel;
    }

    /**
     * Last updated time in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @InputImport(name="updated", required=true)
    private final Double updated;

    public Double getUpdated() {
        return this.updated;
    }

    public KeyAttributesResponse(
        Double created,
        @Nullable Boolean enabled,
        @Nullable Double expires,
        @Nullable Double notBefore,
        String recoveryLevel,
        Double updated) {
        this.created = Objects.requireNonNull(created, "expected parameter 'created' to be non-null");
        this.enabled = enabled;
        this.expires = expires;
        this.notBefore = notBefore;
        this.recoveryLevel = Objects.requireNonNull(recoveryLevel, "expected parameter 'recoveryLevel' to be non-null");
        this.updated = Objects.requireNonNull(updated, "expected parameter 'updated' to be non-null");
    }

    private KeyAttributesResponse() {
        this.created = null;
        this.enabled = null;
        this.expires = null;
        this.notBefore = null;
        this.recoveryLevel = null;
        this.updated = null;
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

        public Builder setCreated(Double created) {
            this.created = Objects.requireNonNull(created);
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setExpires(@Nullable Double expires) {
            this.expires = expires;
            return this;
        }

        public Builder setNotBefore(@Nullable Double notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        public Builder setRecoveryLevel(String recoveryLevel) {
            this.recoveryLevel = Objects.requireNonNull(recoveryLevel);
            return this;
        }

        public Builder setUpdated(Double updated) {
            this.updated = Objects.requireNonNull(updated);
            return this;
        }

        public KeyAttributesResponse build() {
            return new KeyAttributesResponse(created, enabled, expires, notBefore, recoveryLevel, updated);
        }
    }
}
