// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetUrlMapPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetUrlMapPlainArgs Empty = new GetUrlMapPlainArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="urlMap", required=true)
    private String urlMap;

    public String urlMap() {
        return this.urlMap;
    }

    private GetUrlMapPlainArgs() {}

    private GetUrlMapPlainArgs(GetUrlMapPlainArgs $) {
        this.project = $.project;
        this.urlMap = $.urlMap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetUrlMapPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetUrlMapPlainArgs $;

        public Builder() {
            $ = new GetUrlMapPlainArgs();
        }

        public Builder(GetUrlMapPlainArgs defaults) {
            $ = new GetUrlMapPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder urlMap(String urlMap) {
            $.urlMap = urlMap;
            return this;
        }

        public GetUrlMapPlainArgs build() {
            $.urlMap = Objects.requireNonNull($.urlMap, "expected parameter 'urlMap' to be non-null");
            return $;
        }
    }

}
