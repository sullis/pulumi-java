// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.bot;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelDirectLineSpeechArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelDirectLineSpeechArgs Empty = new ChannelDirectLineSpeechArgs();

    /**
     * The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="botName", required=true)
    private Output<String> botName;

    /**
     * @return The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> botName() {
        return this.botName;
    }

    /**
     * The access key to access the Cognitive Service.
     * 
     */
    @Import(name="cognitiveServiceAccessKey", required=true)
    private Output<String> cognitiveServiceAccessKey;

    /**
     * @return The access key to access the Cognitive Service.
     * 
     */
    public Output<String> cognitiveServiceAccessKey() {
        return this.cognitiveServiceAccessKey;
    }

    /**
     * Specifies the supported Azure location where the Cognitive Service resource exists.
     * 
     */
    @Import(name="cognitiveServiceLocation", required=true)
    private Output<String> cognitiveServiceLocation;

    /**
     * @return Specifies the supported Azure location where the Cognitive Service resource exists.
     * 
     */
    public Output<String> cognitiveServiceLocation() {
        return this.cognitiveServiceLocation;
    }

    /**
     * The custom speech model id for the Direct Line Speech Channel.
     * 
     */
    @Import(name="customSpeechModelId")
    private @Nullable Output<String> customSpeechModelId;

    /**
     * @return The custom speech model id for the Direct Line Speech Channel.
     * 
     */
    public Optional<Output<String>> customSpeechModelId() {
        return Optional.ofNullable(this.customSpeechModelId);
    }

    /**
     * The custom voice deployment id for the Direct Line Speech Channel.
     * 
     */
    @Import(name="customVoiceDeploymentId")
    private @Nullable Output<String> customVoiceDeploymentId;

    /**
     * @return The custom voice deployment id for the Direct Line Speech Channel.
     * 
     */
    public Optional<Output<String>> customVoiceDeploymentId() {
        return Optional.ofNullable(this.customVoiceDeploymentId);
    }

    /**
     * Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * The name of the resource group where the Direct Line Speech Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group where the Direct Line Speech Channel should be created. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private ChannelDirectLineSpeechArgs() {}

    private ChannelDirectLineSpeechArgs(ChannelDirectLineSpeechArgs $) {
        this.botName = $.botName;
        this.cognitiveServiceAccessKey = $.cognitiveServiceAccessKey;
        this.cognitiveServiceLocation = $.cognitiveServiceLocation;
        this.customSpeechModelId = $.customSpeechModelId;
        this.customVoiceDeploymentId = $.customVoiceDeploymentId;
        this.location = $.location;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelDirectLineSpeechArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelDirectLineSpeechArgs $;

        public Builder() {
            $ = new ChannelDirectLineSpeechArgs();
        }

        public Builder(ChannelDirectLineSpeechArgs defaults) {
            $ = new ChannelDirectLineSpeechArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(Output<String> botName) {
            $.botName = botName;
            return this;
        }

        /**
         * @param botName The name of the Bot Resource this channel will be associated with. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder botName(String botName) {
            return botName(Output.of(botName));
        }

        /**
         * @param cognitiveServiceAccessKey The access key to access the Cognitive Service.
         * 
         * @return builder
         * 
         */
        public Builder cognitiveServiceAccessKey(Output<String> cognitiveServiceAccessKey) {
            $.cognitiveServiceAccessKey = cognitiveServiceAccessKey;
            return this;
        }

        /**
         * @param cognitiveServiceAccessKey The access key to access the Cognitive Service.
         * 
         * @return builder
         * 
         */
        public Builder cognitiveServiceAccessKey(String cognitiveServiceAccessKey) {
            return cognitiveServiceAccessKey(Output.of(cognitiveServiceAccessKey));
        }

        /**
         * @param cognitiveServiceLocation Specifies the supported Azure location where the Cognitive Service resource exists.
         * 
         * @return builder
         * 
         */
        public Builder cognitiveServiceLocation(Output<String> cognitiveServiceLocation) {
            $.cognitiveServiceLocation = cognitiveServiceLocation;
            return this;
        }

        /**
         * @param cognitiveServiceLocation Specifies the supported Azure location where the Cognitive Service resource exists.
         * 
         * @return builder
         * 
         */
        public Builder cognitiveServiceLocation(String cognitiveServiceLocation) {
            return cognitiveServiceLocation(Output.of(cognitiveServiceLocation));
        }

        /**
         * @param customSpeechModelId The custom speech model id for the Direct Line Speech Channel.
         * 
         * @return builder
         * 
         */
        public Builder customSpeechModelId(@Nullable Output<String> customSpeechModelId) {
            $.customSpeechModelId = customSpeechModelId;
            return this;
        }

        /**
         * @param customSpeechModelId The custom speech model id for the Direct Line Speech Channel.
         * 
         * @return builder
         * 
         */
        public Builder customSpeechModelId(String customSpeechModelId) {
            return customSpeechModelId(Output.of(customSpeechModelId));
        }

        /**
         * @param customVoiceDeploymentId The custom voice deployment id for the Direct Line Speech Channel.
         * 
         * @return builder
         * 
         */
        public Builder customVoiceDeploymentId(@Nullable Output<String> customVoiceDeploymentId) {
            $.customVoiceDeploymentId = customVoiceDeploymentId;
            return this;
        }

        /**
         * @param customVoiceDeploymentId The custom voice deployment id for the Direct Line Speech Channel.
         * 
         * @return builder
         * 
         */
        public Builder customVoiceDeploymentId(String customVoiceDeploymentId) {
            return customVoiceDeploymentId(Output.of(customVoiceDeploymentId));
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Specifies the supported Azure location where the resource exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        /**
         * @param resourceGroupName The name of the resource group where the Direct Line Speech Channel should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group where the Direct Line Speech Channel should be created. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public ChannelDirectLineSpeechArgs build() {
            $.botName = Objects.requireNonNull($.botName, "expected parameter 'botName' to be non-null");
            $.cognitiveServiceAccessKey = Objects.requireNonNull($.cognitiveServiceAccessKey, "expected parameter 'cognitiveServiceAccessKey' to be non-null");
            $.cognitiveServiceLocation = Objects.requireNonNull($.cognitiveServiceLocation, "expected parameter 'cognitiveServiceLocation' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
