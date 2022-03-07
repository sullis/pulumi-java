// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Files served directly to the user for a given URL, such as images, CSS stylesheets, or JavaScript source files. Static file handlers describe which files in the application directory are static files, and which URLs serve them.
 * 
 */
public final class StaticFilesHandlerResponse extends io.pulumi.resources.InvokeArgs {

    public static final StaticFilesHandlerResponse Empty = new StaticFilesHandlerResponse();

    /**
     * Whether files should also be uploaded as code data. By default, files declared in static file handlers are uploaded as static data and are only served to end users; they cannot be read by the application. If enabled, uploads are charged against both your code and static data storage resource quotas.
     * 
     */
    @InputImport(name="applicationReadable", required=true)
      private final Boolean applicationReadable;

    public Boolean getApplicationReadable() {
        return this.applicationReadable;
    }

    /**
     * Time a static file served by this handler should be cached by web proxies and browsers.
     * 
     */
    @InputImport(name="expiration", required=true)
      private final String expiration;

    public String getExpiration() {
        return this.expiration;
    }

    /**
     * HTTP headers to use for all responses from these URLs.
     * 
     */
    @InputImport(name="httpHeaders", required=true)
      private final Map<String,String> httpHeaders;

    public Map<String,String> getHttpHeaders() {
        return this.httpHeaders;
    }

    /**
     * MIME type used to serve all files served by this handler.Defaults to file-specific MIME types, which are derived from each file's filename extension.
     * 
     */
    @InputImport(name="mimeType", required=true)
      private final String mimeType;

    public String getMimeType() {
        return this.mimeType;
    }

    /**
     * Path to the static files matched by the URL pattern, from the application root directory. The path can refer to text matched in groupings in the URL pattern.
     * 
     */
    @InputImport(name="path", required=true)
      private final String path;

    public String getPath() {
        return this.path;
    }

    /**
     * Whether this handler should match the request if the file referenced by the handler does not exist.
     * 
     */
    @InputImport(name="requireMatchingFile", required=true)
      private final Boolean requireMatchingFile;

    public Boolean getRequireMatchingFile() {
        return this.requireMatchingFile;
    }

    /**
     * Regular expression that matches the file paths for all files that should be referenced by this handler.
     * 
     */
    @InputImport(name="uploadPathRegex", required=true)
      private final String uploadPathRegex;

    public String getUploadPathRegex() {
        return this.uploadPathRegex;
    }

    public StaticFilesHandlerResponse(
        Boolean applicationReadable,
        String expiration,
        Map<String,String> httpHeaders,
        String mimeType,
        String path,
        Boolean requireMatchingFile,
        String uploadPathRegex) {
        this.applicationReadable = Objects.requireNonNull(applicationReadable, "expected parameter 'applicationReadable' to be non-null");
        this.expiration = Objects.requireNonNull(expiration, "expected parameter 'expiration' to be non-null");
        this.httpHeaders = Objects.requireNonNull(httpHeaders, "expected parameter 'httpHeaders' to be non-null");
        this.mimeType = Objects.requireNonNull(mimeType, "expected parameter 'mimeType' to be non-null");
        this.path = Objects.requireNonNull(path, "expected parameter 'path' to be non-null");
        this.requireMatchingFile = Objects.requireNonNull(requireMatchingFile, "expected parameter 'requireMatchingFile' to be non-null");
        this.uploadPathRegex = Objects.requireNonNull(uploadPathRegex, "expected parameter 'uploadPathRegex' to be non-null");
    }

    private StaticFilesHandlerResponse() {
        this.applicationReadable = null;
        this.expiration = null;
        this.httpHeaders = Map.of();
        this.mimeType = null;
        this.path = null;
        this.requireMatchingFile = null;
        this.uploadPathRegex = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StaticFilesHandlerResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean applicationReadable;
        private String expiration;
        private Map<String,String> httpHeaders;
        private String mimeType;
        private String path;
        private Boolean requireMatchingFile;
        private String uploadPathRegex;

        public Builder() {
    	      // Empty
        }

        public Builder(StaticFilesHandlerResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationReadable = defaults.applicationReadable;
    	      this.expiration = defaults.expiration;
    	      this.httpHeaders = defaults.httpHeaders;
    	      this.mimeType = defaults.mimeType;
    	      this.path = defaults.path;
    	      this.requireMatchingFile = defaults.requireMatchingFile;
    	      this.uploadPathRegex = defaults.uploadPathRegex;
        }

        public Builder setApplicationReadable(Boolean applicationReadable) {
            this.applicationReadable = Objects.requireNonNull(applicationReadable);
            return this;
        }

        public Builder setExpiration(String expiration) {
            this.expiration = Objects.requireNonNull(expiration);
            return this;
        }

        public Builder setHttpHeaders(Map<String,String> httpHeaders) {
            this.httpHeaders = Objects.requireNonNull(httpHeaders);
            return this;
        }

        public Builder setMimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }

        public Builder setPath(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }

        public Builder setRequireMatchingFile(Boolean requireMatchingFile) {
            this.requireMatchingFile = Objects.requireNonNull(requireMatchingFile);
            return this;
        }

        public Builder setUploadPathRegex(String uploadPathRegex) {
            this.uploadPathRegex = Objects.requireNonNull(uploadPathRegex);
            return this;
        }
        public StaticFilesHandlerResponse build() {
            return new StaticFilesHandlerResponse(applicationReadable, expiration, httpHeaders, mimeType, path, requireMatchingFile, uploadPathRegex);
        }
    }
}