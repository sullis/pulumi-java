// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Specifies policy and settings for SSH access.
 * 
 */
public final class ComputeInstanceSshSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final ComputeInstanceSshSettingsResponse Empty = new ComputeInstanceSshSettingsResponse();

    /**
     * Specifies the SSH rsa public key file as a string. Use "ssh-keygen -t rsa -b 2048" to generate your SSH key pairs.
     * 
     */
    @InputImport(name="adminPublicKey")
    private final @Nullable String adminPublicKey;

    public Optional<String> getAdminPublicKey() {
        return this.adminPublicKey == null ? Optional.empty() : Optional.ofNullable(this.adminPublicKey);
    }

    /**
     * Describes the admin user name.
     * 
     */
    @InputImport(name="adminUserName", required=true)
    private final String adminUserName;

    public String getAdminUserName() {
        return this.adminUserName;
    }

    /**
     * Describes the port for connecting through SSH.
     * 
     */
    @InputImport(name="sshPort", required=true)
    private final Integer sshPort;

    public Integer getSshPort() {
        return this.sshPort;
    }

    /**
     * State of the public SSH port. Possible values are: Disabled - Indicates that the public ssh port is closed on this instance. Enabled - Indicates that the public ssh port is open and accessible according to the VNet/subnet policy if applicable.
     * 
     */
    @InputImport(name="sshPublicAccess")
    private final @Nullable String sshPublicAccess;

    public Optional<String> getSshPublicAccess() {
        return this.sshPublicAccess == null ? Optional.empty() : Optional.ofNullable(this.sshPublicAccess);
    }

    public ComputeInstanceSshSettingsResponse(
        @Nullable String adminPublicKey,
        String adminUserName,
        Integer sshPort,
        @Nullable String sshPublicAccess) {
        this.adminPublicKey = adminPublicKey;
        this.adminUserName = Objects.requireNonNull(adminUserName, "expected parameter 'adminUserName' to be non-null");
        this.sshPort = Objects.requireNonNull(sshPort, "expected parameter 'sshPort' to be non-null");
        this.sshPublicAccess = sshPublicAccess == null ? "Disabled" : sshPublicAccess;
    }

    private ComputeInstanceSshSettingsResponse() {
        this.adminPublicKey = null;
        this.adminUserName = null;
        this.sshPort = null;
        this.sshPublicAccess = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceSshSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String adminPublicKey;
        private String adminUserName;
        private Integer sshPort;
        private @Nullable String sshPublicAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceSshSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminPublicKey = defaults.adminPublicKey;
    	      this.adminUserName = defaults.adminUserName;
    	      this.sshPort = defaults.sshPort;
    	      this.sshPublicAccess = defaults.sshPublicAccess;
        }

        public Builder setAdminPublicKey(@Nullable String adminPublicKey) {
            this.adminPublicKey = adminPublicKey;
            return this;
        }

        public Builder setAdminUserName(String adminUserName) {
            this.adminUserName = Objects.requireNonNull(adminUserName);
            return this;
        }

        public Builder setSshPort(Integer sshPort) {
            this.sshPort = Objects.requireNonNull(sshPort);
            return this;
        }

        public Builder setSshPublicAccess(@Nullable String sshPublicAccess) {
            this.sshPublicAccess = sshPublicAccess;
            return this;
        }

        public ComputeInstanceSshSettingsResponse build() {
            return new ComputeInstanceSshSettingsResponse(adminPublicKey, adminUserName, sshPort, sshPublicAccess);
        }
    }
}
