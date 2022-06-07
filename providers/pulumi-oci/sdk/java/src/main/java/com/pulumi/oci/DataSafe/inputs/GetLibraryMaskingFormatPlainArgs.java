// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetLibraryMaskingFormatPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLibraryMaskingFormatPlainArgs Empty = new GetLibraryMaskingFormatPlainArgs();

    /**
     * The OCID of the library masking format.
     * 
     */
    @Import(name="libraryMaskingFormatId", required=true)
    private String libraryMaskingFormatId;

    /**
     * @return The OCID of the library masking format.
     * 
     */
    public String libraryMaskingFormatId() {
        return this.libraryMaskingFormatId;
    }

    private GetLibraryMaskingFormatPlainArgs() {}

    private GetLibraryMaskingFormatPlainArgs(GetLibraryMaskingFormatPlainArgs $) {
        this.libraryMaskingFormatId = $.libraryMaskingFormatId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLibraryMaskingFormatPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLibraryMaskingFormatPlainArgs $;

        public Builder() {
            $ = new GetLibraryMaskingFormatPlainArgs();
        }

        public Builder(GetLibraryMaskingFormatPlainArgs defaults) {
            $ = new GetLibraryMaskingFormatPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param libraryMaskingFormatId The OCID of the library masking format.
         * 
         * @return builder
         * 
         */
        public Builder libraryMaskingFormatId(String libraryMaskingFormatId) {
            $.libraryMaskingFormatId = libraryMaskingFormatId;
            return this;
        }

        public GetLibraryMaskingFormatPlainArgs build() {
            $.libraryMaskingFormatId = Objects.requireNonNull($.libraryMaskingFormatId, "expected parameter 'libraryMaskingFormatId' to be non-null");
            return $;
        }
    }

}
