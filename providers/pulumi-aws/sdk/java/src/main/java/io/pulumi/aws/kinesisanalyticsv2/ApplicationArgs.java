// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesisanalyticsv2;

import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationApplicationConfigurationArgs;
import io.pulumi.aws.kinesisanalyticsv2.inputs.ApplicationCloudwatchLoggingOptionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationArgs Empty = new ApplicationArgs();

    /**
     * The application's configuration
     * 
     */
    @Import(name="applicationConfiguration")
      private final @Nullable Output<ApplicationApplicationConfigurationArgs> applicationConfiguration;

    public Output<ApplicationApplicationConfigurationArgs> getApplicationConfiguration() {
        return this.applicationConfiguration == null ? Output.empty() : this.applicationConfiguration;
    }

    /**
     * A CloudWatch log stream to monitor application configuration errors.
     * 
     */
    @Import(name="cloudwatchLoggingOptions")
      private final @Nullable Output<ApplicationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;

    public Output<ApplicationCloudwatchLoggingOptionsArgs> getCloudwatchLoggingOptions() {
        return this.cloudwatchLoggingOptions == null ? Output.empty() : this.cloudwatchLoggingOptions;
    }

    /**
     * A summary description of the application.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Whether to force stop an unresponsive Flink-based application.
     * 
     */
    @Import(name="forceStop")
      private final @Nullable Output<Boolean> forceStop;

    public Output<Boolean> getForceStop() {
        return this.forceStop == null ? Output.empty() : this.forceStop;
    }

    /**
     * The name of the application.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The runtime environment for the application. Valid values: `SQL-1_0`, `FLINK-1_6`, `FLINK-1_8`, `FLINK-1_11`.
     * 
     */
    @Import(name="runtimeEnvironment", required=true)
      private final Output<String> runtimeEnvironment;

    public Output<String> getRuntimeEnvironment() {
        return this.runtimeEnvironment;
    }

    /**
     * The ARN of the IAM role used by the application to access Kinesis data streams, Kinesis Data Firehose delivery streams, Amazon S3 objects, and other external resources.
     * 
     */
    @Import(name="serviceExecutionRole", required=true)
      private final Output<String> serviceExecutionRole;

    public Output<String> getServiceExecutionRole() {
        return this.serviceExecutionRole;
    }

    /**
     * Whether to start or stop the application.
     * 
     */
    @Import(name="startApplication")
      private final @Nullable Output<Boolean> startApplication;

    public Output<Boolean> getStartApplication() {
        return this.startApplication == null ? Output.empty() : this.startApplication;
    }

    /**
     * A map of tags to assign to the application. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ApplicationArgs(
        @Nullable Output<ApplicationApplicationConfigurationArgs> applicationConfiguration,
        @Nullable Output<ApplicationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> forceStop,
        @Nullable Output<String> name,
        Output<String> runtimeEnvironment,
        Output<String> serviceExecutionRole,
        @Nullable Output<Boolean> startApplication,
        @Nullable Output<Map<String,String>> tags) {
        this.applicationConfiguration = applicationConfiguration;
        this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
        this.description = description;
        this.forceStop = forceStop;
        this.name = name;
        this.runtimeEnvironment = Objects.requireNonNull(runtimeEnvironment, "expected parameter 'runtimeEnvironment' to be non-null");
        this.serviceExecutionRole = Objects.requireNonNull(serviceExecutionRole, "expected parameter 'serviceExecutionRole' to be non-null");
        this.startApplication = startApplication;
        this.tags = tags;
    }

    private ApplicationArgs() {
        this.applicationConfiguration = Output.empty();
        this.cloudwatchLoggingOptions = Output.empty();
        this.description = Output.empty();
        this.forceStop = Output.empty();
        this.name = Output.empty();
        this.runtimeEnvironment = Output.empty();
        this.serviceExecutionRole = Output.empty();
        this.startApplication = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ApplicationApplicationConfigurationArgs> applicationConfiguration;
        private @Nullable Output<ApplicationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> forceStop;
        private @Nullable Output<String> name;
        private Output<String> runtimeEnvironment;
        private Output<String> serviceExecutionRole;
        private @Nullable Output<Boolean> startApplication;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationConfiguration = defaults.applicationConfiguration;
    	      this.cloudwatchLoggingOptions = defaults.cloudwatchLoggingOptions;
    	      this.description = defaults.description;
    	      this.forceStop = defaults.forceStop;
    	      this.name = defaults.name;
    	      this.runtimeEnvironment = defaults.runtimeEnvironment;
    	      this.serviceExecutionRole = defaults.serviceExecutionRole;
    	      this.startApplication = defaults.startApplication;
    	      this.tags = defaults.tags;
        }

        public Builder applicationConfiguration(@Nullable Output<ApplicationApplicationConfigurationArgs> applicationConfiguration) {
            this.applicationConfiguration = applicationConfiguration;
            return this;
        }
        public Builder applicationConfiguration(@Nullable ApplicationApplicationConfigurationArgs applicationConfiguration) {
            this.applicationConfiguration = Output.ofNullable(applicationConfiguration);
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable Output<ApplicationCloudwatchLoggingOptionsArgs> cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = cloudwatchLoggingOptions;
            return this;
        }
        public Builder cloudwatchLoggingOptions(@Nullable ApplicationCloudwatchLoggingOptionsArgs cloudwatchLoggingOptions) {
            this.cloudwatchLoggingOptions = Output.ofNullable(cloudwatchLoggingOptions);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder forceStop(@Nullable Output<Boolean> forceStop) {
            this.forceStop = forceStop;
            return this;
        }
        public Builder forceStop(@Nullable Boolean forceStop) {
            this.forceStop = Output.ofNullable(forceStop);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder runtimeEnvironment(Output<String> runtimeEnvironment) {
            this.runtimeEnvironment = Objects.requireNonNull(runtimeEnvironment);
            return this;
        }
        public Builder runtimeEnvironment(String runtimeEnvironment) {
            this.runtimeEnvironment = Output.of(Objects.requireNonNull(runtimeEnvironment));
            return this;
        }
        public Builder serviceExecutionRole(Output<String> serviceExecutionRole) {
            this.serviceExecutionRole = Objects.requireNonNull(serviceExecutionRole);
            return this;
        }
        public Builder serviceExecutionRole(String serviceExecutionRole) {
            this.serviceExecutionRole = Output.of(Objects.requireNonNull(serviceExecutionRole));
            return this;
        }
        public Builder startApplication(@Nullable Output<Boolean> startApplication) {
            this.startApplication = startApplication;
            return this;
        }
        public Builder startApplication(@Nullable Boolean startApplication) {
            this.startApplication = Output.ofNullable(startApplication);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ApplicationArgs build() {
            return new ApplicationArgs(applicationConfiguration, cloudwatchLoggingOptions, description, forceStop, name, runtimeEnvironment, serviceExecutionRole, startApplication, tags);
        }
    }
}
