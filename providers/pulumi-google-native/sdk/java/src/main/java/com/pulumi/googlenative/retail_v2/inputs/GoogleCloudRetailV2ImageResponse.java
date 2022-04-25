// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * Product thumbnail/detail image.
 * 
 */
public final class GoogleCloudRetailV2ImageResponse extends com.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRetailV2ImageResponse Empty = new GoogleCloudRetailV2ImageResponse();

    /**
     * Height of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Import(name="height", required=true)
    private Integer height;

    /**
     * @return Height of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    public Integer height() {
        return this.height;
    }

    /**
     * URI of the image. This field must be a valid UTF-8 encoded URI with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property [Product.image](https://schema.org/image).
     * 
     */
    @Import(name="uri", required=true)
    private String uri;

    /**
     * @return URI of the image. This field must be a valid UTF-8 encoded URI with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property [Product.image](https://schema.org/image).
     * 
     */
    public String uri() {
        return this.uri;
    }

    /**
     * Width of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    @Import(name="width", required=true)
    private Integer width;

    /**
     * @return Width of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
     * 
     */
    public Integer width() {
        return this.width;
    }

    private GoogleCloudRetailV2ImageResponse() {}

    private GoogleCloudRetailV2ImageResponse(GoogleCloudRetailV2ImageResponse $) {
        this.height = $.height;
        this.uri = $.uri;
        this.width = $.width;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2ImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2ImageResponse $;

        public Builder() {
            $ = new GoogleCloudRetailV2ImageResponse();
        }

        public Builder(GoogleCloudRetailV2ImageResponse defaults) {
            $ = new GoogleCloudRetailV2ImageResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param height Height of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
         * 
         * @return builder
         * 
         */
        public Builder height(Integer height) {
            $.height = height;
            return this;
        }

        /**
         * @param uri URI of the image. This field must be a valid UTF-8 encoded URI with a length limit of 5,000 characters. Otherwise, an INVALID_ARGUMENT error is returned. Google Merchant Center property [image_link](https://support.google.com/merchants/answer/6324350). Schema.org property [Product.image](https://schema.org/image).
         * 
         * @return builder
         * 
         */
        public Builder uri(String uri) {
            $.uri = uri;
            return this;
        }

        /**
         * @param width Width of the image in number of pixels. This field must be nonnegative. Otherwise, an INVALID_ARGUMENT error is returned.
         * 
         * @return builder
         * 
         */
        public Builder width(Integer width) {
            $.width = width;
            return this;
        }

        public GoogleCloudRetailV2ImageResponse build() {
            $.height = Objects.requireNonNull($.height, "expected parameter 'height' to be non-null");
            $.uri = Objects.requireNonNull($.uri, "expected parameter 'uri' to be non-null");
            $.width = Objects.requireNonNull($.width, "expected parameter 'width' to be non-null");
            return $;
        }
    }

}
