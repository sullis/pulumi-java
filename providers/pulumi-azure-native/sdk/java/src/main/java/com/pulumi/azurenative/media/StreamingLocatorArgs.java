// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.media;

import com.pulumi.azurenative.media.inputs.StreamingLocatorContentKeyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StreamingLocatorArgs extends com.pulumi.resources.ResourceArgs {

    public static final StreamingLocatorArgs Empty = new StreamingLocatorArgs();

    /**
     * The Media Services account name.
     * 
     */
    @Import(name="accountName", required=true)
    private Output<String> accountName;

    /**
     * @return The Media Services account name.
     * 
     */
    public Output<String> accountName() {
        return this.accountName;
    }

    /**
     * Alternative Media ID of this Streaming Locator
     * 
     */
    @Import(name="alternativeMediaId")
    private @Nullable Output<String> alternativeMediaId;

    /**
     * @return Alternative Media ID of this Streaming Locator
     * 
     */
    public Optional<Output<String>> alternativeMediaId() {
        return Optional.ofNullable(this.alternativeMediaId);
    }

    /**
     * Asset Name
     * 
     */
    @Import(name="assetName", required=true)
    private Output<String> assetName;

    /**
     * @return Asset Name
     * 
     */
    public Output<String> assetName() {
        return this.assetName;
    }

    /**
     * The ContentKeys used by this Streaming Locator.
     * 
     */
    @Import(name="contentKeys")
    private @Nullable Output<List<StreamingLocatorContentKeyArgs>> contentKeys;

    /**
     * @return The ContentKeys used by this Streaming Locator.
     * 
     */
    public Optional<Output<List<StreamingLocatorContentKeyArgs>>> contentKeys() {
        return Optional.ofNullable(this.contentKeys);
    }

    /**
     * Name of the default ContentKeyPolicy used by this Streaming Locator.
     * 
     */
    @Import(name="defaultContentKeyPolicyName")
    private @Nullable Output<String> defaultContentKeyPolicyName;

    /**
     * @return Name of the default ContentKeyPolicy used by this Streaming Locator.
     * 
     */
    public Optional<Output<String>> defaultContentKeyPolicyName() {
        return Optional.ofNullable(this.defaultContentKeyPolicyName);
    }

    /**
     * The end time of the Streaming Locator.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    /**
     * @return The end time of the Streaming Locator.
     * 
     */
    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * A list of asset or account filters which apply to this streaming locator
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<String>> filters;

    /**
     * @return A list of asset or account filters which apply to this streaming locator
     * 
     */
    public Optional<Output<List<String>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The name of the resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group within the Azure subscription.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The start time of the Streaming Locator.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    /**
     * @return The start time of the Streaming Locator.
     * 
     */
    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The StreamingLocatorId of the Streaming Locator.
     * 
     */
    @Import(name="streamingLocatorId")
    private @Nullable Output<String> streamingLocatorId;

    /**
     * @return The StreamingLocatorId of the Streaming Locator.
     * 
     */
    public Optional<Output<String>> streamingLocatorId() {
        return Optional.ofNullable(this.streamingLocatorId);
    }

    /**
     * The Streaming Locator name.
     * 
     */
    @Import(name="streamingLocatorName")
    private @Nullable Output<String> streamingLocatorName;

    /**
     * @return The Streaming Locator name.
     * 
     */
    public Optional<Output<String>> streamingLocatorName() {
        return Optional.ofNullable(this.streamingLocatorName);
    }

    /**
     * Name of the Streaming Policy used by this Streaming Locator. Either specify the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined Streaming Policies available are: &#39;Predefined_DownloadOnly&#39;, &#39;Predefined_ClearStreamingOnly&#39;, &#39;Predefined_DownloadAndClearStreaming&#39;, &#39;Predefined_ClearKey&#39;, &#39;Predefined_MultiDrmCencStreaming&#39; and &#39;Predefined_MultiDrmStreaming&#39;
     * 
     */
    @Import(name="streamingPolicyName", required=true)
    private Output<String> streamingPolicyName;

    /**
     * @return Name of the Streaming Policy used by this Streaming Locator. Either specify the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined Streaming Policies available are: &#39;Predefined_DownloadOnly&#39;, &#39;Predefined_ClearStreamingOnly&#39;, &#39;Predefined_DownloadAndClearStreaming&#39;, &#39;Predefined_ClearKey&#39;, &#39;Predefined_MultiDrmCencStreaming&#39; and &#39;Predefined_MultiDrmStreaming&#39;
     * 
     */
    public Output<String> streamingPolicyName() {
        return this.streamingPolicyName;
    }

    private StreamingLocatorArgs() {}

    private StreamingLocatorArgs(StreamingLocatorArgs $) {
        this.accountName = $.accountName;
        this.alternativeMediaId = $.alternativeMediaId;
        this.assetName = $.assetName;
        this.contentKeys = $.contentKeys;
        this.defaultContentKeyPolicyName = $.defaultContentKeyPolicyName;
        this.endTime = $.endTime;
        this.filters = $.filters;
        this.resourceGroupName = $.resourceGroupName;
        this.startTime = $.startTime;
        this.streamingLocatorId = $.streamingLocatorId;
        this.streamingLocatorName = $.streamingLocatorName;
        this.streamingPolicyName = $.streamingPolicyName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(StreamingLocatorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private StreamingLocatorArgs $;

        public Builder() {
            $ = new StreamingLocatorArgs();
        }

        public Builder(StreamingLocatorArgs defaults) {
            $ = new StreamingLocatorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountName The Media Services account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(Output<String> accountName) {
            $.accountName = accountName;
            return this;
        }

        /**
         * @param accountName The Media Services account name.
         * 
         * @return builder
         * 
         */
        public Builder accountName(String accountName) {
            return accountName(Output.of(accountName));
        }

        /**
         * @param alternativeMediaId Alternative Media ID of this Streaming Locator
         * 
         * @return builder
         * 
         */
        public Builder alternativeMediaId(@Nullable Output<String> alternativeMediaId) {
            $.alternativeMediaId = alternativeMediaId;
            return this;
        }

        /**
         * @param alternativeMediaId Alternative Media ID of this Streaming Locator
         * 
         * @return builder
         * 
         */
        public Builder alternativeMediaId(String alternativeMediaId) {
            return alternativeMediaId(Output.of(alternativeMediaId));
        }

        /**
         * @param assetName Asset Name
         * 
         * @return builder
         * 
         */
        public Builder assetName(Output<String> assetName) {
            $.assetName = assetName;
            return this;
        }

        /**
         * @param assetName Asset Name
         * 
         * @return builder
         * 
         */
        public Builder assetName(String assetName) {
            return assetName(Output.of(assetName));
        }

        /**
         * @param contentKeys The ContentKeys used by this Streaming Locator.
         * 
         * @return builder
         * 
         */
        public Builder contentKeys(@Nullable Output<List<StreamingLocatorContentKeyArgs>> contentKeys) {
            $.contentKeys = contentKeys;
            return this;
        }

        /**
         * @param contentKeys The ContentKeys used by this Streaming Locator.
         * 
         * @return builder
         * 
         */
        public Builder contentKeys(List<StreamingLocatorContentKeyArgs> contentKeys) {
            return contentKeys(Output.of(contentKeys));
        }

        /**
         * @param contentKeys The ContentKeys used by this Streaming Locator.
         * 
         * @return builder
         * 
         */
        public Builder contentKeys(StreamingLocatorContentKeyArgs... contentKeys) {
            return contentKeys(List.of(contentKeys));
        }

        /**
         * @param defaultContentKeyPolicyName Name of the default ContentKeyPolicy used by this Streaming Locator.
         * 
         * @return builder
         * 
         */
        public Builder defaultContentKeyPolicyName(@Nullable Output<String> defaultContentKeyPolicyName) {
            $.defaultContentKeyPolicyName = defaultContentKeyPolicyName;
            return this;
        }

        /**
         * @param defaultContentKeyPolicyName Name of the default ContentKeyPolicy used by this Streaming Locator.
         * 
         * @return builder
         * 
         */
        public Builder defaultContentKeyPolicyName(String defaultContentKeyPolicyName) {
            return defaultContentKeyPolicyName(Output.of(defaultContentKeyPolicyName));
        }

        /**
         * @param endTime The end time of the Streaming Locator.
         * 
         * @return builder
         * 
         */
        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        /**
         * @param endTime The end time of the Streaming Locator.
         * 
         * @return builder
         * 
         */
        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        /**
         * @param filters A list of asset or account filters which apply to this streaming locator
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<String>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters A list of asset or account filters which apply to this streaming locator
         * 
         * @return builder
         * 
         */
        public Builder filters(List<String> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters A list of asset or account filters which apply to this streaming locator
         * 
         * @return builder
         * 
         */
        public Builder filters(String... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param resourceGroupName The name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group within the Azure subscription.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param startTime The start time of the Streaming Locator.
         * 
         * @return builder
         * 
         */
        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        /**
         * @param startTime The start time of the Streaming Locator.
         * 
         * @return builder
         * 
         */
        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        /**
         * @param streamingLocatorId The StreamingLocatorId of the Streaming Locator.
         * 
         * @return builder
         * 
         */
        public Builder streamingLocatorId(@Nullable Output<String> streamingLocatorId) {
            $.streamingLocatorId = streamingLocatorId;
            return this;
        }

        /**
         * @param streamingLocatorId The StreamingLocatorId of the Streaming Locator.
         * 
         * @return builder
         * 
         */
        public Builder streamingLocatorId(String streamingLocatorId) {
            return streamingLocatorId(Output.of(streamingLocatorId));
        }

        /**
         * @param streamingLocatorName The Streaming Locator name.
         * 
         * @return builder
         * 
         */
        public Builder streamingLocatorName(@Nullable Output<String> streamingLocatorName) {
            $.streamingLocatorName = streamingLocatorName;
            return this;
        }

        /**
         * @param streamingLocatorName The Streaming Locator name.
         * 
         * @return builder
         * 
         */
        public Builder streamingLocatorName(String streamingLocatorName) {
            return streamingLocatorName(Output.of(streamingLocatorName));
        }

        /**
         * @param streamingPolicyName Name of the Streaming Policy used by this Streaming Locator. Either specify the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined Streaming Policies available are: &#39;Predefined_DownloadOnly&#39;, &#39;Predefined_ClearStreamingOnly&#39;, &#39;Predefined_DownloadAndClearStreaming&#39;, &#39;Predefined_ClearKey&#39;, &#39;Predefined_MultiDrmCencStreaming&#39; and &#39;Predefined_MultiDrmStreaming&#39;
         * 
         * @return builder
         * 
         */
        public Builder streamingPolicyName(Output<String> streamingPolicyName) {
            $.streamingPolicyName = streamingPolicyName;
            return this;
        }

        /**
         * @param streamingPolicyName Name of the Streaming Policy used by this Streaming Locator. Either specify the name of Streaming Policy you created or use one of the predefined Streaming Policies. The predefined Streaming Policies available are: &#39;Predefined_DownloadOnly&#39;, &#39;Predefined_ClearStreamingOnly&#39;, &#39;Predefined_DownloadAndClearStreaming&#39;, &#39;Predefined_ClearKey&#39;, &#39;Predefined_MultiDrmCencStreaming&#39; and &#39;Predefined_MultiDrmStreaming&#39;
         * 
         * @return builder
         * 
         */
        public Builder streamingPolicyName(String streamingPolicyName) {
            return streamingPolicyName(Output.of(streamingPolicyName));
        }

        public StreamingLocatorArgs build() {
            $.accountName = Objects.requireNonNull($.accountName, "expected parameter 'accountName' to be non-null");
            $.assetName = Objects.requireNonNull($.assetName, "expected parameter 'assetName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.streamingPolicyName = Objects.requireNonNull($.streamingPolicyName, "expected parameter 'streamingPolicyName' to be non-null");
            return $;
        }
    }

}
