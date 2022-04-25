// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.aws.opsworks.inputs.ApplicationAppSourceGetArgs;
import com.pulumi.aws.opsworks.inputs.ApplicationEnvironmentGetArgs;
import com.pulumi.aws.opsworks.inputs.ApplicationSslConfigurationGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationState extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationState Empty = new ApplicationState();

    /**
     * SCM configuration of the app as described below.
     * 
     */
    @Import(name="appSources")
    private @Nullable Output<List<ApplicationAppSourceGetArgs>> appSources;

    /**
     * @return SCM configuration of the app as described below.
     * 
     */
    public Optional<Output<List<ApplicationAppSourceGetArgs>>> appSources() {
        return Optional.ofNullable(this.appSources);
    }

    /**
     * Run bundle install when deploying for application of type `rails`.
     * 
     */
    @Import(name="autoBundleOnDeploy")
    private @Nullable Output<String> autoBundleOnDeploy;

    /**
     * @return Run bundle install when deploying for application of type `rails`.
     * 
     */
    public Optional<Output<String>> autoBundleOnDeploy() {
        return Optional.ofNullable(this.autoBundleOnDeploy);
    }

    /**
     * Specify activity and workflow workers for your app using the aws-flow gem.
     * 
     */
    @Import(name="awsFlowRubySettings")
    private @Nullable Output<String> awsFlowRubySettings;

    /**
     * @return Specify activity and workflow workers for your app using the aws-flow gem.
     * 
     */
    public Optional<Output<String>> awsFlowRubySettings() {
        return Optional.ofNullable(this.awsFlowRubySettings);
    }

    /**
     * The data source&#39;s ARN.
     * 
     */
    @Import(name="dataSourceArn")
    private @Nullable Output<String> dataSourceArn;

    /**
     * @return The data source&#39;s ARN.
     * 
     */
    public Optional<Output<String>> dataSourceArn() {
        return Optional.ofNullable(this.dataSourceArn);
    }

    /**
     * The database name.
     * 
     */
    @Import(name="dataSourceDatabaseName")
    private @Nullable Output<String> dataSourceDatabaseName;

    /**
     * @return The database name.
     * 
     */
    public Optional<Output<String>> dataSourceDatabaseName() {
        return Optional.ofNullable(this.dataSourceDatabaseName);
    }

    /**
     * The data source&#39;s type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
     * 
     */
    @Import(name="dataSourceType")
    private @Nullable Output<String> dataSourceType;

    /**
     * @return The data source&#39;s type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
     * 
     */
    public Optional<Output<String>> dataSourceType() {
        return Optional.ofNullable(this.dataSourceType);
    }

    /**
     * A description of the app.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return A description of the app.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Subfolder for the document root for application of type `rails`.
     * 
     */
    @Import(name="documentRoot")
    private @Nullable Output<String> documentRoot;

    /**
     * @return Subfolder for the document root for application of type `rails`.
     * 
     */
    public Optional<Output<String>> documentRoot() {
        return Optional.ofNullable(this.documentRoot);
    }

    /**
     * A list of virtual host alias.
     * 
     */
    @Import(name="domains")
    private @Nullable Output<List<String>> domains;

    /**
     * @return A list of virtual host alias.
     * 
     */
    public Optional<Output<List<String>>> domains() {
        return Optional.ofNullable(this.domains);
    }

    /**
     * Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
     * 
     */
    @Import(name="enableSsl")
    private @Nullable Output<Boolean> enableSsl;

    /**
     * @return Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
     * 
     */
    public Optional<Output<Boolean>> enableSsl() {
        return Optional.ofNullable(this.enableSsl);
    }

    /**
     * Object to define environment variables.  Object is described below.
     * 
     */
    @Import(name="environments")
    private @Nullable Output<List<ApplicationEnvironmentGetArgs>> environments;

    /**
     * @return Object to define environment variables.  Object is described below.
     * 
     */
    public Optional<Output<List<ApplicationEnvironmentGetArgs>>> environments() {
        return Optional.ofNullable(this.environments);
    }

    /**
     * A human-readable name for the application.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A human-readable name for the application.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Rails environment for application of type `rails`.
     * 
     */
    @Import(name="railsEnv")
    private @Nullable Output<String> railsEnv;

    /**
     * @return The name of the Rails environment for application of type `rails`.
     * 
     */
    public Optional<Output<String>> railsEnv() {
        return Optional.ofNullable(this.railsEnv);
    }

    /**
     * A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
     * 
     */
    @Import(name="shortName")
    private @Nullable Output<String> shortName;

    /**
     * @return A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
     * 
     */
    public Optional<Output<String>> shortName() {
        return Optional.ofNullable(this.shortName);
    }

    /**
     * The SSL configuration of the app. Object is described below.
     * 
     */
    @Import(name="sslConfigurations")
    private @Nullable Output<List<ApplicationSslConfigurationGetArgs>> sslConfigurations;

    /**
     * @return The SSL configuration of the app. Object is described below.
     * 
     */
    public Optional<Output<List<ApplicationSslConfigurationGetArgs>>> sslConfigurations() {
        return Optional.ofNullable(this.sslConfigurations);
    }

    /**
     * The id of the stack the application will belong to.
     * 
     */
    @Import(name="stackId")
    private @Nullable Output<String> stackId;

    /**
     * @return The id of the stack the application will belong to.
     * 
     */
    public Optional<Output<String>> stackId() {
        return Optional.ofNullable(this.stackId);
    }

    /**
     * Opsworks application type. One of `aws-flow-ruby`, `java`, `rails`, `php`, `nodejs`, `static` or `other`.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Opsworks application type. One of `aws-flow-ruby`, `java`, `rails`, `php`, `nodejs`, `static` or `other`.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private ApplicationState() {}

    private ApplicationState(ApplicationState $) {
        this.appSources = $.appSources;
        this.autoBundleOnDeploy = $.autoBundleOnDeploy;
        this.awsFlowRubySettings = $.awsFlowRubySettings;
        this.dataSourceArn = $.dataSourceArn;
        this.dataSourceDatabaseName = $.dataSourceDatabaseName;
        this.dataSourceType = $.dataSourceType;
        this.description = $.description;
        this.documentRoot = $.documentRoot;
        this.domains = $.domains;
        this.enableSsl = $.enableSsl;
        this.environments = $.environments;
        this.name = $.name;
        this.railsEnv = $.railsEnv;
        this.shortName = $.shortName;
        this.sslConfigurations = $.sslConfigurations;
        this.stackId = $.stackId;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationState $;

        public Builder() {
            $ = new ApplicationState();
        }

        public Builder(ApplicationState defaults) {
            $ = new ApplicationState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appSources SCM configuration of the app as described below.
         * 
         * @return builder
         * 
         */
        public Builder appSources(@Nullable Output<List<ApplicationAppSourceGetArgs>> appSources) {
            $.appSources = appSources;
            return this;
        }

        /**
         * @param appSources SCM configuration of the app as described below.
         * 
         * @return builder
         * 
         */
        public Builder appSources(List<ApplicationAppSourceGetArgs> appSources) {
            return appSources(Output.of(appSources));
        }

        /**
         * @param appSources SCM configuration of the app as described below.
         * 
         * @return builder
         * 
         */
        public Builder appSources(ApplicationAppSourceGetArgs... appSources) {
            return appSources(List.of(appSources));
        }

        /**
         * @param autoBundleOnDeploy Run bundle install when deploying for application of type `rails`.
         * 
         * @return builder
         * 
         */
        public Builder autoBundleOnDeploy(@Nullable Output<String> autoBundleOnDeploy) {
            $.autoBundleOnDeploy = autoBundleOnDeploy;
            return this;
        }

        /**
         * @param autoBundleOnDeploy Run bundle install when deploying for application of type `rails`.
         * 
         * @return builder
         * 
         */
        public Builder autoBundleOnDeploy(String autoBundleOnDeploy) {
            return autoBundleOnDeploy(Output.of(autoBundleOnDeploy));
        }

        /**
         * @param awsFlowRubySettings Specify activity and workflow workers for your app using the aws-flow gem.
         * 
         * @return builder
         * 
         */
        public Builder awsFlowRubySettings(@Nullable Output<String> awsFlowRubySettings) {
            $.awsFlowRubySettings = awsFlowRubySettings;
            return this;
        }

        /**
         * @param awsFlowRubySettings Specify activity and workflow workers for your app using the aws-flow gem.
         * 
         * @return builder
         * 
         */
        public Builder awsFlowRubySettings(String awsFlowRubySettings) {
            return awsFlowRubySettings(Output.of(awsFlowRubySettings));
        }

        /**
         * @param dataSourceArn The data source&#39;s ARN.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceArn(@Nullable Output<String> dataSourceArn) {
            $.dataSourceArn = dataSourceArn;
            return this;
        }

        /**
         * @param dataSourceArn The data source&#39;s ARN.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceArn(String dataSourceArn) {
            return dataSourceArn(Output.of(dataSourceArn));
        }

        /**
         * @param dataSourceDatabaseName The database name.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceDatabaseName(@Nullable Output<String> dataSourceDatabaseName) {
            $.dataSourceDatabaseName = dataSourceDatabaseName;
            return this;
        }

        /**
         * @param dataSourceDatabaseName The database name.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceDatabaseName(String dataSourceDatabaseName) {
            return dataSourceDatabaseName(Output.of(dataSourceDatabaseName));
        }

        /**
         * @param dataSourceType The data source&#39;s type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceType(@Nullable Output<String> dataSourceType) {
            $.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * @param dataSourceType The data source&#39;s type one of `AutoSelectOpsworksMysqlInstance`, `OpsworksMysqlInstance`, or `RdsDbInstance`.
         * 
         * @return builder
         * 
         */
        public Builder dataSourceType(String dataSourceType) {
            return dataSourceType(Output.of(dataSourceType));
        }

        /**
         * @param description A description of the app.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description A description of the app.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param documentRoot Subfolder for the document root for application of type `rails`.
         * 
         * @return builder
         * 
         */
        public Builder documentRoot(@Nullable Output<String> documentRoot) {
            $.documentRoot = documentRoot;
            return this;
        }

        /**
         * @param documentRoot Subfolder for the document root for application of type `rails`.
         * 
         * @return builder
         * 
         */
        public Builder documentRoot(String documentRoot) {
            return documentRoot(Output.of(documentRoot));
        }

        /**
         * @param domains A list of virtual host alias.
         * 
         * @return builder
         * 
         */
        public Builder domains(@Nullable Output<List<String>> domains) {
            $.domains = domains;
            return this;
        }

        /**
         * @param domains A list of virtual host alias.
         * 
         * @return builder
         * 
         */
        public Builder domains(List<String> domains) {
            return domains(Output.of(domains));
        }

        /**
         * @param domains A list of virtual host alias.
         * 
         * @return builder
         * 
         */
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }

        /**
         * @param enableSsl Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
         * 
         * @return builder
         * 
         */
        public Builder enableSsl(@Nullable Output<Boolean> enableSsl) {
            $.enableSsl = enableSsl;
            return this;
        }

        /**
         * @param enableSsl Whether to enable SSL for the app. This must be set in order to let `ssl_configuration.private_key`, `ssl_configuration.certificate` and `ssl_configuration.chain` take effect.
         * 
         * @return builder
         * 
         */
        public Builder enableSsl(Boolean enableSsl) {
            return enableSsl(Output.of(enableSsl));
        }

        /**
         * @param environments Object to define environment variables.  Object is described below.
         * 
         * @return builder
         * 
         */
        public Builder environments(@Nullable Output<List<ApplicationEnvironmentGetArgs>> environments) {
            $.environments = environments;
            return this;
        }

        /**
         * @param environments Object to define environment variables.  Object is described below.
         * 
         * @return builder
         * 
         */
        public Builder environments(List<ApplicationEnvironmentGetArgs> environments) {
            return environments(Output.of(environments));
        }

        /**
         * @param environments Object to define environment variables.  Object is described below.
         * 
         * @return builder
         * 
         */
        public Builder environments(ApplicationEnvironmentGetArgs... environments) {
            return environments(List.of(environments));
        }

        /**
         * @param name A human-readable name for the application.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A human-readable name for the application.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param railsEnv The name of the Rails environment for application of type `rails`.
         * 
         * @return builder
         * 
         */
        public Builder railsEnv(@Nullable Output<String> railsEnv) {
            $.railsEnv = railsEnv;
            return this;
        }

        /**
         * @param railsEnv The name of the Rails environment for application of type `rails`.
         * 
         * @return builder
         * 
         */
        public Builder railsEnv(String railsEnv) {
            return railsEnv(Output.of(railsEnv));
        }

        /**
         * @param shortName A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
         * 
         * @return builder
         * 
         */
        public Builder shortName(@Nullable Output<String> shortName) {
            $.shortName = shortName;
            return this;
        }

        /**
         * @param shortName A short, machine-readable name for the application. This can only be defined on resource creation and ignored on resource update.
         * 
         * @return builder
         * 
         */
        public Builder shortName(String shortName) {
            return shortName(Output.of(shortName));
        }

        /**
         * @param sslConfigurations The SSL configuration of the app. Object is described below.
         * 
         * @return builder
         * 
         */
        public Builder sslConfigurations(@Nullable Output<List<ApplicationSslConfigurationGetArgs>> sslConfigurations) {
            $.sslConfigurations = sslConfigurations;
            return this;
        }

        /**
         * @param sslConfigurations The SSL configuration of the app. Object is described below.
         * 
         * @return builder
         * 
         */
        public Builder sslConfigurations(List<ApplicationSslConfigurationGetArgs> sslConfigurations) {
            return sslConfigurations(Output.of(sslConfigurations));
        }

        /**
         * @param sslConfigurations The SSL configuration of the app. Object is described below.
         * 
         * @return builder
         * 
         */
        public Builder sslConfigurations(ApplicationSslConfigurationGetArgs... sslConfigurations) {
            return sslConfigurations(List.of(sslConfigurations));
        }

        /**
         * @param stackId The id of the stack the application will belong to.
         * 
         * @return builder
         * 
         */
        public Builder stackId(@Nullable Output<String> stackId) {
            $.stackId = stackId;
            return this;
        }

        /**
         * @param stackId The id of the stack the application will belong to.
         * 
         * @return builder
         * 
         */
        public Builder stackId(String stackId) {
            return stackId(Output.of(stackId));
        }

        /**
         * @param type Opsworks application type. One of `aws-flow-ruby`, `java`, `rails`, `php`, `nodejs`, `static` or `other`.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Opsworks application type. One of `aws-flow-ruby`, `java`, `rails`, `php`, `nodejs`, `static` or `other`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ApplicationState build() {
            return $;
        }
    }

}
