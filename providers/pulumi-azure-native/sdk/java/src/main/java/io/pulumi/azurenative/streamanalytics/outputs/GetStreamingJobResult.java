// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.azurenative.streamanalytics.outputs.FunctionResponse;
import io.pulumi.azurenative.streamanalytics.outputs.InputResponse;
import io.pulumi.azurenative.streamanalytics.outputs.OutputResponse;
import io.pulumi.azurenative.streamanalytics.outputs.SkuResponse;
import io.pulumi.azurenative.streamanalytics.outputs.TransformationResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetStreamingJobResult {
    /**
     * Controls certain runtime behaviors of the streaming job.
     * 
     */
    private final @Nullable String compatibilityLevel;
    /**
     * Value is an ISO-8601 formatted UTC timestamp indicating when the streaming job was created.
     * 
     */
    private final String createdDate;
    /**
     * The data locale of the stream analytics job. Value should be the name of a supported .NET Culture from the set https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx. Defaults to 'en-US' if none specified.
     * 
     */
    private final @Nullable String dataLocale;
    /**
     * The current entity tag for the streaming job. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
     */
    private final String etag;
    /**
     * The maximum tolerable delay in seconds where events arriving late could be included.  Supported range is -1 to 1814399 (20.23:59:59 days) and -1 is used to specify wait indefinitely. If the property is absent, it is interpreted to have a value of -1.
     * 
     */
    private final @Nullable Integer eventsLateArrivalMaxDelayInSeconds;
    /**
     * The maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order.
     * 
     */
    private final @Nullable Integer eventsOutOfOrderMaxDelayInSeconds;
    /**
     * Indicates the policy to apply to events that arrive out of order in the input event stream.
     * 
     */
    private final @Nullable String eventsOutOfOrderPolicy;
    /**
     * A list of one or more functions for the streaming job. The name property for each function is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     * 
     */
    private final @Nullable List<FunctionResponse> functions;
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * A list of one or more inputs to the streaming job. The name property for each input is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual input.
     * 
     */
    private final @Nullable List<InputResponse> inputs;
    /**
     * A GUID uniquely identifying the streaming job. This GUID is generated upon creation of the streaming job.
     * 
     */
    private final String jobId;
    /**
     * Describes the state of the streaming job.
     * 
     */
    private final String jobState;
    /**
     * Value is either an ISO-8601 formatted timestamp indicating the last output event time of the streaming job or null indicating that output has not yet been produced. In case of multiple outputs or multiple streams, this shows the latest value in that set.
     * 
     */
    private final String lastOutputEventTime;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final @Nullable String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Indicates the policy to apply to events that arrive at the output and cannot be written to the external storage due to being malformed (missing column values, column values of wrong type or size).
     * 
     */
    private final @Nullable String outputErrorPolicy;
    /**
     * This property should only be utilized when it is desired that the job be started immediately upon creation. Value may be JobStartTime, CustomTime, or LastOutputEventTime to indicate whether the starting point of the output event stream should start whenever the job is started, start at a custom user time stamp specified via the outputStartTime property, or start from the last event output time.
     * 
     */
    private final @Nullable String outputStartMode;
    /**
     * Value is either an ISO-8601 formatted time stamp that indicates the starting point of the output event stream, or null to indicate that the output event stream will start whenever the streaming job is started. This property must have a value if outputStartMode is set to CustomTime.
     * 
     */
    private final @Nullable String outputStartTime;
    /**
     * A list of one or more outputs for the streaming job. The name property for each output is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual output.
     * 
     */
    private final @Nullable List<OutputResponse> outputs;
    /**
     * Describes the provisioning status of the streaming job.
     * 
     */
    private final String provisioningState;
    /**
     * Describes the SKU of the streaming job. Required on PUT (CreateOrReplace) requests.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Indicates the query and the number of streaming units to use for the streaming job. The name property of the transformation is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     * 
     */
    private final @Nullable TransformationResponse transformation;
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"compatibilityLevel","createdDate","dataLocale","etag","eventsLateArrivalMaxDelayInSeconds","eventsOutOfOrderMaxDelayInSeconds","eventsOutOfOrderPolicy","functions","id","inputs","jobId","jobState","lastOutputEventTime","location","name","outputErrorPolicy","outputStartMode","outputStartTime","outputs","provisioningState","sku","tags","transformation","type"})
    private GetStreamingJobResult(
        @Nullable String compatibilityLevel,
        String createdDate,
        @Nullable String dataLocale,
        String etag,
        @Nullable Integer eventsLateArrivalMaxDelayInSeconds,
        @Nullable Integer eventsOutOfOrderMaxDelayInSeconds,
        @Nullable String eventsOutOfOrderPolicy,
        @Nullable List<FunctionResponse> functions,
        String id,
        @Nullable List<InputResponse> inputs,
        String jobId,
        String jobState,
        String lastOutputEventTime,
        @Nullable String location,
        String name,
        @Nullable String outputErrorPolicy,
        @Nullable String outputStartMode,
        @Nullable String outputStartTime,
        @Nullable List<OutputResponse> outputs,
        String provisioningState,
        @Nullable SkuResponse sku,
        @Nullable Map<String,String> tags,
        @Nullable TransformationResponse transformation,
        String type) {
        this.compatibilityLevel = compatibilityLevel;
        this.createdDate = Objects.requireNonNull(createdDate);
        this.dataLocale = dataLocale;
        this.etag = Objects.requireNonNull(etag);
        this.eventsLateArrivalMaxDelayInSeconds = eventsLateArrivalMaxDelayInSeconds;
        this.eventsOutOfOrderMaxDelayInSeconds = eventsOutOfOrderMaxDelayInSeconds;
        this.eventsOutOfOrderPolicy = eventsOutOfOrderPolicy;
        this.functions = functions;
        this.id = Objects.requireNonNull(id);
        this.inputs = inputs;
        this.jobId = Objects.requireNonNull(jobId);
        this.jobState = Objects.requireNonNull(jobState);
        this.lastOutputEventTime = Objects.requireNonNull(lastOutputEventTime);
        this.location = location;
        this.name = Objects.requireNonNull(name);
        this.outputErrorPolicy = outputErrorPolicy;
        this.outputStartMode = outputStartMode;
        this.outputStartTime = outputStartTime;
        this.outputs = outputs;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.sku = sku;
        this.tags = tags;
        this.transformation = transformation;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * Controls certain runtime behaviors of the streaming job.
     * 
    */
    public Optional<String> getCompatibilityLevel() {
        return Optional.ofNullable(this.compatibilityLevel);
    }
    /**
     * Value is an ISO-8601 formatted UTC timestamp indicating when the streaming job was created.
     * 
    */
    public String getCreatedDate() {
        return this.createdDate;
    }
    /**
     * The data locale of the stream analytics job. Value should be the name of a supported .NET Culture from the set https://msdn.microsoft.com/en-us/library/system.globalization.culturetypes(v=vs.110).aspx. Defaults to 'en-US' if none specified.
     * 
    */
    public Optional<String> getDataLocale() {
        return Optional.ofNullable(this.dataLocale);
    }
    /**
     * The current entity tag for the streaming job. This is an opaque string. You can use it to detect whether the resource has changed between requests. You can also use it in the If-Match or If-None-Match headers for write operations for optimistic concurrency.
     * 
    */
    public String getEtag() {
        return this.etag;
    }
    /**
     * The maximum tolerable delay in seconds where events arriving late could be included.  Supported range is -1 to 1814399 (20.23:59:59 days) and -1 is used to specify wait indefinitely. If the property is absent, it is interpreted to have a value of -1.
     * 
    */
    public Optional<Integer> getEventsLateArrivalMaxDelayInSeconds() {
        return Optional.ofNullable(this.eventsLateArrivalMaxDelayInSeconds);
    }
    /**
     * The maximum tolerable delay in seconds where out-of-order events can be adjusted to be back in order.
     * 
    */
    public Optional<Integer> getEventsOutOfOrderMaxDelayInSeconds() {
        return Optional.ofNullable(this.eventsOutOfOrderMaxDelayInSeconds);
    }
    /**
     * Indicates the policy to apply to events that arrive out of order in the input event stream.
     * 
    */
    public Optional<String> getEventsOutOfOrderPolicy() {
        return Optional.ofNullable(this.eventsOutOfOrderPolicy);
    }
    /**
     * A list of one or more functions for the streaming job. The name property for each function is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     * 
    */
    public List<FunctionResponse> getFunctions() {
        return this.functions == null ? List.of() : this.functions;
    }
    /**
     * Fully qualified resource Id for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * A list of one or more inputs to the streaming job. The name property for each input is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual input.
     * 
    */
    public List<InputResponse> getInputs() {
        return this.inputs == null ? List.of() : this.inputs;
    }
    /**
     * A GUID uniquely identifying the streaming job. This GUID is generated upon creation of the streaming job.
     * 
    */
    public String getJobId() {
        return this.jobId;
    }
    /**
     * Describes the state of the streaming job.
     * 
    */
    public String getJobState() {
        return this.jobState;
    }
    /**
     * Value is either an ISO-8601 formatted timestamp indicating the last output event time of the streaming job or null indicating that output has not yet been produced. In case of multiple outputs or multiple streams, this shows the latest value in that set.
     * 
    */
    public String getLastOutputEventTime() {
        return this.lastOutputEventTime;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Indicates the policy to apply to events that arrive at the output and cannot be written to the external storage due to being malformed (missing column values, column values of wrong type or size).
     * 
    */
    public Optional<String> getOutputErrorPolicy() {
        return Optional.ofNullable(this.outputErrorPolicy);
    }
    /**
     * This property should only be utilized when it is desired that the job be started immediately upon creation. Value may be JobStartTime, CustomTime, or LastOutputEventTime to indicate whether the starting point of the output event stream should start whenever the job is started, start at a custom user time stamp specified via the outputStartTime property, or start from the last event output time.
     * 
    */
    public Optional<String> getOutputStartMode() {
        return Optional.ofNullable(this.outputStartMode);
    }
    /**
     * Value is either an ISO-8601 formatted time stamp that indicates the starting point of the output event stream, or null to indicate that the output event stream will start whenever the streaming job is started. This property must have a value if outputStartMode is set to CustomTime.
     * 
    */
    public Optional<String> getOutputStartTime() {
        return Optional.ofNullable(this.outputStartTime);
    }
    /**
     * A list of one or more outputs for the streaming job. The name property for each output is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual output.
     * 
    */
    public List<OutputResponse> getOutputs() {
        return this.outputs == null ? List.of() : this.outputs;
    }
    /**
     * Describes the provisioning status of the streaming job.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Describes the SKU of the streaming job. Required on PUT (CreateOrReplace) requests.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Indicates the query and the number of streaming units to use for the streaming job. The name property of the transformation is required when specifying this property in a PUT request. This property cannot be modify via a PATCH operation. You must use the PATCH API available for the individual transformation.
     * 
    */
    public Optional<TransformationResponse> getTransformation() {
        return Optional.ofNullable(this.transformation);
    }
    /**
     * The type of the resource. Ex- Microsoft.Compute/virtualMachines or Microsoft.Storage/storageAccounts.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStreamingJobResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String compatibilityLevel;
        private String createdDate;
        private @Nullable String dataLocale;
        private String etag;
        private @Nullable Integer eventsLateArrivalMaxDelayInSeconds;
        private @Nullable Integer eventsOutOfOrderMaxDelayInSeconds;
        private @Nullable String eventsOutOfOrderPolicy;
        private @Nullable List<FunctionResponse> functions;
        private String id;
        private @Nullable List<InputResponse> inputs;
        private String jobId;
        private String jobState;
        private String lastOutputEventTime;
        private @Nullable String location;
        private String name;
        private @Nullable String outputErrorPolicy;
        private @Nullable String outputStartMode;
        private @Nullable String outputStartTime;
        private @Nullable List<OutputResponse> outputs;
        private String provisioningState;
        private @Nullable SkuResponse sku;
        private @Nullable Map<String,String> tags;
        private @Nullable TransformationResponse transformation;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStreamingJobResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compatibilityLevel = defaults.compatibilityLevel;
    	      this.createdDate = defaults.createdDate;
    	      this.dataLocale = defaults.dataLocale;
    	      this.etag = defaults.etag;
    	      this.eventsLateArrivalMaxDelayInSeconds = defaults.eventsLateArrivalMaxDelayInSeconds;
    	      this.eventsOutOfOrderMaxDelayInSeconds = defaults.eventsOutOfOrderMaxDelayInSeconds;
    	      this.eventsOutOfOrderPolicy = defaults.eventsOutOfOrderPolicy;
    	      this.functions = defaults.functions;
    	      this.id = defaults.id;
    	      this.inputs = defaults.inputs;
    	      this.jobId = defaults.jobId;
    	      this.jobState = defaults.jobState;
    	      this.lastOutputEventTime = defaults.lastOutputEventTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.outputErrorPolicy = defaults.outputErrorPolicy;
    	      this.outputStartMode = defaults.outputStartMode;
    	      this.outputStartTime = defaults.outputStartTime;
    	      this.outputs = defaults.outputs;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.transformation = defaults.transformation;
    	      this.type = defaults.type;
        }

        public Builder setCompatibilityLevel(@Nullable String compatibilityLevel) {
            this.compatibilityLevel = compatibilityLevel;
            return this;
        }

        public Builder setCreatedDate(String createdDate) {
            this.createdDate = Objects.requireNonNull(createdDate);
            return this;
        }

        public Builder setDataLocale(@Nullable String dataLocale) {
            this.dataLocale = dataLocale;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setEventsLateArrivalMaxDelayInSeconds(@Nullable Integer eventsLateArrivalMaxDelayInSeconds) {
            this.eventsLateArrivalMaxDelayInSeconds = eventsLateArrivalMaxDelayInSeconds;
            return this;
        }

        public Builder setEventsOutOfOrderMaxDelayInSeconds(@Nullable Integer eventsOutOfOrderMaxDelayInSeconds) {
            this.eventsOutOfOrderMaxDelayInSeconds = eventsOutOfOrderMaxDelayInSeconds;
            return this;
        }

        public Builder setEventsOutOfOrderPolicy(@Nullable String eventsOutOfOrderPolicy) {
            this.eventsOutOfOrderPolicy = eventsOutOfOrderPolicy;
            return this;
        }

        public Builder setFunctions(@Nullable List<FunctionResponse> functions) {
            this.functions = functions;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInputs(@Nullable List<InputResponse> inputs) {
            this.inputs = inputs;
            return this;
        }

        public Builder setJobId(String jobId) {
            this.jobId = Objects.requireNonNull(jobId);
            return this;
        }

        public Builder setJobState(String jobState) {
            this.jobState = Objects.requireNonNull(jobState);
            return this;
        }

        public Builder setLastOutputEventTime(String lastOutputEventTime) {
            this.lastOutputEventTime = Objects.requireNonNull(lastOutputEventTime);
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = location;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setOutputErrorPolicy(@Nullable String outputErrorPolicy) {
            this.outputErrorPolicy = outputErrorPolicy;
            return this;
        }

        public Builder setOutputStartMode(@Nullable String outputStartMode) {
            this.outputStartMode = outputStartMode;
            return this;
        }

        public Builder setOutputStartTime(@Nullable String outputStartTime) {
            this.outputStartTime = outputStartTime;
            return this;
        }

        public Builder setOutputs(@Nullable List<OutputResponse> outputs) {
            this.outputs = outputs;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTransformation(@Nullable TransformationResponse transformation) {
            this.transformation = transformation;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public GetStreamingJobResult build() {
            return new GetStreamingJobResult(compatibilityLevel, createdDate, dataLocale, etag, eventsLateArrivalMaxDelayInSeconds, eventsOutOfOrderMaxDelayInSeconds, eventsOutOfOrderPolicy, functions, id, inputs, jobId, jobState, lastOutputEventTime, location, name, outputErrorPolicy, outputStartMode, outputStartTime, outputs, provisioningState, sku, tags, transformation, type);
        }
    }
}