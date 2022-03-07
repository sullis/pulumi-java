// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GitHubActionContainerConfigurationResponse {
    /**
     * The image name for the build.
     * 
     */
    private final @Nullable String imageName;
    /**
     * The password used to upload the image to the container registry.
     * 
     */
    private final @Nullable String password;
    /**
     * The server URL for the container registry where the build will be hosted.
     * 
     */
    private final @Nullable String serverUrl;
    /**
     * The username used to upload the image to the container registry.
     * 
     */
    private final @Nullable String username;

    @OutputCustomType.Constructor({"imageName","password","serverUrl","username"})
    private GitHubActionContainerConfigurationResponse(
        @Nullable String imageName,
        @Nullable String password,
        @Nullable String serverUrl,
        @Nullable String username) {
        this.imageName = imageName;
        this.password = password;
        this.serverUrl = serverUrl;
        this.username = username;
    }

    /**
     * The image name for the build.
     * 
    */
    public Optional<String> getImageName() {
        return Optional.ofNullable(this.imageName);
    }
    /**
     * The password used to upload the image to the container registry.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * The server URL for the container registry where the build will be hosted.
     * 
    */
    public Optional<String> getServerUrl() {
        return Optional.ofNullable(this.serverUrl);
    }
    /**
     * The username used to upload the image to the container registry.
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GitHubActionContainerConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String imageName;
        private @Nullable String password;
        private @Nullable String serverUrl;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(GitHubActionContainerConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageName = defaults.imageName;
    	      this.password = defaults.password;
    	      this.serverUrl = defaults.serverUrl;
    	      this.username = defaults.username;
        }

        public Builder setImageName(@Nullable String imageName) {
            this.imageName = imageName;
            return this;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setServerUrl(@Nullable String serverUrl) {
            this.serverUrl = serverUrl;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }
        public GitHubActionContainerConfigurationResponse build() {
            return new GitHubActionContainerConfigurationResponse(imageName, password, serverUrl, username);
        }
    }
}