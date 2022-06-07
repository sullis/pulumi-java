// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebasehosting_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSitePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSitePlainArgs Empty = new GetSitePlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="siteId", required=true)
    private String siteId;

    public String siteId() {
        return this.siteId;
    }

    private GetSitePlainArgs() {}

    private GetSitePlainArgs(GetSitePlainArgs $) {
        this.project = $.project;
        this.siteId = $.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSitePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSitePlainArgs $;

        public Builder() {
            $ = new GetSitePlainArgs();
        }

        public Builder(GetSitePlainArgs defaults) {
            $ = new GetSitePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder siteId(String siteId) {
            $.siteId = siteId;
            return this;
        }

        public GetSitePlainArgs build() {
            $.siteId = Objects.requireNonNull($.siteId, "expected parameter 'siteId' to be non-null");
            return $;
        }
    }

}
