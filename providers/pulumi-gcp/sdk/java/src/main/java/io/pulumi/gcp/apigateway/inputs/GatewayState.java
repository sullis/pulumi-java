// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GatewayState extends io.pulumi.resources.ResourceArgs {

    public static final GatewayState Empty = new GatewayState();

    /**
     * Resource name of the API Config for this Gateway. Format: projects/{project}/locations/global/apis/{api}/configs/{apiConfig}.
     * When changing api configs please ensure the new config is a new resource and the lifecycle rule `create_before_destroy` is set.
     * 
     */
    @InputImport(name="apiConfig")
      private final @Nullable Input<String> apiConfig;

    public Input<String> getApiConfig() {
        return this.apiConfig == null ? Input.empty() : this.apiConfig;
    }

    /**
     * The default API Gateway host name of the form {gatewayId}-{hash}.{region_code}.gateway.dev.
     * 
     */
    @InputImport(name="defaultHostname")
      private final @Nullable Input<String> defaultHostname;

    public Input<String> getDefaultHostname() {
        return this.defaultHostname == null ? Input.empty() : this.defaultHostname;
    }

    /**
     * A user-visible name for the API.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    /**
     * Identifier to assign to the Gateway. Must be unique within scope of the parent resource(project).
     * 
     */
    @InputImport(name="gatewayId")
      private final @Nullable Input<String> gatewayId;

    public Input<String> getGatewayId() {
        return this.gatewayId == null ? Input.empty() : this.gatewayId;
    }

    /**
     * Resource labels to represent user-provided metadata.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Resource name of the Gateway. Format: projects/{project}/locations/{region}/gateways/{gateway}
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region of the gateway for the API.
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public GatewayState(
        @Nullable Input<String> apiConfig,
        @Nullable Input<String> defaultHostname,
        @Nullable Input<String> displayName,
        @Nullable Input<String> gatewayId,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
        this.apiConfig = apiConfig;
        this.defaultHostname = defaultHostname;
        this.displayName = displayName;
        this.gatewayId = gatewayId;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.region = region;
    }

    private GatewayState() {
        this.apiConfig = Input.empty();
        this.defaultHostname = Input.empty();
        this.displayName = Input.empty();
        this.gatewayId = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GatewayState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> apiConfig;
        private @Nullable Input<String> defaultHostname;
        private @Nullable Input<String> displayName;
        private @Nullable Input<String> gatewayId;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(GatewayState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiConfig = defaults.apiConfig;
    	      this.defaultHostname = defaults.defaultHostname;
    	      this.displayName = defaults.displayName;
    	      this.gatewayId = defaults.gatewayId;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setApiConfig(@Nullable Input<String> apiConfig) {
            this.apiConfig = apiConfig;
            return this;
        }

        public Builder setApiConfig(@Nullable String apiConfig) {
            this.apiConfig = Input.ofNullable(apiConfig);
            return this;
        }

        public Builder setDefaultHostname(@Nullable Input<String> defaultHostname) {
            this.defaultHostname = defaultHostname;
            return this;
        }

        public Builder setDefaultHostname(@Nullable String defaultHostname) {
            this.defaultHostname = Input.ofNullable(defaultHostname);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setGatewayId(@Nullable Input<String> gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }

        public Builder setGatewayId(@Nullable String gatewayId) {
            this.gatewayId = Input.ofNullable(gatewayId);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }
        public GatewayState build() {
            return new GatewayState(apiConfig, defaultHostname, displayName, gatewayId, labels, name, project, region);
        }
    }
}