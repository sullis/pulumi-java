// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dialogflow_v2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVersionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetVersionPlainArgs Empty = new GetVersionPlainArgs();

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

    @Import(name="versionId", required=true)
    private String versionId;

    public String versionId() {
        return this.versionId;
    }

    private GetVersionPlainArgs() {}

    private GetVersionPlainArgs(GetVersionPlainArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.versionId = $.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetVersionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetVersionPlainArgs $;

        public Builder() {
            $ = new GetVersionPlainArgs();
        }

        public Builder(GetVersionPlainArgs defaults) {
            $ = new GetVersionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder versionId(String versionId) {
            $.versionId = versionId;
            return this;
        }

        public GetVersionPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.versionId = Objects.requireNonNull($.versionId, "expected parameter 'versionId' to be non-null");
            return $;
        }
    }

}
