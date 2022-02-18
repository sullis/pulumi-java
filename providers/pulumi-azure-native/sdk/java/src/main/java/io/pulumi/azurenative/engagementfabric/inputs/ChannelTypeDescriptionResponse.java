// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.engagementfabric.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * EngagementFabric channel description
 * 
 */
public final class ChannelTypeDescriptionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ChannelTypeDescriptionResponse Empty = new ChannelTypeDescriptionResponse();

    /**
     * Text description for the channel
     * 
     */
    @InputImport(name="channelDescription")
    private final @Nullable String channelDescription;

    public Optional<String> getChannelDescription() {
        return this.channelDescription == null ? Optional.empty() : Optional.ofNullable(this.channelDescription);
    }

    /**
     * All the available functions for the channel
     * 
     */
    @InputImport(name="channelFunctions")
    private final @Nullable List<String> channelFunctions;

    public List<String> getChannelFunctions() {
        return this.channelFunctions == null ? List.of() : this.channelFunctions;
    }

    /**
     * Channel type
     * 
     */
    @InputImport(name="channelType")
    private final @Nullable String channelType;

    public Optional<String> getChannelType() {
        return this.channelType == null ? Optional.empty() : Optional.ofNullable(this.channelType);
    }

    public ChannelTypeDescriptionResponse(
        @Nullable String channelDescription,
        @Nullable List<String> channelFunctions,
        @Nullable String channelType) {
        this.channelDescription = channelDescription;
        this.channelFunctions = channelFunctions;
        this.channelType = channelType;
    }

    private ChannelTypeDescriptionResponse() {
        this.channelDescription = null;
        this.channelFunctions = List.of();
        this.channelType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelTypeDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String channelDescription;
        private @Nullable List<String> channelFunctions;
        private @Nullable String channelType;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelTypeDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelDescription = defaults.channelDescription;
    	      this.channelFunctions = defaults.channelFunctions;
    	      this.channelType = defaults.channelType;
        }

        public Builder setChannelDescription(@Nullable String channelDescription) {
            this.channelDescription = channelDescription;
            return this;
        }

        public Builder setChannelFunctions(@Nullable List<String> channelFunctions) {
            this.channelFunctions = channelFunctions;
            return this;
        }

        public Builder setChannelType(@Nullable String channelType) {
            this.channelType = channelType;
            return this;
        }

        public ChannelTypeDescriptionResponse build() {
            return new ChannelTypeDescriptionResponse(channelDescription, channelFunctions, channelType);
        }
    }
}
