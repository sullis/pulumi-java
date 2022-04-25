// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.azurenative.datamigration.inputs.ReportableExceptionResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;


/**
 * Task level output for the task that validates connection to SQL Server and also validates source server requirements
 * 
 */
public final class ConnectToSourceSqlServerTaskOutputTaskLevelResponse extends com.pulumi.resources.InvokeArgs {

    public static final ConnectToSourceSqlServerTaskOutputTaskLevelResponse Empty = new ConnectToSourceSqlServerTaskOutputTaskLevelResponse();

    /**
     * Source agent jobs as a map from agent job name to id.
     * 
     */
    @Import(name="agentJobs", required=true)
    private Map<String,String> agentJobs;

    /**
     * @return Source agent jobs as a map from agent job name to id.
     * 
     */
    public Map<String,String> agentJobs() {
        return this.agentJobs;
    }

    /**
     * Source databases as a map from database name to database id
     * 
     */
    @Import(name="databases", required=true)
    private Map<String,String> databases;

    /**
     * @return Source databases as a map from database name to database id
     * 
     */
    public Map<String,String> databases() {
        return this.databases;
    }

    /**
     * Result identifier
     * 
     */
    @Import(name="id", required=true)
    private String id;

    /**
     * @return Result identifier
     * 
     */
    public String id() {
        return this.id;
    }

    /**
     * Source logins as a map from login name to login id.
     * 
     */
    @Import(name="logins", required=true)
    private Map<String,String> logins;

    /**
     * @return Source logins as a map from login name to login id.
     * 
     */
    public Map<String,String> logins() {
        return this.logins;
    }

    /**
     * Type of result - database level or task level
     * Expected value is &#39;TaskLevelOutput&#39;.
     * 
     */
    @Import(name="resultType", required=true)
    private String resultType;

    /**
     * @return Type of result - database level or task level
     * Expected value is &#39;TaskLevelOutput&#39;.
     * 
     */
    public String resultType() {
        return this.resultType;
    }

    /**
     * Source server brand version
     * 
     */
    @Import(name="sourceServerBrandVersion", required=true)
    private String sourceServerBrandVersion;

    /**
     * @return Source server brand version
     * 
     */
    public String sourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    /**
     * Source server version
     * 
     */
    @Import(name="sourceServerVersion", required=true)
    private String sourceServerVersion;

    /**
     * @return Source server version
     * 
     */
    public String sourceServerVersion() {
        return this.sourceServerVersion;
    }

    /**
     * Validation errors
     * 
     */
    @Import(name="validationErrors", required=true)
    private List<ReportableExceptionResponse> validationErrors;

    /**
     * @return Validation errors
     * 
     */
    public List<ReportableExceptionResponse> validationErrors() {
        return this.validationErrors;
    }

    private ConnectToSourceSqlServerTaskOutputTaskLevelResponse() {}

    private ConnectToSourceSqlServerTaskOutputTaskLevelResponse(ConnectToSourceSqlServerTaskOutputTaskLevelResponse $) {
        this.agentJobs = $.agentJobs;
        this.databases = $.databases;
        this.id = $.id;
        this.logins = $.logins;
        this.resultType = $.resultType;
        this.sourceServerBrandVersion = $.sourceServerBrandVersion;
        this.sourceServerVersion = $.sourceServerVersion;
        this.validationErrors = $.validationErrors;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConnectToSourceSqlServerTaskOutputTaskLevelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConnectToSourceSqlServerTaskOutputTaskLevelResponse $;

        public Builder() {
            $ = new ConnectToSourceSqlServerTaskOutputTaskLevelResponse();
        }

        public Builder(ConnectToSourceSqlServerTaskOutputTaskLevelResponse defaults) {
            $ = new ConnectToSourceSqlServerTaskOutputTaskLevelResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param agentJobs Source agent jobs as a map from agent job name to id.
         * 
         * @return builder
         * 
         */
        public Builder agentJobs(Map<String,String> agentJobs) {
            $.agentJobs = agentJobs;
            return this;
        }

        /**
         * @param databases Source databases as a map from database name to database id
         * 
         * @return builder
         * 
         */
        public Builder databases(Map<String,String> databases) {
            $.databases = databases;
            return this;
        }

        /**
         * @param id Result identifier
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            $.id = id;
            return this;
        }

        /**
         * @param logins Source logins as a map from login name to login id.
         * 
         * @return builder
         * 
         */
        public Builder logins(Map<String,String> logins) {
            $.logins = logins;
            return this;
        }

        /**
         * @param resultType Type of result - database level or task level
         * Expected value is &#39;TaskLevelOutput&#39;.
         * 
         * @return builder
         * 
         */
        public Builder resultType(String resultType) {
            $.resultType = resultType;
            return this;
        }

        /**
         * @param sourceServerBrandVersion Source server brand version
         * 
         * @return builder
         * 
         */
        public Builder sourceServerBrandVersion(String sourceServerBrandVersion) {
            $.sourceServerBrandVersion = sourceServerBrandVersion;
            return this;
        }

        /**
         * @param sourceServerVersion Source server version
         * 
         * @return builder
         * 
         */
        public Builder sourceServerVersion(String sourceServerVersion) {
            $.sourceServerVersion = sourceServerVersion;
            return this;
        }

        /**
         * @param validationErrors Validation errors
         * 
         * @return builder
         * 
         */
        public Builder validationErrors(List<ReportableExceptionResponse> validationErrors) {
            $.validationErrors = validationErrors;
            return this;
        }

        /**
         * @param validationErrors Validation errors
         * 
         * @return builder
         * 
         */
        public Builder validationErrors(ReportableExceptionResponse... validationErrors) {
            return validationErrors(List.of(validationErrors));
        }

        public ConnectToSourceSqlServerTaskOutputTaskLevelResponse build() {
            $.agentJobs = Objects.requireNonNull($.agentJobs, "expected parameter 'agentJobs' to be non-null");
            $.databases = Objects.requireNonNull($.databases, "expected parameter 'databases' to be non-null");
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.logins = Objects.requireNonNull($.logins, "expected parameter 'logins' to be non-null");
            $.resultType = Codegen.stringProp("resultType").arg($.resultType).require();
            $.sourceServerBrandVersion = Objects.requireNonNull($.sourceServerBrandVersion, "expected parameter 'sourceServerBrandVersion' to be non-null");
            $.sourceServerVersion = Objects.requireNonNull($.sourceServerVersion, "expected parameter 'sourceServerVersion' to be non-null");
            $.validationErrors = Objects.requireNonNull($.validationErrors, "expected parameter 'validationErrors' to be non-null");
            return $;
        }
    }

}
