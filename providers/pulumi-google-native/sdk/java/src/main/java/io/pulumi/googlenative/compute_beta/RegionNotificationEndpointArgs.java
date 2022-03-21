// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.inputs.NotificationEndpointGrpcSettingsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionNotificationEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionNotificationEndpointArgs Empty = new RegionNotificationEndpointArgs();

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Settings of the gRPC notification endpoint including the endpoint URL and the retry duration.
     * 
     */
    @Import(name="grpcSettings")
      private final @Nullable Output<NotificationEndpointGrpcSettingsArgs> grpcSettings;

    public Output<NotificationEndpointGrpcSettingsArgs> getGrpcSettings() {
        return this.grpcSettings == null ? Output.empty() : this.grpcSettings;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    public RegionNotificationEndpointArgs(
        @Nullable Output<String> description,
        @Nullable Output<NotificationEndpointGrpcSettingsArgs> grpcSettings,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId) {
        this.description = description;
        this.grpcSettings = grpcSettings;
        this.name = name;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
    }

    private RegionNotificationEndpointArgs() {
        this.description = Output.empty();
        this.grpcSettings = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.requestId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionNotificationEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<NotificationEndpointGrpcSettingsArgs> grpcSettings;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionNotificationEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.grpcSettings = defaults.grpcSettings;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder grpcSettings(@Nullable Output<NotificationEndpointGrpcSettingsArgs> grpcSettings) {
            this.grpcSettings = grpcSettings;
            return this;
        }
        public Builder grpcSettings(@Nullable NotificationEndpointGrpcSettingsArgs grpcSettings) {
            this.grpcSettings = Output.ofNullable(grpcSettings);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }        public RegionNotificationEndpointArgs build() {
            return new RegionNotificationEndpointArgs(description, grpcSettings, name, project, region, requestId);
        }
    }
}
