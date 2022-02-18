// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudtasks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.cloudtasks.inputs.QueueAppEngineRoutingOverrideGetArgs;
import io.pulumi.gcp.cloudtasks.inputs.QueueRateLimitsGetArgs;
import io.pulumi.gcp.cloudtasks.inputs.QueueRetryConfigGetArgs;
import io.pulumi.gcp.cloudtasks.inputs.QueueStackdriverLoggingConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QueueState extends io.pulumi.resources.ResourceArgs {

    public static final QueueState Empty = new QueueState();

    /**
     * Overrides for task-level appEngineRouting. These settings apply only
     * to App Engine tasks in this queue
     * Structure is documented below.
     * 
     */
    @InputImport(name="appEngineRoutingOverride")
    private final @Nullable Input<QueueAppEngineRoutingOverrideGetArgs> appEngineRoutingOverride;

    public Input<QueueAppEngineRoutingOverrideGetArgs> getAppEngineRoutingOverride() {
        return this.appEngineRoutingOverride == null ? Input.empty() : this.appEngineRoutingOverride;
    }

    /**
     * The location of the queue
     * 
     */
    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * The queue name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * Rate limits for task dispatches.
     * The queue's actual dispatch rate is the result of:
     * * Number of tasks in the queue
     * * User-specified throttling: rateLimits, retryConfig, and the queue's state.
     * * System throttling due to 429 (Too Many Requests) or 503 (Service
     *   Unavailable) responses from the worker, high error rates, or to
     *   smooth sudden large traffic spikes.
     *   Structure is documented below.
     * 
     */
    @InputImport(name="rateLimits")
    private final @Nullable Input<QueueRateLimitsGetArgs> rateLimits;

    public Input<QueueRateLimitsGetArgs> getRateLimits() {
        return this.rateLimits == null ? Input.empty() : this.rateLimits;
    }

    /**
     * Settings that determine the retry behavior.
     * Structure is documented below.
     * 
     */
    @InputImport(name="retryConfig")
    private final @Nullable Input<QueueRetryConfigGetArgs> retryConfig;

    public Input<QueueRetryConfigGetArgs> getRetryConfig() {
        return this.retryConfig == null ? Input.empty() : this.retryConfig;
    }

    /**
     * Configuration options for writing logs to Stackdriver Logging.
     * Structure is documented below.
     * 
     */
    @InputImport(name="stackdriverLoggingConfig")
    private final @Nullable Input<QueueStackdriverLoggingConfigGetArgs> stackdriverLoggingConfig;

    public Input<QueueStackdriverLoggingConfigGetArgs> getStackdriverLoggingConfig() {
        return this.stackdriverLoggingConfig == null ? Input.empty() : this.stackdriverLoggingConfig;
    }

    public QueueState(
        @Nullable Input<QueueAppEngineRoutingOverrideGetArgs> appEngineRoutingOverride,
        @Nullable Input<String> location,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<QueueRateLimitsGetArgs> rateLimits,
        @Nullable Input<QueueRetryConfigGetArgs> retryConfig,
        @Nullable Input<QueueStackdriverLoggingConfigGetArgs> stackdriverLoggingConfig) {
        this.appEngineRoutingOverride = appEngineRoutingOverride;
        this.location = location;
        this.name = name;
        this.project = project;
        this.rateLimits = rateLimits;
        this.retryConfig = retryConfig;
        this.stackdriverLoggingConfig = stackdriverLoggingConfig;
    }

    private QueueState() {
        this.appEngineRoutingOverride = Input.empty();
        this.location = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.rateLimits = Input.empty();
        this.retryConfig = Input.empty();
        this.stackdriverLoggingConfig = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QueueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<QueueAppEngineRoutingOverrideGetArgs> appEngineRoutingOverride;
        private @Nullable Input<String> location;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<QueueRateLimitsGetArgs> rateLimits;
        private @Nullable Input<QueueRetryConfigGetArgs> retryConfig;
        private @Nullable Input<QueueStackdriverLoggingConfigGetArgs> stackdriverLoggingConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(QueueState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRoutingOverride = defaults.appEngineRoutingOverride;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rateLimits = defaults.rateLimits;
    	      this.retryConfig = defaults.retryConfig;
    	      this.stackdriverLoggingConfig = defaults.stackdriverLoggingConfig;
        }

        public Builder setAppEngineRoutingOverride(@Nullable Input<QueueAppEngineRoutingOverrideGetArgs> appEngineRoutingOverride) {
            this.appEngineRoutingOverride = appEngineRoutingOverride;
            return this;
        }

        public Builder setAppEngineRoutingOverride(@Nullable QueueAppEngineRoutingOverrideGetArgs appEngineRoutingOverride) {
            this.appEngineRoutingOverride = Input.ofNullable(appEngineRoutingOverride);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRateLimits(@Nullable Input<QueueRateLimitsGetArgs> rateLimits) {
            this.rateLimits = rateLimits;
            return this;
        }

        public Builder setRateLimits(@Nullable QueueRateLimitsGetArgs rateLimits) {
            this.rateLimits = Input.ofNullable(rateLimits);
            return this;
        }

        public Builder setRetryConfig(@Nullable Input<QueueRetryConfigGetArgs> retryConfig) {
            this.retryConfig = retryConfig;
            return this;
        }

        public Builder setRetryConfig(@Nullable QueueRetryConfigGetArgs retryConfig) {
            this.retryConfig = Input.ofNullable(retryConfig);
            return this;
        }

        public Builder setStackdriverLoggingConfig(@Nullable Input<QueueStackdriverLoggingConfigGetArgs> stackdriverLoggingConfig) {
            this.stackdriverLoggingConfig = stackdriverLoggingConfig;
            return this;
        }

        public Builder setStackdriverLoggingConfig(@Nullable QueueStackdriverLoggingConfigGetArgs stackdriverLoggingConfig) {
            this.stackdriverLoggingConfig = Input.ofNullable(stackdriverLoggingConfig);
            return this;
        }

        public QueueState build() {
            return new QueueState(appEngineRoutingOverride, location, name, project, rateLimits, retryConfig, stackdriverLoggingConfig);
        }
    }
}
