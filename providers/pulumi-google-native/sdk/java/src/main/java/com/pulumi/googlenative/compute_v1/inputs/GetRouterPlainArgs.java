// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRouterPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRouterPlainArgs Empty = new GetRouterPlainArgs();

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

    @Import(name="router", required=true)
    private String router;

    public String router() {
        return this.router;
    }

    private GetRouterPlainArgs() {}

    private GetRouterPlainArgs(GetRouterPlainArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.router = $.router;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRouterPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRouterPlainArgs $;

        public Builder() {
            $ = new GetRouterPlainArgs();
        }

        public Builder(GetRouterPlainArgs defaults) {
            $ = new GetRouterPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public Builder router(String router) {
            $.router = router;
            return this;
        }

        public GetRouterPlainArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.router = Objects.requireNonNull($.router, "expected parameter 'router' to be non-null");
            return $;
        }
    }

}
