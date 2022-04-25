// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.LoggingConfigArgs;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.QueryListArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Dataproc job for running Apache Pig (https://pig.apache.org/) queries on YARN.
 * 
 */
public final class PigJobArgs extends com.pulumi.resources.ResourceArgs {

    public static final PigJobArgs Empty = new PigJobArgs();

    /**
     * Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    @Import(name="continueOnFailure")
    private @Nullable Output<Boolean> continueOnFailure;

    /**
     * @return Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
     * 
     */
    public Optional<Output<Boolean>> continueOnFailure() {
        return Optional.ofNullable(this.continueOnFailure);
    }

    /**
     * Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
     * 
     */
    @Import(name="jarFileUris")
    private @Nullable Output<List<String>> jarFileUris;

    /**
     * @return Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
     * 
     */
    public Optional<Output<List<String>>> jarFileUris() {
        return Optional.ofNullable(this.jarFileUris);
    }

    /**
     * Optional. The runtime log config for job execution.
     * 
     */
    @Import(name="loggingConfig")
    private @Nullable Output<LoggingConfigArgs> loggingConfig;

    /**
     * @return Optional. The runtime log config for job execution.
     * 
     */
    public Optional<Output<LoggingConfigArgs>> loggingConfig() {
        return Optional.ofNullable(this.loggingConfig);
    }

    /**
     * Optional. A mapping of property names to values, used to configure Pig. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
     * 
     */
    @Import(name="properties")
    private @Nullable Output<Map<String,String>> properties;

    /**
     * @return Optional. A mapping of property names to values, used to configure Pig. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
     * 
     */
    public Optional<Output<Map<String,String>>> properties() {
        return Optional.ofNullable(this.properties);
    }

    /**
     * The HCFS URI of the script that contains the Pig queries.
     * 
     */
    @Import(name="queryFileUri")
    private @Nullable Output<String> queryFileUri;

    /**
     * @return The HCFS URI of the script that contains the Pig queries.
     * 
     */
    public Optional<Output<String>> queryFileUri() {
        return Optional.ofNullable(this.queryFileUri);
    }

    /**
     * A list of queries.
     * 
     */
    @Import(name="queryList")
    private @Nullable Output<QueryListArgs> queryList;

    /**
     * @return A list of queries.
     * 
     */
    public Optional<Output<QueryListArgs>> queryList() {
        return Optional.ofNullable(this.queryList);
    }

    /**
     * Optional. Mapping of query variable names to values (equivalent to the Pig command: name=[value]).
     * 
     */
    @Import(name="scriptVariables")
    private @Nullable Output<Map<String,String>> scriptVariables;

    /**
     * @return Optional. Mapping of query variable names to values (equivalent to the Pig command: name=[value]).
     * 
     */
    public Optional<Output<Map<String,String>>> scriptVariables() {
        return Optional.ofNullable(this.scriptVariables);
    }

    private PigJobArgs() {}

    private PigJobArgs(PigJobArgs $) {
        this.continueOnFailure = $.continueOnFailure;
        this.jarFileUris = $.jarFileUris;
        this.loggingConfig = $.loggingConfig;
        this.properties = $.properties;
        this.queryFileUri = $.queryFileUri;
        this.queryList = $.queryList;
        this.scriptVariables = $.scriptVariables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PigJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PigJobArgs $;

        public Builder() {
            $ = new PigJobArgs();
        }

        public Builder(PigJobArgs defaults) {
            $ = new PigJobArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param continueOnFailure Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
         * 
         * @return builder
         * 
         */
        public Builder continueOnFailure(@Nullable Output<Boolean> continueOnFailure) {
            $.continueOnFailure = continueOnFailure;
            return this;
        }

        /**
         * @param continueOnFailure Optional. Whether to continue executing queries if a query fails. The default value is false. Setting to true can be useful when executing independent parallel queries.
         * 
         * @return builder
         * 
         */
        public Builder continueOnFailure(Boolean continueOnFailure) {
            return continueOnFailure(Output.of(continueOnFailure));
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(@Nullable Output<List<String>> jarFileUris) {
            $.jarFileUris = jarFileUris;
            return this;
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(List<String> jarFileUris) {
            return jarFileUris(Output.of(jarFileUris));
        }

        /**
         * @param jarFileUris Optional. HCFS URIs of jar files to add to the CLASSPATH of the Pig Client and Hadoop MapReduce (MR) tasks. Can contain Pig UDFs.
         * 
         * @return builder
         * 
         */
        public Builder jarFileUris(String... jarFileUris) {
            return jarFileUris(List.of(jarFileUris));
        }

        /**
         * @param loggingConfig Optional. The runtime log config for job execution.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(@Nullable Output<LoggingConfigArgs> loggingConfig) {
            $.loggingConfig = loggingConfig;
            return this;
        }

        /**
         * @param loggingConfig Optional. The runtime log config for job execution.
         * 
         * @return builder
         * 
         */
        public Builder loggingConfig(LoggingConfigArgs loggingConfig) {
            return loggingConfig(Output.of(loggingConfig));
        }

        /**
         * @param properties Optional. A mapping of property names to values, used to configure Pig. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
         * 
         * @return builder
         * 
         */
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties Optional. A mapping of property names to values, used to configure Pig. Properties that conflict with values set by the Dataproc API may be overwritten. Can include properties set in /etc/hadoop/conf/*-site.xml, /etc/pig/conf/pig.properties, and classes in user code.
         * 
         * @return builder
         * 
         */
        public Builder properties(Map<String,String> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param queryFileUri The HCFS URI of the script that contains the Pig queries.
         * 
         * @return builder
         * 
         */
        public Builder queryFileUri(@Nullable Output<String> queryFileUri) {
            $.queryFileUri = queryFileUri;
            return this;
        }

        /**
         * @param queryFileUri The HCFS URI of the script that contains the Pig queries.
         * 
         * @return builder
         * 
         */
        public Builder queryFileUri(String queryFileUri) {
            return queryFileUri(Output.of(queryFileUri));
        }

        /**
         * @param queryList A list of queries.
         * 
         * @return builder
         * 
         */
        public Builder queryList(@Nullable Output<QueryListArgs> queryList) {
            $.queryList = queryList;
            return this;
        }

        /**
         * @param queryList A list of queries.
         * 
         * @return builder
         * 
         */
        public Builder queryList(QueryListArgs queryList) {
            return queryList(Output.of(queryList));
        }

        /**
         * @param scriptVariables Optional. Mapping of query variable names to values (equivalent to the Pig command: name=[value]).
         * 
         * @return builder
         * 
         */
        public Builder scriptVariables(@Nullable Output<Map<String,String>> scriptVariables) {
            $.scriptVariables = scriptVariables;
            return this;
        }

        /**
         * @param scriptVariables Optional. Mapping of query variable names to values (equivalent to the Pig command: name=[value]).
         * 
         * @return builder
         * 
         */
        public Builder scriptVariables(Map<String,String> scriptVariables) {
            return scriptVariables(Output.of(scriptVariables));
        }

        public PigJobArgs build() {
            return $;
        }
    }

}
