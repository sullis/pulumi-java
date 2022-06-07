// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionDiskPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionDiskPlainArgs Empty = new GetRegionDiskPlainArgs();

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

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    private GetRegionDiskPlainArgs() {}

    private GetRegionDiskPlainArgs(GetRegionDiskPlainArgs $) {
        this.disk = $.disk;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionDiskPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionDiskPlainArgs $;

        public Builder() {
            $ = new GetRegionDiskPlainArgs();
        }

        public Builder(GetRegionDiskPlainArgs defaults) {
            $ = new GetRegionDiskPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder disk(String disk) {
            $.disk = disk;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public GetRegionDiskPlainArgs build() {
            $.disk = Objects.requireNonNull($.disk, "expected parameter 'disk' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
