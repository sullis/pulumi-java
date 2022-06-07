// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceGroupArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceGroupArgs Empty = new GetInstanceGroupArgs();

    @Import(name="instanceGroup", required=true)
    private Output<String> instanceGroup;

    public Output<String> instanceGroup() {
        return this.instanceGroup;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
    private Output<String> zone;

    public Output<String> zone() {
        return this.zone;
    }

    private GetInstanceGroupArgs() {}

    private GetInstanceGroupArgs(GetInstanceGroupArgs $) {
        this.instanceGroup = $.instanceGroup;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceGroupArgs $;

        public Builder() {
            $ = new GetInstanceGroupArgs();
        }

        public Builder(GetInstanceGroupArgs defaults) {
            $ = new GetInstanceGroupArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceGroup(Output<String> instanceGroup) {
            $.instanceGroup = instanceGroup;
            return this;
        }

        public Builder instanceGroup(String instanceGroup) {
            return instanceGroup(Output.of(instanceGroup));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder zone(Output<String> zone) {
            $.zone = zone;
            return this;
        }

        public Builder zone(String zone) {
            return zone(Output.of(zone));
        }

        public GetInstanceGroupArgs build() {
            $.instanceGroup = Objects.requireNonNull($.instanceGroup, "expected parameter 'instanceGroup' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
