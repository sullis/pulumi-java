// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datafusion;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.datafusion.inputs.InstanceNetworkConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * User-managed service account to set on Dataproc when Cloud Data Fusion creates Dataproc to run data processing pipelines.
     * 
     */
    @Import(name="dataprocServiceAccount")
      private final @Nullable Output<String> dataprocServiceAccount;

    public Output<String> getDataprocServiceAccount() {
        return this.dataprocServiceAccount == null ? Output.empty() : this.dataprocServiceAccount;
    }

    /**
     * An optional description of the instance.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Option to enable Stackdriver Logging.
     * 
     */
    @Import(name="enableStackdriverLogging")
      private final @Nullable Output<Boolean> enableStackdriverLogging;

    public Output<Boolean> getEnableStackdriverLogging() {
        return this.enableStackdriverLogging == null ? Output.empty() : this.enableStackdriverLogging;
    }

    /**
     * Option to enable Stackdriver Monitoring.
     * 
     */
    @Import(name="enableStackdriverMonitoring")
      private final @Nullable Output<Boolean> enableStackdriverMonitoring;

    public Output<Boolean> getEnableStackdriverMonitoring() {
        return this.enableStackdriverMonitoring == null ? Output.empty() : this.enableStackdriverMonitoring;
    }

    /**
     * The resource labels for instance to use to annotate any related underlying resources,
     * such as Compute Engine VMs.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The ID of the instance or a fully qualified identifier for the instance.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Network configuration options. These are required when a private Data Fusion instance is to be created.
     * Structure is documented below.
     * 
     */
    @Import(name="networkConfig")
      private final @Nullable Output<InstanceNetworkConfigArgs> networkConfig;

    public Output<InstanceNetworkConfigArgs> getNetworkConfig() {
        return this.networkConfig == null ? Output.empty() : this.networkConfig;
    }

    /**
     * Map of additional options used to configure the behavior of Data Fusion instance.
     * 
     */
    @Import(name="options")
      private final @Nullable Output<Map<String,String>> options;

    public Output<Map<String,String>> getOptions() {
        return this.options == null ? Output.empty() : this.options;
    }

    /**
     * Specifies whether the Data Fusion instance should be private. If set to
     * true, all Data Fusion nodes will have private IP addresses and will not be
     * able to access the public internet.
     * 
     */
    @Import(name="privateInstance")
      private final @Nullable Output<Boolean> privateInstance;

    public Output<Boolean> getPrivateInstance() {
        return this.privateInstance == null ? Output.empty() : this.privateInstance;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The region of the Data Fusion instance.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Output.empty() : this.region;
    }

    /**
     * Represents the type of Data Fusion instance. Each type is configured with
     * the default settings for processing and memory.
     * - BASIC: Basic Data Fusion instance. In Basic type, the user will be able to create data pipelines
     *   using point and click UI. However, there are certain limitations, such as fewer number
     *   of concurrent pipelines, no support for streaming pipelines, etc.
     * - ENTERPRISE: Enterprise Data Fusion instance. In Enterprise type, the user will have more features
     *   available, such as support for streaming pipelines, higher number of concurrent pipelines, etc.
     * - DEVELOPER: Developer Data Fusion instance. In Developer type, the user will have all features available but
     *   with restrictive capabilities. This is to help enterprises design and develop their data ingestion and integration
     *   pipelines at low cost.
     *   Possible values are `BASIC`, `ENTERPRISE`, and `DEVELOPER`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * Current version of the Data Fusion.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public InstanceArgs(
        @Nullable Output<String> dataprocServiceAccount,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableStackdriverLogging,
        @Nullable Output<Boolean> enableStackdriverMonitoring,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<InstanceNetworkConfigArgs> networkConfig,
        @Nullable Output<Map<String,String>> options,
        @Nullable Output<Boolean> privateInstance,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        Output<String> type,
        @Nullable Output<String> version) {
        this.dataprocServiceAccount = dataprocServiceAccount;
        this.description = description;
        this.enableStackdriverLogging = enableStackdriverLogging;
        this.enableStackdriverMonitoring = enableStackdriverMonitoring;
        this.labels = labels;
        this.name = name;
        this.networkConfig = networkConfig;
        this.options = options;
        this.privateInstance = privateInstance;
        this.project = project;
        this.region = region;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.version = version;
    }

    private InstanceArgs() {
        this.dataprocServiceAccount = Output.empty();
        this.description = Output.empty();
        this.enableStackdriverLogging = Output.empty();
        this.enableStackdriverMonitoring = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
        this.networkConfig = Output.empty();
        this.options = Output.empty();
        this.privateInstance = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.type = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataprocServiceAccount;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableStackdriverLogging;
        private @Nullable Output<Boolean> enableStackdriverMonitoring;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<InstanceNetworkConfigArgs> networkConfig;
        private @Nullable Output<Map<String,String>> options;
        private @Nullable Output<Boolean> privateInstance;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private Output<String> type;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataprocServiceAccount = defaults.dataprocServiceAccount;
    	      this.description = defaults.description;
    	      this.enableStackdriverLogging = defaults.enableStackdriverLogging;
    	      this.enableStackdriverMonitoring = defaults.enableStackdriverMonitoring;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.networkConfig = defaults.networkConfig;
    	      this.options = defaults.options;
    	      this.privateInstance = defaults.privateInstance;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder dataprocServiceAccount(@Nullable Output<String> dataprocServiceAccount) {
            this.dataprocServiceAccount = dataprocServiceAccount;
            return this;
        }
        public Builder dataprocServiceAccount(@Nullable String dataprocServiceAccount) {
            this.dataprocServiceAccount = Output.ofNullable(dataprocServiceAccount);
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
        public Builder enableStackdriverLogging(@Nullable Output<Boolean> enableStackdriverLogging) {
            this.enableStackdriverLogging = enableStackdriverLogging;
            return this;
        }
        public Builder enableStackdriverLogging(@Nullable Boolean enableStackdriverLogging) {
            this.enableStackdriverLogging = Output.ofNullable(enableStackdriverLogging);
            return this;
        }
        public Builder enableStackdriverMonitoring(@Nullable Output<Boolean> enableStackdriverMonitoring) {
            this.enableStackdriverMonitoring = enableStackdriverMonitoring;
            return this;
        }
        public Builder enableStackdriverMonitoring(@Nullable Boolean enableStackdriverMonitoring) {
            this.enableStackdriverMonitoring = Output.ofNullable(enableStackdriverMonitoring);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
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
        public Builder networkConfig(@Nullable Output<InstanceNetworkConfigArgs> networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }
        public Builder networkConfig(@Nullable InstanceNetworkConfigArgs networkConfig) {
            this.networkConfig = Output.ofNullable(networkConfig);
            return this;
        }
        public Builder options(@Nullable Output<Map<String,String>> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable Map<String,String> options) {
            this.options = Output.ofNullable(options);
            return this;
        }
        public Builder privateInstance(@Nullable Output<Boolean> privateInstance) {
            this.privateInstance = privateInstance;
            return this;
        }
        public Builder privateInstance(@Nullable Boolean privateInstance) {
            this.privateInstance = Output.ofNullable(privateInstance);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Output.ofNullable(region);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public InstanceArgs build() {
            return new InstanceArgs(dataprocServiceAccount, description, enableStackdriverLogging, enableStackdriverMonitoring, labels, name, networkConfig, options, privateInstance, project, region, type, version);
        }
    }
}
