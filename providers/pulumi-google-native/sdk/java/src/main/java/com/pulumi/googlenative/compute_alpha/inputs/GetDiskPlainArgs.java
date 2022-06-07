// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDiskPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDiskPlainArgs Empty = new GetDiskPlainArgs();

    @Import(name="disk", required=true)
    private String disk;

    public String disk() {
        return this.disk;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="zone", required=true)
    private String zone;

    public String zone() {
        return this.zone;
    }

    private GetDiskPlainArgs() {}

    private GetDiskPlainArgs(GetDiskPlainArgs $) {
        this.disk = $.disk;
        this.project = $.project;
        this.zone = $.zone;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDiskPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDiskPlainArgs $;

        public Builder() {
            $ = new GetDiskPlainArgs();
        }

        public Builder(GetDiskPlainArgs defaults) {
            $ = new GetDiskPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder disk(String disk) {
            $.disk = disk;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder zone(String zone) {
            $.zone = zone;
            return this;
        }

        public GetDiskPlainArgs build() {
            $.disk = Objects.requireNonNull($.disk, "expected parameter 'disk' to be non-null");
            $.zone = Objects.requireNonNull($.zone, "expected parameter 'zone' to be non-null");
            return $;
        }
    }

}
