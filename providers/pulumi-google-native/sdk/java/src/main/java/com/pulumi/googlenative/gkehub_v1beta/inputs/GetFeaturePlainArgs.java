// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetFeaturePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetFeaturePlainArgs Empty = new GetFeaturePlainArgs();

    @Import(name="featureId", required=true)
    private String featureId;

    public String featureId() {
        return this.featureId;
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

    private GetFeaturePlainArgs() {}

    private GetFeaturePlainArgs(GetFeaturePlainArgs $) {
        this.featureId = $.featureId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetFeaturePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetFeaturePlainArgs $;

        public Builder() {
            $ = new GetFeaturePlainArgs();
        }

        public Builder(GetFeaturePlainArgs defaults) {
            $ = new GetFeaturePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder featureId(String featureId) {
            $.featureId = featureId;
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

        public GetFeaturePlainArgs build() {
            $.featureId = Objects.requireNonNull($.featureId, "expected parameter 'featureId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
