// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.eventgrid.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Information about the azure function destination for an event subscription.
 * 
 */
public final class AzureFunctionEventSubscriptionDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final AzureFunctionEventSubscriptionDestinationArgs Empty = new AzureFunctionEventSubscriptionDestinationArgs();

    /**
     * Type of the endpoint for the event subscription destination.
     * Expected value is 'AzureFunction'.
     * 
     */
    @Import(name="endpointType", required=true)
      private final Output<String> endpointType;

    public Output<String> endpointType() {
        return this.endpointType;
    }

    /**
     * Maximum number of events per batch.
     * 
     */
    @Import(name="maxEventsPerBatch")
      private final @Nullable Output<Integer> maxEventsPerBatch;

    public Output<Integer> maxEventsPerBatch() {
        return this.maxEventsPerBatch == null ? Codegen.empty() : this.maxEventsPerBatch;
    }

    /**
     * Preferred batch size in Kilobytes.
     * 
     */
    @Import(name="preferredBatchSizeInKilobytes")
      private final @Nullable Output<Integer> preferredBatchSizeInKilobytes;

    public Output<Integer> preferredBatchSizeInKilobytes() {
        return this.preferredBatchSizeInKilobytes == null ? Codegen.empty() : this.preferredBatchSizeInKilobytes;
    }

    /**
     * The Azure Resource Id that represents the endpoint of the Azure Function destination of an event subscription.
     * 
     */
    @Import(name="resourceId")
      private final @Nullable Output<String> resourceId;

    public Output<String> resourceId() {
        return this.resourceId == null ? Codegen.empty() : this.resourceId;
    }

    public AzureFunctionEventSubscriptionDestinationArgs(
        Output<String> endpointType,
        @Nullable Output<Integer> maxEventsPerBatch,
        @Nullable Output<Integer> preferredBatchSizeInKilobytes,
        @Nullable Output<String> resourceId) {
        this.endpointType = Codegen.stringProp("endpointType").output().arg(endpointType).require();
        this.maxEventsPerBatch = Codegen.integerProp("maxEventsPerBatch").output().arg(maxEventsPerBatch).def(1).getNullable();
        this.preferredBatchSizeInKilobytes = Codegen.integerProp("preferredBatchSizeInKilobytes").output().arg(preferredBatchSizeInKilobytes).def(64).getNullable();
        this.resourceId = resourceId;
    }

    private AzureFunctionEventSubscriptionDestinationArgs() {
        this.endpointType = Codegen.empty();
        this.maxEventsPerBatch = Codegen.empty();
        this.preferredBatchSizeInKilobytes = Codegen.empty();
        this.resourceId = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureFunctionEventSubscriptionDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> endpointType;
        private @Nullable Output<Integer> maxEventsPerBatch;
        private @Nullable Output<Integer> preferredBatchSizeInKilobytes;
        private @Nullable Output<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureFunctionEventSubscriptionDestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endpointType = defaults.endpointType;
    	      this.maxEventsPerBatch = defaults.maxEventsPerBatch;
    	      this.preferredBatchSizeInKilobytes = defaults.preferredBatchSizeInKilobytes;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder endpointType(Output<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder endpointType(String endpointType) {
            this.endpointType = Output.of(Objects.requireNonNull(endpointType));
            return this;
        }
        public Builder maxEventsPerBatch(@Nullable Output<Integer> maxEventsPerBatch) {
            this.maxEventsPerBatch = maxEventsPerBatch;
            return this;
        }
        public Builder maxEventsPerBatch(@Nullable Integer maxEventsPerBatch) {
            this.maxEventsPerBatch = Codegen.ofNullable(maxEventsPerBatch);
            return this;
        }
        public Builder preferredBatchSizeInKilobytes(@Nullable Output<Integer> preferredBatchSizeInKilobytes) {
            this.preferredBatchSizeInKilobytes = preferredBatchSizeInKilobytes;
            return this;
        }
        public Builder preferredBatchSizeInKilobytes(@Nullable Integer preferredBatchSizeInKilobytes) {
            this.preferredBatchSizeInKilobytes = Codegen.ofNullable(preferredBatchSizeInKilobytes);
            return this;
        }
        public Builder resourceId(@Nullable Output<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public Builder resourceId(@Nullable String resourceId) {
            this.resourceId = Codegen.ofNullable(resourceId);
            return this;
        }        public AzureFunctionEventSubscriptionDestinationArgs build() {
            return new AzureFunctionEventSubscriptionDestinationArgs(endpointType, maxEventsPerBatch, preferredBatchSizeInKilobytes, resourceId);
        }
    }
}
