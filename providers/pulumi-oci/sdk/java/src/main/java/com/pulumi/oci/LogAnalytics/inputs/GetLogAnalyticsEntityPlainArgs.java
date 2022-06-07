// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.LogAnalytics.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLogAnalyticsEntityPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLogAnalyticsEntityPlainArgs Empty = new GetLogAnalyticsEntityPlainArgs();

    /**
     * The log analytics entity OCID.
     * 
     */
    @Import(name="logAnalyticsEntityId", required=true)
    private String logAnalyticsEntityId;

    /**
     * @return The log analytics entity OCID.
     * 
     */
    public String logAnalyticsEntityId() {
        return this.logAnalyticsEntityId;
    }

    /**
     * The Logging Analytics namespace used for the request.
     * 
     */
    @Import(name="namespace", required=true)
    private String namespace;

    /**
     * @return The Logging Analytics namespace used for the request.
     * 
     */
    public String namespace() {
        return this.namespace;
    }

    private GetLogAnalyticsEntityPlainArgs() {}

    private GetLogAnalyticsEntityPlainArgs(GetLogAnalyticsEntityPlainArgs $) {
        this.logAnalyticsEntityId = $.logAnalyticsEntityId;
        this.namespace = $.namespace;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLogAnalyticsEntityPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLogAnalyticsEntityPlainArgs $;

        public Builder() {
            $ = new GetLogAnalyticsEntityPlainArgs();
        }

        public Builder(GetLogAnalyticsEntityPlainArgs defaults) {
            $ = new GetLogAnalyticsEntityPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param logAnalyticsEntityId The log analytics entity OCID.
         * 
         * @return builder
         * 
         */
        public Builder logAnalyticsEntityId(String logAnalyticsEntityId) {
            $.logAnalyticsEntityId = logAnalyticsEntityId;
            return this;
        }

        /**
         * @param namespace The Logging Analytics namespace used for the request.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            $.namespace = namespace;
            return this;
        }

        public GetLogAnalyticsEntityPlainArgs build() {
            $.logAnalyticsEntityId = Objects.requireNonNull($.logAnalyticsEntityId, "expected parameter 'logAnalyticsEntityId' to be non-null");
            $.namespace = Objects.requireNonNull($.namespace, "expected parameter 'namespace' to be non-null");
            return $;
        }
    }

}
