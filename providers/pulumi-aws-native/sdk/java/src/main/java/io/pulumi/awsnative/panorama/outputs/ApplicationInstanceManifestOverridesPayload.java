// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationInstanceManifestOverridesPayload {
    private final @Nullable String payloadData;

    @OutputCustomType.Constructor({"payloadData"})
    private ApplicationInstanceManifestOverridesPayload(@Nullable String payloadData) {
        this.payloadData = payloadData;
    }

    public Optional<String> getPayloadData() {
        return Optional.ofNullable(this.payloadData);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInstanceManifestOverridesPayload defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String payloadData;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInstanceManifestOverridesPayload defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payloadData = defaults.payloadData;
        }

        public Builder setPayloadData(@Nullable String payloadData) {
            this.payloadData = payloadData;
            return this;
        }

        public ApplicationInstanceManifestOverridesPayload build() {
            return new ApplicationInstanceManifestOverridesPayload(payloadData);
        }
    }
}
