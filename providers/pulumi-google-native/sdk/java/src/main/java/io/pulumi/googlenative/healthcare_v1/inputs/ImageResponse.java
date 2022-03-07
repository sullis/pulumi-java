// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Raw bytes representing consent artifact content.
 * 
 */
public final class ImageResponse extends io.pulumi.resources.InvokeArgs {

    public static final ImageResponse Empty = new ImageResponse();

    /**
     * Input only. Points to a Cloud Storage URI containing the consent artifact content. The URI must be in the following format: `gs://{bucket_id}/{object_id}`. The Cloud Healthcare API service account must have the `roles/storage.objectViewer` Cloud IAM role for this Cloud Storage location. The consent artifact content at this URI is copied to a Cloud Storage location managed by the Cloud Healthcare API. Responses to fetching requests return the consent artifact content in raw_bytes.
     * 
     */
    @InputImport(name="gcsUri", required=true)
      private final String gcsUri;

    public String getGcsUri() {
        return this.gcsUri;
    }

    /**
     * Consent artifact content represented as a stream of bytes. This field is populated when returned in GetConsentArtifact response, but not included in CreateConsentArtifact and ListConsentArtifact response.
     * 
     */
    @InputImport(name="rawBytes", required=true)
      private final String rawBytes;

    public String getRawBytes() {
        return this.rawBytes;
    }

    public ImageResponse(
        String gcsUri,
        String rawBytes) {
        this.gcsUri = Objects.requireNonNull(gcsUri, "expected parameter 'gcsUri' to be non-null");
        this.rawBytes = Objects.requireNonNull(rawBytes, "expected parameter 'rawBytes' to be non-null");
    }

    private ImageResponse() {
        this.gcsUri = null;
        this.rawBytes = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImageResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String gcsUri;
        private String rawBytes;

        public Builder() {
    	      // Empty
        }

        public Builder(ImageResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.gcsUri = defaults.gcsUri;
    	      this.rawBytes = defaults.rawBytes;
        }

        public Builder setGcsUri(String gcsUri) {
            this.gcsUri = Objects.requireNonNull(gcsUri);
            return this;
        }

        public Builder setRawBytes(String rawBytes) {
            this.rawBytes = Objects.requireNonNull(rawBytes);
            return this;
        }
        public ImageResponse build() {
            return new ImageResponse(gcsUri, rawBytes);
        }
    }
}