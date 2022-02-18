// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetTestResultVideoDownloadURLResult {
    /**
     * The download URL.
     * 
     */
    private final String downloadUrl;
    /**
     * Expiry date of the download URL.
     * 
     */
    private final String expirationTime;

    @OutputCustomType.Constructor({"downloadUrl","expirationTime"})
    private GetTestResultVideoDownloadURLResult(
        String downloadUrl,
        String expirationTime) {
        this.downloadUrl = Objects.requireNonNull(downloadUrl);
        this.expirationTime = Objects.requireNonNull(expirationTime);
    }

    /**
     * The download URL.
     * 
     */
    public String getDownloadUrl() {
        return this.downloadUrl;
    }
    /**
     * Expiry date of the download URL.
     * 
     */
    public String getExpirationTime() {
        return this.expirationTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTestResultVideoDownloadURLResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String downloadUrl;
        private String expirationTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTestResultVideoDownloadURLResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.downloadUrl = defaults.downloadUrl;
    	      this.expirationTime = defaults.expirationTime;
        }

        public Builder setDownloadUrl(String downloadUrl) {
            this.downloadUrl = Objects.requireNonNull(downloadUrl);
            return this;
        }

        public Builder setExpirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }

        public GetTestResultVideoDownloadURLResult build() {
            return new GetTestResultVideoDownloadURLResult(downloadUrl, expirationTime);
        }
    }
}
