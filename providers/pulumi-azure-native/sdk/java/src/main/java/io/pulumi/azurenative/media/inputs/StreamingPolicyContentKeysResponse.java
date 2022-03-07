// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.azurenative.media.inputs.DefaultKeyResponse;
import io.pulumi.azurenative.media.inputs.StreamingPolicyContentKeyResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Class to specify properties of all content keys in Streaming Policy
 * 
 */
public final class StreamingPolicyContentKeysResponse extends io.pulumi.resources.InvokeArgs {

    public static final StreamingPolicyContentKeysResponse Empty = new StreamingPolicyContentKeysResponse();

    /**
     * Default content key for an encryption scheme
     * 
     */
    @InputImport(name="defaultKey")
      private final @Nullable DefaultKeyResponse defaultKey;

    public Optional<DefaultKeyResponse> getDefaultKey() {
        return this.defaultKey == null ? Optional.empty() : Optional.ofNullable(this.defaultKey);
    }

    /**
     * Representing tracks needs separate content key
     * 
     */
    @InputImport(name="keyToTrackMappings")
      private final @Nullable List<StreamingPolicyContentKeyResponse> keyToTrackMappings;

    public List<StreamingPolicyContentKeyResponse> getKeyToTrackMappings() {
        return this.keyToTrackMappings == null ? List.of() : this.keyToTrackMappings;
    }

    public StreamingPolicyContentKeysResponse(
        @Nullable DefaultKeyResponse defaultKey,
        @Nullable List<StreamingPolicyContentKeyResponse> keyToTrackMappings) {
        this.defaultKey = defaultKey;
        this.keyToTrackMappings = keyToTrackMappings;
    }

    private StreamingPolicyContentKeysResponse() {
        this.defaultKey = null;
        this.keyToTrackMappings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamingPolicyContentKeysResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DefaultKeyResponse defaultKey;
        private @Nullable List<StreamingPolicyContentKeyResponse> keyToTrackMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamingPolicyContentKeysResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultKey = defaults.defaultKey;
    	      this.keyToTrackMappings = defaults.keyToTrackMappings;
        }

        public Builder setDefaultKey(@Nullable DefaultKeyResponse defaultKey) {
            this.defaultKey = defaultKey;
            return this;
        }

        public Builder setKeyToTrackMappings(@Nullable List<StreamingPolicyContentKeyResponse> keyToTrackMappings) {
            this.keyToTrackMappings = keyToTrackMappings;
            return this;
        }
        public StreamingPolicyContentKeysResponse build() {
            return new StreamingPolicyContentKeysResponse(defaultKey, keyToTrackMappings);
        }
    }
}