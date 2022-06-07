// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.artifactregistry_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTagPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTagPlainArgs Empty = new GetTagPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="packageId", required=true)
    private String packageId;

    public String packageId() {
        return this.packageId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="repositoryId", required=true)
    private String repositoryId;

    public String repositoryId() {
        return this.repositoryId;
    }

    @Import(name="tagId", required=true)
    private String tagId;

    public String tagId() {
        return this.tagId;
    }

    private GetTagPlainArgs() {}

    private GetTagPlainArgs(GetTagPlainArgs $) {
        this.location = $.location;
        this.packageId = $.packageId;
        this.project = $.project;
        this.repositoryId = $.repositoryId;
        this.tagId = $.tagId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTagPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTagPlainArgs $;

        public Builder() {
            $ = new GetTagPlainArgs();
        }

        public Builder(GetTagPlainArgs defaults) {
            $ = new GetTagPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder packageId(String packageId) {
            $.packageId = packageId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder repositoryId(String repositoryId) {
            $.repositoryId = repositoryId;
            return this;
        }

        public Builder tagId(String tagId) {
            $.tagId = tagId;
            return this;
        }

        public GetTagPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.packageId = Objects.requireNonNull($.packageId, "expected parameter 'packageId' to be non-null");
            $.repositoryId = Objects.requireNonNull($.repositoryId, "expected parameter 'repositoryId' to be non-null");
            $.tagId = Objects.requireNonNull($.tagId, "expected parameter 'tagId' to be non-null");
            return $;
        }
    }

}
