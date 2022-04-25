// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1.inputs.LoggingConfigResponse;
import com.pulumi.googlenative.dataproc_v1.inputs.QueryListResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * A Dataproc job for running Presto (https://prestosql.io/) queries. IMPORTANT: The Dataproc Presto Optional Component (https://cloud.google.com/dataproc/docs/concepts/components/presto) must be enabled when the cluster is created to submit a Presto job to the cluster.
 * 
 */
public final class PrestoJobResponse extends com.pulumi.resources.InvokeArgs {

    public static final PrestoJobResponse Empty = new PrestoJobResponse();

    /**
     * Optional. Presto client tags to attach to this query
     * 
     */
    @Import(name="clientTags", required=true)
    private List<String> clientTags;

    /**
     * @return Optional. Presto client tags to attach to this query
     * 
     */
    public List<String> clientTags() {
        return this.clientTags;
    }

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    @Import(name="continueOnFailure", required=true)
    private Boolean continueOnFailure;

    /**
     * @return Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    public Boolean continueOnFailure() {
        return this.continueOnFailure;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig", required=true)
    private LoggingConfigResponse loggingConfig;

    /**
     * @return Optional. The runtime log config for job execution.
     * 
     */
    public LoggingConfigResponse loggingConfig() {
        return this.loggingConfig;
    }

    /**
     * Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
     * 
     */
    @Import(name="outputFormat", required=true)
    private String outputFormat;

    /**
     * @return Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
     * 
     */
    public String outputFormat() {
        return this.outputFormat;
    }

    /**
     * Optional. A mapping of property names to values. Used to set Presto session properties (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to using the --session flag in the Presto CLI
     * 
     */
    @Import(name="properties", required=true)
    private Map<String,String> properties;

    /**
     * @return Optional. A mapping of property names to values. Used to set Presto session properties (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to using the --session flag in the Presto CLI
     * 
     */
    public Map<String,String> properties() {
        return this.properties;
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @Import(name="queryFileUri", required=true)
    private String queryFileUri;

    /**
     * @return The HCFS URI of the script that contains SQL queries.
     * 
     */
    public String queryFileUri() {
        return this.queryFileUri;
    }

    /**
     * A list of queries.
     * 
     */
    @Import(name="queryList", required=true)
    private QueryListResponse queryList;

    /**
     * @return A list of queries.
     * 
     */
    public QueryListResponse queryList() {
        return this.queryList;
    }

    private PrestoJobResponse() {}

    private PrestoJobResponse(PrestoJobResponse $) {
        this.clientTags = $.clientTags;
        this.continueOnFailure = $.continueOnFailure;
        this.loggingConfig = $.loggingConfig;
        this.outputFormat = $.outputFormat;
        this.properties = $.properties;
        this.queryFileUri = $.queryFileUri;
        this.queryList = $.queryList;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrestoJobResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrestoJobResponse $;

        public Builder() {
            $ = new PrestoJobResponse();
        }

        public Builder(PrestoJobResponse defaults) {
            $ = new PrestoJobResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientTags Optional. Presto client tags to attach to this query
         * 
         * @return builder
         * 
         */
        public Builder clientTags(List<String> clientTags) {
            $.clientTags = clientTags;
            return this;
        }

        /**
         * @param clientTags Optional. Presto client tags to attach to this query
         * 
         * @return builder
         * 
         */
        public Builder clientTags(String... clientTags) {
            return clientTags(List.of(clientTags));
        }

        /**
         * @param continueOnFailure Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
         * 
         * @return builder
         * 
         */
        public Builder continueOnFailure(Boolean continueOnFailure) {
            $.continueOnFailure = continueOnFailure;
            return this;
        }

        /**
         * @param loggingConfig Optional. The runtime log config for job execution.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(LoggingConfigResponse loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        /**
         * @param outputFormat Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
         * 
         * @return builder
         * 
         */
        public Builder outputFormat(String outputFormat) {
            $.outputFormat = outputFormat;
            return this;
        }

        /**
         * @param properties Optional. A mapping of property names to values. Used to set Presto session properties (https://prestodb.io/docs/current/sql/set-session.html) Equivalent to using the --session flag in the Presto CLI
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param queryFileUri The HCFS URI of the script that contains SQL queries.
         * 
         * @return builder
         * 
         */
        public Builder queryFileUri(String queryFileUri) {
            $.queryFileUri = queryFileUri;
            return this;
        }

        /**
         * @param queryList A list of queries.
         * 
         * @return builder
         * 
         */
        public Builder queryList(QueryListResponse queryList) {
            $.queryList = queryList;
            return this;
        }

        public PrestoJobResponse build() {
            $.clientTags = Objects.requireNonNull($.clientTags, "expected parameter 'clientTags' to be non-null");
            $.continueOnFailure = Objects.requireNonNull($.continueOnFailure, "expected parameter 'continueOnFailure' to be non-null");
            $.loggingConfig = Objects.requireNonNull($.loggingConfig, "expected parameter 'loggingConfig' to be non-null");
            $.outputFormat = Objects.requireNonNull($.outputFormat, "expected parameter 'outputFormat' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.queryFileUri = Objects.requireNonNull($.queryFileUri, "expected parameter 'queryFileUri' to be non-null");
            $.queryList = Objects.requireNonNull($.queryList, "expected parameter 'queryList' to be non-null");
            return $;
        }
    }

}
