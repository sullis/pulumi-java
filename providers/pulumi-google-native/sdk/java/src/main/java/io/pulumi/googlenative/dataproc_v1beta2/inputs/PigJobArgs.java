// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.LoggingConfigArgs;
import io.pulumi.googlenative.dataproc_v1beta2.inputs.QueryListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Apache Pig (https://pig.apache.org/) queries on YARN.
 * 
 */
public final class PigJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final PigJobArgs Empty = new PigJobArgs();

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    @InputImport(name="continueOnFailure")
      private final @Nullable Input<Boolean> continueOnFailure;

    public Input<Boolean> getContinueOnFailure() {
        return this.continueOnFailure == null ? Input.empty() : this.continueOnFailure;
    }

    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
     * 
     */
    @InputImport(name="jarFileUris")
      private final @Nullable Input<List<String>> jarFileUris;

    public Input<List<String>> getJarFileUris() {
        return this.jarFileUris == null ? Input.empty() : this.jarFileUris;
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @InputImport(name="loggingConfig")
      private final @Nullable Input<LoggingConfigArgs> loggingConfig;

    public Input<LoggingConfigArgs> getLoggingConfig() {
        return this.loggingConfig == null ? Input.empty() : this.loggingConfig;
    }

    /**
     * Optional. A mapping of property names to values, used to configure Pig. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
     * 
     */
    @InputImport(name="properties")
      private final @Nullable Input<Map<String,String>> properties;

    public Input<Map<String,String>> getProperties() {
        return this.properties == null ? Input.empty() : this.properties;
    }

    /**
     * The HCFS URI of the script that contains the Pig queries.
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
      private final @Nullable Input<QueryListArgs> queryList;

    public Input<QueryListArgs> getQueryList() {
        return this.queryList == null ? Input.empty() : this.queryList;
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Pig command: name=[value]).
     * 
     */
    @InputImport(name="scriptVariables")
      private final @Nullable Input<Map<String,String>> scriptVariables;

    public Input<Map<String,String>> getScriptVariables() {
        return this.scriptVariables == null ? Input.empty() : this.scriptVariables;
    }

    public PigJobArgs(
        @Nullable Input<Boolean> continueOnFailure,
        @Nullable Input<List<String>> jarFileUris,
        @Nullable Input<LoggingConfigArgs> loggingConfig,
        @Nullable Input<Map<String,String>> properties,
        @Nullable Input<String> queryFileUri,
        @Nullable Input<QueryListArgs> queryList,
        @Nullable Input<Map<String,String>> scriptVariables) {
        this.continueOnFailure = continueOnFailure;
        this.jarFileUris = jarFileUris;
        this.loggingConfig = loggingConfig;
        this.properties = properties;
        this.queryFileUri = queryFileUri;
        this.queryList = queryList;
        this.scriptVariables = scriptVariables;
    }

    private PigJobArgs() {
        this.continueOnFailure = Input.empty();
        this.jarFileUris = Input.empty();
        this.loggingConfig = Input.empty();
        this.properties = Input.empty();
        this.queryFileUri = Input.empty();
        this.queryList = Input.empty();
        this.scriptVariables = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PigJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> continueOnFailure;
        private @Nullable Input<List<String>> jarFileUris;
        private @Nullable Input<LoggingConfigArgs> loggingConfig;
        private @Nullable Input<Map<String,String>> properties;
        private @Nullable Input<String> queryFileUri;
        private @Nullable Input<QueryListArgs> queryList;
        private @Nullable Input<Map<String,String>> scriptVariables;

        public Builder() {
    	      // Empty
        }

        public Builder(PigJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.continueOnFailure = defaults.continueOnFailure;
    	      this.jarFileUris = defaults.jarFileUris;
    	      this.loggingConfig = defaults.loggingConfig;
    	      this.properties = defaults.properties;
    	      this.queryFileUri = defaults.queryFileUri;
    	      this.queryList = defaults.queryList;
    	      this.scriptVariables = defaults.scriptVariables;
        }

        public Builder setContinueOnFailure(@Nullable Input<Boolean> continueOnFailure) {
            this.continueOnFailure = continueOnFailure;
            return this;
        }

        public Builder setContinueOnFailure(@Nullable Boolean continueOnFailure) {
            this.continueOnFailure = Input.ofNullable(continueOnFailure);
            return this;
        }

        public Builder setJarFileUris(@Nullable Input<List<String>> jarFileUris) {
            this.jarFileUris = jarFileUris;
            return this;
        }

        public Builder setJarFileUris(@Nullable List<String> jarFileUris) {
            this.jarFileUris = Input.ofNullable(jarFileUris);
            return this;
        }

        public Builder setLoggingConfig(@Nullable Input<LoggingConfigArgs> loggingConfig) {
            this.loggingConfig = loggingConfig;
            return this;
        }

        public Builder setLoggingConfig(@Nullable LoggingConfigArgs loggingConfig) {
            this.loggingConfig = Input.ofNullable(loggingConfig);
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

        public Builder setQueryList(@Nullable Input<QueryListArgs> queryList) {
            this.queryList = queryList;
            return this;
        }

        public Builder setQueryList(@Nullable QueryListArgs queryList) {
            this.queryList = Input.ofNullable(queryList);
            return this;
        }

        public Builder setScriptVariables(@Nullable Input<Map<String,String>> scriptVariables) {
            this.scriptVariables = scriptVariables;
            return this;
        }

        public Builder setScriptVariables(@Nullable Map<String,String> scriptVariables) {
            this.scriptVariables = Input.ofNullable(scriptVariables);
            return this;
        }
        public PigJobArgs build() {
            return new PigJobArgs(continueOnFailure, jarFileUris, loggingConfig, properties, queryFileUri, queryList, scriptVariables);
        }
    }
}