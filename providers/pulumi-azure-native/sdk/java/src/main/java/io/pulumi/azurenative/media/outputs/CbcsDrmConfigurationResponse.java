// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.azurenative.media.outputs.StreamingPolicyFairPlayConfigurationResponse;
import io.pulumi.azurenative.media.outputs.StreamingPolicyPlayReadyConfigurationResponse;
import io.pulumi.azurenative.media.outputs.StreamingPolicyWidevineConfigurationResponse;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CbcsDrmConfigurationResponse {
    /**
     * FairPlay configurations
     * 
     */
    private final @Nullable StreamingPolicyFairPlayConfigurationResponse fairPlay;
    /**
     * PlayReady configurations
     * 
     */
    private final @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady;
    /**
     * Widevine configurations
     * 
     */
    private final @Nullable StreamingPolicyWidevineConfigurationResponse widevine;

    @CustomType.Constructor
    private CbcsDrmConfigurationResponse(
        @CustomType.Parameter("fairPlay") @Nullable StreamingPolicyFairPlayConfigurationResponse fairPlay,
        @CustomType.Parameter("playReady") @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady,
        @CustomType.Parameter("widevine") @Nullable StreamingPolicyWidevineConfigurationResponse widevine) {
        this.fairPlay = fairPlay;
        this.playReady = playReady;
        this.widevine = widevine;
    }

    /**
     * FairPlay configurations
     * 
    */
    public Optional<StreamingPolicyFairPlayConfigurationResponse> getFairPlay() {
        return Optional.ofNullable(this.fairPlay);
    }
    /**
     * PlayReady configurations
     * 
    */
    public Optional<StreamingPolicyPlayReadyConfigurationResponse> getPlayReady() {
        return Optional.ofNullable(this.playReady);
    }
    /**
     * Widevine configurations
     * 
    */
    public Optional<StreamingPolicyWidevineConfigurationResponse> getWidevine() {
        return Optional.ofNullable(this.widevine);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CbcsDrmConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable StreamingPolicyFairPlayConfigurationResponse fairPlay;
        private @Nullable StreamingPolicyPlayReadyConfigurationResponse playReady;
        private @Nullable StreamingPolicyWidevineConfigurationResponse widevine;

        public Builder() {
    	      // Empty
        }

        public Builder(CbcsDrmConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fairPlay = defaults.fairPlay;
    	      this.playReady = defaults.playReady;
    	      this.widevine = defaults.widevine;
        }

        public Builder fairPlay(@Nullable StreamingPolicyFairPlayConfigurationResponse fairPlay) {
            this.fairPlay = fairPlay;
            return this;
        }
        public Builder playReady(@Nullable StreamingPolicyPlayReadyConfigurationResponse playReady) {
            this.playReady = playReady;
            return this;
        }
        public Builder widevine(@Nullable StreamingPolicyWidevineConfigurationResponse widevine) {
            this.widevine = widevine;
            return this;
        }        public CbcsDrmConfigurationResponse build() {
            return new CbcsDrmConfigurationResponse(fairPlay, playReady, widevine);
        }
    }
}
