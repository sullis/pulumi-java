// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudbuild_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudbuild_v1.inputs.ArtifactObjectsResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Artifacts produced by a build that should be uploaded upon successful completion of all build steps.
 * 
 */
public final class ArtifactsResponse extends com.pulumi.resources.InvokeArgs {

    public static final ArtifactsResponse Empty = new ArtifactsResponse();

    /**
     * A list of images to be pushed upon the successful completion of all build steps. The images will be pushed using the builder service account&#39;s credentials. The digests of the pushed images will be stored in the Build resource&#39;s results field. If any of the images fail to be pushed, the build is marked FAILURE.
     * 
     */
    @Import(name="images", required=true)
    private List<String> images;

    /**
     * @return A list of images to be pushed upon the successful completion of all build steps. The images will be pushed using the builder service account&#39;s credentials. The digests of the pushed images will be stored in the Build resource&#39;s results field. If any of the images fail to be pushed, the build is marked FAILURE.
     * 
     */
    public List<String> images() {
        return this.images;
    }

    /**
     * A list of objects to be uploaded to Cloud Storage upon successful completion of all build steps. Files in the workspace matching specified paths globs will be uploaded to the specified Cloud Storage location using the builder service account&#39;s credentials. The location and generation of the uploaded objects will be stored in the Build resource&#39;s results field. If any objects fail to be pushed, the build is marked FAILURE.
     * 
     */
    @Import(name="objects", required=true)
    private ArtifactObjectsResponse objects;

    /**
     * @return A list of objects to be uploaded to Cloud Storage upon successful completion of all build steps. Files in the workspace matching specified paths globs will be uploaded to the specified Cloud Storage location using the builder service account&#39;s credentials. The location and generation of the uploaded objects will be stored in the Build resource&#39;s results field. If any objects fail to be pushed, the build is marked FAILURE.
     * 
     */
    public ArtifactObjectsResponse objects() {
        return this.objects;
    }

    private ArtifactsResponse() {}

    private ArtifactsResponse(ArtifactsResponse $) {
        this.images = $.images;
        this.objects = $.objects;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArtifactsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArtifactsResponse $;

        public Builder() {
            $ = new ArtifactsResponse();
        }

        public Builder(ArtifactsResponse defaults) {
            $ = new ArtifactsResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param images A list of images to be pushed upon the successful completion of all build steps. The images will be pushed using the builder service account&#39;s credentials. The digests of the pushed images will be stored in the Build resource&#39;s results field. If any of the images fail to be pushed, the build is marked FAILURE.
         * 
         * @return builder
         * 
         */
        public Builder images(List<String> images) {
            $.images = images;
            return this;
        }

        /**
         * @param images A list of images to be pushed upon the successful completion of all build steps. The images will be pushed using the builder service account&#39;s credentials. The digests of the pushed images will be stored in the Build resource&#39;s results field. If any of the images fail to be pushed, the build is marked FAILURE.
         * 
         * @return builder
         * 
         */
        public Builder images(String... images) {
            return images(List.of(images));
        }

        /**
         * @param objects A list of objects to be uploaded to Cloud Storage upon successful completion of all build steps. Files in the workspace matching specified paths globs will be uploaded to the specified Cloud Storage location using the builder service account&#39;s credentials. The location and generation of the uploaded objects will be stored in the Build resource&#39;s results field. If any objects fail to be pushed, the build is marked FAILURE.
         * 
         * @return builder
         * 
         */
        public Builder objects(ArtifactObjectsResponse objects) {
            $.objects = objects;
            return this;
        }

        public ArtifactsResponse build() {
            $.images = Objects.requireNonNull($.images, "expected parameter 'images' to be non-null");
            $.objects = Objects.requireNonNull($.objects, "expected parameter 'objects' to be non-null");
            return $;
        }
    }

}
