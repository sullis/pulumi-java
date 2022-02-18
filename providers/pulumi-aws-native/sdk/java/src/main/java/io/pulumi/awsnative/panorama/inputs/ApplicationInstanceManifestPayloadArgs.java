// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.panorama.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationInstanceManifestPayloadArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationInstanceManifestPayloadArgs Empty = new ApplicationInstanceManifestPayloadArgs();

    @InputImport(name="payloadData")
    private final @Nullable Input<String> payloadData;

    public Input<String> getPayloadData() {
        return this.payloadData == null ? Input.empty() : this.payloadData;
    }

    public ApplicationInstanceManifestPayloadArgs(@Nullable Input<String> payloadData) {
        this.payloadData = payloadData;
    }

    private ApplicationInstanceManifestPayloadArgs() {
        this.payloadData = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationInstanceManifestPayloadArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> payloadData;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationInstanceManifestPayloadArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.payloadData = defaults.payloadData;
        }

        public Builder setPayloadData(@Nullable Input<String> payloadData) {
            this.payloadData = payloadData;
            return this;
        }

        public Builder setPayloadData(@Nullable String payloadData) {
            this.payloadData = Input.ofNullable(payloadData);
            return this;
        }

        public ApplicationInstanceManifestPayloadArgs build() {
            return new ApplicationInstanceManifestPayloadArgs(payloadData);
        }
    }
}
