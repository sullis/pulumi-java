// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.azurestack.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataDiskImageResponse {
    /**
     * @return The LUN.
     * 
     */
    private final Integer lun;
    /**
     * @return SAS key for source blob.
     * 
     */
    private final String sourceBlobSasUri;

    @CustomType.Constructor
    private DataDiskImageResponse(
        @CustomType.Parameter("lun") Integer lun,
        @CustomType.Parameter("sourceBlobSasUri") String sourceBlobSasUri) {
        this.lun = lun;
        this.sourceBlobSasUri = sourceBlobSasUri;
    }

    /**
     * @return The LUN.
     * 
     */
    public Integer lun() {
        return this.lun;
    }
    /**
     * @return SAS key for source blob.
     * 
     */
    public String sourceBlobSasUri() {
        return this.sourceBlobSasUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataDiskImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer lun;
        private String sourceBlobSasUri;

        public Builder() {
    	      // Empty
        }

        public Builder(DataDiskImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lun = defaults.lun;
    	      this.sourceBlobSasUri = defaults.sourceBlobSasUri;
        }

        public Builder lun(Integer lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }
        public Builder sourceBlobSasUri(String sourceBlobSasUri) {
            this.sourceBlobSasUri = Objects.requireNonNull(sourceBlobSasUri);
            return this;
        }        public DataDiskImageResponse build() {
            return new DataDiskImageResponse(lun, sourceBlobSasUri);
        }
    }
}
