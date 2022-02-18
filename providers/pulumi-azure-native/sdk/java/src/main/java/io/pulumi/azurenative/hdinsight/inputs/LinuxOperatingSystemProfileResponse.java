// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.inputs;

import io.pulumi.azurenative.hdinsight.inputs.SshProfileResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The ssh username, password, and ssh public key.
 * 
 */
public final class LinuxOperatingSystemProfileResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinuxOperatingSystemProfileResponse Empty = new LinuxOperatingSystemProfileResponse();

    /**
     * The password.
     * 
     */
    @InputImport(name="password")
    private final @Nullable String password;

    public Optional<String> getPassword() {
        return this.password == null ? Optional.empty() : Optional.ofNullable(this.password);
    }

    /**
     * The SSH profile.
     * 
     */
    @InputImport(name="sshProfile")
    private final @Nullable SshProfileResponse sshProfile;

    public Optional<SshProfileResponse> getSshProfile() {
        return this.sshProfile == null ? Optional.empty() : Optional.ofNullable(this.sshProfile);
    }

    /**
     * The username.
     * 
     */
    @InputImport(name="username")
    private final @Nullable String username;

    public Optional<String> getUsername() {
        return this.username == null ? Optional.empty() : Optional.ofNullable(this.username);
    }

    public LinuxOperatingSystemProfileResponse(
        @Nullable String password,
        @Nullable SshProfileResponse sshProfile,
        @Nullable String username) {
        this.password = password;
        this.sshProfile = sshProfile;
        this.username = username;
    }

    private LinuxOperatingSystemProfileResponse() {
        this.password = null;
        this.sshProfile = null;
        this.username = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxOperatingSystemProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String password;
        private @Nullable SshProfileResponse sshProfile;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxOperatingSystemProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
    	      this.sshProfile = defaults.sshProfile;
    	      this.username = defaults.username;
        }

        public Builder setPassword(@Nullable String password) {
            this.password = password;
            return this;
        }

        public Builder setSshProfile(@Nullable SshProfileResponse sshProfile) {
            this.sshProfile = sshProfile;
            return this;
        }

        public Builder setUsername(@Nullable String username) {
            this.username = username;
            return this;
        }

        public LinuxOperatingSystemProfileResponse build() {
            return new LinuxOperatingSystemProfileResponse(password, sshProfile, username);
        }
    }
}
