// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LabelingJobImagePropertiesResponse extends com.pulumi.resources.InvokeArgs {

    public static final LabelingJobImagePropertiesResponse Empty = new LabelingJobImagePropertiesResponse();

    /**
     * Annotation type of image labeling tasks.
     * 
     */
    @Import(name="annotationType")
    private @Nullable String annotationType;

    /**
     * @return Annotation type of image labeling tasks.
     * 
     */
    public Optional<String> annotationType() {
        return Optional.ofNullable(this.annotationType);
    }

    /**
     * Media type of data asset.
     * 
     */
    @Import(name="mediaType", required=true)
    private String mediaType;

    /**
     * @return Media type of data asset.
     * 
     */
    public String mediaType() {
        return this.mediaType;
    }

    private LabelingJobImagePropertiesResponse() {}

    private LabelingJobImagePropertiesResponse(LabelingJobImagePropertiesResponse $) {
        this.annotationType = $.annotationType;
        this.mediaType = $.mediaType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LabelingJobImagePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LabelingJobImagePropertiesResponse $;

        public Builder() {
            $ = new LabelingJobImagePropertiesResponse();
        }

        public Builder(LabelingJobImagePropertiesResponse defaults) {
            $ = new LabelingJobImagePropertiesResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param annotationType Annotation type of image labeling tasks.
         * 
         * @return builder
         * 
         */
        public Builder annotationType(@Nullable String annotationType) {
            $.annotationType = annotationType;
            return this;
        }

        /**
         * @param mediaType Media type of data asset.
         * 
         * @return builder
         * 
         */
        public Builder mediaType(String mediaType) {
            $.mediaType = mediaType;
            return this;
        }

        public LabelingJobImagePropertiesResponse build() {
            $.mediaType = Objects.requireNonNull($.mediaType, "expected parameter 'mediaType' to be non-null");
            return $;
        }
    }

}
