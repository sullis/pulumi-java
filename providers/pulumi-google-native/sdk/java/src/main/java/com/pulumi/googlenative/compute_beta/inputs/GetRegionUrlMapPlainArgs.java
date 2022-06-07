// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionUrlMapPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionUrlMapPlainArgs Empty = new GetRegionUrlMapPlainArgs();

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

    @Import(name="urlMap", required=true)
    private String urlMap;

    public String urlMap() {
        return this.urlMap;
    }

    private GetRegionUrlMapPlainArgs() {}

    private GetRegionUrlMapPlainArgs(GetRegionUrlMapPlainArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.urlMap = $.urlMap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionUrlMapPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionUrlMapPlainArgs $;

        public Builder() {
            $ = new GetRegionUrlMapPlainArgs();
        }

        public Builder(GetRegionUrlMapPlainArgs defaults) {
            $ = new GetRegionUrlMapPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public Builder urlMap(String urlMap) {
            $.urlMap = urlMap;
            return this;
        }

        public GetRegionUrlMapPlainArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.urlMap = Objects.requireNonNull($.urlMap, "expected parameter 'urlMap' to be non-null");
            return $;
        }
    }

}
