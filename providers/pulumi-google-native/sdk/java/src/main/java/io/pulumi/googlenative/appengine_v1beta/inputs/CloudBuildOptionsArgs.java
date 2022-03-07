// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options for the build operations performed as a part of the version deployment. Only applicable for App Engine flexible environment when creating a version using source code directly.
 * 
 */
public final class CloudBuildOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final CloudBuildOptionsArgs Empty = new CloudBuildOptionsArgs();

    /**
     * Path to the yaml file used in deployment, used to determine runtime configuration details.Required for flexible environment builds.See https://cloud.google.com/appengine/docs/standard/python/config/appref for more details.
     * 
     */
    @InputImport(name="appYamlPath")
      private final @Nullable Input<String> appYamlPath;

    public Input<String> getAppYamlPath() {
        return this.appYamlPath == null ? Input.empty() : this.appYamlPath;
    }

    /**
     * The Cloud Build timeout used as part of any dependent builds performed by version creation. Defaults to 10 minutes.
     * 
     */
    @InputImport(name="cloudBuildTimeout")
      private final @Nullable Input<String> cloudBuildTimeout;

    public Input<String> getCloudBuildTimeout() {
        return this.cloudBuildTimeout == null ? Input.empty() : this.cloudBuildTimeout;
    }

    public CloudBuildOptionsArgs(
        @Nullable Input<String> appYamlPath,
        @Nullable Input<String> cloudBuildTimeout) {
        this.appYamlPath = appYamlPath;
        this.cloudBuildTimeout = cloudBuildTimeout;
    }

    private CloudBuildOptionsArgs() {
        this.appYamlPath = Input.empty();
        this.cloudBuildTimeout = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudBuildOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> appYamlPath;
        private @Nullable Input<String> cloudBuildTimeout;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudBuildOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appYamlPath = defaults.appYamlPath;
    	      this.cloudBuildTimeout = defaults.cloudBuildTimeout;
        }

        public Builder setAppYamlPath(@Nullable Input<String> appYamlPath) {
            this.appYamlPath = appYamlPath;
            return this;
        }

        public Builder setAppYamlPath(@Nullable String appYamlPath) {
            this.appYamlPath = Input.ofNullable(appYamlPath);
            return this;
        }

        public Builder setCloudBuildTimeout(@Nullable Input<String> cloudBuildTimeout) {
            this.cloudBuildTimeout = cloudBuildTimeout;
            return this;
        }

        public Builder setCloudBuildTimeout(@Nullable String cloudBuildTimeout) {
            this.cloudBuildTimeout = Input.ofNullable(cloudBuildTimeout);
            return this;
        }
        public CloudBuildOptionsArgs build() {
            return new CloudBuildOptionsArgs(appYamlPath, cloudBuildTimeout);
        }
    }
}