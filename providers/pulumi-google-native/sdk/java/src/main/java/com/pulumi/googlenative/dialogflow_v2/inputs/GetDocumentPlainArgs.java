// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDocumentPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDocumentPlainArgs Empty = new GetDocumentPlainArgs();

    @Import(name="documentId", required=true)
    private String documentId;

    public String documentId() {
        return this.documentId;
    }

    @Import(name="knowledgeBaseId", required=true)
    private String knowledgeBaseId;

    public String knowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDocumentPlainArgs() {}

    private GetDocumentPlainArgs(GetDocumentPlainArgs $) {
        this.documentId = $.documentId;
        this.knowledgeBaseId = $.knowledgeBaseId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDocumentPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDocumentPlainArgs $;

        public Builder() {
            $ = new GetDocumentPlainArgs();
        }

        public Builder(GetDocumentPlainArgs defaults) {
            $ = new GetDocumentPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder documentId(String documentId) {
            $.documentId = documentId;
            return this;
        }

        public Builder knowledgeBaseId(String knowledgeBaseId) {
            $.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetDocumentPlainArgs build() {
            $.documentId = Objects.requireNonNull($.documentId, "expected parameter 'documentId' to be non-null");
            $.knowledgeBaseId = Objects.requireNonNull($.knowledgeBaseId, "expected parameter 'knowledgeBaseId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
