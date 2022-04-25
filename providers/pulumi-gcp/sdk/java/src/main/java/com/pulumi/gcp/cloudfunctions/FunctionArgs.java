// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.cloudfunctions;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.cloudfunctions.inputs.FunctionEventTriggerArgs;
import com.pulumi.gcp.cloudfunctions.inputs.FunctionSourceRepositoryArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FunctionArgs extends com.pulumi.resources.ResourceArgs {

    public static final FunctionArgs Empty = new FunctionArgs();

    /**
     * Memory (in MB), available to the function. Default value is `256`. Possible values include `128`, `256`, `512`, `1024`, etc.
     * 
     */
    @Import(name="availableMemoryMb")
    private @Nullable Output<Integer> availableMemoryMb;

    /**
     * @return Memory (in MB), available to the function. Default value is `256`. Possible values include `128`, `256`, `512`, `1024`, etc.
     * 
     */
    public Optional<Output<Integer>> availableMemoryMb() {
        return Optional.ofNullable(this.availableMemoryMb);
    }

    /**
     * A set of key/value environment variable pairs available during build time.
     * 
     */
    @Import(name="buildEnvironmentVariables")
    private @Nullable Output<Map<String,Object>> buildEnvironmentVariables;

    /**
     * @return A set of key/value environment variable pairs available during build time.
     * 
     */
    public Optional<Output<Map<String,Object>>> buildEnvironmentVariables() {
        return Optional.ofNullable(this.buildEnvironmentVariables);
    }

    /**
     * Description of the function.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the function.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Name of the function that will be executed when the Google Cloud Function is triggered.
     * 
     */
    @Import(name="entryPoint")
    private @Nullable Output<String> entryPoint;

    /**
     * @return Name of the function that will be executed when the Google Cloud Function is triggered.
     * 
     */
    public Optional<Output<String>> entryPoint() {
        return Optional.ofNullable(this.entryPoint);
    }

    /**
     * A set of key/value environment variable pairs to assign to the function.
     * 
     */
    @Import(name="environmentVariables")
    private @Nullable Output<Map<String,Object>> environmentVariables;

    /**
     * @return A set of key/value environment variable pairs to assign to the function.
     * 
     */
    public Optional<Output<Map<String,Object>>> environmentVariables() {
        return Optional.ofNullable(this.environmentVariables);
    }

    /**
     * A source that fires events in response to a condition in another service. Structure is documented below. Cannot be used with `trigger_http`.
     * 
     */
    @Import(name="eventTrigger")
    private @Nullable Output<FunctionEventTriggerArgs> eventTrigger;

    /**
     * @return A source that fires events in response to a condition in another service. Structure is documented below. Cannot be used with `trigger_http`.
     * 
     */
    public Optional<Output<FunctionEventTriggerArgs>> eventTrigger() {
        return Optional.ofNullable(this.eventTrigger);
    }

    /**
     * URL which triggers function execution. Returned only if `trigger_http` is used.
     * 
     */
    @Import(name="httpsTriggerUrl")
    private @Nullable Output<String> httpsTriggerUrl;

    /**
     * @return URL which triggers function execution. Returned only if `trigger_http` is used.
     * 
     */
    public Optional<Output<String>> httpsTriggerUrl() {
        return Optional.ofNullable(this.httpsTriggerUrl);
    }

    /**
     * String value that controls what traffic can reach the function. Allowed values are `ALLOW_ALL`, `ALLOW_INTERNAL_AND_GCLB` and `ALLOW_INTERNAL_ONLY`. Check [ingress documentation](https://cloud.google.com/functions/docs/networking/network-settings#ingress_settings) to see the impact of each settings value. Changes to this field will recreate the cloud function.
     * 
     */
    @Import(name="ingressSettings")
    private @Nullable Output<String> ingressSettings;

    /**
     * @return String value that controls what traffic can reach the function. Allowed values are `ALLOW_ALL`, `ALLOW_INTERNAL_AND_GCLB` and `ALLOW_INTERNAL_ONLY`. Check [ingress documentation](https://cloud.google.com/functions/docs/networking/network-settings#ingress_settings) to see the impact of each settings value. Changes to this field will recreate the cloud function.
     * 
     */
    public Optional<Output<String>> ingressSettings() {
        return Optional.ofNullable(this.ingressSettings);
    }

    /**
     * A set of key/value label pairs to assign to the function. Label keys must follow the requirements at https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements.
     * 
     */
    @Import(name="labels")
    private @Nullable Output<Map<String,Object>> labels;

    /**
     * @return A set of key/value label pairs to assign to the function. Label keys must follow the requirements at https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements.
     * 
     */
    public Optional<Output<Map<String,Object>>> labels() {
        return Optional.ofNullable(this.labels);
    }

    /**
     * The limit on the maximum number of function instances that may coexist at a given time.
     * 
     */
    @Import(name="maxInstances")
    private @Nullable Output<Integer> maxInstances;

    /**
     * @return The limit on the maximum number of function instances that may coexist at a given time.
     * 
     */
    public Optional<Output<Integer>> maxInstances() {
        return Optional.ofNullable(this.maxInstances);
    }

    /**
     * The limit on the minimum number of function instances that may coexist at a given time.
     * 
     */
    @Import(name="minInstances")
    private @Nullable Output<Integer> minInstances;

    /**
     * @return The limit on the minimum number of function instances that may coexist at a given time.
     * 
     */
    public Optional<Output<Integer>> minInstances() {
        return Optional.ofNullable(this.minInstances);
    }

    /**
     * A user-defined name of the function. Function names must be unique globally.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A user-defined name of the function. Function names must be unique globally.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Project of the function. If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return Project of the function. If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    /**
     * Region of function. If it is not provided, the provider region is used.
     * 
     */
    @Import(name="region")
    private @Nullable Output<String> region;

    /**
     * @return Region of function. If it is not provided, the provider region is used.
     * 
     */
    public Optional<Output<String>> region() {
        return Optional.ofNullable(this.region);
    }

    /**
     * The runtime in which the function is going to run.
     * Eg. `&#34;nodejs10&#34;`, `&#34;nodejs12&#34;`, `&#34;nodejs14&#34;`, `&#34;python37&#34;`, `&#34;python38&#34;`, `&#34;python39&#34;`, `&#34;dotnet3&#34;`, `&#34;go113&#34;`, `&#34;java11&#34;`, `&#34;ruby27&#34;`, etc. Check the [official doc](https://cloud.google.com/functions/docs/concepts/exec#runtimes) for the up-to-date list.
     * 
     */
    @Import(name="runtime", required=true)
    private Output<String> runtime;

    /**
     * @return The runtime in which the function is going to run.
     * Eg. `&#34;nodejs10&#34;`, `&#34;nodejs12&#34;`, `&#34;nodejs14&#34;`, `&#34;python37&#34;`, `&#34;python38&#34;`, `&#34;python39&#34;`, `&#34;dotnet3&#34;`, `&#34;go113&#34;`, `&#34;java11&#34;`, `&#34;ruby27&#34;`, etc. Check the [official doc](https://cloud.google.com/functions/docs/concepts/exec#runtimes) for the up-to-date list.
     * 
     */
    public Output<String> runtime() {
        return this.runtime;
    }

    /**
     * If provided, the self-provided service account to run the function with.
     * 
     */
    @Import(name="serviceAccountEmail")
    private @Nullable Output<String> serviceAccountEmail;

    /**
     * @return If provided, the self-provided service account to run the function with.
     * 
     */
    public Optional<Output<String>> serviceAccountEmail() {
        return Optional.ofNullable(this.serviceAccountEmail);
    }

    /**
     * The GCS bucket containing the zip archive which contains the function.
     * 
     */
    @Import(name="sourceArchiveBucket")
    private @Nullable Output<String> sourceArchiveBucket;

    /**
     * @return The GCS bucket containing the zip archive which contains the function.
     * 
     */
    public Optional<Output<String>> sourceArchiveBucket() {
        return Optional.ofNullable(this.sourceArchiveBucket);
    }

    /**
     * The source archive object (file) in archive bucket.
     * 
     */
    @Import(name="sourceArchiveObject")
    private @Nullable Output<String> sourceArchiveObject;

    /**
     * @return The source archive object (file) in archive bucket.
     * 
     */
    public Optional<Output<String>> sourceArchiveObject() {
        return Optional.ofNullable(this.sourceArchiveObject);
    }

    /**
     * Represents parameters related to source repository where a function is hosted.
     * Cannot be set alongside `source_archive_bucket` or `source_archive_object`. Structure is documented below.
     * 
     */
    @Import(name="sourceRepository")
    private @Nullable Output<FunctionSourceRepositoryArgs> sourceRepository;

    /**
     * @return Represents parameters related to source repository where a function is hosted.
     * Cannot be set alongside `source_archive_bucket` or `source_archive_object`. Structure is documented below.
     * 
     */
    public Optional<Output<FunctionSourceRepositoryArgs>> sourceRepository() {
        return Optional.ofNullable(this.sourceRepository);
    }

    /**
     * Timeout (in seconds) for the function. Default value is 60 seconds. Cannot be more than 540 seconds.
     * 
     */
    @Import(name="timeout")
    private @Nullable Output<Integer> timeout;

    /**
     * @return Timeout (in seconds) for the function. Default value is 60 seconds. Cannot be more than 540 seconds.
     * 
     */
    public Optional<Output<Integer>> timeout() {
        return Optional.ofNullable(this.timeout);
    }

    /**
     * Boolean variable. Any HTTP request (of a supported type) to the endpoint will trigger function execution. Supported HTTP request types are: POST, PUT, GET, DELETE, and OPTIONS. Endpoint is returned as `https_trigger_url`. Cannot be used with `event_trigger`.
     * 
     */
    @Import(name="triggerHttp")
    private @Nullable Output<Boolean> triggerHttp;

    /**
     * @return Boolean variable. Any HTTP request (of a supported type) to the endpoint will trigger function execution. Supported HTTP request types are: POST, PUT, GET, DELETE, and OPTIONS. Endpoint is returned as `https_trigger_url`. Cannot be used with `event_trigger`.
     * 
     */
    public Optional<Output<Boolean>> triggerHttp() {
        return Optional.ofNullable(this.triggerHttp);
    }

    /**
     * The VPC Network Connector that this cloud function can connect to. It should be set up as fully-qualified URI. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    @Import(name="vpcConnector")
    private @Nullable Output<String> vpcConnector;

    /**
     * @return The VPC Network Connector that this cloud function can connect to. It should be set up as fully-qualified URI. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*`.
     * 
     */
    public Optional<Output<String>> vpcConnector() {
        return Optional.ofNullable(this.vpcConnector);
    }

    /**
     * The egress settings for the connector, controlling what traffic is diverted through it. Allowed values are `ALL_TRAFFIC` and `PRIVATE_RANGES_ONLY`. Defaults to `PRIVATE_RANGES_ONLY`. If unset, this field preserves the previously set value.
     * 
     */
    @Import(name="vpcConnectorEgressSettings")
    private @Nullable Output<String> vpcConnectorEgressSettings;

    /**
     * @return The egress settings for the connector, controlling what traffic is diverted through it. Allowed values are `ALL_TRAFFIC` and `PRIVATE_RANGES_ONLY`. Defaults to `PRIVATE_RANGES_ONLY`. If unset, this field preserves the previously set value.
     * 
     */
    public Optional<Output<String>> vpcConnectorEgressSettings() {
        return Optional.ofNullable(this.vpcConnectorEgressSettings);
    }

    private FunctionArgs() {}

    private FunctionArgs(FunctionArgs $) {
        this.availableMemoryMb = $.availableMemoryMb;
        this.buildEnvironmentVariables = $.buildEnvironmentVariables;
        this.description = $.description;
        this.entryPoint = $.entryPoint;
        this.environmentVariables = $.environmentVariables;
        this.eventTrigger = $.eventTrigger;
        this.httpsTriggerUrl = $.httpsTriggerUrl;
        this.ingressSettings = $.ingressSettings;
        this.labels = $.labels;
        this.maxInstances = $.maxInstances;
        this.minInstances = $.minInstances;
        this.name = $.name;
        this.project = $.project;
        this.region = $.region;
        this.runtime = $.runtime;
        this.serviceAccountEmail = $.serviceAccountEmail;
        this.sourceArchiveBucket = $.sourceArchiveBucket;
        this.sourceArchiveObject = $.sourceArchiveObject;
        this.sourceRepository = $.sourceRepository;
        this.timeout = $.timeout;
        this.triggerHttp = $.triggerHttp;
        this.vpcConnector = $.vpcConnector;
        this.vpcConnectorEgressSettings = $.vpcConnectorEgressSettings;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FunctionArgs $;

        public Builder() {
            $ = new FunctionArgs();
        }

        public Builder(FunctionArgs defaults) {
            $ = new FunctionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param availableMemoryMb Memory (in MB), available to the function. Default value is `256`. Possible values include `128`, `256`, `512`, `1024`, etc.
         * 
         * @return builder
         * 
         */
        public Builder availableMemoryMb(@Nullable Output<Integer> availableMemoryMb) {
            $.availableMemoryMb = availableMemoryMb;
            return this;
        }

        /**
         * @param availableMemoryMb Memory (in MB), available to the function. Default value is `256`. Possible values include `128`, `256`, `512`, `1024`, etc.
         * 
         * @return builder
         * 
         */
        public Builder availableMemoryMb(Integer availableMemoryMb) {
            return availableMemoryMb(Output.of(availableMemoryMb));
        }

        /**
         * @param buildEnvironmentVariables A set of key/value environment variable pairs available during build time.
         * 
         * @return builder
         * 
         */
        public Builder buildEnvironmentVariables(@Nullable Output<Map<String,Object>> buildEnvironmentVariables) {
            $.buildEnvironmentVariables = buildEnvironmentVariables;
            return this;
        }

        /**
         * @param buildEnvironmentVariables A set of key/value environment variable pairs available during build time.
         * 
         * @return builder
         * 
         */
        public Builder buildEnvironmentVariables(Map<String,Object> buildEnvironmentVariables) {
            return buildEnvironmentVariables(Output.of(buildEnvironmentVariables));
        }

        /**
         * @param description Description of the function.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the function.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param entryPoint Name of the function that will be executed when the Google Cloud Function is triggered.
         * 
         * @return builder
         * 
         */
        public Builder entryPoint(@Nullable Output<String> entryPoint) {
            $.entryPoint = entryPoint;
            return this;
        }

        /**
         * @param entryPoint Name of the function that will be executed when the Google Cloud Function is triggered.
         * 
         * @return builder
         * 
         */
        public Builder entryPoint(String entryPoint) {
            return entryPoint(Output.of(entryPoint));
        }

        /**
         * @param environmentVariables A set of key/value environment variable pairs to assign to the function.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(@Nullable Output<Map<String,Object>> environmentVariables) {
            $.environmentVariables = environmentVariables;
            return this;
        }

        /**
         * @param environmentVariables A set of key/value environment variable pairs to assign to the function.
         * 
         * @return builder
         * 
         */
        public Builder environmentVariables(Map<String,Object> environmentVariables) {
            return environmentVariables(Output.of(environmentVariables));
        }

        /**
         * @param eventTrigger A source that fires events in response to a condition in another service. Structure is documented below. Cannot be used with `trigger_http`.
         * 
         * @return builder
         * 
         */
        public Builder eventTrigger(@Nullable Output<FunctionEventTriggerArgs> eventTrigger) {
            $.eventTrigger = eventTrigger;
            return this;
        }

        /**
         * @param eventTrigger A source that fires events in response to a condition in another service. Structure is documented below. Cannot be used with `trigger_http`.
         * 
         * @return builder
         * 
         */
        public Builder eventTrigger(FunctionEventTriggerArgs eventTrigger) {
            return eventTrigger(Output.of(eventTrigger));
        }

        /**
         * @param httpsTriggerUrl URL which triggers function execution. Returned only if `trigger_http` is used.
         * 
         * @return builder
         * 
         */
        public Builder httpsTriggerUrl(@Nullable Output<String> httpsTriggerUrl) {
            $.httpsTriggerUrl = httpsTriggerUrl;
            return this;
        }

        /**
         * @param httpsTriggerUrl URL which triggers function execution. Returned only if `trigger_http` is used.
         * 
         * @return builder
         * 
         */
        public Builder httpsTriggerUrl(String httpsTriggerUrl) {
            return httpsTriggerUrl(Output.of(httpsTriggerUrl));
        }

        /**
         * @param ingressSettings String value that controls what traffic can reach the function. Allowed values are `ALLOW_ALL`, `ALLOW_INTERNAL_AND_GCLB` and `ALLOW_INTERNAL_ONLY`. Check [ingress documentation](https://cloud.google.com/functions/docs/networking/network-settings#ingress_settings) to see the impact of each settings value. Changes to this field will recreate the cloud function.
         * 
         * @return builder
         * 
         */
        public Builder ingressSettings(@Nullable Output<String> ingressSettings) {
            $.ingressSettings = ingressSettings;
            return this;
        }

        /**
         * @param ingressSettings String value that controls what traffic can reach the function. Allowed values are `ALLOW_ALL`, `ALLOW_INTERNAL_AND_GCLB` and `ALLOW_INTERNAL_ONLY`. Check [ingress documentation](https://cloud.google.com/functions/docs/networking/network-settings#ingress_settings) to see the impact of each settings value. Changes to this field will recreate the cloud function.
         * 
         * @return builder
         * 
         */
        public Builder ingressSettings(String ingressSettings) {
            return ingressSettings(Output.of(ingressSettings));
        }

        /**
         * @param labels A set of key/value label pairs to assign to the function. Label keys must follow the requirements at https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements.
         * 
         * @return builder
         * 
         */
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            $.labels = labels;
            return this;
        }

        /**
         * @param labels A set of key/value label pairs to assign to the function. Label keys must follow the requirements at https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements.
         * 
         * @return builder
         * 
         */
        public Builder labels(Map<String,Object> labels) {
            return labels(Output.of(labels));
        }

        /**
         * @param maxInstances The limit on the maximum number of function instances that may coexist at a given time.
         * 
         * @return builder
         * 
         */
        public Builder maxInstances(@Nullable Output<Integer> maxInstances) {
            $.maxInstances = maxInstances;
            return this;
        }

        /**
         * @param maxInstances The limit on the maximum number of function instances that may coexist at a given time.
         * 
         * @return builder
         * 
         */
        public Builder maxInstances(Integer maxInstances) {
            return maxInstances(Output.of(maxInstances));
        }

        /**
         * @param minInstances The limit on the minimum number of function instances that may coexist at a given time.
         * 
         * @return builder
         * 
         */
        public Builder minInstances(@Nullable Output<Integer> minInstances) {
            $.minInstances = minInstances;
            return this;
        }

        /**
         * @param minInstances The limit on the minimum number of function instances that may coexist at a given time.
         * 
         * @return builder
         * 
         */
        public Builder minInstances(Integer minInstances) {
            return minInstances(Output.of(minInstances));
        }

        /**
         * @param name A user-defined name of the function. Function names must be unique globally.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A user-defined name of the function. Function names must be unique globally.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param project Project of the function. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project Project of the function. If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        /**
         * @param region Region of function. If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(@Nullable Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region Region of function. If it is not provided, the provider region is used.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param runtime The runtime in which the function is going to run.
         * Eg. `&#34;nodejs10&#34;`, `&#34;nodejs12&#34;`, `&#34;nodejs14&#34;`, `&#34;python37&#34;`, `&#34;python38&#34;`, `&#34;python39&#34;`, `&#34;dotnet3&#34;`, `&#34;go113&#34;`, `&#34;java11&#34;`, `&#34;ruby27&#34;`, etc. Check the [official doc](https://cloud.google.com/functions/docs/concepts/exec#runtimes) for the up-to-date list.
         * 
         * @return builder
         * 
         */
        public Builder runtime(Output<String> runtime) {
            $.runtime = runtime;
            return this;
        }

        /**
         * @param runtime The runtime in which the function is going to run.
         * Eg. `&#34;nodejs10&#34;`, `&#34;nodejs12&#34;`, `&#34;nodejs14&#34;`, `&#34;python37&#34;`, `&#34;python38&#34;`, `&#34;python39&#34;`, `&#34;dotnet3&#34;`, `&#34;go113&#34;`, `&#34;java11&#34;`, `&#34;ruby27&#34;`, etc. Check the [official doc](https://cloud.google.com/functions/docs/concepts/exec#runtimes) for the up-to-date list.
         * 
         * @return builder
         * 
         */
        public Builder runtime(String runtime) {
            return runtime(Output.of(runtime));
        }

        /**
         * @param serviceAccountEmail If provided, the self-provided service account to run the function with.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(@Nullable Output<String> serviceAccountEmail) {
            $.serviceAccountEmail = serviceAccountEmail;
            return this;
        }

        /**
         * @param serviceAccountEmail If provided, the self-provided service account to run the function with.
         * 
         * @return builder
         * 
         */
        public Builder serviceAccountEmail(String serviceAccountEmail) {
            return serviceAccountEmail(Output.of(serviceAccountEmail));
        }

        /**
         * @param sourceArchiveBucket The GCS bucket containing the zip archive which contains the function.
         * 
         * @return builder
         * 
         */
        public Builder sourceArchiveBucket(@Nullable Output<String> sourceArchiveBucket) {
            $.sourceArchiveBucket = sourceArchiveBucket;
            return this;
        }

        /**
         * @param sourceArchiveBucket The GCS bucket containing the zip archive which contains the function.
         * 
         * @return builder
         * 
         */
        public Builder sourceArchiveBucket(String sourceArchiveBucket) {
            return sourceArchiveBucket(Output.of(sourceArchiveBucket));
        }

        /**
         * @param sourceArchiveObject The source archive object (file) in archive bucket.
         * 
         * @return builder
         * 
         */
        public Builder sourceArchiveObject(@Nullable Output<String> sourceArchiveObject) {
            $.sourceArchiveObject = sourceArchiveObject;
            return this;
        }

        /**
         * @param sourceArchiveObject The source archive object (file) in archive bucket.
         * 
         * @return builder
         * 
         */
        public Builder sourceArchiveObject(String sourceArchiveObject) {
            return sourceArchiveObject(Output.of(sourceArchiveObject));
        }

        /**
         * @param sourceRepository Represents parameters related to source repository where a function is hosted.
         * Cannot be set alongside `source_archive_bucket` or `source_archive_object`. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sourceRepository(@Nullable Output<FunctionSourceRepositoryArgs> sourceRepository) {
            $.sourceRepository = sourceRepository;
            return this;
        }

        /**
         * @param sourceRepository Represents parameters related to source repository where a function is hosted.
         * Cannot be set alongside `source_archive_bucket` or `source_archive_object`. Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sourceRepository(FunctionSourceRepositoryArgs sourceRepository) {
            return sourceRepository(Output.of(sourceRepository));
        }

        /**
         * @param timeout Timeout (in seconds) for the function. Default value is 60 seconds. Cannot be more than 540 seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(@Nullable Output<Integer> timeout) {
            $.timeout = timeout;
            return this;
        }

        /**
         * @param timeout Timeout (in seconds) for the function. Default value is 60 seconds. Cannot be more than 540 seconds.
         * 
         * @return builder
         * 
         */
        public Builder timeout(Integer timeout) {
            return timeout(Output.of(timeout));
        }

        /**
         * @param triggerHttp Boolean variable. Any HTTP request (of a supported type) to the endpoint will trigger function execution. Supported HTTP request types are: POST, PUT, GET, DELETE, and OPTIONS. Endpoint is returned as `https_trigger_url`. Cannot be used with `event_trigger`.
         * 
         * @return builder
         * 
         */
        public Builder triggerHttp(@Nullable Output<Boolean> triggerHttp) {
            $.triggerHttp = triggerHttp;
            return this;
        }

        /**
         * @param triggerHttp Boolean variable. Any HTTP request (of a supported type) to the endpoint will trigger function execution. Supported HTTP request types are: POST, PUT, GET, DELETE, and OPTIONS. Endpoint is returned as `https_trigger_url`. Cannot be used with `event_trigger`.
         * 
         * @return builder
         * 
         */
        public Builder triggerHttp(Boolean triggerHttp) {
            return triggerHttp(Output.of(triggerHttp));
        }

        /**
         * @param vpcConnector The VPC Network Connector that this cloud function can connect to. It should be set up as fully-qualified URI. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*`.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnector(@Nullable Output<String> vpcConnector) {
            $.vpcConnector = vpcConnector;
            return this;
        }

        /**
         * @param vpcConnector The VPC Network Connector that this cloud function can connect to. It should be set up as fully-qualified URI. The format of this field is `projects/*{@literal /}locations/*{@literal /}connectors/*`.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnector(String vpcConnector) {
            return vpcConnector(Output.of(vpcConnector));
        }

        /**
         * @param vpcConnectorEgressSettings The egress settings for the connector, controlling what traffic is diverted through it. Allowed values are `ALL_TRAFFIC` and `PRIVATE_RANGES_ONLY`. Defaults to `PRIVATE_RANGES_ONLY`. If unset, this field preserves the previously set value.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnectorEgressSettings(@Nullable Output<String> vpcConnectorEgressSettings) {
            $.vpcConnectorEgressSettings = vpcConnectorEgressSettings;
            return this;
        }

        /**
         * @param vpcConnectorEgressSettings The egress settings for the connector, controlling what traffic is diverted through it. Allowed values are `ALL_TRAFFIC` and `PRIVATE_RANGES_ONLY`. Defaults to `PRIVATE_RANGES_ONLY`. If unset, this field preserves the previously set value.
         * 
         * @return builder
         * 
         */
        public Builder vpcConnectorEgressSettings(String vpcConnectorEgressSettings) {
            return vpcConnectorEgressSettings(Output.of(vpcConnectorEgressSettings));
        }

        public FunctionArgs build() {
            $.runtime = Objects.requireNonNull($.runtime, "expected parameter 'runtime' to be non-null");
            return $;
        }
    }

}
