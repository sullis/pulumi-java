// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.testing_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.testing_v1.inputs.FileReferenceResponse;
import java.lang.String;
import java.util.Objects;


/**
 * An opaque binary blob file to install on the device before the test starts.
 * 
 */
public final class ObbFileResponse extends com.pulumi.resources.InvokeArgs {

    public static final ObbFileResponse Empty = new ObbFileResponse();

    /**
     * Opaque Binary Blob (OBB) file(s) to install on the device.
     * 
     */
    @Import(name="obb", required=true)
    private FileReferenceResponse obb;

    /**
     * @return Opaque Binary Blob (OBB) file(s) to install on the device.
     * 
     */
    public FileReferenceResponse obb() {
        return this.obb;
    }

    /**
     * OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on the device.
     * 
     */
    @Import(name="obbFileName", required=true)
    private String obbFileName;

    /**
     * @return OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on the device.
     * 
     */
    public String obbFileName() {
        return this.obbFileName;
    }

    private ObbFileResponse() {}

    private ObbFileResponse(ObbFileResponse $) {
        this.obb = $.obb;
        this.obbFileName = $.obbFileName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ObbFileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ObbFileResponse $;

        public Builder() {
            $ = new ObbFileResponse();
        }

        public Builder(ObbFileResponse defaults) {
            $ = new ObbFileResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param obb Opaque Binary Blob (OBB) file(s) to install on the device.
         * 
         * @return builder
         * 
         */
        public Builder obb(FileReferenceResponse obb) {
            $.obb = obb;
            return this;
        }

        /**
         * @param obbFileName OBB file name which must conform to the format as specified by Android e.g. [main|patch].0300110.com.example.android.obb which will be installed into \/Android/obb/\/ on the device.
         * 
         * @return builder
         * 
         */
        public Builder obbFileName(String obbFileName) {
            $.obbFileName = obbFileName;
            return this;
        }

        public ObbFileResponse build() {
            $.obb = Objects.requireNonNull($.obb, "expected parameter 'obb' to be non-null");
            $.obbFileName = Objects.requireNonNull($.obbFileName, "expected parameter 'obbFileName' to be non-null");
            return $;
        }
    }

}
