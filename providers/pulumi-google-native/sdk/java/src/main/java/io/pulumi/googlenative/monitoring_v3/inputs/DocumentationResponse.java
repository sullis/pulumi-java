// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A content string and a MIME type that describes the content string's format.
 * 
 */
public final class DocumentationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DocumentationResponse Empty = new DocumentationResponse();

    /**
     * The text of the documentation, interpreted according to mime_type. The content may not exceed 8,192 Unicode characters and may not exceed more than 10,240 bytes when encoded in UTF-8 format, whichever is smaller.
     * 
     */
    @InputImport(name="content", required=true)
      private final String content;

    public String getContent() {
        return this.content;
    }

    /**
     * The format of the content field. Presently, only the value "text/markdown" is supported. See Markdown (https://en.wikipedia.org/wiki/Markdown) for more information.
     * 
     */
    @InputImport(name="mimeType", required=true)
      private final String mimeType;

    public String getMimeType() {
        return this.mimeType;
    }

    public DocumentationResponse(
        String content,
        String mimeType) {
        this.content = Objects.requireNonNull(content, "expected parameter 'content' to be non-null");
        this.mimeType = Objects.requireNonNull(mimeType, "expected parameter 'mimeType' to be non-null");
    }

    private DocumentationResponse() {
        this.content = null;
        this.mimeType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String mimeType;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.mimeType = defaults.mimeType;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setMimeType(String mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }
        public DocumentationResponse build() {
            return new DocumentationResponse(content, mimeType);
        }
    }
}