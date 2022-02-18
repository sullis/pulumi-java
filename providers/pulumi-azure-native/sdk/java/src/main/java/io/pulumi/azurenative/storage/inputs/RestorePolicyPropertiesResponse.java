// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The blob service properties for blob restore policy
 * 
 */
public final class RestorePolicyPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final RestorePolicyPropertiesResponse Empty = new RestorePolicyPropertiesResponse();

    /**
     * how long this blob can be restored. It should be great than zero and less than DeleteRetentionPolicy.days.
     * 
     */
    @InputImport(name="days")
    private final @Nullable Integer days;

    public Optional<Integer> getDays() {
        return this.days == null ? Optional.empty() : Optional.ofNullable(this.days);
    }

    /**
     * Blob restore is enabled if set to true.
     * 
     */
    @InputImport(name="enabled", required=true)
    private final Boolean enabled;

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Deprecated in favor of minRestoreTime property.
     * 
     */
    @InputImport(name="lastEnabledTime", required=true)
    private final String lastEnabledTime;

    public String getLastEnabledTime() {
        return this.lastEnabledTime;
    }

    /**
     * Returns the minimum date and time that the restore can be started.
     * 
     */
    @InputImport(name="minRestoreTime", required=true)
    private final String minRestoreTime;

    public String getMinRestoreTime() {
        return this.minRestoreTime;
    }

    public RestorePolicyPropertiesResponse(
        @Nullable Integer days,
        Boolean enabled,
        String lastEnabledTime,
        String minRestoreTime) {
        this.days = days;
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.lastEnabledTime = Objects.requireNonNull(lastEnabledTime, "expected parameter 'lastEnabledTime' to be non-null");
        this.minRestoreTime = Objects.requireNonNull(minRestoreTime, "expected parameter 'minRestoreTime' to be non-null");
    }

    private RestorePolicyPropertiesResponse() {
        this.days = null;
        this.enabled = null;
        this.lastEnabledTime = null;
        this.minRestoreTime = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestorePolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer days;
        private Boolean enabled;
        private String lastEnabledTime;
        private String minRestoreTime;

        public Builder() {
    	      // Empty
        }

        public Builder(RestorePolicyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.days = defaults.days;
    	      this.enabled = defaults.enabled;
    	      this.lastEnabledTime = defaults.lastEnabledTime;
    	      this.minRestoreTime = defaults.minRestoreTime;
        }

        public Builder setDays(@Nullable Integer days) {
            this.days = days;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setLastEnabledTime(String lastEnabledTime) {
            this.lastEnabledTime = Objects.requireNonNull(lastEnabledTime);
            return this;
        }

        public Builder setMinRestoreTime(String minRestoreTime) {
            this.minRestoreTime = Objects.requireNonNull(minRestoreTime);
            return this;
        }

        public RestorePolicyPropertiesResponse build() {
            return new RestorePolicyPropertiesResponse(days, enabled, lastEnabledTime, minRestoreTime);
        }
    }
}
