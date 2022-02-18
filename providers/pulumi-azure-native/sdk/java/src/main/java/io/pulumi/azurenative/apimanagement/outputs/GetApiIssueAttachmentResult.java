// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetApiIssueAttachmentResult {
    /**
     * An HTTP link or Base64-encoded binary data.
     * 
     */
    private final String content;
    /**
     * Either 'link' if content is provided via an HTTP link or the MIME type of the Base64-encoded binary data provided in the 'content' property.
     * 
     */
    private final String contentFormat;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Filename by which the binary data will be saved.
     * 
     */
    private final String title;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"content","contentFormat","id","name","title","type"})
    private GetApiIssueAttachmentResult(
        String content,
        String contentFormat,
        String id,
        String name,
        String title,
        String type) {
        this.content = Objects.requireNonNull(content);
        this.contentFormat = Objects.requireNonNull(contentFormat);
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.title = Objects.requireNonNull(title);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * An HTTP link or Base64-encoded binary data.
     * 
     */
    public String getContent() {
        return this.content;
    }
    /**
     * Either 'link' if content is provided via an HTTP link or the MIME type of the Base64-encoded binary data provided in the 'content' property.
     * 
     */
    public String getContentFormat() {
        return this.contentFormat;
    }
    /**
     * Resource ID.
     * 
     */
    public String getId() {
        return this.id;
    }
    /**
     * Resource name.
     * 
     */
    public String getName() {
        return this.name;
    }
    /**
     * Filename by which the binary data will be saved.
     * 
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * Resource type for API Management resource.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiIssueAttachmentResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String content;
        private String contentFormat;
        private String id;
        private String name;
        private String title;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiIssueAttachmentResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentFormat = defaults.contentFormat;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.title = defaults.title;
    	      this.type = defaults.type;
        }

        public Builder setContent(String content) {
            this.content = Objects.requireNonNull(content);
            return this;
        }

        public Builder setContentFormat(String contentFormat) {
            this.contentFormat = Objects.requireNonNull(contentFormat);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetApiIssueAttachmentResult build() {
            return new GetApiIssueAttachmentResult(content, contentFormat, id, name, title, type);
        }
    }
}
