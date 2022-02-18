// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobLoggingConfigGetArgs;
import io.pulumi.gcp.dataproc.inputs.WorkflowTemplateJobPrestoJobQueryListGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WorkflowTemplateJobPrestoJobGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowTemplateJobPrestoJobGetArgs Empty = new WorkflowTemplateJobPrestoJobGetArgs();

    /**
     * Optional. Presto client tags to attach to this query
     * 
     */
    @InputImport(name="clientTags")
    private final @Nullable Input<List<String>> clientTags;

    public Input<List<String>> getClientTags() {
        return this.clientTags == null ? Input.empty() : this.clientTags;
    }

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is `false`. Setting to `true` can be useful when executing independent parallel queries.
     * 
     */
    @InputImport(name="continueOnFailure")
    private final @Nullable Input<Boolean> continueOnFailure;

    public Input<Boolean> getContinueOnFailure() {
        return this.continueOnFailure == null ? Input.empty() : this.continueOnFailure;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @InputImport(name="loggingConfig")
    private final @Nullable Input<WorkflowTemplateJobPrestoJobLoggingConfigGetArgs> loggingConfig;

    public Input<WorkflowTemplateJobPrestoJobLoggingConfigGetArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Input.empty() : this.loggingConfig;
    }

    /**
     * Optional. The format in which query output will be displayed. See the Presto documentation for supported output formats
     * 
     */
    @InputImport(name="outputFormat")
    private final @Nullable Input<String> outputFormat;

    public Input<String> getOutputFormat() {
        return this.outputFormat == null ? Input.empty() : this.outputFormat;
    }

    /**
     * Optional. The properties to set on daemon config files. Property keys are specified in `prefix:property` format, for example `core:hadoop.tmp.dir`. The following are supported prefixes and their mappings: * capacity-scheduler: `capacity-scheduler.xml` * core: `core-site.xml` * distcp: `distcp-default.xml` * hdfs: `hdfs-site.xml` * hive: `hive-site.xml` * mapred: `mapred-site.xml` * pig: `pig.properties` * spark: `spark-defaults.conf` * yarn: `yarn-site.xml` For more information, see (https://cloud.google.com/dataproc/docs/concepts/cluster-properties).
     * 
     */
    @InputImport(name="properties")
    private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The HCFS URI of the script that contains SQL queries.
     * 
     */
    @InputImport(name="queryFileUri")
    private final @Nullable Input<String> queryFileUri;

    public Input<String> getQueryFileUri() {
        return this.queryFileUri == null ? Input.empty() : this.queryFileUri;
    }

    /**
     * A list of queries.
     * 
     */
    @InputImport(name="queryList")
    private final @Nullable Input<WorkflowTemplateJobPrestoJobQueryListGetArgs> queryList;

    public Input<WorkflowTemplateJobPrestoJobQueryListGetArgs> getQueryList() {
        return this.queryList == null ? Input.empty() : this.queryList;
    }

    public WorkflowTemplateJobPrestoJobGetArgs(
        @Nullable Input<List<String>> clientTags,
        @Nullable Input<Boolean> continueOnFailure,
        @Nullable Input<WorkflowTemplateJobPrestoJobLoggingConfigGetArgs> loggingConfig,
        @Nullable Input<String> outputFormat,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<String> queryFileUri,
        @Nullable Input<WorkflowTemplateJobPrestoJobQueryListGetArgs> queryList) {
        this.clientTags = clientTags;
        this.continueOnFailure = continueOnFailure;
        this.loggingConfig = loggingConfig;
        this.outputFormat = outputFormat;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryList = queryList;
    }

    private WorkflowTemplateJobPrestoJobGetArgs() {
        this.clientTags = Input.empty();
        this.continueOnFailure = Input.empty();
        this.loggingConfig = Input.empty();
        this.outputFormat = Input.empty();
        this.properties = Input.empty();
        this.queryFileUri = Input.empty();
        this.queryList = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowTemplateJobPrestoJobGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> clientTags;
        private @Nullable Input<Boolean> continueOnFailure;
        private @Nullable Input<WorkflowTemplateJobPrestoJobLoggingConfigGetArgs> loggingConfig;
        private @Nullable Input<String> outputFormat;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<String> queryFileUri;
        private @Nullable Input<WorkflowTemplateJobPrestoJobQueryListGetArgs> queryList;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowTemplateJobPrestoJobGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTags = defaults.clientTags;
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.outputFormat = defaults.outputFormat;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
        }

        public Builder setClientTags(@Nullable Input<List<String>> clientTags) {
            this.clientTags = clientTags;
            return this;
        }

        public Builder setClientTags(@Nullable List<String> clientTags) {
            this.clientTags = Input.ofNullable(clientTags);
            return this;
        }

        public Builder setContinueOnFailure(@Nullable Input<Boolean> continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }

        public Builder setContinueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = Input.ofNullable(continueOnFailure);
            return this;
        }

        public Builder setLoggingConfig(@Nullable Input<WorkflowTemplateJobPrestoJobLoggingConfigGetArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setLoggingConfig(@Nullable WorkflowTemplateJobPrestoJobLoggingConfigGetArgs loggingConfig) {
            this.loggingConfig = Input.ofNullable(loggingConfig);
            return this;
        }

        public Builder setOutputFormat(@Nullable Input<String> outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }

        public Builder setOutputFormat(@Nullable String outputFormat) {
            this.outputFormat = Input.ofNullable(outputFormat);
            return this;
        }

        public Builder setProperties(@Nullable Input<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }

        public Builder setProperties(@Nullable Map<String,String> properties) {
            this.properties = Input.ofNullable(properties);
            return this;
        }

        public Builder setQueryFileUri(@Nullable Input<String> queryFileUri) {
            this.queryFileUri = queryFileUri;
            return this;
        }

        public Builder setQueryFileUri(@Nullable String queryFileUri) {
            this.queryFileUri = Input.ofNullable(queryFileUri);
            return this;
        }

        public Builder setQueryList(@Nullable Input<WorkflowTemplateJobPrestoJobQueryListGetArgs> queryList) {
            this.queryList = queryList;
            return this;
        }

        public Builder setQueryList(@Nullable WorkflowTemplateJobPrestoJobQueryListGetArgs queryList) {
            this.queryList = Input.ofNullable(queryList);
            return this;
        }

        public WorkflowTemplateJobPrestoJobGetArgs build() {
            return new WorkflowTemplateJobPrestoJobGetArgs(clientTags, continueOnFailure, loggingConfig, outputFormat, properties, queryFileUri, queryList);
        }
    }
}
