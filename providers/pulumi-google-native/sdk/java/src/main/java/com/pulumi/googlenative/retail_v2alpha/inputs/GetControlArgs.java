// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail_v2alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetControlArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetControlArgs Empty = new GetControlArgs();

    @Import(name="catalogId", required=true)
    private Output<String> catalogId;

    public Output<String> catalogId() {
        return this.catalogId;
    }

    @Import(name="controlId", required=true)
    private Output<String> controlId;

    public Output<String> controlId() {
        return this.controlId;
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

    private GetControlArgs() {}

    private GetControlArgs(GetControlArgs $) {
        this.catalogId = $.catalogId;
        this.controlId = $.controlId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetControlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetControlArgs $;

        public Builder() {
            $ = new GetControlArgs();
        }

        public Builder(GetControlArgs defaults) {
            $ = new GetControlArgs(Objects.requireNonNull(defaults));
        }

        public Builder catalogId(Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        public Builder controlId(Output<String> controlId) {
            $.controlId = controlId;
            return this;
        }

        public Builder controlId(String controlId) {
            return controlId(Output.of(controlId));
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

        public GetControlArgs build() {
            $.catalogId = Objects.requireNonNull($.catalogId, "expected parameter 'catalogId' to be non-null");
            $.controlId = Objects.requireNonNull($.controlId, "expected parameter 'controlId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
