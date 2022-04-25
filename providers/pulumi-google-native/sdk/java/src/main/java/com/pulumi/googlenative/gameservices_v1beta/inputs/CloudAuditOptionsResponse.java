// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gameservices_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.gameservices_v1beta.inputs.AuthorizationLoggingOptionsResponse;
import java.lang.String;
import java.util.Objects;


/**
 * Write a Cloud Audit log
 * 
 */
public final class CloudAuditOptionsResponse extends com.pulumi.resources.InvokeArgs {

    public static final CloudAuditOptionsResponse Empty = new CloudAuditOptionsResponse();

    /**
     * Information used by the Cloud Audit Logging pipeline.
     * 
     */
    @Import(name="authorizationLoggingOptions", required=true)
    private AuthorizationLoggingOptionsResponse authorizationLoggingOptions;

    /**
     * @return Information used by the Cloud Audit Logging pipeline.
     * 
     */
    public AuthorizationLoggingOptionsResponse authorizationLoggingOptions() {
        return this.authorizationLoggingOptions;
    }

    /**
     * The log_name to populate in the Cloud Audit Record.
     * 
     */
    @Import(name="logName", required=true)
    private String logName;

    /**
     * @return The log_name to populate in the Cloud Audit Record.
     * 
     */
    public String logName() {
        return this.logName;
    }

    private CloudAuditOptionsResponse() {}

    private CloudAuditOptionsResponse(CloudAuditOptionsResponse $) {
        this.authorizationLoggingOptions = $.authorizationLoggingOptions;
        this.logName = $.logName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudAuditOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudAuditOptionsResponse $;

        public Builder() {
            $ = new CloudAuditOptionsResponse();
        }

        public Builder(CloudAuditOptionsResponse defaults) {
            $ = new CloudAuditOptionsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorizationLoggingOptions Information used by the Cloud Audit Logging pipeline.
         * 
         * @return builder
         * 
         */
        public Builder authorizationLoggingOptions(AuthorizationLoggingOptionsResponse authorizationLoggingOptions) {
            $.authorizationLoggingOptions = authorizationLoggingOptions;
            return this;
        }

        /**
         * @param logName The log_name to populate in the Cloud Audit Record.
         * 
         * @return builder
         * 
         */
        public Builder logName(String logName) {
            $.logName = logName;
            return this;
        }

        public CloudAuditOptionsResponse build() {
            $.authorizationLoggingOptions = Objects.requireNonNull($.authorizationLoggingOptions, "expected parameter 'authorizationLoggingOptions' to be non-null");
            $.logName = Objects.requireNonNull($.logName, "expected parameter 'logName' to be non-null");
            return $;
        }
    }

}
