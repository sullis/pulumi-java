// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDiskArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiskArgs Empty = new GetDiskArgs();

    @Import(name="disk", required=true)
    private Output<String> disk;

    public Output<String> disk() {
        return this.disk;
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

    private GetDiskArgs() {}

    private GetDiskArgs(GetDiskArgs $) {
        this.disk = $.disk;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiskArgs $;

        public Builder() {
            $ = new GetDiskArgs();
        }

        public Builder(GetDiskArgs defaults) {
            $ = new GetDiskArgs(Objects.requireNonNull(defaults));
        }

        public Builder disk(Output<String> disk) {
            $.disk = disk;
            return this;
        }

        public Builder disk(String disk) {
            return disk(Output.of(disk));
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

        public GetDiskArgs build() {
            $.disk = Objects.requireNonNull($.disk, "expected parameter 'disk' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
