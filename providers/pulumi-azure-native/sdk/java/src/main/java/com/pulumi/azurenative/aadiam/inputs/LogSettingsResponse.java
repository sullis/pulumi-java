// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.aadiam.inputs;

import com.pulumi.azurenative.aadiam.inputs.RetentionPolicyResponse;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Part of MultiTenantDiagnosticSettings. Specifies the settings for a particular log.
 * 
 */
public final class LogSettingsResponse extends com.pulumi.resources.InvokeArgs {

    public static final LogSettingsResponse Empty = new LogSettingsResponse();

    /**
     * Name of a Diagnostic Log category for a resource type this setting is applied to. To obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     * 
     */
    @Import(name="category")
    private @Nullable String category;

    /**
     * @return Name of a Diagnostic Log category for a resource type this setting is applied to. To obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
     * 
     */
    public Optional<String> category() {
        return Optional.ofNullable(this.category);
    }

    /**
     * A value indicating whether this log is enabled.
     * 
     */
    @Import(name="enabled", required=true)
    private Boolean enabled;

    /**
     * @return A value indicating whether this log is enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * The retention policy for this log.
     * 
     */
    @Import(name="retentionPolicy")
    private @Nullable RetentionPolicyResponse retentionPolicy;

    /**
     * @return The retention policy for this log.
     * 
     */
    public Optional<RetentionPolicyResponse> retentionPolicy() {
        return Optional.ofNullable(this.retentionPolicy);
    }

    private LogSettingsResponse() {}

    private LogSettingsResponse(LogSettingsResponse $) {
        this.category = $.category;
        this.enabled = $.enabled;
        this.retentionPolicy = $.retentionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LogSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LogSettingsResponse $;

        public Builder() {
            $ = new LogSettingsResponse();
        }

        public Builder(LogSettingsResponse defaults) {
            $ = new LogSettingsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param category Name of a Diagnostic Log category for a resource type this setting is applied to. To obtain the list of Diagnostic Log categories for a resource, first perform a GET diagnostic settings operation.
         * 
         * @return builder
         * 
         */
        public Builder category(@Nullable String category) {
            $.category = category;
            return this;
        }

        /**
         * @param enabled A value indicating whether this log is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param retentionPolicy The retention policy for this log.
         * 
         * @return builder
         * 
         */
        public Builder retentionPolicy(@Nullable RetentionPolicyResponse retentionPolicy) {
            $.retentionPolicy = retentionPolicy;
            return this;
        }

        public LogSettingsResponse build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
