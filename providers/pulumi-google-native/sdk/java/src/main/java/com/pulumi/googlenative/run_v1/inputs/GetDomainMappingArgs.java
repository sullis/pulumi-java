// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.run_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDomainMappingArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDomainMappingArgs Empty = new GetDomainMappingArgs();

    @Import(name="domainmappingId", required=true)
    private Output<String> domainmappingId;

    public Output<String> domainmappingId() {
        return this.domainmappingId;
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

    private GetDomainMappingArgs() {}

    private GetDomainMappingArgs(GetDomainMappingArgs $) {
        this.domainmappingId = $.domainmappingId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDomainMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDomainMappingArgs $;

        public Builder() {
            $ = new GetDomainMappingArgs();
        }

        public Builder(GetDomainMappingArgs defaults) {
            $ = new GetDomainMappingArgs(Objects.requireNonNull(defaults));
        }

        public Builder domainmappingId(Output<String> domainmappingId) {
            $.domainmappingId = domainmappingId;
            return this;
        }

        public Builder domainmappingId(String domainmappingId) {
            return domainmappingId(Output.of(domainmappingId));
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

        public GetDomainMappingArgs build() {
            $.domainmappingId = Objects.requireNonNull($.domainmappingId, "expected parameter 'domainmappingId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
