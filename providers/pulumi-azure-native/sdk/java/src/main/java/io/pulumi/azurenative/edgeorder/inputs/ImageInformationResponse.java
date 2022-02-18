// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Image for the product
 * 
 */
public final class ImageInformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageInformationResponse Empty = new ImageInformationResponse();

    /**
     * Type of the image
     * 
     */
    @InputImport(name="imageType", required=true)
    private final String imageType;

    public String getImageType() {
        return this.imageType;
    }

    /**
     * Url of the image
     * 
     */
    @InputImport(name="imageUrl", required=true)
    private final String imageUrl;

    public String getImageUrl() {
        return this.imageUrl;
    }

    public ImageInformationResponse(
        String imageType,
        String imageUrl) {
        this.imageType = Objects.requireNonNull(imageType, "expected parameter 'imageType' to be non-null");
        this.imageUrl = Objects.requireNonNull(imageUrl, "expected parameter 'imageUrl' to be non-null");
    }

    private ImageInformationResponse() {
        this.imageType = null;
        this.imageUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String imageType;
        private String imageUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageType = defaults.imageType;
    	      this.imageUrl = defaults.imageUrl;
        }

        public Builder setImageType(String imageType) {
            this.imageType = Objects.requireNonNull(imageType);
            return this;
        }

        public Builder setImageUrl(String imageUrl) {
            this.imageUrl = Objects.requireNonNull(imageUrl);
            return this;
        }

        public ImageInformationResponse build() {
            return new ImageInformationResponse(imageType, imageUrl);
        }
    }
}
