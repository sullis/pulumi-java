// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionNotificationEndpointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegionNotificationEndpointPlainArgs Empty = new GetRegionNotificationEndpointPlainArgs();

    @Import(name="notificationEndpoint", required=true)
    private String notificationEndpoint;

    public String notificationEndpoint() {
        return this.notificationEndpoint;
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

    private GetRegionNotificationEndpointPlainArgs() {}

    private GetRegionNotificationEndpointPlainArgs(GetRegionNotificationEndpointPlainArgs $) {
        this.notificationEndpoint = $.notificationEndpoint;
        this.project = $.project;
        this.region = $.region;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegionNotificationEndpointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegionNotificationEndpointPlainArgs $;

        public Builder() {
            $ = new GetRegionNotificationEndpointPlainArgs();
        }

        public Builder(GetRegionNotificationEndpointPlainArgs defaults) {
            $ = new GetRegionNotificationEndpointPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder notificationEndpoint(String notificationEndpoint) {
            $.notificationEndpoint = notificationEndpoint;
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

        public GetRegionNotificationEndpointPlainArgs build() {
            $.notificationEndpoint = Objects.requireNonNull($.notificationEndpoint, "expected parameter 'notificationEndpoint' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
