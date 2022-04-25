// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ZipInfoResponse {
    /**
     * @return An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
     * 
     */
    private final Integer filesCount;
    /**
     * @return URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form &#39;http(s)://storage.googleapis.com//&#39;.
     * 
     */
    private final String sourceUrl;

    @CustomType.Constructor
    private ZipInfoResponse(
        @CustomType.Parameter("filesCount") Integer filesCount,
        @CustomType.Parameter("sourceUrl") String sourceUrl) {
        this.filesCount = filesCount;
        this.sourceUrl = sourceUrl;
    }

    /**
     * @return An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
     * 
     */
    public Integer filesCount() {
        return this.filesCount;
    }
    /**
     * @return URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form &#39;http(s)://storage.googleapis.com//&#39;.
     * 
     */
    public String sourceUrl() {
        return this.sourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ZipInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer filesCount;
        private String sourceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ZipInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filesCount = defaults.filesCount;
    	      this.sourceUrl = defaults.sourceUrl;
        }

        public Builder filesCount(Integer filesCount) {
            this.filesCount = Objects.requireNonNull(filesCount);
            return this;
        }
        public Builder sourceUrl(String sourceUrl) {
            this.sourceUrl = Objects.requireNonNull(sourceUrl);
            return this;
        }        public ZipInfoResponse build() {
            return new ZipInfoResponse(filesCount, sourceUrl);
        }
    }
}
