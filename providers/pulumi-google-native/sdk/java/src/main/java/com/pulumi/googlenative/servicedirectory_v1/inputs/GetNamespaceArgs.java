// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicedirectory_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNamespaceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNamespaceArgs Empty = new GetNamespaceArgs();

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="namespaceId", required=true)
    private Output<String> namespaceId;

    public Output<String> namespaceId() {
        return this.namespaceId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetNamespaceArgs() {}

    private GetNamespaceArgs(GetNamespaceArgs $) {
        this.location = $.location;
        this.namespaceId = $.namespaceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNamespaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNamespaceArgs $;

        public Builder() {
            $ = new GetNamespaceArgs();
        }

        public Builder(GetNamespaceArgs defaults) {
            $ = new GetNamespaceArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder namespaceId(Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetNamespaceArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.namespaceId = Objects.requireNonNull($.namespaceId, "expected parameter 'namespaceId' to be non-null");
            return $;
        }
    }

}
