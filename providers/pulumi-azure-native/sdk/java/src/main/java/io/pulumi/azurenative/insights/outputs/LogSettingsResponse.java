// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.RetentionPolicyResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LogSettingsResponse {
    /**
     * Name of a Diagnostic Log category for a resource type this setting is applied to. To obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     * 
     */
    private final @Nullable String category;
    /**
     * a value indicating whether this log is enabled.
     * 
     */
    private final Boolean enabled;
    /**
     * the retention policy for this log.
     * 
     */
    private final @Nullable RetentionPolicyResponse retentionPolicy;

    @OutputCustomType.Constructor({"category","enabled","retentionPolicy"})
    private LogSettingsResponse(
        @Nullable String category,
        Boolean enabled,
        @Nullable RetentionPolicyResponse retentionPolicy) {
        this.category = category;
        this.enabled = Objects.requireNonNull(enabled);
        this.retentionPolicy = retentionPolicy;
    }

    /**
     * Name of a Diagnostic Log category for a resource type this setting is applied to. To obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     * 
    */
    public Optional<String> getCategory() {
        return Optional.ofNullable(this.category);
    }
    /**
     * a value indicating whether this log is enabled.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }
    /**
     * the retention policy for this log.
     * 
    */
    public Optional<RetentionPolicyResponse> getRetentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String category;
        private Boolean enabled;
        private @Nullable RetentionPolicyResponse retentionPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(LogSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.enabled = defaults.enabled;
    	      this.retentionPolicy = defaults.retentionPolicy;
        }

        public Builder setCategory(@Nullable String category) {
            this.category = category;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setRetentionPolicy(@Nullable RetentionPolicyResponse retentionPolicy) {
            this.retentionPolicy = retentionPolicy;
            return this;
        }
        public LogSettingsResponse build() {
            return new LogSettingsResponse(category, enabled, retentionPolicy);
        }
    }
}