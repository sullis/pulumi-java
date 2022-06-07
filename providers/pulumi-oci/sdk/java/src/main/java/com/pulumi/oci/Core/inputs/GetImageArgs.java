// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetImageArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetImageArgs Empty = new GetImageArgs();

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
     * 
     */
    @Import(name="imageId", required=true)
    private Output<String> imageId;

    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
     * 
     */
    public Output<String> imageId() {
        return this.imageId;
    }

    private GetImageArgs() {}

    private GetImageArgs(GetImageArgs $) {
        this.imageId = $.imageId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetImageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetImageArgs $;

        public Builder() {
            $ = new GetImageArgs();
        }

        public Builder(GetImageArgs defaults) {
            $ = new GetImageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param imageId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageId(Output<String> imageId) {
            $.imageId = imageId;
            return this;
        }

        /**
         * @param imageId The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the image.
         * 
         * @return builder
         * 
         */
        public Builder imageId(String imageId) {
            return imageId(Output.of(imageId));
        }

        public GetImageArgs build() {
            $.imageId = Objects.requireNonNull($.imageId, "expected parameter 'imageId' to be non-null");
            return $;
        }
    }

}
