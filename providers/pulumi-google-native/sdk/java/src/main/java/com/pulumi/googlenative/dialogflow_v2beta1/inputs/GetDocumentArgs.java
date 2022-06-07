// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDocumentArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDocumentArgs Empty = new GetDocumentArgs();

    @Import(name="documentId", required=true)
    private Output<String> documentId;

    public Output<String> documentId() {
        return this.documentId;
    }

    @Import(name="knowledgeBaseId", required=true)
    private Output<String> knowledgeBaseId;

    public Output<String> knowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDocumentArgs() {}

    private GetDocumentArgs(GetDocumentArgs $) {
        this.documentId = $.documentId;
        this.knowledgeBaseId = $.knowledgeBaseId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDocumentArgs $;

        public Builder() {
            $ = new GetDocumentArgs();
        }

        public Builder(GetDocumentArgs defaults) {
            $ = new GetDocumentArgs(Objects.requireNonNull(defaults));
        }

        public Builder documentId(Output<String> documentId) {
            $.documentId = documentId;
            return this;
        }

        public Builder documentId(String documentId) {
            return documentId(Output.of(documentId));
        }

        public Builder knowledgeBaseId(Output<String> knowledgeBaseId) {
            $.knowledgeBaseId = knowledgeBaseId;
            return this;
        }

        public Builder knowledgeBaseId(String knowledgeBaseId) {
            return knowledgeBaseId(Output.of(knowledgeBaseId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetDocumentArgs build() {
            $.documentId = Objects.requireNonNull($.documentId, "expected parameter 'documentId' to be non-null");
            $.knowledgeBaseId = Objects.requireNonNull($.knowledgeBaseId, "expected parameter 'knowledgeBaseId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
