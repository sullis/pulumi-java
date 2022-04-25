// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dns_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Cloud Logging configurations for publicly visible zones.
 * 
 */
public final class ManagedZoneCloudLoggingConfigResponse extends com.pulumi.resources.InvokeArgs {

    public static final ManagedZoneCloudLoggingConfigResponse Empty = new ManagedZoneCloudLoggingConfigResponse();

    /**
     * If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
     * 
     */
    @Import(name="enableLogging", required=true)
    private Boolean enableLogging;

    /**
     * @return If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
     * 
     */
    public Boolean enableLogging() {
        return this.enableLogging;
    }

    @Import(name="kind", required=true)
    private String kind;

    public String kind() {
        return this.kind;
    }

    private ManagedZoneCloudLoggingConfigResponse() {}

    private ManagedZoneCloudLoggingConfigResponse(ManagedZoneCloudLoggingConfigResponse $) {
        this.enableLogging = $.enableLogging;
        this.kind = $.kind;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ManagedZoneCloudLoggingConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneCloudLoggingConfigResponse $;

        public Builder() {
            $ = new ManagedZoneCloudLoggingConfigResponse();
        }

        public Builder(ManagedZoneCloudLoggingConfigResponse defaults) {
            $ = new ManagedZoneCloudLoggingConfigResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param enableLogging If set, enable query logging for this ManagedZone. False by default, making logging opt-in.
         * 
         * @return builder
         * 
         */
        public Builder enableLogging(Boolean enableLogging) {
            $.enableLogging = enableLogging;
            return this;
        }

        public Builder kind(String kind) {
            $.kind = kind;
            return this;
        }

        public ManagedZoneCloudLoggingConfigResponse build() {
            $.enableLogging = Objects.requireNonNull($.enableLogging, "expected parameter 'enableLogging' to be non-null");
            $.kind = Objects.requireNonNull($.kind, "expected parameter 'kind' to be non-null");
            return $;
        }
    }

}
