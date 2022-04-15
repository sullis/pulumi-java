// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetImageVersionResult {
    private final @Nullable String containerImage;
    private final @Nullable String imageArn;
    private final @Nullable String imageVersionArn;
    private final @Nullable Integer version;

    @CustomType.Constructor
    private GetImageVersionResult(
        @CustomType.Parameter("containerImage") @Nullable String containerImage,
        @CustomType.Parameter("imageArn") @Nullable String imageArn,
        @CustomType.Parameter("imageVersionArn") @Nullable String imageVersionArn,
        @CustomType.Parameter("version") @Nullable Integer version) {
        this.containerImage = containerImage;
        this.imageArn = imageArn;
        this.imageVersionArn = imageVersionArn;
        this.version = version;
    }

    public Optional<String> containerImage() {
        return Optional.ofNullable(this.containerImage);
    }
    public Optional<String> imageArn() {
        return Optional.ofNullable(this.imageArn);
    }
    public Optional<String> imageVersionArn() {
        return Optional.ofNullable(this.imageVersionArn);
    }
    public Optional<Integer> version() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetImageVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String containerImage;
        private @Nullable String imageArn;
        private @Nullable String imageVersionArn;
        private @Nullable Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetImageVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerImage = defaults.containerImage;
    	      this.imageArn = defaults.imageArn;
    	      this.imageVersionArn = defaults.imageVersionArn;
    	      this.version = defaults.version;
        }

        public Builder containerImage(@Nullable String containerImage) {
            this.containerImage = containerImage;
            return this;
        }
        public Builder imageArn(@Nullable String imageArn) {
            this.imageArn = imageArn;
            return this;
        }
        public Builder imageVersionArn(@Nullable String imageVersionArn) {
            this.imageVersionArn = imageVersionArn;
            return this;
        }
        public Builder version(@Nullable Integer version) {
            this.version = version;
            return this;
        }        public GetImageVersionResult build() {
            return new GetImageVersionResult(containerImage, imageArn, imageVersionArn, version);
        }
    }
}
