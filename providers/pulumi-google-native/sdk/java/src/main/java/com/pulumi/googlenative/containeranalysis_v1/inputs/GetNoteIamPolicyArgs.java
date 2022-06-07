// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.containeranalysis_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNoteIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNoteIamPolicyArgs Empty = new GetNoteIamPolicyArgs();

    @Import(name="noteId", required=true)
    private Output<String> noteId;

    public Output<String> noteId() {
        return this.noteId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetNoteIamPolicyArgs() {}

    private GetNoteIamPolicyArgs(GetNoteIamPolicyArgs $) {
        this.noteId = $.noteId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNoteIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNoteIamPolicyArgs $;

        public Builder() {
            $ = new GetNoteIamPolicyArgs();
        }

        public Builder(GetNoteIamPolicyArgs defaults) {
            $ = new GetNoteIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder noteId(Output<String> noteId) {
            $.noteId = noteId;
            return this;
        }

        public Builder noteId(String noteId) {
            return noteId(Output.of(noteId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetNoteIamPolicyArgs build() {
            $.noteId = Objects.requireNonNull($.noteId, "expected parameter 'noteId' to be non-null");
            return $;
        }
    }

}
