// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datacatalog_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTaxonomyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTaxonomyArgs Empty = new GetTaxonomyArgs();

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

    @Import(name="taxonomyId", required=true)
    private Output<String> taxonomyId;

    public Output<String> taxonomyId() {
        return this.taxonomyId;
    }

    private GetTaxonomyArgs() {}

    private GetTaxonomyArgs(GetTaxonomyArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.taxonomyId = $.taxonomyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTaxonomyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTaxonomyArgs $;

        public Builder() {
            $ = new GetTaxonomyArgs();
        }

        public Builder(GetTaxonomyArgs defaults) {
            $ = new GetTaxonomyArgs(Objects.requireNonNull(defaults));
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

        public Builder taxonomyId(Output<String> taxonomyId) {
            $.taxonomyId = taxonomyId;
            return this;
        }

        public Builder taxonomyId(String taxonomyId) {
            return taxonomyId(Output.of(taxonomyId));
        }

        public GetTaxonomyArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.taxonomyId = Objects.requireNonNull($.taxonomyId, "expected parameter 'taxonomyId' to be non-null");
            return $;
        }
    }

}
