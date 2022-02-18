// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa.outputs;

import io.pulumi.awsnative.mwaa.enums.EnvironmentWebserverAccessMode;
import io.pulumi.awsnative.mwaa.outputs.EnvironmentLoggingConfiguration;
import io.pulumi.awsnative.mwaa.outputs.EnvironmentNetworkConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetEnvironmentResult {
    /**
     * Key/value pairs representing Airflow configuration variables.
     *     Keys are prefixed by their section:
     * 
     *     [core]
     *     dags_folder={AIRFLOW_HOME}/dags
     *     
     *     Would be represented as
     *     
     *     "core.dags_folder": "{AIRFLOW_HOME}/dags"
     * 
     */
    private final @Nullable Object airflowConfigurationOptions;
    private final @Nullable String airflowVersion;
    private final @Nullable String arn;
    private final @Nullable String dagS3Path;
    private final @Nullable String environmentClass;
    private final @Nullable String executionRoleArn;
    private final @Nullable EnvironmentLoggingConfiguration loggingConfiguration;
    private final @Nullable Integer maxWorkers;
    private final @Nullable Integer minWorkers;
    private final @Nullable EnvironmentNetworkConfiguration networkConfiguration;
    private final @Nullable String pluginsS3ObjectVersion;
    private final @Nullable String pluginsS3Path;
    private final @Nullable String requirementsS3ObjectVersion;
    private final @Nullable String requirementsS3Path;
    private final @Nullable Integer schedulers;
    private final @Nullable String sourceBucketArn;
    /**
     * A map of tags for the environment.
     * 
     */
    private final @Nullable Object tags;
    private final @Nullable EnvironmentWebserverAccessMode webserverAccessMode;
    private final @Nullable String webserverUrl;
    private final @Nullable String weeklyMaintenanceWindowStart;

    @OutputCustomType.Constructor({"airflowConfigurationOptions","airflowVersion","arn","dagS3Path","environmentClass","executionRoleArn","loggingConfiguration","maxWorkers","minWorkers","networkConfiguration","pluginsS3ObjectVersion","pluginsS3Path","requirementsS3ObjectVersion","requirementsS3Path","schedulers","sourceBucketArn","tags","webserverAccessMode","webserverUrl","weeklyMaintenanceWindowStart"})
    private GetEnvironmentResult(
        @Nullable Object airflowConfigurationOptions,
        @Nullable String airflowVersion,
        @Nullable String arn,
        @Nullable String dagS3Path,
        @Nullable String environmentClass,
        @Nullable String executionRoleArn,
        @Nullable EnvironmentLoggingConfiguration loggingConfiguration,
        @Nullable Integer maxWorkers,
        @Nullable Integer minWorkers,
        @Nullable EnvironmentNetworkConfiguration networkConfiguration,
        @Nullable String pluginsS3ObjectVersion,
        @Nullable String pluginsS3Path,
        @Nullable String requirementsS3ObjectVersion,
        @Nullable String requirementsS3Path,
        @Nullable Integer schedulers,
        @Nullable String sourceBucketArn,
        @Nullable Object tags,
        @Nullable EnvironmentWebserverAccessMode webserverAccessMode,
        @Nullable String webserverUrl,
        @Nullable String weeklyMaintenanceWindowStart) {
        this.airflowConfigurationOptions = airflowConfigurationOptions;
        this.airflowVersion = airflowVersion;
        this.arn = arn;
        this.dagS3Path = dagS3Path;
        this.environmentClass = environmentClass;
        this.executionRoleArn = executionRoleArn;
        this.loggingConfiguration = loggingConfiguration;
        this.maxWorkers = maxWorkers;
        this.minWorkers = minWorkers;
        this.networkConfiguration = networkConfiguration;
        this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
        this.pluginsS3Path = pluginsS3Path;
        this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
        this.requirementsS3Path = requirementsS3Path;
        this.schedulers = schedulers;
        this.sourceBucketArn = sourceBucketArn;
        this.tags = tags;
        this.webserverAccessMode = webserverAccessMode;
        this.webserverUrl = webserverUrl;
        this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
    }

    /**
     * Key/value pairs representing Airflow configuration variables.
     *     Keys are prefixed by their section:
     * 
     *     [core]
     *     dags_folder={AIRFLOW_HOME}/dags
     *     
     *     Would be represented as
     *     
     *     "core.dags_folder": "{AIRFLOW_HOME}/dags"
     * 
     */
    public Optional<Object> getAirflowConfigurationOptions() {
        return Optional.ofNullable(this.airflowConfigurationOptions);
    }
    public Optional<String> getAirflowVersion() {
        return Optional.ofNullable(this.airflowVersion);
    }
    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getDagS3Path() {
        return Optional.ofNullable(this.dagS3Path);
    }
    public Optional<String> getEnvironmentClass() {
        return Optional.ofNullable(this.environmentClass);
    }
    public Optional<String> getExecutionRoleArn() {
        return Optional.ofNullable(this.executionRoleArn);
    }
    public Optional<EnvironmentLoggingConfiguration> getLoggingConfiguration() {
        return Optional.ofNullable(this.loggingConfiguration);
    }
    public Optional<Integer> getMaxWorkers() {
        return Optional.ofNullable(this.maxWorkers);
    }
    public Optional<Integer> getMinWorkers() {
        return Optional.ofNullable(this.minWorkers);
    }
    public Optional<EnvironmentNetworkConfiguration> getNetworkConfiguration() {
        return Optional.ofNullable(this.networkConfiguration);
    }
    public Optional<String> getPluginsS3ObjectVersion() {
        return Optional.ofNullable(this.pluginsS3ObjectVersion);
    }
    public Optional<String> getPluginsS3Path() {
        return Optional.ofNullable(this.pluginsS3Path);
    }
    public Optional<String> getRequirementsS3ObjectVersion() {
        return Optional.ofNullable(this.requirementsS3ObjectVersion);
    }
    public Optional<String> getRequirementsS3Path() {
        return Optional.ofNullable(this.requirementsS3Path);
    }
    public Optional<Integer> getSchedulers() {
        return Optional.ofNullable(this.schedulers);
    }
    public Optional<String> getSourceBucketArn() {
        return Optional.ofNullable(this.sourceBucketArn);
    }
    /**
     * A map of tags for the environment.
     * 
     */
    public Optional<Object> getTags() {
        return Optional.ofNullable(this.tags);
    }
    public Optional<EnvironmentWebserverAccessMode> getWebserverAccessMode() {
        return Optional.ofNullable(this.webserverAccessMode);
    }
    public Optional<String> getWebserverUrl() {
        return Optional.ofNullable(this.webserverUrl);
    }
    public Optional<String> getWeeklyMaintenanceWindowStart() {
        return Optional.ofNullable(this.weeklyMaintenanceWindowStart);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnvironmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Object airflowConfigurationOptions;
        private @Nullable String airflowVersion;
        private @Nullable String arn;
        private @Nullable String dagS3Path;
        private @Nullable String environmentClass;
        private @Nullable String executionRoleArn;
        private @Nullable EnvironmentLoggingConfiguration loggingConfiguration;
        private @Nullable Integer maxWorkers;
        private @Nullable Integer minWorkers;
        private @Nullable EnvironmentNetworkConfiguration networkConfiguration;
        private @Nullable String pluginsS3ObjectVersion;
        private @Nullable String pluginsS3Path;
        private @Nullable String requirementsS3ObjectVersion;
        private @Nullable String requirementsS3Path;
        private @Nullable Integer schedulers;
        private @Nullable String sourceBucketArn;
        private @Nullable Object tags;
        private @Nullable EnvironmentWebserverAccessMode webserverAccessMode;
        private @Nullable String webserverUrl;
        private @Nullable String weeklyMaintenanceWindowStart;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnvironmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.airflowConfigurationOptions = defaults.airflowConfigurationOptions;
    	      this.airflowVersion = defaults.airflowVersion;
    	      this.arn = defaults.arn;
    	      this.dagS3Path = defaults.dagS3Path;
    	      this.environmentClass = defaults.environmentClass;
    	      this.executionRoleArn = defaults.executionRoleArn;
    	      this.loggingConfiguration = defaults.loggingConfiguration;
    	      this.maxWorkers = defaults.maxWorkers;
    	      this.minWorkers = defaults.minWorkers;
    	      this.networkConfiguration = defaults.networkConfiguration;
    	      this.pluginsS3ObjectVersion = defaults.pluginsS3ObjectVersion;
    	      this.pluginsS3Path = defaults.pluginsS3Path;
    	      this.requirementsS3ObjectVersion = defaults.requirementsS3ObjectVersion;
    	      this.requirementsS3Path = defaults.requirementsS3Path;
    	      this.schedulers = defaults.schedulers;
    	      this.sourceBucketArn = defaults.sourceBucketArn;
    	      this.tags = defaults.tags;
    	      this.webserverAccessMode = defaults.webserverAccessMode;
    	      this.webserverUrl = defaults.webserverUrl;
    	      this.weeklyMaintenanceWindowStart = defaults.weeklyMaintenanceWindowStart;
        }

        public Builder setAirflowConfigurationOptions(@Nullable Object airflowConfigurationOptions) {
            this.airflowConfigurationOptions = airflowConfigurationOptions;
            return this;
        }

        public Builder setAirflowVersion(@Nullable String airflowVersion) {
            this.airflowVersion = airflowVersion;
            return this;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setDagS3Path(@Nullable String dagS3Path) {
            this.dagS3Path = dagS3Path;
            return this;
        }

        public Builder setEnvironmentClass(@Nullable String environmentClass) {
            this.environmentClass = environmentClass;
            return this;
        }

        public Builder setExecutionRoleArn(@Nullable String executionRoleArn) {
            this.executionRoleArn = executionRoleArn;
            return this;
        }

        public Builder setLoggingConfiguration(@Nullable EnvironmentLoggingConfiguration loggingConfiguration) {
            this.loggingConfiguration = loggingConfiguration;
            return this;
        }

        public Builder setMaxWorkers(@Nullable Integer maxWorkers) {
            this.maxWorkers = maxWorkers;
            return this;
        }

        public Builder setMinWorkers(@Nullable Integer minWorkers) {
            this.minWorkers = minWorkers;
            return this;
        }

        public Builder setNetworkConfiguration(@Nullable EnvironmentNetworkConfiguration networkConfiguration) {
            this.networkConfiguration = networkConfiguration;
            return this;
        }

        public Builder setPluginsS3ObjectVersion(@Nullable String pluginsS3ObjectVersion) {
            this.pluginsS3ObjectVersion = pluginsS3ObjectVersion;
            return this;
        }

        public Builder setPluginsS3Path(@Nullable String pluginsS3Path) {
            this.pluginsS3Path = pluginsS3Path;
            return this;
        }

        public Builder setRequirementsS3ObjectVersion(@Nullable String requirementsS3ObjectVersion) {
            this.requirementsS3ObjectVersion = requirementsS3ObjectVersion;
            return this;
        }

        public Builder setRequirementsS3Path(@Nullable String requirementsS3Path) {
            this.requirementsS3Path = requirementsS3Path;
            return this;
        }

        public Builder setSchedulers(@Nullable Integer schedulers) {
            this.schedulers = schedulers;
            return this;
        }

        public Builder setSourceBucketArn(@Nullable String sourceBucketArn) {
            this.sourceBucketArn = sourceBucketArn;
            return this;
        }

        public Builder setTags(@Nullable Object tags) {
            this.tags = tags;
            return this;
        }

        public Builder setWebserverAccessMode(@Nullable EnvironmentWebserverAccessMode webserverAccessMode) {
            this.webserverAccessMode = webserverAccessMode;
            return this;
        }

        public Builder setWebserverUrl(@Nullable String webserverUrl) {
            this.webserverUrl = webserverUrl;
            return this;
        }

        public Builder setWeeklyMaintenanceWindowStart(@Nullable String weeklyMaintenanceWindowStart) {
            this.weeklyMaintenanceWindowStart = weeklyMaintenanceWindowStart;
            return this;
        }

        public GetEnvironmentResult build() {
            return new GetEnvironmentResult(airflowConfigurationOptions, airflowVersion, arn, dagS3Path, environmentClass, executionRoleArn, loggingConfiguration, maxWorkers, minWorkers, networkConfiguration, pluginsS3ObjectVersion, pluginsS3Path, requirementsS3ObjectVersion, requirementsS3Path, schedulers, sourceBucketArn, tags, webserverAccessMode, webserverUrl, weeklyMaintenanceWindowStart);
        }
    }
}
