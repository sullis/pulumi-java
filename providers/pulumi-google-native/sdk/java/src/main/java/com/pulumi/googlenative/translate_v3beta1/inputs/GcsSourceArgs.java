// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.translate_v3beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The Google Cloud Storage location for the input content.
 * 
 */
public final class GcsSourceArgs extends com.pulumi.resources.ResourceArgs {

    public static final GcsSourceArgs Empty = new GcsSourceArgs();

    /**
     * Source data URI. For example, `gs://my_bucket/my_object`.
     * 
     */
    @Import(name="inputUri", required=true)
    private Output<String> inputUri;

    /**
     * @return Source data URI. For example, `gs://my_bucket/my_object`.
     * 
     */
    public Output<String> inputUri() {
        return this.inputUri;
    }

    private GcsSourceArgs() {}

    private GcsSourceArgs(GcsSourceArgs $) {
        this.inputUri = $.inputUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GcsSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GcsSourceArgs $;

        public Builder() {
            $ = new GcsSourceArgs();
        }

        public Builder(GcsSourceArgs defaults) {
            $ = new GcsSourceArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param inputUri Source data URI. For example, `gs://my_bucket/my_object`.
         * 
         * @return builder
         * 
         */
        public Builder inputUri(Output<String> inputUri) {
            $.inputUri = inputUri;
            return this;
        }

        /**
         * @param inputUri Source data URI. For example, `gs://my_bucket/my_object`.
         * 
         * @return builder
         * 
         */
        public Builder inputUri(String inputUri) {
            return inputUri(Output.of(inputUri));
        }

        public GcsSourceArgs build() {
            $.inputUri = Objects.requireNonNull($.inputUri, "expected parameter 'inputUri' to be non-null");
            return $;
        }
    }

}
