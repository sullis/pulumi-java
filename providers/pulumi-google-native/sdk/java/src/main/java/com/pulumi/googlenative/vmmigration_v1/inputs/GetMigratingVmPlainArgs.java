// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.vmmigration_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMigratingVmPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMigratingVmPlainArgs Empty = new GetMigratingVmPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="migratingVmId", required=true)
    private String migratingVmId;

    public String migratingVmId() {
        return this.migratingVmId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="sourceId", required=true)
    private String sourceId;

    public String sourceId() {
        return this.sourceId;
    }

    @Import(name="view")
    private @Nullable String view;

    public Optional<String> view() {
        return Optional.ofNullable(this.view);
    }

    private GetMigratingVmPlainArgs() {}

    private GetMigratingVmPlainArgs(GetMigratingVmPlainArgs $) {
        this.location = $.location;
        this.migratingVmId = $.migratingVmId;
        this.project = $.project;
        this.sourceId = $.sourceId;
        this.view = $.view;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMigratingVmPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMigratingVmPlainArgs $;

        public Builder() {
            $ = new GetMigratingVmPlainArgs();
        }

        public Builder(GetMigratingVmPlainArgs defaults) {
            $ = new GetMigratingVmPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder migratingVmId(String migratingVmId) {
            $.migratingVmId = migratingVmId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder sourceId(String sourceId) {
            $.sourceId = sourceId;
            return this;
        }

        public Builder view(@Nullable String view) {
            $.view = view;
            return this;
        }

        public GetMigratingVmPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.migratingVmId = Objects.requireNonNull($.migratingVmId, "expected parameter 'migratingVmId' to be non-null");
            $.sourceId = Objects.requireNonNull($.sourceId, "expected parameter 'sourceId' to be non-null");
            return $;
        }
    }

}
