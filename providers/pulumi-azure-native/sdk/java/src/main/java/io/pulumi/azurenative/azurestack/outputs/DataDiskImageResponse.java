// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestack.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataDiskImageResponse {
    /**
     * The LUN.
     * 
     */
    private final Integer lun;
    /**
     * SAS key for source blob.
     * 
     */
    private final String sourceBlobSasUri;

    @OutputCustomType.Constructor({"lun","sourceBlobSasUri"})
    private DataDiskImageResponse(
        Integer lun,
        String sourceBlobSasUri) {
        this.lun = Objects.requireNonNull(lun);
        this.sourceBlobSasUri = Objects.requireNonNull(sourceBlobSasUri);
    }

    /**
     * The LUN.
     * 
     */
    public Integer getLun() {
        return this.lun;
    }
    /**
     * SAS key for source blob.
     * 
     */
    public String getSourceBlobSasUri() {
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

        public Builder setLun(Integer lun) {
            this.lun = Objects.requireNonNull(lun);
            return this;
        }

        public Builder setSourceBlobSasUri(String sourceBlobSasUri) {
            this.sourceBlobSasUri = Objects.requireNonNull(sourceBlobSasUri);
            return this;
        }

        public DataDiskImageResponse build() {
            return new DataDiskImageResponse(lun, sourceBlobSasUri);
        }
    }
}
