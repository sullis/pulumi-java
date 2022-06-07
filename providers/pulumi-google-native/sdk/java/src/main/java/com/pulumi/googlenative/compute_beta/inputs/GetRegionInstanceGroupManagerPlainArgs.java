// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionInstanceGroupManagerPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionInstanceGroupManagerPlainArgs Empty = new GetRegionInstanceGroupManagerPlainArgs();

    @Import(name="instanceGroupManager", required=true)
    private String instanceGroupManager;

    public String instanceGroupManager() {
        return this.instanceGroupManager;
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

    private GetRegionInstanceGroupManagerPlainArgs() {}

    private GetRegionInstanceGroupManagerPlainArgs(GetRegionInstanceGroupManagerPlainArgs $) {
        this.instanceGroupManager = $.instanceGroupManager;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionInstanceGroupManagerPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionInstanceGroupManagerPlainArgs $;

        public Builder() {
            $ = new GetRegionInstanceGroupManagerPlainArgs();
        }

        public Builder(GetRegionInstanceGroupManagerPlainArgs defaults) {
            $ = new GetRegionInstanceGroupManagerPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceGroupManager(String instanceGroupManager) {
            $.instanceGroupManager = instanceGroupManager;
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

        public GetRegionInstanceGroupManagerPlainArgs build() {
            $.instanceGroupManager = Objects.requireNonNull($.instanceGroupManager, "expected parameter 'instanceGroupManager' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
