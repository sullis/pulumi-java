// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLibraryMaskingFormatArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLibraryMaskingFormatArgs Empty = new GetLibraryMaskingFormatArgs();

    /**
     * The OCID of the library masking format.
     * 
     */
    @Import(name="libraryMaskingFormatId", required=true)
    private Output<String> libraryMaskingFormatId;

    /**
     * @return The OCID of the library masking format.
     * 
     */
    public Output<String> libraryMaskingFormatId() {
        return this.libraryMaskingFormatId;
    }

    private GetLibraryMaskingFormatArgs() {}

    private GetLibraryMaskingFormatArgs(GetLibraryMaskingFormatArgs $) {
        this.libraryMaskingFormatId = $.libraryMaskingFormatId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLibraryMaskingFormatArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLibraryMaskingFormatArgs $;

        public Builder() {
            $ = new GetLibraryMaskingFormatArgs();
        }

        public Builder(GetLibraryMaskingFormatArgs defaults) {
            $ = new GetLibraryMaskingFormatArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param libraryMaskingFormatId The OCID of the library masking format.
         * 
         * @return builder
         * 
         */
        public Builder libraryMaskingFormatId(Output<String> libraryMaskingFormatId) {
            $.libraryMaskingFormatId = libraryMaskingFormatId;
            return this;
        }

        /**
         * @param libraryMaskingFormatId The OCID of the library masking format.
         * 
         * @return builder
         * 
         */
        public Builder libraryMaskingFormatId(String libraryMaskingFormatId) {
            return libraryMaskingFormatId(Output.of(libraryMaskingFormatId));
        }

        public GetLibraryMaskingFormatArgs build() {
            $.libraryMaskingFormatId = Objects.requireNonNull($.libraryMaskingFormatId, "expected parameter 'libraryMaskingFormatId' to be non-null");
            return $;
        }
    }

}
