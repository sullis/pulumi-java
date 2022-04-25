// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The zip file information for a zip deployment.
 * 
 */
public final class ZipInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final ZipInfoResponse Empty = new ZipInfoResponse();

    /**
     * An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
     * 
     */
    @Import(name="filesCount", required=true)
    private Integer filesCount;

    /**
     * @return An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
     * 
     */
    public Integer filesCount() {
        return this.filesCount;
    }

    /**
     * URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form &#39;http(s)://storage.googleapis.com//&#39;.
     * 
     */
    @Import(name="sourceUrl", required=true)
    private String sourceUrl;

    /**
     * @return URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form &#39;http(s)://storage.googleapis.com//&#39;.
     * 
     */
    public String sourceUrl() {
        return this.sourceUrl;
    }

    private ZipInfoResponse() {}

    private ZipInfoResponse(ZipInfoResponse $) {
        this.filesCount = $.filesCount;
        this.sourceUrl = $.sourceUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ZipInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ZipInfoResponse $;

        public Builder() {
            $ = new ZipInfoResponse();
        }

        public Builder(ZipInfoResponse defaults) {
            $ = new ZipInfoResponse(Objects.requireNonNull(defaults));
        }

        /**
         * @param filesCount An estimate of the number of files in a zip for a zip deployment. If set, must be greater than or equal to the actual number of files. Used for optimizing performance; if not provided, deployment may be slow.
         * 
         * @return builder
         * 
         */
        public Builder filesCount(Integer filesCount) {
            $.filesCount = filesCount;
            return this;
        }

        /**
         * @param sourceUrl URL of the zip file to deploy from. Must be a URL to a resource in Google Cloud Storage in the form &#39;http(s)://storage.googleapis.com//&#39;.
         * 
         * @return builder
         * 
         */
        public Builder sourceUrl(String sourceUrl) {
            $.sourceUrl = sourceUrl;
            return this;
        }

        public ZipInfoResponse build() {
            $.filesCount = Objects.requireNonNull($.filesCount, "expected parameter 'filesCount' to be non-null");
            $.sourceUrl = Objects.requireNonNull($.sourceUrl, "expected parameter 'sourceUrl' to be non-null");
            return $;
        }
    }

}
