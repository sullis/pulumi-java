// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudtasks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudtasks.inputs.QueueAppEngineRoutingOverrideGetArgs;
import com.pulumi.gcp.cloudtasks.inputs.QueueRateLimitsGetArgs;
import com.pulumi.gcp.cloudtasks.inputs.QueueRetryConfigGetArgs;
import com.pulumi.gcp.cloudtasks.inputs.QueueStackdriverLoggingConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueueState extends com.pulumi.resources.ResourceArgs {

    public static final QueueState Empty = new QueueState();

    /**
     * Overrides for task-level appEngineRouting. These settings apply only
     * to App Engine tasks in this queue
     * Structure is documented below.
     * 
     */
    @Import(name="appEngineRoutingOverride")
    private @Nullable Output<QueueAppEngineRoutingOverrideGetArgs> appEngineRoutingOverride;

    /**
     * @return Overrides for task-level appEngineRouting. These settings apply only
     * to App Engine tasks in this queue
     * Structure is documented below.
     * 
     */
    public Optional<Output<QueueAppEngineRoutingOverrideGetArgs>> appEngineRoutingOverride() {
        return Optional.ofNullable(this.appEngineRoutingOverride);
    }

    /**
     * The location of the queue
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return The location of the queue
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The queue name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The queue name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Rate limits for task dispatches.
     * The queue&#39;s actual dispatch rate is the result of:
     * * Number of tasks in the queue
     * * User-specified throttling: rateLimits, retryConfig, and the queue&#39;s state.
     * * System throttling due to 429 (Too Many Requests) or 503 (Service
     *   Unavailable) responses from the worker, high error rates, or to
     *   smooth sudden large traffic spikes.
     *   Structure is documented below.
     * 
     */
    @Import(name="rateLimits")
    private @Nullable Output<QueueRateLimitsGetArgs> rateLimits;

    /**
     * @return Rate limits for task dispatches.
     * The queue&#39;s actual dispatch rate is the result of:
     * * Number of tasks in the queue
     * * User-specified throttling: rateLimits, retryConfig, and the queue&#39;s state.
     * * System throttling due to 429 (Too Many Requests) or 503 (Service
     *   Unavailable) responses from the worker, high error rates, or to
     *   smooth sudden large traffic spikes.
     *   Structure is documented below.
     * 
     */
    public Optional<Output<QueueRateLimitsGetArgs>> rateLimits() {
        return Optional.ofNullable(this.rateLimits);
    }

    /**
     * Settings that determine the retry behavior.
     * Structure is documented below.
     * 
     */
    @Import(name="retryConfig")
    private @Nullable Output<QueueRetryConfigGetArgs> retryConfig;

    /**
     * @return Settings that determine the retry behavior.
     * Structure is documented below.
     * 
     */
    public Optional<Output<QueueRetryConfigGetArgs>> retryConfig() {
        return Optional.ofNullable(this.retryConfig);
    }

    /**
     * Configuration options for writing logs to Stackdriver Logging.
     * Structure is documented below.
     * 
     */
    @Import(name="stackdriverLoggingConfig")
    private @Nullable Output<QueueStackdriverLoggingConfigGetArgs> stackdriverLoggingConfig;

    /**
     * @return Configuration options for writing logs to Stackdriver Logging.
     * Structure is documented below.
     * 
     */
    public Optional<Output<QueueStackdriverLoggingConfigGetArgs>> stackdriverLoggingConfig() {
        return Optional.ofNullable(this.stackdriverLoggingConfig);
    }

    private QueueState() {}

    private QueueState(QueueState $) {
        this.appEngineRoutingOverride = $.appEngineRoutingOverride;
        this.location = $.location;
        this.name = $.name;
        this.project = $.project;
        this.rateLimits = $.rateLimits;
        this.retryConfig = $.retryConfig;
        this.stackdriverLoggingConfig = $.stackdriverLoggingConfig;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueState $;

        public Builder() {
            $ = new QueueState();
        }

        public Builder(QueueState defaults) {
            $ = new QueueState(Objects.requireNonNull(defaults));
        }

        /**
         * @param appEngineRoutingOverride Overrides for task-level appEngineRouting. These settings apply only
         * to App Engine tasks in this queue
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder appEngineRoutingOverride(@Nullable Output<QueueAppEngineRoutingOverrideGetArgs> appEngineRoutingOverride) {
            $.appEngineRoutingOverride = appEngineRoutingOverride;
            return this;
        }

        /**
         * @param appEngineRoutingOverride Overrides for task-level appEngineRouting. These settings apply only
         * to App Engine tasks in this queue
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder appEngineRoutingOverride(QueueAppEngineRoutingOverrideGetArgs appEngineRoutingOverride) {
            return appEngineRoutingOverride(Output.of(appEngineRoutingOverride));
        }

        /**
         * @param location The location of the queue
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location The location of the queue
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param name The queue name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The queue name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param rateLimits Rate limits for task dispatches.
         * The queue&#39;s actual dispatch rate is the result of:
         * * Number of tasks in the queue
         * * User-specified throttling: rateLimits, retryConfig, and the queue&#39;s state.
         * * System throttling due to 429 (Too Many Requests) or 503 (Service
         *   Unavailable) responses from the worker, high error rates, or to
         *   smooth sudden large traffic spikes.
         *   Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(@Nullable Output<QueueRateLimitsGetArgs> rateLimits) {
            $.rateLimits = rateLimits;
            return this;
        }

        /**
         * @param rateLimits Rate limits for task dispatches.
         * The queue&#39;s actual dispatch rate is the result of:
         * * Number of tasks in the queue
         * * User-specified throttling: rateLimits, retryConfig, and the queue&#39;s state.
         * * System throttling due to 429 (Too Many Requests) or 503 (Service
         *   Unavailable) responses from the worker, high error rates, or to
         *   smooth sudden large traffic spikes.
         *   Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder rateLimits(QueueRateLimitsGetArgs rateLimits) {
            return rateLimits(Output.of(rateLimits));
        }

        /**
         * @param retryConfig Settings that determine the retry behavior.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retryConfig(@Nullable Output<QueueRetryConfigGetArgs> retryConfig) {
            $.retryConfig = retryConfig;
            return this;
        }

        /**
         * @param retryConfig Settings that determine the retry behavior.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder retryConfig(QueueRetryConfigGetArgs retryConfig) {
            return retryConfig(Output.of(retryConfig));
        }

        /**
         * @param stackdriverLoggingConfig Configuration options for writing logs to Stackdriver Logging.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder stackdriverLoggingConfig(@Nullable Output<QueueStackdriverLoggingConfigGetArgs> stackdriverLoggingConfig) {
            $.stackdriverLoggingConfig = stackdriverLoggingConfig;
            return this;
        }

        /**
         * @param stackdriverLoggingConfig Configuration options for writing logs to Stackdriver Logging.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder stackdriverLoggingConfig(QueueStackdriverLoggingConfigGetArgs stackdriverLoggingConfig) {
            return stackdriverLoggingConfig(Output.of(stackdriverLoggingConfig));
        }

        public QueueState build() {
            return $;
        }
    }

}
